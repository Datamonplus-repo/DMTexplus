package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresiondeguiajobgetfilterdata extends GXProcedure
{
   public impresiondeguiajobgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresiondeguiajobgetfilterdata.class ), "" );
   }

   public impresiondeguiajobgetfilterdata( int remoteHandle ,
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
      impresiondeguiajobgetfilterdata.this.aP5 = new String[] {""};
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
      impresiondeguiajobgetfilterdata.this.AV121DDOName = aP0;
      impresiondeguiajobgetfilterdata.this.AV122SearchTxt = aP1;
      impresiondeguiajobgetfilterdata.this.AV123SearchTxtTo = aP2;
      impresiondeguiajobgetfilterdata.this.aP3 = aP3;
      impresiondeguiajobgetfilterdata.this.aP4 = aP4;
      impresiondeguiajobgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV111Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV113OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV114OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV121DDOName), "DDO_GUIREMCLN") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV121DDOName), "DDO_CLIMAILGR") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIMAILGROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV121DDOName), "DDO_CLIMAILPK") == 0 )
      {
         /* Execute user subroutine: 'LOADCLIMAILPKOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV124OptionsJson = AV111Options.toJSonString(false) ;
      AV125OptionsDescJson = AV113OptionsDesc.toJSonString(false) ;
      AV126OptionIndexesJson = AV114OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV116Session.getValue("ImpresionDeGuiaJobGridState"), "") == 0 )
      {
         AV118GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ImpresionDeGuiaJobGridState"), null, null);
      }
      else
      {
         AV118GridState.fromxml(AV116Session.getValue("ImpresionDeGuiaJobGridState"), null, null);
      }
      AV146GXV1 = 1 ;
      while ( AV146GXV1 <= AV118GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV119GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV118GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV1));
         if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV12TFAlbProCod = GXutil.lval( AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV13TFAlbProCod_To = GXutil.lval( AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV26TFGuiRemCln = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV27TFGuiRemCln_Sel = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILGRE_SEL") == 0 )
         {
            AV140TFCliMailGrE_Sel = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILGR") == 0 )
         {
            AV138TFCliMailGr = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILGR_SEL") == 0 )
         {
            AV139TFCliMailGr_Sel = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILPKE_SEL") == 0 )
         {
            AV143TFCliMailPkE_Sel = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILPK") == 0 )
         {
            AV141TFCliMailPk = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILPK_SEL") == 0 )
         {
            AV142TFCliMailPk_Sel = AV119GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV146GXV1 = (int)(AV146GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGUIREMCLNOPTIONS' Routine */
      returnInSub = false ;
      AV26TFGuiRemCln = AV122SearchTxt ;
      AV27TFGuiRemCln_Sel = "" ;
      AV148Impresiondeguiajobds_1_tfalbprocod = AV12TFAlbProCod ;
      AV149Impresiondeguiajobds_2_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV150Impresiondeguiajobds_3_tfguiremcln = AV26TFGuiRemCln ;
      AV151Impresiondeguiajobds_4_tfguiremcln_sel = AV27TFGuiRemCln_Sel ;
      AV152Impresiondeguiajobds_5_tfclimailgre_sel = AV140TFCliMailGrE_Sel ;
      AV153Impresiondeguiajobds_6_tfclimailgr = AV138TFCliMailGr ;
      AV154Impresiondeguiajobds_7_tfclimailgr_sel = AV139TFCliMailGr_Sel ;
      AV155Impresiondeguiajobds_8_tfclimailpke_sel = AV143TFCliMailPkE_Sel ;
      AV156Impresiondeguiajobds_9_tfclimailpk = AV141TFCliMailPk ;
      AV157Impresiondeguiajobds_10_tfclimailpk_sel = AV142TFCliMailPk_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV148Impresiondeguiajobds_1_tfalbprocod) ,
                                           Long.valueOf(AV149Impresiondeguiajobds_2_tfalbprocod_to) ,
                                           AV151Impresiondeguiajobds_4_tfguiremcln_sel ,
                                           AV150Impresiondeguiajobds_3_tfguiremcln ,
                                           AV152Impresiondeguiajobds_5_tfclimailgre_sel ,
                                           AV154Impresiondeguiajobds_7_tfclimailgr_sel ,
                                           AV153Impresiondeguiajobds_6_tfclimailgr ,
                                           AV155Impresiondeguiajobds_8_tfclimailpke_sel ,
                                           AV157Impresiondeguiajobds_10_tfclimailpk_sel ,
                                           AV156Impresiondeguiajobds_9_tfclimailpk ,
                                           Long.valueOf(AV130AlbProCodfrom) ,
                                           AV131ManAut ,
                                           Long.valueOf(AV132AlbProCodto) ,
                                           AV133AlbProfchfrom ,
                                           AV134AlbProfchto ,
                                           Integer.valueOf(AV135Clicodfrom) ,
                                           Integer.valueOf(AV136Clicodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A1244GuiRemCln ,
                                           A11622CliMailGrE ,
                                           A11620CliMailGr ,
                                           A11623CliMailPkE ,
                                           A11621CliMailPk ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A396EmprCod ,
                                           AV128EmprCod ,
                                           A39AlbProPri ,
                                           AV129PRIO } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV150Impresiondeguiajobds_3_tfguiremcln = GXutil.padr( GXutil.rtrim( AV150Impresiondeguiajobds_3_tfguiremcln), 30, "%") ;
      lV153Impresiondeguiajobds_6_tfclimailgr = GXutil.padr( GXutil.rtrim( AV153Impresiondeguiajobds_6_tfclimailgr), 100, "%") ;
      lV156Impresiondeguiajobds_9_tfclimailpk = GXutil.padr( GXutil.rtrim( AV156Impresiondeguiajobds_9_tfclimailpk), 100, "%") ;
      /* Using cursor P0AU62 */
      pr_default.execute(0, new Object[] {AV128EmprCod, AV129PRIO, Long.valueOf(AV148Impresiondeguiajobds_1_tfalbprocod), Long.valueOf(AV149Impresiondeguiajobds_2_tfalbprocod_to), lV150Impresiondeguiajobds_3_tfguiremcln, AV151Impresiondeguiajobds_4_tfguiremcln_sel, AV152Impresiondeguiajobds_5_tfclimailgre_sel, lV153Impresiondeguiajobds_6_tfclimailgr, AV154Impresiondeguiajobds_7_tfclimailgr_sel, AV155Impresiondeguiajobds_8_tfclimailpke_sel, lV156Impresiondeguiajobds_9_tfclimailpk, AV157Impresiondeguiajobds_10_tfclimailpk_sel, Long.valueOf(AV130AlbProCodfrom), Long.valueOf(AV132AlbProCodto), AV133AlbProfchfrom, AV134AlbProfchto, Integer.valueOf(AV135Clicodfrom), Integer.valueOf(AV136Clicodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAU62 = false ;
         A1253EmprGuiRem = P0AU62_A1253EmprGuiRem[0] ;
         A396EmprCod = P0AU62_A396EmprCod[0] ;
         A39AlbProPri = P0AU62_A39AlbProPri[0] ;
         A1244GuiRemCln = P0AU62_A1244GuiRemCln[0] ;
         A33AlbProEst = P0AU62_A33AlbProEst[0] ;
         A1243GuiRemCli = P0AU62_A1243GuiRemCli[0] ;
         A34AlbProfch = P0AU62_A34AlbProfch[0] ;
         A11621CliMailPk = P0AU62_A11621CliMailPk[0] ;
         n11621CliMailPk = P0AU62_n11621CliMailPk[0] ;
         A11623CliMailPkE = P0AU62_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P0AU62_n11623CliMailPkE[0] ;
         A11620CliMailGr = P0AU62_A11620CliMailGr[0] ;
         n11620CliMailGr = P0AU62_n11620CliMailGr[0] ;
         A11622CliMailGrE = P0AU62_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P0AU62_n11622CliMailGrE[0] ;
         A30AlbProCod = P0AU62_A30AlbProCod[0] ;
         A1244GuiRemCln = P0AU62_A1244GuiRemCln[0] ;
         A11621CliMailPk = P0AU62_A11621CliMailPk[0] ;
         n11621CliMailPk = P0AU62_n11621CliMailPk[0] ;
         A11623CliMailPkE = P0AU62_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P0AU62_n11623CliMailPkE[0] ;
         A11620CliMailGr = P0AU62_A11620CliMailGr[0] ;
         n11620CliMailGr = P0AU62_n11620CliMailGr[0] ;
         A11622CliMailGrE = P0AU62_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P0AU62_n11622CliMailGrE[0] ;
         AV115count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AU62_A1244GuiRemCln[0], A1244GuiRemCln) == 0 ) )
         {
            brkAU62 = false ;
            A1253EmprGuiRem = P0AU62_A1253EmprGuiRem[0] ;
            A396EmprCod = P0AU62_A396EmprCod[0] ;
            A1243GuiRemCli = P0AU62_A1243GuiRemCli[0] ;
            A30AlbProCod = P0AU62_A30AlbProCod[0] ;
            AV115count = (long)(AV115count+1) ;
            brkAU62 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1244GuiRemCln)==0) )
         {
            AV110Option = A1244GuiRemCln ;
            AV111Options.add(AV110Option, 0);
            AV114OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV115count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV111Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAU62 )
         {
            brkAU62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLIMAILGROPTIONS' Routine */
      returnInSub = false ;
      AV138TFCliMailGr = AV122SearchTxt ;
      AV139TFCliMailGr_Sel = "" ;
      AV148Impresiondeguiajobds_1_tfalbprocod = AV12TFAlbProCod ;
      AV149Impresiondeguiajobds_2_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV150Impresiondeguiajobds_3_tfguiremcln = AV26TFGuiRemCln ;
      AV151Impresiondeguiajobds_4_tfguiremcln_sel = AV27TFGuiRemCln_Sel ;
      AV152Impresiondeguiajobds_5_tfclimailgre_sel = AV140TFCliMailGrE_Sel ;
      AV153Impresiondeguiajobds_6_tfclimailgr = AV138TFCliMailGr ;
      AV154Impresiondeguiajobds_7_tfclimailgr_sel = AV139TFCliMailGr_Sel ;
      AV155Impresiondeguiajobds_8_tfclimailpke_sel = AV143TFCliMailPkE_Sel ;
      AV156Impresiondeguiajobds_9_tfclimailpk = AV141TFCliMailPk ;
      AV157Impresiondeguiajobds_10_tfclimailpk_sel = AV142TFCliMailPk_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Long.valueOf(AV148Impresiondeguiajobds_1_tfalbprocod) ,
                                           Long.valueOf(AV149Impresiondeguiajobds_2_tfalbprocod_to) ,
                                           AV151Impresiondeguiajobds_4_tfguiremcln_sel ,
                                           AV150Impresiondeguiajobds_3_tfguiremcln ,
                                           AV152Impresiondeguiajobds_5_tfclimailgre_sel ,
                                           AV154Impresiondeguiajobds_7_tfclimailgr_sel ,
                                           AV153Impresiondeguiajobds_6_tfclimailgr ,
                                           AV155Impresiondeguiajobds_8_tfclimailpke_sel ,
                                           AV157Impresiondeguiajobds_10_tfclimailpk_sel ,
                                           AV156Impresiondeguiajobds_9_tfclimailpk ,
                                           Long.valueOf(AV130AlbProCodfrom) ,
                                           AV131ManAut ,
                                           Long.valueOf(AV132AlbProCodto) ,
                                           AV133AlbProfchfrom ,
                                           AV134AlbProfchto ,
                                           Integer.valueOf(AV135Clicodfrom) ,
                                           Integer.valueOf(AV136Clicodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A1244GuiRemCln ,
                                           A11622CliMailGrE ,
                                           A11620CliMailGr ,
                                           A11623CliMailPkE ,
                                           A11621CliMailPk ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A396EmprCod ,
                                           AV128EmprCod ,
                                           A39AlbProPri ,
                                           AV129PRIO } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV150Impresiondeguiajobds_3_tfguiremcln = GXutil.padr( GXutil.rtrim( AV150Impresiondeguiajobds_3_tfguiremcln), 30, "%") ;
      lV153Impresiondeguiajobds_6_tfclimailgr = GXutil.padr( GXutil.rtrim( AV153Impresiondeguiajobds_6_tfclimailgr), 100, "%") ;
      lV156Impresiondeguiajobds_9_tfclimailpk = GXutil.padr( GXutil.rtrim( AV156Impresiondeguiajobds_9_tfclimailpk), 100, "%") ;
      /* Using cursor P0AU63 */
      pr_default.execute(1, new Object[] {AV128EmprCod, AV129PRIO, Long.valueOf(AV148Impresiondeguiajobds_1_tfalbprocod), Long.valueOf(AV149Impresiondeguiajobds_2_tfalbprocod_to), lV150Impresiondeguiajobds_3_tfguiremcln, AV151Impresiondeguiajobds_4_tfguiremcln_sel, AV152Impresiondeguiajobds_5_tfclimailgre_sel, lV153Impresiondeguiajobds_6_tfclimailgr, AV154Impresiondeguiajobds_7_tfclimailgr_sel, AV155Impresiondeguiajobds_8_tfclimailpke_sel, lV156Impresiondeguiajobds_9_tfclimailpk, AV157Impresiondeguiajobds_10_tfclimailpk_sel, Long.valueOf(AV130AlbProCodfrom), Long.valueOf(AV132AlbProCodto), AV133AlbProfchfrom, AV134AlbProfchto, Integer.valueOf(AV135Clicodfrom), Integer.valueOf(AV136Clicodto)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAU64 = false ;
         A1253EmprGuiRem = P0AU63_A1253EmprGuiRem[0] ;
         A396EmprCod = P0AU63_A396EmprCod[0] ;
         A39AlbProPri = P0AU63_A39AlbProPri[0] ;
         A11620CliMailGr = P0AU63_A11620CliMailGr[0] ;
         n11620CliMailGr = P0AU63_n11620CliMailGr[0] ;
         A33AlbProEst = P0AU63_A33AlbProEst[0] ;
         A1243GuiRemCli = P0AU63_A1243GuiRemCli[0] ;
         A34AlbProfch = P0AU63_A34AlbProfch[0] ;
         A11621CliMailPk = P0AU63_A11621CliMailPk[0] ;
         n11621CliMailPk = P0AU63_n11621CliMailPk[0] ;
         A11623CliMailPkE = P0AU63_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P0AU63_n11623CliMailPkE[0] ;
         A11622CliMailGrE = P0AU63_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P0AU63_n11622CliMailGrE[0] ;
         A1244GuiRemCln = P0AU63_A1244GuiRemCln[0] ;
         A30AlbProCod = P0AU63_A30AlbProCod[0] ;
         A11620CliMailGr = P0AU63_A11620CliMailGr[0] ;
         n11620CliMailGr = P0AU63_n11620CliMailGr[0] ;
         A11621CliMailPk = P0AU63_A11621CliMailPk[0] ;
         n11621CliMailPk = P0AU63_n11621CliMailPk[0] ;
         A11623CliMailPkE = P0AU63_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P0AU63_n11623CliMailPkE[0] ;
         A11622CliMailGrE = P0AU63_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P0AU63_n11622CliMailGrE[0] ;
         A1244GuiRemCln = P0AU63_A1244GuiRemCln[0] ;
         AV115count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AU63_A11620CliMailGr[0], A11620CliMailGr) == 0 ) )
         {
            brkAU64 = false ;
            A1253EmprGuiRem = P0AU63_A1253EmprGuiRem[0] ;
            A396EmprCod = P0AU63_A396EmprCod[0] ;
            A1243GuiRemCli = P0AU63_A1243GuiRemCli[0] ;
            A30AlbProCod = P0AU63_A30AlbProCod[0] ;
            AV115count = (long)(AV115count+1) ;
            brkAU64 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11620CliMailGr)==0) )
         {
            AV110Option = A11620CliMailGr ;
            AV111Options.add(AV110Option, 0);
            AV114OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV115count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV111Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAU64 )
         {
            brkAU64 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLIMAILPKOPTIONS' Routine */
      returnInSub = false ;
      AV141TFCliMailPk = AV122SearchTxt ;
      AV142TFCliMailPk_Sel = "" ;
      AV148Impresiondeguiajobds_1_tfalbprocod = AV12TFAlbProCod ;
      AV149Impresiondeguiajobds_2_tfalbprocod_to = AV13TFAlbProCod_To ;
      AV150Impresiondeguiajobds_3_tfguiremcln = AV26TFGuiRemCln ;
      AV151Impresiondeguiajobds_4_tfguiremcln_sel = AV27TFGuiRemCln_Sel ;
      AV152Impresiondeguiajobds_5_tfclimailgre_sel = AV140TFCliMailGrE_Sel ;
      AV153Impresiondeguiajobds_6_tfclimailgr = AV138TFCliMailGr ;
      AV154Impresiondeguiajobds_7_tfclimailgr_sel = AV139TFCliMailGr_Sel ;
      AV155Impresiondeguiajobds_8_tfclimailpke_sel = AV143TFCliMailPkE_Sel ;
      AV156Impresiondeguiajobds_9_tfclimailpk = AV141TFCliMailPk ;
      AV157Impresiondeguiajobds_10_tfclimailpk_sel = AV142TFCliMailPk_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Long.valueOf(AV148Impresiondeguiajobds_1_tfalbprocod) ,
                                           Long.valueOf(AV149Impresiondeguiajobds_2_tfalbprocod_to) ,
                                           AV151Impresiondeguiajobds_4_tfguiremcln_sel ,
                                           AV150Impresiondeguiajobds_3_tfguiremcln ,
                                           AV152Impresiondeguiajobds_5_tfclimailgre_sel ,
                                           AV154Impresiondeguiajobds_7_tfclimailgr_sel ,
                                           AV153Impresiondeguiajobds_6_tfclimailgr ,
                                           AV155Impresiondeguiajobds_8_tfclimailpke_sel ,
                                           AV157Impresiondeguiajobds_10_tfclimailpk_sel ,
                                           AV156Impresiondeguiajobds_9_tfclimailpk ,
                                           Long.valueOf(AV130AlbProCodfrom) ,
                                           AV131ManAut ,
                                           Long.valueOf(AV132AlbProCodto) ,
                                           AV133AlbProfchfrom ,
                                           AV134AlbProfchto ,
                                           Integer.valueOf(AV135Clicodfrom) ,
                                           Integer.valueOf(AV136Clicodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A1244GuiRemCln ,
                                           A11622CliMailGrE ,
                                           A11620CliMailGr ,
                                           A11623CliMailPkE ,
                                           A11621CliMailPk ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A396EmprCod ,
                                           AV128EmprCod ,
                                           A39AlbProPri ,
                                           AV129PRIO } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV150Impresiondeguiajobds_3_tfguiremcln = GXutil.padr( GXutil.rtrim( AV150Impresiondeguiajobds_3_tfguiremcln), 30, "%") ;
      lV153Impresiondeguiajobds_6_tfclimailgr = GXutil.padr( GXutil.rtrim( AV153Impresiondeguiajobds_6_tfclimailgr), 100, "%") ;
      lV156Impresiondeguiajobds_9_tfclimailpk = GXutil.padr( GXutil.rtrim( AV156Impresiondeguiajobds_9_tfclimailpk), 100, "%") ;
      /* Using cursor P0AU64 */
      pr_default.execute(2, new Object[] {AV128EmprCod, AV129PRIO, Long.valueOf(AV148Impresiondeguiajobds_1_tfalbprocod), Long.valueOf(AV149Impresiondeguiajobds_2_tfalbprocod_to), lV150Impresiondeguiajobds_3_tfguiremcln, AV151Impresiondeguiajobds_4_tfguiremcln_sel, AV152Impresiondeguiajobds_5_tfclimailgre_sel, lV153Impresiondeguiajobds_6_tfclimailgr, AV154Impresiondeguiajobds_7_tfclimailgr_sel, AV155Impresiondeguiajobds_8_tfclimailpke_sel, lV156Impresiondeguiajobds_9_tfclimailpk, AV157Impresiondeguiajobds_10_tfclimailpk_sel, Long.valueOf(AV130AlbProCodfrom), Long.valueOf(AV132AlbProCodto), AV133AlbProfchfrom, AV134AlbProfchto, Integer.valueOf(AV135Clicodfrom), Integer.valueOf(AV136Clicodto)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAU66 = false ;
         A1253EmprGuiRem = P0AU64_A1253EmprGuiRem[0] ;
         A396EmprCod = P0AU64_A396EmprCod[0] ;
         A39AlbProPri = P0AU64_A39AlbProPri[0] ;
         A11621CliMailPk = P0AU64_A11621CliMailPk[0] ;
         n11621CliMailPk = P0AU64_n11621CliMailPk[0] ;
         A33AlbProEst = P0AU64_A33AlbProEst[0] ;
         A1243GuiRemCli = P0AU64_A1243GuiRemCli[0] ;
         A34AlbProfch = P0AU64_A34AlbProfch[0] ;
         A11623CliMailPkE = P0AU64_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P0AU64_n11623CliMailPkE[0] ;
         A11620CliMailGr = P0AU64_A11620CliMailGr[0] ;
         n11620CliMailGr = P0AU64_n11620CliMailGr[0] ;
         A11622CliMailGrE = P0AU64_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P0AU64_n11622CliMailGrE[0] ;
         A1244GuiRemCln = P0AU64_A1244GuiRemCln[0] ;
         A30AlbProCod = P0AU64_A30AlbProCod[0] ;
         A11621CliMailPk = P0AU64_A11621CliMailPk[0] ;
         n11621CliMailPk = P0AU64_n11621CliMailPk[0] ;
         A11623CliMailPkE = P0AU64_A11623CliMailPkE[0] ;
         n11623CliMailPkE = P0AU64_n11623CliMailPkE[0] ;
         A11620CliMailGr = P0AU64_A11620CliMailGr[0] ;
         n11620CliMailGr = P0AU64_n11620CliMailGr[0] ;
         A11622CliMailGrE = P0AU64_A11622CliMailGrE[0] ;
         n11622CliMailGrE = P0AU64_n11622CliMailGrE[0] ;
         A1244GuiRemCln = P0AU64_A1244GuiRemCln[0] ;
         AV115count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AU64_A11621CliMailPk[0], A11621CliMailPk) == 0 ) )
         {
            brkAU66 = false ;
            A1253EmprGuiRem = P0AU64_A1253EmprGuiRem[0] ;
            A396EmprCod = P0AU64_A396EmprCod[0] ;
            A1243GuiRemCli = P0AU64_A1243GuiRemCli[0] ;
            A30AlbProCod = P0AU64_A30AlbProCod[0] ;
            AV115count = (long)(AV115count+1) ;
            brkAU66 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11621CliMailPk)==0) )
         {
            AV110Option = A11621CliMailPk ;
            AV111Options.add(AV110Option, 0);
            AV114OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV115count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV111Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAU66 )
         {
            brkAU66 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = impresiondeguiajobgetfilterdata.this.AV124OptionsJson;
      this.aP4[0] = impresiondeguiajobgetfilterdata.this.AV125OptionsDescJson;
      this.aP5[0] = impresiondeguiajobgetfilterdata.this.AV126OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV124OptionsJson = "" ;
      AV125OptionsDescJson = "" ;
      AV126OptionIndexesJson = "" ;
      AV111Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV113OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV114OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV116Session = httpContext.getWebSession();
      AV118GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV119GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV26TFGuiRemCln = "" ;
      AV27TFGuiRemCln_Sel = "" ;
      AV140TFCliMailGrE_Sel = "" ;
      AV138TFCliMailGr = "" ;
      AV139TFCliMailGr_Sel = "" ;
      AV143TFCliMailPkE_Sel = "" ;
      AV141TFCliMailPk = "" ;
      AV142TFCliMailPk_Sel = "" ;
      A1244GuiRemCln = "" ;
      AV150Impresiondeguiajobds_3_tfguiremcln = "" ;
      AV151Impresiondeguiajobds_4_tfguiremcln_sel = "" ;
      AV152Impresiondeguiajobds_5_tfclimailgre_sel = "" ;
      AV153Impresiondeguiajobds_6_tfclimailgr = "" ;
      AV154Impresiondeguiajobds_7_tfclimailgr_sel = "" ;
      AV155Impresiondeguiajobds_8_tfclimailpke_sel = "" ;
      AV156Impresiondeguiajobds_9_tfclimailpk = "" ;
      AV157Impresiondeguiajobds_10_tfclimailpk_sel = "" ;
      scmdbuf = "" ;
      lV150Impresiondeguiajobds_3_tfguiremcln = "" ;
      lV153Impresiondeguiajobds_6_tfclimailgr = "" ;
      lV156Impresiondeguiajobds_9_tfclimailpk = "" ;
      AV131ManAut = "" ;
      AV133AlbProfchfrom = GXutil.nullDate() ;
      AV134AlbProfchto = GXutil.nullDate() ;
      A11622CliMailGrE = "" ;
      A11620CliMailGr = "" ;
      A11623CliMailPkE = "" ;
      A11621CliMailPk = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV128EmprCod = "" ;
      A39AlbProPri = "" ;
      AV129PRIO = "" ;
      P0AU62_A1253EmprGuiRem = new String[] {""} ;
      P0AU62_A396EmprCod = new String[] {""} ;
      P0AU62_A39AlbProPri = new String[] {""} ;
      P0AU62_A1244GuiRemCln = new String[] {""} ;
      P0AU62_A33AlbProEst = new byte[1] ;
      P0AU62_A1243GuiRemCli = new int[1] ;
      P0AU62_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AU62_A11621CliMailPk = new String[] {""} ;
      P0AU62_n11621CliMailPk = new boolean[] {false} ;
      P0AU62_A11623CliMailPkE = new String[] {""} ;
      P0AU62_n11623CliMailPkE = new boolean[] {false} ;
      P0AU62_A11620CliMailGr = new String[] {""} ;
      P0AU62_n11620CliMailGr = new boolean[] {false} ;
      P0AU62_A11622CliMailGrE = new String[] {""} ;
      P0AU62_n11622CliMailGrE = new boolean[] {false} ;
      P0AU62_A30AlbProCod = new long[1] ;
      A1253EmprGuiRem = "" ;
      AV110Option = "" ;
      P0AU63_A1253EmprGuiRem = new String[] {""} ;
      P0AU63_A396EmprCod = new String[] {""} ;
      P0AU63_A39AlbProPri = new String[] {""} ;
      P0AU63_A11620CliMailGr = new String[] {""} ;
      P0AU63_n11620CliMailGr = new boolean[] {false} ;
      P0AU63_A33AlbProEst = new byte[1] ;
      P0AU63_A1243GuiRemCli = new int[1] ;
      P0AU63_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AU63_A11621CliMailPk = new String[] {""} ;
      P0AU63_n11621CliMailPk = new boolean[] {false} ;
      P0AU63_A11623CliMailPkE = new String[] {""} ;
      P0AU63_n11623CliMailPkE = new boolean[] {false} ;
      P0AU63_A11622CliMailGrE = new String[] {""} ;
      P0AU63_n11622CliMailGrE = new boolean[] {false} ;
      P0AU63_A1244GuiRemCln = new String[] {""} ;
      P0AU63_A30AlbProCod = new long[1] ;
      P0AU64_A1253EmprGuiRem = new String[] {""} ;
      P0AU64_A396EmprCod = new String[] {""} ;
      P0AU64_A39AlbProPri = new String[] {""} ;
      P0AU64_A11621CliMailPk = new String[] {""} ;
      P0AU64_n11621CliMailPk = new boolean[] {false} ;
      P0AU64_A33AlbProEst = new byte[1] ;
      P0AU64_A1243GuiRemCli = new int[1] ;
      P0AU64_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AU64_A11623CliMailPkE = new String[] {""} ;
      P0AU64_n11623CliMailPkE = new boolean[] {false} ;
      P0AU64_A11620CliMailGr = new String[] {""} ;
      P0AU64_n11620CliMailGr = new boolean[] {false} ;
      P0AU64_A11622CliMailGrE = new String[] {""} ;
      P0AU64_n11622CliMailGrE = new boolean[] {false} ;
      P0AU64_A1244GuiRemCln = new String[] {""} ;
      P0AU64_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.impresiondeguiajobgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AU62_A1253EmprGuiRem, P0AU62_A396EmprCod, P0AU62_A39AlbProPri, P0AU62_A1244GuiRemCln, P0AU62_A33AlbProEst, P0AU62_A1243GuiRemCli, P0AU62_A34AlbProfch, P0AU62_A11621CliMailPk, P0AU62_n11621CliMailPk, P0AU62_A11623CliMailPkE,
            P0AU62_n11623CliMailPkE, P0AU62_A11620CliMailGr, P0AU62_n11620CliMailGr, P0AU62_A11622CliMailGrE, P0AU62_n11622CliMailGrE, P0AU62_A30AlbProCod
            }
            , new Object[] {
            P0AU63_A1253EmprGuiRem, P0AU63_A396EmprCod, P0AU63_A39AlbProPri, P0AU63_A11620CliMailGr, P0AU63_n11620CliMailGr, P0AU63_A33AlbProEst, P0AU63_A1243GuiRemCli, P0AU63_A34AlbProfch, P0AU63_A11621CliMailPk, P0AU63_n11621CliMailPk,
            P0AU63_A11623CliMailPkE, P0AU63_n11623CliMailPkE, P0AU63_A11622CliMailGrE, P0AU63_n11622CliMailGrE, P0AU63_A1244GuiRemCln, P0AU63_A30AlbProCod
            }
            , new Object[] {
            P0AU64_A1253EmprGuiRem, P0AU64_A396EmprCod, P0AU64_A39AlbProPri, P0AU64_A11621CliMailPk, P0AU64_n11621CliMailPk, P0AU64_A33AlbProEst, P0AU64_A1243GuiRemCli, P0AU64_A34AlbProfch, P0AU64_A11623CliMailPkE, P0AU64_n11623CliMailPkE,
            P0AU64_A11620CliMailGr, P0AU64_n11620CliMailGr, P0AU64_A11622CliMailGrE, P0AU64_n11622CliMailGrE, P0AU64_A1244GuiRemCln, P0AU64_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private short Gx_err ;
   private int AV146GXV1 ;
   private int AV135Clicodfrom ;
   private int AV136Clicodto ;
   private int A1243GuiRemCli ;
   private long AV12TFAlbProCod ;
   private long AV13TFAlbProCod_To ;
   private long AV148Impresiondeguiajobds_1_tfalbprocod ;
   private long AV149Impresiondeguiajobds_2_tfalbprocod_to ;
   private long AV130AlbProCodfrom ;
   private long AV132AlbProCodto ;
   private long A30AlbProCod ;
   private long AV115count ;
   private String AV26TFGuiRemCln ;
   private String AV27TFGuiRemCln_Sel ;
   private String AV140TFCliMailGrE_Sel ;
   private String AV138TFCliMailGr ;
   private String AV139TFCliMailGr_Sel ;
   private String AV143TFCliMailPkE_Sel ;
   private String AV141TFCliMailPk ;
   private String AV142TFCliMailPk_Sel ;
   private String A1244GuiRemCln ;
   private String AV150Impresiondeguiajobds_3_tfguiremcln ;
   private String AV151Impresiondeguiajobds_4_tfguiremcln_sel ;
   private String AV152Impresiondeguiajobds_5_tfclimailgre_sel ;
   private String AV153Impresiondeguiajobds_6_tfclimailgr ;
   private String AV154Impresiondeguiajobds_7_tfclimailgr_sel ;
   private String AV155Impresiondeguiajobds_8_tfclimailpke_sel ;
   private String AV156Impresiondeguiajobds_9_tfclimailpk ;
   private String AV157Impresiondeguiajobds_10_tfclimailpk_sel ;
   private String scmdbuf ;
   private String lV150Impresiondeguiajobds_3_tfguiremcln ;
   private String lV153Impresiondeguiajobds_6_tfclimailgr ;
   private String lV156Impresiondeguiajobds_9_tfclimailpk ;
   private String AV131ManAut ;
   private String A11622CliMailGrE ;
   private String A11620CliMailGr ;
   private String A11623CliMailPkE ;
   private String A11621CliMailPk ;
   private String A396EmprCod ;
   private String AV128EmprCod ;
   private String A39AlbProPri ;
   private String AV129PRIO ;
   private String A1253EmprGuiRem ;
   private java.util.Date AV133AlbProfchfrom ;
   private java.util.Date AV134AlbProfchto ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean brkAU62 ;
   private boolean n11621CliMailPk ;
   private boolean n11623CliMailPkE ;
   private boolean n11620CliMailGr ;
   private boolean n11622CliMailGrE ;
   private boolean brkAU64 ;
   private boolean brkAU66 ;
   private String AV124OptionsJson ;
   private String AV125OptionsDescJson ;
   private String AV126OptionIndexesJson ;
   private String AV121DDOName ;
   private String AV122SearchTxt ;
   private String AV123SearchTxtTo ;
   private String AV110Option ;
   private com.genexus.webpanels.WebSession AV116Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AU62_A1253EmprGuiRem ;
   private String[] P0AU62_A396EmprCod ;
   private String[] P0AU62_A39AlbProPri ;
   private String[] P0AU62_A1244GuiRemCln ;
   private byte[] P0AU62_A33AlbProEst ;
   private int[] P0AU62_A1243GuiRemCli ;
   private java.util.Date[] P0AU62_A34AlbProfch ;
   private String[] P0AU62_A11621CliMailPk ;
   private boolean[] P0AU62_n11621CliMailPk ;
   private String[] P0AU62_A11623CliMailPkE ;
   private boolean[] P0AU62_n11623CliMailPkE ;
   private String[] P0AU62_A11620CliMailGr ;
   private boolean[] P0AU62_n11620CliMailGr ;
   private String[] P0AU62_A11622CliMailGrE ;
   private boolean[] P0AU62_n11622CliMailGrE ;
   private long[] P0AU62_A30AlbProCod ;
   private String[] P0AU63_A1253EmprGuiRem ;
   private String[] P0AU63_A396EmprCod ;
   private String[] P0AU63_A39AlbProPri ;
   private String[] P0AU63_A11620CliMailGr ;
   private boolean[] P0AU63_n11620CliMailGr ;
   private byte[] P0AU63_A33AlbProEst ;
   private int[] P0AU63_A1243GuiRemCli ;
   private java.util.Date[] P0AU63_A34AlbProfch ;
   private String[] P0AU63_A11621CliMailPk ;
   private boolean[] P0AU63_n11621CliMailPk ;
   private String[] P0AU63_A11623CliMailPkE ;
   private boolean[] P0AU63_n11623CliMailPkE ;
   private String[] P0AU63_A11622CliMailGrE ;
   private boolean[] P0AU63_n11622CliMailGrE ;
   private String[] P0AU63_A1244GuiRemCln ;
   private long[] P0AU63_A30AlbProCod ;
   private String[] P0AU64_A1253EmprGuiRem ;
   private String[] P0AU64_A396EmprCod ;
   private String[] P0AU64_A39AlbProPri ;
   private String[] P0AU64_A11621CliMailPk ;
   private boolean[] P0AU64_n11621CliMailPk ;
   private byte[] P0AU64_A33AlbProEst ;
   private int[] P0AU64_A1243GuiRemCli ;
   private java.util.Date[] P0AU64_A34AlbProfch ;
   private String[] P0AU64_A11623CliMailPkE ;
   private boolean[] P0AU64_n11623CliMailPkE ;
   private String[] P0AU64_A11620CliMailGr ;
   private boolean[] P0AU64_n11620CliMailGr ;
   private String[] P0AU64_A11622CliMailGrE ;
   private boolean[] P0AU64_n11622CliMailGrE ;
   private String[] P0AU64_A1244GuiRemCln ;
   private long[] P0AU64_A30AlbProCod ;
   private GXSimpleCollection<String> AV111Options ;
   private GXSimpleCollection<String> AV113OptionsDesc ;
   private GXSimpleCollection<String> AV114OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV118GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV119GridStateFilterValue ;
}

