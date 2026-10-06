package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_cabecerawwgetfilterdata extends GXProcedure
{
   public documentotransportecomercial_cabecerawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_cabecerawwgetfilterdata.class ), "" );
   }

   public documentotransportecomercial_cabecerawwgetfilterdata( int remoteHandle ,
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
      documentotransportecomercial_cabecerawwgetfilterdata.this.aP5 = new String[] {""};
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
      documentotransportecomercial_cabecerawwgetfilterdata.this.AV45DDOName = aP0;
      documentotransportecomercial_cabecerawwgetfilterdata.this.AV46SearchTxt = aP1;
      documentotransportecomercial_cabecerawwgetfilterdata.this.AV47SearchTxtTo = aP2;
      documentotransportecomercial_cabecerawwgetfilterdata.this.aP3 = aP3;
      documentotransportecomercial_cabecerawwgetfilterdata.this.aP4 = aP4;
      documentotransportecomercial_cabecerawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV37OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_ALBCOMID") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMIDOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_ALBCOMATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMATCUDOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_ALBCOM4DIG") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOM4DIGOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV48OptionsJson = AV35Options.toJSonString(false) ;
      AV49OptionsDescJson = AV37OptionsDesc.toJSonString(false) ;
      AV50OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue("DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWWGridState"), "") == 0 )
      {
         AV42GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWWGridState"), null, null);
      }
      else
      {
         AV42GridState.fromxml(AV40Session.getValue("DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWWGridState"), null, null);
      }
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV42GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV43GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV42GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST_SEL") == 0 )
         {
            AV52TFAlbComEst_SelsJson = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFAlbComEst_Sels.fromJSonString(AV52TFAlbComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMST_SEL") == 0 )
         {
            AV58TFAlbComSt_SelsJson = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV59TFAlbComSt_Sels.fromJSonString(AV58TFAlbComSt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMHOR") == 0 )
         {
            AV21TFAlbComHor = localUtil.ctot( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID") == 0 )
         {
            AV22TFAlbComID = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID_SEL") == 0 )
         {
            AV23TFAlbComID_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD") == 0 )
         {
            AV24TFAlbComATCUD = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD_SEL") == 0 )
         {
            AV25TFAlbComATCUD_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEAT_SEL") == 0 )
         {
            AV54TFAlbComEAT_SelsJson = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFAlbComEAT_Sels.fromJSonString(AV54TFAlbComEAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMAT_SEL") == 0 )
         {
            AV60TFAlbComAT_SelsJson = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV61TFAlbComAT_Sels.fromJSonString(AV60TFAlbComAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFS") == 0 )
         {
            AV30TFAlbComFs = localUtil.ctot( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOM4DIG") == 0 )
         {
            AV62TFAlbCom4dig = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOM4DIG_SEL") == 0 )
         {
            AV63TFAlbCom4dig_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROPRI") == 0 )
         {
            AV69AlbProPri = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CONTCOD") == 0 )
         {
            AV70ContCod = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV46SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV14TFCliNom ;
      AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV53TFAlbComEst_Sels ;
      AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV59TFAlbComSt_Sels ;
      AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV21TFAlbComHor ;
      AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV22TFAlbComID ;
      AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV23TFAlbComID_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV24TFAlbComATCUD ;
      AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV25TFAlbComATCUD_Sel ;
      AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV55TFAlbComEAT_Sels ;
      AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV61TFAlbComAT_Sels ;
      AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV30TFAlbComFs ;
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV62TFAlbCom4dig ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV63TFAlbCom4dig_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                           A10738AlbComSt ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                           A10764AlbComAT ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                           Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                           Integer.valueOf(AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels.size()) ,
                                           Integer.valueOf(AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels.size()) ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                           Integer.valueOf(AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels.size()) ,
                                           Integer.valueOf(AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels.size()) ,
                                           AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                           AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                           AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                           Integer.valueOf(AV64AlbcomCod) ,
                                           Integer.valueOf(AV65clicod) ,
                                           AV66ALbComfchfrom ,
                                           AV67ALbComfchto ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A14248AlbComATCU ,
                                           A10013AlbComFs ,
                                           A10014AlbComFd ,
                                           Integer.valueOf(A252CliCod) ,
                                           A17AlbComFch ,
                                           AV68AlbComStIN ,
                                           A396EmprCod ,
                                           AV56EmprCod ,
                                           A22AlbComPri ,
                                           AV57Prioridad } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom), 30, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid), 20, "%") ;
      lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud), 20, "%") ;
      lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = GXutil.padr( GXutil.rtrim( AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig), 4, "%") ;
      /* Using cursor P0A8O2 */
      pr_default.execute(0, new Object[] {AV68AlbComStIN, AV68AlbComStIN, AV56EmprCod, AV57Prioridad, Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod), Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to), lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom, AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel, AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor, lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid, AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel, lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud, AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel, AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs, lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig, AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel, Integer.valueOf(AV64AlbcomCod), Integer.valueOf(AV65clicod), AV66ALbComfchfrom, AV67ALbComfchto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA8O2 = false ;
         A396EmprCod = P0A8O2_A396EmprCod[0] ;
         A22AlbComPri = P0A8O2_A22AlbComPri[0] ;
         A279CliNom = P0A8O2_A279CliNom[0] ;
         A17AlbComFch = P0A8O2_A17AlbComFch[0] ;
         A252CliCod = P0A8O2_A252CliCod[0] ;
         A10013AlbComFs = P0A8O2_A10013AlbComFs[0] ;
         A10764AlbComAT = P0A8O2_A10764AlbComAT[0] ;
         A10739AlbComEAT = P0A8O2_A10739AlbComEAT[0] ;
         A14248AlbComATCU = P0A8O2_A14248AlbComATCU[0] ;
         A10740AlbComID = P0A8O2_A10740AlbComID[0] ;
         A4829AlbComHor = P0A8O2_A4829AlbComHor[0] ;
         A10738AlbComSt = P0A8O2_A10738AlbComSt[0] ;
         A16AlbComEst = P0A8O2_A16AlbComEst[0] ;
         A14AlbComCod = P0A8O2_A14AlbComCod[0] ;
         A10014AlbComFd = P0A8O2_A10014AlbComFd[0] ;
         A279CliNom = P0A8O2_A279CliNom[0] ;
         A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A8O2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkA8O2 = false ;
            A396EmprCod = P0A8O2_A396EmprCod[0] ;
            A252CliCod = P0A8O2_A252CliCod[0] ;
            A14AlbComCod = P0A8O2_A14AlbComCod[0] ;
            AV39count = (long)(AV39count+1) ;
            brkA8O2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV34Option = A279CliNom ;
            AV35Options.add(AV34Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8O2 )
         {
            brkA8O2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMIDOPTIONS' Routine */
      returnInSub = false ;
      AV22TFAlbComID = AV46SearchTxt ;
      AV23TFAlbComID_Sel = "" ;
      AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV14TFCliNom ;
      AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV53TFAlbComEst_Sels ;
      AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV59TFAlbComSt_Sels ;
      AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV21TFAlbComHor ;
      AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV22TFAlbComID ;
      AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV23TFAlbComID_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV24TFAlbComATCUD ;
      AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV25TFAlbComATCUD_Sel ;
      AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV55TFAlbComEAT_Sels ;
      AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV61TFAlbComAT_Sels ;
      AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV30TFAlbComFs ;
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV62TFAlbCom4dig ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV63TFAlbCom4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                           A10738AlbComSt ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                           A10764AlbComAT ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                           Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                           Integer.valueOf(AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels.size()) ,
                                           Integer.valueOf(AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels.size()) ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                           Integer.valueOf(AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels.size()) ,
                                           Integer.valueOf(AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels.size()) ,
                                           AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                           AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                           AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                           Integer.valueOf(AV64AlbcomCod) ,
                                           Integer.valueOf(AV65clicod) ,
                                           AV66ALbComfchfrom ,
                                           AV67ALbComfchto ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A14248AlbComATCU ,
                                           A10013AlbComFs ,
                                           A10014AlbComFd ,
                                           Integer.valueOf(A252CliCod) ,
                                           A17AlbComFch ,
                                           AV68AlbComStIN ,
                                           A396EmprCod ,
                                           AV56EmprCod ,
                                           A22AlbComPri ,
                                           AV57Prioridad } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom), 30, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid), 20, "%") ;
      lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud), 20, "%") ;
      lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = GXutil.padr( GXutil.rtrim( AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig), 4, "%") ;
      /* Using cursor P0A8O3 */
      pr_default.execute(1, new Object[] {AV68AlbComStIN, AV68AlbComStIN, AV56EmprCod, AV57Prioridad, Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod), Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to), lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom, AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel, AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor, lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid, AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel, lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud, AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel, AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs, lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig, AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel, Integer.valueOf(AV64AlbcomCod), Integer.valueOf(AV65clicod), AV66ALbComfchfrom, AV67ALbComfchto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA8O4 = false ;
         A396EmprCod = P0A8O3_A396EmprCod[0] ;
         A22AlbComPri = P0A8O3_A22AlbComPri[0] ;
         A10740AlbComID = P0A8O3_A10740AlbComID[0] ;
         A17AlbComFch = P0A8O3_A17AlbComFch[0] ;
         A252CliCod = P0A8O3_A252CliCod[0] ;
         A10013AlbComFs = P0A8O3_A10013AlbComFs[0] ;
         A10764AlbComAT = P0A8O3_A10764AlbComAT[0] ;
         A10739AlbComEAT = P0A8O3_A10739AlbComEAT[0] ;
         A14248AlbComATCU = P0A8O3_A14248AlbComATCU[0] ;
         A4829AlbComHor = P0A8O3_A4829AlbComHor[0] ;
         A10738AlbComSt = P0A8O3_A10738AlbComSt[0] ;
         A16AlbComEst = P0A8O3_A16AlbComEst[0] ;
         A279CliNom = P0A8O3_A279CliNom[0] ;
         A14AlbComCod = P0A8O3_A14AlbComCod[0] ;
         A10014AlbComFd = P0A8O3_A10014AlbComFd[0] ;
         A279CliNom = P0A8O3_A279CliNom[0] ;
         A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A8O3_A10740AlbComID[0], A10740AlbComID) == 0 ) )
         {
            brkA8O4 = false ;
            A396EmprCod = P0A8O3_A396EmprCod[0] ;
            A14AlbComCod = P0A8O3_A14AlbComCod[0] ;
            AV39count = (long)(AV39count+1) ;
            brkA8O4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10740AlbComID)==0) )
         {
            AV34Option = A10740AlbComID ;
            AV35Options.add(AV34Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8O4 )
         {
            brkA8O4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBCOMATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbComATCUD = AV46SearchTxt ;
      AV25TFAlbComATCUD_Sel = "" ;
      AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV14TFCliNom ;
      AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV53TFAlbComEst_Sels ;
      AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV59TFAlbComSt_Sels ;
      AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV21TFAlbComHor ;
      AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV22TFAlbComID ;
      AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV23TFAlbComID_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV24TFAlbComATCUD ;
      AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV25TFAlbComATCUD_Sel ;
      AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV55TFAlbComEAT_Sels ;
      AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV61TFAlbComAT_Sels ;
      AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV30TFAlbComFs ;
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV62TFAlbCom4dig ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV63TFAlbCom4dig_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                           A10738AlbComSt ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                           A10764AlbComAT ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                           Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                           Integer.valueOf(AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels.size()) ,
                                           Integer.valueOf(AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels.size()) ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                           Integer.valueOf(AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels.size()) ,
                                           Integer.valueOf(AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels.size()) ,
                                           AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                           AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                           AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                           Integer.valueOf(AV64AlbcomCod) ,
                                           Integer.valueOf(AV65clicod) ,
                                           AV66ALbComfchfrom ,
                                           AV67ALbComfchto ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A14248AlbComATCU ,
                                           A10013AlbComFs ,
                                           A10014AlbComFd ,
                                           Integer.valueOf(A252CliCod) ,
                                           A17AlbComFch ,
                                           AV68AlbComStIN ,
                                           A396EmprCod ,
                                           AV56EmprCod ,
                                           A22AlbComPri ,
                                           AV57Prioridad } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom), 30, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid), 20, "%") ;
      lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud), 20, "%") ;
      lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = GXutil.padr( GXutil.rtrim( AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig), 4, "%") ;
      /* Using cursor P0A8O4 */
      pr_default.execute(2, new Object[] {AV68AlbComStIN, AV68AlbComStIN, AV56EmprCod, AV57Prioridad, Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod), Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to), lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom, AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel, AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor, lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid, AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel, lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud, AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel, AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs, lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig, AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel, Integer.valueOf(AV64AlbcomCod), Integer.valueOf(AV65clicod), AV66ALbComfchfrom, AV67ALbComfchto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA8O6 = false ;
         A396EmprCod = P0A8O4_A396EmprCod[0] ;
         A22AlbComPri = P0A8O4_A22AlbComPri[0] ;
         A14248AlbComATCU = P0A8O4_A14248AlbComATCU[0] ;
         A17AlbComFch = P0A8O4_A17AlbComFch[0] ;
         A252CliCod = P0A8O4_A252CliCod[0] ;
         A10013AlbComFs = P0A8O4_A10013AlbComFs[0] ;
         A10764AlbComAT = P0A8O4_A10764AlbComAT[0] ;
         A10739AlbComEAT = P0A8O4_A10739AlbComEAT[0] ;
         A10740AlbComID = P0A8O4_A10740AlbComID[0] ;
         A4829AlbComHor = P0A8O4_A4829AlbComHor[0] ;
         A10738AlbComSt = P0A8O4_A10738AlbComSt[0] ;
         A16AlbComEst = P0A8O4_A16AlbComEst[0] ;
         A279CliNom = P0A8O4_A279CliNom[0] ;
         A14AlbComCod = P0A8O4_A14AlbComCod[0] ;
         A10014AlbComFd = P0A8O4_A10014AlbComFd[0] ;
         A279CliNom = P0A8O4_A279CliNom[0] ;
         A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A8O4_A14248AlbComATCU[0], A14248AlbComATCU) == 0 ) )
         {
            brkA8O6 = false ;
            A396EmprCod = P0A8O4_A396EmprCod[0] ;
            A14AlbComCod = P0A8O4_A14AlbComCod[0] ;
            AV39count = (long)(AV39count+1) ;
            brkA8O6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14248AlbComATCU)==0) )
         {
            AV34Option = A14248AlbComATCU ;
            AV35Options.add(AV34Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA8O6 )
         {
            brkA8O6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBCOM4DIGOPTIONS' Routine */
      returnInSub = false ;
      AV62TFAlbCom4dig = AV46SearchTxt ;
      AV63TFAlbCom4dig_Sel = "" ;
      AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV14TFCliNom ;
      AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV15TFCliNom_Sel ;
      AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV53TFAlbComEst_Sels ;
      AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV59TFAlbComSt_Sels ;
      AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV21TFAlbComHor ;
      AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV22TFAlbComID ;
      AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV23TFAlbComID_Sel ;
      AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV24TFAlbComATCUD ;
      AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV25TFAlbComATCUD_Sel ;
      AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV55TFAlbComEAT_Sels ;
      AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV61TFAlbComAT_Sels ;
      AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV30TFAlbComFs ;
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV62TFAlbCom4dig ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV63TFAlbCom4dig_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                           A10738AlbComSt ,
                                           AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                           A10764AlbComAT ,
                                           AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                           Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) ,
                                           AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                           AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                           Integer.valueOf(AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels.size()) ,
                                           Integer.valueOf(AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels.size()) ,
                                           AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                           AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                           AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                           AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                           AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                           Integer.valueOf(AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels.size()) ,
                                           Integer.valueOf(AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels.size()) ,
                                           AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                           AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                           AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                           Integer.valueOf(AV64AlbcomCod) ,
                                           Integer.valueOf(AV65clicod) ,
                                           AV66ALbComfchfrom ,
                                           AV67ALbComfchto ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A14248AlbComATCU ,
                                           A10013AlbComFs ,
                                           A10014AlbComFd ,
                                           Integer.valueOf(A252CliCod) ,
                                           A17AlbComFch ,
                                           AV68AlbComStIN ,
                                           A22AlbComPri ,
                                           AV57Prioridad ,
                                           AV56EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom), 30, "%") ;
      lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = GXutil.padr( GXutil.rtrim( AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid), 20, "%") ;
      lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud), 20, "%") ;
      lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = GXutil.padr( GXutil.rtrim( AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig), 4, "%") ;
      /* Using cursor P0A8O5 */
      pr_default.execute(3, new Object[] {AV56EmprCod, AV68AlbComStIN, AV68AlbComStIN, AV57Prioridad, Integer.valueOf(AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod), Integer.valueOf(AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to), lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom, AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel, AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor, lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid, AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel, lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud, AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel, AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs, lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig, AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel, Integer.valueOf(AV64AlbcomCod), Integer.valueOf(AV65clicod), AV66ALbComfchfrom, AV67ALbComfchto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A17AlbComFch = P0A8O5_A17AlbComFch[0] ;
         A252CliCod = P0A8O5_A252CliCod[0] ;
         A22AlbComPri = P0A8O5_A22AlbComPri[0] ;
         A396EmprCod = P0A8O5_A396EmprCod[0] ;
         A10013AlbComFs = P0A8O5_A10013AlbComFs[0] ;
         A10764AlbComAT = P0A8O5_A10764AlbComAT[0] ;
         A10739AlbComEAT = P0A8O5_A10739AlbComEAT[0] ;
         A14248AlbComATCU = P0A8O5_A14248AlbComATCU[0] ;
         A10740AlbComID = P0A8O5_A10740AlbComID[0] ;
         A4829AlbComHor = P0A8O5_A4829AlbComHor[0] ;
         A10738AlbComSt = P0A8O5_A10738AlbComSt[0] ;
         A16AlbComEst = P0A8O5_A16AlbComEst[0] ;
         A279CliNom = P0A8O5_A279CliNom[0] ;
         A14AlbComCod = P0A8O5_A14AlbComCod[0] ;
         A10014AlbComFd = P0A8O5_A10014AlbComFd[0] ;
         A279CliNom = P0A8O5_A279CliNom[0] ;
         A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
         if ( ! (GXutil.strcmp("", A14374AlbCom4dig)==0) )
         {
            AV34Option = A14374AlbCom4dig ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
            {
               AV39count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
               AV39count = (long)(AV39count+1) ;
               AV38OptionIndexes.removeItem(AV33InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
            }
            else
            {
               AV35Options.add(AV34Option, AV33InsertIndex);
               AV38OptionIndexes.add("1", AV33InsertIndex);
            }
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransportecomercial_cabecerawwgetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = documentotransportecomercial_cabecerawwgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = documentotransportecomercial_cabecerawwgetfilterdata.this.AV50OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48OptionsJson = "" ;
      AV49OptionsDescJson = "" ;
      AV50OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV40Session = httpContext.getWebSession();
      AV42GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV43GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV52TFAlbComEst_SelsJson = "" ;
      AV53TFAlbComEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFAlbComSt_SelsJson = "" ;
      AV59TFAlbComSt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21TFAlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV22TFAlbComID = "" ;
      AV23TFAlbComID_Sel = "" ;
      AV24TFAlbComATCUD = "" ;
      AV25TFAlbComATCUD_Sel = "" ;
      AV54TFAlbComEAT_SelsJson = "" ;
      AV55TFAlbComEAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV60TFAlbComAT_SelsJson = "" ;
      AV61TFAlbComAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30TFAlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV62TFAlbCom4dig = "" ;
      AV63TFAlbCom4dig_Sel = "" ;
      AV69AlbProPri = "" ;
      AV70ContCod = "" ;
      A279CliNom = "" ;
      AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = "" ;
      AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = "" ;
      AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = GXutil.resetTime( GXutil.nullDate() );
      AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = "" ;
      AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = "" ;
      AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = "" ;
      AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = "" ;
      AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = GXutil.resetTime( GXutil.nullDate() );
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = "" ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = "" ;
      scmdbuf = "" ;
      lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = "" ;
      lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = "" ;
      lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = "" ;
      lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = "" ;
      A10738AlbComSt = "" ;
      A10764AlbComAT = "" ;
      AV66ALbComfchfrom = GXutil.nullDate() ;
      AV67ALbComfchto = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A14248AlbComATCU = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10014AlbComFd = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      AV68AlbComStIN = "" ;
      A396EmprCod = "" ;
      AV56EmprCod = "" ;
      A22AlbComPri = "" ;
      AV57Prioridad = "" ;
      P0A8O2_A396EmprCod = new String[] {""} ;
      P0A8O2_A22AlbComPri = new String[] {""} ;
      P0A8O2_A279CliNom = new String[] {""} ;
      P0A8O2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O2_A252CliCod = new int[1] ;
      P0A8O2_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O2_A10764AlbComAT = new String[] {""} ;
      P0A8O2_A10739AlbComEAT = new byte[1] ;
      P0A8O2_A14248AlbComATCU = new String[] {""} ;
      P0A8O2_A10740AlbComID = new String[] {""} ;
      P0A8O2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O2_A10738AlbComSt = new String[] {""} ;
      P0A8O2_A16AlbComEst = new byte[1] ;
      P0A8O2_A14AlbComCod = new int[1] ;
      P0A8O2_A10014AlbComFd = new String[] {""} ;
      A14374AlbCom4dig = "" ;
      AV34Option = "" ;
      P0A8O3_A396EmprCod = new String[] {""} ;
      P0A8O3_A22AlbComPri = new String[] {""} ;
      P0A8O3_A10740AlbComID = new String[] {""} ;
      P0A8O3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O3_A252CliCod = new int[1] ;
      P0A8O3_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O3_A10764AlbComAT = new String[] {""} ;
      P0A8O3_A10739AlbComEAT = new byte[1] ;
      P0A8O3_A14248AlbComATCU = new String[] {""} ;
      P0A8O3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O3_A10738AlbComSt = new String[] {""} ;
      P0A8O3_A16AlbComEst = new byte[1] ;
      P0A8O3_A279CliNom = new String[] {""} ;
      P0A8O3_A14AlbComCod = new int[1] ;
      P0A8O3_A10014AlbComFd = new String[] {""} ;
      P0A8O4_A396EmprCod = new String[] {""} ;
      P0A8O4_A22AlbComPri = new String[] {""} ;
      P0A8O4_A14248AlbComATCU = new String[] {""} ;
      P0A8O4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O4_A252CliCod = new int[1] ;
      P0A8O4_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O4_A10764AlbComAT = new String[] {""} ;
      P0A8O4_A10739AlbComEAT = new byte[1] ;
      P0A8O4_A10740AlbComID = new String[] {""} ;
      P0A8O4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O4_A10738AlbComSt = new String[] {""} ;
      P0A8O4_A16AlbComEst = new byte[1] ;
      P0A8O4_A279CliNom = new String[] {""} ;
      P0A8O4_A14AlbComCod = new int[1] ;
      P0A8O4_A10014AlbComFd = new String[] {""} ;
      P0A8O5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O5_A252CliCod = new int[1] ;
      P0A8O5_A22AlbComPri = new String[] {""} ;
      P0A8O5_A396EmprCod = new String[] {""} ;
      P0A8O5_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O5_A10764AlbComAT = new String[] {""} ;
      P0A8O5_A10739AlbComEAT = new byte[1] ;
      P0A8O5_A14248AlbComATCU = new String[] {""} ;
      P0A8O5_A10740AlbComID = new String[] {""} ;
      P0A8O5_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0A8O5_A10738AlbComSt = new String[] {""} ;
      P0A8O5_A16AlbComEst = new byte[1] ;
      P0A8O5_A279CliNom = new String[] {""} ;
      P0A8O5_A14AlbComCod = new int[1] ;
      P0A8O5_A10014AlbComFd = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabecerawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A8O2_A396EmprCod, P0A8O2_A22AlbComPri, P0A8O2_A279CliNom, P0A8O2_A17AlbComFch, P0A8O2_A252CliCod, P0A8O2_A10013AlbComFs, P0A8O2_A10764AlbComAT, P0A8O2_A10739AlbComEAT, P0A8O2_A14248AlbComATCU, P0A8O2_A10740AlbComID,
            P0A8O2_A4829AlbComHor, P0A8O2_A10738AlbComSt, P0A8O2_A16AlbComEst, P0A8O2_A14AlbComCod, P0A8O2_A10014AlbComFd
            }
            , new Object[] {
            P0A8O3_A396EmprCod, P0A8O3_A22AlbComPri, P0A8O3_A10740AlbComID, P0A8O3_A17AlbComFch, P0A8O3_A252CliCod, P0A8O3_A10013AlbComFs, P0A8O3_A10764AlbComAT, P0A8O3_A10739AlbComEAT, P0A8O3_A14248AlbComATCU, P0A8O3_A4829AlbComHor,
            P0A8O3_A10738AlbComSt, P0A8O3_A16AlbComEst, P0A8O3_A279CliNom, P0A8O3_A14AlbComCod, P0A8O3_A10014AlbComFd
            }
            , new Object[] {
            P0A8O4_A396EmprCod, P0A8O4_A22AlbComPri, P0A8O4_A14248AlbComATCU, P0A8O4_A17AlbComFch, P0A8O4_A252CliCod, P0A8O4_A10013AlbComFs, P0A8O4_A10764AlbComAT, P0A8O4_A10739AlbComEAT, P0A8O4_A10740AlbComID, P0A8O4_A4829AlbComHor,
            P0A8O4_A10738AlbComSt, P0A8O4_A16AlbComEst, P0A8O4_A279CliNom, P0A8O4_A14AlbComCod, P0A8O4_A10014AlbComFd
            }
            , new Object[] {
            P0A8O5_A17AlbComFch, P0A8O5_A252CliCod, P0A8O5_A22AlbComPri, P0A8O5_A396EmprCod, P0A8O5_A10013AlbComFs, P0A8O5_A10764AlbComAT, P0A8O5_A10739AlbComEAT, P0A8O5_A14248AlbComATCU, P0A8O5_A10740AlbComID, P0A8O5_A4829AlbComHor,
            P0A8O5_A10738AlbComSt, P0A8O5_A16AlbComEst, P0A8O5_A279CliNom, P0A8O5_A14AlbComCod, P0A8O5_A10014AlbComFd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A16AlbComEst ;
   private byte A10739AlbComEAT ;
   private short Gx_err ;
   private int AV73GXV1 ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ;
   private int AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ;
   private int AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ;
   private int AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ;
   private int AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ;
   private int AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ;
   private int AV64AlbcomCod ;
   private int AV65clicod ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV33InsertIndex ;
   private long AV39count ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV22TFAlbComID ;
   private String AV23TFAlbComID_Sel ;
   private String AV24TFAlbComATCUD ;
   private String AV25TFAlbComATCUD_Sel ;
   private String AV62TFAlbCom4dig ;
   private String AV63TFAlbCom4dig_Sel ;
   private String AV69AlbProPri ;
   private String AV70ContCod ;
   private String A279CliNom ;
   private String AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ;
   private String AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ;
   private String AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ;
   private String AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ;
   private String AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ;
   private String AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ;
   private String AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ;
   private String AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ;
   private String scmdbuf ;
   private String lV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ;
   private String lV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ;
   private String lV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ;
   private String lV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ;
   private String A10738AlbComSt ;
   private String A10764AlbComAT ;
   private String A10740AlbComID ;
   private String A14248AlbComATCU ;
   private String A10014AlbComFd ;
   private String AV68AlbComStIN ;
   private String A396EmprCod ;
   private String AV56EmprCod ;
   private String A22AlbComPri ;
   private String AV57Prioridad ;
   private String A14374AlbCom4dig ;
   private java.util.Date AV21TFAlbComHor ;
   private java.util.Date AV30TFAlbComFs ;
   private java.util.Date AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ;
   private java.util.Date AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV66ALbComfchfrom ;
   private java.util.Date AV67ALbComfchto ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brkA8O2 ;
   private boolean brkA8O4 ;
   private boolean brkA8O6 ;
   private String AV48OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV50OptionIndexesJson ;
   private String AV52TFAlbComEst_SelsJson ;
   private String AV58TFAlbComSt_SelsJson ;
   private String AV54TFAlbComEAT_SelsJson ;
   private String AV60TFAlbComAT_SelsJson ;
   private String AV45DDOName ;
   private String AV46SearchTxt ;
   private String AV47SearchTxtTo ;
   private String AV34Option ;
   private GXSimpleCollection<Byte> AV53TFAlbComEst_Sels ;
   private GXSimpleCollection<Byte> AV55TFAlbComEAT_Sels ;
   private GXSimpleCollection<Byte> AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ;
   private GXSimpleCollection<Byte> AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A8O2_A396EmprCod ;
   private String[] P0A8O2_A22AlbComPri ;
   private String[] P0A8O2_A279CliNom ;
   private java.util.Date[] P0A8O2_A17AlbComFch ;
   private int[] P0A8O2_A252CliCod ;
   private java.util.Date[] P0A8O2_A10013AlbComFs ;
   private String[] P0A8O2_A10764AlbComAT ;
   private byte[] P0A8O2_A10739AlbComEAT ;
   private String[] P0A8O2_A14248AlbComATCU ;
   private String[] P0A8O2_A10740AlbComID ;
   private java.util.Date[] P0A8O2_A4829AlbComHor ;
   private String[] P0A8O2_A10738AlbComSt ;
   private byte[] P0A8O2_A16AlbComEst ;
   private int[] P0A8O2_A14AlbComCod ;
   private String[] P0A8O2_A10014AlbComFd ;
   private String[] P0A8O3_A396EmprCod ;
   private String[] P0A8O3_A22AlbComPri ;
   private String[] P0A8O3_A10740AlbComID ;
   private java.util.Date[] P0A8O3_A17AlbComFch ;
   private int[] P0A8O3_A252CliCod ;
   private java.util.Date[] P0A8O3_A10013AlbComFs ;
   private String[] P0A8O3_A10764AlbComAT ;
   private byte[] P0A8O3_A10739AlbComEAT ;
   private String[] P0A8O3_A14248AlbComATCU ;
   private java.util.Date[] P0A8O3_A4829AlbComHor ;
   private String[] P0A8O3_A10738AlbComSt ;
   private byte[] P0A8O3_A16AlbComEst ;
   private String[] P0A8O3_A279CliNom ;
   private int[] P0A8O3_A14AlbComCod ;
   private String[] P0A8O3_A10014AlbComFd ;
   private String[] P0A8O4_A396EmprCod ;
   private String[] P0A8O4_A22AlbComPri ;
   private String[] P0A8O4_A14248AlbComATCU ;
   private java.util.Date[] P0A8O4_A17AlbComFch ;
   private int[] P0A8O4_A252CliCod ;
   private java.util.Date[] P0A8O4_A10013AlbComFs ;
   private String[] P0A8O4_A10764AlbComAT ;
   private byte[] P0A8O4_A10739AlbComEAT ;
   private String[] P0A8O4_A10740AlbComID ;
   private java.util.Date[] P0A8O4_A4829AlbComHor ;
   private String[] P0A8O4_A10738AlbComSt ;
   private byte[] P0A8O4_A16AlbComEst ;
   private String[] P0A8O4_A279CliNom ;
   private int[] P0A8O4_A14AlbComCod ;
   private String[] P0A8O4_A10014AlbComFd ;
   private java.util.Date[] P0A8O5_A17AlbComFch ;
   private int[] P0A8O5_A252CliCod ;
   private String[] P0A8O5_A22AlbComPri ;
   private String[] P0A8O5_A396EmprCod ;
   private java.util.Date[] P0A8O5_A10013AlbComFs ;
   private String[] P0A8O5_A10764AlbComAT ;
   private byte[] P0A8O5_A10739AlbComEAT ;
   private String[] P0A8O5_A14248AlbComATCU ;
   private String[] P0A8O5_A10740AlbComID ;
   private java.util.Date[] P0A8O5_A4829AlbComHor ;
   private String[] P0A8O5_A10738AlbComSt ;
   private byte[] P0A8O5_A16AlbComEst ;
   private String[] P0A8O5_A279CliNom ;
   private int[] P0A8O5_A14AlbComCod ;
   private String[] P0A8O5_A10014AlbComFd ;
   private GXSimpleCollection<String> AV59TFAlbComSt_Sels ;
   private GXSimpleCollection<String> AV61TFAlbComAT_Sels ;
   private GXSimpleCollection<String> AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ;
   private GXSimpleCollection<String> AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV37OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV42GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV43GridStateFilterValue ;
}

final  class documentotransportecomercial_cabecerawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A8O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                          String A10738AlbComSt ,
                                          GXSimpleCollection<String> AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                          String A10764AlbComAT ,
                                          GXSimpleCollection<String> AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                          int AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ,
                                          int AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                          int AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ,
                                          int AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ,
                                          java.util.Date AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                          String AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                          String AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                          int AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ,
                                          int AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ,
                                          java.util.Date AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                          String AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                          String AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                          int AV64AlbcomCod ,
                                          int AV65clicod ,
                                          java.util.Date AV66ALbComfchfrom ,
                                          java.util.Date AV67ALbComfchto ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A14248AlbComATCU ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10014AlbComFd ,
                                          int A252CliCod ,
                                          java.util.Date A17AlbComFch ,
                                          String AV68AlbComStIN ,
                                          String A396EmprCod ,
                                          String AV56EmprCod ,
                                          String A22AlbComPri ,
                                          String AV57Prioridad )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T2.CliNom, T1.AlbComFch, T1.CliCod, T1.AlbComFs, T1.AlbComAT, T1.AlbComEAT, T1.AlbComATCU, T1.AlbComID, T1.AlbComHor, T1.AlbComSt," ;
      scmdbuf += " T1.AlbComEst, T1.AlbComCod, T1.AlbComFd FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComSt = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels, "T1.AlbComSt IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels, "T1.AlbComAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1) = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbcomCod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV65clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66ALbComfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67ALbComfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A8O3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                          String A10738AlbComSt ,
                                          GXSimpleCollection<String> AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                          String A10764AlbComAT ,
                                          GXSimpleCollection<String> AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                          int AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ,
                                          int AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                          int AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ,
                                          int AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ,
                                          java.util.Date AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                          String AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                          String AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                          int AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ,
                                          int AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ,
                                          java.util.Date AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                          String AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                          String AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                          int AV64AlbcomCod ,
                                          int AV65clicod ,
                                          java.util.Date AV66ALbComfchfrom ,
                                          java.util.Date AV67ALbComfchto ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A14248AlbComATCU ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10014AlbComFd ,
                                          int A252CliCod ,
                                          java.util.Date A17AlbComFch ,
                                          String AV68AlbComStIN ,
                                          String A396EmprCod ,
                                          String AV56EmprCod ,
                                          String A22AlbComPri ,
                                          String AV57Prioridad )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[20];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComID, T1.AlbComFch, T1.CliCod, T1.AlbComFs, T1.AlbComAT, T1.AlbComEAT, T1.AlbComATCU, T1.AlbComHor, T1.AlbComSt, T1.AlbComEst," ;
      scmdbuf += " T2.CliNom, T1.AlbComCod, T1.AlbComFd FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComSt = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels, "T1.AlbComSt IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels, "T1.AlbComAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1) = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbcomCod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV65clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66ALbComfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67ALbComfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComID" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A8O4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                          String A10738AlbComSt ,
                                          GXSimpleCollection<String> AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                          String A10764AlbComAT ,
                                          GXSimpleCollection<String> AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                          int AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ,
                                          int AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                          int AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ,
                                          int AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ,
                                          java.util.Date AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                          String AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                          String AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                          int AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ,
                                          int AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ,
                                          java.util.Date AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                          String AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                          String AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                          int AV64AlbcomCod ,
                                          int AV65clicod ,
                                          java.util.Date AV66ALbComfchfrom ,
                                          java.util.Date AV67ALbComfchto ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A14248AlbComATCU ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10014AlbComFd ,
                                          int A252CliCod ,
                                          java.util.Date A17AlbComFch ,
                                          String AV68AlbComStIN ,
                                          String A396EmprCod ,
                                          String AV56EmprCod ,
                                          String A22AlbComPri ,
                                          String AV57Prioridad )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComATCU, T1.AlbComFch, T1.CliCod, T1.AlbComFs, T1.AlbComAT, T1.AlbComEAT, T1.AlbComID, T1.AlbComHor, T1.AlbComSt, T1.AlbComEst," ;
      scmdbuf += " T2.CliNom, T1.AlbComCod, T1.AlbComFd FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComSt = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels, "T1.AlbComSt IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels, "T1.AlbComAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1) = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbcomCod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV65clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66ALbComfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67ALbComfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComATCU" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A8O5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                          String A10738AlbComSt ,
                                          GXSimpleCollection<String> AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                          String A10764AlbComAT ,
                                          GXSimpleCollection<String> AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                          int AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ,
                                          int AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ,
                                          String AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                          String AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                          int AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ,
                                          int AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ,
                                          java.util.Date AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                          String AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                          String AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                          String AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                          String AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                          int AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ,
                                          int AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ,
                                          java.util.Date AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                          String AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                          String AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                          int AV64AlbcomCod ,
                                          int AV65clicod ,
                                          java.util.Date AV66ALbComfchfrom ,
                                          java.util.Date AV67ALbComfchto ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A14248AlbComATCU ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10014AlbComFd ,
                                          int A252CliCod ,
                                          java.util.Date A17AlbComFch ,
                                          String AV68AlbComStIN ,
                                          String A22AlbComPri ,
                                          String AV57Prioridad ,
                                          String AV56EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[20];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.AlbComFch, T1.CliCod, T1.AlbComPri, T1.EmprCod, T1.AlbComFs, T1.AlbComAT, T1.AlbComEAT, T1.AlbComATCU, T1.AlbComID, T1.AlbComHor, T1.AlbComSt, T1.AlbComEst," ;
      scmdbuf += " T2.CliNom, T1.AlbComCod, T1.AlbComFd FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComSt = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV75Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV79Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV80Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels, "T1.AlbComSt IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV81Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV84Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV87Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels, "T1.AlbComAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV88Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1) = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbcomCod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV65clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66ALbComfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67ALbComfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P0A8O2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 1 :
                  return conditional_P0A8O3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 2 :
                  return conditional_P0A8O4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 3 :
                  return conditional_P0A8O5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8O3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8O4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A8O5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 200);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 200);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 200);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 200);
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
      }
   }

}

