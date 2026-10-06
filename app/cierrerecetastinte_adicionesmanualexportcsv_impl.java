package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_adicionesmanualexportcsv_impl extends GXWebProcedure
{
   public cierrerecetastinte_adicionesmanualexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_AdicionesManualExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_AdicionesManualColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("CierreRecetasTinte_AdicionesManualColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"##" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV30FilterFullText ;
      AV79Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV42TFRecLinMAL ;
      AV80Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV43TFRecLinMAL_To ;
      AV81Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV44TFRecNumAny ;
      AV82Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV45TFRecNumAny_To ;
      AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV46TFPrdNum ;
      AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV68TFPrdNom ;
      AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV69TFPrdNom_Sel ;
      AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV48TFPrdCFin ;
      AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV49TFPrdCFin_To ;
      AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV58TFLanyUsr ;
      AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV59TFLanyUsr_Sel ;
      AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV60TFLanyFec ;
      AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV62TFLanyLote ;
      AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV63TFLanyLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV79Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV80Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV81Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV82Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV70Emprcod ,
                                           Integer.valueOf(AV71Barcod) ,
                                           Byte.valueOf(AV72Barcodreo) ,
                                           AV73Barcodpar ,
                                           Short.valueOf(AV74RecLinMAL) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV92Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094R2 */
      pr_default.execute(0, new Object[] {AV70Emprcod, Integer.valueOf(AV71Barcod), Byte.valueOf(AV72Barcodreo), AV73Barcodpar, Short.valueOf(AV74RecLinMAL), lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV79Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV80Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV81Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV82Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV92Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P094R2_A130BarCodPar[0] ;
         A132BarCodReo = P094R2_A132BarCodReo[0] ;
         A129BarCod = P094R2_A129BarCod[0] ;
         A396EmprCod = P094R2_A396EmprCod[0] ;
         A5807LanyLote = P094R2_A5807LanyLote[0] ;
         n5807LanyLote = P094R2_n5807LanyLote[0] ;
         A4579LanyFec = P094R2_A4579LanyFec[0] ;
         n4579LanyFec = P094R2_n4579LanyFec[0] ;
         A4578LanyUsr = P094R2_A4578LanyUsr[0] ;
         n4578LanyUsr = P094R2_n4578LanyUsr[0] ;
         A1378PrdCFin = P094R2_A1378PrdCFin[0] ;
         n1378PrdCFin = P094R2_n1378PrdCFin[0] ;
         A718PrdNom = P094R2_A718PrdNom[0] ;
         A719PrdNum = P094R2_A719PrdNum[0] ;
         A1377RecNumAny = P094R2_A1377RecNumAny[0] ;
         A2808RecLinMAL = P094R2_A2808RecLinMAL[0] ;
         A718PrdNom = P094R2_A718PrdNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2808RecLinMAL, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1377RecNumAny, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            cierrerecetastinte_adicionesmanualexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            cierrerecetastinte_adicionesmanualexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1378PrdCFin, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4578LanyUsr, ";", ","), GXv_char3) ;
            cierrerecetastinte_adicionesmanualexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4579LanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5807LanyLote, ";", ","), GXv_char3) ;
            cierrerecetastinte_adicionesmanualexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CierreRecetasTinte_AdicionesManualExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecLinMAL", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecNumAny", "", "##", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCFin", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LanyUsr", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LanyFec", "", "Fecha Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LanyLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CierreRecetasTinte_AdicionesManualColumnsSelector", GXv_char3) ;
      cierrerecetastinte_adicionesmanualexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAL") == 0 )
         {
            AV42TFRecLinMAL = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFRecLinMAL_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMANY") == 0 )
         {
            AV44TFRecNumAny = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFRecNumAny_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV46TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV47TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV68TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV69TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCFIN") == 0 )
         {
            AV48TFPrdCFin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdCFin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR") == 0 )
         {
            AV58TFLanyUsr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR_SEL") == 0 )
         {
            AV59TFLanyUsr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYFEC") == 0 )
         {
            AV60TFLanyFec = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE") == 0 )
         {
            AV62TFLanyLote = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE_SEL") == 0 )
         {
            AV63TFLanyLote_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      AV46TFPrdNum = "" ;
      AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = "" ;
      AV47TFPrdNum_Sel = "" ;
      AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      AV68TFPrdNom = "" ;
      AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = "" ;
      AV69TFPrdNom_Sel = "" ;
      AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = DecimalUtil.ZERO ;
      AV48TFPrdCFin = DecimalUtil.ZERO ;
      AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = DecimalUtil.ZERO ;
      AV49TFPrdCFin_To = DecimalUtil.ZERO ;
      AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      AV58TFLanyUsr = "" ;
      AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = "" ;
      AV59TFLanyUsr_Sel = "" ;
      AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec = GXutil.resetTime( GXutil.nullDate() );
      AV60TFLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV62TFLanyLote = "" ;
      AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = "" ;
      AV63TFLanyLote_Sel = "" ;
      scmdbuf = "" ;
      lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      lV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      lV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      lV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      lV92Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV70Emprcod = "" ;
      AV73Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P094R2_A130BarCodPar = new String[] {""} ;
      P094R2_A132BarCodReo = new byte[1] ;
      P094R2_A129BarCod = new int[1] ;
      P094R2_A396EmprCod = new String[] {""} ;
      P094R2_A5807LanyLote = new String[] {""} ;
      P094R2_n5807LanyLote = new boolean[] {false} ;
      P094R2_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094R2_n4579LanyFec = new boolean[] {false} ;
      P094R2_A4578LanyUsr = new String[] {""} ;
      P094R2_n4578LanyUsr = new boolean[] {false} ;
      P094R2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094R2_n1378PrdCFin = new boolean[] {false} ;
      P094R2_A718PrdNom = new String[] {""} ;
      P094R2_A719PrdNum = new String[] {""} ;
      P094R2_A1377RecNumAny = new byte[1] ;
      P094R2_A2808RecLinMAL = new short[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_adicionesmanualexportcsv__default(),
         new Object[] {
             new Object[] {
            P094R2_A130BarCodPar, P094R2_A132BarCodReo, P094R2_A129BarCod, P094R2_A396EmprCod, P094R2_A5807LanyLote, P094R2_n5807LanyLote, P094R2_A4579LanyFec, P094R2_n4579LanyFec, P094R2_A4578LanyUsr, P094R2_n4578LanyUsr,
            P094R2_A1378PrdCFin, P094R2_n1378PrdCFin, P094R2_A718PrdNom, P094R2_A719PrdNum, P094R2_A1377RecNumAny, P094R2_A2808RecLinMAL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1377RecNumAny ;
   private byte AV81Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ;
   private byte AV44TFRecNumAny ;
   private byte AV82Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ;
   private byte AV45TFRecNumAny_To ;
   private byte AV72Barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A2808RecLinMAL ;
   private short AV79Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ;
   private short AV42TFRecLinMAL ;
   private short AV80Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ;
   private short AV43TFRecLinMAL_To ;
   private short AV28OrderedBy ;
   private short AV74RecLinMAL ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV71Barcod ;
   private int A129BarCod ;
   private int AV94GXV1 ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ;
   private java.math.BigDecimal AV48TFPrdCFin ;
   private java.math.BigDecimal AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ;
   private java.math.BigDecimal AV49TFPrdCFin_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String AV46TFPrdNum ;
   private String AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ;
   private String AV47TFPrdNum_Sel ;
   private String AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String AV68TFPrdNom ;
   private String AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ;
   private String AV69TFPrdNom_Sel ;
   private String AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String AV58TFLanyUsr ;
   private String AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ;
   private String AV59TFLanyUsr_Sel ;
   private String AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV62TFLanyLote ;
   private String AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ;
   private String AV63TFLanyLote_Sel ;
   private String scmdbuf ;
   private String lV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String lV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String lV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String lV92Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV70Emprcod ;
   private String AV73Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec ;
   private java.util.Date AV60TFLanyFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n5807LanyLote ;
   private boolean n4579LanyFec ;
   private boolean n4578LanyUsr ;
   private boolean n1378PrdCFin ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P094R2_A130BarCodPar ;
   private byte[] P094R2_A132BarCodReo ;
   private int[] P094R2_A129BarCod ;
   private String[] P094R2_A396EmprCod ;
   private String[] P094R2_A5807LanyLote ;
   private boolean[] P094R2_n5807LanyLote ;
   private java.util.Date[] P094R2_A4579LanyFec ;
   private boolean[] P094R2_n4579LanyFec ;
   private String[] P094R2_A4578LanyUsr ;
   private boolean[] P094R2_n4578LanyUsr ;
   private java.math.BigDecimal[] P094R2_A1378PrdCFin ;
   private boolean[] P094R2_n1378PrdCFin ;
   private String[] P094R2_A718PrdNom ;
   private String[] P094R2_A719PrdNum ;
   private byte[] P094R2_A1377RecNumAny ;
   private short[] P094R2_A2808RecLinMAL ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class cierrerecetastinte_adicionesmanualexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV79Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV80Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV81Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV82Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV70Emprcod ,
                                          int AV71Barcod ,
                                          byte AV72Barcodreo ,
                                          String AV73Barcodpar ,
                                          short AV74RecLinMAL ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny, T1.RecLinMAL FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV78Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV79Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV80Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV81Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV82Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV83Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV91Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV92Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecNumAny" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecNumAny DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMAL" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMAL DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCFin" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCFin DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyUsr" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyUsr DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyFec" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyLote" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyLote DESC" ;
      }
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
                  return conditional_P094R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
      }
   }

}

