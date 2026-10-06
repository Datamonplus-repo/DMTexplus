package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informemermasdetallado_wcgetfilterdata extends GXProcedure
{
   public informemermasdetallado_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informemermasdetallado_wcgetfilterdata.class ), "" );
   }

   public informemermasdetallado_wcgetfilterdata( int remoteHandle ,
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
      informemermasdetallado_wcgetfilterdata.this.aP5 = new String[] {""};
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
      informemermasdetallado_wcgetfilterdata.this.AV18DDOName = aP0;
      informemermasdetallado_wcgetfilterdata.this.AV16SearchTxt = aP1;
      informemermasdetallado_wcgetfilterdata.this.AV17SearchTxtTo = aP2;
      informemermasdetallado_wcgetfilterdata.this.aP3 = aP3;
      informemermasdetallado_wcgetfilterdata.this.aP4 = aP4;
      informemermasdetallado_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("InformeMermasDetallado_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeMermasDetallado_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("InformeMermasDetallado_WCGridState"), null, null);
      }
      AV112GXV1 = 1 ;
      while ( AV112GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV112GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV10TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV11TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV12TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV13TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV38TFBarTipArt = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarTipArt_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV96TFPedidoCliente = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV97TFPedidoCliente_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV40TFBarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV41TFBarSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV44TFBarColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV45TFBarColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV46TFBarNomCli = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV47TFBarNomCli_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV48TFBarColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV50TFBarFecCli = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV52TFBarKgm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFBarKgm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV54TFBarMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFBarMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV88Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL") == 0 )
         {
            AV34BarFecSal = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL_TO") == 0 )
         {
            AV35BarFecSal_to = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV64BarColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM_TO") == 0 )
         {
            AV65BarColNom_to = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV94BarColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM_TO") == 0 )
         {
            AV95BarColNum_to = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV62BarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER_TO") == 0 )
         {
            AV63BarSer_to = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV60CliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV61CliCod_to = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI") == 0 )
         {
            AV89BarEncCli = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI_TO") == 0 )
         {
            AV90BarEncCli_to = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPART") == 0 )
         {
            AV91BarTipArt = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPART_TO") == 0 )
         {
            AV93BarTipArt_to = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV112GXV1 = (int)(AV112GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCliNom = AV16SearchTxt ;
      AV11TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFBarNHdr_Sel ,
                                           AV12TFBarNHdr ,
                                           Short.valueOf(AV38TFBarTipArt) ,
                                           Short.valueOf(AV39TFBarTipArt_To) ,
                                           AV41TFBarSer_Sel ,
                                           AV40TFBarSer ,
                                           AV45TFBarColNom_Sel ,
                                           AV44TFBarColNom ,
                                           AV47TFBarNomCli_Sel ,
                                           AV46TFBarNomCli ,
                                           Integer.valueOf(AV48TFBarColNum) ,
                                           Integer.valueOf(AV49TFBarColNum_To) ,
                                           AV50TFBarFecCli ,
                                           AV52TFBarKgm ,
                                           AV53TFBarKgm_To ,
                                           AV54TFBarMtr ,
                                           AV55TFBarMtr_To ,
                                           AV34BarFecSal ,
                                           AV35BarFecSal_to ,
                                           Integer.valueOf(AV60CliCod) ,
                                           Integer.valueOf(AV61CliCod_to) ,
                                           AV62BarSer ,
                                           AV63BarSer_to ,
                                           AV64BarColNom ,
                                           AV65BarColNom_to ,
                                           Integer.valueOf(AV94BarColNum) ,
                                           Integer.valueOf(AV95BarColNum_to) ,
                                           Short.valueOf(AV91BarTipArt) ,
                                           Short.valueOf(AV93BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV97TFPedidoCliente_Sel ,
                                           AV96TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV89BarEncCli ,
                                           AV90BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           A396EmprCod ,
                                           AV88Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFBarNHdr = GXutil.padr( GXutil.rtrim( AV12TFBarNHdr), 11, "%") ;
      lV40TFBarSer = GXutil.padr( GXutil.rtrim( AV40TFBarSer), 16, "%") ;
      lV44TFBarColNom = GXutil.padr( GXutil.rtrim( AV44TFBarColNom), 13, "%") ;
      lV46TFBarNomCli = GXutil.padr( GXutil.rtrim( AV46TFBarNomCli), 13, "%") ;
      /* Using cursor P08FO3 */
      pr_default.execute(0, new Object[] {AV88Emprcod, Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV10TFCliNom, AV11TFCliNom_Sel, lV12TFBarNHdr, AV13TFBarNHdr_Sel, Short.valueOf(AV38TFBarTipArt), Short.valueOf(AV39TFBarTipArt_To), lV40TFBarSer, AV41TFBarSer_Sel, lV44TFBarColNom, AV45TFBarColNom_Sel, lV46TFBarNomCli, AV47TFBarNomCli_Sel, Integer.valueOf(AV48TFBarColNum), Integer.valueOf(AV49TFBarColNum_To), AV50TFBarFecCli, AV52TFBarKgm, AV53TFBarKgm_To, AV54TFBarMtr, AV55TFBarMtr_To, AV34BarFecSal, AV35BarFecSal_to, Integer.valueOf(AV60CliCod), Integer.valueOf(AV61CliCod_to), AV62BarSer, AV63BarSer_to, AV64BarColNom, AV65BarColNom_to, Integer.valueOf(AV94BarColNum), Integer.valueOf(AV95BarColNum_to), Short.valueOf(AV91BarTipArt), Short.valueOf(AV93BarTipArt_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8FO2 = false ;
         A279CliNom = P08FO3_A279CliNom[0] ;
         A213BarSit = P08FO3_A213BarSit[0] ;
         A161BarFecSal = P08FO3_A161BarFecSal[0] ;
         A155BarFecCli = P08FO3_A155BarFecCli[0] ;
         A136BarColNum = P08FO3_A136BarColNum[0] ;
         A1234BarNomCli = P08FO3_A1234BarNomCli[0] ;
         A135BarColNom = P08FO3_A135BarColNom[0] ;
         A212BarSer = P08FO3_A212BarSer[0] ;
         A217BarTipArt = P08FO3_A217BarTipArt[0] ;
         n217BarTipArt = P08FO3_n217BarTipArt[0] ;
         A252CliCod = P08FO3_A252CliCod[0] ;
         n252CliCod = P08FO3_n252CliCod[0] ;
         A184BarMtr = P08FO3_A184BarMtr[0] ;
         A166BarKgm = P08FO3_A166BarKgm[0] ;
         A130BarCodPar = P08FO3_A130BarCodPar[0] ;
         A132BarCodReo = P08FO3_A132BarCodReo[0] ;
         A129BarCod = P08FO3_A129BarCod[0] ;
         A143BarDisNum = P08FO3_A143BarDisNum[0] ;
         A4812BarEncCli = P08FO3_A4812BarEncCli[0] ;
         A396EmprCod = P08FO3_A396EmprCod[0] ;
         A279CliNom = P08FO3_A279CliNom[0] ;
         A184BarMtr = P08FO3_A184BarMtr[0] ;
         A166BarKgm = P08FO3_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         informemermasdetallado_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         informemermasdetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         informemermasdetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         informemermasdetallado_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV97TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV89BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV90BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     AV28count = 0 ;
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08FO3_A279CliNom[0], A279CliNom) == 0 ) )
                     {
                        brk8FO2 = false ;
                        A252CliCod = P08FO3_A252CliCod[0] ;
                        n252CliCod = P08FO3_n252CliCod[0] ;
                        A130BarCodPar = P08FO3_A130BarCodPar[0] ;
                        A132BarCodReo = P08FO3_A132BarCodReo[0] ;
                        A129BarCod = P08FO3_A129BarCod[0] ;
                        A396EmprCod = P08FO3_A396EmprCod[0] ;
                        AV28count = (long)(AV28count+1) ;
                        brk8FO2 = true ;
                        pr_default.readNext(0);
                     }
                     if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                     {
                        AV20Option = A279CliNom ;
                        AV21Options.add(AV20Option, 0);
                        AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV21Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8FO2 )
         {
            brk8FO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarNHdr = AV16SearchTxt ;
      AV13TFBarNHdr_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFBarNHdr_Sel ,
                                           AV12TFBarNHdr ,
                                           Short.valueOf(AV38TFBarTipArt) ,
                                           Short.valueOf(AV39TFBarTipArt_To) ,
                                           AV41TFBarSer_Sel ,
                                           AV40TFBarSer ,
                                           AV45TFBarColNom_Sel ,
                                           AV44TFBarColNom ,
                                           AV47TFBarNomCli_Sel ,
                                           AV46TFBarNomCli ,
                                           Integer.valueOf(AV48TFBarColNum) ,
                                           Integer.valueOf(AV49TFBarColNum_To) ,
                                           AV50TFBarFecCli ,
                                           AV52TFBarKgm ,
                                           AV53TFBarKgm_To ,
                                           AV54TFBarMtr ,
                                           AV55TFBarMtr_To ,
                                           AV34BarFecSal ,
                                           AV35BarFecSal_to ,
                                           Integer.valueOf(AV60CliCod) ,
                                           Integer.valueOf(AV61CliCod_to) ,
                                           AV62BarSer ,
                                           AV63BarSer_to ,
                                           AV64BarColNom ,
                                           AV65BarColNom_to ,
                                           Integer.valueOf(AV94BarColNum) ,
                                           Integer.valueOf(AV95BarColNum_to) ,
                                           Short.valueOf(AV91BarTipArt) ,
                                           Short.valueOf(AV93BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV97TFPedidoCliente_Sel ,
                                           AV96TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV89BarEncCli ,
                                           AV90BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV88Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFBarNHdr = GXutil.padr( GXutil.rtrim( AV12TFBarNHdr), 11, "%") ;
      lV40TFBarSer = GXutil.padr( GXutil.rtrim( AV40TFBarSer), 16, "%") ;
      lV44TFBarColNom = GXutil.padr( GXutil.rtrim( AV44TFBarColNom), 13, "%") ;
      lV46TFBarNomCli = GXutil.padr( GXutil.rtrim( AV46TFBarNomCli), 13, "%") ;
      /* Using cursor P08FO5 */
      pr_default.execute(1, new Object[] {AV88Emprcod, Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV10TFCliNom, AV11TFCliNom_Sel, lV12TFBarNHdr, AV13TFBarNHdr_Sel, Short.valueOf(AV38TFBarTipArt), Short.valueOf(AV39TFBarTipArt_To), lV40TFBarSer, AV41TFBarSer_Sel, lV44TFBarColNom, AV45TFBarColNom_Sel, lV46TFBarNomCli, AV47TFBarNomCli_Sel, Integer.valueOf(AV48TFBarColNum), Integer.valueOf(AV49TFBarColNum_To), AV50TFBarFecCli, AV52TFBarKgm, AV53TFBarKgm_To, AV54TFBarMtr, AV55TFBarMtr_To, AV34BarFecSal, AV35BarFecSal_to, Integer.valueOf(AV60CliCod), Integer.valueOf(AV61CliCod_to), AV62BarSer, AV63BarSer_to, AV64BarColNom, AV65BarColNom_to, Integer.valueOf(AV94BarColNum), Integer.valueOf(AV95BarColNum_to), Short.valueOf(AV91BarTipArt), Short.valueOf(AV93BarTipArt_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A213BarSit = P08FO5_A213BarSit[0] ;
         A161BarFecSal = P08FO5_A161BarFecSal[0] ;
         A155BarFecCli = P08FO5_A155BarFecCli[0] ;
         A136BarColNum = P08FO5_A136BarColNum[0] ;
         A1234BarNomCli = P08FO5_A1234BarNomCli[0] ;
         A135BarColNom = P08FO5_A135BarColNom[0] ;
         A212BarSer = P08FO5_A212BarSer[0] ;
         A217BarTipArt = P08FO5_A217BarTipArt[0] ;
         n217BarTipArt = P08FO5_n217BarTipArt[0] ;
         A279CliNom = P08FO5_A279CliNom[0] ;
         A252CliCod = P08FO5_A252CliCod[0] ;
         n252CliCod = P08FO5_n252CliCod[0] ;
         A184BarMtr = P08FO5_A184BarMtr[0] ;
         A166BarKgm = P08FO5_A166BarKgm[0] ;
         A130BarCodPar = P08FO5_A130BarCodPar[0] ;
         A132BarCodReo = P08FO5_A132BarCodReo[0] ;
         A129BarCod = P08FO5_A129BarCod[0] ;
         A143BarDisNum = P08FO5_A143BarDisNum[0] ;
         A4812BarEncCli = P08FO5_A4812BarEncCli[0] ;
         A396EmprCod = P08FO5_A396EmprCod[0] ;
         A279CliNom = P08FO5_A279CliNom[0] ;
         A184BarMtr = P08FO5_A184BarMtr[0] ;
         A166BarKgm = P08FO5_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         informemermasdetallado_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         informemermasdetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         informemermasdetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         informemermasdetallado_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV97TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV89BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV90BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                     {
                        AV20Option = A13696BarNHdr ;
                        AV19InsertIndex = 1 ;
                        while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
                        {
                           AV19InsertIndex = (int)(AV19InsertIndex+1) ;
                        }
                        if ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) == 0 ) )
                        {
                           AV28count = GXutil.lval( (String)AV26OptionIndexes.elementAt(-1+AV19InsertIndex)) ;
                           AV28count = (long)(AV28count+1) ;
                           AV26OptionIndexes.removeItem(AV19InsertIndex);
                           AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
                        }
                        else
                        {
                           AV21Options.add(AV20Option, AV19InsertIndex);
                           AV26OptionIndexes.add("1", AV19InsertIndex);
                        }
                     }
                     if ( AV21Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
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
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV96TFPedidoCliente = AV16SearchTxt ;
      AV97TFPedidoCliente_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFBarNHdr_Sel ,
                                           AV12TFBarNHdr ,
                                           Short.valueOf(AV38TFBarTipArt) ,
                                           Short.valueOf(AV39TFBarTipArt_To) ,
                                           AV41TFBarSer_Sel ,
                                           AV40TFBarSer ,
                                           AV45TFBarColNom_Sel ,
                                           AV44TFBarColNom ,
                                           AV47TFBarNomCli_Sel ,
                                           AV46TFBarNomCli ,
                                           Integer.valueOf(AV48TFBarColNum) ,
                                           Integer.valueOf(AV49TFBarColNum_To) ,
                                           AV50TFBarFecCli ,
                                           AV52TFBarKgm ,
                                           AV53TFBarKgm_To ,
                                           AV54TFBarMtr ,
                                           AV55TFBarMtr_To ,
                                           AV34BarFecSal ,
                                           AV35BarFecSal_to ,
                                           Integer.valueOf(AV60CliCod) ,
                                           Integer.valueOf(AV61CliCod_to) ,
                                           AV62BarSer ,
                                           AV63BarSer_to ,
                                           AV64BarColNom ,
                                           AV65BarColNom_to ,
                                           Integer.valueOf(AV94BarColNum) ,
                                           Integer.valueOf(AV95BarColNum_to) ,
                                           Short.valueOf(AV91BarTipArt) ,
                                           Short.valueOf(AV93BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV97TFPedidoCliente_Sel ,
                                           AV96TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV89BarEncCli ,
                                           AV90BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV88Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFBarNHdr = GXutil.padr( GXutil.rtrim( AV12TFBarNHdr), 11, "%") ;
      lV40TFBarSer = GXutil.padr( GXutil.rtrim( AV40TFBarSer), 16, "%") ;
      lV44TFBarColNom = GXutil.padr( GXutil.rtrim( AV44TFBarColNom), 13, "%") ;
      lV46TFBarNomCli = GXutil.padr( GXutil.rtrim( AV46TFBarNomCli), 13, "%") ;
      /* Using cursor P08FO7 */
      pr_default.execute(2, new Object[] {AV88Emprcod, Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV10TFCliNom, AV11TFCliNom_Sel, lV12TFBarNHdr, AV13TFBarNHdr_Sel, Short.valueOf(AV38TFBarTipArt), Short.valueOf(AV39TFBarTipArt_To), lV40TFBarSer, AV41TFBarSer_Sel, lV44TFBarColNom, AV45TFBarColNom_Sel, lV46TFBarNomCli, AV47TFBarNomCli_Sel, Integer.valueOf(AV48TFBarColNum), Integer.valueOf(AV49TFBarColNum_To), AV50TFBarFecCli, AV52TFBarKgm, AV53TFBarKgm_To, AV54TFBarMtr, AV55TFBarMtr_To, AV34BarFecSal, AV35BarFecSal_to, Integer.valueOf(AV60CliCod), Integer.valueOf(AV61CliCod_to), AV62BarSer, AV63BarSer_to, AV64BarColNom, AV65BarColNom_to, Integer.valueOf(AV94BarColNum), Integer.valueOf(AV95BarColNum_to), Short.valueOf(AV91BarTipArt), Short.valueOf(AV93BarTipArt_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A213BarSit = P08FO7_A213BarSit[0] ;
         A161BarFecSal = P08FO7_A161BarFecSal[0] ;
         A155BarFecCli = P08FO7_A155BarFecCli[0] ;
         A136BarColNum = P08FO7_A136BarColNum[0] ;
         A1234BarNomCli = P08FO7_A1234BarNomCli[0] ;
         A135BarColNom = P08FO7_A135BarColNom[0] ;
         A212BarSer = P08FO7_A212BarSer[0] ;
         A217BarTipArt = P08FO7_A217BarTipArt[0] ;
         n217BarTipArt = P08FO7_n217BarTipArt[0] ;
         A279CliNom = P08FO7_A279CliNom[0] ;
         A252CliCod = P08FO7_A252CliCod[0] ;
         n252CliCod = P08FO7_n252CliCod[0] ;
         A184BarMtr = P08FO7_A184BarMtr[0] ;
         A166BarKgm = P08FO7_A166BarKgm[0] ;
         A130BarCodPar = P08FO7_A130BarCodPar[0] ;
         A132BarCodReo = P08FO7_A132BarCodReo[0] ;
         A129BarCod = P08FO7_A129BarCod[0] ;
         A143BarDisNum = P08FO7_A143BarDisNum[0] ;
         A4812BarEncCli = P08FO7_A4812BarEncCli[0] ;
         A396EmprCod = P08FO7_A396EmprCod[0] ;
         A279CliNom = P08FO7_A279CliNom[0] ;
         A184BarMtr = P08FO7_A184BarMtr[0] ;
         A166BarKgm = P08FO7_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         informemermasdetallado_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         informemermasdetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         informemermasdetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         informemermasdetallado_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV97TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV89BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV90BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                     {
                        AV20Option = A13878PedidoClie ;
                        AV19InsertIndex = 1 ;
                        while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
                        {
                           AV19InsertIndex = (int)(AV19InsertIndex+1) ;
                        }
                        if ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) == 0 ) )
                        {
                           AV28count = GXutil.lval( (String)AV26OptionIndexes.elementAt(-1+AV19InsertIndex)) ;
                           AV28count = (long)(AV28count+1) ;
                           AV26OptionIndexes.removeItem(AV19InsertIndex);
                           AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
                        }
                        else
                        {
                           AV21Options.add(AV20Option, AV19InsertIndex);
                           AV26OptionIndexes.add("1", AV19InsertIndex);
                        }
                     }
                     if ( AV21Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
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
      AV40TFBarSer = AV16SearchTxt ;
      AV41TFBarSer_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFBarNHdr_Sel ,
                                           AV12TFBarNHdr ,
                                           Short.valueOf(AV38TFBarTipArt) ,
                                           Short.valueOf(AV39TFBarTipArt_To) ,
                                           AV41TFBarSer_Sel ,
                                           AV40TFBarSer ,
                                           AV45TFBarColNom_Sel ,
                                           AV44TFBarColNom ,
                                           AV47TFBarNomCli_Sel ,
                                           AV46TFBarNomCli ,
                                           Integer.valueOf(AV48TFBarColNum) ,
                                           Integer.valueOf(AV49TFBarColNum_To) ,
                                           AV50TFBarFecCli ,
                                           AV52TFBarKgm ,
                                           AV53TFBarKgm_To ,
                                           AV54TFBarMtr ,
                                           AV55TFBarMtr_To ,
                                           AV34BarFecSal ,
                                           AV35BarFecSal_to ,
                                           Integer.valueOf(AV60CliCod) ,
                                           Integer.valueOf(AV61CliCod_to) ,
                                           AV62BarSer ,
                                           AV63BarSer_to ,
                                           AV64BarColNom ,
                                           AV65BarColNom_to ,
                                           Integer.valueOf(AV94BarColNum) ,
                                           Integer.valueOf(AV95BarColNum_to) ,
                                           Short.valueOf(AV91BarTipArt) ,
                                           Short.valueOf(AV93BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV97TFPedidoCliente_Sel ,
                                           AV96TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV89BarEncCli ,
                                           AV90BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV88Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFBarNHdr = GXutil.padr( GXutil.rtrim( AV12TFBarNHdr), 11, "%") ;
      lV40TFBarSer = GXutil.padr( GXutil.rtrim( AV40TFBarSer), 16, "%") ;
      lV44TFBarColNom = GXutil.padr( GXutil.rtrim( AV44TFBarColNom), 13, "%") ;
      lV46TFBarNomCli = GXutil.padr( GXutil.rtrim( AV46TFBarNomCli), 13, "%") ;
      /* Using cursor P08FO9 */
      pr_default.execute(3, new Object[] {AV88Emprcod, Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV10TFCliNom, AV11TFCliNom_Sel, lV12TFBarNHdr, AV13TFBarNHdr_Sel, Short.valueOf(AV38TFBarTipArt), Short.valueOf(AV39TFBarTipArt_To), lV40TFBarSer, AV41TFBarSer_Sel, lV44TFBarColNom, AV45TFBarColNom_Sel, lV46TFBarNomCli, AV47TFBarNomCli_Sel, Integer.valueOf(AV48TFBarColNum), Integer.valueOf(AV49TFBarColNum_To), AV50TFBarFecCli, AV52TFBarKgm, AV53TFBarKgm_To, AV54TFBarMtr, AV55TFBarMtr_To, AV34BarFecSal, AV35BarFecSal_to, Integer.valueOf(AV60CliCod), Integer.valueOf(AV61CliCod_to), AV62BarSer, AV63BarSer_to, AV64BarColNom, AV65BarColNom_to, Integer.valueOf(AV94BarColNum), Integer.valueOf(AV95BarColNum_to), Short.valueOf(AV91BarTipArt), Short.valueOf(AV93BarTipArt_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8FO6 = false ;
         A212BarSer = P08FO9_A212BarSer[0] ;
         A213BarSit = P08FO9_A213BarSit[0] ;
         A161BarFecSal = P08FO9_A161BarFecSal[0] ;
         A155BarFecCli = P08FO9_A155BarFecCli[0] ;
         A136BarColNum = P08FO9_A136BarColNum[0] ;
         A1234BarNomCli = P08FO9_A1234BarNomCli[0] ;
         A135BarColNom = P08FO9_A135BarColNom[0] ;
         A217BarTipArt = P08FO9_A217BarTipArt[0] ;
         n217BarTipArt = P08FO9_n217BarTipArt[0] ;
         A279CliNom = P08FO9_A279CliNom[0] ;
         A252CliCod = P08FO9_A252CliCod[0] ;
         n252CliCod = P08FO9_n252CliCod[0] ;
         A184BarMtr = P08FO9_A184BarMtr[0] ;
         A166BarKgm = P08FO9_A166BarKgm[0] ;
         A130BarCodPar = P08FO9_A130BarCodPar[0] ;
         A132BarCodReo = P08FO9_A132BarCodReo[0] ;
         A129BarCod = P08FO9_A129BarCod[0] ;
         A143BarDisNum = P08FO9_A143BarDisNum[0] ;
         A4812BarEncCli = P08FO9_A4812BarEncCli[0] ;
         A396EmprCod = P08FO9_A396EmprCod[0] ;
         A279CliNom = P08FO9_A279CliNom[0] ;
         A184BarMtr = P08FO9_A184BarMtr[0] ;
         A166BarKgm = P08FO9_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         informemermasdetallado_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         informemermasdetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         informemermasdetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         informemermasdetallado_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV97TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV89BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV90BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     AV28count = 0 ;
                     while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08FO9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08FO9_A212BarSer[0], A212BarSer) == 0 ) )
                     {
                        brk8FO6 = false ;
                        A130BarCodPar = P08FO9_A130BarCodPar[0] ;
                        A132BarCodReo = P08FO9_A132BarCodReo[0] ;
                        A129BarCod = P08FO9_A129BarCod[0] ;
                        AV28count = (long)(AV28count+1) ;
                        brk8FO6 = true ;
                        pr_default.readNext(3);
                     }
                     if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                     {
                        AV20Option = A212BarSer ;
                        AV21Options.add(AV20Option, 0);
                        AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV21Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8FO6 )
         {
            brk8FO6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV44TFBarColNom = AV16SearchTxt ;
      AV45TFBarColNom_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFBarNHdr_Sel ,
                                           AV12TFBarNHdr ,
                                           Short.valueOf(AV38TFBarTipArt) ,
                                           Short.valueOf(AV39TFBarTipArt_To) ,
                                           AV41TFBarSer_Sel ,
                                           AV40TFBarSer ,
                                           AV45TFBarColNom_Sel ,
                                           AV44TFBarColNom ,
                                           AV47TFBarNomCli_Sel ,
                                           AV46TFBarNomCli ,
                                           Integer.valueOf(AV48TFBarColNum) ,
                                           Integer.valueOf(AV49TFBarColNum_To) ,
                                           AV50TFBarFecCli ,
                                           AV52TFBarKgm ,
                                           AV53TFBarKgm_To ,
                                           AV54TFBarMtr ,
                                           AV55TFBarMtr_To ,
                                           AV34BarFecSal ,
                                           AV35BarFecSal_to ,
                                           Integer.valueOf(AV60CliCod) ,
                                           Integer.valueOf(AV61CliCod_to) ,
                                           AV62BarSer ,
                                           AV63BarSer_to ,
                                           AV64BarColNom ,
                                           AV65BarColNom_to ,
                                           Integer.valueOf(AV94BarColNum) ,
                                           Integer.valueOf(AV95BarColNum_to) ,
                                           Short.valueOf(AV91BarTipArt) ,
                                           Short.valueOf(AV93BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV97TFPedidoCliente_Sel ,
                                           AV96TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV89BarEncCli ,
                                           AV90BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           A396EmprCod ,
                                           AV88Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFBarNHdr = GXutil.padr( GXutil.rtrim( AV12TFBarNHdr), 11, "%") ;
      lV40TFBarSer = GXutil.padr( GXutil.rtrim( AV40TFBarSer), 16, "%") ;
      lV44TFBarColNom = GXutil.padr( GXutil.rtrim( AV44TFBarColNom), 13, "%") ;
      lV46TFBarNomCli = GXutil.padr( GXutil.rtrim( AV46TFBarNomCli), 13, "%") ;
      /* Using cursor P08FO11 */
      pr_default.execute(4, new Object[] {AV88Emprcod, Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV10TFCliNom, AV11TFCliNom_Sel, lV12TFBarNHdr, AV13TFBarNHdr_Sel, Short.valueOf(AV38TFBarTipArt), Short.valueOf(AV39TFBarTipArt_To), lV40TFBarSer, AV41TFBarSer_Sel, lV44TFBarColNom, AV45TFBarColNom_Sel, lV46TFBarNomCli, AV47TFBarNomCli_Sel, Integer.valueOf(AV48TFBarColNum), Integer.valueOf(AV49TFBarColNum_To), AV50TFBarFecCli, AV52TFBarKgm, AV53TFBarKgm_To, AV54TFBarMtr, AV55TFBarMtr_To, AV34BarFecSal, AV35BarFecSal_to, Integer.valueOf(AV60CliCod), Integer.valueOf(AV61CliCod_to), AV62BarSer, AV63BarSer_to, AV64BarColNom, AV65BarColNom_to, Integer.valueOf(AV94BarColNum), Integer.valueOf(AV95BarColNum_to), Short.valueOf(AV91BarTipArt), Short.valueOf(AV93BarTipArt_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8FO8 = false ;
         A135BarColNom = P08FO11_A135BarColNom[0] ;
         A213BarSit = P08FO11_A213BarSit[0] ;
         A161BarFecSal = P08FO11_A161BarFecSal[0] ;
         A155BarFecCli = P08FO11_A155BarFecCli[0] ;
         A136BarColNum = P08FO11_A136BarColNum[0] ;
         A1234BarNomCli = P08FO11_A1234BarNomCli[0] ;
         A212BarSer = P08FO11_A212BarSer[0] ;
         A217BarTipArt = P08FO11_A217BarTipArt[0] ;
         n217BarTipArt = P08FO11_n217BarTipArt[0] ;
         A279CliNom = P08FO11_A279CliNom[0] ;
         A252CliCod = P08FO11_A252CliCod[0] ;
         n252CliCod = P08FO11_n252CliCod[0] ;
         A184BarMtr = P08FO11_A184BarMtr[0] ;
         A166BarKgm = P08FO11_A166BarKgm[0] ;
         A130BarCodPar = P08FO11_A130BarCodPar[0] ;
         A132BarCodReo = P08FO11_A132BarCodReo[0] ;
         A129BarCod = P08FO11_A129BarCod[0] ;
         A143BarDisNum = P08FO11_A143BarDisNum[0] ;
         A4812BarEncCli = P08FO11_A4812BarEncCli[0] ;
         A396EmprCod = P08FO11_A396EmprCod[0] ;
         A279CliNom = P08FO11_A279CliNom[0] ;
         A184BarMtr = P08FO11_A184BarMtr[0] ;
         A166BarKgm = P08FO11_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         informemermasdetallado_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         informemermasdetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         informemermasdetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         informemermasdetallado_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV97TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV89BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV90BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     AV28count = 0 ;
                     while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08FO11_A135BarColNom[0], A135BarColNom) == 0 ) )
                     {
                        brk8FO8 = false ;
                        A130BarCodPar = P08FO11_A130BarCodPar[0] ;
                        A132BarCodReo = P08FO11_A132BarCodReo[0] ;
                        A129BarCod = P08FO11_A129BarCod[0] ;
                        A396EmprCod = P08FO11_A396EmprCod[0] ;
                        AV28count = (long)(AV28count+1) ;
                        brk8FO8 = true ;
                        pr_default.readNext(4);
                     }
                     if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                     {
                        AV20Option = A135BarColNom ;
                        AV21Options.add(AV20Option, 0);
                        AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV21Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8FO8 )
         {
            brk8FO8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarNomCli = AV16SearchTxt ;
      AV47TFBarNomCli_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV11TFCliNom_Sel ,
                                           AV10TFCliNom ,
                                           AV13TFBarNHdr_Sel ,
                                           AV12TFBarNHdr ,
                                           Short.valueOf(AV38TFBarTipArt) ,
                                           Short.valueOf(AV39TFBarTipArt_To) ,
                                           AV41TFBarSer_Sel ,
                                           AV40TFBarSer ,
                                           AV45TFBarColNom_Sel ,
                                           AV44TFBarColNom ,
                                           AV47TFBarNomCli_Sel ,
                                           AV46TFBarNomCli ,
                                           Integer.valueOf(AV48TFBarColNum) ,
                                           Integer.valueOf(AV49TFBarColNum_To) ,
                                           AV50TFBarFecCli ,
                                           AV52TFBarKgm ,
                                           AV53TFBarKgm_To ,
                                           AV54TFBarMtr ,
                                           AV55TFBarMtr_To ,
                                           AV34BarFecSal ,
                                           AV35BarFecSal_to ,
                                           Integer.valueOf(AV60CliCod) ,
                                           Integer.valueOf(AV61CliCod_to) ,
                                           AV62BarSer ,
                                           AV63BarSer_to ,
                                           AV64BarColNom ,
                                           AV65BarColNom_to ,
                                           Integer.valueOf(AV94BarColNum) ,
                                           Integer.valueOf(AV95BarColNum_to) ,
                                           Short.valueOf(AV91BarTipArt) ,
                                           Short.valueOf(AV93BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           AV97TFPedidoCliente_Sel ,
                                           AV96TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV89BarEncCli ,
                                           AV90BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           A396EmprCod ,
                                           AV88Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCliNom = GXutil.padr( GXutil.rtrim( AV10TFCliNom), 30, "%") ;
      lV12TFBarNHdr = GXutil.padr( GXutil.rtrim( AV12TFBarNHdr), 11, "%") ;
      lV40TFBarSer = GXutil.padr( GXutil.rtrim( AV40TFBarSer), 16, "%") ;
      lV44TFBarColNom = GXutil.padr( GXutil.rtrim( AV44TFBarColNom), 13, "%") ;
      lV46TFBarNomCli = GXutil.padr( GXutil.rtrim( AV46TFBarNomCli), 13, "%") ;
      /* Using cursor P08FO13 */
      pr_default.execute(5, new Object[] {AV88Emprcod, Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV10TFCliNom, AV11TFCliNom_Sel, lV12TFBarNHdr, AV13TFBarNHdr_Sel, Short.valueOf(AV38TFBarTipArt), Short.valueOf(AV39TFBarTipArt_To), lV40TFBarSer, AV41TFBarSer_Sel, lV44TFBarColNom, AV45TFBarColNom_Sel, lV46TFBarNomCli, AV47TFBarNomCli_Sel, Integer.valueOf(AV48TFBarColNum), Integer.valueOf(AV49TFBarColNum_To), AV50TFBarFecCli, AV52TFBarKgm, AV53TFBarKgm_To, AV54TFBarMtr, AV55TFBarMtr_To, AV34BarFecSal, AV35BarFecSal_to, Integer.valueOf(AV60CliCod), Integer.valueOf(AV61CliCod_to), AV62BarSer, AV63BarSer_to, AV64BarColNom, AV65BarColNom_to, Integer.valueOf(AV94BarColNum), Integer.valueOf(AV95BarColNum_to), Short.valueOf(AV91BarTipArt), Short.valueOf(AV93BarTipArt_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8FO10 = false ;
         A1234BarNomCli = P08FO13_A1234BarNomCli[0] ;
         A213BarSit = P08FO13_A213BarSit[0] ;
         A161BarFecSal = P08FO13_A161BarFecSal[0] ;
         A155BarFecCli = P08FO13_A155BarFecCli[0] ;
         A136BarColNum = P08FO13_A136BarColNum[0] ;
         A135BarColNom = P08FO13_A135BarColNom[0] ;
         A212BarSer = P08FO13_A212BarSer[0] ;
         A217BarTipArt = P08FO13_A217BarTipArt[0] ;
         n217BarTipArt = P08FO13_n217BarTipArt[0] ;
         A279CliNom = P08FO13_A279CliNom[0] ;
         A252CliCod = P08FO13_A252CliCod[0] ;
         n252CliCod = P08FO13_n252CliCod[0] ;
         A184BarMtr = P08FO13_A184BarMtr[0] ;
         A166BarKgm = P08FO13_A166BarKgm[0] ;
         A130BarCodPar = P08FO13_A130BarCodPar[0] ;
         A132BarCodReo = P08FO13_A132BarCodReo[0] ;
         A129BarCod = P08FO13_A129BarCod[0] ;
         A143BarDisNum = P08FO13_A143BarDisNum[0] ;
         A4812BarEncCli = P08FO13_A4812BarEncCli[0] ;
         A396EmprCod = P08FO13_A396EmprCod[0] ;
         A279CliNom = P08FO13_A279CliNom[0] ;
         A184BarMtr = P08FO13_A184BarMtr[0] ;
         A166BarKgm = P08FO13_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         informemermasdetallado_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         informemermasdetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         informemermasdetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         informemermasdetallado_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV96TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV96TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV97TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV97TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV89BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV90BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV90BarEncCli_to) <= 0 ) ) )
                  {
                     A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                     AV28count = 0 ;
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08FO13_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
                     {
                        brk8FO10 = false ;
                        A130BarCodPar = P08FO13_A130BarCodPar[0] ;
                        A132BarCodReo = P08FO13_A132BarCodReo[0] ;
                        A129BarCod = P08FO13_A129BarCod[0] ;
                        A396EmprCod = P08FO13_A396EmprCod[0] ;
                        AV28count = (long)(AV28count+1) ;
                        brk8FO10 = true ;
                        pr_default.readNext(5);
                     }
                     if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
                     {
                        AV20Option = A1234BarNomCli ;
                        AV21Options.add(AV20Option, 0);
                        AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV21Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8FO10 )
         {
            brk8FO10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = informemermasdetallado_wcgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = informemermasdetallado_wcgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = informemermasdetallado_wcgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFCliNom = "" ;
      AV11TFCliNom_Sel = "" ;
      AV12TFBarNHdr = "" ;
      AV13TFBarNHdr_Sel = "" ;
      AV96TFPedidoCliente = "" ;
      AV97TFPedidoCliente_Sel = "" ;
      AV40TFBarSer = "" ;
      AV41TFBarSer_Sel = "" ;
      AV44TFBarColNom = "" ;
      AV45TFBarColNom_Sel = "" ;
      AV46TFBarNomCli = "" ;
      AV47TFBarNomCli_Sel = "" ;
      AV50TFBarFecCli = GXutil.nullDate() ;
      AV52TFBarKgm = DecimalUtil.ZERO ;
      AV53TFBarKgm_To = DecimalUtil.ZERO ;
      AV54TFBarMtr = DecimalUtil.ZERO ;
      AV55TFBarMtr_To = DecimalUtil.ZERO ;
      AV88Emprcod = "" ;
      AV34BarFecSal = GXutil.nullDate() ;
      AV35BarFecSal_to = GXutil.nullDate() ;
      AV64BarColNom = "" ;
      AV65BarColNom_to = "" ;
      AV62BarSer = "" ;
      AV63BarSer_to = "" ;
      AV89BarEncCli = "" ;
      AV90BarEncCli_to = "" ;
      scmdbuf = "" ;
      lV10TFCliNom = "" ;
      lV12TFBarNHdr = "" ;
      lV40TFBarSer = "" ;
      lV44TFBarColNom = "" ;
      lV46TFBarNomCli = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      A13878PedidoClie = "" ;
      A396EmprCod = "" ;
      P08FO3_A279CliNom = new String[] {""} ;
      P08FO3_A213BarSit = new byte[1] ;
      P08FO3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO3_A136BarColNum = new int[1] ;
      P08FO3_A1234BarNomCli = new String[] {""} ;
      P08FO3_A135BarColNom = new String[] {""} ;
      P08FO3_A212BarSer = new String[] {""} ;
      P08FO3_A217BarTipArt = new short[1] ;
      P08FO3_n217BarTipArt = new boolean[] {false} ;
      P08FO3_A252CliCod = new int[1] ;
      P08FO3_n252CliCod = new boolean[] {false} ;
      P08FO3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO3_A130BarCodPar = new String[] {""} ;
      P08FO3_A132BarCodReo = new byte[1] ;
      P08FO3_A129BarCod = new int[1] ;
      P08FO3_A143BarDisNum = new String[] {""} ;
      P08FO3_A4812BarEncCli = new String[] {""} ;
      P08FO3_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13696BarNHdr = "" ;
      AV20Option = "" ;
      P08FO5_A213BarSit = new byte[1] ;
      P08FO5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO5_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO5_A136BarColNum = new int[1] ;
      P08FO5_A1234BarNomCli = new String[] {""} ;
      P08FO5_A135BarColNom = new String[] {""} ;
      P08FO5_A212BarSer = new String[] {""} ;
      P08FO5_A217BarTipArt = new short[1] ;
      P08FO5_n217BarTipArt = new boolean[] {false} ;
      P08FO5_A279CliNom = new String[] {""} ;
      P08FO5_A252CliCod = new int[1] ;
      P08FO5_n252CliCod = new boolean[] {false} ;
      P08FO5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO5_A130BarCodPar = new String[] {""} ;
      P08FO5_A132BarCodReo = new byte[1] ;
      P08FO5_A129BarCod = new int[1] ;
      P08FO5_A143BarDisNum = new String[] {""} ;
      P08FO5_A4812BarEncCli = new String[] {""} ;
      P08FO5_A396EmprCod = new String[] {""} ;
      P08FO7_A213BarSit = new byte[1] ;
      P08FO7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO7_A136BarColNum = new int[1] ;
      P08FO7_A1234BarNomCli = new String[] {""} ;
      P08FO7_A135BarColNom = new String[] {""} ;
      P08FO7_A212BarSer = new String[] {""} ;
      P08FO7_A217BarTipArt = new short[1] ;
      P08FO7_n217BarTipArt = new boolean[] {false} ;
      P08FO7_A279CliNom = new String[] {""} ;
      P08FO7_A252CliCod = new int[1] ;
      P08FO7_n252CliCod = new boolean[] {false} ;
      P08FO7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO7_A130BarCodPar = new String[] {""} ;
      P08FO7_A132BarCodReo = new byte[1] ;
      P08FO7_A129BarCod = new int[1] ;
      P08FO7_A143BarDisNum = new String[] {""} ;
      P08FO7_A4812BarEncCli = new String[] {""} ;
      P08FO7_A396EmprCod = new String[] {""} ;
      P08FO9_A212BarSer = new String[] {""} ;
      P08FO9_A213BarSit = new byte[1] ;
      P08FO9_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO9_A136BarColNum = new int[1] ;
      P08FO9_A1234BarNomCli = new String[] {""} ;
      P08FO9_A135BarColNom = new String[] {""} ;
      P08FO9_A217BarTipArt = new short[1] ;
      P08FO9_n217BarTipArt = new boolean[] {false} ;
      P08FO9_A279CliNom = new String[] {""} ;
      P08FO9_A252CliCod = new int[1] ;
      P08FO9_n252CliCod = new boolean[] {false} ;
      P08FO9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO9_A130BarCodPar = new String[] {""} ;
      P08FO9_A132BarCodReo = new byte[1] ;
      P08FO9_A129BarCod = new int[1] ;
      P08FO9_A143BarDisNum = new String[] {""} ;
      P08FO9_A4812BarEncCli = new String[] {""} ;
      P08FO9_A396EmprCod = new String[] {""} ;
      P08FO11_A135BarColNom = new String[] {""} ;
      P08FO11_A213BarSit = new byte[1] ;
      P08FO11_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO11_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO11_A136BarColNum = new int[1] ;
      P08FO11_A1234BarNomCli = new String[] {""} ;
      P08FO11_A212BarSer = new String[] {""} ;
      P08FO11_A217BarTipArt = new short[1] ;
      P08FO11_n217BarTipArt = new boolean[] {false} ;
      P08FO11_A279CliNom = new String[] {""} ;
      P08FO11_A252CliCod = new int[1] ;
      P08FO11_n252CliCod = new boolean[] {false} ;
      P08FO11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO11_A130BarCodPar = new String[] {""} ;
      P08FO11_A132BarCodReo = new byte[1] ;
      P08FO11_A129BarCod = new int[1] ;
      P08FO11_A143BarDisNum = new String[] {""} ;
      P08FO11_A4812BarEncCli = new String[] {""} ;
      P08FO11_A396EmprCod = new String[] {""} ;
      P08FO13_A1234BarNomCli = new String[] {""} ;
      P08FO13_A213BarSit = new byte[1] ;
      P08FO13_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO13_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FO13_A136BarColNum = new int[1] ;
      P08FO13_A135BarColNom = new String[] {""} ;
      P08FO13_A212BarSer = new String[] {""} ;
      P08FO13_A217BarTipArt = new short[1] ;
      P08FO13_n217BarTipArt = new boolean[] {false} ;
      P08FO13_A279CliNom = new String[] {""} ;
      P08FO13_A252CliCod = new int[1] ;
      P08FO13_n252CliCod = new boolean[] {false} ;
      P08FO13_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FO13_A130BarCodPar = new String[] {""} ;
      P08FO13_A132BarCodReo = new byte[1] ;
      P08FO13_A129BarCod = new int[1] ;
      P08FO13_A143BarDisNum = new String[] {""} ;
      P08FO13_A4812BarEncCli = new String[] {""} ;
      P08FO13_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informemermasdetallado_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08FO3_A279CliNom, P08FO3_A213BarSit, P08FO3_A161BarFecSal, P08FO3_A155BarFecCli, P08FO3_A136BarColNum, P08FO3_A1234BarNomCli, P08FO3_A135BarColNom, P08FO3_A212BarSer, P08FO3_A217BarTipArt, P08FO3_n217BarTipArt,
            P08FO3_A252CliCod, P08FO3_n252CliCod, P08FO3_A184BarMtr, P08FO3_A166BarKgm, P08FO3_A130BarCodPar, P08FO3_A132BarCodReo, P08FO3_A129BarCod, P08FO3_A143BarDisNum, P08FO3_A4812BarEncCli, P08FO3_A396EmprCod
            }
            , new Object[] {
            P08FO5_A213BarSit, P08FO5_A161BarFecSal, P08FO5_A155BarFecCli, P08FO5_A136BarColNum, P08FO5_A1234BarNomCli, P08FO5_A135BarColNom, P08FO5_A212BarSer, P08FO5_A217BarTipArt, P08FO5_n217BarTipArt, P08FO5_A279CliNom,
            P08FO5_A252CliCod, P08FO5_n252CliCod, P08FO5_A184BarMtr, P08FO5_A166BarKgm, P08FO5_A130BarCodPar, P08FO5_A132BarCodReo, P08FO5_A129BarCod, P08FO5_A143BarDisNum, P08FO5_A4812BarEncCli, P08FO5_A396EmprCod
            }
            , new Object[] {
            P08FO7_A213BarSit, P08FO7_A161BarFecSal, P08FO7_A155BarFecCli, P08FO7_A136BarColNum, P08FO7_A1234BarNomCli, P08FO7_A135BarColNom, P08FO7_A212BarSer, P08FO7_A217BarTipArt, P08FO7_n217BarTipArt, P08FO7_A279CliNom,
            P08FO7_A252CliCod, P08FO7_n252CliCod, P08FO7_A184BarMtr, P08FO7_A166BarKgm, P08FO7_A130BarCodPar, P08FO7_A132BarCodReo, P08FO7_A129BarCod, P08FO7_A143BarDisNum, P08FO7_A4812BarEncCli, P08FO7_A396EmprCod
            }
            , new Object[] {
            P08FO9_A212BarSer, P08FO9_A213BarSit, P08FO9_A161BarFecSal, P08FO9_A155BarFecCli, P08FO9_A136BarColNum, P08FO9_A1234BarNomCli, P08FO9_A135BarColNom, P08FO9_A217BarTipArt, P08FO9_n217BarTipArt, P08FO9_A279CliNom,
            P08FO9_A252CliCod, P08FO9_n252CliCod, P08FO9_A184BarMtr, P08FO9_A166BarKgm, P08FO9_A130BarCodPar, P08FO9_A132BarCodReo, P08FO9_A129BarCod, P08FO9_A143BarDisNum, P08FO9_A4812BarEncCli, P08FO9_A396EmprCod
            }
            , new Object[] {
            P08FO11_A135BarColNom, P08FO11_A213BarSit, P08FO11_A161BarFecSal, P08FO11_A155BarFecCli, P08FO11_A136BarColNum, P08FO11_A1234BarNomCli, P08FO11_A212BarSer, P08FO11_A217BarTipArt, P08FO11_n217BarTipArt, P08FO11_A279CliNom,
            P08FO11_A252CliCod, P08FO11_n252CliCod, P08FO11_A184BarMtr, P08FO11_A166BarKgm, P08FO11_A130BarCodPar, P08FO11_A132BarCodReo, P08FO11_A129BarCod, P08FO11_A143BarDisNum, P08FO11_A4812BarEncCli, P08FO11_A396EmprCod
            }
            , new Object[] {
            P08FO13_A1234BarNomCli, P08FO13_A213BarSit, P08FO13_A161BarFecSal, P08FO13_A155BarFecCli, P08FO13_A136BarColNum, P08FO13_A135BarColNom, P08FO13_A212BarSer, P08FO13_A217BarTipArt, P08FO13_n217BarTipArt, P08FO13_A279CliNom,
            P08FO13_A252CliCod, P08FO13_n252CliCod, P08FO13_A184BarMtr, P08FO13_A166BarKgm, P08FO13_A130BarCodPar, P08FO13_A132BarCodReo, P08FO13_A129BarCod, P08FO13_A143BarDisNum, P08FO13_A4812BarEncCli, P08FO13_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV38TFBarTipArt ;
   private short AV39TFBarTipArt_To ;
   private short AV91BarTipArt ;
   private short AV93BarTipArt_to ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV112GXV1 ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV48TFBarColNum ;
   private int AV49TFBarColNum_To ;
   private int AV94BarColNum ;
   private int AV95BarColNum_to ;
   private int AV60CliCod ;
   private int AV61CliCod_to ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV52TFBarKgm ;
   private java.math.BigDecimal AV53TFBarKgm_To ;
   private java.math.BigDecimal AV54TFBarMtr ;
   private java.math.BigDecimal AV55TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV10TFCliNom ;
   private String AV11TFCliNom_Sel ;
   private String AV12TFBarNHdr ;
   private String AV13TFBarNHdr_Sel ;
   private String AV96TFPedidoCliente ;
   private String AV97TFPedidoCliente_Sel ;
   private String AV40TFBarSer ;
   private String AV41TFBarSer_Sel ;
   private String AV44TFBarColNom ;
   private String AV45TFBarColNom_Sel ;
   private String AV46TFBarNomCli ;
   private String AV47TFBarNomCli_Sel ;
   private String AV88Emprcod ;
   private String AV64BarColNom ;
   private String AV65BarColNom_to ;
   private String AV62BarSer ;
   private String AV63BarSer_to ;
   private String AV89BarEncCli ;
   private String AV90BarEncCli_to ;
   private String scmdbuf ;
   private String lV10TFCliNom ;
   private String lV12TFBarNHdr ;
   private String lV40TFBarSer ;
   private String lV44TFBarColNom ;
   private String lV46TFBarNomCli ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13878PedidoClie ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13696BarNHdr ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV50TFBarFecCli ;
   private java.util.Date AV34BarFecSal ;
   private java.util.Date AV35BarFecSal_to ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean brk8FO2 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean brk8FO6 ;
   private boolean brk8FO8 ;
   private boolean brk8FO10 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FO3_A279CliNom ;
   private byte[] P08FO3_A213BarSit ;
   private java.util.Date[] P08FO3_A161BarFecSal ;
   private java.util.Date[] P08FO3_A155BarFecCli ;
   private int[] P08FO3_A136BarColNum ;
   private String[] P08FO3_A1234BarNomCli ;
   private String[] P08FO3_A135BarColNom ;
   private String[] P08FO3_A212BarSer ;
   private short[] P08FO3_A217BarTipArt ;
   private boolean[] P08FO3_n217BarTipArt ;
   private int[] P08FO3_A252CliCod ;
   private boolean[] P08FO3_n252CliCod ;
   private java.math.BigDecimal[] P08FO3_A184BarMtr ;
   private java.math.BigDecimal[] P08FO3_A166BarKgm ;
   private String[] P08FO3_A130BarCodPar ;
   private byte[] P08FO3_A132BarCodReo ;
   private int[] P08FO3_A129BarCod ;
   private String[] P08FO3_A143BarDisNum ;
   private String[] P08FO3_A4812BarEncCli ;
   private String[] P08FO3_A396EmprCod ;
   private byte[] P08FO5_A213BarSit ;
   private java.util.Date[] P08FO5_A161BarFecSal ;
   private java.util.Date[] P08FO5_A155BarFecCli ;
   private int[] P08FO5_A136BarColNum ;
   private String[] P08FO5_A1234BarNomCli ;
   private String[] P08FO5_A135BarColNom ;
   private String[] P08FO5_A212BarSer ;
   private short[] P08FO5_A217BarTipArt ;
   private boolean[] P08FO5_n217BarTipArt ;
   private String[] P08FO5_A279CliNom ;
   private int[] P08FO5_A252CliCod ;
   private boolean[] P08FO5_n252CliCod ;
   private java.math.BigDecimal[] P08FO5_A184BarMtr ;
   private java.math.BigDecimal[] P08FO5_A166BarKgm ;
   private String[] P08FO5_A130BarCodPar ;
   private byte[] P08FO5_A132BarCodReo ;
   private int[] P08FO5_A129BarCod ;
   private String[] P08FO5_A143BarDisNum ;
   private String[] P08FO5_A4812BarEncCli ;
   private String[] P08FO5_A396EmprCod ;
   private byte[] P08FO7_A213BarSit ;
   private java.util.Date[] P08FO7_A161BarFecSal ;
   private java.util.Date[] P08FO7_A155BarFecCli ;
   private int[] P08FO7_A136BarColNum ;
   private String[] P08FO7_A1234BarNomCli ;
   private String[] P08FO7_A135BarColNom ;
   private String[] P08FO7_A212BarSer ;
   private short[] P08FO7_A217BarTipArt ;
   private boolean[] P08FO7_n217BarTipArt ;
   private String[] P08FO7_A279CliNom ;
   private int[] P08FO7_A252CliCod ;
   private boolean[] P08FO7_n252CliCod ;
   private java.math.BigDecimal[] P08FO7_A184BarMtr ;
   private java.math.BigDecimal[] P08FO7_A166BarKgm ;
   private String[] P08FO7_A130BarCodPar ;
   private byte[] P08FO7_A132BarCodReo ;
   private int[] P08FO7_A129BarCod ;
   private String[] P08FO7_A143BarDisNum ;
   private String[] P08FO7_A4812BarEncCli ;
   private String[] P08FO7_A396EmprCod ;
   private String[] P08FO9_A212BarSer ;
   private byte[] P08FO9_A213BarSit ;
   private java.util.Date[] P08FO9_A161BarFecSal ;
   private java.util.Date[] P08FO9_A155BarFecCli ;
   private int[] P08FO9_A136BarColNum ;
   private String[] P08FO9_A1234BarNomCli ;
   private String[] P08FO9_A135BarColNom ;
   private short[] P08FO9_A217BarTipArt ;
   private boolean[] P08FO9_n217BarTipArt ;
   private String[] P08FO9_A279CliNom ;
   private int[] P08FO9_A252CliCod ;
   private boolean[] P08FO9_n252CliCod ;
   private java.math.BigDecimal[] P08FO9_A184BarMtr ;
   private java.math.BigDecimal[] P08FO9_A166BarKgm ;
   private String[] P08FO9_A130BarCodPar ;
   private byte[] P08FO9_A132BarCodReo ;
   private int[] P08FO9_A129BarCod ;
   private String[] P08FO9_A143BarDisNum ;
   private String[] P08FO9_A4812BarEncCli ;
   private String[] P08FO9_A396EmprCod ;
   private String[] P08FO11_A135BarColNom ;
   private byte[] P08FO11_A213BarSit ;
   private java.util.Date[] P08FO11_A161BarFecSal ;
   private java.util.Date[] P08FO11_A155BarFecCli ;
   private int[] P08FO11_A136BarColNum ;
   private String[] P08FO11_A1234BarNomCli ;
   private String[] P08FO11_A212BarSer ;
   private short[] P08FO11_A217BarTipArt ;
   private boolean[] P08FO11_n217BarTipArt ;
   private String[] P08FO11_A279CliNom ;
   private int[] P08FO11_A252CliCod ;
   private boolean[] P08FO11_n252CliCod ;
   private java.math.BigDecimal[] P08FO11_A184BarMtr ;
   private java.math.BigDecimal[] P08FO11_A166BarKgm ;
   private String[] P08FO11_A130BarCodPar ;
   private byte[] P08FO11_A132BarCodReo ;
   private int[] P08FO11_A129BarCod ;
   private String[] P08FO11_A143BarDisNum ;
   private String[] P08FO11_A4812BarEncCli ;
   private String[] P08FO11_A396EmprCod ;
   private String[] P08FO13_A1234BarNomCli ;
   private byte[] P08FO13_A213BarSit ;
   private java.util.Date[] P08FO13_A161BarFecSal ;
   private java.util.Date[] P08FO13_A155BarFecCli ;
   private int[] P08FO13_A136BarColNum ;
   private String[] P08FO13_A135BarColNom ;
   private String[] P08FO13_A212BarSer ;
   private short[] P08FO13_A217BarTipArt ;
   private boolean[] P08FO13_n217BarTipArt ;
   private String[] P08FO13_A279CliNom ;
   private int[] P08FO13_A252CliCod ;
   private boolean[] P08FO13_n252CliCod ;
   private java.math.BigDecimal[] P08FO13_A184BarMtr ;
   private java.math.BigDecimal[] P08FO13_A166BarKgm ;
   private String[] P08FO13_A130BarCodPar ;
   private byte[] P08FO13_A132BarCodReo ;
   private int[] P08FO13_A129BarCod ;
   private String[] P08FO13_A143BarDisNum ;
   private String[] P08FO13_A4812BarEncCli ;
   private String[] P08FO13_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class informemermasdetallado_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV36TFCliCod ,
                                          int AV37TFCliCod_To ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFBarNHdr_Sel ,
                                          String AV12TFBarNHdr ,
                                          short AV38TFBarTipArt ,
                                          short AV39TFBarTipArt_To ,
                                          String AV41TFBarSer_Sel ,
                                          String AV40TFBarSer ,
                                          String AV45TFBarColNom_Sel ,
                                          String AV44TFBarColNom ,
                                          String AV47TFBarNomCli_Sel ,
                                          String AV46TFBarNomCli ,
                                          int AV48TFBarColNum ,
                                          int AV49TFBarColNum_To ,
                                          java.util.Date AV50TFBarFecCli ,
                                          java.math.BigDecimal AV52TFBarKgm ,
                                          java.math.BigDecimal AV53TFBarKgm_To ,
                                          java.math.BigDecimal AV54TFBarMtr ,
                                          java.math.BigDecimal AV55TFBarMtr_To ,
                                          java.util.Date AV34BarFecSal ,
                                          java.util.Date AV35BarFecSal_to ,
                                          int AV60CliCod ,
                                          int AV61CliCod_to ,
                                          String AV62BarSer ,
                                          String AV63BarSer_to ,
                                          String AV64BarColNom ,
                                          String AV65BarColNom_to ,
                                          int AV94BarColNum ,
                                          int AV95BarColNum_to ,
                                          short AV91BarTipArt ,
                                          short AV93BarTipArt_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          int A136BarColNum ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A161BarFecSal ,
                                          String AV97TFPedidoCliente_Sel ,
                                          String AV96TFPedidoCliente ,
                                          String A13878PedidoClie ,
                                          String AV89BarEncCli ,
                                          String AV90BarEncCli_to ,
                                          byte A213BarSit ,
                                          String A396EmprCod ,
                                          String AV88Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[34];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T2.CliNom, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarTipArt, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int7[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int7[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35BarFecSal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int7[23] = (byte)(1) ;
      }
      if ( ! (0==AV60CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[24] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int7[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int7[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int7[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int7[29] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int7[30] = (byte)(1) ;
      }
      if ( ! (0==AV95BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int7[31] = (byte)(1) ;
      }
      if ( ! (0==AV91BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int7[32] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int7[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P08FO5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV36TFCliCod ,
                                          int AV37TFCliCod_To ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFBarNHdr_Sel ,
                                          String AV12TFBarNHdr ,
                                          short AV38TFBarTipArt ,
                                          short AV39TFBarTipArt_To ,
                                          String AV41TFBarSer_Sel ,
                                          String AV40TFBarSer ,
                                          String AV45TFBarColNom_Sel ,
                                          String AV44TFBarColNom ,
                                          String AV47TFBarNomCli_Sel ,
                                          String AV46TFBarNomCli ,
                                          int AV48TFBarColNum ,
                                          int AV49TFBarColNum_To ,
                                          java.util.Date AV50TFBarFecCli ,
                                          java.math.BigDecimal AV52TFBarKgm ,
                                          java.math.BigDecimal AV53TFBarKgm_To ,
                                          java.math.BigDecimal AV54TFBarMtr ,
                                          java.math.BigDecimal AV55TFBarMtr_To ,
                                          java.util.Date AV34BarFecSal ,
                                          java.util.Date AV35BarFecSal_to ,
                                          int AV60CliCod ,
                                          int AV61CliCod_to ,
                                          String AV62BarSer ,
                                          String AV63BarSer_to ,
                                          String AV64BarColNom ,
                                          String AV65BarColNom_to ,
                                          int AV94BarColNum ,
                                          int AV95BarColNum_to ,
                                          short AV91BarTipArt ,
                                          short AV93BarTipArt_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          int A136BarColNum ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A161BarFecSal ,
                                          String AV97TFPedidoCliente_Sel ,
                                          String AV96TFPedidoCliente ,
                                          String A13878PedidoClie ,
                                          String AV89BarEncCli ,
                                          String AV90BarEncCli_to ,
                                          byte A213BarSit ,
                                          String AV88Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[34];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35BarFecSal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV60CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV95BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV91BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P08FO7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV36TFCliCod ,
                                          int AV37TFCliCod_To ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFBarNHdr_Sel ,
                                          String AV12TFBarNHdr ,
                                          short AV38TFBarTipArt ,
                                          short AV39TFBarTipArt_To ,
                                          String AV41TFBarSer_Sel ,
                                          String AV40TFBarSer ,
                                          String AV45TFBarColNom_Sel ,
                                          String AV44TFBarColNom ,
                                          String AV47TFBarNomCli_Sel ,
                                          String AV46TFBarNomCli ,
                                          int AV48TFBarColNum ,
                                          int AV49TFBarColNum_To ,
                                          java.util.Date AV50TFBarFecCli ,
                                          java.math.BigDecimal AV52TFBarKgm ,
                                          java.math.BigDecimal AV53TFBarKgm_To ,
                                          java.math.BigDecimal AV54TFBarMtr ,
                                          java.math.BigDecimal AV55TFBarMtr_To ,
                                          java.util.Date AV34BarFecSal ,
                                          java.util.Date AV35BarFecSal_to ,
                                          int AV60CliCod ,
                                          int AV61CliCod_to ,
                                          String AV62BarSer ,
                                          String AV63BarSer_to ,
                                          String AV64BarColNom ,
                                          String AV65BarColNom_to ,
                                          int AV94BarColNum ,
                                          int AV95BarColNum_to ,
                                          short AV91BarTipArt ,
                                          short AV93BarTipArt_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          int A136BarColNum ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A161BarFecSal ,
                                          String AV97TFPedidoCliente_Sel ,
                                          String AV96TFPedidoCliente ,
                                          String A13878PedidoClie ,
                                          String AV89BarEncCli ,
                                          String AV90BarEncCli_to ,
                                          byte A213BarSit ,
                                          String AV88Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[34];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35BarFecSal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV60CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV95BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV91BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08FO9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV36TFCliCod ,
                                          int AV37TFCliCod_To ,
                                          String AV11TFCliNom_Sel ,
                                          String AV10TFCliNom ,
                                          String AV13TFBarNHdr_Sel ,
                                          String AV12TFBarNHdr ,
                                          short AV38TFBarTipArt ,
                                          short AV39TFBarTipArt_To ,
                                          String AV41TFBarSer_Sel ,
                                          String AV40TFBarSer ,
                                          String AV45TFBarColNom_Sel ,
                                          String AV44TFBarColNom ,
                                          String AV47TFBarNomCli_Sel ,
                                          String AV46TFBarNomCli ,
                                          int AV48TFBarColNum ,
                                          int AV49TFBarColNum_To ,
                                          java.util.Date AV50TFBarFecCli ,
                                          java.math.BigDecimal AV52TFBarKgm ,
                                          java.math.BigDecimal AV53TFBarKgm_To ,
                                          java.math.BigDecimal AV54TFBarMtr ,
                                          java.math.BigDecimal AV55TFBarMtr_To ,
                                          java.util.Date AV34BarFecSal ,
                                          java.util.Date AV35BarFecSal_to ,
                                          int AV60CliCod ,
                                          int AV61CliCod_to ,
                                          String AV62BarSer ,
                                          String AV63BarSer_to ,
                                          String AV64BarColNom ,
                                          String AV65BarColNom_to ,
                                          int AV94BarColNum ,
                                          int AV95BarColNum_to ,
                                          short AV91BarTipArt ,
                                          short AV93BarTipArt_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          int A136BarColNum ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A161BarFecSal ,
                                          String AV97TFPedidoCliente_Sel ,
                                          String AV96TFPedidoCliente ,
                                          String A13878PedidoClie ,
                                          String AV89BarEncCli ,
                                          String AV90BarEncCli_to ,
                                          byte A213BarSit ,
                                          String AV88Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[34];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarSer, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35BarFecSal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (0==AV60CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV95BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! (0==AV91BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P08FO11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV36TFCliCod ,
                                           int AV37TFCliCod_To ,
                                           String AV11TFCliNom_Sel ,
                                           String AV10TFCliNom ,
                                           String AV13TFBarNHdr_Sel ,
                                           String AV12TFBarNHdr ,
                                           short AV38TFBarTipArt ,
                                           short AV39TFBarTipArt_To ,
                                           String AV41TFBarSer_Sel ,
                                           String AV40TFBarSer ,
                                           String AV45TFBarColNom_Sel ,
                                           String AV44TFBarColNom ,
                                           String AV47TFBarNomCli_Sel ,
                                           String AV46TFBarNomCli ,
                                           int AV48TFBarColNum ,
                                           int AV49TFBarColNum_To ,
                                           java.util.Date AV50TFBarFecCli ,
                                           java.math.BigDecimal AV52TFBarKgm ,
                                           java.math.BigDecimal AV53TFBarKgm_To ,
                                           java.math.BigDecimal AV54TFBarMtr ,
                                           java.math.BigDecimal AV55TFBarMtr_To ,
                                           java.util.Date AV34BarFecSal ,
                                           java.util.Date AV35BarFecSal_to ,
                                           int AV60CliCod ,
                                           int AV61CliCod_to ,
                                           String AV62BarSer ,
                                           String AV63BarSer_to ,
                                           String AV64BarColNom ,
                                           String AV65BarColNom_to ,
                                           int AV94BarColNum ,
                                           int AV95BarColNum_to ,
                                           short AV91BarTipArt ,
                                           short AV93BarTipArt_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           int A136BarColNum ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A161BarFecSal ,
                                           String AV97TFPedidoCliente_Sel ,
                                           String AV96TFPedidoCliente ,
                                           String A13878PedidoClie ,
                                           String AV89BarEncCli ,
                                           String AV90BarEncCli_to ,
                                           byte A213BarSit ,
                                           String A396EmprCod ,
                                           String AV88Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[34];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarColNom, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarSer, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35BarFecSal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! (0==AV60CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV95BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( ! (0==AV91BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P08FO13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV36TFCliCod ,
                                           int AV37TFCliCod_To ,
                                           String AV11TFCliNom_Sel ,
                                           String AV10TFCliNom ,
                                           String AV13TFBarNHdr_Sel ,
                                           String AV12TFBarNHdr ,
                                           short AV38TFBarTipArt ,
                                           short AV39TFBarTipArt_To ,
                                           String AV41TFBarSer_Sel ,
                                           String AV40TFBarSer ,
                                           String AV45TFBarColNom_Sel ,
                                           String AV44TFBarColNom ,
                                           String AV47TFBarNomCli_Sel ,
                                           String AV46TFBarNomCli ,
                                           int AV48TFBarColNum ,
                                           int AV49TFBarColNum_To ,
                                           java.util.Date AV50TFBarFecCli ,
                                           java.math.BigDecimal AV52TFBarKgm ,
                                           java.math.BigDecimal AV53TFBarKgm_To ,
                                           java.math.BigDecimal AV54TFBarMtr ,
                                           java.math.BigDecimal AV55TFBarMtr_To ,
                                           java.util.Date AV34BarFecSal ,
                                           java.util.Date AV35BarFecSal_to ,
                                           int AV60CliCod ,
                                           int AV61CliCod_to ,
                                           String AV62BarSer ,
                                           String AV63BarSer_to ,
                                           String AV64BarColNom ,
                                           String AV65BarColNom_to ,
                                           int AV94BarColNum ,
                                           int AV95BarColNum_to ,
                                           short AV91BarTipArt ,
                                           short AV93BarTipArt_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           int A136BarColNum ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A161BarFecSal ,
                                           String AV97TFPedidoCliente_Sel ,
                                           String AV96TFPedidoCliente ,
                                           String A13878PedidoClie ,
                                           String AV89BarEncCli ,
                                           String AV90BarEncCli_to ,
                                           byte A213BarSit ,
                                           String A396EmprCod ,
                                           String AV88Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[34];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.BarNomCli, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35BarFecSal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV60CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV61CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63BarSer_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV94BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV95BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV91BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P08FO3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 1 :
                  return conditional_P08FO5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 2 :
                  return conditional_P08FO7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 3 :
                  return conditional_P08FO9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 4 :
                  return conditional_P08FO11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 5 :
                  return conditional_P08FO13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FO5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FO7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FO9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FO11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FO13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
      }
   }

}

