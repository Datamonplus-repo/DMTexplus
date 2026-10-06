package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_1wwgetfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_1wwgetfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_1wwgetfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_1wwgetfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_1wwgetfilterdata.this.AV46DDOName = aP0;
      documentodetransporteproduccion_1wwgetfilterdata.this.AV47SearchTxt = aP1;
      documentodetransporteproduccion_1wwgetfilterdata.this.AV48SearchTxtTo = aP2;
      documentodetransporteproduccion_1wwgetfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_1wwgetfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_GUIREMCLN") == 0 )
      {
         /* Execute user subroutine: 'LOADGUIREMCLNOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBUSU") == 0 )
      {
         /* Execute user subroutine: 'LOADALBUSUOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBLIC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBLICOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBPDATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPDATCUDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_FIRMA4DIG") == 0 )
      {
         /* Execute user subroutine: 'LOADFIRMA4DIGOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV49OptionsJson = AV36Options.toJSonString(false) ;
      AV50OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV39OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WWGridState"), null, null);
      }
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV10TFAlbProCod = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFAlbProCod_To = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV12TFGuiRemCli = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFGuiRemCli_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV14TFGuiRemCln = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV15TFGuiRemCln_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV60TFAlbProEst_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV61TFAlbProEst_Sels.fromJSonString(AV60TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENVMAIL") == 0 )
         {
            AV81TFAlbEnvMail = localUtil.ctot( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUSU") == 0 )
         {
            AV26TFAlbUsu = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUSU_SEL") == 0 )
         {
            AV27TFAlbUsu_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV56TFAlbLic = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV57TFAlbLic_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD") == 0 )
         {
            AV64TFAlbPdATCUD = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD_SEL") == 0 )
         {
            AV65TFAlbPdATCUD_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENVFTP_SEL") == 0 )
         {
            AV28TFAlbEnvFtp_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV29TFAlbEnvFtp_Sels.fromJSonString(AV28TFAlbEnvFtp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROAT_SEL") == 0 )
         {
            AV75TFAlbProAT_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFAlbProAT_Sels.fromJSonString(AV75TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHHFM") == 0 )
         {
            AV30TFAlbHhfm = localUtil.ctot( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFIRMA4DIG") == 0 )
         {
            AV79TFFirma4dig = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFIRMA4DIG_SEL") == 0 )
         {
            AV80TFFirma4dig_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROPRI") == 0 )
         {
            AV52AlbProPri = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CONTCOD") == 0 )
         {
            AV53ContCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBSEC") == 0 )
         {
            AV54AlbSec = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGUIREMCLNOPTIONS' Routine */
      returnInSub = false ;
      AV14TFGuiRemCln = AV47SearchTxt ;
      AV15TFGuiRemCln_Sel = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV10TFAlbProCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV12TFGuiRemCli ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV13TFGuiRemCli_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV14TFGuiRemCln ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV15TFGuiRemCln_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV61TFAlbProEst_Sels ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV81TFAlbEnvMail ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV26TFAlbUsu ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV27TFAlbUsu_Sel ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV56TFAlbLic ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV57TFAlbLic_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV64TFAlbPdATCUD ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV65TFAlbPdATCUD_Sel ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV29TFAlbEnvFtp_Sels ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV76TFAlbProAT_Sels ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV30TFAlbHhfm ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV79TFFirma4dig ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV80TFFirma4dig_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                           Byte.valueOf(A5805AlbEnvFtp) ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                           A10765AlbProAT ,
                                           AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                           Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                           Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                           Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                           Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                           AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                           AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                           AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                           AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                           Integer.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                           Integer.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                           Long.valueOf(AV74AlbProCod) ,
                                           Integer.valueOf(AV71GuiRemCli) ,
                                           AV72AlbProfchfrom ,
                                           AV73AlbProfchto ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A14404AlbEnvMail ,
                                           A7098AlbUsu ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           A10019AlbHhfm ,
                                           A10017AlbFmd ,
                                           A34AlbProfch ,
                                           A5140AlbMarca ,
                                           AV78albmarcaIN ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           A39AlbProPri ,
                                           AV52AlbProPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
      lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
      lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
      lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
      /* Using cursor P0A6T2 */
      pr_default.execute(0, new Object[] {AV78albmarcaIN, AV78albmarcaIN, AV55EmprCod, AV52AlbProPri, Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV74AlbProCod), Integer.valueOf(AV71GuiRemCli), AV72AlbProfchfrom, AV73AlbProfchto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA6T2 = false ;
         A1253EmprGuiRem = P0A6T2_A1253EmprGuiRem[0] ;
         A396EmprCod = P0A6T2_A396EmprCod[0] ;
         A39AlbProPri = P0A6T2_A39AlbProPri[0] ;
         A1244GuiRemCln = P0A6T2_A1244GuiRemCln[0] ;
         A5140AlbMarca = P0A6T2_A5140AlbMarca[0] ;
         A34AlbProfch = P0A6T2_A34AlbProfch[0] ;
         A10019AlbHhfm = P0A6T2_A10019AlbHhfm[0] ;
         A10765AlbProAT = P0A6T2_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = P0A6T2_A5805AlbEnvFtp[0] ;
         A14069AlbPdATCUD = P0A6T2_A14069AlbPdATCUD[0] ;
         A7101AlbLic = P0A6T2_A7101AlbLic[0] ;
         A7098AlbUsu = P0A6T2_A7098AlbUsu[0] ;
         A14404AlbEnvMail = P0A6T2_A14404AlbEnvMail[0] ;
         A33AlbProEst = P0A6T2_A33AlbProEst[0] ;
         A1243GuiRemCli = P0A6T2_A1243GuiRemCli[0] ;
         A30AlbProCod = P0A6T2_A30AlbProCod[0] ;
         A10017AlbFmd = P0A6T2_A10017AlbFmd[0] ;
         n10017AlbFmd = P0A6T2_n10017AlbFmd[0] ;
         A1244GuiRemCln = P0A6T2_A1244GuiRemCln[0] ;
         A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A6T2_A1244GuiRemCln[0], A1244GuiRemCln) == 0 ) )
         {
            brkA6T2 = false ;
            A1253EmprGuiRem = P0A6T2_A1253EmprGuiRem[0] ;
            A396EmprCod = P0A6T2_A396EmprCod[0] ;
            A1243GuiRemCli = P0A6T2_A1243GuiRemCli[0] ;
            A30AlbProCod = P0A6T2_A30AlbProCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brkA6T2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1244GuiRemCln)==0) )
         {
            AV35Option = A1244GuiRemCln ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6T2 )
         {
            brkA6T2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBUSUOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbUsu = AV47SearchTxt ;
      AV27TFAlbUsu_Sel = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV10TFAlbProCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV12TFGuiRemCli ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV13TFGuiRemCli_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV14TFGuiRemCln ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV15TFGuiRemCln_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV61TFAlbProEst_Sels ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV81TFAlbEnvMail ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV26TFAlbUsu ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV27TFAlbUsu_Sel ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV56TFAlbLic ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV57TFAlbLic_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV64TFAlbPdATCUD ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV65TFAlbPdATCUD_Sel ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV29TFAlbEnvFtp_Sels ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV76TFAlbProAT_Sels ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV30TFAlbHhfm ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV79TFFirma4dig ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV80TFFirma4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                           Byte.valueOf(A5805AlbEnvFtp) ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                           A10765AlbProAT ,
                                           AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                           Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                           Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                           Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                           Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                           AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                           AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                           AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                           AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                           Integer.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                           Integer.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                           Long.valueOf(AV74AlbProCod) ,
                                           Integer.valueOf(AV71GuiRemCli) ,
                                           AV72AlbProfchfrom ,
                                           AV73AlbProfchto ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A14404AlbEnvMail ,
                                           A7098AlbUsu ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           A10019AlbHhfm ,
                                           A10017AlbFmd ,
                                           A34AlbProfch ,
                                           A5140AlbMarca ,
                                           AV78albmarcaIN ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           A39AlbProPri ,
                                           AV52AlbProPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
      lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
      lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
      lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
      /* Using cursor P0A6T3 */
      pr_default.execute(1, new Object[] {AV78albmarcaIN, AV78albmarcaIN, AV55EmprCod, AV52AlbProPri, Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV74AlbProCod), Integer.valueOf(AV71GuiRemCli), AV72AlbProfchfrom, AV73AlbProfchto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA6T4 = false ;
         A1253EmprGuiRem = P0A6T3_A1253EmprGuiRem[0] ;
         A396EmprCod = P0A6T3_A396EmprCod[0] ;
         A39AlbProPri = P0A6T3_A39AlbProPri[0] ;
         A7098AlbUsu = P0A6T3_A7098AlbUsu[0] ;
         A5140AlbMarca = P0A6T3_A5140AlbMarca[0] ;
         A34AlbProfch = P0A6T3_A34AlbProfch[0] ;
         A10019AlbHhfm = P0A6T3_A10019AlbHhfm[0] ;
         A10765AlbProAT = P0A6T3_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = P0A6T3_A5805AlbEnvFtp[0] ;
         A14069AlbPdATCUD = P0A6T3_A14069AlbPdATCUD[0] ;
         A7101AlbLic = P0A6T3_A7101AlbLic[0] ;
         A14404AlbEnvMail = P0A6T3_A14404AlbEnvMail[0] ;
         A33AlbProEst = P0A6T3_A33AlbProEst[0] ;
         A1244GuiRemCln = P0A6T3_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P0A6T3_A1243GuiRemCli[0] ;
         A30AlbProCod = P0A6T3_A30AlbProCod[0] ;
         A10017AlbFmd = P0A6T3_A10017AlbFmd[0] ;
         n10017AlbFmd = P0A6T3_n10017AlbFmd[0] ;
         A1244GuiRemCln = P0A6T3_A1244GuiRemCln[0] ;
         A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A6T3_A7098AlbUsu[0], A7098AlbUsu) == 0 ) )
         {
            brkA6T4 = false ;
            A396EmprCod = P0A6T3_A396EmprCod[0] ;
            A30AlbProCod = P0A6T3_A30AlbProCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brkA6T4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A7098AlbUsu)==0) )
         {
            AV35Option = A7098AlbUsu ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6T4 )
         {
            brkA6T4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBLICOPTIONS' Routine */
      returnInSub = false ;
      AV56TFAlbLic = AV47SearchTxt ;
      AV57TFAlbLic_Sel = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV10TFAlbProCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV12TFGuiRemCli ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV13TFGuiRemCli_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV14TFGuiRemCln ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV15TFGuiRemCln_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV61TFAlbProEst_Sels ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV81TFAlbEnvMail ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV26TFAlbUsu ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV27TFAlbUsu_Sel ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV56TFAlbLic ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV57TFAlbLic_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV64TFAlbPdATCUD ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV65TFAlbPdATCUD_Sel ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV29TFAlbEnvFtp_Sels ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV76TFAlbProAT_Sels ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV30TFAlbHhfm ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV79TFFirma4dig ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV80TFFirma4dig_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                           Byte.valueOf(A5805AlbEnvFtp) ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                           A10765AlbProAT ,
                                           AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                           Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                           Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                           Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                           Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                           AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                           AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                           AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                           AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                           Integer.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                           Integer.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                           Long.valueOf(AV74AlbProCod) ,
                                           Integer.valueOf(AV71GuiRemCli) ,
                                           AV72AlbProfchfrom ,
                                           AV73AlbProfchto ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A14404AlbEnvMail ,
                                           A7098AlbUsu ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           A10019AlbHhfm ,
                                           A10017AlbFmd ,
                                           A34AlbProfch ,
                                           A5140AlbMarca ,
                                           AV78albmarcaIN ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           A39AlbProPri ,
                                           AV52AlbProPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
      lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
      lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
      lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
      /* Using cursor P0A6T4 */
      pr_default.execute(2, new Object[] {AV78albmarcaIN, AV78albmarcaIN, AV55EmprCod, AV52AlbProPri, Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV74AlbProCod), Integer.valueOf(AV71GuiRemCli), AV72AlbProfchfrom, AV73AlbProfchto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA6T6 = false ;
         A1253EmprGuiRem = P0A6T4_A1253EmprGuiRem[0] ;
         A396EmprCod = P0A6T4_A396EmprCod[0] ;
         A39AlbProPri = P0A6T4_A39AlbProPri[0] ;
         A7101AlbLic = P0A6T4_A7101AlbLic[0] ;
         A5140AlbMarca = P0A6T4_A5140AlbMarca[0] ;
         A34AlbProfch = P0A6T4_A34AlbProfch[0] ;
         A10019AlbHhfm = P0A6T4_A10019AlbHhfm[0] ;
         A10765AlbProAT = P0A6T4_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = P0A6T4_A5805AlbEnvFtp[0] ;
         A14069AlbPdATCUD = P0A6T4_A14069AlbPdATCUD[0] ;
         A7098AlbUsu = P0A6T4_A7098AlbUsu[0] ;
         A14404AlbEnvMail = P0A6T4_A14404AlbEnvMail[0] ;
         A33AlbProEst = P0A6T4_A33AlbProEst[0] ;
         A1244GuiRemCln = P0A6T4_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P0A6T4_A1243GuiRemCli[0] ;
         A30AlbProCod = P0A6T4_A30AlbProCod[0] ;
         A10017AlbFmd = P0A6T4_A10017AlbFmd[0] ;
         n10017AlbFmd = P0A6T4_n10017AlbFmd[0] ;
         A1244GuiRemCln = P0A6T4_A1244GuiRemCln[0] ;
         A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A6T4_A7101AlbLic[0], A7101AlbLic) == 0 ) )
         {
            brkA6T6 = false ;
            A396EmprCod = P0A6T4_A396EmprCod[0] ;
            A30AlbProCod = P0A6T4_A30AlbProCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brkA6T6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A7101AlbLic)==0) )
         {
            AV35Option = A7101AlbLic ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6T6 )
         {
            brkA6T6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBPDATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV64TFAlbPdATCUD = AV47SearchTxt ;
      AV65TFAlbPdATCUD_Sel = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV10TFAlbProCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV12TFGuiRemCli ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV13TFGuiRemCli_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV14TFGuiRemCln ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV15TFGuiRemCln_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV61TFAlbProEst_Sels ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV81TFAlbEnvMail ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV26TFAlbUsu ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV27TFAlbUsu_Sel ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV56TFAlbLic ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV57TFAlbLic_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV64TFAlbPdATCUD ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV65TFAlbPdATCUD_Sel ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV29TFAlbEnvFtp_Sels ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV76TFAlbProAT_Sels ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV30TFAlbHhfm ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV79TFFirma4dig ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV80TFFirma4dig_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                           Byte.valueOf(A5805AlbEnvFtp) ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                           A10765AlbProAT ,
                                           AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                           Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                           Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                           Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                           Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                           AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                           AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                           AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                           AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                           Integer.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                           Integer.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                           Long.valueOf(AV74AlbProCod) ,
                                           Integer.valueOf(AV71GuiRemCli) ,
                                           AV72AlbProfchfrom ,
                                           AV73AlbProfchto ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A14404AlbEnvMail ,
                                           A7098AlbUsu ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           A10019AlbHhfm ,
                                           A10017AlbFmd ,
                                           A34AlbProfch ,
                                           A5140AlbMarca ,
                                           AV78albmarcaIN ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           A39AlbProPri ,
                                           AV52AlbProPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
      lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
      lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
      lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
      /* Using cursor P0A6T5 */
      pr_default.execute(3, new Object[] {AV78albmarcaIN, AV78albmarcaIN, AV55EmprCod, AV52AlbProPri, Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV74AlbProCod), Integer.valueOf(AV71GuiRemCli), AV72AlbProfchfrom, AV73AlbProfchto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA6T8 = false ;
         A1253EmprGuiRem = P0A6T5_A1253EmprGuiRem[0] ;
         A396EmprCod = P0A6T5_A396EmprCod[0] ;
         A39AlbProPri = P0A6T5_A39AlbProPri[0] ;
         A14069AlbPdATCUD = P0A6T5_A14069AlbPdATCUD[0] ;
         A5140AlbMarca = P0A6T5_A5140AlbMarca[0] ;
         A34AlbProfch = P0A6T5_A34AlbProfch[0] ;
         A10019AlbHhfm = P0A6T5_A10019AlbHhfm[0] ;
         A10765AlbProAT = P0A6T5_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = P0A6T5_A5805AlbEnvFtp[0] ;
         A7101AlbLic = P0A6T5_A7101AlbLic[0] ;
         A7098AlbUsu = P0A6T5_A7098AlbUsu[0] ;
         A14404AlbEnvMail = P0A6T5_A14404AlbEnvMail[0] ;
         A33AlbProEst = P0A6T5_A33AlbProEst[0] ;
         A1244GuiRemCln = P0A6T5_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P0A6T5_A1243GuiRemCli[0] ;
         A30AlbProCod = P0A6T5_A30AlbProCod[0] ;
         A10017AlbFmd = P0A6T5_A10017AlbFmd[0] ;
         n10017AlbFmd = P0A6T5_n10017AlbFmd[0] ;
         A1244GuiRemCln = P0A6T5_A1244GuiRemCln[0] ;
         A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A6T5_A14069AlbPdATCUD[0], A14069AlbPdATCUD) == 0 ) )
         {
            brkA6T8 = false ;
            A396EmprCod = P0A6T5_A396EmprCod[0] ;
            A30AlbProCod = P0A6T5_A30AlbProCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brkA6T8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14069AlbPdATCUD)==0) )
         {
            AV35Option = A14069AlbPdATCUD ;
            AV36Options.add(AV35Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6T8 )
         {
            brkA6T8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFIRMA4DIGOPTIONS' Routine */
      returnInSub = false ;
      AV79TFFirma4dig = AV47SearchTxt ;
      AV80TFFirma4dig_Sel = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV10TFAlbProCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV12TFGuiRemCli ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV13TFGuiRemCli_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV14TFGuiRemCln ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV15TFGuiRemCln_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV61TFAlbProEst_Sels ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV81TFAlbEnvMail ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV26TFAlbUsu ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV27TFAlbUsu_Sel ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV56TFAlbLic ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV57TFAlbLic_Sel ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV64TFAlbPdATCUD ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV65TFAlbPdATCUD_Sel ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV29TFAlbEnvFtp_Sels ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV76TFAlbProAT_Sels ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV30TFAlbHhfm ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV79TFFirma4dig ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV80TFFirma4dig_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                           Byte.valueOf(A5805AlbEnvFtp) ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                           A10765AlbProAT ,
                                           AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                           Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                           Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                           Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                           Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                           AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                           AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                           AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                           AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                           Integer.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                           Integer.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                           Long.valueOf(AV74AlbProCod) ,
                                           Integer.valueOf(AV71GuiRemCli) ,
                                           AV72AlbProfchfrom ,
                                           AV73AlbProfchto ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A14404AlbEnvMail ,
                                           A7098AlbUsu ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           A10019AlbHhfm ,
                                           A10017AlbFmd ,
                                           A34AlbProfch ,
                                           A5140AlbMarca ,
                                           AV78albmarcaIN ,
                                           A39AlbProPri ,
                                           AV52AlbProPri ,
                                           AV55EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
      lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
      lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
      lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
      /* Using cursor P0A6T6 */
      pr_default.execute(4, new Object[] {AV55EmprCod, AV78albmarcaIN, AV78albmarcaIN, AV52AlbProPri, Long.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV74AlbProCod), Integer.valueOf(AV71GuiRemCli), AV72AlbProfchfrom, AV73AlbProfchto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1253EmprGuiRem = P0A6T6_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P0A6T6_A5140AlbMarca[0] ;
         A34AlbProfch = P0A6T6_A34AlbProfch[0] ;
         A39AlbProPri = P0A6T6_A39AlbProPri[0] ;
         A396EmprCod = P0A6T6_A396EmprCod[0] ;
         A10019AlbHhfm = P0A6T6_A10019AlbHhfm[0] ;
         A10765AlbProAT = P0A6T6_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = P0A6T6_A5805AlbEnvFtp[0] ;
         A14069AlbPdATCUD = P0A6T6_A14069AlbPdATCUD[0] ;
         A7101AlbLic = P0A6T6_A7101AlbLic[0] ;
         A7098AlbUsu = P0A6T6_A7098AlbUsu[0] ;
         A14404AlbEnvMail = P0A6T6_A14404AlbEnvMail[0] ;
         A33AlbProEst = P0A6T6_A33AlbProEst[0] ;
         A1244GuiRemCln = P0A6T6_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P0A6T6_A1243GuiRemCli[0] ;
         A30AlbProCod = P0A6T6_A30AlbProCod[0] ;
         A10017AlbFmd = P0A6T6_A10017AlbFmd[0] ;
         n10017AlbFmd = P0A6T6_n10017AlbFmd[0] ;
         A1244GuiRemCln = P0A6T6_A1244GuiRemCln[0] ;
         A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
         if ( ! (GXutil.strcmp("", A14362Firma4dig)==0) )
         {
            AV35Option = A14362Firma4dig ;
            AV34InsertIndex = 1 ;
            while ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) < 0 ) )
            {
               AV34InsertIndex = (int)(AV34InsertIndex+1) ;
            }
            if ( ( AV34InsertIndex <= AV36Options.size() ) && ( GXutil.strcmp((String)AV36Options.elementAt(-1+AV34InsertIndex), AV35Option) == 0 ) )
            {
               AV40count = GXutil.lval( (String)AV39OptionIndexes.elementAt(-1+AV34InsertIndex)) ;
               AV40count = (long)(AV40count+1) ;
               AV39OptionIndexes.removeItem(AV34InsertIndex);
               AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV34InsertIndex);
            }
            else
            {
               AV36Options.add(AV35Option, AV34InsertIndex);
               AV39OptionIndexes.add("1", AV34InsertIndex);
            }
         }
         if ( AV36Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_1wwgetfilterdata.this.AV49OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_1wwgetfilterdata.this.AV50OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_1wwgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV49OptionsJson = "" ;
      AV50OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV36Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14TFGuiRemCln = "" ;
      AV15TFGuiRemCln_Sel = "" ;
      AV60TFAlbProEst_SelsJson = "" ;
      AV61TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV81TFAlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      AV26TFAlbUsu = "" ;
      AV27TFAlbUsu_Sel = "" ;
      AV56TFAlbLic = "" ;
      AV57TFAlbLic_Sel = "" ;
      AV64TFAlbPdATCUD = "" ;
      AV65TFAlbPdATCUD_Sel = "" ;
      AV28TFAlbEnvFtp_SelsJson = "" ;
      AV29TFAlbEnvFtp_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV75TFAlbProAT_SelsJson = "" ;
      AV76TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30TFAlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV79TFFirma4dig = "" ;
      AV80TFFirma4dig_Sel = "" ;
      AV52AlbProPri = "" ;
      AV53ContCod = "" ;
      AV54AlbSec = "" ;
      A1244GuiRemCln = "" ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = "" ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = "" ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = GXutil.resetTime( GXutil.nullDate() );
      AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = "" ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = "" ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = "" ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = "" ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = "" ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = "" ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = GXutil.resetTime( GXutil.nullDate() );
      AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = "" ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = "" ;
      scmdbuf = "" ;
      lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = "" ;
      lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = "" ;
      lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = "" ;
      lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = "" ;
      lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = "" ;
      A10765AlbProAT = "" ;
      AV72AlbProfchfrom = GXutil.nullDate() ;
      AV73AlbProfchto = GXutil.nullDate() ;
      A14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      A7098AlbUsu = "" ;
      A7101AlbLic = "" ;
      A14069AlbPdATCUD = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10017AlbFmd = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A5140AlbMarca = "" ;
      AV78albmarcaIN = "" ;
      A396EmprCod = "" ;
      AV55EmprCod = "" ;
      A39AlbProPri = "" ;
      P0A6T2_A1253EmprGuiRem = new String[] {""} ;
      P0A6T2_A396EmprCod = new String[] {""} ;
      P0A6T2_A39AlbProPri = new String[] {""} ;
      P0A6T2_A1244GuiRemCln = new String[] {""} ;
      P0A6T2_A5140AlbMarca = new String[] {""} ;
      P0A6T2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T2_A10765AlbProAT = new String[] {""} ;
      P0A6T2_A5805AlbEnvFtp = new byte[1] ;
      P0A6T2_A14069AlbPdATCUD = new String[] {""} ;
      P0A6T2_A7101AlbLic = new String[] {""} ;
      P0A6T2_A7098AlbUsu = new String[] {""} ;
      P0A6T2_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T2_A33AlbProEst = new byte[1] ;
      P0A6T2_A1243GuiRemCli = new int[1] ;
      P0A6T2_A30AlbProCod = new long[1] ;
      P0A6T2_A10017AlbFmd = new String[] {""} ;
      P0A6T2_n10017AlbFmd = new boolean[] {false} ;
      A1253EmprGuiRem = "" ;
      A14362Firma4dig = "" ;
      AV35Option = "" ;
      P0A6T3_A1253EmprGuiRem = new String[] {""} ;
      P0A6T3_A396EmprCod = new String[] {""} ;
      P0A6T3_A39AlbProPri = new String[] {""} ;
      P0A6T3_A7098AlbUsu = new String[] {""} ;
      P0A6T3_A5140AlbMarca = new String[] {""} ;
      P0A6T3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T3_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T3_A10765AlbProAT = new String[] {""} ;
      P0A6T3_A5805AlbEnvFtp = new byte[1] ;
      P0A6T3_A14069AlbPdATCUD = new String[] {""} ;
      P0A6T3_A7101AlbLic = new String[] {""} ;
      P0A6T3_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T3_A33AlbProEst = new byte[1] ;
      P0A6T3_A1244GuiRemCln = new String[] {""} ;
      P0A6T3_A1243GuiRemCli = new int[1] ;
      P0A6T3_A30AlbProCod = new long[1] ;
      P0A6T3_A10017AlbFmd = new String[] {""} ;
      P0A6T3_n10017AlbFmd = new boolean[] {false} ;
      P0A6T4_A1253EmprGuiRem = new String[] {""} ;
      P0A6T4_A396EmprCod = new String[] {""} ;
      P0A6T4_A39AlbProPri = new String[] {""} ;
      P0A6T4_A7101AlbLic = new String[] {""} ;
      P0A6T4_A5140AlbMarca = new String[] {""} ;
      P0A6T4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T4_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T4_A10765AlbProAT = new String[] {""} ;
      P0A6T4_A5805AlbEnvFtp = new byte[1] ;
      P0A6T4_A14069AlbPdATCUD = new String[] {""} ;
      P0A6T4_A7098AlbUsu = new String[] {""} ;
      P0A6T4_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T4_A33AlbProEst = new byte[1] ;
      P0A6T4_A1244GuiRemCln = new String[] {""} ;
      P0A6T4_A1243GuiRemCli = new int[1] ;
      P0A6T4_A30AlbProCod = new long[1] ;
      P0A6T4_A10017AlbFmd = new String[] {""} ;
      P0A6T4_n10017AlbFmd = new boolean[] {false} ;
      P0A6T5_A1253EmprGuiRem = new String[] {""} ;
      P0A6T5_A396EmprCod = new String[] {""} ;
      P0A6T5_A39AlbProPri = new String[] {""} ;
      P0A6T5_A14069AlbPdATCUD = new String[] {""} ;
      P0A6T5_A5140AlbMarca = new String[] {""} ;
      P0A6T5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T5_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T5_A10765AlbProAT = new String[] {""} ;
      P0A6T5_A5805AlbEnvFtp = new byte[1] ;
      P0A6T5_A7101AlbLic = new String[] {""} ;
      P0A6T5_A7098AlbUsu = new String[] {""} ;
      P0A6T5_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T5_A33AlbProEst = new byte[1] ;
      P0A6T5_A1244GuiRemCln = new String[] {""} ;
      P0A6T5_A1243GuiRemCli = new int[1] ;
      P0A6T5_A30AlbProCod = new long[1] ;
      P0A6T5_A10017AlbFmd = new String[] {""} ;
      P0A6T5_n10017AlbFmd = new boolean[] {false} ;
      P0A6T6_A1253EmprGuiRem = new String[] {""} ;
      P0A6T6_A5140AlbMarca = new String[] {""} ;
      P0A6T6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T6_A39AlbProPri = new String[] {""} ;
      P0A6T6_A396EmprCod = new String[] {""} ;
      P0A6T6_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T6_A10765AlbProAT = new String[] {""} ;
      P0A6T6_A5805AlbEnvFtp = new byte[1] ;
      P0A6T6_A14069AlbPdATCUD = new String[] {""} ;
      P0A6T6_A7101AlbLic = new String[] {""} ;
      P0A6T6_A7098AlbUsu = new String[] {""} ;
      P0A6T6_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6T6_A33AlbProEst = new byte[1] ;
      P0A6T6_A1244GuiRemCln = new String[] {""} ;
      P0A6T6_A1243GuiRemCli = new int[1] ;
      P0A6T6_A30AlbProCod = new long[1] ;
      P0A6T6_A10017AlbFmd = new String[] {""} ;
      P0A6T6_n10017AlbFmd = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A6T2_A1253EmprGuiRem, P0A6T2_A396EmprCod, P0A6T2_A39AlbProPri, P0A6T2_A1244GuiRemCln, P0A6T2_A5140AlbMarca, P0A6T2_A34AlbProfch, P0A6T2_A10019AlbHhfm, P0A6T2_A10765AlbProAT, P0A6T2_A5805AlbEnvFtp, P0A6T2_A14069AlbPdATCUD,
            P0A6T2_A7101AlbLic, P0A6T2_A7098AlbUsu, P0A6T2_A14404AlbEnvMail, P0A6T2_A33AlbProEst, P0A6T2_A1243GuiRemCli, P0A6T2_A30AlbProCod, P0A6T2_A10017AlbFmd, P0A6T2_n10017AlbFmd
            }
            , new Object[] {
            P0A6T3_A1253EmprGuiRem, P0A6T3_A396EmprCod, P0A6T3_A39AlbProPri, P0A6T3_A7098AlbUsu, P0A6T3_A5140AlbMarca, P0A6T3_A34AlbProfch, P0A6T3_A10019AlbHhfm, P0A6T3_A10765AlbProAT, P0A6T3_A5805AlbEnvFtp, P0A6T3_A14069AlbPdATCUD,
            P0A6T3_A7101AlbLic, P0A6T3_A14404AlbEnvMail, P0A6T3_A33AlbProEst, P0A6T3_A1244GuiRemCln, P0A6T3_A1243GuiRemCli, P0A6T3_A30AlbProCod, P0A6T3_A10017AlbFmd, P0A6T3_n10017AlbFmd
            }
            , new Object[] {
            P0A6T4_A1253EmprGuiRem, P0A6T4_A396EmprCod, P0A6T4_A39AlbProPri, P0A6T4_A7101AlbLic, P0A6T4_A5140AlbMarca, P0A6T4_A34AlbProfch, P0A6T4_A10019AlbHhfm, P0A6T4_A10765AlbProAT, P0A6T4_A5805AlbEnvFtp, P0A6T4_A14069AlbPdATCUD,
            P0A6T4_A7098AlbUsu, P0A6T4_A14404AlbEnvMail, P0A6T4_A33AlbProEst, P0A6T4_A1244GuiRemCln, P0A6T4_A1243GuiRemCli, P0A6T4_A30AlbProCod, P0A6T4_A10017AlbFmd, P0A6T4_n10017AlbFmd
            }
            , new Object[] {
            P0A6T5_A1253EmprGuiRem, P0A6T5_A396EmprCod, P0A6T5_A39AlbProPri, P0A6T5_A14069AlbPdATCUD, P0A6T5_A5140AlbMarca, P0A6T5_A34AlbProfch, P0A6T5_A10019AlbHhfm, P0A6T5_A10765AlbProAT, P0A6T5_A5805AlbEnvFtp, P0A6T5_A7101AlbLic,
            P0A6T5_A7098AlbUsu, P0A6T5_A14404AlbEnvMail, P0A6T5_A33AlbProEst, P0A6T5_A1244GuiRemCln, P0A6T5_A1243GuiRemCli, P0A6T5_A30AlbProCod, P0A6T5_A10017AlbFmd, P0A6T5_n10017AlbFmd
            }
            , new Object[] {
            P0A6T6_A1253EmprGuiRem, P0A6T6_A5140AlbMarca, P0A6T6_A34AlbProfch, P0A6T6_A39AlbProPri, P0A6T6_A396EmprCod, P0A6T6_A10019AlbHhfm, P0A6T6_A10765AlbProAT, P0A6T6_A5805AlbEnvFtp, P0A6T6_A14069AlbPdATCUD, P0A6T6_A7101AlbLic,
            P0A6T6_A7098AlbUsu, P0A6T6_A14404AlbEnvMail, P0A6T6_A33AlbProEst, P0A6T6_A1244GuiRemCln, P0A6T6_A1243GuiRemCli, P0A6T6_A30AlbProCod, P0A6T6_A10017AlbFmd, P0A6T6_n10017AlbFmd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte A5805AlbEnvFtp ;
   private short Gx_err ;
   private int AV84GXV1 ;
   private int AV12TFGuiRemCli ;
   private int AV13TFGuiRemCli_To ;
   private int AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ;
   private int AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ;
   private int AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ;
   private int AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ;
   private int AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ;
   private int AV71GuiRemCli ;
   private int A1243GuiRemCli ;
   private int AV34InsertIndex ;
   private long AV10TFAlbProCod ;
   private long AV11TFAlbProCod_To ;
   private long AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ;
   private long AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ;
   private long AV74AlbProCod ;
   private long A30AlbProCod ;
   private long AV40count ;
   private String AV14TFGuiRemCln ;
   private String AV15TFGuiRemCln_Sel ;
   private String AV26TFAlbUsu ;
   private String AV27TFAlbUsu_Sel ;
   private String AV56TFAlbLic ;
   private String AV57TFAlbLic_Sel ;
   private String AV64TFAlbPdATCUD ;
   private String AV65TFAlbPdATCUD_Sel ;
   private String AV79TFFirma4dig ;
   private String AV80TFFirma4dig_Sel ;
   private String AV52AlbProPri ;
   private String AV53ContCod ;
   private String AV54AlbSec ;
   private String A1244GuiRemCln ;
   private String AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ;
   private String AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ;
   private String AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ;
   private String AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ;
   private String AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ;
   private String AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ;
   private String AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ;
   private String AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ;
   private String AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ;
   private String AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ;
   private String scmdbuf ;
   private String lV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ;
   private String lV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ;
   private String lV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ;
   private String lV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ;
   private String lV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ;
   private String A10765AlbProAT ;
   private String A7098AlbUsu ;
   private String A7101AlbLic ;
   private String A14069AlbPdATCUD ;
   private String A5140AlbMarca ;
   private String AV78albmarcaIN ;
   private String A396EmprCod ;
   private String AV55EmprCod ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String A14362Firma4dig ;
   private java.util.Date AV81TFAlbEnvMail ;
   private java.util.Date AV30TFAlbHhfm ;
   private java.util.Date AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ;
   private java.util.Date AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ;
   private java.util.Date A14404AlbEnvMail ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date AV72AlbProfchfrom ;
   private java.util.Date AV73AlbProfchto ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean brkA6T2 ;
   private boolean n10017AlbFmd ;
   private boolean brkA6T4 ;
   private boolean brkA6T6 ;
   private boolean brkA6T8 ;
   private String AV49OptionsJson ;
   private String AV50OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV60TFAlbProEst_SelsJson ;
   private String AV28TFAlbEnvFtp_SelsJson ;
   private String AV75TFAlbProAT_SelsJson ;
   private String AV46DDOName ;
   private String AV47SearchTxt ;
   private String AV48SearchTxtTo ;
   private String A10017AlbFmd ;
   private String AV35Option ;
   private GXSimpleCollection<Byte> AV61TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV29TFAlbEnvFtp_Sels ;
   private GXSimpleCollection<Byte> AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ;
   private GXSimpleCollection<Byte> AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A6T2_A1253EmprGuiRem ;
   private String[] P0A6T2_A396EmprCod ;
   private String[] P0A6T2_A39AlbProPri ;
   private String[] P0A6T2_A1244GuiRemCln ;
   private String[] P0A6T2_A5140AlbMarca ;
   private java.util.Date[] P0A6T2_A34AlbProfch ;
   private java.util.Date[] P0A6T2_A10019AlbHhfm ;
   private String[] P0A6T2_A10765AlbProAT ;
   private byte[] P0A6T2_A5805AlbEnvFtp ;
   private String[] P0A6T2_A14069AlbPdATCUD ;
   private String[] P0A6T2_A7101AlbLic ;
   private String[] P0A6T2_A7098AlbUsu ;
   private java.util.Date[] P0A6T2_A14404AlbEnvMail ;
   private byte[] P0A6T2_A33AlbProEst ;
   private int[] P0A6T2_A1243GuiRemCli ;
   private long[] P0A6T2_A30AlbProCod ;
   private String[] P0A6T2_A10017AlbFmd ;
   private boolean[] P0A6T2_n10017AlbFmd ;
   private String[] P0A6T3_A1253EmprGuiRem ;
   private String[] P0A6T3_A396EmprCod ;
   private String[] P0A6T3_A39AlbProPri ;
   private String[] P0A6T3_A7098AlbUsu ;
   private String[] P0A6T3_A5140AlbMarca ;
   private java.util.Date[] P0A6T3_A34AlbProfch ;
   private java.util.Date[] P0A6T3_A10019AlbHhfm ;
   private String[] P0A6T3_A10765AlbProAT ;
   private byte[] P0A6T3_A5805AlbEnvFtp ;
   private String[] P0A6T3_A14069AlbPdATCUD ;
   private String[] P0A6T3_A7101AlbLic ;
   private java.util.Date[] P0A6T3_A14404AlbEnvMail ;
   private byte[] P0A6T3_A33AlbProEst ;
   private String[] P0A6T3_A1244GuiRemCln ;
   private int[] P0A6T3_A1243GuiRemCli ;
   private long[] P0A6T3_A30AlbProCod ;
   private String[] P0A6T3_A10017AlbFmd ;
   private boolean[] P0A6T3_n10017AlbFmd ;
   private String[] P0A6T4_A1253EmprGuiRem ;
   private String[] P0A6T4_A396EmprCod ;
   private String[] P0A6T4_A39AlbProPri ;
   private String[] P0A6T4_A7101AlbLic ;
   private String[] P0A6T4_A5140AlbMarca ;
   private java.util.Date[] P0A6T4_A34AlbProfch ;
   private java.util.Date[] P0A6T4_A10019AlbHhfm ;
   private String[] P0A6T4_A10765AlbProAT ;
   private byte[] P0A6T4_A5805AlbEnvFtp ;
   private String[] P0A6T4_A14069AlbPdATCUD ;
   private String[] P0A6T4_A7098AlbUsu ;
   private java.util.Date[] P0A6T4_A14404AlbEnvMail ;
   private byte[] P0A6T4_A33AlbProEst ;
   private String[] P0A6T4_A1244GuiRemCln ;
   private int[] P0A6T4_A1243GuiRemCli ;
   private long[] P0A6T4_A30AlbProCod ;
   private String[] P0A6T4_A10017AlbFmd ;
   private boolean[] P0A6T4_n10017AlbFmd ;
   private String[] P0A6T5_A1253EmprGuiRem ;
   private String[] P0A6T5_A396EmprCod ;
   private String[] P0A6T5_A39AlbProPri ;
   private String[] P0A6T5_A14069AlbPdATCUD ;
   private String[] P0A6T5_A5140AlbMarca ;
   private java.util.Date[] P0A6T5_A34AlbProfch ;
   private java.util.Date[] P0A6T5_A10019AlbHhfm ;
   private String[] P0A6T5_A10765AlbProAT ;
   private byte[] P0A6T5_A5805AlbEnvFtp ;
   private String[] P0A6T5_A7101AlbLic ;
   private String[] P0A6T5_A7098AlbUsu ;
   private java.util.Date[] P0A6T5_A14404AlbEnvMail ;
   private byte[] P0A6T5_A33AlbProEst ;
   private String[] P0A6T5_A1244GuiRemCln ;
   private int[] P0A6T5_A1243GuiRemCli ;
   private long[] P0A6T5_A30AlbProCod ;
   private String[] P0A6T5_A10017AlbFmd ;
   private boolean[] P0A6T5_n10017AlbFmd ;
   private String[] P0A6T6_A1253EmprGuiRem ;
   private String[] P0A6T6_A5140AlbMarca ;
   private java.util.Date[] P0A6T6_A34AlbProfch ;
   private String[] P0A6T6_A39AlbProPri ;
   private String[] P0A6T6_A396EmprCod ;
   private java.util.Date[] P0A6T6_A10019AlbHhfm ;
   private String[] P0A6T6_A10765AlbProAT ;
   private byte[] P0A6T6_A5805AlbEnvFtp ;
   private String[] P0A6T6_A14069AlbPdATCUD ;
   private String[] P0A6T6_A7101AlbLic ;
   private String[] P0A6T6_A7098AlbUsu ;
   private java.util.Date[] P0A6T6_A14404AlbEnvMail ;
   private byte[] P0A6T6_A33AlbProEst ;
   private String[] P0A6T6_A1244GuiRemCln ;
   private int[] P0A6T6_A1243GuiRemCli ;
   private long[] P0A6T6_A30AlbProCod ;
   private String[] P0A6T6_A10017AlbFmd ;
   private boolean[] P0A6T6_n10017AlbFmd ;
   private GXSimpleCollection<String> AV76TFAlbProAT_Sels ;
   private GXSimpleCollection<String> AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ;
   private GXSimpleCollection<String> AV36Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV39OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class documentodetransporteproduccion_1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A6T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          long AV74AlbProCod ,
                                          int AV71GuiRemCli ,
                                          java.util.Date AV72AlbProfchfrom ,
                                          java.util.Date AV73AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          String AV78albmarcaIN ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          String A39AlbProPri ,
                                          String AV52AlbProPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T2.CliNom AS GuiRemCln, T1.AlbMarca, T1.AlbProfch, T1.AlbHhfm, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD," ;
      scmdbuf += " T1.AlbLic, T1.AlbUsu, T1.AlbEnvMail, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbFmd FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV74AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV71GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A6T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          long AV74AlbProCod ,
                                          int AV71GuiRemCli ,
                                          java.util.Date AV72AlbProfchfrom ,
                                          java.util.Date AV73AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          String AV78albmarcaIN ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          String A39AlbProPri ,
                                          String AV52AlbProPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[24];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T1.AlbUsu, T1.AlbMarca, T1.AlbProfch, T1.AlbHhfm, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD, T1.AlbLic," ;
      scmdbuf += " T1.AlbEnvMail, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbFmd FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV74AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV71GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbUsu" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A6T4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          long AV74AlbProCod ,
                                          int AV71GuiRemCli ,
                                          java.util.Date AV72AlbProfchfrom ,
                                          java.util.Date AV73AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          String AV78albmarcaIN ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          String A39AlbProPri ,
                                          String AV52AlbProPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T1.AlbLic, T1.AlbMarca, T1.AlbProfch, T1.AlbHhfm, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD, T1.AlbUsu," ;
      scmdbuf += " T1.AlbEnvMail, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbFmd FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV74AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV71GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbLic" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A6T5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          long AV74AlbProCod ,
                                          int AV71GuiRemCli ,
                                          java.util.Date AV72AlbProfchfrom ,
                                          java.util.Date AV73AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          String AV78albmarcaIN ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          String A39AlbProPri ,
                                          String AV52AlbProPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[24];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T1.AlbPdATCUD, T1.AlbMarca, T1.AlbProfch, T1.AlbHhfm, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbLic, T1.AlbUsu," ;
      scmdbuf += " T1.AlbEnvMail, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbFmd FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV74AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV71GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbPdATCUD" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0A6T6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          long AV74AlbProCod ,
                                          int AV71GuiRemCli ,
                                          java.util.Date AV72AlbProfchfrom ,
                                          java.util.Date AV73AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          String AV78albmarcaIN ,
                                          String A39AlbProPri ,
                                          String AV52AlbProPri ,
                                          String AV55EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[24];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbMarca, T1.AlbProfch, T1.AlbProPri, T1.EmprCod, T1.AlbHhfm, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD, T1.AlbLic, T1.AlbUsu," ;
      scmdbuf += " T1.AlbEnvMail, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbFmd FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV94Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV74AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV71GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P0A6T2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] );
            case 1 :
                  return conditional_P0A6T3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] );
            case 2 :
                  return conditional_P0A6T4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] );
            case 3 :
                  return conditional_P0A6T5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] );
            case 4 :
                  return conditional_P0A6T6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6T4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6T5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6T6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
      }
   }

}

