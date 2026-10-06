package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadesdelcontigetfilterdata extends GXProcedure
{
   public consultadesdelcontigetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadesdelcontigetfilterdata.class ), "" );
   }

   public consultadesdelcontigetfilterdata( int remoteHandle ,
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
      consultadesdelcontigetfilterdata.this.aP5 = new String[] {""};
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
      consultadesdelcontigetfilterdata.this.AV50DDOName = aP0;
      consultadesdelcontigetfilterdata.this.AV48SearchTxt = aP1;
      consultadesdelcontigetfilterdata.this.AV49SearchTxtTo = aP2;
      consultadesdelcontigetfilterdata.this.aP3 = aP3;
      consultadesdelcontigetfilterdata.this.aP4 = aP4;
      consultadesdelcontigetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV53Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV56OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARPARTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARPARTINOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARAGRLOT") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARSERTIN") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARDSCTIN") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARARTTIND") == 0 )
      {
         /* Execute user subroutine: 'LOADBARARTTINDOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARCOLNOT") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARMAQTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMAQTINOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV50DDOName), "DDO_BARDISPCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARDISPCLIOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV54OptionsJson = AV53Options.toJSonString(false) ;
      AV57OptionsDescJson = AV56OptionsDesc.toJSonString(false) ;
      AV59OptionIndexesJson = AV58OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV61Session.getValue("FormulacionTinte.ConsultadesdeLcontiGridState"), "") == 0 )
      {
         AV63GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsultadesdeLcontiGridState"), null, null);
      }
      else
      {
         AV63GridState.fromxml(AV61Session.getValue("FormulacionTinte.ConsultadesdeLcontiGridState"), null, null);
      }
      AV113GXV1 = 1 ;
      while ( AV113GXV1 <= AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV64GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV113GXV1));
         if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTFECCIER") == 0 )
         {
            AV10TFEstFecCier = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTTINNR") == 0 )
         {
            AV12TFEstTinNr = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFEstTinNr_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODTIN") == 0 )
         {
            AV105TFBarCodTin = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV106TFBarCodTin_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARREOTIN") == 0 )
         {
            AV107TFBarReoTin = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV108TFBarReoTin_To = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN") == 0 )
         {
            AV109TFBarParTin = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN_SEL") == 0 )
         {
            AV110TFBarParTin_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT") == 0 )
         {
            AV16TFBarAgrLot = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT_SEL") == 0 )
         {
            AV17TFBarAgrLot_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN") == 0 )
         {
            AV22TFBarSerTin = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN_SEL") == 0 )
         {
            AV23TFBarSerTin_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN") == 0 )
         {
            AV24TFBarDscTin = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN_SEL") == 0 )
         {
            AV25TFBarDscTin_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIN") == 0 )
         {
            AV89TFBarArtTin = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV90TFBarArtTin_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND") == 0 )
         {
            AV91TFBarArtTinD = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND_SEL") == 0 )
         {
            AV92TFBarArtTinD_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT") == 0 )
         {
            AV26TFBarColNoT = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT_SEL") == 0 )
         {
            AV27TFBarColNoT_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUT") == 0 )
         {
            AV28TFBarColNuT = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarColNuT_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOT") == 0 )
         {
            AV30TFBarTipCoT = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFBarTipCoT_To = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGMTIN") == 0 )
         {
            AV32TFBarKgmTin = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFBarKgmTin_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGSTT") == 0 )
         {
            AV34TFBarKgsTt = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFBarKgsTt_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTRTIN") == 0 )
         {
            AV36TFBarMtrTin = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFBarMtrTin_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMTINT") == 0 )
         {
            AV95TFBarNumtint = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV96TFBarNumtint_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTSTT") == 0 )
         {
            AV38TFBarMtsTt = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFBarMtsTt_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN") == 0 )
         {
            AV40TFBarMaqTin = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN_SEL") == 0 )
         {
            AV41TFBarMaqTin_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARVOLTIN") == 0 )
         {
            AV42TFBarVolTin = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFBarVolTin_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMENY") == 0 )
         {
            AV93TFBarNumEny = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFBarNumEny_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI") == 0 )
         {
            AV44TFBarDispCli = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI_SEL") == 0 )
         {
            AV45TFBarDispCli_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANA") == 0 )
         {
            AV46TFBarNumAna = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarNumAna_To = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEINICIAL") == 0 )
         {
            AV101TFCosteInicial = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV102TFCosteInicial_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEANYADIDAS") == 0 )
         {
            AV103TFCosteAnyadidas = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV104TFCosteAnyadidas_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV67Emprcod = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV68Fec1 = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC3") == 0 )
         {
            AV69Fec3 = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLICOD") == 0 )
         {
            AV70PCliCod = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODP") == 0 )
         {
            AV71CliCodP = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCOD") == 0 )
         {
            AV72PBarCod = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODP") == 0 )
         {
            AV73Barcodp = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODREO") == 0 )
         {
            AV74PBarCodReo = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOP") == 0 )
         {
            AV75BarCodReoP = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODPAR") == 0 )
         {
            AV76PBarCodPar = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARP") == 0 )
         {
            AV77BarCodParP = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PSERIE") == 0 )
         {
            AV78PSerie = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEP") == 0 )
         {
            AV79SerieP = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLOR") == 0 )
         {
            AV80PColor = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLORP") == 0 )
         {
            AV81ColorP = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLNUM") == 0 )
         {
            AV82PColNum = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLNUMP") == 0 )
         {
            AV83ColNumP = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI1") == 0 )
         {
            AV84DispCli1 = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI3") == 0 )
         {
            AV85DispCli3 = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV86HreRacab = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODI") == 0 )
         {
            AV87MaqCodi = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD3") == 0 )
         {
            AV88MaqCod3 = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCODFROM") == 0 )
         {
            AV97TipArtCodfrom = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCODTO") == 0 )
         {
            AV98TipArtCodto = (short)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SOLOAD") == 0 )
         {
            AV99SoloAd = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CORADI") == 0 )
         {
            AV100CorAdi = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV113GXV1 = (int)(AV113GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARPARTINOPTIONS' Routine */
      returnInSub = false ;
      AV109TFBarParTin = AV48SearchTxt ;
      AV110TFBarParTin_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK2 */
      pr_default.execute(0, new Object[] {AV76PBarCodPar, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV77BarCodParP, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8YK2 = false ;
         A396EmprCod = P08YK2_A396EmprCod[0] ;
         A6634BarRecAcb = P08YK2_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK2_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK2_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK2_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK2_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK2_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK2_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK2_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK2_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK2_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK2_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK2_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK2_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK2_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK2_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK2_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK2_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK2_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK2_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK2_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK2_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK2_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK2_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK2_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK2_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK2_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK2_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK2_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK2_n1936BarSerTin[0] ;
         A279CliNom = P08YK2_A279CliNom[0] ;
         A252CliCod = P08YK2_A252CliCod[0] ;
         A1929EstTinNr = P08YK2_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK2_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK2_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK2_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK2_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK2_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK2_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK2_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK2_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK2_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK2_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK2_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK2_A1935BarParTin[0] ;
         n1935BarParTin = P08YK2_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK2_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK2_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK2_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK2_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK2_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK2_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK2_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK2_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK2_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK2_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK2_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK2_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK2_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK2_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK2_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK2_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK2_n13962BarArtTinD[0] ;
         A279CliNom = P08YK2_A279CliNom[0] ;
         A13967BarNumEny = P08YK2_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK2_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08YK2_A1935BarParTin[0], A1935BarParTin) == 0 ) )
         {
            brk8YK2 = false ;
            A396EmprCod = P08YK2_A396EmprCod[0] ;
            A1929EstTinNr = P08YK2_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK2_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK2_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK2_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1935BarParTin)==0) )
         {
            AV52Option = A1935BarParTin ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK2 )
         {
            brk8YK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARAGRLOTOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarAgrLot = AV48SearchTxt ;
      AV17TFBarAgrLot_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK3 */
      pr_default.execute(1, new Object[] {AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8YK4 = false ;
         A396EmprCod = P08YK3_A396EmprCod[0] ;
         A6634BarRecAcb = P08YK3_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK3_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK3_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK3_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK3_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK3_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK3_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK3_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK3_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK3_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK3_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK3_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK3_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK3_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK3_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK3_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK3_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK3_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK3_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK3_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK3_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK3_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK3_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK3_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK3_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK3_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK3_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK3_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK3_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK3_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK3_n1936BarSerTin[0] ;
         A279CliNom = P08YK3_A279CliNom[0] ;
         A252CliCod = P08YK3_A252CliCod[0] ;
         A1929EstTinNr = P08YK3_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK3_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK3_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK3_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK3_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK3_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK3_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK3_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK3_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK3_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK3_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK3_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK3_A1935BarParTin[0] ;
         n1935BarParTin = P08YK3_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK3_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK3_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK3_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK3_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK3_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK3_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK3_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK3_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK3_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK3_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK3_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK3_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK3_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK3_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK3_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK3_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK3_n13962BarArtTinD[0] ;
         A279CliNom = P08YK3_A279CliNom[0] ;
         A13967BarNumEny = P08YK3_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK3_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08YK3_A2316BarAgrLot[0], A2316BarAgrLot) == 0 ) )
         {
            brk8YK4 = false ;
            A396EmprCod = P08YK3_A396EmprCod[0] ;
            A1929EstTinNr = P08YK3_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK3_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK3_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK3_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2316BarAgrLot)==0) )
         {
            AV52Option = A2316BarAgrLot ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK4 )
         {
            brk8YK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliNom = AV48SearchTxt ;
      AV21TFCliNom_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK4 */
      pr_default.execute(2, new Object[] {AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8YK6 = false ;
         A396EmprCod = P08YK4_A396EmprCod[0] ;
         A279CliNom = P08YK4_A279CliNom[0] ;
         A6634BarRecAcb = P08YK4_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK4_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK4_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK4_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK4_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK4_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK4_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK4_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK4_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK4_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK4_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK4_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK4_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK4_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK4_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK4_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK4_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK4_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK4_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK4_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK4_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK4_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK4_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK4_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK4_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK4_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK4_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK4_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK4_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK4_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK4_n1936BarSerTin[0] ;
         A252CliCod = P08YK4_A252CliCod[0] ;
         A1929EstTinNr = P08YK4_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK4_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK4_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK4_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK4_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK4_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK4_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK4_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK4_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK4_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK4_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK4_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK4_A1935BarParTin[0] ;
         n1935BarParTin = P08YK4_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK4_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK4_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK4_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK4_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK4_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK4_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK4_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK4_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK4_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK4_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK4_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK4_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK4_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK4_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK4_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK4_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK4_n13962BarArtTinD[0] ;
         A279CliNom = P08YK4_A279CliNom[0] ;
         A13967BarNumEny = P08YK4_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK4_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08YK4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8YK6 = false ;
            A396EmprCod = P08YK4_A396EmprCod[0] ;
            A252CliCod = P08YK4_A252CliCod[0] ;
            A1929EstTinNr = P08YK4_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK4_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK4_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK4_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV52Option = A279CliNom ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK6 )
         {
            brk8YK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERTINOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSerTin = AV48SearchTxt ;
      AV23TFBarSerTin_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           AV78PSerie ,
                                           AV79SerieP } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK5 */
      pr_default.execute(3, new Object[] {AV78PSerie, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV79SerieP, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8YK8 = false ;
         A396EmprCod = P08YK5_A396EmprCod[0] ;
         A1936BarSerTin = P08YK5_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK5_n1936BarSerTin[0] ;
         A6634BarRecAcb = P08YK5_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK5_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK5_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK5_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK5_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK5_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK5_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK5_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK5_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK5_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK5_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK5_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK5_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK5_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK5_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK5_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK5_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK5_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK5_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK5_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK5_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK5_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK5_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK5_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK5_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK5_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK5_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK5_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK5_n1937BarDscTin[0] ;
         A279CliNom = P08YK5_A279CliNom[0] ;
         A252CliCod = P08YK5_A252CliCod[0] ;
         A1929EstTinNr = P08YK5_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK5_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK5_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK5_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK5_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK5_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK5_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK5_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK5_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK5_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK5_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK5_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK5_A1935BarParTin[0] ;
         n1935BarParTin = P08YK5_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK5_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK5_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK5_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK5_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK5_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK5_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK5_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK5_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK5_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK5_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK5_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK5_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK5_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK5_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK5_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK5_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK5_n13962BarArtTinD[0] ;
         A279CliNom = P08YK5_A279CliNom[0] ;
         A13967BarNumEny = P08YK5_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK5_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08YK5_A1936BarSerTin[0], A1936BarSerTin) == 0 ) )
         {
            brk8YK8 = false ;
            A396EmprCod = P08YK5_A396EmprCod[0] ;
            A1929EstTinNr = P08YK5_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK5_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK5_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK5_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1936BarSerTin)==0) )
         {
            AV52Option = A1936BarSerTin ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK8 )
         {
            brk8YK8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARDSCTINOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarDscTin = AV48SearchTxt ;
      AV25TFBarDscTin_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK6 */
      pr_default.execute(4, new Object[] {AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8YK10 = false ;
         A396EmprCod = P08YK6_A396EmprCod[0] ;
         A1937BarDscTin = P08YK6_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK6_n1937BarDscTin[0] ;
         A6634BarRecAcb = P08YK6_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK6_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK6_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK6_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK6_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK6_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK6_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK6_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK6_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK6_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK6_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK6_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK6_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK6_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK6_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK6_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK6_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK6_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK6_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK6_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK6_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK6_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK6_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK6_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK6_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK6_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK6_n1939BarArtTin[0] ;
         A1936BarSerTin = P08YK6_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK6_n1936BarSerTin[0] ;
         A279CliNom = P08YK6_A279CliNom[0] ;
         A252CliCod = P08YK6_A252CliCod[0] ;
         A1929EstTinNr = P08YK6_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK6_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK6_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK6_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK6_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK6_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK6_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK6_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK6_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK6_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK6_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK6_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK6_A1935BarParTin[0] ;
         n1935BarParTin = P08YK6_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK6_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK6_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK6_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK6_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK6_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK6_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK6_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK6_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK6_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK6_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK6_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK6_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK6_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK6_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK6_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK6_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK6_n13962BarArtTinD[0] ;
         A279CliNom = P08YK6_A279CliNom[0] ;
         A13967BarNumEny = P08YK6_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK6_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08YK6_A1937BarDscTin[0], A1937BarDscTin) == 0 ) )
         {
            brk8YK10 = false ;
            A396EmprCod = P08YK6_A396EmprCod[0] ;
            A1929EstTinNr = P08YK6_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK6_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK6_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK6_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1937BarDscTin)==0) )
         {
            AV52Option = A1937BarDscTin ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK10 )
         {
            brk8YK10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARARTTINDOPTIONS' Routine */
      returnInSub = false ;
      AV91TFBarArtTinD = AV48SearchTxt ;
      AV92TFBarArtTinD_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           AV67Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK7 */
      pr_default.execute(5, new Object[] {AV67Emprcod, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A6634BarRecAcb = P08YK7_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK7_n6634BarRecAcb[0] ;
         A396EmprCod = P08YK7_A396EmprCod[0] ;
         A14200CosteAnyad = P08YK7_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK7_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK7_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK7_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK7_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK7_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK7_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK7_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK7_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK7_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK7_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK7_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK7_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK7_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK7_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK7_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK7_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK7_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK7_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK7_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK7_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK7_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK7_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK7_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK7_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK7_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK7_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK7_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK7_n1936BarSerTin[0] ;
         A279CliNom = P08YK7_A279CliNom[0] ;
         A252CliCod = P08YK7_A252CliCod[0] ;
         A1929EstTinNr = P08YK7_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK7_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK7_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK7_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK7_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK7_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK7_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK7_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK7_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK7_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK7_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK7_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK7_A1935BarParTin[0] ;
         n1935BarParTin = P08YK7_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK7_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK7_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK7_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK7_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK7_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK7_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK7_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK7_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK7_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK7_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK7_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK7_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK7_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK7_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK7_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK7_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK7_n13962BarArtTinD[0] ;
         A279CliNom = P08YK7_A279CliNom[0] ;
         A13967BarNumEny = P08YK7_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK7_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         if ( ! (GXutil.strcmp("", A13962BarArtTinD)==0) )
         {
            AV52Option = A13962BarArtTinD ;
            AV51InsertIndex = 1 ;
            while ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) < 0 ) )
            {
               AV51InsertIndex = (int)(AV51InsertIndex+1) ;
            }
            if ( ( AV51InsertIndex <= AV53Options.size() ) && ( GXutil.strcmp((String)AV53Options.elementAt(-1+AV51InsertIndex), AV52Option) == 0 ) )
            {
               AV60count = GXutil.lval( (String)AV58OptionIndexes.elementAt(-1+AV51InsertIndex)) ;
               AV60count = (long)(AV60count+1) ;
               AV58OptionIndexes.removeItem(AV51InsertIndex);
               AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), AV51InsertIndex);
            }
            else
            {
               AV53Options.add(AV52Option, AV51InsertIndex);
               AV58OptionIndexes.add("1", AV51InsertIndex);
            }
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARCOLNOTOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarColNoT = AV48SearchTxt ;
      AV27TFBarColNoT_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           AV80PColor ,
                                           AV81ColorP } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK8 */
      pr_default.execute(6, new Object[] {AV80PColor, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV81ColorP, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8YK13 = false ;
         A396EmprCod = P08YK8_A396EmprCod[0] ;
         A1940BarColNoT = P08YK8_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK8_n1940BarColNoT[0] ;
         A6634BarRecAcb = P08YK8_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK8_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK8_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK8_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK8_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK8_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK8_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK8_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK8_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK8_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK8_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK8_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK8_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK8_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK8_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK8_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK8_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK8_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK8_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK8_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK8_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK8_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK8_n1941BarColNuT[0] ;
         A1939BarArtTin = P08YK8_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK8_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK8_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK8_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK8_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK8_n1936BarSerTin[0] ;
         A279CliNom = P08YK8_A279CliNom[0] ;
         A252CliCod = P08YK8_A252CliCod[0] ;
         A1929EstTinNr = P08YK8_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK8_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK8_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK8_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK8_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK8_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK8_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK8_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK8_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK8_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK8_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK8_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK8_A1935BarParTin[0] ;
         n1935BarParTin = P08YK8_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK8_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK8_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK8_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK8_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK8_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK8_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK8_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK8_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK8_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK8_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK8_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK8_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK8_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK8_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK8_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK8_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK8_n13962BarArtTinD[0] ;
         A279CliNom = P08YK8_A279CliNom[0] ;
         A13967BarNumEny = P08YK8_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK8_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08YK8_A1940BarColNoT[0], A1940BarColNoT) == 0 ) )
         {
            brk8YK13 = false ;
            A396EmprCod = P08YK8_A396EmprCod[0] ;
            A1929EstTinNr = P08YK8_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK8_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK8_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK8_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK13 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1940BarColNoT)==0) )
         {
            AV52Option = A1940BarColNoT ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK13 )
         {
            brk8YK13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARMAQTINOPTIONS' Routine */
      returnInSub = false ;
      AV40TFBarMaqTin = AV48SearchTxt ;
      AV41TFBarMaqTin_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK9 */
      pr_default.execute(7, new Object[] {AV87MaqCodi, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV84DispCli1, AV85DispCli3, AV86HreRacab, AV86HreRacab, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV88MaqCod3, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8YK15 = false ;
         A396EmprCod = P08YK9_A396EmprCod[0] ;
         A1945BarMaqTin = P08YK9_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK9_n1945BarMaqTin[0] ;
         A6634BarRecAcb = P08YK9_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK9_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK9_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK9_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK9_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YK9_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK9_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YK9_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK9_n1946BarVolTin[0] ;
         A12993BarMtsTt = P08YK9_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK9_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK9_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK9_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK9_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK9_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK9_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK9_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK9_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK9_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK9_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK9_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK9_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK9_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK9_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK9_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK9_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK9_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK9_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK9_n1936BarSerTin[0] ;
         A279CliNom = P08YK9_A279CliNom[0] ;
         A252CliCod = P08YK9_A252CliCod[0] ;
         A1929EstTinNr = P08YK9_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK9_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK9_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK9_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK9_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK9_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK9_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK9_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK9_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK9_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK9_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK9_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK9_A1935BarParTin[0] ;
         n1935BarParTin = P08YK9_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK9_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK9_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK9_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK9_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK9_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK9_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK9_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK9_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK9_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK9_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK9_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK9_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK9_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK9_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK9_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK9_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK9_n13962BarArtTinD[0] ;
         A279CliNom = P08YK9_A279CliNom[0] ;
         A13967BarNumEny = P08YK9_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK9_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08YK9_A1945BarMaqTin[0], A1945BarMaqTin) == 0 ) )
         {
            brk8YK15 = false ;
            A396EmprCod = P08YK9_A396EmprCod[0] ;
            A1929EstTinNr = P08YK9_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK9_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK9_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK9_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK15 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A1945BarMaqTin)==0) )
         {
            AV52Option = A1945BarMaqTin ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK15 )
         {
            brk8YK15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBARDISPCLIOPTIONS' Routine */
      returnInSub = false ;
      AV44TFBarDispCli = AV48SearchTxt ;
      AV45TFBarDispCli_Sel = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV10TFEstFecCier ;
      AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV12TFEstTinNr ;
      AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV13TFEstTinNr_To ;
      AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV105TFBarCodTin ;
      AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV106TFBarCodTin_To ;
      AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV107TFBarReoTin ;
      AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV108TFBarReoTin_To ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV109TFBarParTin ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV110TFBarParTin_Sel ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV16TFBarAgrLot ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV17TFBarAgrLot_Sel ;
      AV126Formulaciontinte_consultadesdelcontids_12_tfclicod = AV18TFCliCod ;
      AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV19TFCliCod_To ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = AV20TFCliNom ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV21TFCliNom_Sel ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV22TFBarSerTin ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV23TFBarSerTin_Sel ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV24TFBarDscTin ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV25TFBarDscTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV89TFBarArtTin ;
      AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV90TFBarArtTin_To ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV91TFBarArtTinD ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV92TFBarArtTinD_Sel ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV26TFBarColNoT ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV27TFBarColNoT_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV28TFBarColNuT ;
      AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV29TFBarColNuT_To ;
      AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV30TFBarTipCoT ;
      AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV31TFBarTipCoT_To ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV32TFBarKgmTin ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV33TFBarKgmTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV34TFBarKgsTt ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV35TFBarKgsTt_To ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV36TFBarMtrTin ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV37TFBarMtrTin_To ;
      AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV95TFBarNumtint ;
      AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV96TFBarNumtint_To ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV38TFBarMtsTt ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV39TFBarMtsTt_To ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV40TFBarMaqTin ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV41TFBarMaqTin_Sel ;
      AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV42TFBarVolTin ;
      AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV43TFBarVolTin_To ;
      AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV93TFBarNumEny ;
      AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV94TFBarNumEny_To ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV44TFBarDispCli ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV45TFBarDispCli_Sel ;
      AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV46TFBarNumAna ;
      AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV47TFBarNumAna_To ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV101TFCosteInicial ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV102TFCosteInicial_To ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV103TFCosteAnyadidas ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV104TFCosteAnyadidas_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV75BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
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
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV68Fec1 ,
                                           AV69Fec3 ,
                                           Integer.valueOf(AV70PCliCod) ,
                                           Integer.valueOf(AV71CliCodP) ,
                                           Integer.valueOf(AV72PBarCod) ,
                                           Integer.valueOf(AV73Barcodp) ,
                                           Byte.valueOf(AV74PBarCodReo) ,
                                           AV76PBarCodPar ,
                                           AV77BarCodParP ,
                                           AV78PSerie ,
                                           AV79SerieP ,
                                           AV80PColor ,
                                           AV81ColorP ,
                                           Integer.valueOf(AV82PColNum) ,
                                           Integer.valueOf(AV83ColNumP) ,
                                           A6634BarRecAcb ,
                                           AV86HreRacab ,
                                           AV87MaqCodi ,
                                           AV88MaqCod3 ,
                                           Short.valueOf(AV97TipArtCodfrom) ,
                                           Short.valueOf(AV98TipArtCodto) ,
                                           AV99SoloAd ,
                                           AV100CorAdi ,
                                           A14200CosteAnyad ,
                                           A396EmprCod ,
                                           AV67Emprcod ,
                                           AV84DispCli1 ,
                                           AV85DispCli3 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV128Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YK10 */
      pr_default.execute(8, new Object[] {AV84DispCli1, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV68Fec1, AV69Fec3, Integer.valueOf(AV70PCliCod), Integer.valueOf(AV71CliCodP), Integer.valueOf(AV72PBarCod), Integer.valueOf(AV73Barcodp), Byte.valueOf(AV74PBarCodReo), AV76PBarCodPar, AV77BarCodParP, AV78PSerie, AV79SerieP, AV80PColor, AV81ColorP, Integer.valueOf(AV82PColNum), Integer.valueOf(AV83ColNumP), AV86HreRacab, AV86HreRacab, AV87MaqCodi, AV88MaqCod3, Short.valueOf(AV97TipArtCodfrom), Short.valueOf(AV98TipArtCodto), AV99SoloAd, AV99SoloAd, AV100CorAdi, AV99SoloAd, AV100CorAdi, AV67Emprcod, AV85DispCli3, AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV126Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV128Formulaciontinte_consultadesdelcontids_14_tfclinom, AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV75BarCodReoP)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8YK17 = false ;
         A396EmprCod = P08YK10_A396EmprCod[0] ;
         A11762BarDispCli = P08YK10_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YK10_n11762BarDispCli[0] ;
         A6634BarRecAcb = P08YK10_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YK10_n6634BarRecAcb[0] ;
         A14200CosteAnyad = P08YK10_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YK10_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YK10_n3650BarNumAna[0] ;
         A1946BarVolTin = P08YK10_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YK10_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YK10_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YK10_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YK10_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YK10_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YK10_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YK10_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YK10_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YK10_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YK10_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YK10_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YK10_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YK10_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YK10_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YK10_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YK10_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YK10_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YK10_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YK10_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YK10_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YK10_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YK10_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YK10_n1936BarSerTin[0] ;
         A279CliNom = P08YK10_A279CliNom[0] ;
         A252CliCod = P08YK10_A252CliCod[0] ;
         A1929EstTinNr = P08YK10_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YK10_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YK10_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YK10_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YK10_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YK10_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YK10_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YK10_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YK10_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK10_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YK10_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK10_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YK10_A1935BarParTin[0] ;
         n1935BarParTin = P08YK10_n1935BarParTin[0] ;
         A1934BarReoTin = P08YK10_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YK10_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YK10_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YK10_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YK10_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YK10_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YK10_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YK10_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YK10_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YK10_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YK10_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YK10_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YK10_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YK10_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YK10_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YK10_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YK10_n13962BarArtTinD[0] ;
         A279CliNom = P08YK10_A279CliNom[0] ;
         A13967BarNumEny = P08YK10_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YK10_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV60count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08YK10_A11762BarDispCli[0], A11762BarDispCli) == 0 ) )
         {
            brk8YK17 = false ;
            A396EmprCod = P08YK10_A396EmprCod[0] ;
            A1929EstTinNr = P08YK10_A1929EstTinNr[0] ;
            A3646EstTinAny = P08YK10_A3646EstTinAny[0] ;
            A3647EstTinMes = P08YK10_A3647EstTinMes[0] ;
            A3648EstTinDia = P08YK10_A3648EstTinDia[0] ;
            AV60count = (long)(AV60count+1) ;
            brk8YK17 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A11762BarDispCli)==0) )
         {
            AV52Option = A11762BarDispCli ;
            AV53Options.add(AV52Option, 0);
            AV58OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV60count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV53Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8YK17 )
         {
            brk8YK17 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadesdelcontigetfilterdata.this.AV54OptionsJson;
      this.aP4[0] = consultadesdelcontigetfilterdata.this.AV57OptionsDescJson;
      this.aP5[0] = consultadesdelcontigetfilterdata.this.AV59OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV54OptionsJson = "" ;
      AV57OptionsDescJson = "" ;
      AV59OptionIndexesJson = "" ;
      AV53Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV61Session = httpContext.getWebSession();
      AV63GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV64GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFEstFecCier = GXutil.nullDate() ;
      AV109TFBarParTin = "" ;
      AV110TFBarParTin_Sel = "" ;
      AV16TFBarAgrLot = "" ;
      AV17TFBarAgrLot_Sel = "" ;
      AV20TFCliNom = "" ;
      AV21TFCliNom_Sel = "" ;
      AV22TFBarSerTin = "" ;
      AV23TFBarSerTin_Sel = "" ;
      AV24TFBarDscTin = "" ;
      AV25TFBarDscTin_Sel = "" ;
      AV91TFBarArtTinD = "" ;
      AV92TFBarArtTinD_Sel = "" ;
      AV26TFBarColNoT = "" ;
      AV27TFBarColNoT_Sel = "" ;
      AV32TFBarKgmTin = DecimalUtil.ZERO ;
      AV33TFBarKgmTin_To = DecimalUtil.ZERO ;
      AV34TFBarKgsTt = DecimalUtil.ZERO ;
      AV35TFBarKgsTt_To = DecimalUtil.ZERO ;
      AV36TFBarMtrTin = DecimalUtil.ZERO ;
      AV37TFBarMtrTin_To = DecimalUtil.ZERO ;
      AV38TFBarMtsTt = DecimalUtil.ZERO ;
      AV39TFBarMtsTt_To = DecimalUtil.ZERO ;
      AV40TFBarMaqTin = "" ;
      AV41TFBarMaqTin_Sel = "" ;
      AV44TFBarDispCli = "" ;
      AV45TFBarDispCli_Sel = "" ;
      AV101TFCosteInicial = DecimalUtil.ZERO ;
      AV102TFCosteInicial_To = DecimalUtil.ZERO ;
      AV103TFCosteAnyadidas = DecimalUtil.ZERO ;
      AV104TFCosteAnyadidas_To = DecimalUtil.ZERO ;
      AV67Emprcod = "" ;
      AV68Fec1 = GXutil.nullDate() ;
      AV69Fec3 = GXutil.nullDate() ;
      AV76PBarCodPar = "" ;
      AV77BarCodParP = "" ;
      AV78PSerie = "" ;
      AV79SerieP = "" ;
      AV80PColor = "" ;
      AV81ColorP = "" ;
      AV84DispCli1 = "" ;
      AV85DispCli3 = "" ;
      AV86HreRacab = "" ;
      AV87MaqCodi = "" ;
      AV88MaqCod3 = "" ;
      AV99SoloAd = "" ;
      AV100CorAdi = "" ;
      A1935BarParTin = "" ;
      AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier = GXutil.nullDate() ;
      AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = "" ;
      AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = "" ;
      AV128Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = "" ;
      AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = "" ;
      AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = "" ;
      AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = "" ;
      AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = "" ;
      AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = DecimalUtil.ZERO ;
      AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = DecimalUtil.ZERO ;
      AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = DecimalUtil.ZERO ;
      AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = DecimalUtil.ZERO ;
      AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = DecimalUtil.ZERO ;
      AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = DecimalUtil.ZERO ;
      AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = DecimalUtil.ZERO ;
      AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = DecimalUtil.ZERO ;
      AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = "" ;
      AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = "" ;
      AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = DecimalUtil.ZERO ;
      AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = DecimalUtil.ZERO ;
      AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = DecimalUtil.ZERO ;
      AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = DecimalUtil.ZERO ;
      lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      scmdbuf = "" ;
      lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      lV128Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
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
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A13962BarArtTinD = "" ;
      A6634BarRecAcb = "" ;
      A14200CosteAnyad = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08YK2_A494ForSer = new String[] {""} ;
      P08YK2_A482ForColNom = new String[] {""} ;
      P08YK2_A483ForColNum = new int[1] ;
      P08YK2_A831TipColCod = new byte[1] ;
      P08YK2_A829TipArtCod = new short[1] ;
      P08YK2_A396EmprCod = new String[] {""} ;
      P08YK2_A6634BarRecAcb = new String[] {""} ;
      P08YK2_n6634BarRecAcb = new boolean[] {false} ;
      P08YK2_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_A3650BarNumAna = new short[1] ;
      P08YK2_n3650BarNumAna = new boolean[] {false} ;
      P08YK2_A11762BarDispCli = new String[] {""} ;
      P08YK2_n11762BarDispCli = new boolean[] {false} ;
      P08YK2_A1946BarVolTin = new int[1] ;
      P08YK2_n1946BarVolTin = new boolean[] {false} ;
      P08YK2_A1945BarMaqTin = new String[] {""} ;
      P08YK2_n1945BarMaqTin = new boolean[] {false} ;
      P08YK2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n12993BarMtsTt = new boolean[] {false} ;
      P08YK2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n1948BarMtrTin = new boolean[] {false} ;
      P08YK2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n8563BarKgsTt = new boolean[] {false} ;
      P08YK2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n1947BarKgmTin = new boolean[] {false} ;
      P08YK2_A1942BarTipCoT = new byte[1] ;
      P08YK2_n1942BarTipCoT = new boolean[] {false} ;
      P08YK2_A1941BarColNuT = new int[1] ;
      P08YK2_n1941BarColNuT = new boolean[] {false} ;
      P08YK2_A1940BarColNoT = new String[] {""} ;
      P08YK2_n1940BarColNoT = new boolean[] {false} ;
      P08YK2_A1939BarArtTin = new short[1] ;
      P08YK2_n1939BarArtTin = new boolean[] {false} ;
      P08YK2_A1937BarDscTin = new String[] {""} ;
      P08YK2_n1937BarDscTin = new boolean[] {false} ;
      P08YK2_A1936BarSerTin = new String[] {""} ;
      P08YK2_n1936BarSerTin = new boolean[] {false} ;
      P08YK2_A279CliNom = new String[] {""} ;
      P08YK2_A252CliCod = new int[1] ;
      P08YK2_A1929EstTinNr = new short[1] ;
      P08YK2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n3656BarCosAD = new boolean[] {false} ;
      P08YK2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n3657BarCosAA = new boolean[] {false} ;
      P08YK2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n3706BarCosAnc = new boolean[] {false} ;
      P08YK2_A13967BarNumEny = new int[1] ;
      P08YK2_n13967BarNumEny = new boolean[] {false} ;
      P08YK2_A13962BarArtTinD = new String[] {""} ;
      P08YK2_n13962BarArtTinD = new boolean[] {false} ;
      P08YK2_A1935BarParTin = new String[] {""} ;
      P08YK2_n1935BarParTin = new boolean[] {false} ;
      P08YK2_A1934BarReoTin = new byte[1] ;
      P08YK2_n1934BarReoTin = new boolean[] {false} ;
      P08YK2_A1933BarCodTin = new int[1] ;
      P08YK2_n1933BarCodTin = new boolean[] {false} ;
      P08YK2_A2316BarAgrLot = new String[] {""} ;
      P08YK2_n2316BarAgrLot = new boolean[] {false} ;
      P08YK2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n3705BarCosCol = new boolean[] {false} ;
      P08YK2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n3658BarCosPA = new boolean[] {false} ;
      P08YK2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK2_n3654BarCosPD = new boolean[] {false} ;
      P08YK2_A3646EstTinAny = new short[1] ;
      P08YK2_A3647EstTinMes = new byte[1] ;
      P08YK2_A3648EstTinDia = new byte[1] ;
      A14199CosteInici = DecimalUtil.ZERO ;
      AV52Option = "" ;
      P08YK3_A494ForSer = new String[] {""} ;
      P08YK3_A482ForColNom = new String[] {""} ;
      P08YK3_A483ForColNum = new int[1] ;
      P08YK3_A831TipColCod = new byte[1] ;
      P08YK3_A829TipArtCod = new short[1] ;
      P08YK3_A396EmprCod = new String[] {""} ;
      P08YK3_A6634BarRecAcb = new String[] {""} ;
      P08YK3_n6634BarRecAcb = new boolean[] {false} ;
      P08YK3_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_A3650BarNumAna = new short[1] ;
      P08YK3_n3650BarNumAna = new boolean[] {false} ;
      P08YK3_A11762BarDispCli = new String[] {""} ;
      P08YK3_n11762BarDispCli = new boolean[] {false} ;
      P08YK3_A1946BarVolTin = new int[1] ;
      P08YK3_n1946BarVolTin = new boolean[] {false} ;
      P08YK3_A1945BarMaqTin = new String[] {""} ;
      P08YK3_n1945BarMaqTin = new boolean[] {false} ;
      P08YK3_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n12993BarMtsTt = new boolean[] {false} ;
      P08YK3_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n1948BarMtrTin = new boolean[] {false} ;
      P08YK3_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n8563BarKgsTt = new boolean[] {false} ;
      P08YK3_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n1947BarKgmTin = new boolean[] {false} ;
      P08YK3_A1942BarTipCoT = new byte[1] ;
      P08YK3_n1942BarTipCoT = new boolean[] {false} ;
      P08YK3_A1941BarColNuT = new int[1] ;
      P08YK3_n1941BarColNuT = new boolean[] {false} ;
      P08YK3_A1940BarColNoT = new String[] {""} ;
      P08YK3_n1940BarColNoT = new boolean[] {false} ;
      P08YK3_A1939BarArtTin = new short[1] ;
      P08YK3_n1939BarArtTin = new boolean[] {false} ;
      P08YK3_A1937BarDscTin = new String[] {""} ;
      P08YK3_n1937BarDscTin = new boolean[] {false} ;
      P08YK3_A1936BarSerTin = new String[] {""} ;
      P08YK3_n1936BarSerTin = new boolean[] {false} ;
      P08YK3_A279CliNom = new String[] {""} ;
      P08YK3_A252CliCod = new int[1] ;
      P08YK3_A1929EstTinNr = new short[1] ;
      P08YK3_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK3_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n3656BarCosAD = new boolean[] {false} ;
      P08YK3_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n3657BarCosAA = new boolean[] {false} ;
      P08YK3_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n3706BarCosAnc = new boolean[] {false} ;
      P08YK3_A13967BarNumEny = new int[1] ;
      P08YK3_n13967BarNumEny = new boolean[] {false} ;
      P08YK3_A13962BarArtTinD = new String[] {""} ;
      P08YK3_n13962BarArtTinD = new boolean[] {false} ;
      P08YK3_A1935BarParTin = new String[] {""} ;
      P08YK3_n1935BarParTin = new boolean[] {false} ;
      P08YK3_A1934BarReoTin = new byte[1] ;
      P08YK3_n1934BarReoTin = new boolean[] {false} ;
      P08YK3_A1933BarCodTin = new int[1] ;
      P08YK3_n1933BarCodTin = new boolean[] {false} ;
      P08YK3_A2316BarAgrLot = new String[] {""} ;
      P08YK3_n2316BarAgrLot = new boolean[] {false} ;
      P08YK3_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n3705BarCosCol = new boolean[] {false} ;
      P08YK3_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n3658BarCosPA = new boolean[] {false} ;
      P08YK3_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK3_n3654BarCosPD = new boolean[] {false} ;
      P08YK3_A3646EstTinAny = new short[1] ;
      P08YK3_A3647EstTinMes = new byte[1] ;
      P08YK3_A3648EstTinDia = new byte[1] ;
      P08YK4_A494ForSer = new String[] {""} ;
      P08YK4_A482ForColNom = new String[] {""} ;
      P08YK4_A483ForColNum = new int[1] ;
      P08YK4_A831TipColCod = new byte[1] ;
      P08YK4_A829TipArtCod = new short[1] ;
      P08YK4_A396EmprCod = new String[] {""} ;
      P08YK4_A279CliNom = new String[] {""} ;
      P08YK4_A6634BarRecAcb = new String[] {""} ;
      P08YK4_n6634BarRecAcb = new boolean[] {false} ;
      P08YK4_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_A3650BarNumAna = new short[1] ;
      P08YK4_n3650BarNumAna = new boolean[] {false} ;
      P08YK4_A11762BarDispCli = new String[] {""} ;
      P08YK4_n11762BarDispCli = new boolean[] {false} ;
      P08YK4_A1946BarVolTin = new int[1] ;
      P08YK4_n1946BarVolTin = new boolean[] {false} ;
      P08YK4_A1945BarMaqTin = new String[] {""} ;
      P08YK4_n1945BarMaqTin = new boolean[] {false} ;
      P08YK4_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n12993BarMtsTt = new boolean[] {false} ;
      P08YK4_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n1948BarMtrTin = new boolean[] {false} ;
      P08YK4_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n8563BarKgsTt = new boolean[] {false} ;
      P08YK4_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n1947BarKgmTin = new boolean[] {false} ;
      P08YK4_A1942BarTipCoT = new byte[1] ;
      P08YK4_n1942BarTipCoT = new boolean[] {false} ;
      P08YK4_A1941BarColNuT = new int[1] ;
      P08YK4_n1941BarColNuT = new boolean[] {false} ;
      P08YK4_A1940BarColNoT = new String[] {""} ;
      P08YK4_n1940BarColNoT = new boolean[] {false} ;
      P08YK4_A1939BarArtTin = new short[1] ;
      P08YK4_n1939BarArtTin = new boolean[] {false} ;
      P08YK4_A1937BarDscTin = new String[] {""} ;
      P08YK4_n1937BarDscTin = new boolean[] {false} ;
      P08YK4_A1936BarSerTin = new String[] {""} ;
      P08YK4_n1936BarSerTin = new boolean[] {false} ;
      P08YK4_A252CliCod = new int[1] ;
      P08YK4_A1929EstTinNr = new short[1] ;
      P08YK4_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK4_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n3656BarCosAD = new boolean[] {false} ;
      P08YK4_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n3657BarCosAA = new boolean[] {false} ;
      P08YK4_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n3706BarCosAnc = new boolean[] {false} ;
      P08YK4_A13967BarNumEny = new int[1] ;
      P08YK4_n13967BarNumEny = new boolean[] {false} ;
      P08YK4_A13962BarArtTinD = new String[] {""} ;
      P08YK4_n13962BarArtTinD = new boolean[] {false} ;
      P08YK4_A1935BarParTin = new String[] {""} ;
      P08YK4_n1935BarParTin = new boolean[] {false} ;
      P08YK4_A1934BarReoTin = new byte[1] ;
      P08YK4_n1934BarReoTin = new boolean[] {false} ;
      P08YK4_A1933BarCodTin = new int[1] ;
      P08YK4_n1933BarCodTin = new boolean[] {false} ;
      P08YK4_A2316BarAgrLot = new String[] {""} ;
      P08YK4_n2316BarAgrLot = new boolean[] {false} ;
      P08YK4_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n3705BarCosCol = new boolean[] {false} ;
      P08YK4_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n3658BarCosPA = new boolean[] {false} ;
      P08YK4_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK4_n3654BarCosPD = new boolean[] {false} ;
      P08YK4_A3646EstTinAny = new short[1] ;
      P08YK4_A3647EstTinMes = new byte[1] ;
      P08YK4_A3648EstTinDia = new byte[1] ;
      P08YK5_A494ForSer = new String[] {""} ;
      P08YK5_A482ForColNom = new String[] {""} ;
      P08YK5_A483ForColNum = new int[1] ;
      P08YK5_A831TipColCod = new byte[1] ;
      P08YK5_A829TipArtCod = new short[1] ;
      P08YK5_A396EmprCod = new String[] {""} ;
      P08YK5_A1936BarSerTin = new String[] {""} ;
      P08YK5_n1936BarSerTin = new boolean[] {false} ;
      P08YK5_A6634BarRecAcb = new String[] {""} ;
      P08YK5_n6634BarRecAcb = new boolean[] {false} ;
      P08YK5_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_A3650BarNumAna = new short[1] ;
      P08YK5_n3650BarNumAna = new boolean[] {false} ;
      P08YK5_A11762BarDispCli = new String[] {""} ;
      P08YK5_n11762BarDispCli = new boolean[] {false} ;
      P08YK5_A1946BarVolTin = new int[1] ;
      P08YK5_n1946BarVolTin = new boolean[] {false} ;
      P08YK5_A1945BarMaqTin = new String[] {""} ;
      P08YK5_n1945BarMaqTin = new boolean[] {false} ;
      P08YK5_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n12993BarMtsTt = new boolean[] {false} ;
      P08YK5_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n1948BarMtrTin = new boolean[] {false} ;
      P08YK5_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n8563BarKgsTt = new boolean[] {false} ;
      P08YK5_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n1947BarKgmTin = new boolean[] {false} ;
      P08YK5_A1942BarTipCoT = new byte[1] ;
      P08YK5_n1942BarTipCoT = new boolean[] {false} ;
      P08YK5_A1941BarColNuT = new int[1] ;
      P08YK5_n1941BarColNuT = new boolean[] {false} ;
      P08YK5_A1940BarColNoT = new String[] {""} ;
      P08YK5_n1940BarColNoT = new boolean[] {false} ;
      P08YK5_A1939BarArtTin = new short[1] ;
      P08YK5_n1939BarArtTin = new boolean[] {false} ;
      P08YK5_A1937BarDscTin = new String[] {""} ;
      P08YK5_n1937BarDscTin = new boolean[] {false} ;
      P08YK5_A279CliNom = new String[] {""} ;
      P08YK5_A252CliCod = new int[1] ;
      P08YK5_A1929EstTinNr = new short[1] ;
      P08YK5_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK5_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n3656BarCosAD = new boolean[] {false} ;
      P08YK5_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n3657BarCosAA = new boolean[] {false} ;
      P08YK5_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n3706BarCosAnc = new boolean[] {false} ;
      P08YK5_A13967BarNumEny = new int[1] ;
      P08YK5_n13967BarNumEny = new boolean[] {false} ;
      P08YK5_A13962BarArtTinD = new String[] {""} ;
      P08YK5_n13962BarArtTinD = new boolean[] {false} ;
      P08YK5_A1935BarParTin = new String[] {""} ;
      P08YK5_n1935BarParTin = new boolean[] {false} ;
      P08YK5_A1934BarReoTin = new byte[1] ;
      P08YK5_n1934BarReoTin = new boolean[] {false} ;
      P08YK5_A1933BarCodTin = new int[1] ;
      P08YK5_n1933BarCodTin = new boolean[] {false} ;
      P08YK5_A2316BarAgrLot = new String[] {""} ;
      P08YK5_n2316BarAgrLot = new boolean[] {false} ;
      P08YK5_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n3705BarCosCol = new boolean[] {false} ;
      P08YK5_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n3658BarCosPA = new boolean[] {false} ;
      P08YK5_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK5_n3654BarCosPD = new boolean[] {false} ;
      P08YK5_A3646EstTinAny = new short[1] ;
      P08YK5_A3647EstTinMes = new byte[1] ;
      P08YK5_A3648EstTinDia = new byte[1] ;
      P08YK6_A494ForSer = new String[] {""} ;
      P08YK6_A482ForColNom = new String[] {""} ;
      P08YK6_A483ForColNum = new int[1] ;
      P08YK6_A831TipColCod = new byte[1] ;
      P08YK6_A829TipArtCod = new short[1] ;
      P08YK6_A396EmprCod = new String[] {""} ;
      P08YK6_A1937BarDscTin = new String[] {""} ;
      P08YK6_n1937BarDscTin = new boolean[] {false} ;
      P08YK6_A6634BarRecAcb = new String[] {""} ;
      P08YK6_n6634BarRecAcb = new boolean[] {false} ;
      P08YK6_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_A3650BarNumAna = new short[1] ;
      P08YK6_n3650BarNumAna = new boolean[] {false} ;
      P08YK6_A11762BarDispCli = new String[] {""} ;
      P08YK6_n11762BarDispCli = new boolean[] {false} ;
      P08YK6_A1946BarVolTin = new int[1] ;
      P08YK6_n1946BarVolTin = new boolean[] {false} ;
      P08YK6_A1945BarMaqTin = new String[] {""} ;
      P08YK6_n1945BarMaqTin = new boolean[] {false} ;
      P08YK6_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n12993BarMtsTt = new boolean[] {false} ;
      P08YK6_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n1948BarMtrTin = new boolean[] {false} ;
      P08YK6_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n8563BarKgsTt = new boolean[] {false} ;
      P08YK6_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n1947BarKgmTin = new boolean[] {false} ;
      P08YK6_A1942BarTipCoT = new byte[1] ;
      P08YK6_n1942BarTipCoT = new boolean[] {false} ;
      P08YK6_A1941BarColNuT = new int[1] ;
      P08YK6_n1941BarColNuT = new boolean[] {false} ;
      P08YK6_A1940BarColNoT = new String[] {""} ;
      P08YK6_n1940BarColNoT = new boolean[] {false} ;
      P08YK6_A1939BarArtTin = new short[1] ;
      P08YK6_n1939BarArtTin = new boolean[] {false} ;
      P08YK6_A1936BarSerTin = new String[] {""} ;
      P08YK6_n1936BarSerTin = new boolean[] {false} ;
      P08YK6_A279CliNom = new String[] {""} ;
      P08YK6_A252CliCod = new int[1] ;
      P08YK6_A1929EstTinNr = new short[1] ;
      P08YK6_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK6_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n3656BarCosAD = new boolean[] {false} ;
      P08YK6_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n3657BarCosAA = new boolean[] {false} ;
      P08YK6_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n3706BarCosAnc = new boolean[] {false} ;
      P08YK6_A13967BarNumEny = new int[1] ;
      P08YK6_n13967BarNumEny = new boolean[] {false} ;
      P08YK6_A13962BarArtTinD = new String[] {""} ;
      P08YK6_n13962BarArtTinD = new boolean[] {false} ;
      P08YK6_A1935BarParTin = new String[] {""} ;
      P08YK6_n1935BarParTin = new boolean[] {false} ;
      P08YK6_A1934BarReoTin = new byte[1] ;
      P08YK6_n1934BarReoTin = new boolean[] {false} ;
      P08YK6_A1933BarCodTin = new int[1] ;
      P08YK6_n1933BarCodTin = new boolean[] {false} ;
      P08YK6_A2316BarAgrLot = new String[] {""} ;
      P08YK6_n2316BarAgrLot = new boolean[] {false} ;
      P08YK6_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n3705BarCosCol = new boolean[] {false} ;
      P08YK6_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n3658BarCosPA = new boolean[] {false} ;
      P08YK6_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK6_n3654BarCosPD = new boolean[] {false} ;
      P08YK6_A3646EstTinAny = new short[1] ;
      P08YK6_A3647EstTinMes = new byte[1] ;
      P08YK6_A3648EstTinDia = new byte[1] ;
      P08YK7_A494ForSer = new String[] {""} ;
      P08YK7_A482ForColNom = new String[] {""} ;
      P08YK7_A483ForColNum = new int[1] ;
      P08YK7_A831TipColCod = new byte[1] ;
      P08YK7_A829TipArtCod = new short[1] ;
      P08YK7_A6634BarRecAcb = new String[] {""} ;
      P08YK7_n6634BarRecAcb = new boolean[] {false} ;
      P08YK7_A396EmprCod = new String[] {""} ;
      P08YK7_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_A3650BarNumAna = new short[1] ;
      P08YK7_n3650BarNumAna = new boolean[] {false} ;
      P08YK7_A11762BarDispCli = new String[] {""} ;
      P08YK7_n11762BarDispCli = new boolean[] {false} ;
      P08YK7_A1946BarVolTin = new int[1] ;
      P08YK7_n1946BarVolTin = new boolean[] {false} ;
      P08YK7_A1945BarMaqTin = new String[] {""} ;
      P08YK7_n1945BarMaqTin = new boolean[] {false} ;
      P08YK7_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n12993BarMtsTt = new boolean[] {false} ;
      P08YK7_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n1948BarMtrTin = new boolean[] {false} ;
      P08YK7_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n8563BarKgsTt = new boolean[] {false} ;
      P08YK7_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n1947BarKgmTin = new boolean[] {false} ;
      P08YK7_A1942BarTipCoT = new byte[1] ;
      P08YK7_n1942BarTipCoT = new boolean[] {false} ;
      P08YK7_A1941BarColNuT = new int[1] ;
      P08YK7_n1941BarColNuT = new boolean[] {false} ;
      P08YK7_A1940BarColNoT = new String[] {""} ;
      P08YK7_n1940BarColNoT = new boolean[] {false} ;
      P08YK7_A1939BarArtTin = new short[1] ;
      P08YK7_n1939BarArtTin = new boolean[] {false} ;
      P08YK7_A1937BarDscTin = new String[] {""} ;
      P08YK7_n1937BarDscTin = new boolean[] {false} ;
      P08YK7_A1936BarSerTin = new String[] {""} ;
      P08YK7_n1936BarSerTin = new boolean[] {false} ;
      P08YK7_A279CliNom = new String[] {""} ;
      P08YK7_A252CliCod = new int[1] ;
      P08YK7_A1929EstTinNr = new short[1] ;
      P08YK7_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK7_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n3656BarCosAD = new boolean[] {false} ;
      P08YK7_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n3657BarCosAA = new boolean[] {false} ;
      P08YK7_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n3706BarCosAnc = new boolean[] {false} ;
      P08YK7_A13967BarNumEny = new int[1] ;
      P08YK7_n13967BarNumEny = new boolean[] {false} ;
      P08YK7_A13962BarArtTinD = new String[] {""} ;
      P08YK7_n13962BarArtTinD = new boolean[] {false} ;
      P08YK7_A1935BarParTin = new String[] {""} ;
      P08YK7_n1935BarParTin = new boolean[] {false} ;
      P08YK7_A1934BarReoTin = new byte[1] ;
      P08YK7_n1934BarReoTin = new boolean[] {false} ;
      P08YK7_A1933BarCodTin = new int[1] ;
      P08YK7_n1933BarCodTin = new boolean[] {false} ;
      P08YK7_A2316BarAgrLot = new String[] {""} ;
      P08YK7_n2316BarAgrLot = new boolean[] {false} ;
      P08YK7_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n3705BarCosCol = new boolean[] {false} ;
      P08YK7_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n3658BarCosPA = new boolean[] {false} ;
      P08YK7_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK7_n3654BarCosPD = new boolean[] {false} ;
      P08YK7_A3646EstTinAny = new short[1] ;
      P08YK7_A3647EstTinMes = new byte[1] ;
      P08YK7_A3648EstTinDia = new byte[1] ;
      P08YK8_A494ForSer = new String[] {""} ;
      P08YK8_A482ForColNom = new String[] {""} ;
      P08YK8_A483ForColNum = new int[1] ;
      P08YK8_A831TipColCod = new byte[1] ;
      P08YK8_A829TipArtCod = new short[1] ;
      P08YK8_A396EmprCod = new String[] {""} ;
      P08YK8_A1940BarColNoT = new String[] {""} ;
      P08YK8_n1940BarColNoT = new boolean[] {false} ;
      P08YK8_A6634BarRecAcb = new String[] {""} ;
      P08YK8_n6634BarRecAcb = new boolean[] {false} ;
      P08YK8_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_A3650BarNumAna = new short[1] ;
      P08YK8_n3650BarNumAna = new boolean[] {false} ;
      P08YK8_A11762BarDispCli = new String[] {""} ;
      P08YK8_n11762BarDispCli = new boolean[] {false} ;
      P08YK8_A1946BarVolTin = new int[1] ;
      P08YK8_n1946BarVolTin = new boolean[] {false} ;
      P08YK8_A1945BarMaqTin = new String[] {""} ;
      P08YK8_n1945BarMaqTin = new boolean[] {false} ;
      P08YK8_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n12993BarMtsTt = new boolean[] {false} ;
      P08YK8_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n1948BarMtrTin = new boolean[] {false} ;
      P08YK8_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n8563BarKgsTt = new boolean[] {false} ;
      P08YK8_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n1947BarKgmTin = new boolean[] {false} ;
      P08YK8_A1942BarTipCoT = new byte[1] ;
      P08YK8_n1942BarTipCoT = new boolean[] {false} ;
      P08YK8_A1941BarColNuT = new int[1] ;
      P08YK8_n1941BarColNuT = new boolean[] {false} ;
      P08YK8_A1939BarArtTin = new short[1] ;
      P08YK8_n1939BarArtTin = new boolean[] {false} ;
      P08YK8_A1937BarDscTin = new String[] {""} ;
      P08YK8_n1937BarDscTin = new boolean[] {false} ;
      P08YK8_A1936BarSerTin = new String[] {""} ;
      P08YK8_n1936BarSerTin = new boolean[] {false} ;
      P08YK8_A279CliNom = new String[] {""} ;
      P08YK8_A252CliCod = new int[1] ;
      P08YK8_A1929EstTinNr = new short[1] ;
      P08YK8_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK8_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n3656BarCosAD = new boolean[] {false} ;
      P08YK8_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n3657BarCosAA = new boolean[] {false} ;
      P08YK8_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n3706BarCosAnc = new boolean[] {false} ;
      P08YK8_A13967BarNumEny = new int[1] ;
      P08YK8_n13967BarNumEny = new boolean[] {false} ;
      P08YK8_A13962BarArtTinD = new String[] {""} ;
      P08YK8_n13962BarArtTinD = new boolean[] {false} ;
      P08YK8_A1935BarParTin = new String[] {""} ;
      P08YK8_n1935BarParTin = new boolean[] {false} ;
      P08YK8_A1934BarReoTin = new byte[1] ;
      P08YK8_n1934BarReoTin = new boolean[] {false} ;
      P08YK8_A1933BarCodTin = new int[1] ;
      P08YK8_n1933BarCodTin = new boolean[] {false} ;
      P08YK8_A2316BarAgrLot = new String[] {""} ;
      P08YK8_n2316BarAgrLot = new boolean[] {false} ;
      P08YK8_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n3705BarCosCol = new boolean[] {false} ;
      P08YK8_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n3658BarCosPA = new boolean[] {false} ;
      P08YK8_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK8_n3654BarCosPD = new boolean[] {false} ;
      P08YK8_A3646EstTinAny = new short[1] ;
      P08YK8_A3647EstTinMes = new byte[1] ;
      P08YK8_A3648EstTinDia = new byte[1] ;
      P08YK9_A494ForSer = new String[] {""} ;
      P08YK9_A482ForColNom = new String[] {""} ;
      P08YK9_A483ForColNum = new int[1] ;
      P08YK9_A831TipColCod = new byte[1] ;
      P08YK9_A829TipArtCod = new short[1] ;
      P08YK9_A396EmprCod = new String[] {""} ;
      P08YK9_A1945BarMaqTin = new String[] {""} ;
      P08YK9_n1945BarMaqTin = new boolean[] {false} ;
      P08YK9_A6634BarRecAcb = new String[] {""} ;
      P08YK9_n6634BarRecAcb = new boolean[] {false} ;
      P08YK9_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_A3650BarNumAna = new short[1] ;
      P08YK9_n3650BarNumAna = new boolean[] {false} ;
      P08YK9_A11762BarDispCli = new String[] {""} ;
      P08YK9_n11762BarDispCli = new boolean[] {false} ;
      P08YK9_A1946BarVolTin = new int[1] ;
      P08YK9_n1946BarVolTin = new boolean[] {false} ;
      P08YK9_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n12993BarMtsTt = new boolean[] {false} ;
      P08YK9_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n1948BarMtrTin = new boolean[] {false} ;
      P08YK9_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n8563BarKgsTt = new boolean[] {false} ;
      P08YK9_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n1947BarKgmTin = new boolean[] {false} ;
      P08YK9_A1942BarTipCoT = new byte[1] ;
      P08YK9_n1942BarTipCoT = new boolean[] {false} ;
      P08YK9_A1941BarColNuT = new int[1] ;
      P08YK9_n1941BarColNuT = new boolean[] {false} ;
      P08YK9_A1940BarColNoT = new String[] {""} ;
      P08YK9_n1940BarColNoT = new boolean[] {false} ;
      P08YK9_A1939BarArtTin = new short[1] ;
      P08YK9_n1939BarArtTin = new boolean[] {false} ;
      P08YK9_A1937BarDscTin = new String[] {""} ;
      P08YK9_n1937BarDscTin = new boolean[] {false} ;
      P08YK9_A1936BarSerTin = new String[] {""} ;
      P08YK9_n1936BarSerTin = new boolean[] {false} ;
      P08YK9_A279CliNom = new String[] {""} ;
      P08YK9_A252CliCod = new int[1] ;
      P08YK9_A1929EstTinNr = new short[1] ;
      P08YK9_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK9_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n3656BarCosAD = new boolean[] {false} ;
      P08YK9_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n3657BarCosAA = new boolean[] {false} ;
      P08YK9_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n3706BarCosAnc = new boolean[] {false} ;
      P08YK9_A13967BarNumEny = new int[1] ;
      P08YK9_n13967BarNumEny = new boolean[] {false} ;
      P08YK9_A13962BarArtTinD = new String[] {""} ;
      P08YK9_n13962BarArtTinD = new boolean[] {false} ;
      P08YK9_A1935BarParTin = new String[] {""} ;
      P08YK9_n1935BarParTin = new boolean[] {false} ;
      P08YK9_A1934BarReoTin = new byte[1] ;
      P08YK9_n1934BarReoTin = new boolean[] {false} ;
      P08YK9_A1933BarCodTin = new int[1] ;
      P08YK9_n1933BarCodTin = new boolean[] {false} ;
      P08YK9_A2316BarAgrLot = new String[] {""} ;
      P08YK9_n2316BarAgrLot = new boolean[] {false} ;
      P08YK9_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n3705BarCosCol = new boolean[] {false} ;
      P08YK9_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n3658BarCosPA = new boolean[] {false} ;
      P08YK9_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK9_n3654BarCosPD = new boolean[] {false} ;
      P08YK9_A3646EstTinAny = new short[1] ;
      P08YK9_A3647EstTinMes = new byte[1] ;
      P08YK9_A3648EstTinDia = new byte[1] ;
      P08YK10_A494ForSer = new String[] {""} ;
      P08YK10_A482ForColNom = new String[] {""} ;
      P08YK10_A483ForColNum = new int[1] ;
      P08YK10_A831TipColCod = new byte[1] ;
      P08YK10_A829TipArtCod = new short[1] ;
      P08YK10_A396EmprCod = new String[] {""} ;
      P08YK10_A11762BarDispCli = new String[] {""} ;
      P08YK10_n11762BarDispCli = new boolean[] {false} ;
      P08YK10_A6634BarRecAcb = new String[] {""} ;
      P08YK10_n6634BarRecAcb = new boolean[] {false} ;
      P08YK10_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_A3650BarNumAna = new short[1] ;
      P08YK10_n3650BarNumAna = new boolean[] {false} ;
      P08YK10_A1946BarVolTin = new int[1] ;
      P08YK10_n1946BarVolTin = new boolean[] {false} ;
      P08YK10_A1945BarMaqTin = new String[] {""} ;
      P08YK10_n1945BarMaqTin = new boolean[] {false} ;
      P08YK10_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n12993BarMtsTt = new boolean[] {false} ;
      P08YK10_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n1948BarMtrTin = new boolean[] {false} ;
      P08YK10_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n8563BarKgsTt = new boolean[] {false} ;
      P08YK10_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n1947BarKgmTin = new boolean[] {false} ;
      P08YK10_A1942BarTipCoT = new byte[1] ;
      P08YK10_n1942BarTipCoT = new boolean[] {false} ;
      P08YK10_A1941BarColNuT = new int[1] ;
      P08YK10_n1941BarColNuT = new boolean[] {false} ;
      P08YK10_A1940BarColNoT = new String[] {""} ;
      P08YK10_n1940BarColNoT = new boolean[] {false} ;
      P08YK10_A1939BarArtTin = new short[1] ;
      P08YK10_n1939BarArtTin = new boolean[] {false} ;
      P08YK10_A1937BarDscTin = new String[] {""} ;
      P08YK10_n1937BarDscTin = new boolean[] {false} ;
      P08YK10_A1936BarSerTin = new String[] {""} ;
      P08YK10_n1936BarSerTin = new boolean[] {false} ;
      P08YK10_A279CliNom = new String[] {""} ;
      P08YK10_A252CliCod = new int[1] ;
      P08YK10_A1929EstTinNr = new short[1] ;
      P08YK10_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YK10_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n3656BarCosAD = new boolean[] {false} ;
      P08YK10_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n3657BarCosAA = new boolean[] {false} ;
      P08YK10_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n3706BarCosAnc = new boolean[] {false} ;
      P08YK10_A13967BarNumEny = new int[1] ;
      P08YK10_n13967BarNumEny = new boolean[] {false} ;
      P08YK10_A13962BarArtTinD = new String[] {""} ;
      P08YK10_n13962BarArtTinD = new boolean[] {false} ;
      P08YK10_A1935BarParTin = new String[] {""} ;
      P08YK10_n1935BarParTin = new boolean[] {false} ;
      P08YK10_A1934BarReoTin = new byte[1] ;
      P08YK10_n1934BarReoTin = new boolean[] {false} ;
      P08YK10_A1933BarCodTin = new int[1] ;
      P08YK10_n1933BarCodTin = new boolean[] {false} ;
      P08YK10_A2316BarAgrLot = new String[] {""} ;
      P08YK10_n2316BarAgrLot = new boolean[] {false} ;
      P08YK10_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n3705BarCosCol = new boolean[] {false} ;
      P08YK10_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n3658BarCosPA = new boolean[] {false} ;
      P08YK10_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YK10_n3654BarCosPD = new boolean[] {false} ;
      P08YK10_A3646EstTinAny = new short[1] ;
      P08YK10_A3647EstTinMes = new byte[1] ;
      P08YK10_A3648EstTinDia = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelcontigetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08YK2_A494ForSer, P08YK2_A482ForColNom, P08YK2_A483ForColNum, P08YK2_A831TipColCod, P08YK2_A829TipArtCod, P08YK2_A396EmprCod, P08YK2_A6634BarRecAcb, P08YK2_n6634BarRecAcb, P08YK2_A14200CosteAnyad, P08YK2_A3650BarNumAna,
            P08YK2_n3650BarNumAna, P08YK2_A11762BarDispCli, P08YK2_n11762BarDispCli, P08YK2_A1946BarVolTin, P08YK2_n1946BarVolTin, P08YK2_A1945BarMaqTin, P08YK2_n1945BarMaqTin, P08YK2_A12993BarMtsTt, P08YK2_n12993BarMtsTt, P08YK2_A1948BarMtrTin,
            P08YK2_n1948BarMtrTin, P08YK2_A8563BarKgsTt, P08YK2_n8563BarKgsTt, P08YK2_A1947BarKgmTin, P08YK2_n1947BarKgmTin, P08YK2_A1942BarTipCoT, P08YK2_n1942BarTipCoT, P08YK2_A1941BarColNuT, P08YK2_n1941BarColNuT, P08YK2_A1940BarColNoT,
            P08YK2_n1940BarColNoT, P08YK2_A1939BarArtTin, P08YK2_n1939BarArtTin, P08YK2_A1937BarDscTin, P08YK2_n1937BarDscTin, P08YK2_A1936BarSerTin, P08YK2_n1936BarSerTin, P08YK2_A279CliNom, P08YK2_A252CliCod, P08YK2_A1929EstTinNr,
            P08YK2_A13759EstFecCier, P08YK2_A3656BarCosAD, P08YK2_n3656BarCosAD, P08YK2_A3657BarCosAA, P08YK2_n3657BarCosAA, P08YK2_A3706BarCosAnc, P08YK2_n3706BarCosAnc, P08YK2_A13967BarNumEny, P08YK2_n13967BarNumEny, P08YK2_A13962BarArtTinD,
            P08YK2_n13962BarArtTinD, P08YK2_A1935BarParTin, P08YK2_n1935BarParTin, P08YK2_A1934BarReoTin, P08YK2_n1934BarReoTin, P08YK2_A1933BarCodTin, P08YK2_n1933BarCodTin, P08YK2_A2316BarAgrLot, P08YK2_n2316BarAgrLot, P08YK2_A3705BarCosCol,
            P08YK2_n3705BarCosCol, P08YK2_A3658BarCosPA, P08YK2_n3658BarCosPA, P08YK2_A3654BarCosPD, P08YK2_n3654BarCosPD, P08YK2_A3646EstTinAny, P08YK2_A3647EstTinMes, P08YK2_A3648EstTinDia
            }
            , new Object[] {
            P08YK3_A494ForSer, P08YK3_A482ForColNom, P08YK3_A483ForColNum, P08YK3_A831TipColCod, P08YK3_A829TipArtCod, P08YK3_A396EmprCod, P08YK3_A6634BarRecAcb, P08YK3_n6634BarRecAcb, P08YK3_A14200CosteAnyad, P08YK3_A3650BarNumAna,
            P08YK3_n3650BarNumAna, P08YK3_A11762BarDispCli, P08YK3_n11762BarDispCli, P08YK3_A1946BarVolTin, P08YK3_n1946BarVolTin, P08YK3_A1945BarMaqTin, P08YK3_n1945BarMaqTin, P08YK3_A12993BarMtsTt, P08YK3_n12993BarMtsTt, P08YK3_A1948BarMtrTin,
            P08YK3_n1948BarMtrTin, P08YK3_A8563BarKgsTt, P08YK3_n8563BarKgsTt, P08YK3_A1947BarKgmTin, P08YK3_n1947BarKgmTin, P08YK3_A1942BarTipCoT, P08YK3_n1942BarTipCoT, P08YK3_A1941BarColNuT, P08YK3_n1941BarColNuT, P08YK3_A1940BarColNoT,
            P08YK3_n1940BarColNoT, P08YK3_A1939BarArtTin, P08YK3_n1939BarArtTin, P08YK3_A1937BarDscTin, P08YK3_n1937BarDscTin, P08YK3_A1936BarSerTin, P08YK3_n1936BarSerTin, P08YK3_A279CliNom, P08YK3_A252CliCod, P08YK3_A1929EstTinNr,
            P08YK3_A13759EstFecCier, P08YK3_A3656BarCosAD, P08YK3_n3656BarCosAD, P08YK3_A3657BarCosAA, P08YK3_n3657BarCosAA, P08YK3_A3706BarCosAnc, P08YK3_n3706BarCosAnc, P08YK3_A13967BarNumEny, P08YK3_n13967BarNumEny, P08YK3_A13962BarArtTinD,
            P08YK3_n13962BarArtTinD, P08YK3_A1935BarParTin, P08YK3_n1935BarParTin, P08YK3_A1934BarReoTin, P08YK3_n1934BarReoTin, P08YK3_A1933BarCodTin, P08YK3_n1933BarCodTin, P08YK3_A2316BarAgrLot, P08YK3_n2316BarAgrLot, P08YK3_A3705BarCosCol,
            P08YK3_n3705BarCosCol, P08YK3_A3658BarCosPA, P08YK3_n3658BarCosPA, P08YK3_A3654BarCosPD, P08YK3_n3654BarCosPD, P08YK3_A3646EstTinAny, P08YK3_A3647EstTinMes, P08YK3_A3648EstTinDia
            }
            , new Object[] {
            P08YK4_A494ForSer, P08YK4_A482ForColNom, P08YK4_A483ForColNum, P08YK4_A831TipColCod, P08YK4_A829TipArtCod, P08YK4_A396EmprCod, P08YK4_A279CliNom, P08YK4_A6634BarRecAcb, P08YK4_n6634BarRecAcb, P08YK4_A14200CosteAnyad,
            P08YK4_A3650BarNumAna, P08YK4_n3650BarNumAna, P08YK4_A11762BarDispCli, P08YK4_n11762BarDispCli, P08YK4_A1946BarVolTin, P08YK4_n1946BarVolTin, P08YK4_A1945BarMaqTin, P08YK4_n1945BarMaqTin, P08YK4_A12993BarMtsTt, P08YK4_n12993BarMtsTt,
            P08YK4_A1948BarMtrTin, P08YK4_n1948BarMtrTin, P08YK4_A8563BarKgsTt, P08YK4_n8563BarKgsTt, P08YK4_A1947BarKgmTin, P08YK4_n1947BarKgmTin, P08YK4_A1942BarTipCoT, P08YK4_n1942BarTipCoT, P08YK4_A1941BarColNuT, P08YK4_n1941BarColNuT,
            P08YK4_A1940BarColNoT, P08YK4_n1940BarColNoT, P08YK4_A1939BarArtTin, P08YK4_n1939BarArtTin, P08YK4_A1937BarDscTin, P08YK4_n1937BarDscTin, P08YK4_A1936BarSerTin, P08YK4_n1936BarSerTin, P08YK4_A252CliCod, P08YK4_A1929EstTinNr,
            P08YK4_A13759EstFecCier, P08YK4_A3656BarCosAD, P08YK4_n3656BarCosAD, P08YK4_A3657BarCosAA, P08YK4_n3657BarCosAA, P08YK4_A3706BarCosAnc, P08YK4_n3706BarCosAnc, P08YK4_A13967BarNumEny, P08YK4_n13967BarNumEny, P08YK4_A13962BarArtTinD,
            P08YK4_n13962BarArtTinD, P08YK4_A1935BarParTin, P08YK4_n1935BarParTin, P08YK4_A1934BarReoTin, P08YK4_n1934BarReoTin, P08YK4_A1933BarCodTin, P08YK4_n1933BarCodTin, P08YK4_A2316BarAgrLot, P08YK4_n2316BarAgrLot, P08YK4_A3705BarCosCol,
            P08YK4_n3705BarCosCol, P08YK4_A3658BarCosPA, P08YK4_n3658BarCosPA, P08YK4_A3654BarCosPD, P08YK4_n3654BarCosPD, P08YK4_A3646EstTinAny, P08YK4_A3647EstTinMes, P08YK4_A3648EstTinDia
            }
            , new Object[] {
            P08YK5_A494ForSer, P08YK5_A482ForColNom, P08YK5_A483ForColNum, P08YK5_A831TipColCod, P08YK5_A829TipArtCod, P08YK5_A396EmprCod, P08YK5_A1936BarSerTin, P08YK5_n1936BarSerTin, P08YK5_A6634BarRecAcb, P08YK5_n6634BarRecAcb,
            P08YK5_A14200CosteAnyad, P08YK5_A3650BarNumAna, P08YK5_n3650BarNumAna, P08YK5_A11762BarDispCli, P08YK5_n11762BarDispCli, P08YK5_A1946BarVolTin, P08YK5_n1946BarVolTin, P08YK5_A1945BarMaqTin, P08YK5_n1945BarMaqTin, P08YK5_A12993BarMtsTt,
            P08YK5_n12993BarMtsTt, P08YK5_A1948BarMtrTin, P08YK5_n1948BarMtrTin, P08YK5_A8563BarKgsTt, P08YK5_n8563BarKgsTt, P08YK5_A1947BarKgmTin, P08YK5_n1947BarKgmTin, P08YK5_A1942BarTipCoT, P08YK5_n1942BarTipCoT, P08YK5_A1941BarColNuT,
            P08YK5_n1941BarColNuT, P08YK5_A1940BarColNoT, P08YK5_n1940BarColNoT, P08YK5_A1939BarArtTin, P08YK5_n1939BarArtTin, P08YK5_A1937BarDscTin, P08YK5_n1937BarDscTin, P08YK5_A279CliNom, P08YK5_A252CliCod, P08YK5_A1929EstTinNr,
            P08YK5_A13759EstFecCier, P08YK5_A3656BarCosAD, P08YK5_n3656BarCosAD, P08YK5_A3657BarCosAA, P08YK5_n3657BarCosAA, P08YK5_A3706BarCosAnc, P08YK5_n3706BarCosAnc, P08YK5_A13967BarNumEny, P08YK5_n13967BarNumEny, P08YK5_A13962BarArtTinD,
            P08YK5_n13962BarArtTinD, P08YK5_A1935BarParTin, P08YK5_n1935BarParTin, P08YK5_A1934BarReoTin, P08YK5_n1934BarReoTin, P08YK5_A1933BarCodTin, P08YK5_n1933BarCodTin, P08YK5_A2316BarAgrLot, P08YK5_n2316BarAgrLot, P08YK5_A3705BarCosCol,
            P08YK5_n3705BarCosCol, P08YK5_A3658BarCosPA, P08YK5_n3658BarCosPA, P08YK5_A3654BarCosPD, P08YK5_n3654BarCosPD, P08YK5_A3646EstTinAny, P08YK5_A3647EstTinMes, P08YK5_A3648EstTinDia
            }
            , new Object[] {
            P08YK6_A494ForSer, P08YK6_A482ForColNom, P08YK6_A483ForColNum, P08YK6_A831TipColCod, P08YK6_A829TipArtCod, P08YK6_A396EmprCod, P08YK6_A1937BarDscTin, P08YK6_n1937BarDscTin, P08YK6_A6634BarRecAcb, P08YK6_n6634BarRecAcb,
            P08YK6_A14200CosteAnyad, P08YK6_A3650BarNumAna, P08YK6_n3650BarNumAna, P08YK6_A11762BarDispCli, P08YK6_n11762BarDispCli, P08YK6_A1946BarVolTin, P08YK6_n1946BarVolTin, P08YK6_A1945BarMaqTin, P08YK6_n1945BarMaqTin, P08YK6_A12993BarMtsTt,
            P08YK6_n12993BarMtsTt, P08YK6_A1948BarMtrTin, P08YK6_n1948BarMtrTin, P08YK6_A8563BarKgsTt, P08YK6_n8563BarKgsTt, P08YK6_A1947BarKgmTin, P08YK6_n1947BarKgmTin, P08YK6_A1942BarTipCoT, P08YK6_n1942BarTipCoT, P08YK6_A1941BarColNuT,
            P08YK6_n1941BarColNuT, P08YK6_A1940BarColNoT, P08YK6_n1940BarColNoT, P08YK6_A1939BarArtTin, P08YK6_n1939BarArtTin, P08YK6_A1936BarSerTin, P08YK6_n1936BarSerTin, P08YK6_A279CliNom, P08YK6_A252CliCod, P08YK6_A1929EstTinNr,
            P08YK6_A13759EstFecCier, P08YK6_A3656BarCosAD, P08YK6_n3656BarCosAD, P08YK6_A3657BarCosAA, P08YK6_n3657BarCosAA, P08YK6_A3706BarCosAnc, P08YK6_n3706BarCosAnc, P08YK6_A13967BarNumEny, P08YK6_n13967BarNumEny, P08YK6_A13962BarArtTinD,
            P08YK6_n13962BarArtTinD, P08YK6_A1935BarParTin, P08YK6_n1935BarParTin, P08YK6_A1934BarReoTin, P08YK6_n1934BarReoTin, P08YK6_A1933BarCodTin, P08YK6_n1933BarCodTin, P08YK6_A2316BarAgrLot, P08YK6_n2316BarAgrLot, P08YK6_A3705BarCosCol,
            P08YK6_n3705BarCosCol, P08YK6_A3658BarCosPA, P08YK6_n3658BarCosPA, P08YK6_A3654BarCosPD, P08YK6_n3654BarCosPD, P08YK6_A3646EstTinAny, P08YK6_A3647EstTinMes, P08YK6_A3648EstTinDia
            }
            , new Object[] {
            P08YK7_A494ForSer, P08YK7_A482ForColNom, P08YK7_A483ForColNum, P08YK7_A831TipColCod, P08YK7_A829TipArtCod, P08YK7_A6634BarRecAcb, P08YK7_n6634BarRecAcb, P08YK7_A396EmprCod, P08YK7_A14200CosteAnyad, P08YK7_A3650BarNumAna,
            P08YK7_n3650BarNumAna, P08YK7_A11762BarDispCli, P08YK7_n11762BarDispCli, P08YK7_A1946BarVolTin, P08YK7_n1946BarVolTin, P08YK7_A1945BarMaqTin, P08YK7_n1945BarMaqTin, P08YK7_A12993BarMtsTt, P08YK7_n12993BarMtsTt, P08YK7_A1948BarMtrTin,
            P08YK7_n1948BarMtrTin, P08YK7_A8563BarKgsTt, P08YK7_n8563BarKgsTt, P08YK7_A1947BarKgmTin, P08YK7_n1947BarKgmTin, P08YK7_A1942BarTipCoT, P08YK7_n1942BarTipCoT, P08YK7_A1941BarColNuT, P08YK7_n1941BarColNuT, P08YK7_A1940BarColNoT,
            P08YK7_n1940BarColNoT, P08YK7_A1939BarArtTin, P08YK7_n1939BarArtTin, P08YK7_A1937BarDscTin, P08YK7_n1937BarDscTin, P08YK7_A1936BarSerTin, P08YK7_n1936BarSerTin, P08YK7_A279CliNom, P08YK7_A252CliCod, P08YK7_A1929EstTinNr,
            P08YK7_A13759EstFecCier, P08YK7_A3656BarCosAD, P08YK7_n3656BarCosAD, P08YK7_A3657BarCosAA, P08YK7_n3657BarCosAA, P08YK7_A3706BarCosAnc, P08YK7_n3706BarCosAnc, P08YK7_A13967BarNumEny, P08YK7_n13967BarNumEny, P08YK7_A13962BarArtTinD,
            P08YK7_n13962BarArtTinD, P08YK7_A1935BarParTin, P08YK7_n1935BarParTin, P08YK7_A1934BarReoTin, P08YK7_n1934BarReoTin, P08YK7_A1933BarCodTin, P08YK7_n1933BarCodTin, P08YK7_A2316BarAgrLot, P08YK7_n2316BarAgrLot, P08YK7_A3705BarCosCol,
            P08YK7_n3705BarCosCol, P08YK7_A3658BarCosPA, P08YK7_n3658BarCosPA, P08YK7_A3654BarCosPD, P08YK7_n3654BarCosPD, P08YK7_A3646EstTinAny, P08YK7_A3647EstTinMes, P08YK7_A3648EstTinDia
            }
            , new Object[] {
            P08YK8_A494ForSer, P08YK8_A482ForColNom, P08YK8_A483ForColNum, P08YK8_A831TipColCod, P08YK8_A829TipArtCod, P08YK8_A396EmprCod, P08YK8_A1940BarColNoT, P08YK8_n1940BarColNoT, P08YK8_A6634BarRecAcb, P08YK8_n6634BarRecAcb,
            P08YK8_A14200CosteAnyad, P08YK8_A3650BarNumAna, P08YK8_n3650BarNumAna, P08YK8_A11762BarDispCli, P08YK8_n11762BarDispCli, P08YK8_A1946BarVolTin, P08YK8_n1946BarVolTin, P08YK8_A1945BarMaqTin, P08YK8_n1945BarMaqTin, P08YK8_A12993BarMtsTt,
            P08YK8_n12993BarMtsTt, P08YK8_A1948BarMtrTin, P08YK8_n1948BarMtrTin, P08YK8_A8563BarKgsTt, P08YK8_n8563BarKgsTt, P08YK8_A1947BarKgmTin, P08YK8_n1947BarKgmTin, P08YK8_A1942BarTipCoT, P08YK8_n1942BarTipCoT, P08YK8_A1941BarColNuT,
            P08YK8_n1941BarColNuT, P08YK8_A1939BarArtTin, P08YK8_n1939BarArtTin, P08YK8_A1937BarDscTin, P08YK8_n1937BarDscTin, P08YK8_A1936BarSerTin, P08YK8_n1936BarSerTin, P08YK8_A279CliNom, P08YK8_A252CliCod, P08YK8_A1929EstTinNr,
            P08YK8_A13759EstFecCier, P08YK8_A3656BarCosAD, P08YK8_n3656BarCosAD, P08YK8_A3657BarCosAA, P08YK8_n3657BarCosAA, P08YK8_A3706BarCosAnc, P08YK8_n3706BarCosAnc, P08YK8_A13967BarNumEny, P08YK8_n13967BarNumEny, P08YK8_A13962BarArtTinD,
            P08YK8_n13962BarArtTinD, P08YK8_A1935BarParTin, P08YK8_n1935BarParTin, P08YK8_A1934BarReoTin, P08YK8_n1934BarReoTin, P08YK8_A1933BarCodTin, P08YK8_n1933BarCodTin, P08YK8_A2316BarAgrLot, P08YK8_n2316BarAgrLot, P08YK8_A3705BarCosCol,
            P08YK8_n3705BarCosCol, P08YK8_A3658BarCosPA, P08YK8_n3658BarCosPA, P08YK8_A3654BarCosPD, P08YK8_n3654BarCosPD, P08YK8_A3646EstTinAny, P08YK8_A3647EstTinMes, P08YK8_A3648EstTinDia
            }
            , new Object[] {
            P08YK9_A494ForSer, P08YK9_A482ForColNom, P08YK9_A483ForColNum, P08YK9_A831TipColCod, P08YK9_A829TipArtCod, P08YK9_A396EmprCod, P08YK9_A1945BarMaqTin, P08YK9_n1945BarMaqTin, P08YK9_A6634BarRecAcb, P08YK9_n6634BarRecAcb,
            P08YK9_A14200CosteAnyad, P08YK9_A3650BarNumAna, P08YK9_n3650BarNumAna, P08YK9_A11762BarDispCli, P08YK9_n11762BarDispCli, P08YK9_A1946BarVolTin, P08YK9_n1946BarVolTin, P08YK9_A12993BarMtsTt, P08YK9_n12993BarMtsTt, P08YK9_A1948BarMtrTin,
            P08YK9_n1948BarMtrTin, P08YK9_A8563BarKgsTt, P08YK9_n8563BarKgsTt, P08YK9_A1947BarKgmTin, P08YK9_n1947BarKgmTin, P08YK9_A1942BarTipCoT, P08YK9_n1942BarTipCoT, P08YK9_A1941BarColNuT, P08YK9_n1941BarColNuT, P08YK9_A1940BarColNoT,
            P08YK9_n1940BarColNoT, P08YK9_A1939BarArtTin, P08YK9_n1939BarArtTin, P08YK9_A1937BarDscTin, P08YK9_n1937BarDscTin, P08YK9_A1936BarSerTin, P08YK9_n1936BarSerTin, P08YK9_A279CliNom, P08YK9_A252CliCod, P08YK9_A1929EstTinNr,
            P08YK9_A13759EstFecCier, P08YK9_A3656BarCosAD, P08YK9_n3656BarCosAD, P08YK9_A3657BarCosAA, P08YK9_n3657BarCosAA, P08YK9_A3706BarCosAnc, P08YK9_n3706BarCosAnc, P08YK9_A13967BarNumEny, P08YK9_n13967BarNumEny, P08YK9_A13962BarArtTinD,
            P08YK9_n13962BarArtTinD, P08YK9_A1935BarParTin, P08YK9_n1935BarParTin, P08YK9_A1934BarReoTin, P08YK9_n1934BarReoTin, P08YK9_A1933BarCodTin, P08YK9_n1933BarCodTin, P08YK9_A2316BarAgrLot, P08YK9_n2316BarAgrLot, P08YK9_A3705BarCosCol,
            P08YK9_n3705BarCosCol, P08YK9_A3658BarCosPA, P08YK9_n3658BarCosPA, P08YK9_A3654BarCosPD, P08YK9_n3654BarCosPD, P08YK9_A3646EstTinAny, P08YK9_A3647EstTinMes, P08YK9_A3648EstTinDia
            }
            , new Object[] {
            P08YK10_A494ForSer, P08YK10_A482ForColNom, P08YK10_A483ForColNum, P08YK10_A831TipColCod, P08YK10_A829TipArtCod, P08YK10_A396EmprCod, P08YK10_A11762BarDispCli, P08YK10_n11762BarDispCli, P08YK10_A6634BarRecAcb, P08YK10_n6634BarRecAcb,
            P08YK10_A14200CosteAnyad, P08YK10_A3650BarNumAna, P08YK10_n3650BarNumAna, P08YK10_A1946BarVolTin, P08YK10_n1946BarVolTin, P08YK10_A1945BarMaqTin, P08YK10_n1945BarMaqTin, P08YK10_A12993BarMtsTt, P08YK10_n12993BarMtsTt, P08YK10_A1948BarMtrTin,
            P08YK10_n1948BarMtrTin, P08YK10_A8563BarKgsTt, P08YK10_n8563BarKgsTt, P08YK10_A1947BarKgmTin, P08YK10_n1947BarKgmTin, P08YK10_A1942BarTipCoT, P08YK10_n1942BarTipCoT, P08YK10_A1941BarColNuT, P08YK10_n1941BarColNuT, P08YK10_A1940BarColNoT,
            P08YK10_n1940BarColNoT, P08YK10_A1939BarArtTin, P08YK10_n1939BarArtTin, P08YK10_A1937BarDscTin, P08YK10_n1937BarDscTin, P08YK10_A1936BarSerTin, P08YK10_n1936BarSerTin, P08YK10_A279CliNom, P08YK10_A252CliCod, P08YK10_A1929EstTinNr,
            P08YK10_A13759EstFecCier, P08YK10_A3656BarCosAD, P08YK10_n3656BarCosAD, P08YK10_A3657BarCosAA, P08YK10_n3657BarCosAA, P08YK10_A3706BarCosAnc, P08YK10_n3706BarCosAnc, P08YK10_A13967BarNumEny, P08YK10_n13967BarNumEny, P08YK10_A13962BarArtTinD,
            P08YK10_n13962BarArtTinD, P08YK10_A1935BarParTin, P08YK10_n1935BarParTin, P08YK10_A1934BarReoTin, P08YK10_n1934BarReoTin, P08YK10_A1933BarCodTin, P08YK10_n1933BarCodTin, P08YK10_A2316BarAgrLot, P08YK10_n2316BarAgrLot, P08YK10_A3705BarCosCol,
            P08YK10_n3705BarCosCol, P08YK10_A3658BarCosPA, P08YK10_n3658BarCosPA, P08YK10_A3654BarCosPD, P08YK10_n3654BarCosPD, P08YK10_A3646EstTinAny, P08YK10_A3647EstTinMes, P08YK10_A3648EstTinDia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV107TFBarReoTin ;
   private byte AV108TFBarReoTin_To ;
   private byte AV30TFBarTipCoT ;
   private byte AV31TFBarTipCoT_To ;
   private byte AV74PBarCodReo ;
   private byte AV75BarCodReoP ;
   private byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ;
   private byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ;
   private byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ;
   private byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short AV12TFEstTinNr ;
   private short AV13TFEstTinNr_To ;
   private short AV89TFBarArtTin ;
   private short AV90TFBarArtTin_To ;
   private short AV95TFBarNumtint ;
   private short AV96TFBarNumtint_To ;
   private short AV46TFBarNumAna ;
   private short AV47TFBarNumAna_To ;
   private short AV97TipArtCodfrom ;
   private short AV98TipArtCodto ;
   private short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ;
   private short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ;
   private short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ;
   private short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ;
   private short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ;
   private short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ;
   private short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ;
   private short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A3650BarNumAna ;
   private short A3646EstTinAny ;
   private short A13975BarNumtint ;
   private short Gx_err ;
   private int AV113GXV1 ;
   private int AV105TFBarCodTin ;
   private int AV106TFBarCodTin_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV28TFBarColNuT ;
   private int AV29TFBarColNuT_To ;
   private int AV42TFBarVolTin ;
   private int AV43TFBarVolTin_To ;
   private int AV93TFBarNumEny ;
   private int AV94TFBarNumEny_To ;
   private int AV70PCliCod ;
   private int AV71CliCodP ;
   private int AV72PBarCod ;
   private int AV73Barcodp ;
   private int AV82PColNum ;
   private int AV83ColNumP ;
   private int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ;
   private int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ;
   private int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ;
   private int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ;
   private int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ;
   private int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ;
   private int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ;
   private int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ;
   private int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ;
   private int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ;
   private int A1933BarCodTin ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int A13967BarNumEny ;
   private int AV51InsertIndex ;
   private long AV60count ;
   private java.math.BigDecimal AV32TFBarKgmTin ;
   private java.math.BigDecimal AV33TFBarKgmTin_To ;
   private java.math.BigDecimal AV34TFBarKgsTt ;
   private java.math.BigDecimal AV35TFBarKgsTt_To ;
   private java.math.BigDecimal AV36TFBarMtrTin ;
   private java.math.BigDecimal AV37TFBarMtrTin_To ;
   private java.math.BigDecimal AV38TFBarMtsTt ;
   private java.math.BigDecimal AV39TFBarMtsTt_To ;
   private java.math.BigDecimal AV101TFCosteInicial ;
   private java.math.BigDecimal AV102TFCosteInicial_To ;
   private java.math.BigDecimal AV103TFCosteAnyadidas ;
   private java.math.BigDecimal AV104TFCosteAnyadidas_To ;
   private java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ;
   private java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ;
   private java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ;
   private java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ;
   private java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ;
   private java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ;
   private java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ;
   private java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ;
   private java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ;
   private java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ;
   private java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ;
   private java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A14200CosteAnyad ;
   private java.math.BigDecimal A14199CosteInici ;
   private String AV109TFBarParTin ;
   private String AV110TFBarParTin_Sel ;
   private String AV16TFBarAgrLot ;
   private String AV17TFBarAgrLot_Sel ;
   private String AV20TFCliNom ;
   private String AV21TFCliNom_Sel ;
   private String AV22TFBarSerTin ;
   private String AV23TFBarSerTin_Sel ;
   private String AV24TFBarDscTin ;
   private String AV25TFBarDscTin_Sel ;
   private String AV91TFBarArtTinD ;
   private String AV92TFBarArtTinD_Sel ;
   private String AV26TFBarColNoT ;
   private String AV27TFBarColNoT_Sel ;
   private String AV40TFBarMaqTin ;
   private String AV41TFBarMaqTin_Sel ;
   private String AV44TFBarDispCli ;
   private String AV45TFBarDispCli_Sel ;
   private String AV67Emprcod ;
   private String AV76PBarCodPar ;
   private String AV77BarCodParP ;
   private String AV78PSerie ;
   private String AV79SerieP ;
   private String AV80PColor ;
   private String AV81ColorP ;
   private String AV84DispCli1 ;
   private String AV85DispCli3 ;
   private String AV86HreRacab ;
   private String AV87MaqCodi ;
   private String AV88MaqCod3 ;
   private String AV99SoloAd ;
   private String AV100CorAdi ;
   private String A1935BarParTin ;
   private String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ;
   private String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ;
   private String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ;
   private String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ;
   private String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ;
   private String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ;
   private String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ;
   private String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ;
   private String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ;
   private String lV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String scmdbuf ;
   private String lV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String lV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String lV128Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String lV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String lV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String lV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String lV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String lV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String A2316BarAgrLot ;
   private String A279CliNom ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1945BarMaqTin ;
   private String A11762BarDispCli ;
   private String A13962BarArtTinD ;
   private String A6634BarRecAcb ;
   private String A396EmprCod ;
   private java.util.Date AV10TFEstFecCier ;
   private java.util.Date AV68Fec1 ;
   private java.util.Date AV69Fec3 ;
   private java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ;
   private java.util.Date A13759EstFecCier ;
   private boolean returnInSub ;
   private boolean brk8YK2 ;
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
   private boolean n1939BarArtTin ;
   private boolean n1937BarDscTin ;
   private boolean n1936BarSerTin ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3706BarCosAnc ;
   private boolean n13967BarNumEny ;
   private boolean n13962BarArtTinD ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean brk8YK4 ;
   private boolean brk8YK6 ;
   private boolean brk8YK8 ;
   private boolean brk8YK10 ;
   private boolean brk8YK13 ;
   private boolean brk8YK15 ;
   private boolean brk8YK17 ;
   private String AV54OptionsJson ;
   private String AV57OptionsDescJson ;
   private String AV59OptionIndexesJson ;
   private String AV50DDOName ;
   private String AV48SearchTxt ;
   private String AV49SearchTxtTo ;
   private String AV52Option ;
   private com.genexus.webpanels.WebSession AV61Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08YK2_A494ForSer ;
   private String[] P08YK2_A482ForColNom ;
   private int[] P08YK2_A483ForColNum ;
   private byte[] P08YK2_A831TipColCod ;
   private short[] P08YK2_A829TipArtCod ;
   private String[] P08YK2_A396EmprCod ;
   private String[] P08YK2_A6634BarRecAcb ;
   private boolean[] P08YK2_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK2_A14200CosteAnyad ;
   private short[] P08YK2_A3650BarNumAna ;
   private boolean[] P08YK2_n3650BarNumAna ;
   private String[] P08YK2_A11762BarDispCli ;
   private boolean[] P08YK2_n11762BarDispCli ;
   private int[] P08YK2_A1946BarVolTin ;
   private boolean[] P08YK2_n1946BarVolTin ;
   private String[] P08YK2_A1945BarMaqTin ;
   private boolean[] P08YK2_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK2_A12993BarMtsTt ;
   private boolean[] P08YK2_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK2_A1948BarMtrTin ;
   private boolean[] P08YK2_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK2_A8563BarKgsTt ;
   private boolean[] P08YK2_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK2_A1947BarKgmTin ;
   private boolean[] P08YK2_n1947BarKgmTin ;
   private byte[] P08YK2_A1942BarTipCoT ;
   private boolean[] P08YK2_n1942BarTipCoT ;
   private int[] P08YK2_A1941BarColNuT ;
   private boolean[] P08YK2_n1941BarColNuT ;
   private String[] P08YK2_A1940BarColNoT ;
   private boolean[] P08YK2_n1940BarColNoT ;
   private short[] P08YK2_A1939BarArtTin ;
   private boolean[] P08YK2_n1939BarArtTin ;
   private String[] P08YK2_A1937BarDscTin ;
   private boolean[] P08YK2_n1937BarDscTin ;
   private String[] P08YK2_A1936BarSerTin ;
   private boolean[] P08YK2_n1936BarSerTin ;
   private String[] P08YK2_A279CliNom ;
   private int[] P08YK2_A252CliCod ;
   private short[] P08YK2_A1929EstTinNr ;
   private java.util.Date[] P08YK2_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK2_A3656BarCosAD ;
   private boolean[] P08YK2_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK2_A3657BarCosAA ;
   private boolean[] P08YK2_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK2_A3706BarCosAnc ;
   private boolean[] P08YK2_n3706BarCosAnc ;
   private int[] P08YK2_A13967BarNumEny ;
   private boolean[] P08YK2_n13967BarNumEny ;
   private String[] P08YK2_A13962BarArtTinD ;
   private boolean[] P08YK2_n13962BarArtTinD ;
   private String[] P08YK2_A1935BarParTin ;
   private boolean[] P08YK2_n1935BarParTin ;
   private byte[] P08YK2_A1934BarReoTin ;
   private boolean[] P08YK2_n1934BarReoTin ;
   private int[] P08YK2_A1933BarCodTin ;
   private boolean[] P08YK2_n1933BarCodTin ;
   private String[] P08YK2_A2316BarAgrLot ;
   private boolean[] P08YK2_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK2_A3705BarCosCol ;
   private boolean[] P08YK2_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK2_A3658BarCosPA ;
   private boolean[] P08YK2_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK2_A3654BarCosPD ;
   private boolean[] P08YK2_n3654BarCosPD ;
   private short[] P08YK2_A3646EstTinAny ;
   private byte[] P08YK2_A3647EstTinMes ;
   private byte[] P08YK2_A3648EstTinDia ;
   private String[] P08YK3_A494ForSer ;
   private String[] P08YK3_A482ForColNom ;
   private int[] P08YK3_A483ForColNum ;
   private byte[] P08YK3_A831TipColCod ;
   private short[] P08YK3_A829TipArtCod ;
   private String[] P08YK3_A396EmprCod ;
   private String[] P08YK3_A6634BarRecAcb ;
   private boolean[] P08YK3_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK3_A14200CosteAnyad ;
   private short[] P08YK3_A3650BarNumAna ;
   private boolean[] P08YK3_n3650BarNumAna ;
   private String[] P08YK3_A11762BarDispCli ;
   private boolean[] P08YK3_n11762BarDispCli ;
   private int[] P08YK3_A1946BarVolTin ;
   private boolean[] P08YK3_n1946BarVolTin ;
   private String[] P08YK3_A1945BarMaqTin ;
   private boolean[] P08YK3_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK3_A12993BarMtsTt ;
   private boolean[] P08YK3_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK3_A1948BarMtrTin ;
   private boolean[] P08YK3_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK3_A8563BarKgsTt ;
   private boolean[] P08YK3_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK3_A1947BarKgmTin ;
   private boolean[] P08YK3_n1947BarKgmTin ;
   private byte[] P08YK3_A1942BarTipCoT ;
   private boolean[] P08YK3_n1942BarTipCoT ;
   private int[] P08YK3_A1941BarColNuT ;
   private boolean[] P08YK3_n1941BarColNuT ;
   private String[] P08YK3_A1940BarColNoT ;
   private boolean[] P08YK3_n1940BarColNoT ;
   private short[] P08YK3_A1939BarArtTin ;
   private boolean[] P08YK3_n1939BarArtTin ;
   private String[] P08YK3_A1937BarDscTin ;
   private boolean[] P08YK3_n1937BarDscTin ;
   private String[] P08YK3_A1936BarSerTin ;
   private boolean[] P08YK3_n1936BarSerTin ;
   private String[] P08YK3_A279CliNom ;
   private int[] P08YK3_A252CliCod ;
   private short[] P08YK3_A1929EstTinNr ;
   private java.util.Date[] P08YK3_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK3_A3656BarCosAD ;
   private boolean[] P08YK3_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK3_A3657BarCosAA ;
   private boolean[] P08YK3_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK3_A3706BarCosAnc ;
   private boolean[] P08YK3_n3706BarCosAnc ;
   private int[] P08YK3_A13967BarNumEny ;
   private boolean[] P08YK3_n13967BarNumEny ;
   private String[] P08YK3_A13962BarArtTinD ;
   private boolean[] P08YK3_n13962BarArtTinD ;
   private String[] P08YK3_A1935BarParTin ;
   private boolean[] P08YK3_n1935BarParTin ;
   private byte[] P08YK3_A1934BarReoTin ;
   private boolean[] P08YK3_n1934BarReoTin ;
   private int[] P08YK3_A1933BarCodTin ;
   private boolean[] P08YK3_n1933BarCodTin ;
   private String[] P08YK3_A2316BarAgrLot ;
   private boolean[] P08YK3_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK3_A3705BarCosCol ;
   private boolean[] P08YK3_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK3_A3658BarCosPA ;
   private boolean[] P08YK3_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK3_A3654BarCosPD ;
   private boolean[] P08YK3_n3654BarCosPD ;
   private short[] P08YK3_A3646EstTinAny ;
   private byte[] P08YK3_A3647EstTinMes ;
   private byte[] P08YK3_A3648EstTinDia ;
   private String[] P08YK4_A494ForSer ;
   private String[] P08YK4_A482ForColNom ;
   private int[] P08YK4_A483ForColNum ;
   private byte[] P08YK4_A831TipColCod ;
   private short[] P08YK4_A829TipArtCod ;
   private String[] P08YK4_A396EmprCod ;
   private String[] P08YK4_A279CliNom ;
   private String[] P08YK4_A6634BarRecAcb ;
   private boolean[] P08YK4_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK4_A14200CosteAnyad ;
   private short[] P08YK4_A3650BarNumAna ;
   private boolean[] P08YK4_n3650BarNumAna ;
   private String[] P08YK4_A11762BarDispCli ;
   private boolean[] P08YK4_n11762BarDispCli ;
   private int[] P08YK4_A1946BarVolTin ;
   private boolean[] P08YK4_n1946BarVolTin ;
   private String[] P08YK4_A1945BarMaqTin ;
   private boolean[] P08YK4_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK4_A12993BarMtsTt ;
   private boolean[] P08YK4_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK4_A1948BarMtrTin ;
   private boolean[] P08YK4_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK4_A8563BarKgsTt ;
   private boolean[] P08YK4_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK4_A1947BarKgmTin ;
   private boolean[] P08YK4_n1947BarKgmTin ;
   private byte[] P08YK4_A1942BarTipCoT ;
   private boolean[] P08YK4_n1942BarTipCoT ;
   private int[] P08YK4_A1941BarColNuT ;
   private boolean[] P08YK4_n1941BarColNuT ;
   private String[] P08YK4_A1940BarColNoT ;
   private boolean[] P08YK4_n1940BarColNoT ;
   private short[] P08YK4_A1939BarArtTin ;
   private boolean[] P08YK4_n1939BarArtTin ;
   private String[] P08YK4_A1937BarDscTin ;
   private boolean[] P08YK4_n1937BarDscTin ;
   private String[] P08YK4_A1936BarSerTin ;
   private boolean[] P08YK4_n1936BarSerTin ;
   private int[] P08YK4_A252CliCod ;
   private short[] P08YK4_A1929EstTinNr ;
   private java.util.Date[] P08YK4_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK4_A3656BarCosAD ;
   private boolean[] P08YK4_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK4_A3657BarCosAA ;
   private boolean[] P08YK4_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK4_A3706BarCosAnc ;
   private boolean[] P08YK4_n3706BarCosAnc ;
   private int[] P08YK4_A13967BarNumEny ;
   private boolean[] P08YK4_n13967BarNumEny ;
   private String[] P08YK4_A13962BarArtTinD ;
   private boolean[] P08YK4_n13962BarArtTinD ;
   private String[] P08YK4_A1935BarParTin ;
   private boolean[] P08YK4_n1935BarParTin ;
   private byte[] P08YK4_A1934BarReoTin ;
   private boolean[] P08YK4_n1934BarReoTin ;
   private int[] P08YK4_A1933BarCodTin ;
   private boolean[] P08YK4_n1933BarCodTin ;
   private String[] P08YK4_A2316BarAgrLot ;
   private boolean[] P08YK4_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK4_A3705BarCosCol ;
   private boolean[] P08YK4_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK4_A3658BarCosPA ;
   private boolean[] P08YK4_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK4_A3654BarCosPD ;
   private boolean[] P08YK4_n3654BarCosPD ;
   private short[] P08YK4_A3646EstTinAny ;
   private byte[] P08YK4_A3647EstTinMes ;
   private byte[] P08YK4_A3648EstTinDia ;
   private String[] P08YK5_A494ForSer ;
   private String[] P08YK5_A482ForColNom ;
   private int[] P08YK5_A483ForColNum ;
   private byte[] P08YK5_A831TipColCod ;
   private short[] P08YK5_A829TipArtCod ;
   private String[] P08YK5_A396EmprCod ;
   private String[] P08YK5_A1936BarSerTin ;
   private boolean[] P08YK5_n1936BarSerTin ;
   private String[] P08YK5_A6634BarRecAcb ;
   private boolean[] P08YK5_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK5_A14200CosteAnyad ;
   private short[] P08YK5_A3650BarNumAna ;
   private boolean[] P08YK5_n3650BarNumAna ;
   private String[] P08YK5_A11762BarDispCli ;
   private boolean[] P08YK5_n11762BarDispCli ;
   private int[] P08YK5_A1946BarVolTin ;
   private boolean[] P08YK5_n1946BarVolTin ;
   private String[] P08YK5_A1945BarMaqTin ;
   private boolean[] P08YK5_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK5_A12993BarMtsTt ;
   private boolean[] P08YK5_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK5_A1948BarMtrTin ;
   private boolean[] P08YK5_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK5_A8563BarKgsTt ;
   private boolean[] P08YK5_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK5_A1947BarKgmTin ;
   private boolean[] P08YK5_n1947BarKgmTin ;
   private byte[] P08YK5_A1942BarTipCoT ;
   private boolean[] P08YK5_n1942BarTipCoT ;
   private int[] P08YK5_A1941BarColNuT ;
   private boolean[] P08YK5_n1941BarColNuT ;
   private String[] P08YK5_A1940BarColNoT ;
   private boolean[] P08YK5_n1940BarColNoT ;
   private short[] P08YK5_A1939BarArtTin ;
   private boolean[] P08YK5_n1939BarArtTin ;
   private String[] P08YK5_A1937BarDscTin ;
   private boolean[] P08YK5_n1937BarDscTin ;
   private String[] P08YK5_A279CliNom ;
   private int[] P08YK5_A252CliCod ;
   private short[] P08YK5_A1929EstTinNr ;
   private java.util.Date[] P08YK5_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK5_A3656BarCosAD ;
   private boolean[] P08YK5_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK5_A3657BarCosAA ;
   private boolean[] P08YK5_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK5_A3706BarCosAnc ;
   private boolean[] P08YK5_n3706BarCosAnc ;
   private int[] P08YK5_A13967BarNumEny ;
   private boolean[] P08YK5_n13967BarNumEny ;
   private String[] P08YK5_A13962BarArtTinD ;
   private boolean[] P08YK5_n13962BarArtTinD ;
   private String[] P08YK5_A1935BarParTin ;
   private boolean[] P08YK5_n1935BarParTin ;
   private byte[] P08YK5_A1934BarReoTin ;
   private boolean[] P08YK5_n1934BarReoTin ;
   private int[] P08YK5_A1933BarCodTin ;
   private boolean[] P08YK5_n1933BarCodTin ;
   private String[] P08YK5_A2316BarAgrLot ;
   private boolean[] P08YK5_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK5_A3705BarCosCol ;
   private boolean[] P08YK5_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK5_A3658BarCosPA ;
   private boolean[] P08YK5_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK5_A3654BarCosPD ;
   private boolean[] P08YK5_n3654BarCosPD ;
   private short[] P08YK5_A3646EstTinAny ;
   private byte[] P08YK5_A3647EstTinMes ;
   private byte[] P08YK5_A3648EstTinDia ;
   private String[] P08YK6_A494ForSer ;
   private String[] P08YK6_A482ForColNom ;
   private int[] P08YK6_A483ForColNum ;
   private byte[] P08YK6_A831TipColCod ;
   private short[] P08YK6_A829TipArtCod ;
   private String[] P08YK6_A396EmprCod ;
   private String[] P08YK6_A1937BarDscTin ;
   private boolean[] P08YK6_n1937BarDscTin ;
   private String[] P08YK6_A6634BarRecAcb ;
   private boolean[] P08YK6_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK6_A14200CosteAnyad ;
   private short[] P08YK6_A3650BarNumAna ;
   private boolean[] P08YK6_n3650BarNumAna ;
   private String[] P08YK6_A11762BarDispCli ;
   private boolean[] P08YK6_n11762BarDispCli ;
   private int[] P08YK6_A1946BarVolTin ;
   private boolean[] P08YK6_n1946BarVolTin ;
   private String[] P08YK6_A1945BarMaqTin ;
   private boolean[] P08YK6_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK6_A12993BarMtsTt ;
   private boolean[] P08YK6_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK6_A1948BarMtrTin ;
   private boolean[] P08YK6_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK6_A8563BarKgsTt ;
   private boolean[] P08YK6_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK6_A1947BarKgmTin ;
   private boolean[] P08YK6_n1947BarKgmTin ;
   private byte[] P08YK6_A1942BarTipCoT ;
   private boolean[] P08YK6_n1942BarTipCoT ;
   private int[] P08YK6_A1941BarColNuT ;
   private boolean[] P08YK6_n1941BarColNuT ;
   private String[] P08YK6_A1940BarColNoT ;
   private boolean[] P08YK6_n1940BarColNoT ;
   private short[] P08YK6_A1939BarArtTin ;
   private boolean[] P08YK6_n1939BarArtTin ;
   private String[] P08YK6_A1936BarSerTin ;
   private boolean[] P08YK6_n1936BarSerTin ;
   private String[] P08YK6_A279CliNom ;
   private int[] P08YK6_A252CliCod ;
   private short[] P08YK6_A1929EstTinNr ;
   private java.util.Date[] P08YK6_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK6_A3656BarCosAD ;
   private boolean[] P08YK6_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK6_A3657BarCosAA ;
   private boolean[] P08YK6_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK6_A3706BarCosAnc ;
   private boolean[] P08YK6_n3706BarCosAnc ;
   private int[] P08YK6_A13967BarNumEny ;
   private boolean[] P08YK6_n13967BarNumEny ;
   private String[] P08YK6_A13962BarArtTinD ;
   private boolean[] P08YK6_n13962BarArtTinD ;
   private String[] P08YK6_A1935BarParTin ;
   private boolean[] P08YK6_n1935BarParTin ;
   private byte[] P08YK6_A1934BarReoTin ;
   private boolean[] P08YK6_n1934BarReoTin ;
   private int[] P08YK6_A1933BarCodTin ;
   private boolean[] P08YK6_n1933BarCodTin ;
   private String[] P08YK6_A2316BarAgrLot ;
   private boolean[] P08YK6_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK6_A3705BarCosCol ;
   private boolean[] P08YK6_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK6_A3658BarCosPA ;
   private boolean[] P08YK6_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK6_A3654BarCosPD ;
   private boolean[] P08YK6_n3654BarCosPD ;
   private short[] P08YK6_A3646EstTinAny ;
   private byte[] P08YK6_A3647EstTinMes ;
   private byte[] P08YK6_A3648EstTinDia ;
   private String[] P08YK7_A494ForSer ;
   private String[] P08YK7_A482ForColNom ;
   private int[] P08YK7_A483ForColNum ;
   private byte[] P08YK7_A831TipColCod ;
   private short[] P08YK7_A829TipArtCod ;
   private String[] P08YK7_A6634BarRecAcb ;
   private boolean[] P08YK7_n6634BarRecAcb ;
   private String[] P08YK7_A396EmprCod ;
   private java.math.BigDecimal[] P08YK7_A14200CosteAnyad ;
   private short[] P08YK7_A3650BarNumAna ;
   private boolean[] P08YK7_n3650BarNumAna ;
   private String[] P08YK7_A11762BarDispCli ;
   private boolean[] P08YK7_n11762BarDispCli ;
   private int[] P08YK7_A1946BarVolTin ;
   private boolean[] P08YK7_n1946BarVolTin ;
   private String[] P08YK7_A1945BarMaqTin ;
   private boolean[] P08YK7_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK7_A12993BarMtsTt ;
   private boolean[] P08YK7_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK7_A1948BarMtrTin ;
   private boolean[] P08YK7_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK7_A8563BarKgsTt ;
   private boolean[] P08YK7_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK7_A1947BarKgmTin ;
   private boolean[] P08YK7_n1947BarKgmTin ;
   private byte[] P08YK7_A1942BarTipCoT ;
   private boolean[] P08YK7_n1942BarTipCoT ;
   private int[] P08YK7_A1941BarColNuT ;
   private boolean[] P08YK7_n1941BarColNuT ;
   private String[] P08YK7_A1940BarColNoT ;
   private boolean[] P08YK7_n1940BarColNoT ;
   private short[] P08YK7_A1939BarArtTin ;
   private boolean[] P08YK7_n1939BarArtTin ;
   private String[] P08YK7_A1937BarDscTin ;
   private boolean[] P08YK7_n1937BarDscTin ;
   private String[] P08YK7_A1936BarSerTin ;
   private boolean[] P08YK7_n1936BarSerTin ;
   private String[] P08YK7_A279CliNom ;
   private int[] P08YK7_A252CliCod ;
   private short[] P08YK7_A1929EstTinNr ;
   private java.util.Date[] P08YK7_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK7_A3656BarCosAD ;
   private boolean[] P08YK7_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK7_A3657BarCosAA ;
   private boolean[] P08YK7_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK7_A3706BarCosAnc ;
   private boolean[] P08YK7_n3706BarCosAnc ;
   private int[] P08YK7_A13967BarNumEny ;
   private boolean[] P08YK7_n13967BarNumEny ;
   private String[] P08YK7_A13962BarArtTinD ;
   private boolean[] P08YK7_n13962BarArtTinD ;
   private String[] P08YK7_A1935BarParTin ;
   private boolean[] P08YK7_n1935BarParTin ;
   private byte[] P08YK7_A1934BarReoTin ;
   private boolean[] P08YK7_n1934BarReoTin ;
   private int[] P08YK7_A1933BarCodTin ;
   private boolean[] P08YK7_n1933BarCodTin ;
   private String[] P08YK7_A2316BarAgrLot ;
   private boolean[] P08YK7_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK7_A3705BarCosCol ;
   private boolean[] P08YK7_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK7_A3658BarCosPA ;
   private boolean[] P08YK7_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK7_A3654BarCosPD ;
   private boolean[] P08YK7_n3654BarCosPD ;
   private short[] P08YK7_A3646EstTinAny ;
   private byte[] P08YK7_A3647EstTinMes ;
   private byte[] P08YK7_A3648EstTinDia ;
   private String[] P08YK8_A494ForSer ;
   private String[] P08YK8_A482ForColNom ;
   private int[] P08YK8_A483ForColNum ;
   private byte[] P08YK8_A831TipColCod ;
   private short[] P08YK8_A829TipArtCod ;
   private String[] P08YK8_A396EmprCod ;
   private String[] P08YK8_A1940BarColNoT ;
   private boolean[] P08YK8_n1940BarColNoT ;
   private String[] P08YK8_A6634BarRecAcb ;
   private boolean[] P08YK8_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK8_A14200CosteAnyad ;
   private short[] P08YK8_A3650BarNumAna ;
   private boolean[] P08YK8_n3650BarNumAna ;
   private String[] P08YK8_A11762BarDispCli ;
   private boolean[] P08YK8_n11762BarDispCli ;
   private int[] P08YK8_A1946BarVolTin ;
   private boolean[] P08YK8_n1946BarVolTin ;
   private String[] P08YK8_A1945BarMaqTin ;
   private boolean[] P08YK8_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK8_A12993BarMtsTt ;
   private boolean[] P08YK8_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK8_A1948BarMtrTin ;
   private boolean[] P08YK8_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK8_A8563BarKgsTt ;
   private boolean[] P08YK8_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK8_A1947BarKgmTin ;
   private boolean[] P08YK8_n1947BarKgmTin ;
   private byte[] P08YK8_A1942BarTipCoT ;
   private boolean[] P08YK8_n1942BarTipCoT ;
   private int[] P08YK8_A1941BarColNuT ;
   private boolean[] P08YK8_n1941BarColNuT ;
   private short[] P08YK8_A1939BarArtTin ;
   private boolean[] P08YK8_n1939BarArtTin ;
   private String[] P08YK8_A1937BarDscTin ;
   private boolean[] P08YK8_n1937BarDscTin ;
   private String[] P08YK8_A1936BarSerTin ;
   private boolean[] P08YK8_n1936BarSerTin ;
   private String[] P08YK8_A279CliNom ;
   private int[] P08YK8_A252CliCod ;
   private short[] P08YK8_A1929EstTinNr ;
   private java.util.Date[] P08YK8_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK8_A3656BarCosAD ;
   private boolean[] P08YK8_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK8_A3657BarCosAA ;
   private boolean[] P08YK8_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK8_A3706BarCosAnc ;
   private boolean[] P08YK8_n3706BarCosAnc ;
   private int[] P08YK8_A13967BarNumEny ;
   private boolean[] P08YK8_n13967BarNumEny ;
   private String[] P08YK8_A13962BarArtTinD ;
   private boolean[] P08YK8_n13962BarArtTinD ;
   private String[] P08YK8_A1935BarParTin ;
   private boolean[] P08YK8_n1935BarParTin ;
   private byte[] P08YK8_A1934BarReoTin ;
   private boolean[] P08YK8_n1934BarReoTin ;
   private int[] P08YK8_A1933BarCodTin ;
   private boolean[] P08YK8_n1933BarCodTin ;
   private String[] P08YK8_A2316BarAgrLot ;
   private boolean[] P08YK8_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK8_A3705BarCosCol ;
   private boolean[] P08YK8_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK8_A3658BarCosPA ;
   private boolean[] P08YK8_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK8_A3654BarCosPD ;
   private boolean[] P08YK8_n3654BarCosPD ;
   private short[] P08YK8_A3646EstTinAny ;
   private byte[] P08YK8_A3647EstTinMes ;
   private byte[] P08YK8_A3648EstTinDia ;
   private String[] P08YK9_A494ForSer ;
   private String[] P08YK9_A482ForColNom ;
   private int[] P08YK9_A483ForColNum ;
   private byte[] P08YK9_A831TipColCod ;
   private short[] P08YK9_A829TipArtCod ;
   private String[] P08YK9_A396EmprCod ;
   private String[] P08YK9_A1945BarMaqTin ;
   private boolean[] P08YK9_n1945BarMaqTin ;
   private String[] P08YK9_A6634BarRecAcb ;
   private boolean[] P08YK9_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK9_A14200CosteAnyad ;
   private short[] P08YK9_A3650BarNumAna ;
   private boolean[] P08YK9_n3650BarNumAna ;
   private String[] P08YK9_A11762BarDispCli ;
   private boolean[] P08YK9_n11762BarDispCli ;
   private int[] P08YK9_A1946BarVolTin ;
   private boolean[] P08YK9_n1946BarVolTin ;
   private java.math.BigDecimal[] P08YK9_A12993BarMtsTt ;
   private boolean[] P08YK9_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK9_A1948BarMtrTin ;
   private boolean[] P08YK9_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK9_A8563BarKgsTt ;
   private boolean[] P08YK9_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK9_A1947BarKgmTin ;
   private boolean[] P08YK9_n1947BarKgmTin ;
   private byte[] P08YK9_A1942BarTipCoT ;
   private boolean[] P08YK9_n1942BarTipCoT ;
   private int[] P08YK9_A1941BarColNuT ;
   private boolean[] P08YK9_n1941BarColNuT ;
   private String[] P08YK9_A1940BarColNoT ;
   private boolean[] P08YK9_n1940BarColNoT ;
   private short[] P08YK9_A1939BarArtTin ;
   private boolean[] P08YK9_n1939BarArtTin ;
   private String[] P08YK9_A1937BarDscTin ;
   private boolean[] P08YK9_n1937BarDscTin ;
   private String[] P08YK9_A1936BarSerTin ;
   private boolean[] P08YK9_n1936BarSerTin ;
   private String[] P08YK9_A279CliNom ;
   private int[] P08YK9_A252CliCod ;
   private short[] P08YK9_A1929EstTinNr ;
   private java.util.Date[] P08YK9_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK9_A3656BarCosAD ;
   private boolean[] P08YK9_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK9_A3657BarCosAA ;
   private boolean[] P08YK9_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK9_A3706BarCosAnc ;
   private boolean[] P08YK9_n3706BarCosAnc ;
   private int[] P08YK9_A13967BarNumEny ;
   private boolean[] P08YK9_n13967BarNumEny ;
   private String[] P08YK9_A13962BarArtTinD ;
   private boolean[] P08YK9_n13962BarArtTinD ;
   private String[] P08YK9_A1935BarParTin ;
   private boolean[] P08YK9_n1935BarParTin ;
   private byte[] P08YK9_A1934BarReoTin ;
   private boolean[] P08YK9_n1934BarReoTin ;
   private int[] P08YK9_A1933BarCodTin ;
   private boolean[] P08YK9_n1933BarCodTin ;
   private String[] P08YK9_A2316BarAgrLot ;
   private boolean[] P08YK9_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK9_A3705BarCosCol ;
   private boolean[] P08YK9_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK9_A3658BarCosPA ;
   private boolean[] P08YK9_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK9_A3654BarCosPD ;
   private boolean[] P08YK9_n3654BarCosPD ;
   private short[] P08YK9_A3646EstTinAny ;
   private byte[] P08YK9_A3647EstTinMes ;
   private byte[] P08YK9_A3648EstTinDia ;
   private String[] P08YK10_A494ForSer ;
   private String[] P08YK10_A482ForColNom ;
   private int[] P08YK10_A483ForColNum ;
   private byte[] P08YK10_A831TipColCod ;
   private short[] P08YK10_A829TipArtCod ;
   private String[] P08YK10_A396EmprCod ;
   private String[] P08YK10_A11762BarDispCli ;
   private boolean[] P08YK10_n11762BarDispCli ;
   private String[] P08YK10_A6634BarRecAcb ;
   private boolean[] P08YK10_n6634BarRecAcb ;
   private java.math.BigDecimal[] P08YK10_A14200CosteAnyad ;
   private short[] P08YK10_A3650BarNumAna ;
   private boolean[] P08YK10_n3650BarNumAna ;
   private int[] P08YK10_A1946BarVolTin ;
   private boolean[] P08YK10_n1946BarVolTin ;
   private String[] P08YK10_A1945BarMaqTin ;
   private boolean[] P08YK10_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YK10_A12993BarMtsTt ;
   private boolean[] P08YK10_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YK10_A1948BarMtrTin ;
   private boolean[] P08YK10_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YK10_A8563BarKgsTt ;
   private boolean[] P08YK10_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YK10_A1947BarKgmTin ;
   private boolean[] P08YK10_n1947BarKgmTin ;
   private byte[] P08YK10_A1942BarTipCoT ;
   private boolean[] P08YK10_n1942BarTipCoT ;
   private int[] P08YK10_A1941BarColNuT ;
   private boolean[] P08YK10_n1941BarColNuT ;
   private String[] P08YK10_A1940BarColNoT ;
   private boolean[] P08YK10_n1940BarColNoT ;
   private short[] P08YK10_A1939BarArtTin ;
   private boolean[] P08YK10_n1939BarArtTin ;
   private String[] P08YK10_A1937BarDscTin ;
   private boolean[] P08YK10_n1937BarDscTin ;
   private String[] P08YK10_A1936BarSerTin ;
   private boolean[] P08YK10_n1936BarSerTin ;
   private String[] P08YK10_A279CliNom ;
   private int[] P08YK10_A252CliCod ;
   private short[] P08YK10_A1929EstTinNr ;
   private java.util.Date[] P08YK10_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YK10_A3656BarCosAD ;
   private boolean[] P08YK10_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YK10_A3657BarCosAA ;
   private boolean[] P08YK10_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YK10_A3706BarCosAnc ;
   private boolean[] P08YK10_n3706BarCosAnc ;
   private int[] P08YK10_A13967BarNumEny ;
   private boolean[] P08YK10_n13967BarNumEny ;
   private String[] P08YK10_A13962BarArtTinD ;
   private boolean[] P08YK10_n13962BarArtTinD ;
   private String[] P08YK10_A1935BarParTin ;
   private boolean[] P08YK10_n1935BarParTin ;
   private byte[] P08YK10_A1934BarReoTin ;
   private boolean[] P08YK10_n1934BarReoTin ;
   private int[] P08YK10_A1933BarCodTin ;
   private boolean[] P08YK10_n1933BarCodTin ;
   private String[] P08YK10_A2316BarAgrLot ;
   private boolean[] P08YK10_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YK10_A3705BarCosCol ;
   private boolean[] P08YK10_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YK10_A3658BarCosPA ;
   private boolean[] P08YK10_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YK10_A3654BarCosPD ;
   private boolean[] P08YK10_n3654BarCosPD ;
   private short[] P08YK10_A3646EstTinAny ;
   private byte[] P08YK10_A3647EstTinMes ;
   private byte[] P08YK10_A3648EstTinDia ;
   private GXSimpleCollection<String> AV53Options ;
   private GXSimpleCollection<String> AV56OptionsDesc ;
   private GXSimpleCollection<String> AV58OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV63GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV64GridStateFilterValue ;
}

