package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwanalisiscostesquimicossgetfilterdata extends GXProcedure
{
   public wcwanalisiscostesquimicossgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwanalisiscostesquimicossgetfilterdata.class ), "" );
   }

   public wcwanalisiscostesquimicossgetfilterdata( int remoteHandle ,
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
      wcwanalisiscostesquimicossgetfilterdata.this.aP5 = new String[] {""};
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
      wcwanalisiscostesquimicossgetfilterdata.this.AV22DDOName = aP0;
      wcwanalisiscostesquimicossgetfilterdata.this.AV20SearchTxt = aP1;
      wcwanalisiscostesquimicossgetfilterdata.this.AV21SearchTxtTo = aP2;
      wcwanalisiscostesquimicossgetfilterdata.this.aP3 = aP3;
      wcwanalisiscostesquimicossgetfilterdata.this.aP4 = aP4;
      wcwanalisiscostesquimicossgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HREMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADHREMAQCODOPTIONS' */
         S121 ();
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
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HREBARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADHREBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HREBARDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREBARDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HRETIPARTD") == 0 )
      {
         /* Execute user subroutine: 'LOADHRETIPARTDOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HRECOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADHRECOLNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HRETIPCOLN") == 0 )
      {
         /* Execute user subroutine: 'LOADHRETIPCOLNOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HREINTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREINTDSCOPTIONS' */
         S191 ();
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
      if ( GXutil.strcmp(AV33Session.getValue("WCWAnalisisCostesQuimicossGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWAnalisisCostesQuimicossGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WCWAnalisisCostesQuimicossGridState"), null, null);
      }
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV82FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFECTIN") == 0 )
         {
            AV10TFHreFecTin = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARKGM") == 0 )
         {
            AV12TFHreBarKgm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV13TFHreBarKgm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETOTKGM") == 0 )
         {
            AV14TFHreTotKgm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFHreTotKgm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV16TFHreMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV17TFHreMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV18TFHreVolPrd = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFHreVolPrd_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER") == 0 )
         {
            AV42TFHreBarSer = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARSER_SEL") == 0 )
         {
            AV43TFHreBarSer_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC") == 0 )
         {
            AV44TFHreBarDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARDSC_SEL") == 0 )
         {
            AV45TFHreBarDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD") == 0 )
         {
            AV46TFHreTipArtD = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPARTD_SEL") == 0 )
         {
            AV47TFHreTipArtD_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM") == 0 )
         {
            AV48TFHreColNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNOM_SEL") == 0 )
         {
            AV49TFHreColNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECOLNUM") == 0 )
         {
            AV50TFHreColNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFHreColNum_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN") == 0 )
         {
            AV52TFHreTipColN = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRETIPCOLN_SEL") == 0 )
         {
            AV53TFHreTipColN_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC") == 0 )
         {
            AV54TFHreIntDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREINTDSC_SEL") == 0 )
         {
            AV55TFHreIntDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTI") == 0 )
         {
            AV78TFHreDti = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREDTF") == 0 )
         {
            AV80TFHreDtf = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV56Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV57HreRacab = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV61Fec1 = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV62Fec2 = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CALCULO") == 0 )
         {
            AV63Calculo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV58barcod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV59barcodreo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV60barcodpar = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD1") == 0 )
         {
            AV64ARtcod1 = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD3") == 0 )
         {
            AV65ARtcod3 = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM1") == 0 )
         {
            AV66Barcolnom1 = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM3") == 0 )
         {
            AV67Barcolnom3 = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM1") == 0 )
         {
            AV68Barcolnum1 = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM3") == 0 )
         {
            AV69Barcolnum3 = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD1") == 0 )
         {
            AV70Clicod1 = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD3") == 0 )
         {
            AV71Clicod3 = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD1") == 0 )
         {
            AV72Intcod1 = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INTCOD3") == 0 )
         {
            AV73Intcod3 = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD1") == 0 )
         {
            AV74TipArtCod1 = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCOD3") == 0 )
         {
            AV75TipArtCod3 = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD1") == 0 )
         {
            AV76Tipcolcod1 = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD3") == 0 )
         {
            AV77Tipcolcod3 = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFHreMaqCod = AV20SearchTxt ;
      AV17TFHreMaqCod_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L32 */
      pr_default.execute(0, new Object[] {AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8L32 = false ;
         A396EmprCod = P08L32_A396EmprCod[0] ;
         A4494HreBarPar = P08L32_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L32_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L32_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L32_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L32_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L32_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L32_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L32_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L32_n4519HreTipArt[0] ;
         A9808HreRacab = P08L32_A9808HreRacab[0] ;
         n9808HreRacab = P08L32_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L32_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L32_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L32_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L32_n4526HreTipColN[0] ;
         A4522HreColNum = P08L32_A4522HreColNum[0] ;
         n4522HreColNum = P08L32_n4522HreColNum[0] ;
         A4521HreColNom = P08L32_A4521HreColNom[0] ;
         n4521HreColNom = P08L32_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L32_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L32_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L32_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L32_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L32_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L32_n4517HreBarSer[0] ;
         A279CliNom = P08L32_A279CliNom[0] ;
         A252CliCod = P08L32_A252CliCod[0] ;
         n252CliCod = P08L32_n252CliCod[0] ;
         A4542HreTotKgm = P08L32_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L32_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L32_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L32_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L32_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L32_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L32_A4495HreNumCie[0] ;
         A279CliNom = P08L32_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(0) != 101) )
            {
               brk8L32 = false ;
               A396EmprCod = P08L32_A396EmprCod[0] ;
               A4494HreBarPar = P08L32_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L32_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L32_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L32_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L32 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A4546HreMaqCod)==0) )
            {
               AV24Option = A4546HreMaqCod ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L32 )
         {
            brk8L32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV40TFCliNom = AV20SearchTxt ;
      AV41TFCliNom_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L33 */
      pr_default.execute(1, new Object[] {AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8L34 = false ;
         A396EmprCod = P08L33_A396EmprCod[0] ;
         A279CliNom = P08L33_A279CliNom[0] ;
         A4494HreBarPar = P08L33_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L33_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L33_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L33_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L33_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L33_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L33_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L33_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L33_n4519HreTipArt[0] ;
         A9808HreRacab = P08L33_A9808HreRacab[0] ;
         n9808HreRacab = P08L33_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L33_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L33_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L33_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L33_n4526HreTipColN[0] ;
         A4522HreColNum = P08L33_A4522HreColNum[0] ;
         n4522HreColNum = P08L33_n4522HreColNum[0] ;
         A4521HreColNom = P08L33_A4521HreColNom[0] ;
         n4521HreColNom = P08L33_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L33_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L33_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L33_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L33_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L33_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L33_n4517HreBarSer[0] ;
         A252CliCod = P08L33_A252CliCod[0] ;
         n252CliCod = P08L33_n252CliCod[0] ;
         A4542HreTotKgm = P08L33_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L33_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L33_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L33_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L33_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L33_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L33_A4495HreNumCie[0] ;
         A279CliNom = P08L33_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08L33_A279CliNom[0], A279CliNom) == 0 ) )
            {
               brk8L34 = false ;
               A396EmprCod = P08L33_A396EmprCod[0] ;
               A4494HreBarPar = P08L33_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L33_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L33_A4492HreBarCod[0] ;
               A252CliCod = P08L33_A252CliCod[0] ;
               n252CliCod = P08L33_n252CliCod[0] ;
               A4495HreNumCie = P08L33_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L34 = true ;
               pr_default.readNext(1);
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
         if ( ! brk8L34 )
         {
            brk8L34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHREBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV42TFHreBarSer = AV20SearchTxt ;
      AV43TFHreBarSer_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L34 */
      pr_default.execute(2, new Object[] {AV64ARtcod1, AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV65ARtcod3, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8L36 = false ;
         A396EmprCod = P08L34_A396EmprCod[0] ;
         A4517HreBarSer = P08L34_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L34_n4517HreBarSer[0] ;
         A4494HreBarPar = P08L34_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L34_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L34_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L34_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L34_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L34_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L34_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L34_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L34_n4519HreTipArt[0] ;
         A9808HreRacab = P08L34_A9808HreRacab[0] ;
         n9808HreRacab = P08L34_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L34_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L34_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L34_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L34_n4526HreTipColN[0] ;
         A4522HreColNum = P08L34_A4522HreColNum[0] ;
         n4522HreColNum = P08L34_n4522HreColNum[0] ;
         A4521HreColNom = P08L34_A4521HreColNom[0] ;
         n4521HreColNom = P08L34_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L34_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L34_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L34_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L34_n4518HreBarDsc[0] ;
         A279CliNom = P08L34_A279CliNom[0] ;
         A252CliCod = P08L34_A252CliCod[0] ;
         n252CliCod = P08L34_n252CliCod[0] ;
         A4542HreTotKgm = P08L34_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L34_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L34_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L34_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L34_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L34_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L34_A4495HreNumCie[0] ;
         A279CliNom = P08L34_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08L34_A4517HreBarSer[0], A4517HreBarSer) == 0 ) )
            {
               brk8L36 = false ;
               A396EmprCod = P08L34_A396EmprCod[0] ;
               A4494HreBarPar = P08L34_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L34_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L34_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L34_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L36 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A4517HreBarSer)==0) )
            {
               AV24Option = A4517HreBarSer ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L36 )
         {
            brk8L36 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHREBARDSCOPTIONS' Routine */
      returnInSub = false ;
      AV44TFHreBarDsc = AV20SearchTxt ;
      AV45TFHreBarDsc_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L35 */
      pr_default.execute(3, new Object[] {AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8L38 = false ;
         A396EmprCod = P08L35_A396EmprCod[0] ;
         A4518HreBarDsc = P08L35_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L35_n4518HreBarDsc[0] ;
         A4494HreBarPar = P08L35_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L35_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L35_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L35_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L35_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L35_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L35_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L35_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L35_n4519HreTipArt[0] ;
         A9808HreRacab = P08L35_A9808HreRacab[0] ;
         n9808HreRacab = P08L35_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L35_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L35_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L35_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L35_n4526HreTipColN[0] ;
         A4522HreColNum = P08L35_A4522HreColNum[0] ;
         n4522HreColNum = P08L35_n4522HreColNum[0] ;
         A4521HreColNom = P08L35_A4521HreColNom[0] ;
         n4521HreColNom = P08L35_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L35_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L35_n4520HreTipArtD[0] ;
         A4517HreBarSer = P08L35_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L35_n4517HreBarSer[0] ;
         A279CliNom = P08L35_A279CliNom[0] ;
         A252CliCod = P08L35_A252CliCod[0] ;
         n252CliCod = P08L35_n252CliCod[0] ;
         A4542HreTotKgm = P08L35_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L35_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L35_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L35_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L35_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L35_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L35_A4495HreNumCie[0] ;
         A279CliNom = P08L35_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08L35_A4518HreBarDsc[0], A4518HreBarDsc) == 0 ) )
            {
               brk8L38 = false ;
               A396EmprCod = P08L35_A396EmprCod[0] ;
               A4494HreBarPar = P08L35_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L35_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L35_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L35_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L38 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A4518HreBarDsc)==0) )
            {
               AV24Option = A4518HreBarDsc ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L38 )
         {
            brk8L38 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADHRETIPARTDOPTIONS' Routine */
      returnInSub = false ;
      AV46TFHreTipArtD = AV20SearchTxt ;
      AV47TFHreTipArtD_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L36 */
      pr_default.execute(4, new Object[] {AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8L310 = false ;
         A396EmprCod = P08L36_A396EmprCod[0] ;
         A4520HreTipArtD = P08L36_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L36_n4520HreTipArtD[0] ;
         A4494HreBarPar = P08L36_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L36_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L36_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L36_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L36_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L36_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L36_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L36_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L36_n4519HreTipArt[0] ;
         A9808HreRacab = P08L36_A9808HreRacab[0] ;
         n9808HreRacab = P08L36_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L36_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L36_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L36_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L36_n4526HreTipColN[0] ;
         A4522HreColNum = P08L36_A4522HreColNum[0] ;
         n4522HreColNum = P08L36_n4522HreColNum[0] ;
         A4521HreColNom = P08L36_A4521HreColNom[0] ;
         n4521HreColNom = P08L36_n4521HreColNom[0] ;
         A4518HreBarDsc = P08L36_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L36_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L36_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L36_n4517HreBarSer[0] ;
         A279CliNom = P08L36_A279CliNom[0] ;
         A252CliCod = P08L36_A252CliCod[0] ;
         n252CliCod = P08L36_n252CliCod[0] ;
         A4542HreTotKgm = P08L36_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L36_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L36_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L36_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L36_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L36_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L36_A4495HreNumCie[0] ;
         A279CliNom = P08L36_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08L36_A4520HreTipArtD[0], A4520HreTipArtD) == 0 ) )
            {
               brk8L310 = false ;
               A396EmprCod = P08L36_A396EmprCod[0] ;
               A4494HreBarPar = P08L36_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L36_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L36_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L36_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L310 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A4520HreTipArtD)==0) )
            {
               AV24Option = A4520HreTipArtD ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L310 )
         {
            brk8L310 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADHRECOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV48TFHreColNom = AV20SearchTxt ;
      AV49TFHreColNom_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L37 */
      pr_default.execute(5, new Object[] {AV66Barcolnom1, AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV67Barcolnom3, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8L312 = false ;
         A396EmprCod = P08L37_A396EmprCod[0] ;
         A4521HreColNom = P08L37_A4521HreColNom[0] ;
         n4521HreColNom = P08L37_n4521HreColNom[0] ;
         A4494HreBarPar = P08L37_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L37_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L37_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L37_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L37_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L37_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L37_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L37_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L37_n4519HreTipArt[0] ;
         A9808HreRacab = P08L37_A9808HreRacab[0] ;
         n9808HreRacab = P08L37_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L37_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L37_n4540HreIntDsc[0] ;
         A4526HreTipColN = P08L37_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L37_n4526HreTipColN[0] ;
         A4522HreColNum = P08L37_A4522HreColNum[0] ;
         n4522HreColNum = P08L37_n4522HreColNum[0] ;
         A4520HreTipArtD = P08L37_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L37_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L37_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L37_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L37_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L37_n4517HreBarSer[0] ;
         A279CliNom = P08L37_A279CliNom[0] ;
         A252CliCod = P08L37_A252CliCod[0] ;
         n252CliCod = P08L37_n252CliCod[0] ;
         A4542HreTotKgm = P08L37_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L37_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L37_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L37_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L37_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L37_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L37_A4495HreNumCie[0] ;
         A279CliNom = P08L37_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08L37_A4521HreColNom[0], A4521HreColNom) == 0 ) )
            {
               brk8L312 = false ;
               A396EmprCod = P08L37_A396EmprCod[0] ;
               A4494HreBarPar = P08L37_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L37_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L37_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L37_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L312 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A4521HreColNom)==0) )
            {
               AV24Option = A4521HreColNom ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L312 )
         {
            brk8L312 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADHRETIPCOLNOPTIONS' Routine */
      returnInSub = false ;
      AV52TFHreTipColN = AV20SearchTxt ;
      AV53TFHreTipColN_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L38 */
      pr_default.execute(6, new Object[] {AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8L314 = false ;
         A396EmprCod = P08L38_A396EmprCod[0] ;
         A4526HreTipColN = P08L38_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L38_n4526HreTipColN[0] ;
         A4494HreBarPar = P08L38_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L38_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L38_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L38_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L38_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L38_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L38_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L38_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L38_n4519HreTipArt[0] ;
         A9808HreRacab = P08L38_A9808HreRacab[0] ;
         n9808HreRacab = P08L38_n9808HreRacab[0] ;
         A4540HreIntDsc = P08L38_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L38_n4540HreIntDsc[0] ;
         A4522HreColNum = P08L38_A4522HreColNum[0] ;
         n4522HreColNum = P08L38_n4522HreColNum[0] ;
         A4521HreColNom = P08L38_A4521HreColNom[0] ;
         n4521HreColNom = P08L38_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L38_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L38_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L38_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L38_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L38_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L38_n4517HreBarSer[0] ;
         A279CliNom = P08L38_A279CliNom[0] ;
         A252CliCod = P08L38_A252CliCod[0] ;
         n252CliCod = P08L38_n252CliCod[0] ;
         A4542HreTotKgm = P08L38_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L38_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L38_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L38_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L38_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L38_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L38_A4495HreNumCie[0] ;
         A279CliNom = P08L38_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08L38_A4526HreTipColN[0], A4526HreTipColN) == 0 ) )
            {
               brk8L314 = false ;
               A396EmprCod = P08L38_A396EmprCod[0] ;
               A4494HreBarPar = P08L38_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L38_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L38_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L38_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L314 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A4526HreTipColN)==0) )
            {
               AV24Option = A4526HreTipColN ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L314 )
         {
            brk8L314 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADHREINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV54TFHreIntDsc = AV20SearchTxt ;
      AV55TFHreIntDsc_Sel = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = AV82FilterFullText ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = AV10TFHreFecTin ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = AV12TFHreBarKgm ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = AV13TFHreBarKgm_To ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = AV14TFHreTotKgm ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = AV15TFHreTotKgm_To ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = AV16TFHreMaqCod ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = AV17TFHreMaqCod_Sel ;
      AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd = AV18TFHreVolPrd ;
      AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to = AV19TFHreVolPrd_To ;
      AV97Wcwanalisiscostesquimicossds_11_tfclicod = AV38TFCliCod ;
      AV98Wcwanalisiscostesquimicossds_12_tfclicod_to = AV39TFCliCod_To ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = AV40TFCliNom ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = AV41TFCliNom_Sel ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = AV42TFHreBarSer ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = AV43TFHreBarSer_Sel ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = AV44TFHreBarDsc ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = AV45TFHreBarDsc_Sel ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = AV46TFHreTipArtD ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = AV47TFHreTipArtD_Sel ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = AV48TFHreColNom ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = AV49TFHreColNom_Sel ;
      AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum = AV50TFHreColNum ;
      AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to = AV51TFHreColNum_To ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = AV52TFHreTipColN ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = AV53TFHreTipColN_Sel ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = AV54TFHreIntDsc ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = AV55TFHreIntDsc_Sel ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = AV78TFHreDti ;
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = AV80TFHreDtf ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                           AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                           AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                           AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                           AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                           AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                           AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                           AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                           Integer.valueOf(AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd) ,
                                           Integer.valueOf(AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to) ,
                                           Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod) ,
                                           Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) ,
                                           AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                           AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                           AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                           AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                           AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                           AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                           AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                           AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                           AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                           AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                           Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) ,
                                           Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) ,
                                           AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                           AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                           AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                           AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                           AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                           AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                           A4532HreBarKgm ,
                                           A4542HreTotKgm ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4517HreBarSer ,
                                           A4518HreBarDsc ,
                                           A4520HreTipArtD ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           A4526HreTipColN ,
                                           A4540HreIntDsc ,
                                           A4529HreFecTin ,
                                           AV61Fec1 ,
                                           AV62Fec2 ,
                                           A9808HreRacab ,
                                           AV57HreRacab ,
                                           Integer.valueOf(AV70Clicod1) ,
                                           Integer.valueOf(AV71Clicod3) ,
                                           AV64ARtcod1 ,
                                           AV65ARtcod3 ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           Short.valueOf(AV74TipArtCod1) ,
                                           Short.valueOf(AV75TipArtCod3) ,
                                           AV66Barcolnom1 ,
                                           AV67Barcolnom3 ,
                                           Integer.valueOf(AV68Barcolnum1) ,
                                           Integer.valueOf(AV69Barcolnum3) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(AV76Tipcolcod1) ,
                                           Byte.valueOf(AV77Tipcolcod3) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Byte.valueOf(AV72Intcod1) ,
                                           Byte.valueOf(AV73Intcod3) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV58barcod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV59barcodreo) ,
                                           A4494HreBarPar ,
                                           AV60barcodpar ,
                                           A396EmprCod ,
                                           AV56Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV99Wcwanalisiscostesquimicossds_13_tfclinom), 30, "%") ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = GXutil.padr( GXutil.rtrim( AV101Wcwanalisiscostesquimicossds_15_tfhrebarser), 16, "%") ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = GXutil.padr( GXutil.rtrim( AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc), 26, "%") ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = GXutil.padr( GXutil.rtrim( AV105Wcwanalisiscostesquimicossds_19_tfhretipartd), 30, "%") ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = GXutil.padr( GXutil.rtrim( AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom), 13, "%") ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = GXutil.padr( GXutil.rtrim( AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln), 26, "%") ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = GXutil.padr( GXutil.rtrim( AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc), 30, "%") ;
      /* Using cursor P08L39 */
      pr_default.execute(7, new Object[] {AV61Fec1, AV62Fec2, Integer.valueOf(AV70Clicod1), Integer.valueOf(AV71Clicod3), AV64ARtcod1, AV65ARtcod3, Short.valueOf(AV74TipArtCod1), Short.valueOf(AV75TipArtCod3), AV66Barcolnom1, AV67Barcolnom3, Integer.valueOf(AV68Barcolnum1), Integer.valueOf(AV69Barcolnum3), Byte.valueOf(AV76Tipcolcod1), Byte.valueOf(AV77Tipcolcod3), Byte.valueOf(AV72Intcod1), Byte.valueOf(AV73Intcod3), Integer.valueOf(AV58barcod), Integer.valueOf(AV58barcod), Byte.valueOf(AV59barcodreo), Byte.valueOf(AV59barcodreo), AV60barcodpar, AV60barcodpar, AV56Emprcod, AV88Wcwanalisiscostesquimicossds_2_tfhrefectin, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to, Integer.valueOf(AV97Wcwanalisiscostesquimicossds_11_tfclicod), Integer.valueOf(AV98Wcwanalisiscostesquimicossds_12_tfclicod_to), lV99Wcwanalisiscostesquimicossds_13_tfclinom, AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel, lV101Wcwanalisiscostesquimicossds_15_tfhrebarser, AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel, lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc, AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel, lV105Wcwanalisiscostesquimicossds_19_tfhretipartd, AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel, lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom, AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel, Integer.valueOf(AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum), Integer.valueOf(AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to), lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln, AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel, lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc, AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8L316 = false ;
         A396EmprCod = P08L39_A396EmprCod[0] ;
         A4540HreIntDsc = P08L39_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P08L39_n4540HreIntDsc[0] ;
         A4494HreBarPar = P08L39_A4494HreBarPar[0] ;
         A4493HreBarReo = P08L39_A4493HreBarReo[0] ;
         A4492HreBarCod = P08L39_A4492HreBarCod[0] ;
         A4539HreIntCod = P08L39_A4539HreIntCod[0] ;
         n4539HreIntCod = P08L39_n4539HreIntCod[0] ;
         A4525HreTipCol = P08L39_A4525HreTipCol[0] ;
         n4525HreTipCol = P08L39_n4525HreTipCol[0] ;
         A4519HreTipArt = P08L39_A4519HreTipArt[0] ;
         n4519HreTipArt = P08L39_n4519HreTipArt[0] ;
         A9808HreRacab = P08L39_A9808HreRacab[0] ;
         n9808HreRacab = P08L39_n9808HreRacab[0] ;
         A4526HreTipColN = P08L39_A4526HreTipColN[0] ;
         n4526HreTipColN = P08L39_n4526HreTipColN[0] ;
         A4522HreColNum = P08L39_A4522HreColNum[0] ;
         n4522HreColNum = P08L39_n4522HreColNum[0] ;
         A4521HreColNom = P08L39_A4521HreColNom[0] ;
         n4521HreColNom = P08L39_n4521HreColNom[0] ;
         A4520HreTipArtD = P08L39_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P08L39_n4520HreTipArtD[0] ;
         A4518HreBarDsc = P08L39_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P08L39_n4518HreBarDsc[0] ;
         A4517HreBarSer = P08L39_A4517HreBarSer[0] ;
         n4517HreBarSer = P08L39_n4517HreBarSer[0] ;
         A279CliNom = P08L39_A279CliNom[0] ;
         A252CliCod = P08L39_A252CliCod[0] ;
         n252CliCod = P08L39_n252CliCod[0] ;
         A4542HreTotKgm = P08L39_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P08L39_n4542HreTotKgm[0] ;
         A4532HreBarKgm = P08L39_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P08L39_n4532HreBarKgm[0] ;
         A4529HreFecTin = P08L39_A4529HreFecTin[0] ;
         n4529HreFecTin = P08L39_n4529HreFecTin[0] ;
         A4495HreNumCie = P08L39_A4495HreNumCie[0] ;
         A279CliNom = P08L39_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A9808HreRacab, AV57HreRacab) == 0 ) || ( GXutil.strcmp(AV57HreRacab, httpContext.getMessage( "T", "")) == 0 ) )
         {
            AV32count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08L39_A4540HreIntDsc[0], A4540HreIntDsc) == 0 ) )
            {
               brk8L316 = false ;
               A396EmprCod = P08L39_A396EmprCod[0] ;
               A4494HreBarPar = P08L39_A4494HreBarPar[0] ;
               A4493HreBarReo = P08L39_A4493HreBarReo[0] ;
               A4492HreBarCod = P08L39_A4492HreBarCod[0] ;
               A4495HreNumCie = P08L39_A4495HreNumCie[0] ;
               AV32count = (long)(AV32count+1) ;
               brk8L316 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A4540HreIntDsc)==0) )
            {
               AV24Option = A4540HreIntDsc ;
               AV25Options.add(AV24Option, 0);
               AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV25Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8L316 )
         {
            brk8L316 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwanalisiscostesquimicossgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wcwanalisiscostesquimicossgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wcwanalisiscostesquimicossgetfilterdata.this.AV31OptionIndexesJson;
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
      AV82FilterFullText = "" ;
      AV10TFHreFecTin = GXutil.nullDate() ;
      AV12TFHreBarKgm = DecimalUtil.ZERO ;
      AV13TFHreBarKgm_To = DecimalUtil.ZERO ;
      AV14TFHreTotKgm = DecimalUtil.ZERO ;
      AV15TFHreTotKgm_To = DecimalUtil.ZERO ;
      AV16TFHreMaqCod = "" ;
      AV17TFHreMaqCod_Sel = "" ;
      AV40TFCliNom = "" ;
      AV41TFCliNom_Sel = "" ;
      AV42TFHreBarSer = "" ;
      AV43TFHreBarSer_Sel = "" ;
      AV44TFHreBarDsc = "" ;
      AV45TFHreBarDsc_Sel = "" ;
      AV46TFHreTipArtD = "" ;
      AV47TFHreTipArtD_Sel = "" ;
      AV48TFHreColNom = "" ;
      AV49TFHreColNom_Sel = "" ;
      AV52TFHreTipColN = "" ;
      AV53TFHreTipColN_Sel = "" ;
      AV54TFHreIntDsc = "" ;
      AV55TFHreIntDsc_Sel = "" ;
      AV78TFHreDti = GXutil.resetTime( GXutil.nullDate() );
      AV80TFHreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV56Emprcod = "" ;
      AV57HreRacab = "" ;
      AV61Fec1 = GXutil.nullDate() ;
      AV62Fec2 = GXutil.nullDate() ;
      AV60barcodpar = "" ;
      AV64ARtcod1 = "" ;
      AV65ARtcod3 = "" ;
      AV66Barcolnom1 = "" ;
      AV67Barcolnom3 = "" ;
      A4546HreMaqCod = "" ;
      AV87Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      AV88Wcwanalisiscostesquimicossds_2_tfhrefectin = GXutil.nullDate() ;
      AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm = DecimalUtil.ZERO ;
      AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to = DecimalUtil.ZERO ;
      AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm = DecimalUtil.ZERO ;
      AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to = DecimalUtil.ZERO ;
      AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod = "" ;
      AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel = "" ;
      AV99Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel = "" ;
      AV101Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel = "" ;
      AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel = "" ;
      AV105Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel = "" ;
      AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel = "" ;
      AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel = "" ;
      AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel = "" ;
      AV115Wcwanalisiscostesquimicossds_29_tfhredti = GXutil.resetTime( GXutil.nullDate() );
      AV116Wcwanalisiscostesquimicossds_30_tfhredtf = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV87Wcwanalisiscostesquimicossds_1_filterfulltext = "" ;
      lV99Wcwanalisiscostesquimicossds_13_tfclinom = "" ;
      lV101Wcwanalisiscostesquimicossds_15_tfhrebarser = "" ;
      lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc = "" ;
      lV105Wcwanalisiscostesquimicossds_19_tfhretipartd = "" ;
      lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom = "" ;
      lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln = "" ;
      lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4521HreColNom = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A9808HreRacab = "" ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      P08L32_A396EmprCod = new String[] {""} ;
      P08L32_A4494HreBarPar = new String[] {""} ;
      P08L32_A4493HreBarReo = new byte[1] ;
      P08L32_A4492HreBarCod = new int[1] ;
      P08L32_A4539HreIntCod = new byte[1] ;
      P08L32_n4539HreIntCod = new boolean[] {false} ;
      P08L32_A4525HreTipCol = new byte[1] ;
      P08L32_n4525HreTipCol = new boolean[] {false} ;
      P08L32_A4519HreTipArt = new short[1] ;
      P08L32_n4519HreTipArt = new boolean[] {false} ;
      P08L32_A9808HreRacab = new String[] {""} ;
      P08L32_n9808HreRacab = new boolean[] {false} ;
      P08L32_A4540HreIntDsc = new String[] {""} ;
      P08L32_n4540HreIntDsc = new boolean[] {false} ;
      P08L32_A4526HreTipColN = new String[] {""} ;
      P08L32_n4526HreTipColN = new boolean[] {false} ;
      P08L32_A4522HreColNum = new int[1] ;
      P08L32_n4522HreColNum = new boolean[] {false} ;
      P08L32_A4521HreColNom = new String[] {""} ;
      P08L32_n4521HreColNom = new boolean[] {false} ;
      P08L32_A4520HreTipArtD = new String[] {""} ;
      P08L32_n4520HreTipArtD = new boolean[] {false} ;
      P08L32_A4518HreBarDsc = new String[] {""} ;
      P08L32_n4518HreBarDsc = new boolean[] {false} ;
      P08L32_A4517HreBarSer = new String[] {""} ;
      P08L32_n4517HreBarSer = new boolean[] {false} ;
      P08L32_A279CliNom = new String[] {""} ;
      P08L32_A252CliCod = new int[1] ;
      P08L32_n252CliCod = new boolean[] {false} ;
      P08L32_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L32_n4542HreTotKgm = new boolean[] {false} ;
      P08L32_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L32_n4532HreBarKgm = new boolean[] {false} ;
      P08L32_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L32_n4529HreFecTin = new boolean[] {false} ;
      P08L32_A4495HreNumCie = new byte[1] ;
      AV24Option = "" ;
      P08L33_A396EmprCod = new String[] {""} ;
      P08L33_A279CliNom = new String[] {""} ;
      P08L33_A4494HreBarPar = new String[] {""} ;
      P08L33_A4493HreBarReo = new byte[1] ;
      P08L33_A4492HreBarCod = new int[1] ;
      P08L33_A4539HreIntCod = new byte[1] ;
      P08L33_n4539HreIntCod = new boolean[] {false} ;
      P08L33_A4525HreTipCol = new byte[1] ;
      P08L33_n4525HreTipCol = new boolean[] {false} ;
      P08L33_A4519HreTipArt = new short[1] ;
      P08L33_n4519HreTipArt = new boolean[] {false} ;
      P08L33_A9808HreRacab = new String[] {""} ;
      P08L33_n9808HreRacab = new boolean[] {false} ;
      P08L33_A4540HreIntDsc = new String[] {""} ;
      P08L33_n4540HreIntDsc = new boolean[] {false} ;
      P08L33_A4526HreTipColN = new String[] {""} ;
      P08L33_n4526HreTipColN = new boolean[] {false} ;
      P08L33_A4522HreColNum = new int[1] ;
      P08L33_n4522HreColNum = new boolean[] {false} ;
      P08L33_A4521HreColNom = new String[] {""} ;
      P08L33_n4521HreColNom = new boolean[] {false} ;
      P08L33_A4520HreTipArtD = new String[] {""} ;
      P08L33_n4520HreTipArtD = new boolean[] {false} ;
      P08L33_A4518HreBarDsc = new String[] {""} ;
      P08L33_n4518HreBarDsc = new boolean[] {false} ;
      P08L33_A4517HreBarSer = new String[] {""} ;
      P08L33_n4517HreBarSer = new boolean[] {false} ;
      P08L33_A252CliCod = new int[1] ;
      P08L33_n252CliCod = new boolean[] {false} ;
      P08L33_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L33_n4542HreTotKgm = new boolean[] {false} ;
      P08L33_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L33_n4532HreBarKgm = new boolean[] {false} ;
      P08L33_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L33_n4529HreFecTin = new boolean[] {false} ;
      P08L33_A4495HreNumCie = new byte[1] ;
      P08L34_A396EmprCod = new String[] {""} ;
      P08L34_A4517HreBarSer = new String[] {""} ;
      P08L34_n4517HreBarSer = new boolean[] {false} ;
      P08L34_A4494HreBarPar = new String[] {""} ;
      P08L34_A4493HreBarReo = new byte[1] ;
      P08L34_A4492HreBarCod = new int[1] ;
      P08L34_A4539HreIntCod = new byte[1] ;
      P08L34_n4539HreIntCod = new boolean[] {false} ;
      P08L34_A4525HreTipCol = new byte[1] ;
      P08L34_n4525HreTipCol = new boolean[] {false} ;
      P08L34_A4519HreTipArt = new short[1] ;
      P08L34_n4519HreTipArt = new boolean[] {false} ;
      P08L34_A9808HreRacab = new String[] {""} ;
      P08L34_n9808HreRacab = new boolean[] {false} ;
      P08L34_A4540HreIntDsc = new String[] {""} ;
      P08L34_n4540HreIntDsc = new boolean[] {false} ;
      P08L34_A4526HreTipColN = new String[] {""} ;
      P08L34_n4526HreTipColN = new boolean[] {false} ;
      P08L34_A4522HreColNum = new int[1] ;
      P08L34_n4522HreColNum = new boolean[] {false} ;
      P08L34_A4521HreColNom = new String[] {""} ;
      P08L34_n4521HreColNom = new boolean[] {false} ;
      P08L34_A4520HreTipArtD = new String[] {""} ;
      P08L34_n4520HreTipArtD = new boolean[] {false} ;
      P08L34_A4518HreBarDsc = new String[] {""} ;
      P08L34_n4518HreBarDsc = new boolean[] {false} ;
      P08L34_A279CliNom = new String[] {""} ;
      P08L34_A252CliCod = new int[1] ;
      P08L34_n252CliCod = new boolean[] {false} ;
      P08L34_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L34_n4542HreTotKgm = new boolean[] {false} ;
      P08L34_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L34_n4532HreBarKgm = new boolean[] {false} ;
      P08L34_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L34_n4529HreFecTin = new boolean[] {false} ;
      P08L34_A4495HreNumCie = new byte[1] ;
      P08L35_A396EmprCod = new String[] {""} ;
      P08L35_A4518HreBarDsc = new String[] {""} ;
      P08L35_n4518HreBarDsc = new boolean[] {false} ;
      P08L35_A4494HreBarPar = new String[] {""} ;
      P08L35_A4493HreBarReo = new byte[1] ;
      P08L35_A4492HreBarCod = new int[1] ;
      P08L35_A4539HreIntCod = new byte[1] ;
      P08L35_n4539HreIntCod = new boolean[] {false} ;
      P08L35_A4525HreTipCol = new byte[1] ;
      P08L35_n4525HreTipCol = new boolean[] {false} ;
      P08L35_A4519HreTipArt = new short[1] ;
      P08L35_n4519HreTipArt = new boolean[] {false} ;
      P08L35_A9808HreRacab = new String[] {""} ;
      P08L35_n9808HreRacab = new boolean[] {false} ;
      P08L35_A4540HreIntDsc = new String[] {""} ;
      P08L35_n4540HreIntDsc = new boolean[] {false} ;
      P08L35_A4526HreTipColN = new String[] {""} ;
      P08L35_n4526HreTipColN = new boolean[] {false} ;
      P08L35_A4522HreColNum = new int[1] ;
      P08L35_n4522HreColNum = new boolean[] {false} ;
      P08L35_A4521HreColNom = new String[] {""} ;
      P08L35_n4521HreColNom = new boolean[] {false} ;
      P08L35_A4520HreTipArtD = new String[] {""} ;
      P08L35_n4520HreTipArtD = new boolean[] {false} ;
      P08L35_A4517HreBarSer = new String[] {""} ;
      P08L35_n4517HreBarSer = new boolean[] {false} ;
      P08L35_A279CliNom = new String[] {""} ;
      P08L35_A252CliCod = new int[1] ;
      P08L35_n252CliCod = new boolean[] {false} ;
      P08L35_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L35_n4542HreTotKgm = new boolean[] {false} ;
      P08L35_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L35_n4532HreBarKgm = new boolean[] {false} ;
      P08L35_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L35_n4529HreFecTin = new boolean[] {false} ;
      P08L35_A4495HreNumCie = new byte[1] ;
      P08L36_A396EmprCod = new String[] {""} ;
      P08L36_A4520HreTipArtD = new String[] {""} ;
      P08L36_n4520HreTipArtD = new boolean[] {false} ;
      P08L36_A4494HreBarPar = new String[] {""} ;
      P08L36_A4493HreBarReo = new byte[1] ;
      P08L36_A4492HreBarCod = new int[1] ;
      P08L36_A4539HreIntCod = new byte[1] ;
      P08L36_n4539HreIntCod = new boolean[] {false} ;
      P08L36_A4525HreTipCol = new byte[1] ;
      P08L36_n4525HreTipCol = new boolean[] {false} ;
      P08L36_A4519HreTipArt = new short[1] ;
      P08L36_n4519HreTipArt = new boolean[] {false} ;
      P08L36_A9808HreRacab = new String[] {""} ;
      P08L36_n9808HreRacab = new boolean[] {false} ;
      P08L36_A4540HreIntDsc = new String[] {""} ;
      P08L36_n4540HreIntDsc = new boolean[] {false} ;
      P08L36_A4526HreTipColN = new String[] {""} ;
      P08L36_n4526HreTipColN = new boolean[] {false} ;
      P08L36_A4522HreColNum = new int[1] ;
      P08L36_n4522HreColNum = new boolean[] {false} ;
      P08L36_A4521HreColNom = new String[] {""} ;
      P08L36_n4521HreColNom = new boolean[] {false} ;
      P08L36_A4518HreBarDsc = new String[] {""} ;
      P08L36_n4518HreBarDsc = new boolean[] {false} ;
      P08L36_A4517HreBarSer = new String[] {""} ;
      P08L36_n4517HreBarSer = new boolean[] {false} ;
      P08L36_A279CliNom = new String[] {""} ;
      P08L36_A252CliCod = new int[1] ;
      P08L36_n252CliCod = new boolean[] {false} ;
      P08L36_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L36_n4542HreTotKgm = new boolean[] {false} ;
      P08L36_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L36_n4532HreBarKgm = new boolean[] {false} ;
      P08L36_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L36_n4529HreFecTin = new boolean[] {false} ;
      P08L36_A4495HreNumCie = new byte[1] ;
      P08L37_A396EmprCod = new String[] {""} ;
      P08L37_A4521HreColNom = new String[] {""} ;
      P08L37_n4521HreColNom = new boolean[] {false} ;
      P08L37_A4494HreBarPar = new String[] {""} ;
      P08L37_A4493HreBarReo = new byte[1] ;
      P08L37_A4492HreBarCod = new int[1] ;
      P08L37_A4539HreIntCod = new byte[1] ;
      P08L37_n4539HreIntCod = new boolean[] {false} ;
      P08L37_A4525HreTipCol = new byte[1] ;
      P08L37_n4525HreTipCol = new boolean[] {false} ;
      P08L37_A4519HreTipArt = new short[1] ;
      P08L37_n4519HreTipArt = new boolean[] {false} ;
      P08L37_A9808HreRacab = new String[] {""} ;
      P08L37_n9808HreRacab = new boolean[] {false} ;
      P08L37_A4540HreIntDsc = new String[] {""} ;
      P08L37_n4540HreIntDsc = new boolean[] {false} ;
      P08L37_A4526HreTipColN = new String[] {""} ;
      P08L37_n4526HreTipColN = new boolean[] {false} ;
      P08L37_A4522HreColNum = new int[1] ;
      P08L37_n4522HreColNum = new boolean[] {false} ;
      P08L37_A4520HreTipArtD = new String[] {""} ;
      P08L37_n4520HreTipArtD = new boolean[] {false} ;
      P08L37_A4518HreBarDsc = new String[] {""} ;
      P08L37_n4518HreBarDsc = new boolean[] {false} ;
      P08L37_A4517HreBarSer = new String[] {""} ;
      P08L37_n4517HreBarSer = new boolean[] {false} ;
      P08L37_A279CliNom = new String[] {""} ;
      P08L37_A252CliCod = new int[1] ;
      P08L37_n252CliCod = new boolean[] {false} ;
      P08L37_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L37_n4542HreTotKgm = new boolean[] {false} ;
      P08L37_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L37_n4532HreBarKgm = new boolean[] {false} ;
      P08L37_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L37_n4529HreFecTin = new boolean[] {false} ;
      P08L37_A4495HreNumCie = new byte[1] ;
      P08L38_A396EmprCod = new String[] {""} ;
      P08L38_A4526HreTipColN = new String[] {""} ;
      P08L38_n4526HreTipColN = new boolean[] {false} ;
      P08L38_A4494HreBarPar = new String[] {""} ;
      P08L38_A4493HreBarReo = new byte[1] ;
      P08L38_A4492HreBarCod = new int[1] ;
      P08L38_A4539HreIntCod = new byte[1] ;
      P08L38_n4539HreIntCod = new boolean[] {false} ;
      P08L38_A4525HreTipCol = new byte[1] ;
      P08L38_n4525HreTipCol = new boolean[] {false} ;
      P08L38_A4519HreTipArt = new short[1] ;
      P08L38_n4519HreTipArt = new boolean[] {false} ;
      P08L38_A9808HreRacab = new String[] {""} ;
      P08L38_n9808HreRacab = new boolean[] {false} ;
      P08L38_A4540HreIntDsc = new String[] {""} ;
      P08L38_n4540HreIntDsc = new boolean[] {false} ;
      P08L38_A4522HreColNum = new int[1] ;
      P08L38_n4522HreColNum = new boolean[] {false} ;
      P08L38_A4521HreColNom = new String[] {""} ;
      P08L38_n4521HreColNom = new boolean[] {false} ;
      P08L38_A4520HreTipArtD = new String[] {""} ;
      P08L38_n4520HreTipArtD = new boolean[] {false} ;
      P08L38_A4518HreBarDsc = new String[] {""} ;
      P08L38_n4518HreBarDsc = new boolean[] {false} ;
      P08L38_A4517HreBarSer = new String[] {""} ;
      P08L38_n4517HreBarSer = new boolean[] {false} ;
      P08L38_A279CliNom = new String[] {""} ;
      P08L38_A252CliCod = new int[1] ;
      P08L38_n252CliCod = new boolean[] {false} ;
      P08L38_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L38_n4542HreTotKgm = new boolean[] {false} ;
      P08L38_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L38_n4532HreBarKgm = new boolean[] {false} ;
      P08L38_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L38_n4529HreFecTin = new boolean[] {false} ;
      P08L38_A4495HreNumCie = new byte[1] ;
      P08L39_A396EmprCod = new String[] {""} ;
      P08L39_A4540HreIntDsc = new String[] {""} ;
      P08L39_n4540HreIntDsc = new boolean[] {false} ;
      P08L39_A4494HreBarPar = new String[] {""} ;
      P08L39_A4493HreBarReo = new byte[1] ;
      P08L39_A4492HreBarCod = new int[1] ;
      P08L39_A4539HreIntCod = new byte[1] ;
      P08L39_n4539HreIntCod = new boolean[] {false} ;
      P08L39_A4525HreTipCol = new byte[1] ;
      P08L39_n4525HreTipCol = new boolean[] {false} ;
      P08L39_A4519HreTipArt = new short[1] ;
      P08L39_n4519HreTipArt = new boolean[] {false} ;
      P08L39_A9808HreRacab = new String[] {""} ;
      P08L39_n9808HreRacab = new boolean[] {false} ;
      P08L39_A4526HreTipColN = new String[] {""} ;
      P08L39_n4526HreTipColN = new boolean[] {false} ;
      P08L39_A4522HreColNum = new int[1] ;
      P08L39_n4522HreColNum = new boolean[] {false} ;
      P08L39_A4521HreColNom = new String[] {""} ;
      P08L39_n4521HreColNom = new boolean[] {false} ;
      P08L39_A4520HreTipArtD = new String[] {""} ;
      P08L39_n4520HreTipArtD = new boolean[] {false} ;
      P08L39_A4518HreBarDsc = new String[] {""} ;
      P08L39_n4518HreBarDsc = new boolean[] {false} ;
      P08L39_A4517HreBarSer = new String[] {""} ;
      P08L39_n4517HreBarSer = new boolean[] {false} ;
      P08L39_A279CliNom = new String[] {""} ;
      P08L39_A252CliCod = new int[1] ;
      P08L39_n252CliCod = new boolean[] {false} ;
      P08L39_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L39_n4542HreTotKgm = new boolean[] {false} ;
      P08L39_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08L39_n4532HreBarKgm = new boolean[] {false} ;
      P08L39_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P08L39_n4529HreFecTin = new boolean[] {false} ;
      P08L39_A4495HreNumCie = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwanalisiscostesquimicossgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08L32_A396EmprCod, P08L32_A4494HreBarPar, P08L32_A4493HreBarReo, P08L32_A4492HreBarCod, P08L32_A4539HreIntCod, P08L32_n4539HreIntCod, P08L32_A4525HreTipCol, P08L32_n4525HreTipCol, P08L32_A4519HreTipArt, P08L32_n4519HreTipArt,
            P08L32_A9808HreRacab, P08L32_n9808HreRacab, P08L32_A4540HreIntDsc, P08L32_n4540HreIntDsc, P08L32_A4526HreTipColN, P08L32_n4526HreTipColN, P08L32_A4522HreColNum, P08L32_n4522HreColNum, P08L32_A4521HreColNom, P08L32_n4521HreColNom,
            P08L32_A4520HreTipArtD, P08L32_n4520HreTipArtD, P08L32_A4518HreBarDsc, P08L32_n4518HreBarDsc, P08L32_A4517HreBarSer, P08L32_n4517HreBarSer, P08L32_A279CliNom, P08L32_A252CliCod, P08L32_n252CliCod, P08L32_A4542HreTotKgm,
            P08L32_n4542HreTotKgm, P08L32_A4532HreBarKgm, P08L32_n4532HreBarKgm, P08L32_A4529HreFecTin, P08L32_n4529HreFecTin, P08L32_A4495HreNumCie
            }
            , new Object[] {
            P08L33_A396EmprCod, P08L33_A279CliNom, P08L33_A4494HreBarPar, P08L33_A4493HreBarReo, P08L33_A4492HreBarCod, P08L33_A4539HreIntCod, P08L33_n4539HreIntCod, P08L33_A4525HreTipCol, P08L33_n4525HreTipCol, P08L33_A4519HreTipArt,
            P08L33_n4519HreTipArt, P08L33_A9808HreRacab, P08L33_n9808HreRacab, P08L33_A4540HreIntDsc, P08L33_n4540HreIntDsc, P08L33_A4526HreTipColN, P08L33_n4526HreTipColN, P08L33_A4522HreColNum, P08L33_n4522HreColNum, P08L33_A4521HreColNom,
            P08L33_n4521HreColNom, P08L33_A4520HreTipArtD, P08L33_n4520HreTipArtD, P08L33_A4518HreBarDsc, P08L33_n4518HreBarDsc, P08L33_A4517HreBarSer, P08L33_n4517HreBarSer, P08L33_A252CliCod, P08L33_n252CliCod, P08L33_A4542HreTotKgm,
            P08L33_n4542HreTotKgm, P08L33_A4532HreBarKgm, P08L33_n4532HreBarKgm, P08L33_A4529HreFecTin, P08L33_n4529HreFecTin, P08L33_A4495HreNumCie
            }
            , new Object[] {
            P08L34_A396EmprCod, P08L34_A4517HreBarSer, P08L34_n4517HreBarSer, P08L34_A4494HreBarPar, P08L34_A4493HreBarReo, P08L34_A4492HreBarCod, P08L34_A4539HreIntCod, P08L34_n4539HreIntCod, P08L34_A4525HreTipCol, P08L34_n4525HreTipCol,
            P08L34_A4519HreTipArt, P08L34_n4519HreTipArt, P08L34_A9808HreRacab, P08L34_n9808HreRacab, P08L34_A4540HreIntDsc, P08L34_n4540HreIntDsc, P08L34_A4526HreTipColN, P08L34_n4526HreTipColN, P08L34_A4522HreColNum, P08L34_n4522HreColNum,
            P08L34_A4521HreColNom, P08L34_n4521HreColNom, P08L34_A4520HreTipArtD, P08L34_n4520HreTipArtD, P08L34_A4518HreBarDsc, P08L34_n4518HreBarDsc, P08L34_A279CliNom, P08L34_A252CliCod, P08L34_n252CliCod, P08L34_A4542HreTotKgm,
            P08L34_n4542HreTotKgm, P08L34_A4532HreBarKgm, P08L34_n4532HreBarKgm, P08L34_A4529HreFecTin, P08L34_n4529HreFecTin, P08L34_A4495HreNumCie
            }
            , new Object[] {
            P08L35_A396EmprCod, P08L35_A4518HreBarDsc, P08L35_n4518HreBarDsc, P08L35_A4494HreBarPar, P08L35_A4493HreBarReo, P08L35_A4492HreBarCod, P08L35_A4539HreIntCod, P08L35_n4539HreIntCod, P08L35_A4525HreTipCol, P08L35_n4525HreTipCol,
            P08L35_A4519HreTipArt, P08L35_n4519HreTipArt, P08L35_A9808HreRacab, P08L35_n9808HreRacab, P08L35_A4540HreIntDsc, P08L35_n4540HreIntDsc, P08L35_A4526HreTipColN, P08L35_n4526HreTipColN, P08L35_A4522HreColNum, P08L35_n4522HreColNum,
            P08L35_A4521HreColNom, P08L35_n4521HreColNom, P08L35_A4520HreTipArtD, P08L35_n4520HreTipArtD, P08L35_A4517HreBarSer, P08L35_n4517HreBarSer, P08L35_A279CliNom, P08L35_A252CliCod, P08L35_n252CliCod, P08L35_A4542HreTotKgm,
            P08L35_n4542HreTotKgm, P08L35_A4532HreBarKgm, P08L35_n4532HreBarKgm, P08L35_A4529HreFecTin, P08L35_n4529HreFecTin, P08L35_A4495HreNumCie
            }
            , new Object[] {
            P08L36_A396EmprCod, P08L36_A4520HreTipArtD, P08L36_n4520HreTipArtD, P08L36_A4494HreBarPar, P08L36_A4493HreBarReo, P08L36_A4492HreBarCod, P08L36_A4539HreIntCod, P08L36_n4539HreIntCod, P08L36_A4525HreTipCol, P08L36_n4525HreTipCol,
            P08L36_A4519HreTipArt, P08L36_n4519HreTipArt, P08L36_A9808HreRacab, P08L36_n9808HreRacab, P08L36_A4540HreIntDsc, P08L36_n4540HreIntDsc, P08L36_A4526HreTipColN, P08L36_n4526HreTipColN, P08L36_A4522HreColNum, P08L36_n4522HreColNum,
            P08L36_A4521HreColNom, P08L36_n4521HreColNom, P08L36_A4518HreBarDsc, P08L36_n4518HreBarDsc, P08L36_A4517HreBarSer, P08L36_n4517HreBarSer, P08L36_A279CliNom, P08L36_A252CliCod, P08L36_n252CliCod, P08L36_A4542HreTotKgm,
            P08L36_n4542HreTotKgm, P08L36_A4532HreBarKgm, P08L36_n4532HreBarKgm, P08L36_A4529HreFecTin, P08L36_n4529HreFecTin, P08L36_A4495HreNumCie
            }
            , new Object[] {
            P08L37_A396EmprCod, P08L37_A4521HreColNom, P08L37_n4521HreColNom, P08L37_A4494HreBarPar, P08L37_A4493HreBarReo, P08L37_A4492HreBarCod, P08L37_A4539HreIntCod, P08L37_n4539HreIntCod, P08L37_A4525HreTipCol, P08L37_n4525HreTipCol,
            P08L37_A4519HreTipArt, P08L37_n4519HreTipArt, P08L37_A9808HreRacab, P08L37_n9808HreRacab, P08L37_A4540HreIntDsc, P08L37_n4540HreIntDsc, P08L37_A4526HreTipColN, P08L37_n4526HreTipColN, P08L37_A4522HreColNum, P08L37_n4522HreColNum,
            P08L37_A4520HreTipArtD, P08L37_n4520HreTipArtD, P08L37_A4518HreBarDsc, P08L37_n4518HreBarDsc, P08L37_A4517HreBarSer, P08L37_n4517HreBarSer, P08L37_A279CliNom, P08L37_A252CliCod, P08L37_n252CliCod, P08L37_A4542HreTotKgm,
            P08L37_n4542HreTotKgm, P08L37_A4532HreBarKgm, P08L37_n4532HreBarKgm, P08L37_A4529HreFecTin, P08L37_n4529HreFecTin, P08L37_A4495HreNumCie
            }
            , new Object[] {
            P08L38_A396EmprCod, P08L38_A4526HreTipColN, P08L38_n4526HreTipColN, P08L38_A4494HreBarPar, P08L38_A4493HreBarReo, P08L38_A4492HreBarCod, P08L38_A4539HreIntCod, P08L38_n4539HreIntCod, P08L38_A4525HreTipCol, P08L38_n4525HreTipCol,
            P08L38_A4519HreTipArt, P08L38_n4519HreTipArt, P08L38_A9808HreRacab, P08L38_n9808HreRacab, P08L38_A4540HreIntDsc, P08L38_n4540HreIntDsc, P08L38_A4522HreColNum, P08L38_n4522HreColNum, P08L38_A4521HreColNom, P08L38_n4521HreColNom,
            P08L38_A4520HreTipArtD, P08L38_n4520HreTipArtD, P08L38_A4518HreBarDsc, P08L38_n4518HreBarDsc, P08L38_A4517HreBarSer, P08L38_n4517HreBarSer, P08L38_A279CliNom, P08L38_A252CliCod, P08L38_n252CliCod, P08L38_A4542HreTotKgm,
            P08L38_n4542HreTotKgm, P08L38_A4532HreBarKgm, P08L38_n4532HreBarKgm, P08L38_A4529HreFecTin, P08L38_n4529HreFecTin, P08L38_A4495HreNumCie
            }
            , new Object[] {
            P08L39_A396EmprCod, P08L39_A4540HreIntDsc, P08L39_n4540HreIntDsc, P08L39_A4494HreBarPar, P08L39_A4493HreBarReo, P08L39_A4492HreBarCod, P08L39_A4539HreIntCod, P08L39_n4539HreIntCod, P08L39_A4525HreTipCol, P08L39_n4525HreTipCol,
            P08L39_A4519HreTipArt, P08L39_n4519HreTipArt, P08L39_A9808HreRacab, P08L39_n9808HreRacab, P08L39_A4526HreTipColN, P08L39_n4526HreTipColN, P08L39_A4522HreColNum, P08L39_n4522HreColNum, P08L39_A4521HreColNom, P08L39_n4521HreColNom,
            P08L39_A4520HreTipArtD, P08L39_n4520HreTipArtD, P08L39_A4518HreBarDsc, P08L39_n4518HreBarDsc, P08L39_A4517HreBarSer, P08L39_n4517HreBarSer, P08L39_A279CliNom, P08L39_A252CliCod, P08L39_n252CliCod, P08L39_A4542HreTotKgm,
            P08L39_n4542HreTotKgm, P08L39_A4532HreBarKgm, P08L39_n4532HreBarKgm, P08L39_A4529HreFecTin, P08L39_n4529HreFecTin, P08L39_A4495HreNumCie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV63Calculo ;
   private byte AV59barcodreo ;
   private byte AV72Intcod1 ;
   private byte AV73Intcod3 ;
   private byte AV76Tipcolcod1 ;
   private byte AV77Tipcolcod3 ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short AV74TipArtCod1 ;
   private short AV75TipArtCod3 ;
   private short A4519HreTipArt ;
   private short Gx_err ;
   private int AV85GXV1 ;
   private int AV18TFHreVolPrd ;
   private int AV19TFHreVolPrd_To ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV50TFHreColNum ;
   private int AV51TFHreColNum_To ;
   private int AV58barcod ;
   private int AV68Barcolnum1 ;
   private int AV69Barcolnum3 ;
   private int AV70Clicod1 ;
   private int AV71Clicod3 ;
   private int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ;
   private int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ;
   private int AV97Wcwanalisiscostesquimicossds_11_tfclicod ;
   private int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ;
   private int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ;
   private int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ;
   private int A4547HreVolPrd ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int A4492HreBarCod ;
   private long AV32count ;
   private java.math.BigDecimal AV12TFHreBarKgm ;
   private java.math.BigDecimal AV13TFHreBarKgm_To ;
   private java.math.BigDecimal AV14TFHreTotKgm ;
   private java.math.BigDecimal AV15TFHreTotKgm_To ;
   private java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ;
   private java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ;
   private java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ;
   private java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private String AV16TFHreMaqCod ;
   private String AV17TFHreMaqCod_Sel ;
   private String AV40TFCliNom ;
   private String AV41TFCliNom_Sel ;
   private String AV42TFHreBarSer ;
   private String AV43TFHreBarSer_Sel ;
   private String AV44TFHreBarDsc ;
   private String AV45TFHreBarDsc_Sel ;
   private String AV46TFHreTipArtD ;
   private String AV47TFHreTipArtD_Sel ;
   private String AV48TFHreColNom ;
   private String AV49TFHreColNom_Sel ;
   private String AV52TFHreTipColN ;
   private String AV53TFHreTipColN_Sel ;
   private String AV54TFHreIntDsc ;
   private String AV55TFHreIntDsc_Sel ;
   private String AV56Emprcod ;
   private String AV57HreRacab ;
   private String AV60barcodpar ;
   private String AV64ARtcod1 ;
   private String AV65ARtcod3 ;
   private String AV66Barcolnom1 ;
   private String AV67Barcolnom3 ;
   private String A4546HreMaqCod ;
   private String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ;
   private String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ;
   private String AV99Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ;
   private String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ;
   private String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ;
   private String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ;
   private String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ;
   private String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ;
   private String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ;
   private String scmdbuf ;
   private String lV99Wcwanalisiscostesquimicossds_13_tfclinom ;
   private String lV101Wcwanalisiscostesquimicossds_15_tfhrebarser ;
   private String lV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ;
   private String lV105Wcwanalisiscostesquimicossds_19_tfhretipartd ;
   private String lV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ;
   private String lV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ;
   private String lV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ;
   private String A279CliNom ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String A4521HreColNom ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A9808HreRacab ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private java.util.Date AV78TFHreDti ;
   private java.util.Date AV80TFHreDtf ;
   private java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ;
   private java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ;
   private java.util.Date AV10TFHreFecTin ;
   private java.util.Date AV61Fec1 ;
   private java.util.Date AV62Fec2 ;
   private java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ;
   private java.util.Date A4529HreFecTin ;
   private boolean returnInSub ;
   private boolean brk8L32 ;
   private boolean n4539HreIntCod ;
   private boolean n4525HreTipCol ;
   private boolean n4519HreTipArt ;
   private boolean n9808HreRacab ;
   private boolean n4540HreIntDsc ;
   private boolean n4526HreTipColN ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4520HreTipArtD ;
   private boolean n4518HreBarDsc ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean n4542HreTotKgm ;
   private boolean n4532HreBarKgm ;
   private boolean n4529HreFecTin ;
   private boolean brk8L34 ;
   private boolean brk8L36 ;
   private boolean brk8L38 ;
   private boolean brk8L310 ;
   private boolean brk8L312 ;
   private boolean brk8L314 ;
   private boolean brk8L316 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV82FilterFullText ;
   private String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String lV87Wcwanalisiscostesquimicossds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08L32_A396EmprCod ;
   private String[] P08L32_A4494HreBarPar ;
   private byte[] P08L32_A4493HreBarReo ;
   private int[] P08L32_A4492HreBarCod ;
   private byte[] P08L32_A4539HreIntCod ;
   private boolean[] P08L32_n4539HreIntCod ;
   private byte[] P08L32_A4525HreTipCol ;
   private boolean[] P08L32_n4525HreTipCol ;
   private short[] P08L32_A4519HreTipArt ;
   private boolean[] P08L32_n4519HreTipArt ;
   private String[] P08L32_A9808HreRacab ;
   private boolean[] P08L32_n9808HreRacab ;
   private String[] P08L32_A4540HreIntDsc ;
   private boolean[] P08L32_n4540HreIntDsc ;
   private String[] P08L32_A4526HreTipColN ;
   private boolean[] P08L32_n4526HreTipColN ;
   private int[] P08L32_A4522HreColNum ;
   private boolean[] P08L32_n4522HreColNum ;
   private String[] P08L32_A4521HreColNom ;
   private boolean[] P08L32_n4521HreColNom ;
   private String[] P08L32_A4520HreTipArtD ;
   private boolean[] P08L32_n4520HreTipArtD ;
   private String[] P08L32_A4518HreBarDsc ;
   private boolean[] P08L32_n4518HreBarDsc ;
   private String[] P08L32_A4517HreBarSer ;
   private boolean[] P08L32_n4517HreBarSer ;
   private String[] P08L32_A279CliNom ;
   private int[] P08L32_A252CliCod ;
   private boolean[] P08L32_n252CliCod ;
   private java.math.BigDecimal[] P08L32_A4542HreTotKgm ;
   private boolean[] P08L32_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L32_A4532HreBarKgm ;
   private boolean[] P08L32_n4532HreBarKgm ;
   private java.util.Date[] P08L32_A4529HreFecTin ;
   private boolean[] P08L32_n4529HreFecTin ;
   private byte[] P08L32_A4495HreNumCie ;
   private String[] P08L33_A396EmprCod ;
   private String[] P08L33_A279CliNom ;
   private String[] P08L33_A4494HreBarPar ;
   private byte[] P08L33_A4493HreBarReo ;
   private int[] P08L33_A4492HreBarCod ;
   private byte[] P08L33_A4539HreIntCod ;
   private boolean[] P08L33_n4539HreIntCod ;
   private byte[] P08L33_A4525HreTipCol ;
   private boolean[] P08L33_n4525HreTipCol ;
   private short[] P08L33_A4519HreTipArt ;
   private boolean[] P08L33_n4519HreTipArt ;
   private String[] P08L33_A9808HreRacab ;
   private boolean[] P08L33_n9808HreRacab ;
   private String[] P08L33_A4540HreIntDsc ;
   private boolean[] P08L33_n4540HreIntDsc ;
   private String[] P08L33_A4526HreTipColN ;
   private boolean[] P08L33_n4526HreTipColN ;
   private int[] P08L33_A4522HreColNum ;
   private boolean[] P08L33_n4522HreColNum ;
   private String[] P08L33_A4521HreColNom ;
   private boolean[] P08L33_n4521HreColNom ;
   private String[] P08L33_A4520HreTipArtD ;
   private boolean[] P08L33_n4520HreTipArtD ;
   private String[] P08L33_A4518HreBarDsc ;
   private boolean[] P08L33_n4518HreBarDsc ;
   private String[] P08L33_A4517HreBarSer ;
   private boolean[] P08L33_n4517HreBarSer ;
   private int[] P08L33_A252CliCod ;
   private boolean[] P08L33_n252CliCod ;
   private java.math.BigDecimal[] P08L33_A4542HreTotKgm ;
   private boolean[] P08L33_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L33_A4532HreBarKgm ;
   private boolean[] P08L33_n4532HreBarKgm ;
   private java.util.Date[] P08L33_A4529HreFecTin ;
   private boolean[] P08L33_n4529HreFecTin ;
   private byte[] P08L33_A4495HreNumCie ;
   private String[] P08L34_A396EmprCod ;
   private String[] P08L34_A4517HreBarSer ;
   private boolean[] P08L34_n4517HreBarSer ;
   private String[] P08L34_A4494HreBarPar ;
   private byte[] P08L34_A4493HreBarReo ;
   private int[] P08L34_A4492HreBarCod ;
   private byte[] P08L34_A4539HreIntCod ;
   private boolean[] P08L34_n4539HreIntCod ;
   private byte[] P08L34_A4525HreTipCol ;
   private boolean[] P08L34_n4525HreTipCol ;
   private short[] P08L34_A4519HreTipArt ;
   private boolean[] P08L34_n4519HreTipArt ;
   private String[] P08L34_A9808HreRacab ;
   private boolean[] P08L34_n9808HreRacab ;
   private String[] P08L34_A4540HreIntDsc ;
   private boolean[] P08L34_n4540HreIntDsc ;
   private String[] P08L34_A4526HreTipColN ;
   private boolean[] P08L34_n4526HreTipColN ;
   private int[] P08L34_A4522HreColNum ;
   private boolean[] P08L34_n4522HreColNum ;
   private String[] P08L34_A4521HreColNom ;
   private boolean[] P08L34_n4521HreColNom ;
   private String[] P08L34_A4520HreTipArtD ;
   private boolean[] P08L34_n4520HreTipArtD ;
   private String[] P08L34_A4518HreBarDsc ;
   private boolean[] P08L34_n4518HreBarDsc ;
   private String[] P08L34_A279CliNom ;
   private int[] P08L34_A252CliCod ;
   private boolean[] P08L34_n252CliCod ;
   private java.math.BigDecimal[] P08L34_A4542HreTotKgm ;
   private boolean[] P08L34_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L34_A4532HreBarKgm ;
   private boolean[] P08L34_n4532HreBarKgm ;
   private java.util.Date[] P08L34_A4529HreFecTin ;
   private boolean[] P08L34_n4529HreFecTin ;
   private byte[] P08L34_A4495HreNumCie ;
   private String[] P08L35_A396EmprCod ;
   private String[] P08L35_A4518HreBarDsc ;
   private boolean[] P08L35_n4518HreBarDsc ;
   private String[] P08L35_A4494HreBarPar ;
   private byte[] P08L35_A4493HreBarReo ;
   private int[] P08L35_A4492HreBarCod ;
   private byte[] P08L35_A4539HreIntCod ;
   private boolean[] P08L35_n4539HreIntCod ;
   private byte[] P08L35_A4525HreTipCol ;
   private boolean[] P08L35_n4525HreTipCol ;
   private short[] P08L35_A4519HreTipArt ;
   private boolean[] P08L35_n4519HreTipArt ;
   private String[] P08L35_A9808HreRacab ;
   private boolean[] P08L35_n9808HreRacab ;
   private String[] P08L35_A4540HreIntDsc ;
   private boolean[] P08L35_n4540HreIntDsc ;
   private String[] P08L35_A4526HreTipColN ;
   private boolean[] P08L35_n4526HreTipColN ;
   private int[] P08L35_A4522HreColNum ;
   private boolean[] P08L35_n4522HreColNum ;
   private String[] P08L35_A4521HreColNom ;
   private boolean[] P08L35_n4521HreColNom ;
   private String[] P08L35_A4520HreTipArtD ;
   private boolean[] P08L35_n4520HreTipArtD ;
   private String[] P08L35_A4517HreBarSer ;
   private boolean[] P08L35_n4517HreBarSer ;
   private String[] P08L35_A279CliNom ;
   private int[] P08L35_A252CliCod ;
   private boolean[] P08L35_n252CliCod ;
   private java.math.BigDecimal[] P08L35_A4542HreTotKgm ;
   private boolean[] P08L35_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L35_A4532HreBarKgm ;
   private boolean[] P08L35_n4532HreBarKgm ;
   private java.util.Date[] P08L35_A4529HreFecTin ;
   private boolean[] P08L35_n4529HreFecTin ;
   private byte[] P08L35_A4495HreNumCie ;
   private String[] P08L36_A396EmprCod ;
   private String[] P08L36_A4520HreTipArtD ;
   private boolean[] P08L36_n4520HreTipArtD ;
   private String[] P08L36_A4494HreBarPar ;
   private byte[] P08L36_A4493HreBarReo ;
   private int[] P08L36_A4492HreBarCod ;
   private byte[] P08L36_A4539HreIntCod ;
   private boolean[] P08L36_n4539HreIntCod ;
   private byte[] P08L36_A4525HreTipCol ;
   private boolean[] P08L36_n4525HreTipCol ;
   private short[] P08L36_A4519HreTipArt ;
   private boolean[] P08L36_n4519HreTipArt ;
   private String[] P08L36_A9808HreRacab ;
   private boolean[] P08L36_n9808HreRacab ;
   private String[] P08L36_A4540HreIntDsc ;
   private boolean[] P08L36_n4540HreIntDsc ;
   private String[] P08L36_A4526HreTipColN ;
   private boolean[] P08L36_n4526HreTipColN ;
   private int[] P08L36_A4522HreColNum ;
   private boolean[] P08L36_n4522HreColNum ;
   private String[] P08L36_A4521HreColNom ;
   private boolean[] P08L36_n4521HreColNom ;
   private String[] P08L36_A4518HreBarDsc ;
   private boolean[] P08L36_n4518HreBarDsc ;
   private String[] P08L36_A4517HreBarSer ;
   private boolean[] P08L36_n4517HreBarSer ;
   private String[] P08L36_A279CliNom ;
   private int[] P08L36_A252CliCod ;
   private boolean[] P08L36_n252CliCod ;
   private java.math.BigDecimal[] P08L36_A4542HreTotKgm ;
   private boolean[] P08L36_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L36_A4532HreBarKgm ;
   private boolean[] P08L36_n4532HreBarKgm ;
   private java.util.Date[] P08L36_A4529HreFecTin ;
   private boolean[] P08L36_n4529HreFecTin ;
   private byte[] P08L36_A4495HreNumCie ;
   private String[] P08L37_A396EmprCod ;
   private String[] P08L37_A4521HreColNom ;
   private boolean[] P08L37_n4521HreColNom ;
   private String[] P08L37_A4494HreBarPar ;
   private byte[] P08L37_A4493HreBarReo ;
   private int[] P08L37_A4492HreBarCod ;
   private byte[] P08L37_A4539HreIntCod ;
   private boolean[] P08L37_n4539HreIntCod ;
   private byte[] P08L37_A4525HreTipCol ;
   private boolean[] P08L37_n4525HreTipCol ;
   private short[] P08L37_A4519HreTipArt ;
   private boolean[] P08L37_n4519HreTipArt ;
   private String[] P08L37_A9808HreRacab ;
   private boolean[] P08L37_n9808HreRacab ;
   private String[] P08L37_A4540HreIntDsc ;
   private boolean[] P08L37_n4540HreIntDsc ;
   private String[] P08L37_A4526HreTipColN ;
   private boolean[] P08L37_n4526HreTipColN ;
   private int[] P08L37_A4522HreColNum ;
   private boolean[] P08L37_n4522HreColNum ;
   private String[] P08L37_A4520HreTipArtD ;
   private boolean[] P08L37_n4520HreTipArtD ;
   private String[] P08L37_A4518HreBarDsc ;
   private boolean[] P08L37_n4518HreBarDsc ;
   private String[] P08L37_A4517HreBarSer ;
   private boolean[] P08L37_n4517HreBarSer ;
   private String[] P08L37_A279CliNom ;
   private int[] P08L37_A252CliCod ;
   private boolean[] P08L37_n252CliCod ;
   private java.math.BigDecimal[] P08L37_A4542HreTotKgm ;
   private boolean[] P08L37_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L37_A4532HreBarKgm ;
   private boolean[] P08L37_n4532HreBarKgm ;
   private java.util.Date[] P08L37_A4529HreFecTin ;
   private boolean[] P08L37_n4529HreFecTin ;
   private byte[] P08L37_A4495HreNumCie ;
   private String[] P08L38_A396EmprCod ;
   private String[] P08L38_A4526HreTipColN ;
   private boolean[] P08L38_n4526HreTipColN ;
   private String[] P08L38_A4494HreBarPar ;
   private byte[] P08L38_A4493HreBarReo ;
   private int[] P08L38_A4492HreBarCod ;
   private byte[] P08L38_A4539HreIntCod ;
   private boolean[] P08L38_n4539HreIntCod ;
   private byte[] P08L38_A4525HreTipCol ;
   private boolean[] P08L38_n4525HreTipCol ;
   private short[] P08L38_A4519HreTipArt ;
   private boolean[] P08L38_n4519HreTipArt ;
   private String[] P08L38_A9808HreRacab ;
   private boolean[] P08L38_n9808HreRacab ;
   private String[] P08L38_A4540HreIntDsc ;
   private boolean[] P08L38_n4540HreIntDsc ;
   private int[] P08L38_A4522HreColNum ;
   private boolean[] P08L38_n4522HreColNum ;
   private String[] P08L38_A4521HreColNom ;
   private boolean[] P08L38_n4521HreColNom ;
   private String[] P08L38_A4520HreTipArtD ;
   private boolean[] P08L38_n4520HreTipArtD ;
   private String[] P08L38_A4518HreBarDsc ;
   private boolean[] P08L38_n4518HreBarDsc ;
   private String[] P08L38_A4517HreBarSer ;
   private boolean[] P08L38_n4517HreBarSer ;
   private String[] P08L38_A279CliNom ;
   private int[] P08L38_A252CliCod ;
   private boolean[] P08L38_n252CliCod ;
   private java.math.BigDecimal[] P08L38_A4542HreTotKgm ;
   private boolean[] P08L38_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L38_A4532HreBarKgm ;
   private boolean[] P08L38_n4532HreBarKgm ;
   private java.util.Date[] P08L38_A4529HreFecTin ;
   private boolean[] P08L38_n4529HreFecTin ;
   private byte[] P08L38_A4495HreNumCie ;
   private String[] P08L39_A396EmprCod ;
   private String[] P08L39_A4540HreIntDsc ;
   private boolean[] P08L39_n4540HreIntDsc ;
   private String[] P08L39_A4494HreBarPar ;
   private byte[] P08L39_A4493HreBarReo ;
   private int[] P08L39_A4492HreBarCod ;
   private byte[] P08L39_A4539HreIntCod ;
   private boolean[] P08L39_n4539HreIntCod ;
   private byte[] P08L39_A4525HreTipCol ;
   private boolean[] P08L39_n4525HreTipCol ;
   private short[] P08L39_A4519HreTipArt ;
   private boolean[] P08L39_n4519HreTipArt ;
   private String[] P08L39_A9808HreRacab ;
   private boolean[] P08L39_n9808HreRacab ;
   private String[] P08L39_A4526HreTipColN ;
   private boolean[] P08L39_n4526HreTipColN ;
   private int[] P08L39_A4522HreColNum ;
   private boolean[] P08L39_n4522HreColNum ;
   private String[] P08L39_A4521HreColNom ;
   private boolean[] P08L39_n4521HreColNom ;
   private String[] P08L39_A4520HreTipArtD ;
   private boolean[] P08L39_n4520HreTipArtD ;
   private String[] P08L39_A4518HreBarDsc ;
   private boolean[] P08L39_n4518HreBarDsc ;
   private String[] P08L39_A4517HreBarSer ;
   private boolean[] P08L39_n4517HreBarSer ;
   private String[] P08L39_A279CliNom ;
   private int[] P08L39_A252CliCod ;
   private boolean[] P08L39_n252CliCod ;
   private java.math.BigDecimal[] P08L39_A4542HreTotKgm ;
   private boolean[] P08L39_n4542HreTotKgm ;
   private java.math.BigDecimal[] P08L39_A4532HreBarKgm ;
   private boolean[] P08L39_n4532HreBarKgm ;
   private java.util.Date[] P08L39_A4529HreFecTin ;
   private boolean[] P08L39_n4529HreFecTin ;
   private byte[] P08L39_A4495HreNumCie ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wcwanalisiscostesquimicossgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08L32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[46];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum, T1.HreColNom," ;
      scmdbuf += " T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08L33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[46];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreColNom, T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08L34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[46];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarSer, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreColNom, T1.HreTipArtD, T1.HreBarDsc, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreBarSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08L35( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[46];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarDsc, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreColNom, T1.HreTipArtD, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreBarDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08L36( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[46];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreTipArtD, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreColNom, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreTipArtD" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08L37( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[46];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreColNom, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreTipColN, T1.HreColNum," ;
      scmdbuf += " T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreColNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08L38( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[46];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreTipColN, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreIntDsc, T1.HreColNum, T1.HreColNom," ;
      scmdbuf += " T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreTipColN" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08L39( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcwanalisiscostesquimicossds_1_filterfulltext ,
                                          java.util.Date AV88Wcwanalisiscostesquimicossds_2_tfhrefectin ,
                                          java.math.BigDecimal AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm ,
                                          java.math.BigDecimal AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to ,
                                          java.math.BigDecimal AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm ,
                                          java.math.BigDecimal AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to ,
                                          String AV94Wcwanalisiscostesquimicossds_8_tfhremaqcod_sel ,
                                          String AV93Wcwanalisiscostesquimicossds_7_tfhremaqcod ,
                                          int AV95Wcwanalisiscostesquimicossds_9_tfhrevolprd ,
                                          int AV96Wcwanalisiscostesquimicossds_10_tfhrevolprd_to ,
                                          int AV97Wcwanalisiscostesquimicossds_11_tfclicod ,
                                          int AV98Wcwanalisiscostesquimicossds_12_tfclicod_to ,
                                          String AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel ,
                                          String AV99Wcwanalisiscostesquimicossds_13_tfclinom ,
                                          String AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel ,
                                          String AV101Wcwanalisiscostesquimicossds_15_tfhrebarser ,
                                          String AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel ,
                                          String AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc ,
                                          String AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel ,
                                          String AV105Wcwanalisiscostesquimicossds_19_tfhretipartd ,
                                          String AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel ,
                                          String AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom ,
                                          int AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum ,
                                          int AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to ,
                                          String AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel ,
                                          String AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln ,
                                          String AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel ,
                                          String AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc ,
                                          java.util.Date AV115Wcwanalisiscostesquimicossds_29_tfhredti ,
                                          java.util.Date AV116Wcwanalisiscostesquimicossds_30_tfhredtf ,
                                          java.math.BigDecimal A4532HreBarKgm ,
                                          java.math.BigDecimal A4542HreTotKgm ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4517HreBarSer ,
                                          String A4518HreBarDsc ,
                                          String A4520HreTipArtD ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          String A4526HreTipColN ,
                                          String A4540HreIntDsc ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV61Fec1 ,
                                          java.util.Date AV62Fec2 ,
                                          String A9808HreRacab ,
                                          String AV57HreRacab ,
                                          int AV70Clicod1 ,
                                          int AV71Clicod3 ,
                                          String AV64ARtcod1 ,
                                          String AV65ARtcod3 ,
                                          short A4519HreTipArt ,
                                          short AV74TipArtCod1 ,
                                          short AV75TipArtCod3 ,
                                          String AV66Barcolnom1 ,
                                          String AV67Barcolnom3 ,
                                          int AV68Barcolnum1 ,
                                          int AV69Barcolnum3 ,
                                          byte A4525HreTipCol ,
                                          byte AV76Tipcolcod1 ,
                                          byte AV77Tipcolcod3 ,
                                          byte A4539HreIntCod ,
                                          byte AV72Intcod1 ,
                                          byte AV73Intcod3 ,
                                          int A4492HreBarCod ,
                                          int AV58barcod ,
                                          byte A4493HreBarReo ,
                                          byte AV59barcodreo ,
                                          String A4494HreBarPar ,
                                          String AV60barcodpar ,
                                          String A396EmprCod ,
                                          String AV56Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[46];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreIntDsc, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.HreIntCod, T1.HreTipCol, T1.HreTipArt, T1.HreRacab, T1.HreTipColN, T1.HreColNum, T1.HreColNom," ;
      scmdbuf += " T1.HreTipArtD, T1.HreBarDsc, T1.HreBarSer, T2.CliNom, T1.CliCod, T1.HreTotKgm, T1.HreBarKgm, T1.HreFecTin, T1.HreNumCie FROM (TXPHISREH T1 LEFT JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      addWhere(sWhereString, "(T1.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarSer >= ?)");
      addWhere(sWhereString, "(T1.HreBarSer <= ?)");
      addWhere(sWhereString, "(T1.HreTipArt >= ?)");
      addWhere(sWhereString, "(T1.HreTipArt <= ?)");
      addWhere(sWhereString, "(T1.HreColNom >= ?)");
      addWhere(sWhereString, "(T1.HreColNom <= ?)");
      addWhere(sWhereString, "(T1.HreColNum >= ?)");
      addWhere(sWhereString, "(T1.HreColNum <= ?)");
      addWhere(sWhereString, "(T1.HreTipCol >= ?)");
      addWhere(sWhereString, "(T1.HreTipCol <= ?)");
      addWhere(sWhereString, "(T1.HreIntCod >= ?)");
      addWhere(sWhereString, "(T1.HreIntCod <= ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.HreBarPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcwanalisiscostesquimicossds_2_tfhrefectin)) )
      {
         addWhere(sWhereString, "(T1.HreFecTin >= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcwanalisiscostesquimicossds_3_tfhrebarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcwanalisiscostesquimicossds_4_tfhrebarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarKgm <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wcwanalisiscostesquimicossds_5_tfhretotkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcwanalisiscostesquimicossds_6_tfhretotkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HreTotKgm <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV97Wcwanalisiscostesquimicossds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwanalisiscostesquimicossds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcwanalisiscostesquimicossds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcwanalisiscostesquimicossds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcwanalisiscostesquimicossds_15_tfhrebarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcwanalisiscostesquimicossds_16_tfhrebarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarSer = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcwanalisiscostesquimicossds_17_tfhrebardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreBarDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcwanalisiscostesquimicossds_18_tfhrebardsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarDsc = ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcwanalisiscostesquimicossds_19_tfhretipartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcwanalisiscostesquimicossds_20_tfhretipartd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipArtD = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcwanalisiscostesquimicossds_21_tfhrecolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcwanalisiscostesquimicossds_22_tfhrecolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreColNom = ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (0==AV109Wcwanalisiscostesquimicossds_23_tfhrecolnum) )
      {
         addWhere(sWhereString, "(T1.HreColNum >= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (0==AV110Wcwanalisiscostesquimicossds_24_tfhrecolnum_to) )
      {
         addWhere(sWhereString, "(T1.HreColNum <= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcwanalisiscostesquimicossds_25_tfhretipcoln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreTipColN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcwanalisiscostesquimicossds_26_tfhretipcoln_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreTipColN = ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcwanalisiscostesquimicossds_27_tfhreintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreIntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcwanalisiscostesquimicossds_28_tfhreintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreIntDsc = ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreIntDsc" ;
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
                  return conditional_P08L32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 1 :
                  return conditional_P08L33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 2 :
                  return conditional_P08L34(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).shortValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).byteValue() , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).intValue() , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).byteValue() , ((Number) dynConstraints[68]).byteValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 3 :
                  return conditional_P08L35(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 4 :
                  return conditional_P08L36(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 5 :
                  return conditional_P08L37(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).byteValue() , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).intValue() , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).byteValue() , ((Number) dynConstraints[68]).byteValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 6 :
                  return conditional_P08L38(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 7 :
                  return conditional_P08L39(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).byteValue() , ((Number) dynConstraints[63]).byteValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).byteValue() , ((Number) dynConstraints[70]).byteValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08L32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L35", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L37", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L38", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08L39", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 26);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               return;
      }
   }

}