final  class impresiondeguiajobgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AU62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV148Impresiondeguiajobds_1_tfalbprocod ,
                                          long AV149Impresiondeguiajobds_2_tfalbprocod_to ,
                                          String AV151Impresiondeguiajobds_4_tfguiremcln_sel ,
                                          String AV150Impresiondeguiajobds_3_tfguiremcln ,
                                          String AV152Impresiondeguiajobds_5_tfclimailgre_sel ,
                                          String AV154Impresiondeguiajobds_7_tfclimailgr_sel ,
                                          String AV153Impresiondeguiajobds_6_tfclimailgr ,
                                          String AV155Impresiondeguiajobds_8_tfclimailpke_sel ,
                                          String AV157Impresiondeguiajobds_10_tfclimailpk_sel ,
                                          String AV156Impresiondeguiajobds_9_tfclimailpk ,
                                          long AV130AlbProCodfrom ,
                                          String AV131ManAut ,
                                          long AV132AlbProCodto ,
                                          java.util.Date AV133AlbProfchfrom ,
                                          java.util.Date AV134AlbProfchto ,
                                          int AV135Clicodfrom ,
                                          int AV136Clicodto ,
                                          long A30AlbProCod ,
                                          String A1244GuiRemCln ,
                                          String A11622CliMailGrE ,
                                          String A11620CliMailGr ,
                                          String A11623CliMailPkE ,
                                          String A11621CliMailPk ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A396EmprCod ,
                                          String AV128EmprCod ,
                                          String A39AlbProPri ,
                                          String AV129PRIO )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T2.CliNom AS GuiRemCln, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T2.CliMailPk, T2.CliMailPkE," ;
      scmdbuf += " T2.CliMailGr, T2.CliMailGrE, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV148Impresiondeguiajobds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV149Impresiondeguiajobds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Impresiondeguiajobds_4_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV150Impresiondeguiajobds_3_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Impresiondeguiajobds_4_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Impresiondeguiajobds_5_tfclimailgre_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGrE = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Impresiondeguiajobds_7_tfclimailgr_sel)==0) && ( ! (GXutil.strcmp("", AV153Impresiondeguiajobds_6_tfclimailgr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailGr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Impresiondeguiajobds_7_tfclimailgr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGr = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Impresiondeguiajobds_8_tfclimailpke_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPkE = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Impresiondeguiajobds_10_tfclimailpk_sel)==0) && ( ! (GXutil.strcmp("", AV156Impresiondeguiajobds_9_tfclimailpk)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailPk) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Impresiondeguiajobds_10_tfclimailpk_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPk = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV130AlbProCodfrom) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV132AlbProCodto) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133AlbProfchfrom)) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134AlbProfchto)) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV135Clicodfrom) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV136Clicodto) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV131ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AU63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV148Impresiondeguiajobds_1_tfalbprocod ,
                                          long AV149Impresiondeguiajobds_2_tfalbprocod_to ,
                                          String AV151Impresiondeguiajobds_4_tfguiremcln_sel ,
                                          String AV150Impresiondeguiajobds_3_tfguiremcln ,
                                          String AV152Impresiondeguiajobds_5_tfclimailgre_sel ,
                                          String AV154Impresiondeguiajobds_7_tfclimailgr_sel ,
                                          String AV153Impresiondeguiajobds_6_tfclimailgr ,
                                          String AV155Impresiondeguiajobds_8_tfclimailpke_sel ,
                                          String AV157Impresiondeguiajobds_10_tfclimailpk_sel ,
                                          String AV156Impresiondeguiajobds_9_tfclimailpk ,
                                          long AV130AlbProCodfrom ,
                                          String AV131ManAut ,
                                          long AV132AlbProCodto ,
                                          java.util.Date AV133AlbProfchfrom ,
                                          java.util.Date AV134AlbProfchto ,
                                          int AV135Clicodfrom ,
                                          int AV136Clicodto ,
                                          long A30AlbProCod ,
                                          String A1244GuiRemCln ,
                                          String A11622CliMailGrE ,
                                          String A11620CliMailGr ,
                                          String A11623CliMailPkE ,
                                          String A11621CliMailPk ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A396EmprCod ,
                                          String AV128EmprCod ,
                                          String A39AlbProPri ,
                                          String AV129PRIO )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T2.CliMailGr, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T2.CliMailPk, T2.CliMailPkE, T2.CliMailGrE," ;
      scmdbuf += " T2.CliNom AS GuiRemCln, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV148Impresiondeguiajobds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV149Impresiondeguiajobds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Impresiondeguiajobds_4_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV150Impresiondeguiajobds_3_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Impresiondeguiajobds_4_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Impresiondeguiajobds_5_tfclimailgre_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGrE = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Impresiondeguiajobds_7_tfclimailgr_sel)==0) && ( ! (GXutil.strcmp("", AV153Impresiondeguiajobds_6_tfclimailgr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailGr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Impresiondeguiajobds_7_tfclimailgr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGr = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Impresiondeguiajobds_8_tfclimailpke_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPkE = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Impresiondeguiajobds_10_tfclimailpk_sel)==0) && ( ! (GXutil.strcmp("", AV156Impresiondeguiajobds_9_tfclimailpk)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailPk) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Impresiondeguiajobds_10_tfclimailpk_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPk = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV130AlbProCodfrom) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV132AlbProCodto) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133AlbProfchfrom)) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134AlbProfchto)) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV135Clicodfrom) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV136Clicodto) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV131ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliMailGr" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AU64( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV148Impresiondeguiajobds_1_tfalbprocod ,
                                          long AV149Impresiondeguiajobds_2_tfalbprocod_to ,
                                          String AV151Impresiondeguiajobds_4_tfguiremcln_sel ,
                                          String AV150Impresiondeguiajobds_3_tfguiremcln ,
                                          String AV152Impresiondeguiajobds_5_tfclimailgre_sel ,
                                          String AV154Impresiondeguiajobds_7_tfclimailgr_sel ,
                                          String AV153Impresiondeguiajobds_6_tfclimailgr ,
                                          String AV155Impresiondeguiajobds_8_tfclimailpke_sel ,
                                          String AV157Impresiondeguiajobds_10_tfclimailpk_sel ,
                                          String AV156Impresiondeguiajobds_9_tfclimailpk ,
                                          long AV130AlbProCodfrom ,
                                          String AV131ManAut ,
                                          long AV132AlbProCodto ,
                                          java.util.Date AV133AlbProfchfrom ,
                                          java.util.Date AV134AlbProfchto ,
                                          int AV135Clicodfrom ,
                                          int AV136Clicodto ,
                                          long A30AlbProCod ,
                                          String A1244GuiRemCln ,
                                          String A11622CliMailGrE ,
                                          String A11620CliMailGr ,
                                          String A11623CliMailPkE ,
                                          String A11621CliMailPk ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A396EmprCod ,
                                          String AV128EmprCod ,
                                          String A39AlbProPri ,
                                          String AV129PRIO )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T2.CliMailPk, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T2.CliMailPkE, T2.CliMailGr, T2.CliMailGrE," ;
      scmdbuf += " T2.CliNom AS GuiRemCln, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV148Impresiondeguiajobds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV149Impresiondeguiajobds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Impresiondeguiajobds_4_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV150Impresiondeguiajobds_3_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Impresiondeguiajobds_4_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Impresiondeguiajobds_5_tfclimailgre_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGrE = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Impresiondeguiajobds_7_tfclimailgr_sel)==0) && ( ! (GXutil.strcmp("", AV153Impresiondeguiajobds_6_tfclimailgr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailGr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Impresiondeguiajobds_7_tfclimailgr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGr = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Impresiondeguiajobds_8_tfclimailpke_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPkE = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Impresiondeguiajobds_10_tfclimailpk_sel)==0) && ( ! (GXutil.strcmp("", AV156Impresiondeguiajobds_9_tfclimailpk)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailPk) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Impresiondeguiajobds_10_tfclimailpk_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPk = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV130AlbProCodfrom) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV132AlbProCodto) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133AlbProfchfrom)) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134AlbProfchto)) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV135Clicodfrom) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV136Clicodto) && ( GXutil.strcmp(AV131ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV131ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliMailPk" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0AU62(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P0AU63(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P0AU64(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AU62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AU63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AU64", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((long[]) buf[15])[0] = rslt.getLong(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((long[]) buf[15])[0] = rslt.getLong(12);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
      }
   }

}

