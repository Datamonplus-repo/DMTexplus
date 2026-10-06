package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajosexternosenviowwexportcsv_impl extends GXWebProcedure
{
   public trabajosexternosenviowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TrabajosExternosEnvioWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TrabajosExternosEnvioWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TrabajosExternosEnvioWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Manufacturador", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Manufacturador", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67Trabajosexternosenviowwds_1_filterfulltext = AV30FilterFullText ;
      AV68Trabajosexternosenviowwds_2_tfsalextalb = AV34TFSalExtAlb ;
      AV69Trabajosexternosenviowwds_3_tfsalextalb_to = AV35TFSalExtAlb_To ;
      AV70Trabajosexternosenviowwds_4_tfmannom = AV36TFManNom ;
      AV71Trabajosexternosenviowwds_5_tfmannom_sel = AV37TFManNom_Sel ;
      AV72Trabajosexternosenviowwds_6_tfmancod = AV38TFManCod ;
      AV73Trabajosexternosenviowwds_7_tfmancod_to = AV39TFManCod_To ;
      AV74Trabajosexternosenviowwds_8_tftrncod = AV40TFTrnCod ;
      AV75Trabajosexternosenviowwds_9_tftrncod_to = AV41TFTrnCod_To ;
      AV76Trabajosexternosenviowwds_10_tftrnnom = AV42TFTrnNom ;
      AV77Trabajosexternosenviowwds_11_tftrnnom_sel = AV43TFTrnNom_Sel ;
      AV78Trabajosexternosenviowwds_12_tfsalextfec = AV44TFSalExtFec ;
      AV79Trabajosexternosenviowwds_13_tfsalexthor = AV46TFSalExtHor ;
      AV80Trabajosexternosenviowwds_14_tfsalexthor_sel = AV47TFSalExtHor_Sel ;
      AV81Trabajosexternosenviowwds_15_tfsalsts = AV62TFSalSts ;
      AV82Trabajosexternosenviowwds_16_tfsalsts_sel = AV63TFSalSts_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV68Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV69Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV71Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV70Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV72Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV73Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV74Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV75Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV77Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV76Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV78Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV80Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV79Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV82Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV81Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV70Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV70Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV76Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV76Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV79Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV79Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV81Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV81Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09172 */
      pr_default.execute(0, new Object[] {lV67Trabajosexternosenviowwds_1_filterfulltext, lV67Trabajosexternosenviowwds_1_filterfulltext, lV67Trabajosexternosenviowwds_1_filterfulltext, lV67Trabajosexternosenviowwds_1_filterfulltext, lV67Trabajosexternosenviowwds_1_filterfulltext, lV67Trabajosexternosenviowwds_1_filterfulltext, lV67Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV68Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV69Trabajosexternosenviowwds_3_tfsalextalb_to), lV70Trabajosexternosenviowwds_4_tfmannom, AV71Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV72Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV73Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV74Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV75Trabajosexternosenviowwds_9_tftrncod_to), lV76Trabajosexternosenviowwds_10_tftrnnom, AV77Trabajosexternosenviowwds_11_tftrnnom_sel, AV78Trabajosexternosenviowwds_12_tfsalextfec, lV79Trabajosexternosenviowwds_13_tfsalexthor, AV80Trabajosexternosenviowwds_14_tfsalexthor_sel, lV81Trabajosexternosenviowwds_15_tfsalsts, AV82Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09172_A396EmprCod[0] ;
         A10080SalSts = P09172_A10080SalSts[0] ;
         A6396SalExtHor = P09172_A6396SalExtHor[0] ;
         A2256SalExtFec = P09172_A2256SalExtFec[0] ;
         A841TrnNom = P09172_A841TrnNom[0] ;
         n841TrnNom = P09172_n841TrnNom[0] ;
         A840TrnCod = P09172_A840TrnCod[0] ;
         n840TrnCod = P09172_n840TrnCod[0] ;
         A2248ManCod = P09172_A2248ManCod[0] ;
         A2249ManNom = P09172_A2249ManNom[0] ;
         n2249ManNom = P09172_n2249ManNom[0] ;
         A2253SalExtAlb = P09172_A2253SalExtAlb[0] ;
         A841TrnNom = P09172_A841TrnNom[0] ;
         n841TrnNom = P09172_n841TrnNom[0] ;
         A2249ManNom = P09172_A2249ManNom[0] ;
         n2249ManNom = P09172_n2249ManNom[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2253SalExtAlb, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2249ManNom, ";", ","), GXv_char3) ;
            trabajosexternosenviowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2248ManCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
            trabajosexternosenviowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A2256SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6396SalExtHor, ";", ","), GXv_char3) ;
            trabajosexternosenviowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A10080SalSts, ";", ","), GXv_char3) ;
            trabajosexternosenviowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TrabajosExternosEnvioWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SalExtAlb", "", "Nº Documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ManNom", "", "Manufacturador", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ManCod", "", "Codigo Manufacturador", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnCod", "", "Cod Transp", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SalExtFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SalExtHor", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SalSts", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TrabajosExternosEnvioWWColumnsSelector", GXv_char3) ;
      trabajosexternosenviowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TrabajosExternosEnvioWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternosEnvioWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TrabajosExternosEnvioWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTALB") == 0 )
         {
            AV34TFSalExtAlb = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFSalExtAlb_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV36TFManNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV37TFManNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV38TFManCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFManCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV40TFTrnCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFTrnCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV42TFTrnNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV43TFTrnNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTFEC") == 0 )
         {
            AV44TFSalExtFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR") == 0 )
         {
            AV46TFSalExtHor = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR_SEL") == 0 )
         {
            AV47TFSalExtHor_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS") == 0 )
         {
            AV62TFSalSts = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS_SEL") == 0 )
         {
            AV63TFSalSts_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
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
      A2249ManNom = "" ;
      A841TrnNom = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A10080SalSts = "" ;
      AV67Trabajosexternosenviowwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV70Trabajosexternosenviowwds_4_tfmannom = "" ;
      AV36TFManNom = "" ;
      AV71Trabajosexternosenviowwds_5_tfmannom_sel = "" ;
      AV37TFManNom_Sel = "" ;
      AV76Trabajosexternosenviowwds_10_tftrnnom = "" ;
      AV42TFTrnNom = "" ;
      AV77Trabajosexternosenviowwds_11_tftrnnom_sel = "" ;
      AV43TFTrnNom_Sel = "" ;
      AV78Trabajosexternosenviowwds_12_tfsalextfec = GXutil.nullDate() ;
      AV44TFSalExtFec = GXutil.nullDate() ;
      AV79Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      AV46TFSalExtHor = "" ;
      AV80Trabajosexternosenviowwds_14_tfsalexthor_sel = "" ;
      AV47TFSalExtHor_Sel = "" ;
      AV81Trabajosexternosenviowwds_15_tfsalsts = "" ;
      AV62TFSalSts = "" ;
      AV82Trabajosexternosenviowwds_16_tfsalsts_sel = "" ;
      AV63TFSalSts_Sel = "" ;
      scmdbuf = "" ;
      lV67Trabajosexternosenviowwds_1_filterfulltext = "" ;
      lV70Trabajosexternosenviowwds_4_tfmannom = "" ;
      lV76Trabajosexternosenviowwds_10_tftrnnom = "" ;
      lV79Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      lV81Trabajosexternosenviowwds_15_tfsalsts = "" ;
      P09172_A396EmprCod = new String[] {""} ;
      P09172_A10080SalSts = new String[] {""} ;
      P09172_A6396SalExtHor = new String[] {""} ;
      P09172_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09172_A841TrnNom = new String[] {""} ;
      P09172_n841TrnNom = new boolean[] {false} ;
      P09172_A840TrnCod = new short[1] ;
      P09172_n840TrnCod = new boolean[] {false} ;
      P09172_A2248ManCod = new short[1] ;
      P09172_A2249ManNom = new String[] {""} ;
      P09172_n2249ManNom = new boolean[] {false} ;
      P09172_A2253SalExtAlb = new int[1] ;
      A396EmprCod = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenviowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09172_A396EmprCod, P09172_A10080SalSts, P09172_A6396SalExtHor, P09172_A2256SalExtFec, P09172_A841TrnNom, P09172_n841TrnNom, P09172_A840TrnCod, P09172_n840TrnCod, P09172_A2248ManCod, P09172_A2249ManNom,
            P09172_n2249ManNom, P09172_A2253SalExtAlb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A2248ManCod ;
   private short A840TrnCod ;
   private short AV72Trabajosexternosenviowwds_6_tfmancod ;
   private short AV38TFManCod ;
   private short AV73Trabajosexternosenviowwds_7_tfmancod_to ;
   private short AV39TFManCod_To ;
   private short AV74Trabajosexternosenviowwds_8_tftrncod ;
   private short AV40TFTrnCod ;
   private short AV75Trabajosexternosenviowwds_9_tftrncod_to ;
   private short AV41TFTrnCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A2253SalExtAlb ;
   private int AV68Trabajosexternosenviowwds_2_tfsalextalb ;
   private int AV34TFSalExtAlb ;
   private int AV69Trabajosexternosenviowwds_3_tfsalextalb_to ;
   private int AV35TFSalExtAlb_To ;
   private int AV83GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A2249ManNom ;
   private String A841TrnNom ;
   private String A6396SalExtHor ;
   private String A10080SalSts ;
   private String AV70Trabajosexternosenviowwds_4_tfmannom ;
   private String AV36TFManNom ;
   private String AV71Trabajosexternosenviowwds_5_tfmannom_sel ;
   private String AV37TFManNom_Sel ;
   private String AV76Trabajosexternosenviowwds_10_tftrnnom ;
   private String AV42TFTrnNom ;
   private String AV77Trabajosexternosenviowwds_11_tftrnnom_sel ;
   private String AV43TFTrnNom_Sel ;
   private String AV79Trabajosexternosenviowwds_13_tfsalexthor ;
   private String AV46TFSalExtHor ;
   private String AV80Trabajosexternosenviowwds_14_tfsalexthor_sel ;
   private String AV47TFSalExtHor_Sel ;
   private String AV81Trabajosexternosenviowwds_15_tfsalsts ;
   private String AV62TFSalSts ;
   private String AV82Trabajosexternosenviowwds_16_tfsalsts_sel ;
   private String AV63TFSalSts_Sel ;
   private String scmdbuf ;
   private String lV70Trabajosexternosenviowwds_4_tfmannom ;
   private String lV76Trabajosexternosenviowwds_10_tftrnnom ;
   private String lV79Trabajosexternosenviowwds_13_tfsalexthor ;
   private String lV81Trabajosexternosenviowwds_15_tfsalsts ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date AV78Trabajosexternosenviowwds_12_tfsalextfec ;
   private java.util.Date AV44TFSalExtFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n2249ManNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV67Trabajosexternosenviowwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV67Trabajosexternosenviowwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09172_A396EmprCod ;
   private String[] P09172_A10080SalSts ;
   private String[] P09172_A6396SalExtHor ;
   private java.util.Date[] P09172_A2256SalExtFec ;
   private String[] P09172_A841TrnNom ;
   private boolean[] P09172_n841TrnNom ;
   private short[] P09172_A840TrnCod ;
   private boolean[] P09172_n840TrnCod ;
   private short[] P09172_A2248ManCod ;
   private String[] P09172_A2249ManNom ;
   private boolean[] P09172_n2249ManNom ;
   private int[] P09172_A2253SalExtAlb ;
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

final  class trabajosexternosenviowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09172( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV68Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV69Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV71Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV70Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV72Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV73Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV74Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV75Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV77Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV76Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV78Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV80Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV79Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV82Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV81Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalSts, T1.SalExtHor, T1.SalExtFec, T2.TrnNom, T1.TrnCod, T1.ManCod, T3.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = T1.EmprCod AND T3.ManCod = T1.ManCod)" ;
      if ( ! (GXutil.strcmp("", AV67Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T3.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV68Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV69Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV70Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ManNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV73Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV75Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtAlb" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtAlb DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ManNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ManNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtFec" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtHor" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtHor DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalSts" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalSts DESC" ;
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
                  return conditional_P09172(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09172", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
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
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