final  class consultadesdelcontigetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08YK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[88];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE(" ;
      scmdbuf += " T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int2[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int2[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int2[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int2[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int2[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int2[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int2[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int2[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int2[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int2[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int2[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int2[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int2[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int2[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int2[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int2[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int2[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int2[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int2[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int2[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarParTin" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08YK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[88];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE(" ;
      scmdbuf += " T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int4[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int4[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int4[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int4[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int4[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int4[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int4[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int4[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int4[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int4[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int4[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int4[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int4[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int4[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int4[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int4[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int4[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int4[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int4[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int4[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int4[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int4[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int4[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int4[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int4[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int4[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int4[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int4[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int4[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int4[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrLot" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08YK4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[88];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T3.CliNom, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int6[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int6[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int6[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int6[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int6[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int6[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int6[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int6[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int6[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08YK5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod ,
                                          String AV78PSerie ,
                                          String AV79SerieP )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[88];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarSerTin, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int8[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int8[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int8[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int8[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int8[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int8[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int8[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int8[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int8[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int8[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int8[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int8[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int8[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int8[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int8[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int8[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int8[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int8[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int8[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int8[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerTin" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08YK6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[88];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarDscTin, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarArtTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int10[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int10[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int10[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int10[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int10[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int10[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int10[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int10[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int10[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int10[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int10[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int10[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int10[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int10[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int10[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int10[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int10[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int10[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int10[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int10[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int10[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int10[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int10[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int10[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarDscTin" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08YK7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String AV67Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[88];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.BarRecAcb, T1.EmprCod, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE(" ;
      scmdbuf += " T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int12[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int12[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int12[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int12[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int12[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int12[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int12[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int12[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int12[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int12[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int12[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int12[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int12[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int12[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int12[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int12[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int12[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int12[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int12[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int12[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int12[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int12[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int12[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int12[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int12[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int12[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int12[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int12[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int12[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int12[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08YK8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod ,
                                          String AV80PColor ,
                                          String AV81ColorP )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[88];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarColNoT, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int14[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int14[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int14[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int14[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int14[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int14[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int14[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int14[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int14[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int14[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int14[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int14[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int14[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int14[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int14[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int14[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int14[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int14[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int14[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int14[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int14[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int14[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int14[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNoT" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08YK9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV75BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
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
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV68Fec1 ,
                                          java.util.Date AV69Fec3 ,
                                          int AV70PCliCod ,
                                          int AV71CliCodP ,
                                          int AV72PBarCod ,
                                          int AV73Barcodp ,
                                          byte AV74PBarCodReo ,
                                          String AV76PBarCodPar ,
                                          String AV77BarCodParP ,
                                          String AV78PSerie ,
                                          String AV79SerieP ,
                                          String AV80PColor ,
                                          String AV81ColorP ,
                                          int AV82PColNum ,
                                          int AV83ColNumP ,
                                          String AV84DispCli1 ,
                                          String AV85DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV86HreRacab ,
                                          short AV97TipArtCodfrom ,
                                          short AV98TipArtCodto ,
                                          String AV99SoloAd ,
                                          String AV100CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String A396EmprCod ,
                                          String AV67Emprcod ,
                                          String AV87MaqCodi ,
                                          String AV88MaqCod3 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[88];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarMaqTin, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int16[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int16[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int16[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int16[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int16[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int16[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int16[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int16[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int16[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int16[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int16[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int16[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int16[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int16[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int16[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int16[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int16[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int16[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int16[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int16[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int16[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int16[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int16[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int16[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int16[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int16[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int16[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int16[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int16[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarMaqTin" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08YK10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           short AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                           short AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                           int AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                           int AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                           byte AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                           byte AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                           String AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           String AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           String AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           String AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           int AV126Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                           int AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                           String AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           String AV128Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           String AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           String AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           String AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           String AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           short AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                           short AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                           String AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           String AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           int AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                           int AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                           byte AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                           byte AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                           java.math.BigDecimal AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           java.math.BigDecimal AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           java.math.BigDecimal AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           java.math.BigDecimal AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           java.math.BigDecimal AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           java.math.BigDecimal AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           short AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                           short AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                           java.math.BigDecimal AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           java.math.BigDecimal AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           String AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           String AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           int AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                           int AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                           String AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           String AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           short AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                           short AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                           java.math.BigDecimal AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           java.math.BigDecimal AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           java.math.BigDecimal AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           java.math.BigDecimal AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           byte AV75BarCodReoP ,
                                           java.util.Date A13759EstFecCier ,
                                           short A1929EstTinNr ,
                                           int A1933BarCodTin ,
                                           byte A1934BarReoTin ,
                                           String A1935BarParTin ,
                                           String A2316BarAgrLot ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A1936BarSerTin ,
                                           String A1937BarDscTin ,
                                           short A1939BarArtTin ,
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
                                           java.math.BigDecimal A3654BarCosPD ,
                                           java.math.BigDecimal A3658BarCosPA ,
                                           java.math.BigDecimal A3705BarCosCol ,
                                           java.math.BigDecimal A3656BarCosAD ,
                                           java.math.BigDecimal A3657BarCosAA ,
                                           java.math.BigDecimal A3706BarCosAnc ,
                                           String AV137Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           String AV136Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           String A13962BarArtTinD ,
                                           int AV158Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                           int A13967BarNumEny ,
                                           int AV159Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                           java.util.Date AV68Fec1 ,
                                           java.util.Date AV69Fec3 ,
                                           int AV70PCliCod ,
                                           int AV71CliCodP ,
                                           int AV72PBarCod ,
                                           int AV73Barcodp ,
                                           byte AV74PBarCodReo ,
                                           String AV76PBarCodPar ,
                                           String AV77BarCodParP ,
                                           String AV78PSerie ,
                                           String AV79SerieP ,
                                           String AV80PColor ,
                                           String AV81ColorP ,
                                           int AV82PColNum ,
                                           int AV83ColNumP ,
                                           String A6634BarRecAcb ,
                                           String AV86HreRacab ,
                                           String AV87MaqCodi ,
                                           String AV88MaqCod3 ,
                                           short AV97TipArtCodfrom ,
                                           short AV98TipArtCodto ,
                                           String AV99SoloAd ,
                                           String AV100CorAdi ,
                                           java.math.BigDecimal A14200CosteAnyad ,
                                           String A396EmprCod ,
                                           String AV67Emprcod ,
                                           String AV84DispCli1 ,
                                           String AV85DispCli3 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[88];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EmprCod, T1.BarDispCli, T1.BarRecAcb, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (0==AV119Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (0==AV120Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( ! (0==AV121Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int18[48] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int18[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV130Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int18[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int18[56] = (byte)(1) ;
      }
      if ( ! (0==AV134Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int18[57] = (byte)(1) ;
      }
      if ( ! (0==AV135Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int18[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int18[60] = (byte)(1) ;
      }
      if ( ! (0==AV140Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int18[61] = (byte)(1) ;
      }
      if ( ! (0==AV141Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int18[62] = (byte)(1) ;
      }
      if ( ! (0==AV142Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int18[63] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int18[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int18[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int18[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int18[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int18[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int18[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int18[70] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int18[71] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int18[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int18[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int18[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int18[76] = (byte)(1) ;
      }
      if ( ! (0==AV156Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int18[77] = (byte)(1) ;
      }
      if ( ! (0==AV157Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int18[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int18[80] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int18[81] = (byte)(1) ;
      }
      if ( ! (0==AV163Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int18[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int18[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int18[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int18[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int18[86] = (byte)(1) ;
      }
      if ( ! (0==AV75BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int18[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarDispCli" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P08YK2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , (String)dynConstraints[97] , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , ((Number) dynConstraints[103]).shortValue() , ((Number) dynConstraints[104]).shortValue() , (String)dynConstraints[105] , (String)dynConstraints[106] , (java.math.BigDecimal)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 1 :
                  return conditional_P08YK3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , ((Number) dynConstraints[105]).shortValue() , ((Number) dynConstraints[106]).shortValue() , (String)dynConstraints[107] , (String)dynConstraints[108] , (java.math.BigDecimal)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 2 :
                  return conditional_P08YK4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , ((Number) dynConstraints[105]).shortValue() , ((Number) dynConstraints[106]).shortValue() , (String)dynConstraints[107] , (String)dynConstraints[108] , (java.math.BigDecimal)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 3 :
                  return conditional_P08YK5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , (String)dynConstraints[97] , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , ((Number) dynConstraints[103]).shortValue() , ((Number) dynConstraints[104]).shortValue() , (String)dynConstraints[105] , (String)dynConstraints[106] , (java.math.BigDecimal)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 4 :
                  return conditional_P08YK6(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , ((Number) dynConstraints[105]).shortValue() , ((Number) dynConstraints[106]).shortValue() , (String)dynConstraints[107] , (String)dynConstraints[108] , (java.math.BigDecimal)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 5 :
                  return conditional_P08YK7(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , ((Number) dynConstraints[105]).shortValue() , ((Number) dynConstraints[106]).shortValue() , (String)dynConstraints[107] , (String)dynConstraints[108] , (java.math.BigDecimal)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 6 :
                  return conditional_P08YK8(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , (String)dynConstraints[97] , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , ((Number) dynConstraints[103]).shortValue() , ((Number) dynConstraints[104]).shortValue() , (String)dynConstraints[105] , (String)dynConstraints[106] , (java.math.BigDecimal)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 7 :
                  return conditional_P08YK9(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , ((Number) dynConstraints[103]).shortValue() , ((Number) dynConstraints[104]).shortValue() , (String)dynConstraints[105] , (String)dynConstraints[106] , (java.math.BigDecimal)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
            case 8 :
                  return conditional_P08YK10(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , ((Number) dynConstraints[103]).shortValue() , ((Number) dynConstraints[104]).shortValue() , (String)dynConstraints[105] , (String)dynConstraints[106] , (java.math.BigDecimal)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YK10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(21);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(22, 26);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 16);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 26);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(21);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
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
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[117]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 3);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 3);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[117]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[103]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 3);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[110]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[117]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[117]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[117]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 20);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
      }
   }

}

