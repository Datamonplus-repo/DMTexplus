package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentocomercialv02wwgetfilterdata extends GXProcedure
{
   public documentocomercialv02wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentocomercialv02wwgetfilterdata.class ), "" );
   }

   public documentocomercialv02wwgetfilterdata( int remoteHandle ,
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
      documentocomercialv02wwgetfilterdata.this.aP5 = new String[] {""};
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
      documentocomercialv02wwgetfilterdata.this.AV32DDOName = aP0;
      documentocomercialv02wwgetfilterdata.this.AV30SearchTxt = aP1;
      documentocomercialv02wwgetfilterdata.this.AV31SearchTxtTo = aP2;
      documentocomercialv02wwgetfilterdata.this.aP3 = aP3;
      documentocomercialv02wwgetfilterdata.this.aP4 = aP4;
      documentocomercialv02wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMID") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMAT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMATOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMATCUDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMST") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMSTOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMFDD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMFDDOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("DocumentoComercialv02WWGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoComercialv02WWGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("DocumentoComercialv02WWGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV16TFCliCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFCliCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMHOR") == 0 )
         {
            AV24TFAlbComHor = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEAT_SEL") == 0 )
         {
            AV50TFAlbComEAT_SelsJson = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFAlbComEAT_Sels.fromJSonString(AV50TFAlbComEAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID") == 0 )
         {
            AV54TFAlbComID = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID_SEL") == 0 )
         {
            AV55TFAlbComID_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMAT") == 0 )
         {
            AV56TFAlbComAT = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMAT_SEL") == 0 )
         {
            AV57TFAlbComAT_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD") == 0 )
         {
            AV52TFAlbComATCUD = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD_SEL") == 0 )
         {
            AV53TFAlbComATCUD_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMST") == 0 )
         {
            AV58TFAlbComSt = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMST_SEL") == 0 )
         {
            AV59TFAlbComSt_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFS") == 0 )
         {
            AV60TFAlbComFs = localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV62TFAlbComFdD = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV63TFAlbComFdD_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV30SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV68Documentocomercialv02wwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV69Documentocomercialv02wwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV70Documentocomercialv02wwds_3_tfclicod = AV16TFCliCod ;
      AV71Documentocomercialv02wwds_4_tfclicod_to = AV17TFCliCod_To ;
      AV72Documentocomercialv02wwds_5_tfclinom = AV18TFCliNom ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = AV24TFAlbComHor ;
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = AV51TFAlbComEAT_Sels ;
      AV77Documentocomercialv02wwds_10_tfalbcomid = AV54TFAlbComID ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = AV55TFAlbComID_Sel ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = AV56TFAlbComAT ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = AV57TFAlbComAT_Sel ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = AV52TFAlbComATCUD ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV53TFAlbComATCUD_Sel ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = AV58TFAlbComSt ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = AV59TFAlbComSt_Sel ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = AV60TFAlbComFs ;
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = AV62TFAlbComFdD ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV63TFAlbComFdD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV72Documentocomercialv02wwds_5_tfclinom ,
                                           AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV76Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV12TFAlbComFch ,
                                           AV13TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           A22AlbComPri ,
                                           AV49AlbComPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV77Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV79Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV81Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV83Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV86Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor P090W2 */
      pr_default.execute(0, new Object[] {AV49AlbComPri, Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to), lV72Documentocomercialv02wwds_5_tfclinom, AV73Documentocomercialv02wwds_6_tfclinom_sel, AV74Documentocomercialv02wwds_7_tfalbcomfch, AV75Documentocomercialv02wwds_8_tfalbcomhor, lV77Documentocomercialv02wwds_10_tfalbcomid, AV78Documentocomercialv02wwds_11_tfalbcomid_sel, lV79Documentocomercialv02wwds_12_tfalbcomat, AV80Documentocomercialv02wwds_13_tfalbcomat_sel, lV81Documentocomercialv02wwds_14_tfalbcomatcud, AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV83Documentocomercialv02wwds_16_tfalbcomst, AV84Documentocomercialv02wwds_17_tfalbcomst_sel, AV85Documentocomercialv02wwds_18_tfalbcomfs, lV86Documentocomercialv02wwds_19_tfalbcomfdd, AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV12TFAlbComFch, AV13TFAlbComFch_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk90W2 = false ;
         A396EmprCod = P090W2_A396EmprCod[0] ;
         A22AlbComPri = P090W2_A22AlbComPri[0] ;
         A279CliNom = P090W2_A279CliNom[0] ;
         A10015AlbComFdD = P090W2_A10015AlbComFdD[0] ;
         A10013AlbComFs = P090W2_A10013AlbComFs[0] ;
         A10738AlbComSt = P090W2_A10738AlbComSt[0] ;
         A14248AlbComATCU = P090W2_A14248AlbComATCU[0] ;
         A10764AlbComAT = P090W2_A10764AlbComAT[0] ;
         A10740AlbComID = P090W2_A10740AlbComID[0] ;
         A10739AlbComEAT = P090W2_A10739AlbComEAT[0] ;
         A4829AlbComHor = P090W2_A4829AlbComHor[0] ;
         A17AlbComFch = P090W2_A17AlbComFch[0] ;
         A252CliCod = P090W2_A252CliCod[0] ;
         A14AlbComCod = P090W2_A14AlbComCod[0] ;
         A279CliNom = P090W2_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P090W2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk90W2 = false ;
            A396EmprCod = P090W2_A396EmprCod[0] ;
            A252CliCod = P090W2_A252CliCod[0] ;
            A14AlbComCod = P090W2_A14AlbComCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90W2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV34Option = A279CliNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90W2 )
         {
            brk90W2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMIDOPTIONS' Routine */
      returnInSub = false ;
      AV54TFAlbComID = AV30SearchTxt ;
      AV55TFAlbComID_Sel = "" ;
      AV68Documentocomercialv02wwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV69Documentocomercialv02wwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV70Documentocomercialv02wwds_3_tfclicod = AV16TFCliCod ;
      AV71Documentocomercialv02wwds_4_tfclicod_to = AV17TFCliCod_To ;
      AV72Documentocomercialv02wwds_5_tfclinom = AV18TFCliNom ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = AV24TFAlbComHor ;
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = AV51TFAlbComEAT_Sels ;
      AV77Documentocomercialv02wwds_10_tfalbcomid = AV54TFAlbComID ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = AV55TFAlbComID_Sel ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = AV56TFAlbComAT ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = AV57TFAlbComAT_Sel ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = AV52TFAlbComATCUD ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV53TFAlbComATCUD_Sel ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = AV58TFAlbComSt ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = AV59TFAlbComSt_Sel ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = AV60TFAlbComFs ;
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = AV62TFAlbComFdD ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV63TFAlbComFdD_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV72Documentocomercialv02wwds_5_tfclinom ,
                                           AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV76Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV12TFAlbComFch ,
                                           AV13TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           A22AlbComPri ,
                                           AV49AlbComPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV77Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV79Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV81Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV83Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV86Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor P090W3 */
      pr_default.execute(1, new Object[] {AV49AlbComPri, Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to), lV72Documentocomercialv02wwds_5_tfclinom, AV73Documentocomercialv02wwds_6_tfclinom_sel, AV74Documentocomercialv02wwds_7_tfalbcomfch, AV75Documentocomercialv02wwds_8_tfalbcomhor, lV77Documentocomercialv02wwds_10_tfalbcomid, AV78Documentocomercialv02wwds_11_tfalbcomid_sel, lV79Documentocomercialv02wwds_12_tfalbcomat, AV80Documentocomercialv02wwds_13_tfalbcomat_sel, lV81Documentocomercialv02wwds_14_tfalbcomatcud, AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV83Documentocomercialv02wwds_16_tfalbcomst, AV84Documentocomercialv02wwds_17_tfalbcomst_sel, AV85Documentocomercialv02wwds_18_tfalbcomfs, lV86Documentocomercialv02wwds_19_tfalbcomfdd, AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV12TFAlbComFch, AV13TFAlbComFch_To});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk90W4 = false ;
         A396EmprCod = P090W3_A396EmprCod[0] ;
         A22AlbComPri = P090W3_A22AlbComPri[0] ;
         A10740AlbComID = P090W3_A10740AlbComID[0] ;
         A10015AlbComFdD = P090W3_A10015AlbComFdD[0] ;
         A10013AlbComFs = P090W3_A10013AlbComFs[0] ;
         A10738AlbComSt = P090W3_A10738AlbComSt[0] ;
         A14248AlbComATCU = P090W3_A14248AlbComATCU[0] ;
         A10764AlbComAT = P090W3_A10764AlbComAT[0] ;
         A10739AlbComEAT = P090W3_A10739AlbComEAT[0] ;
         A4829AlbComHor = P090W3_A4829AlbComHor[0] ;
         A17AlbComFch = P090W3_A17AlbComFch[0] ;
         A279CliNom = P090W3_A279CliNom[0] ;
         A252CliCod = P090W3_A252CliCod[0] ;
         A14AlbComCod = P090W3_A14AlbComCod[0] ;
         A279CliNom = P090W3_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P090W3_A10740AlbComID[0], A10740AlbComID) == 0 ) )
         {
            brk90W4 = false ;
            A396EmprCod = P090W3_A396EmprCod[0] ;
            A14AlbComCod = P090W3_A14AlbComCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90W4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10740AlbComID)==0) )
         {
            AV34Option = A10740AlbComID ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90W4 )
         {
            brk90W4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBCOMATOPTIONS' Routine */
      returnInSub = false ;
      AV56TFAlbComAT = AV30SearchTxt ;
      AV57TFAlbComAT_Sel = "" ;
      AV68Documentocomercialv02wwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV69Documentocomercialv02wwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV70Documentocomercialv02wwds_3_tfclicod = AV16TFCliCod ;
      AV71Documentocomercialv02wwds_4_tfclicod_to = AV17TFCliCod_To ;
      AV72Documentocomercialv02wwds_5_tfclinom = AV18TFCliNom ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = AV24TFAlbComHor ;
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = AV51TFAlbComEAT_Sels ;
      AV77Documentocomercialv02wwds_10_tfalbcomid = AV54TFAlbComID ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = AV55TFAlbComID_Sel ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = AV56TFAlbComAT ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = AV57TFAlbComAT_Sel ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = AV52TFAlbComATCUD ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV53TFAlbComATCUD_Sel ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = AV58TFAlbComSt ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = AV59TFAlbComSt_Sel ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = AV60TFAlbComFs ;
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = AV62TFAlbComFdD ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV63TFAlbComFdD_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV72Documentocomercialv02wwds_5_tfclinom ,
                                           AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV76Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV12TFAlbComFch ,
                                           AV13TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           A22AlbComPri ,
                                           AV49AlbComPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV77Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV79Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV81Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV83Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV86Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor P090W4 */
      pr_default.execute(2, new Object[] {AV49AlbComPri, Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to), lV72Documentocomercialv02wwds_5_tfclinom, AV73Documentocomercialv02wwds_6_tfclinom_sel, AV74Documentocomercialv02wwds_7_tfalbcomfch, AV75Documentocomercialv02wwds_8_tfalbcomhor, lV77Documentocomercialv02wwds_10_tfalbcomid, AV78Documentocomercialv02wwds_11_tfalbcomid_sel, lV79Documentocomercialv02wwds_12_tfalbcomat, AV80Documentocomercialv02wwds_13_tfalbcomat_sel, lV81Documentocomercialv02wwds_14_tfalbcomatcud, AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV83Documentocomercialv02wwds_16_tfalbcomst, AV84Documentocomercialv02wwds_17_tfalbcomst_sel, AV85Documentocomercialv02wwds_18_tfalbcomfs, lV86Documentocomercialv02wwds_19_tfalbcomfdd, AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV12TFAlbComFch, AV13TFAlbComFch_To});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk90W6 = false ;
         A396EmprCod = P090W4_A396EmprCod[0] ;
         A22AlbComPri = P090W4_A22AlbComPri[0] ;
         A10764AlbComAT = P090W4_A10764AlbComAT[0] ;
         A10015AlbComFdD = P090W4_A10015AlbComFdD[0] ;
         A10013AlbComFs = P090W4_A10013AlbComFs[0] ;
         A10738AlbComSt = P090W4_A10738AlbComSt[0] ;
         A14248AlbComATCU = P090W4_A14248AlbComATCU[0] ;
         A10740AlbComID = P090W4_A10740AlbComID[0] ;
         A10739AlbComEAT = P090W4_A10739AlbComEAT[0] ;
         A4829AlbComHor = P090W4_A4829AlbComHor[0] ;
         A17AlbComFch = P090W4_A17AlbComFch[0] ;
         A279CliNom = P090W4_A279CliNom[0] ;
         A252CliCod = P090W4_A252CliCod[0] ;
         A14AlbComCod = P090W4_A14AlbComCod[0] ;
         A279CliNom = P090W4_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P090W4_A10764AlbComAT[0], A10764AlbComAT) == 0 ) )
         {
            brk90W6 = false ;
            A396EmprCod = P090W4_A396EmprCod[0] ;
            A14AlbComCod = P090W4_A14AlbComCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90W6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A10764AlbComAT)==0) )
         {
            AV34Option = A10764AlbComAT ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90W6 )
         {
            brk90W6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBCOMATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV52TFAlbComATCUD = AV30SearchTxt ;
      AV53TFAlbComATCUD_Sel = "" ;
      AV68Documentocomercialv02wwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV69Documentocomercialv02wwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV70Documentocomercialv02wwds_3_tfclicod = AV16TFCliCod ;
      AV71Documentocomercialv02wwds_4_tfclicod_to = AV17TFCliCod_To ;
      AV72Documentocomercialv02wwds_5_tfclinom = AV18TFCliNom ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = AV24TFAlbComHor ;
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = AV51TFAlbComEAT_Sels ;
      AV77Documentocomercialv02wwds_10_tfalbcomid = AV54TFAlbComID ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = AV55TFAlbComID_Sel ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = AV56TFAlbComAT ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = AV57TFAlbComAT_Sel ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = AV52TFAlbComATCUD ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV53TFAlbComATCUD_Sel ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = AV58TFAlbComSt ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = AV59TFAlbComSt_Sel ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = AV60TFAlbComFs ;
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = AV62TFAlbComFdD ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV63TFAlbComFdD_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV72Documentocomercialv02wwds_5_tfclinom ,
                                           AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV76Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV12TFAlbComFch ,
                                           AV13TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           A22AlbComPri ,
                                           AV49AlbComPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV77Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV79Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV81Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV83Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV86Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor P090W5 */
      pr_default.execute(3, new Object[] {AV49AlbComPri, Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to), lV72Documentocomercialv02wwds_5_tfclinom, AV73Documentocomercialv02wwds_6_tfclinom_sel, AV74Documentocomercialv02wwds_7_tfalbcomfch, AV75Documentocomercialv02wwds_8_tfalbcomhor, lV77Documentocomercialv02wwds_10_tfalbcomid, AV78Documentocomercialv02wwds_11_tfalbcomid_sel, lV79Documentocomercialv02wwds_12_tfalbcomat, AV80Documentocomercialv02wwds_13_tfalbcomat_sel, lV81Documentocomercialv02wwds_14_tfalbcomatcud, AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV83Documentocomercialv02wwds_16_tfalbcomst, AV84Documentocomercialv02wwds_17_tfalbcomst_sel, AV85Documentocomercialv02wwds_18_tfalbcomfs, lV86Documentocomercialv02wwds_19_tfalbcomfdd, AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV12TFAlbComFch, AV13TFAlbComFch_To});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk90W8 = false ;
         A396EmprCod = P090W5_A396EmprCod[0] ;
         A22AlbComPri = P090W5_A22AlbComPri[0] ;
         A14248AlbComATCU = P090W5_A14248AlbComATCU[0] ;
         A10015AlbComFdD = P090W5_A10015AlbComFdD[0] ;
         A10013AlbComFs = P090W5_A10013AlbComFs[0] ;
         A10738AlbComSt = P090W5_A10738AlbComSt[0] ;
         A10764AlbComAT = P090W5_A10764AlbComAT[0] ;
         A10740AlbComID = P090W5_A10740AlbComID[0] ;
         A10739AlbComEAT = P090W5_A10739AlbComEAT[0] ;
         A4829AlbComHor = P090W5_A4829AlbComHor[0] ;
         A17AlbComFch = P090W5_A17AlbComFch[0] ;
         A279CliNom = P090W5_A279CliNom[0] ;
         A252CliCod = P090W5_A252CliCod[0] ;
         A14AlbComCod = P090W5_A14AlbComCod[0] ;
         A279CliNom = P090W5_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P090W5_A14248AlbComATCU[0], A14248AlbComATCU) == 0 ) )
         {
            brk90W8 = false ;
            A396EmprCod = P090W5_A396EmprCod[0] ;
            A14AlbComCod = P090W5_A14AlbComCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90W8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14248AlbComATCU)==0) )
         {
            AV34Option = A14248AlbComATCU ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90W8 )
         {
            brk90W8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBCOMSTOPTIONS' Routine */
      returnInSub = false ;
      AV58TFAlbComSt = AV30SearchTxt ;
      AV59TFAlbComSt_Sel = "" ;
      AV68Documentocomercialv02wwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV69Documentocomercialv02wwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV70Documentocomercialv02wwds_3_tfclicod = AV16TFCliCod ;
      AV71Documentocomercialv02wwds_4_tfclicod_to = AV17TFCliCod_To ;
      AV72Documentocomercialv02wwds_5_tfclinom = AV18TFCliNom ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = AV24TFAlbComHor ;
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = AV51TFAlbComEAT_Sels ;
      AV77Documentocomercialv02wwds_10_tfalbcomid = AV54TFAlbComID ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = AV55TFAlbComID_Sel ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = AV56TFAlbComAT ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = AV57TFAlbComAT_Sel ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = AV52TFAlbComATCUD ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV53TFAlbComATCUD_Sel ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = AV58TFAlbComSt ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = AV59TFAlbComSt_Sel ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = AV60TFAlbComFs ;
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = AV62TFAlbComFdD ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV63TFAlbComFdD_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV72Documentocomercialv02wwds_5_tfclinom ,
                                           AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV76Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV12TFAlbComFch ,
                                           AV13TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           A22AlbComPri ,
                                           AV49AlbComPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV77Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV79Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV81Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV83Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV86Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor P090W6 */
      pr_default.execute(4, new Object[] {AV49AlbComPri, Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to), lV72Documentocomercialv02wwds_5_tfclinom, AV73Documentocomercialv02wwds_6_tfclinom_sel, AV74Documentocomercialv02wwds_7_tfalbcomfch, AV75Documentocomercialv02wwds_8_tfalbcomhor, lV77Documentocomercialv02wwds_10_tfalbcomid, AV78Documentocomercialv02wwds_11_tfalbcomid_sel, lV79Documentocomercialv02wwds_12_tfalbcomat, AV80Documentocomercialv02wwds_13_tfalbcomat_sel, lV81Documentocomercialv02wwds_14_tfalbcomatcud, AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV83Documentocomercialv02wwds_16_tfalbcomst, AV84Documentocomercialv02wwds_17_tfalbcomst_sel, AV85Documentocomercialv02wwds_18_tfalbcomfs, lV86Documentocomercialv02wwds_19_tfalbcomfdd, AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV12TFAlbComFch, AV13TFAlbComFch_To});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk90W10 = false ;
         A396EmprCod = P090W6_A396EmprCod[0] ;
         A22AlbComPri = P090W6_A22AlbComPri[0] ;
         A10738AlbComSt = P090W6_A10738AlbComSt[0] ;
         A10015AlbComFdD = P090W6_A10015AlbComFdD[0] ;
         A10013AlbComFs = P090W6_A10013AlbComFs[0] ;
         A14248AlbComATCU = P090W6_A14248AlbComATCU[0] ;
         A10764AlbComAT = P090W6_A10764AlbComAT[0] ;
         A10740AlbComID = P090W6_A10740AlbComID[0] ;
         A10739AlbComEAT = P090W6_A10739AlbComEAT[0] ;
         A4829AlbComHor = P090W6_A4829AlbComHor[0] ;
         A17AlbComFch = P090W6_A17AlbComFch[0] ;
         A279CliNom = P090W6_A279CliNom[0] ;
         A252CliCod = P090W6_A252CliCod[0] ;
         A14AlbComCod = P090W6_A14AlbComCod[0] ;
         A279CliNom = P090W6_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P090W6_A10738AlbComSt[0], A10738AlbComSt) == 0 ) )
         {
            brk90W10 = false ;
            A396EmprCod = P090W6_A396EmprCod[0] ;
            A14AlbComCod = P090W6_A14AlbComCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90W10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A10738AlbComSt)==0) )
         {
            AV34Option = A10738AlbComSt ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90W10 )
         {
            brk90W10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBCOMFDDOPTIONS' Routine */
      returnInSub = false ;
      AV62TFAlbComFdD = AV30SearchTxt ;
      AV63TFAlbComFdD_Sel = "" ;
      AV68Documentocomercialv02wwds_1_tfalbcomcod = AV10TFAlbComCod ;
      AV69Documentocomercialv02wwds_2_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV70Documentocomercialv02wwds_3_tfclicod = AV16TFCliCod ;
      AV71Documentocomercialv02wwds_4_tfclicod_to = AV17TFCliCod_To ;
      AV72Documentocomercialv02wwds_5_tfclinom = AV18TFCliNom ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = AV19TFCliNom_Sel ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = AV12TFAlbComFch ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = AV24TFAlbComHor ;
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = AV51TFAlbComEAT_Sels ;
      AV77Documentocomercialv02wwds_10_tfalbcomid = AV54TFAlbComID ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = AV55TFAlbComID_Sel ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = AV56TFAlbComAT ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = AV57TFAlbComAT_Sel ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = AV52TFAlbComATCUD ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = AV53TFAlbComATCUD_Sel ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = AV58TFAlbComSt ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = AV59TFAlbComSt_Sel ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = AV60TFAlbComFs ;
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = AV62TFAlbComFdD ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = AV63TFAlbComFdD_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                           Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to) ,
                                           Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod) ,
                                           Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to) ,
                                           AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                           AV72Documentocomercialv02wwds_5_tfclinom ,
                                           AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                           AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                           Integer.valueOf(AV76Documentocomercialv02wwds_9_tfalbcomeat_sels.size()) ,
                                           AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                           AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                           AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                           AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                           AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                           AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                           AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                           AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                           AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                           AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                           AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                           AV12TFAlbComFch ,
                                           AV13TFAlbComFch_To ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A17AlbComFch ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A10764AlbComAT ,
                                           A14248AlbComATCU ,
                                           A10738AlbComSt ,
                                           A10013AlbComFs ,
                                           A10015AlbComFdD ,
                                           A22AlbComPri ,
                                           AV49AlbComPri } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV72Documentocomercialv02wwds_5_tfclinom = GXutil.padr( GXutil.rtrim( AV72Documentocomercialv02wwds_5_tfclinom), 30, "%") ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = GXutil.padr( GXutil.rtrim( AV77Documentocomercialv02wwds_10_tfalbcomid), 20, "%") ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = GXutil.padr( GXutil.rtrim( AV79Documentocomercialv02wwds_12_tfalbcomat), 1, "%") ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV81Documentocomercialv02wwds_14_tfalbcomatcud), 20, "%") ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = GXutil.padr( GXutil.rtrim( AV83Documentocomercialv02wwds_16_tfalbcomst), 1, "%") ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV86Documentocomercialv02wwds_19_tfalbcomfdd), 200, "%") ;
      /* Using cursor P090W7 */
      pr_default.execute(5, new Object[] {AV49AlbComPri, Integer.valueOf(AV68Documentocomercialv02wwds_1_tfalbcomcod), Integer.valueOf(AV69Documentocomercialv02wwds_2_tfalbcomcod_to), Integer.valueOf(AV70Documentocomercialv02wwds_3_tfclicod), Integer.valueOf(AV71Documentocomercialv02wwds_4_tfclicod_to), lV72Documentocomercialv02wwds_5_tfclinom, AV73Documentocomercialv02wwds_6_tfclinom_sel, AV74Documentocomercialv02wwds_7_tfalbcomfch, AV75Documentocomercialv02wwds_8_tfalbcomhor, lV77Documentocomercialv02wwds_10_tfalbcomid, AV78Documentocomercialv02wwds_11_tfalbcomid_sel, lV79Documentocomercialv02wwds_12_tfalbcomat, AV80Documentocomercialv02wwds_13_tfalbcomat_sel, lV81Documentocomercialv02wwds_14_tfalbcomatcud, AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel, lV83Documentocomercialv02wwds_16_tfalbcomst, AV84Documentocomercialv02wwds_17_tfalbcomst_sel, AV85Documentocomercialv02wwds_18_tfalbcomfs, lV86Documentocomercialv02wwds_19_tfalbcomfdd, AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel, AV12TFAlbComFch, AV13TFAlbComFch_To});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk90W12 = false ;
         A396EmprCod = P090W7_A396EmprCod[0] ;
         A22AlbComPri = P090W7_A22AlbComPri[0] ;
         A10015AlbComFdD = P090W7_A10015AlbComFdD[0] ;
         A10013AlbComFs = P090W7_A10013AlbComFs[0] ;
         A10738AlbComSt = P090W7_A10738AlbComSt[0] ;
         A14248AlbComATCU = P090W7_A14248AlbComATCU[0] ;
         A10764AlbComAT = P090W7_A10764AlbComAT[0] ;
         A10740AlbComID = P090W7_A10740AlbComID[0] ;
         A10739AlbComEAT = P090W7_A10739AlbComEAT[0] ;
         A4829AlbComHor = P090W7_A4829AlbComHor[0] ;
         A17AlbComFch = P090W7_A17AlbComFch[0] ;
         A279CliNom = P090W7_A279CliNom[0] ;
         A252CliCod = P090W7_A252CliCod[0] ;
         A14AlbComCod = P090W7_A14AlbComCod[0] ;
         A279CliNom = P090W7_A279CliNom[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P090W7_A10015AlbComFdD[0], A10015AlbComFdD) == 0 ) )
         {
            brk90W12 = false ;
            A396EmprCod = P090W7_A396EmprCod[0] ;
            A14AlbComCod = P090W7_A14AlbComCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90W12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A10015AlbComFdD)==0) )
         {
            AV34Option = A10015AlbComFdD ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90W12 )
         {
            brk90W12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentocomercialv02wwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = documentocomercialv02wwgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = documentocomercialv02wwgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV24TFAlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV50TFAlbComEAT_SelsJson = "" ;
      AV51TFAlbComEAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV54TFAlbComID = "" ;
      AV55TFAlbComID_Sel = "" ;
      AV56TFAlbComAT = "" ;
      AV57TFAlbComAT_Sel = "" ;
      AV52TFAlbComATCUD = "" ;
      AV53TFAlbComATCUD_Sel = "" ;
      AV58TFAlbComSt = "" ;
      AV59TFAlbComSt_Sel = "" ;
      AV60TFAlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV62TFAlbComFdD = "" ;
      AV63TFAlbComFdD_Sel = "" ;
      A279CliNom = "" ;
      AV72Documentocomercialv02wwds_5_tfclinom = "" ;
      AV73Documentocomercialv02wwds_6_tfclinom_sel = "" ;
      AV74Documentocomercialv02wwds_7_tfalbcomfch = GXutil.nullDate() ;
      AV75Documentocomercialv02wwds_8_tfalbcomhor = GXutil.resetTime( GXutil.nullDate() );
      AV76Documentocomercialv02wwds_9_tfalbcomeat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV77Documentocomercialv02wwds_10_tfalbcomid = "" ;
      AV78Documentocomercialv02wwds_11_tfalbcomid_sel = "" ;
      AV79Documentocomercialv02wwds_12_tfalbcomat = "" ;
      AV80Documentocomercialv02wwds_13_tfalbcomat_sel = "" ;
      AV81Documentocomercialv02wwds_14_tfalbcomatcud = "" ;
      AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel = "" ;
      AV83Documentocomercialv02wwds_16_tfalbcomst = "" ;
      AV84Documentocomercialv02wwds_17_tfalbcomst_sel = "" ;
      AV85Documentocomercialv02wwds_18_tfalbcomfs = GXutil.resetTime( GXutil.nullDate() );
      AV86Documentocomercialv02wwds_19_tfalbcomfdd = "" ;
      AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel = "" ;
      scmdbuf = "" ;
      lV72Documentocomercialv02wwds_5_tfclinom = "" ;
      lV77Documentocomercialv02wwds_10_tfalbcomid = "" ;
      lV79Documentocomercialv02wwds_12_tfalbcomat = "" ;
      lV81Documentocomercialv02wwds_14_tfalbcomatcud = "" ;
      lV83Documentocomercialv02wwds_16_tfalbcomst = "" ;
      lV86Documentocomercialv02wwds_19_tfalbcomfdd = "" ;
      AV13TFAlbComFch_To = GXutil.nullDate() ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      A14248AlbComATCU = "" ;
      A10738AlbComSt = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10015AlbComFdD = "" ;
      A22AlbComPri = "" ;
      AV49AlbComPri = "" ;
      P090W2_A396EmprCod = new String[] {""} ;
      P090W2_A22AlbComPri = new String[] {""} ;
      P090W2_A279CliNom = new String[] {""} ;
      P090W2_A10015AlbComFdD = new String[] {""} ;
      P090W2_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P090W2_A10738AlbComSt = new String[] {""} ;
      P090W2_A14248AlbComATCU = new String[] {""} ;
      P090W2_A10764AlbComAT = new String[] {""} ;
      P090W2_A10740AlbComID = new String[] {""} ;
      P090W2_A10739AlbComEAT = new byte[1] ;
      P090W2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090W2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090W2_A252CliCod = new int[1] ;
      P090W2_A14AlbComCod = new int[1] ;
      A396EmprCod = "" ;
      AV34Option = "" ;
      P090W3_A396EmprCod = new String[] {""} ;
      P090W3_A22AlbComPri = new String[] {""} ;
      P090W3_A10740AlbComID = new String[] {""} ;
      P090W3_A10015AlbComFdD = new String[] {""} ;
      P090W3_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P090W3_A10738AlbComSt = new String[] {""} ;
      P090W3_A14248AlbComATCU = new String[] {""} ;
      P090W3_A10764AlbComAT = new String[] {""} ;
      P090W3_A10739AlbComEAT = new byte[1] ;
      P090W3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090W3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090W3_A279CliNom = new String[] {""} ;
      P090W3_A252CliCod = new int[1] ;
      P090W3_A14AlbComCod = new int[1] ;
      P090W4_A396EmprCod = new String[] {""} ;
      P090W4_A22AlbComPri = new String[] {""} ;
      P090W4_A10764AlbComAT = new String[] {""} ;
      P090W4_A10015AlbComFdD = new String[] {""} ;
      P090W4_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P090W4_A10738AlbComSt = new String[] {""} ;
      P090W4_A14248AlbComATCU = new String[] {""} ;
      P090W4_A10740AlbComID = new String[] {""} ;
      P090W4_A10739AlbComEAT = new byte[1] ;
      P090W4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090W4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090W4_A279CliNom = new String[] {""} ;
      P090W4_A252CliCod = new int[1] ;
      P090W4_A14AlbComCod = new int[1] ;
      P090W5_A396EmprCod = new String[] {""} ;
      P090W5_A22AlbComPri = new String[] {""} ;
      P090W5_A14248AlbComATCU = new String[] {""} ;
      P090W5_A10015AlbComFdD = new String[] {""} ;
      P090W5_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P090W5_A10738AlbComSt = new String[] {""} ;
      P090W5_A10764AlbComAT = new String[] {""} ;
      P090W5_A10740AlbComID = new String[] {""} ;
      P090W5_A10739AlbComEAT = new byte[1] ;
      P090W5_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090W5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090W5_A279CliNom = new String[] {""} ;
      P090W5_A252CliCod = new int[1] ;
      P090W5_A14AlbComCod = new int[1] ;
      P090W6_A396EmprCod = new String[] {""} ;
      P090W6_A22AlbComPri = new String[] {""} ;
      P090W6_A10738AlbComSt = new String[] {""} ;
      P090W6_A10015AlbComFdD = new String[] {""} ;
      P090W6_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P090W6_A14248AlbComATCU = new String[] {""} ;
      P090W6_A10764AlbComAT = new String[] {""} ;
      P090W6_A10740AlbComID = new String[] {""} ;
      P090W6_A10739AlbComEAT = new byte[1] ;
      P090W6_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090W6_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090W6_A279CliNom = new String[] {""} ;
      P090W6_A252CliCod = new int[1] ;
      P090W6_A14AlbComCod = new int[1] ;
      P090W7_A396EmprCod = new String[] {""} ;
      P090W7_A22AlbComPri = new String[] {""} ;
      P090W7_A10015AlbComFdD = new String[] {""} ;
      P090W7_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      P090W7_A10738AlbComSt = new String[] {""} ;
      P090W7_A14248AlbComATCU = new String[] {""} ;
      P090W7_A10764AlbComAT = new String[] {""} ;
      P090W7_A10740AlbComID = new String[] {""} ;
      P090W7_A10739AlbComEAT = new byte[1] ;
      P090W7_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P090W7_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P090W7_A279CliNom = new String[] {""} ;
      P090W7_A252CliCod = new int[1] ;
      P090W7_A14AlbComCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv02wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P090W2_A396EmprCod, P090W2_A22AlbComPri, P090W2_A279CliNom, P090W2_A10015AlbComFdD, P090W2_A10013AlbComFs, P090W2_A10738AlbComSt, P090W2_A14248AlbComATCU, P090W2_A10764AlbComAT, P090W2_A10740AlbComID, P090W2_A10739AlbComEAT,
            P090W2_A4829AlbComHor, P090W2_A17AlbComFch, P090W2_A252CliCod, P090W2_A14AlbComCod
            }
            , new Object[] {
            P090W3_A396EmprCod, P090W3_A22AlbComPri, P090W3_A10740AlbComID, P090W3_A10015AlbComFdD, P090W3_A10013AlbComFs, P090W3_A10738AlbComSt, P090W3_A14248AlbComATCU, P090W3_A10764AlbComAT, P090W3_A10739AlbComEAT, P090W3_A4829AlbComHor,
            P090W3_A17AlbComFch, P090W3_A279CliNom, P090W3_A252CliCod, P090W3_A14AlbComCod
            }
            , new Object[] {
            P090W4_A396EmprCod, P090W4_A22AlbComPri, P090W4_A10764AlbComAT, P090W4_A10015AlbComFdD, P090W4_A10013AlbComFs, P090W4_A10738AlbComSt, P090W4_A14248AlbComATCU, P090W4_A10740AlbComID, P090W4_A10739AlbComEAT, P090W4_A4829AlbComHor,
            P090W4_A17AlbComFch, P090W4_A279CliNom, P090W4_A252CliCod, P090W4_A14AlbComCod
            }
            , new Object[] {
            P090W5_A396EmprCod, P090W5_A22AlbComPri, P090W5_A14248AlbComATCU, P090W5_A10015AlbComFdD, P090W5_A10013AlbComFs, P090W5_A10738AlbComSt, P090W5_A10764AlbComAT, P090W5_A10740AlbComID, P090W5_A10739AlbComEAT, P090W5_A4829AlbComHor,
            P090W5_A17AlbComFch, P090W5_A279CliNom, P090W5_A252CliCod, P090W5_A14AlbComCod
            }
            , new Object[] {
            P090W6_A396EmprCod, P090W6_A22AlbComPri, P090W6_A10738AlbComSt, P090W6_A10015AlbComFdD, P090W6_A10013AlbComFs, P090W6_A14248AlbComATCU, P090W6_A10764AlbComAT, P090W6_A10740AlbComID, P090W6_A10739AlbComEAT, P090W6_A4829AlbComHor,
            P090W6_A17AlbComFch, P090W6_A279CliNom, P090W6_A252CliCod, P090W6_A14AlbComCod
            }
            , new Object[] {
            P090W7_A396EmprCod, P090W7_A22AlbComPri, P090W7_A10015AlbComFdD, P090W7_A10013AlbComFs, P090W7_A10738AlbComSt, P090W7_A14248AlbComATCU, P090W7_A10764AlbComAT, P090W7_A10740AlbComID, P090W7_A10739AlbComEAT, P090W7_A4829AlbComHor,
            P090W7_A17AlbComFch, P090W7_A279CliNom, P090W7_A252CliCod, P090W7_A14AlbComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10739AlbComEAT ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV16TFCliCod ;
   private int AV17TFCliCod_To ;
   private int AV68Documentocomercialv02wwds_1_tfalbcomcod ;
   private int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ;
   private int AV70Documentocomercialv02wwds_3_tfclicod ;
   private int AV71Documentocomercialv02wwds_4_tfclicod_to ;
   private int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private long AV42count ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String AV54TFAlbComID ;
   private String AV55TFAlbComID_Sel ;
   private String AV56TFAlbComAT ;
   private String AV57TFAlbComAT_Sel ;
   private String AV52TFAlbComATCUD ;
   private String AV53TFAlbComATCUD_Sel ;
   private String AV58TFAlbComSt ;
   private String AV59TFAlbComSt_Sel ;
   private String AV62TFAlbComFdD ;
   private String AV63TFAlbComFdD_Sel ;
   private String A279CliNom ;
   private String AV72Documentocomercialv02wwds_5_tfclinom ;
   private String AV73Documentocomercialv02wwds_6_tfclinom_sel ;
   private String AV77Documentocomercialv02wwds_10_tfalbcomid ;
   private String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ;
   private String AV79Documentocomercialv02wwds_12_tfalbcomat ;
   private String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ;
   private String AV81Documentocomercialv02wwds_14_tfalbcomatcud ;
   private String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ;
   private String AV83Documentocomercialv02wwds_16_tfalbcomst ;
   private String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ;
   private String AV86Documentocomercialv02wwds_19_tfalbcomfdd ;
   private String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV72Documentocomercialv02wwds_5_tfclinom ;
   private String lV77Documentocomercialv02wwds_10_tfalbcomid ;
   private String lV79Documentocomercialv02wwds_12_tfalbcomat ;
   private String lV81Documentocomercialv02wwds_14_tfalbcomatcud ;
   private String lV83Documentocomercialv02wwds_16_tfalbcomst ;
   private String lV86Documentocomercialv02wwds_19_tfalbcomfdd ;
   private String A10740AlbComID ;
   private String A10764AlbComAT ;
   private String A14248AlbComATCU ;
   private String A10738AlbComSt ;
   private String A10015AlbComFdD ;
   private String A22AlbComPri ;
   private String AV49AlbComPri ;
   private String A396EmprCod ;
   private java.util.Date AV24TFAlbComHor ;
   private java.util.Date AV60TFAlbComFs ;
   private java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ;
   private java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ;
   private java.util.Date AV13TFAlbComFch_To ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk90W2 ;
   private boolean brk90W4 ;
   private boolean brk90W6 ;
   private boolean brk90W8 ;
   private boolean brk90W10 ;
   private boolean brk90W12 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV50TFAlbComEAT_SelsJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV34Option ;
   private GXSimpleCollection<Byte> AV51TFAlbComEAT_Sels ;
   private GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P090W2_A396EmprCod ;
   private String[] P090W2_A22AlbComPri ;
   private String[] P090W2_A279CliNom ;
   private String[] P090W2_A10015AlbComFdD ;
   private java.util.Date[] P090W2_A10013AlbComFs ;
   private String[] P090W2_A10738AlbComSt ;
   private String[] P090W2_A14248AlbComATCU ;
   private String[] P090W2_A10764AlbComAT ;
   private String[] P090W2_A10740AlbComID ;
   private byte[] P090W2_A10739AlbComEAT ;
   private java.util.Date[] P090W2_A4829AlbComHor ;
   private java.util.Date[] P090W2_A17AlbComFch ;
   private int[] P090W2_A252CliCod ;
   private int[] P090W2_A14AlbComCod ;
   private String[] P090W3_A396EmprCod ;
   private String[] P090W3_A22AlbComPri ;
   private String[] P090W3_A10740AlbComID ;
   private String[] P090W3_A10015AlbComFdD ;
   private java.util.Date[] P090W3_A10013AlbComFs ;
   private String[] P090W3_A10738AlbComSt ;
   private String[] P090W3_A14248AlbComATCU ;
   private String[] P090W3_A10764AlbComAT ;
   private byte[] P090W3_A10739AlbComEAT ;
   private java.util.Date[] P090W3_A4829AlbComHor ;
   private java.util.Date[] P090W3_A17AlbComFch ;
   private String[] P090W3_A279CliNom ;
   private int[] P090W3_A252CliCod ;
   private int[] P090W3_A14AlbComCod ;
   private String[] P090W4_A396EmprCod ;
   private String[] P090W4_A22AlbComPri ;
   private String[] P090W4_A10764AlbComAT ;
   private String[] P090W4_A10015AlbComFdD ;
   private java.util.Date[] P090W4_A10013AlbComFs ;
   private String[] P090W4_A10738AlbComSt ;
   private String[] P090W4_A14248AlbComATCU ;
   private String[] P090W4_A10740AlbComID ;
   private byte[] P090W4_A10739AlbComEAT ;
   private java.util.Date[] P090W4_A4829AlbComHor ;
   private java.util.Date[] P090W4_A17AlbComFch ;
   private String[] P090W4_A279CliNom ;
   private int[] P090W4_A252CliCod ;
   private int[] P090W4_A14AlbComCod ;
   private String[] P090W5_A396EmprCod ;
   private String[] P090W5_A22AlbComPri ;
   private String[] P090W5_A14248AlbComATCU ;
   private String[] P090W5_A10015AlbComFdD ;
   private java.util.Date[] P090W5_A10013AlbComFs ;
   private String[] P090W5_A10738AlbComSt ;
   private String[] P090W5_A10764AlbComAT ;
   private String[] P090W5_A10740AlbComID ;
   private byte[] P090W5_A10739AlbComEAT ;
   private java.util.Date[] P090W5_A4829AlbComHor ;
   private java.util.Date[] P090W5_A17AlbComFch ;
   private String[] P090W5_A279CliNom ;
   private int[] P090W5_A252CliCod ;
   private int[] P090W5_A14AlbComCod ;
   private String[] P090W6_A396EmprCod ;
   private String[] P090W6_A22AlbComPri ;
   private String[] P090W6_A10738AlbComSt ;
   private String[] P090W6_A10015AlbComFdD ;
   private java.util.Date[] P090W6_A10013AlbComFs ;
   private String[] P090W6_A14248AlbComATCU ;
   private String[] P090W6_A10764AlbComAT ;
   private String[] P090W6_A10740AlbComID ;
   private byte[] P090W6_A10739AlbComEAT ;
   private java.util.Date[] P090W6_A4829AlbComHor ;
   private java.util.Date[] P090W6_A17AlbComFch ;
   private String[] P090W6_A279CliNom ;
   private int[] P090W6_A252CliCod ;
   private int[] P090W6_A14AlbComCod ;
   private String[] P090W7_A396EmprCod ;
   private String[] P090W7_A22AlbComPri ;
   private String[] P090W7_A10015AlbComFdD ;
   private java.util.Date[] P090W7_A10013AlbComFs ;
   private String[] P090W7_A10738AlbComSt ;
   private String[] P090W7_A14248AlbComATCU ;
   private String[] P090W7_A10764AlbComAT ;
   private String[] P090W7_A10740AlbComID ;
   private byte[] P090W7_A10739AlbComEAT ;
   private java.util.Date[] P090W7_A4829AlbComHor ;
   private java.util.Date[] P090W7_A17AlbComFch ;
   private String[] P090W7_A279CliNom ;
   private int[] P090W7_A252CliCod ;
   private int[] P090W7_A14AlbComCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class documentocomercialv02wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV68Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV70Documentocomercialv02wwds_3_tfclicod ,
                                          int AV71Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV72Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV12TFAlbComFch ,
                                          java.util.Date AV13TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          String A22AlbComPri ,
                                          String AV49AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T2.CliNom, T1.AlbComFdD, T1.AlbComFs, T1.AlbComSt, T1.AlbComATCU, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch," ;
      scmdbuf += " T1.CliCod, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV68Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV79Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV81Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P090W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV68Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV70Documentocomercialv02wwds_3_tfclicod ,
                                          int AV71Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV72Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV12TFAlbComFch ,
                                          java.util.Date AV13TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          String A22AlbComPri ,
                                          String AV49AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[22];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComID, T1.AlbComFdD, T1.AlbComFs, T1.AlbComSt, T1.AlbComATCU, T1.AlbComAT, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch, T2.CliNom," ;
      scmdbuf += " T1.CliCod, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV68Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV79Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV81Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComID" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P090W4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV68Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV70Documentocomercialv02wwds_3_tfclicod ,
                                          int AV71Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV72Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV12TFAlbComFch ,
                                          java.util.Date AV13TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          String A22AlbComPri ,
                                          String AV49AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComAT, T1.AlbComFdD, T1.AlbComFs, T1.AlbComSt, T1.AlbComATCU, T1.AlbComID, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch, T2.CliNom," ;
      scmdbuf += " T1.CliCod, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV68Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV79Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV81Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComAT" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P090W5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV68Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV70Documentocomercialv02wwds_3_tfclicod ,
                                          int AV71Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV72Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV12TFAlbComFch ,
                                          java.util.Date AV13TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          String A22AlbComPri ,
                                          String AV49AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[22];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComATCU, T1.AlbComFdD, T1.AlbComFs, T1.AlbComSt, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch, T2.CliNom," ;
      scmdbuf += " T1.CliCod, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV68Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV79Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV81Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComATCU" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P090W6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV68Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV70Documentocomercialv02wwds_3_tfclicod ,
                                          int AV71Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV72Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV12TFAlbComFch ,
                                          java.util.Date AV13TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          String A22AlbComPri ,
                                          String AV49AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[22];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComSt, T1.AlbComFdD, T1.AlbComFs, T1.AlbComATCU, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch, T2.CliNom," ;
      scmdbuf += " T1.CliCod, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV68Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV79Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV81Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComSt" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P090W7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV76Documentocomercialv02wwds_9_tfalbcomeat_sels ,
                                          int AV68Documentocomercialv02wwds_1_tfalbcomcod ,
                                          int AV69Documentocomercialv02wwds_2_tfalbcomcod_to ,
                                          int AV70Documentocomercialv02wwds_3_tfclicod ,
                                          int AV71Documentocomercialv02wwds_4_tfclicod_to ,
                                          String AV73Documentocomercialv02wwds_6_tfclinom_sel ,
                                          String AV72Documentocomercialv02wwds_5_tfclinom ,
                                          java.util.Date AV74Documentocomercialv02wwds_7_tfalbcomfch ,
                                          java.util.Date AV75Documentocomercialv02wwds_8_tfalbcomhor ,
                                          int AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size ,
                                          String AV78Documentocomercialv02wwds_11_tfalbcomid_sel ,
                                          String AV77Documentocomercialv02wwds_10_tfalbcomid ,
                                          String AV80Documentocomercialv02wwds_13_tfalbcomat_sel ,
                                          String AV79Documentocomercialv02wwds_12_tfalbcomat ,
                                          String AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel ,
                                          String AV81Documentocomercialv02wwds_14_tfalbcomatcud ,
                                          String AV84Documentocomercialv02wwds_17_tfalbcomst_sel ,
                                          String AV83Documentocomercialv02wwds_16_tfalbcomst ,
                                          java.util.Date AV85Documentocomercialv02wwds_18_tfalbcomfs ,
                                          String AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel ,
                                          String AV86Documentocomercialv02wwds_19_tfalbcomfdd ,
                                          java.util.Date AV12TFAlbComFch ,
                                          java.util.Date AV13TFAlbComFch_To ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A17AlbComFch ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A10764AlbComAT ,
                                          String A14248AlbComATCU ,
                                          String A10738AlbComSt ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10015AlbComFdD ,
                                          String A22AlbComPri ,
                                          String AV49AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[22];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComFdD, T1.AlbComFs, T1.AlbComSt, T1.AlbComATCU, T1.AlbComAT, T1.AlbComID, T1.AlbComEAT, T1.AlbComHor, T1.AlbComFch, T2.CliNom," ;
      scmdbuf += " T1.CliCod, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV68Documentocomercialv02wwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV69Documentocomercialv02wwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Documentocomercialv02wwds_3_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Documentocomercialv02wwds_4_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentocomercialv02wwds_5_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentocomercialv02wwds_6_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74Documentocomercialv02wwds_7_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV75Documentocomercialv02wwds_8_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( AV76Documentocomercialv02wwds_9_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Documentocomercialv02wwds_9_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV77Documentocomercialv02wwds_10_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Documentocomercialv02wwds_11_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) && ( ! (GXutil.strcmp("", AV79Documentocomercialv02wwds_12_tfalbcomat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Documentocomercialv02wwds_13_tfalbcomat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComAT = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV81Documentocomercialv02wwds_14_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Documentocomercialv02wwds_15_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentocomercialv02wwds_16_tfalbcomst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComSt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentocomercialv02wwds_17_tfalbcomst_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComSt = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV85Documentocomercialv02wwds_18_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV86Documentocomercialv02wwds_19_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Documentocomercialv02wwds_20_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12TFAlbComFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13TFAlbComFch_To)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbComFdD" ;
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
                  return conditional_P090W2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P090W3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P090W4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 3 :
                  return conditional_P090W5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 4 :
                  return conditional_P090W6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 5 :
                  return conditional_P090W7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090W4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090W5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090W6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090W7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 200);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 200);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
      }
   }

}

