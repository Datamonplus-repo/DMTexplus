package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_1wwgetfilterdata extends GXProcedure
{
   public documentotransporteproveedor_1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_1wwgetfilterdata.class ), "" );
   }

   public documentotransporteproveedor_1wwgetfilterdata( int remoteHandle ,
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
      documentotransporteproveedor_1wwgetfilterdata.this.aP5 = new String[] {""};
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
      documentotransporteproveedor_1wwgetfilterdata.this.AV32DDOName = aP0;
      documentotransporteproveedor_1wwgetfilterdata.this.AV33SearchTxt = aP1;
      documentotransporteproveedor_1wwgetfilterdata.this.AV34SearchTxtTo = aP2;
      documentotransporteproveedor_1wwgetfilterdata.this.aP3 = aP3;
      documentotransporteproveedor_1wwgetfilterdata.this.aP4 = aP4;
      documentotransporteproveedor_1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBPROPRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBPROIDAT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROIDATOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBPROATCUD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROATCUDOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBPROFM4DIG") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPROFM4DIGOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.DocumentoTransporteProveedor_1WWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.DocumentoTransporteProveedor_1WWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.DocumentoTransporteProveedor_1WWGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV68TFAlbProPrvNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV69TFAlbProPrvNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTA_SEL") == 0 )
         {
            AV60TFAlbProSta_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV61TFAlbProSta_Sels.fromJSonString(AV60TFAlbProSta_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV53TFAlbProSal = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV16TFAlbProIDAT = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV17TFAlbProIDAT_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROATCUD") == 0 )
         {
            AV39TFAlbProATCUD = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROATCUD_SEL") == 0 )
         {
            AV40TFAlbProATCUD_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV54TFAlbProStAT_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFAlbProStAT_Sels.fromJSonString(AV54TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSYS") == 0 )
         {
            AV14TFAlbProSys = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV15TFAlbProSys_To = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFM4DIG") == 0 )
         {
            AV58TFAlbProFm4dig = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFM4DIG_SEL") == 0 )
         {
            AV59TFAlbProFm4dig_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBPROPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV68TFAlbProPrvNom = AV33SearchTxt ;
      AV69TFAlbProPrvNom_Sel = "" ;
      AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV68TFAlbProPrvNom ;
      AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV69TFAlbProPrvNom_Sel ;
      AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV61TFAlbProSta_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV53TFAlbProSal ;
      AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV16TFAlbProIDAT ;
      AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV17TFAlbProIDAT_Sel ;
      AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV39TFAlbProATCUD ;
      AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV40TFAlbProATCUD_Sel ;
      AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV55TFAlbProStAT_Sels ;
      AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV14TFAlbProSys ;
      AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV15TFAlbProSys_To ;
      AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV58TFAlbProFm4dig ;
      AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV59TFAlbProFm4dig_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A13437AlbProSta) ,
                                           AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                           AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                           AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                           Integer.valueOf(AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels.size()) ,
                                           AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                           AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                           AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                           AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                           AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                           Integer.valueOf(AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels.size()) ,
                                           AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                           AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                           AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                           AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                           Integer.valueOf(AV63AlbProID) ,
                                           Integer.valueOf(AV64AlbProPrvID) ,
                                           AV65AlbProDatefrom ,
                                           AV66AlbProDateto ,
                                           A13420AlbProPrvN ,
                                           A13429AlbProSal ,
                                           A13436AlbProIDAT ,
                                           A14190AlbProATCU ,
                                           A13431AlbProSys ,
                                           A13433AlbProHh ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13430AlbProDate ,
                                           A13440AlbProAnul ,
                                           AV67AlbProAnul ,
                                           AV62EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom), 30, "%") ;
      lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat), 20, "%") ;
      lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = GXutil.padr( GXutil.rtrim( AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud), 20, "%") ;
      lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig), 4, "%") ;
      /* Using cursor P09SS2 */
      pr_default.execute(0, new Object[] {AV62EmprCod, AV67AlbProAnul, AV67AlbProAnul, lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom, AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel, AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal, lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat, AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel, lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud, AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel, AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys, AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to, lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig, AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel, Integer.valueOf(AV63AlbProID), Integer.valueOf(AV64AlbProPrvID), AV65AlbProDatefrom, AV66AlbProDateto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9SS2 = false ;
         A13419AlbProPrvI = P09SS2_A13419AlbProPrvI[0] ;
         A396EmprCod = P09SS2_A396EmprCod[0] ;
         A13440AlbProAnul = P09SS2_A13440AlbProAnul[0] ;
         A13430AlbProDate = P09SS2_A13430AlbProDate[0] ;
         A13418AlbProID = P09SS2_A13418AlbProID[0] ;
         A13431AlbProSys = P09SS2_A13431AlbProSys[0] ;
         A13438AlbProStAT = P09SS2_A13438AlbProStAT[0] ;
         A14190AlbProATCU = P09SS2_A14190AlbProATCU[0] ;
         n14190AlbProATCU = P09SS2_n14190AlbProATCU[0] ;
         A13436AlbProIDAT = P09SS2_A13436AlbProIDAT[0] ;
         A13429AlbProSal = P09SS2_A13429AlbProSal[0] ;
         A13437AlbProSta = P09SS2_A13437AlbProSta[0] ;
         A13420AlbProPrvN = P09SS2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS2_n13420AlbProPrvN[0] ;
         A13433AlbProHh = P09SS2_A13433AlbProHh[0] ;
         A13420AlbProPrvN = P09SS2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS2_n13420AlbProPrvN[0] ;
         A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09SS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09SS2_A13419AlbProPrvI[0] == A13419AlbProPrvI ) )
         {
            brk9SS2 = false ;
            A13418AlbProID = P09SS2_A13418AlbProID[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9SS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13420AlbProPrvN)==0) )
         {
            AV21Option = A13420AlbProPrvN ;
            AV20InsertIndex = 1 ;
            while ( ( AV20InsertIndex <= AV22Options.size() ) && ( GXutil.strcmp((String)AV22Options.elementAt(-1+AV20InsertIndex), AV21Option) < 0 ) )
            {
               AV20InsertIndex = (int)(AV20InsertIndex+1) ;
            }
            AV22Options.add(AV21Option, AV20InsertIndex);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV20InsertIndex);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SS2 )
         {
            brk9SS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBPROIDATOPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbProIDAT = AV33SearchTxt ;
      AV17TFAlbProIDAT_Sel = "" ;
      AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV68TFAlbProPrvNom ;
      AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV69TFAlbProPrvNom_Sel ;
      AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV61TFAlbProSta_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV53TFAlbProSal ;
      AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV16TFAlbProIDAT ;
      AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV17TFAlbProIDAT_Sel ;
      AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV39TFAlbProATCUD ;
      AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV40TFAlbProATCUD_Sel ;
      AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV55TFAlbProStAT_Sels ;
      AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV14TFAlbProSys ;
      AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV15TFAlbProSys_To ;
      AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV58TFAlbProFm4dig ;
      AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV59TFAlbProFm4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A13437AlbProSta) ,
                                           AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                           AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                           AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                           Integer.valueOf(AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels.size()) ,
                                           AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                           AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                           AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                           AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                           AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                           Integer.valueOf(AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels.size()) ,
                                           AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                           AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                           AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                           AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                           Integer.valueOf(AV63AlbProID) ,
                                           Integer.valueOf(AV64AlbProPrvID) ,
                                           AV65AlbProDatefrom ,
                                           AV66AlbProDateto ,
                                           A13420AlbProPrvN ,
                                           A13429AlbProSal ,
                                           A13436AlbProIDAT ,
                                           A14190AlbProATCU ,
                                           A13431AlbProSys ,
                                           A13433AlbProHh ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13430AlbProDate ,
                                           A13440AlbProAnul ,
                                           AV67AlbProAnul ,
                                           A396EmprCod ,
                                           AV62EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom), 30, "%") ;
      lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat), 20, "%") ;
      lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = GXutil.padr( GXutil.rtrim( AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud), 20, "%") ;
      lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig), 4, "%") ;
      /* Using cursor P09SS3 */
      pr_default.execute(1, new Object[] {AV67AlbProAnul, AV67AlbProAnul, AV62EmprCod, lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom, AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel, AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal, lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat, AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel, lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud, AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel, AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys, AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to, lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig, AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel, Integer.valueOf(AV63AlbProID), Integer.valueOf(AV64AlbProPrvID), AV65AlbProDatefrom, AV66AlbProDateto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9SS4 = false ;
         A396EmprCod = P09SS3_A396EmprCod[0] ;
         A13436AlbProIDAT = P09SS3_A13436AlbProIDAT[0] ;
         A13440AlbProAnul = P09SS3_A13440AlbProAnul[0] ;
         A13430AlbProDate = P09SS3_A13430AlbProDate[0] ;
         A13419AlbProPrvI = P09SS3_A13419AlbProPrvI[0] ;
         A13418AlbProID = P09SS3_A13418AlbProID[0] ;
         A13431AlbProSys = P09SS3_A13431AlbProSys[0] ;
         A13438AlbProStAT = P09SS3_A13438AlbProStAT[0] ;
         A14190AlbProATCU = P09SS3_A14190AlbProATCU[0] ;
         n14190AlbProATCU = P09SS3_n14190AlbProATCU[0] ;
         A13429AlbProSal = P09SS3_A13429AlbProSal[0] ;
         A13437AlbProSta = P09SS3_A13437AlbProSta[0] ;
         A13420AlbProPrvN = P09SS3_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS3_n13420AlbProPrvN[0] ;
         A13433AlbProHh = P09SS3_A13433AlbProHh[0] ;
         A13420AlbProPrvN = P09SS3_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS3_n13420AlbProPrvN[0] ;
         A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09SS3_A13436AlbProIDAT[0], A13436AlbProIDAT) == 0 ) )
         {
            brk9SS4 = false ;
            A396EmprCod = P09SS3_A396EmprCod[0] ;
            A13418AlbProID = P09SS3_A13418AlbProID[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9SS4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13436AlbProIDAT)==0) )
         {
            AV21Option = A13436AlbProIDAT ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SS4 )
         {
            brk9SS4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBPROATCUDOPTIONS' Routine */
      returnInSub = false ;
      AV39TFAlbProATCUD = AV33SearchTxt ;
      AV40TFAlbProATCUD_Sel = "" ;
      AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV68TFAlbProPrvNom ;
      AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV69TFAlbProPrvNom_Sel ;
      AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV61TFAlbProSta_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV53TFAlbProSal ;
      AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV16TFAlbProIDAT ;
      AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV17TFAlbProIDAT_Sel ;
      AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV39TFAlbProATCUD ;
      AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV40TFAlbProATCUD_Sel ;
      AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV55TFAlbProStAT_Sels ;
      AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV14TFAlbProSys ;
      AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV15TFAlbProSys_To ;
      AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV58TFAlbProFm4dig ;
      AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV59TFAlbProFm4dig_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A13437AlbProSta) ,
                                           AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                           AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                           AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                           Integer.valueOf(AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels.size()) ,
                                           AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                           AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                           AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                           AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                           AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                           Integer.valueOf(AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels.size()) ,
                                           AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                           AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                           AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                           AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                           Integer.valueOf(AV63AlbProID) ,
                                           Integer.valueOf(AV64AlbProPrvID) ,
                                           AV65AlbProDatefrom ,
                                           AV66AlbProDateto ,
                                           A13420AlbProPrvN ,
                                           A13429AlbProSal ,
                                           A13436AlbProIDAT ,
                                           A14190AlbProATCU ,
                                           A13431AlbProSys ,
                                           A13433AlbProHh ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13430AlbProDate ,
                                           A13440AlbProAnul ,
                                           AV67AlbProAnul ,
                                           A396EmprCod ,
                                           AV62EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom), 30, "%") ;
      lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat), 20, "%") ;
      lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = GXutil.padr( GXutil.rtrim( AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud), 20, "%") ;
      lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig), 4, "%") ;
      /* Using cursor P09SS4 */
      pr_default.execute(2, new Object[] {AV67AlbProAnul, AV67AlbProAnul, AV62EmprCod, lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom, AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel, AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal, lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat, AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel, lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud, AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel, AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys, AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to, lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig, AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel, Integer.valueOf(AV63AlbProID), Integer.valueOf(AV64AlbProPrvID), AV65AlbProDatefrom, AV66AlbProDateto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9SS6 = false ;
         A396EmprCod = P09SS4_A396EmprCod[0] ;
         A14190AlbProATCU = P09SS4_A14190AlbProATCU[0] ;
         n14190AlbProATCU = P09SS4_n14190AlbProATCU[0] ;
         A13440AlbProAnul = P09SS4_A13440AlbProAnul[0] ;
         A13430AlbProDate = P09SS4_A13430AlbProDate[0] ;
         A13419AlbProPrvI = P09SS4_A13419AlbProPrvI[0] ;
         A13418AlbProID = P09SS4_A13418AlbProID[0] ;
         A13431AlbProSys = P09SS4_A13431AlbProSys[0] ;
         A13438AlbProStAT = P09SS4_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P09SS4_A13436AlbProIDAT[0] ;
         A13429AlbProSal = P09SS4_A13429AlbProSal[0] ;
         A13437AlbProSta = P09SS4_A13437AlbProSta[0] ;
         A13420AlbProPrvN = P09SS4_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS4_n13420AlbProPrvN[0] ;
         A13433AlbProHh = P09SS4_A13433AlbProHh[0] ;
         A13420AlbProPrvN = P09SS4_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS4_n13420AlbProPrvN[0] ;
         A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09SS4_A14190AlbProATCU[0], A14190AlbProATCU) == 0 ) )
         {
            brk9SS6 = false ;
            A396EmprCod = P09SS4_A396EmprCod[0] ;
            A13418AlbProID = P09SS4_A13418AlbProID[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9SS6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14190AlbProATCU)==0) )
         {
            AV21Option = A14190AlbProATCU ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9SS6 )
         {
            brk9SS6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBPROFM4DIGOPTIONS' Routine */
      returnInSub = false ;
      AV58TFAlbProFm4dig = AV33SearchTxt ;
      AV59TFAlbProFm4dig_Sel = "" ;
      AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = AV68TFAlbProPrvNom ;
      AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = AV69TFAlbProPrvNom_Sel ;
      AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = AV61TFAlbProSta_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = AV53TFAlbProSal ;
      AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = AV16TFAlbProIDAT ;
      AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = AV17TFAlbProIDAT_Sel ;
      AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = AV39TFAlbProATCUD ;
      AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = AV40TFAlbProATCUD_Sel ;
      AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = AV55TFAlbProStAT_Sels ;
      AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = AV14TFAlbProSys ;
      AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = AV15TFAlbProSys_To ;
      AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = AV58TFAlbProFm4dig ;
      AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = AV59TFAlbProFm4dig_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A13437AlbProSta) ,
                                           AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                           AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                           AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                           Integer.valueOf(AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels.size()) ,
                                           AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                           AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                           AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                           AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                           AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                           Integer.valueOf(AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels.size()) ,
                                           AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                           AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                           AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                           AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                           Integer.valueOf(AV63AlbProID) ,
                                           Integer.valueOf(AV64AlbProPrvID) ,
                                           AV65AlbProDatefrom ,
                                           AV66AlbProDateto ,
                                           A13420AlbProPrvN ,
                                           A13429AlbProSal ,
                                           A13436AlbProIDAT ,
                                           A14190AlbProATCU ,
                                           A13431AlbProSys ,
                                           A13433AlbProHh ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13430AlbProDate ,
                                           A13440AlbProAnul ,
                                           AV67AlbProAnul ,
                                           AV62EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom), 30, "%") ;
      lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat), 20, "%") ;
      lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = GXutil.padr( GXutil.rtrim( AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud), 20, "%") ;
      lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig), 4, "%") ;
      /* Using cursor P09SS5 */
      pr_default.execute(3, new Object[] {AV62EmprCod, AV67AlbProAnul, AV67AlbProAnul, lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom, AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel, AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal, lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat, AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel, lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud, AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel, AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys, AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to, lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig, AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel, Integer.valueOf(AV63AlbProID), Integer.valueOf(AV64AlbProPrvID), AV65AlbProDatefrom, AV66AlbProDateto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13440AlbProAnul = P09SS5_A13440AlbProAnul[0] ;
         A13430AlbProDate = P09SS5_A13430AlbProDate[0] ;
         A13419AlbProPrvI = P09SS5_A13419AlbProPrvI[0] ;
         A13418AlbProID = P09SS5_A13418AlbProID[0] ;
         A396EmprCod = P09SS5_A396EmprCod[0] ;
         A13431AlbProSys = P09SS5_A13431AlbProSys[0] ;
         A13438AlbProStAT = P09SS5_A13438AlbProStAT[0] ;
         A14190AlbProATCU = P09SS5_A14190AlbProATCU[0] ;
         n14190AlbProATCU = P09SS5_n14190AlbProATCU[0] ;
         A13436AlbProIDAT = P09SS5_A13436AlbProIDAT[0] ;
         A13429AlbProSal = P09SS5_A13429AlbProSal[0] ;
         A13437AlbProSta = P09SS5_A13437AlbProSta[0] ;
         A13420AlbProPrvN = P09SS5_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS5_n13420AlbProPrvN[0] ;
         A13433AlbProHh = P09SS5_A13433AlbProHh[0] ;
         A13420AlbProPrvN = P09SS5_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P09SS5_n13420AlbProPrvN[0] ;
         A14376AlbProFm4d = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
         if ( ! (GXutil.strcmp("", A14376AlbProFm4d)==0) )
         {
            AV21Option = A14376AlbProFm4d ;
            AV20InsertIndex = 1 ;
            while ( ( AV20InsertIndex <= AV22Options.size() ) && ( GXutil.strcmp((String)AV22Options.elementAt(-1+AV20InsertIndex), AV21Option) < 0 ) )
            {
               AV20InsertIndex = (int)(AV20InsertIndex+1) ;
            }
            if ( ( AV20InsertIndex <= AV22Options.size() ) && ( GXutil.strcmp((String)AV22Options.elementAt(-1+AV20InsertIndex), AV21Option) == 0 ) )
            {
               AV26count = GXutil.lval( (String)AV25OptionIndexes.elementAt(-1+AV20InsertIndex)) ;
               AV26count = (long)(AV26count+1) ;
               AV25OptionIndexes.removeItem(AV20InsertIndex);
               AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV20InsertIndex);
            }
            else
            {
               AV22Options.add(AV21Option, AV20InsertIndex);
               AV25OptionIndexes.add("1", AV20InsertIndex);
            }
         }
         if ( AV22Options.size() == 50 )
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
      this.aP3[0] = documentotransporteproveedor_1wwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = documentotransporteproveedor_1wwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = documentotransporteproveedor_1wwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV68TFAlbProPrvNom = "" ;
      AV69TFAlbProPrvNom_Sel = "" ;
      AV60TFAlbProSta_SelsJson = "" ;
      AV61TFAlbProSta_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV53TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV16TFAlbProIDAT = "" ;
      AV17TFAlbProIDAT_Sel = "" ;
      AV39TFAlbProATCUD = "" ;
      AV40TFAlbProATCUD_Sel = "" ;
      AV54TFAlbProStAT_SelsJson = "" ;
      AV55TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV14TFAlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV15TFAlbProSys_To = GXutil.resetTime( GXutil.nullDate() );
      AV58TFAlbProFm4dig = "" ;
      AV59TFAlbProFm4dig_Sel = "" ;
      A13420AlbProPrvN = "" ;
      AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = "" ;
      AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel = "" ;
      AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = "" ;
      AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel = "" ;
      AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = "" ;
      AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel = "" ;
      AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys = GXutil.resetTime( GXutil.nullDate() );
      AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to = GXutil.resetTime( GXutil.nullDate() );
      AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = "" ;
      AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel = "" ;
      scmdbuf = "" ;
      lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom = "" ;
      lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat = "" ;
      lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud = "" ;
      lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig = "" ;
      AV65AlbProDatefrom = GXutil.nullDate() ;
      AV66AlbProDateto = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13436AlbProIDAT = "" ;
      A14190AlbProATCU = "" ;
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A13433AlbProHh = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13440AlbProAnul = "" ;
      AV67AlbProAnul = "" ;
      AV62EmprCod = "" ;
      A396EmprCod = "" ;
      P09SS2_A13419AlbProPrvI = new int[1] ;
      P09SS2_A396EmprCod = new String[] {""} ;
      P09SS2_A13440AlbProAnul = new String[] {""} ;
      P09SS2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS2_A13418AlbProID = new int[1] ;
      P09SS2_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS2_A13438AlbProStAT = new byte[1] ;
      P09SS2_A14190AlbProATCU = new String[] {""} ;
      P09SS2_n14190AlbProATCU = new boolean[] {false} ;
      P09SS2_A13436AlbProIDAT = new String[] {""} ;
      P09SS2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS2_A13437AlbProSta = new byte[1] ;
      P09SS2_A13420AlbProPrvN = new String[] {""} ;
      P09SS2_n13420AlbProPrvN = new boolean[] {false} ;
      P09SS2_A13433AlbProHh = new String[] {""} ;
      A14376AlbProFm4d = "" ;
      AV21Option = "" ;
      P09SS3_A396EmprCod = new String[] {""} ;
      P09SS3_A13436AlbProIDAT = new String[] {""} ;
      P09SS3_A13440AlbProAnul = new String[] {""} ;
      P09SS3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS3_A13419AlbProPrvI = new int[1] ;
      P09SS3_A13418AlbProID = new int[1] ;
      P09SS3_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS3_A13438AlbProStAT = new byte[1] ;
      P09SS3_A14190AlbProATCU = new String[] {""} ;
      P09SS3_n14190AlbProATCU = new boolean[] {false} ;
      P09SS3_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS3_A13437AlbProSta = new byte[1] ;
      P09SS3_A13420AlbProPrvN = new String[] {""} ;
      P09SS3_n13420AlbProPrvN = new boolean[] {false} ;
      P09SS3_A13433AlbProHh = new String[] {""} ;
      P09SS4_A396EmprCod = new String[] {""} ;
      P09SS4_A14190AlbProATCU = new String[] {""} ;
      P09SS4_n14190AlbProATCU = new boolean[] {false} ;
      P09SS4_A13440AlbProAnul = new String[] {""} ;
      P09SS4_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS4_A13419AlbProPrvI = new int[1] ;
      P09SS4_A13418AlbProID = new int[1] ;
      P09SS4_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS4_A13438AlbProStAT = new byte[1] ;
      P09SS4_A13436AlbProIDAT = new String[] {""} ;
      P09SS4_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS4_A13437AlbProSta = new byte[1] ;
      P09SS4_A13420AlbProPrvN = new String[] {""} ;
      P09SS4_n13420AlbProPrvN = new boolean[] {false} ;
      P09SS4_A13433AlbProHh = new String[] {""} ;
      P09SS5_A13440AlbProAnul = new String[] {""} ;
      P09SS5_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS5_A13419AlbProPrvI = new int[1] ;
      P09SS5_A13418AlbProID = new int[1] ;
      P09SS5_A396EmprCod = new String[] {""} ;
      P09SS5_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS5_A13438AlbProStAT = new byte[1] ;
      P09SS5_A14190AlbProATCU = new String[] {""} ;
      P09SS5_n14190AlbProATCU = new boolean[] {false} ;
      P09SS5_A13436AlbProIDAT = new String[] {""} ;
      P09SS5_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SS5_A13437AlbProSta = new byte[1] ;
      P09SS5_A13420AlbProPrvN = new String[] {""} ;
      P09SS5_n13420AlbProPrvN = new boolean[] {false} ;
      P09SS5_A13433AlbProHh = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09SS2_A13419AlbProPrvI, P09SS2_A396EmprCod, P09SS2_A13440AlbProAnul, P09SS2_A13430AlbProDate, P09SS2_A13418AlbProID, P09SS2_A13431AlbProSys, P09SS2_A13438AlbProStAT, P09SS2_A14190AlbProATCU, P09SS2_n14190AlbProATCU, P09SS2_A13436AlbProIDAT,
            P09SS2_A13429AlbProSal, P09SS2_A13437AlbProSta, P09SS2_A13420AlbProPrvN, P09SS2_n13420AlbProPrvN, P09SS2_A13433AlbProHh
            }
            , new Object[] {
            P09SS3_A396EmprCod, P09SS3_A13436AlbProIDAT, P09SS3_A13440AlbProAnul, P09SS3_A13430AlbProDate, P09SS3_A13419AlbProPrvI, P09SS3_A13418AlbProID, P09SS3_A13431AlbProSys, P09SS3_A13438AlbProStAT, P09SS3_A14190AlbProATCU, P09SS3_n14190AlbProATCU,
            P09SS3_A13429AlbProSal, P09SS3_A13437AlbProSta, P09SS3_A13420AlbProPrvN, P09SS3_n13420AlbProPrvN, P09SS3_A13433AlbProHh
            }
            , new Object[] {
            P09SS4_A396EmprCod, P09SS4_A14190AlbProATCU, P09SS4_n14190AlbProATCU, P09SS4_A13440AlbProAnul, P09SS4_A13430AlbProDate, P09SS4_A13419AlbProPrvI, P09SS4_A13418AlbProID, P09SS4_A13431AlbProSys, P09SS4_A13438AlbProStAT, P09SS4_A13436AlbProIDAT,
            P09SS4_A13429AlbProSal, P09SS4_A13437AlbProSta, P09SS4_A13420AlbProPrvN, P09SS4_n13420AlbProPrvN, P09SS4_A13433AlbProHh
            }
            , new Object[] {
            P09SS5_A13440AlbProAnul, P09SS5_A13430AlbProDate, P09SS5_A13419AlbProPrvI, P09SS5_A13418AlbProID, P09SS5_A396EmprCod, P09SS5_A13431AlbProSys, P09SS5_A13438AlbProStAT, P09SS5_A14190AlbProATCU, P09SS5_n14190AlbProATCU, P09SS5_A13436AlbProIDAT,
            P09SS5_A13429AlbProSal, P09SS5_A13437AlbProSta, P09SS5_A13420AlbProPrvN, P09SS5_n13420AlbProPrvN, P09SS5_A13433AlbProHh
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13437AlbProSta ;
   private byte A13438AlbProStAT ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ;
   private int AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ;
   private int AV63AlbProID ;
   private int AV64AlbProPrvID ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int AV20InsertIndex ;
   private long AV26count ;
   private String AV68TFAlbProPrvNom ;
   private String AV69TFAlbProPrvNom_Sel ;
   private String AV16TFAlbProIDAT ;
   private String AV17TFAlbProIDAT_Sel ;
   private String AV39TFAlbProATCUD ;
   private String AV40TFAlbProATCUD_Sel ;
   private String AV58TFAlbProFm4dig ;
   private String AV59TFAlbProFm4dig_Sel ;
   private String A13420AlbProPrvN ;
   private String AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ;
   private String AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ;
   private String AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ;
   private String AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ;
   private String AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ;
   private String AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ;
   private String AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ;
   private String AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ;
   private String scmdbuf ;
   private String lV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ;
   private String lV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ;
   private String lV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ;
   private String lV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ;
   private String A13436AlbProIDAT ;
   private String A14190AlbProATCU ;
   private String A13440AlbProAnul ;
   private String AV67AlbProAnul ;
   private String AV62EmprCod ;
   private String A396EmprCod ;
   private String A14376AlbProFm4d ;
   private java.util.Date AV53TFAlbProSal ;
   private java.util.Date AV14TFAlbProSys ;
   private java.util.Date AV15TFAlbProSys_To ;
   private java.util.Date AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ;
   private java.util.Date AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ;
   private java.util.Date AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date AV65AlbProDatefrom ;
   private java.util.Date AV66AlbProDateto ;
   private java.util.Date A13430AlbProDate ;
   private boolean returnInSub ;
   private boolean brk9SS2 ;
   private boolean n14190AlbProATCU ;
   private boolean n13420AlbProPrvN ;
   private boolean brk9SS4 ;
   private boolean brk9SS6 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV60TFAlbProSta_SelsJson ;
   private String AV54TFAlbProStAT_SelsJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String A13433AlbProHh ;
   private String AV21Option ;
   private GXSimpleCollection<Byte> AV61TFAlbProSta_Sels ;
   private GXSimpleCollection<Byte> AV55TFAlbProStAT_Sels ;
   private GXSimpleCollection<Byte> AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ;
   private GXSimpleCollection<Byte> AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09SS2_A13419AlbProPrvI ;
   private String[] P09SS2_A396EmprCod ;
   private String[] P09SS2_A13440AlbProAnul ;
   private java.util.Date[] P09SS2_A13430AlbProDate ;
   private int[] P09SS2_A13418AlbProID ;
   private java.util.Date[] P09SS2_A13431AlbProSys ;
   private byte[] P09SS2_A13438AlbProStAT ;
   private String[] P09SS2_A14190AlbProATCU ;
   private boolean[] P09SS2_n14190AlbProATCU ;
   private String[] P09SS2_A13436AlbProIDAT ;
   private java.util.Date[] P09SS2_A13429AlbProSal ;
   private byte[] P09SS2_A13437AlbProSta ;
   private String[] P09SS2_A13420AlbProPrvN ;
   private boolean[] P09SS2_n13420AlbProPrvN ;
   private String[] P09SS2_A13433AlbProHh ;
   private String[] P09SS3_A396EmprCod ;
   private String[] P09SS3_A13436AlbProIDAT ;
   private String[] P09SS3_A13440AlbProAnul ;
   private java.util.Date[] P09SS3_A13430AlbProDate ;
   private int[] P09SS3_A13419AlbProPrvI ;
   private int[] P09SS3_A13418AlbProID ;
   private java.util.Date[] P09SS3_A13431AlbProSys ;
   private byte[] P09SS3_A13438AlbProStAT ;
   private String[] P09SS3_A14190AlbProATCU ;
   private boolean[] P09SS3_n14190AlbProATCU ;
   private java.util.Date[] P09SS3_A13429AlbProSal ;
   private byte[] P09SS3_A13437AlbProSta ;
   private String[] P09SS3_A13420AlbProPrvN ;
   private boolean[] P09SS3_n13420AlbProPrvN ;
   private String[] P09SS3_A13433AlbProHh ;
   private String[] P09SS4_A396EmprCod ;
   private String[] P09SS4_A14190AlbProATCU ;
   private boolean[] P09SS4_n14190AlbProATCU ;
   private String[] P09SS4_A13440AlbProAnul ;
   private java.util.Date[] P09SS4_A13430AlbProDate ;
   private int[] P09SS4_A13419AlbProPrvI ;
   private int[] P09SS4_A13418AlbProID ;
   private java.util.Date[] P09SS4_A13431AlbProSys ;
   private byte[] P09SS4_A13438AlbProStAT ;
   private String[] P09SS4_A13436AlbProIDAT ;
   private java.util.Date[] P09SS4_A13429AlbProSal ;
   private byte[] P09SS4_A13437AlbProSta ;
   private String[] P09SS4_A13420AlbProPrvN ;
   private boolean[] P09SS4_n13420AlbProPrvN ;
   private String[] P09SS4_A13433AlbProHh ;
   private String[] P09SS5_A13440AlbProAnul ;
   private java.util.Date[] P09SS5_A13430AlbProDate ;
   private int[] P09SS5_A13419AlbProPrvI ;
   private int[] P09SS5_A13418AlbProID ;
   private String[] P09SS5_A396EmprCod ;
   private java.util.Date[] P09SS5_A13431AlbProSys ;
   private byte[] P09SS5_A13438AlbProStAT ;
   private String[] P09SS5_A14190AlbProATCU ;
   private boolean[] P09SS5_n14190AlbProATCU ;
   private String[] P09SS5_A13436AlbProIDAT ;
   private java.util.Date[] P09SS5_A13429AlbProSal ;
   private byte[] P09SS5_A13437AlbProSta ;
   private String[] P09SS5_A13420AlbProPrvN ;
   private boolean[] P09SS5_n13420AlbProPrvN ;
   private String[] P09SS5_A13433AlbProHh ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class documentotransporteproveedor_1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09SS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13437AlbProSta ,
                                          GXSimpleCollection<Byte> AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                          String AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                          String AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                          int AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ,
                                          java.util.Date AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                          String AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                          String AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                          String AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                          String AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                          int AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ,
                                          java.util.Date AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                          java.util.Date AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                          String AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                          String AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                          int AV63AlbProID ,
                                          int AV64AlbProPrvID ,
                                          java.util.Date AV65AlbProDatefrom ,
                                          java.util.Date AV66AlbProDateto ,
                                          String A13420AlbProPrvN ,
                                          java.util.Date A13429AlbProSal ,
                                          String A13436AlbProIDAT ,
                                          String A14190AlbProATCU ,
                                          java.util.Date A13431AlbProSys ,
                                          String A13433AlbProHh ,
                                          int A13418AlbProID ,
                                          int A13419AlbProPrvI ,
                                          java.util.Date A13430AlbProDate ,
                                          String A13440AlbProAnul ,
                                          String AV67AlbProAnul ,
                                          String AV62EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbProPrvI AS AlbProPrvI, T1.EmprCod, T1.AlbProAnul, T1.AlbProDate, T1.AlbProID, T1.AlbProSys, T1.AlbProStAT, T1.AlbProATCU, T1.AlbProIDAT, T1.AlbProSal," ;
      scmdbuf += " T1.AlbProSta, T2.PrvNom AS AlbProPrvN, T1.AlbProHh FROM (TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProAnul = ? or ? = 'T')");
      if ( (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels, "T1.AlbProSta IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) && ( ! (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProATCU = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys) )
      {
         addWhere(sWhereString, "(T1.AlbProSys >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to) )
      {
         addWhere(sWhereString, "(T1.AlbProSys <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1) = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV63AlbProID) )
      {
         addWhere(sWhereString, "(T1.AlbProID = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbProPrvID) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbProDatefrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbProDateto)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProPrvI" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09SS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13437AlbProSta ,
                                          GXSimpleCollection<Byte> AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                          String AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                          String AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                          int AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ,
                                          java.util.Date AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                          String AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                          String AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                          String AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                          String AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                          int AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ,
                                          java.util.Date AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                          java.util.Date AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                          String AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                          String AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                          int AV63AlbProID ,
                                          int AV64AlbProPrvID ,
                                          java.util.Date AV65AlbProDatefrom ,
                                          java.util.Date AV66AlbProDateto ,
                                          String A13420AlbProPrvN ,
                                          java.util.Date A13429AlbProSal ,
                                          String A13436AlbProIDAT ,
                                          String A14190AlbProATCU ,
                                          java.util.Date A13431AlbProSys ,
                                          String A13433AlbProHh ,
                                          int A13418AlbProID ,
                                          int A13419AlbProPrvI ,
                                          java.util.Date A13430AlbProDate ,
                                          String A13440AlbProAnul ,
                                          String AV67AlbProAnul ,
                                          String A396EmprCod ,
                                          String AV62EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[18];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProIDAT, T1.AlbProAnul, T1.AlbProDate, T1.AlbProPrvI AS AlbProPrvI, T1.AlbProID, T1.AlbProSys, T1.AlbProStAT, T1.AlbProATCU, T1.AlbProSal," ;
      scmdbuf += " T1.AlbProSta, T2.PrvNom AS AlbProPrvN, T1.AlbProHh FROM (TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI)" ;
      addWhere(sWhereString, "(T1.AlbProAnul = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels, "T1.AlbProSta IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) && ( ! (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProATCU = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys) )
      {
         addWhere(sWhereString, "(T1.AlbProSys >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to) )
      {
         addWhere(sWhereString, "(T1.AlbProSys <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1) = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV63AlbProID) )
      {
         addWhere(sWhereString, "(T1.AlbProID = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbProPrvID) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbProDatefrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbProDateto)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProIDAT" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09SS4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13437AlbProSta ,
                                          GXSimpleCollection<Byte> AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                          String AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                          String AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                          int AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ,
                                          java.util.Date AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                          String AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                          String AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                          String AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                          String AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                          int AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ,
                                          java.util.Date AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                          java.util.Date AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                          String AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                          String AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                          int AV63AlbProID ,
                                          int AV64AlbProPrvID ,
                                          java.util.Date AV65AlbProDatefrom ,
                                          java.util.Date AV66AlbProDateto ,
                                          String A13420AlbProPrvN ,
                                          java.util.Date A13429AlbProSal ,
                                          String A13436AlbProIDAT ,
                                          String A14190AlbProATCU ,
                                          java.util.Date A13431AlbProSys ,
                                          String A13433AlbProHh ,
                                          int A13418AlbProID ,
                                          int A13419AlbProPrvI ,
                                          java.util.Date A13430AlbProDate ,
                                          String A13440AlbProAnul ,
                                          String AV67AlbProAnul ,
                                          String A396EmprCod ,
                                          String AV62EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProATCU, T1.AlbProAnul, T1.AlbProDate, T1.AlbProPrvI AS AlbProPrvI, T1.AlbProID, T1.AlbProSys, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProSal," ;
      scmdbuf += " T1.AlbProSta, T2.PrvNom AS AlbProPrvN, T1.AlbProHh FROM (TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI)" ;
      addWhere(sWhereString, "(T1.AlbProAnul = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels, "T1.AlbProSta IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) && ( ! (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProATCU = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys) )
      {
         addWhere(sWhereString, "(T1.AlbProSys >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to) )
      {
         addWhere(sWhereString, "(T1.AlbProSys <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1) = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV63AlbProID) )
      {
         addWhere(sWhereString, "(T1.AlbProID = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbProPrvID) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbProDatefrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbProDateto)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbProATCU" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09SS5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13437AlbProSta ,
                                          GXSimpleCollection<Byte> AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels ,
                                          String AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel ,
                                          String AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom ,
                                          int AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size ,
                                          java.util.Date AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal ,
                                          String AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel ,
                                          String AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat ,
                                          String AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel ,
                                          String AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud ,
                                          int AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size ,
                                          java.util.Date AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys ,
                                          java.util.Date AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to ,
                                          String AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel ,
                                          String AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig ,
                                          int AV63AlbProID ,
                                          int AV64AlbProPrvID ,
                                          java.util.Date AV65AlbProDatefrom ,
                                          java.util.Date AV66AlbProDateto ,
                                          String A13420AlbProPrvN ,
                                          java.util.Date A13429AlbProSal ,
                                          String A13436AlbProIDAT ,
                                          String A14190AlbProATCU ,
                                          java.util.Date A13431AlbProSys ,
                                          String A13433AlbProHh ,
                                          int A13418AlbProID ,
                                          int A13419AlbProPrvI ,
                                          java.util.Date A13430AlbProDate ,
                                          String A13440AlbProAnul ,
                                          String AV67AlbProAnul ,
                                          String AV62EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[18];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.AlbProAnul, T1.AlbProDate, T1.AlbProPrvI AS AlbProPrvI, T1.AlbProID, T1.EmprCod, T1.AlbProSys, T1.AlbProStAT, T1.AlbProATCU, T1.AlbProIDAT, T1.AlbProSal," ;
      scmdbuf += " T1.AlbProSta, T2.PrvNom AS AlbProPrvN, T1.AlbProHh FROM (TXPCALPRO T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.AlbProPrvI)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProAnul = ? or ? = 'T')");
      if ( (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_documentotransporteproveedor_1wwds_1_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_documentotransporteproveedor_1wwds_2_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_documentotransporteproveedor_1wwds_3_tfalbprosta_sels, "T1.AlbProSta IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Stocksquimicos_documentotransporteproveedor_1wwds_4_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_documentotransporteproveedor_1wwds_5_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_documentotransporteproveedor_1wwds_6_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) && ( ! (GXutil.strcmp("", AV80Stocksquimicos_documentotransporteproveedor_1wwds_7_tfalbproatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_documentotransporteproveedor_1wwds_8_tfalbproatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProATCU = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV82Stocksquimicos_documentotransporteproveedor_1wwds_9_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Stocksquimicos_documentotransporteproveedor_1wwds_10_tfalbprosys) )
      {
         addWhere(sWhereString, "(T1.AlbProSys >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Stocksquimicos_documentotransporteproveedor_1wwds_11_tfalbprosys_to) )
      {
         addWhere(sWhereString, "(T1.AlbProSys <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_documentotransporteproveedor_1wwds_12_tfalbprofm4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_documentotransporteproveedor_1wwds_13_tfalbprofm4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbProHh, 1, 1) || SUBSTR(T1.AlbProHh, 11, 1) || SUBSTR(T1.AlbProHh, 21, 1) || SUBSTR(T1.AlbProHh, 31, 1) = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV63AlbProID) )
      {
         addWhere(sWhereString, "(T1.AlbProID = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV64AlbProPrvID) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65AlbProDatefrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbProDateto)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
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
                  return conditional_P09SS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_P09SS3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 2 :
                  return conditional_P09SS4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 3 :
                  return conditional_P09SS5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SS4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SS5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(13);
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
            case 3 :
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
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               return;
      }
   }

}

