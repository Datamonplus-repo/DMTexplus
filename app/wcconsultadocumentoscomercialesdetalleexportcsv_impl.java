package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesdetalleexportcsv_impl extends GXWebProcedure
{
   public wcconsultadocumentoscomercialesdetalleexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaDocumentosComercialesDetalleExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDocumentosComercialesDetalleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCConsultaDocumentosComercialesDetalleColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N/Ref", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "V/Doc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV30FilterFullText ;
      AV80Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV56TFAlbComLin ;
      AV81Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV57TFAlbComLin_To ;
      AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV58TFAlbComNRef ;
      AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV59TFAlbComNRef_Sel ;
      AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV60TFAlbComVDoc ;
      AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV61TFAlbComVDoc_Sel ;
      AV86Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV62TFAlbComPzas ;
      AV87Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV63TFAlbComPzas_To ;
      AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV64TFAlbComMts ;
      AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV65TFAlbComMts_To ;
      AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV66TFAlbComArt ;
      AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV67TFAlbComArt_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV68TFAlbComArtD ;
      AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV69TFAlbComArtD_Sel ;
      AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV70TFAlbComCol ;
      AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV71TFAlbComCol_Sel ;
      AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV72TFAlbComKgs ;
      AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV73TFAlbComKgs_To ;
      AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV74TFAlbComDsc ;
      AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV75TFAlbComDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV80Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV81Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV86Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV87Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV54Emprcod ,
                                           Integer.valueOf(AV55AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090U2 */
      pr_default.execute(0, new Object[] {AV54Emprcod, Integer.valueOf(AV55AlbComCod), lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV80Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV81Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV86Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV87Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P090U2_A14AlbComCod[0] ;
         A396EmprCod = P090U2_A396EmprCod[0] ;
         A15AlbComDsc = P090U2_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090U2_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090U2_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090U2_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090U2_A13320AlbComArt[0] ;
         A13318AlbComMts = P090U2_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090U2_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090U2_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090U2_A13315AlbComNRef[0] ;
         A20AlbComLin = P090U2_A20AlbComLin[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A20AlbComLin, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13315AlbComNRef, ";", ","), GXv_char3) ;
            wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13316AlbComVDoc, ";", ","), GXv_char3) ;
            wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13317AlbComPzas, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13318AlbComMts, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13320AlbComArt, ";", ","), GXv_char3) ;
            wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13321AlbComArtD, ";", ","), GXv_char3) ;
            wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13322AlbComCol, ";", ","), GXv_char3) ;
            wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13319AlbComKgs, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A15AlbComDsc, ";", ","), GXv_char3) ;
            wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCConsultaDocumentosComercialesDetalleExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComLin", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComNRef", "", "N/Ref", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComVDoc", "", "V/Doc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComPzas", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComMts", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComArt", "", "Codigo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComArtD", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComCol", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComKgs", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbComDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDocumentosComercialesDetalleColumnsSelector", GXv_char3) ;
      wcconsultadocumentoscomercialesdetalleexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV56TFAlbComLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFAlbComLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF") == 0 )
         {
            AV58TFAlbComNRef = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF_SEL") == 0 )
         {
            AV59TFAlbComNRef_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC") == 0 )
         {
            AV60TFAlbComVDoc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC_SEL") == 0 )
         {
            AV61TFAlbComVDoc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPZAS") == 0 )
         {
            AV62TFAlbComPzas = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFAlbComPzas_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMTS") == 0 )
         {
            AV64TFAlbComMts = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFAlbComMts_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART") == 0 )
         {
            AV66TFAlbComArt = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART_SEL") == 0 )
         {
            AV67TFAlbComArt_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD") == 0 )
         {
            AV68TFAlbComArtD = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD_SEL") == 0 )
         {
            AV69TFAlbComArtD_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL") == 0 )
         {
            AV70TFAlbComCol = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL_SEL") == 0 )
         {
            AV71TFAlbComCol_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMKGS") == 0 )
         {
            AV72TFAlbComKgs = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFAlbComKgs_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV74TFAlbComDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV75TFAlbComDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV54Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMCOD") == 0 )
         {
            AV55AlbComCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
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
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13320AlbComArt = "" ;
      A13321AlbComArtD = "" ;
      A13322AlbComCol = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      AV58TFAlbComNRef = "" ;
      AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = "" ;
      AV59TFAlbComNRef_Sel = "" ;
      AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      AV60TFAlbComVDoc = "" ;
      AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = "" ;
      AV61TFAlbComVDoc_Sel = "" ;
      AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = DecimalUtil.ZERO ;
      AV64TFAlbComMts = DecimalUtil.ZERO ;
      AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = DecimalUtil.ZERO ;
      AV65TFAlbComMts_To = DecimalUtil.ZERO ;
      AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      AV66TFAlbComArt = "" ;
      AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = "" ;
      AV67TFAlbComArt_Sel = "" ;
      AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      AV68TFAlbComArtD = "" ;
      AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = "" ;
      AV69TFAlbComArtD_Sel = "" ;
      AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      AV70TFAlbComCol = "" ;
      AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = "" ;
      AV71TFAlbComCol_Sel = "" ;
      AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = DecimalUtil.ZERO ;
      AV72TFAlbComKgs = DecimalUtil.ZERO ;
      AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = DecimalUtil.ZERO ;
      AV73TFAlbComKgs_To = DecimalUtil.ZERO ;
      AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV74TFAlbComDsc = "" ;
      AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = "" ;
      AV75TFAlbComDsc_Sel = "" ;
      scmdbuf = "" ;
      lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      lV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      lV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      lV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      lV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      lV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      lV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV54Emprcod = "" ;
      A396EmprCod = "" ;
      P090U2_A14AlbComCod = new int[1] ;
      P090U2_A396EmprCod = new String[] {""} ;
      P090U2_A15AlbComDsc = new String[] {""} ;
      P090U2_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090U2_A13322AlbComCol = new String[] {""} ;
      P090U2_A13321AlbComArtD = new String[] {""} ;
      P090U2_A13320AlbComArt = new String[] {""} ;
      P090U2_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090U2_A13317AlbComPzas = new int[1] ;
      P090U2_A13316AlbComVDoc = new String[] {""} ;
      P090U2_A13315AlbComNRef = new String[] {""} ;
      P090U2_A20AlbComLin = new short[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesdetalleexportcsv__default(),
         new Object[] {
             new Object[] {
            P090U2_A14AlbComCod, P090U2_A396EmprCod, P090U2_A15AlbComDsc, P090U2_A13319AlbComKgs, P090U2_A13322AlbComCol, P090U2_A13321AlbComArtD, P090U2_A13320AlbComArt, P090U2_A13318AlbComMts, P090U2_A13317AlbComPzas, P090U2_A13316AlbComVDoc,
            P090U2_A13315AlbComNRef, P090U2_A20AlbComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A20AlbComLin ;
   private short AV80Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ;
   private short AV56TFAlbComLin ;
   private short AV81Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ;
   private short AV57TFAlbComLin_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A13317AlbComPzas ;
   private int AV86Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ;
   private int AV62TFAlbComPzas ;
   private int AV87Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ;
   private int AV63TFAlbComPzas_To ;
   private int AV55AlbComCod ;
   private int A14AlbComCod ;
   private int AV100GXV1 ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ;
   private java.math.BigDecimal AV64TFAlbComMts ;
   private java.math.BigDecimal AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ;
   private java.math.BigDecimal AV65TFAlbComMts_To ;
   private java.math.BigDecimal AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ;
   private java.math.BigDecimal AV72TFAlbComKgs ;
   private java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ;
   private java.math.BigDecimal AV73TFAlbComKgs_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13315AlbComNRef ;
   private String A13316AlbComVDoc ;
   private String A13320AlbComArt ;
   private String A13321AlbComArtD ;
   private String A13322AlbComCol ;
   private String A15AlbComDsc ;
   private String AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String AV58TFAlbComNRef ;
   private String AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ;
   private String AV59TFAlbComNRef_Sel ;
   private String AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String AV60TFAlbComVDoc ;
   private String AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ;
   private String AV61TFAlbComVDoc_Sel ;
   private String AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String AV66TFAlbComArt ;
   private String AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ;
   private String AV67TFAlbComArt_Sel ;
   private String AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String AV68TFAlbComArtD ;
   private String AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ;
   private String AV69TFAlbComArtD_Sel ;
   private String AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String AV70TFAlbComCol ;
   private String AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ;
   private String AV71TFAlbComCol_Sel ;
   private String AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV74TFAlbComDsc ;
   private String AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ;
   private String AV75TFAlbComDsc_Sel ;
   private String scmdbuf ;
   private String lV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String lV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String lV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String lV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String lV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String lV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV54Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P090U2_A14AlbComCod ;
   private String[] P090U2_A396EmprCod ;
   private String[] P090U2_A15AlbComDsc ;
   private java.math.BigDecimal[] P090U2_A13319AlbComKgs ;
   private String[] P090U2_A13322AlbComCol ;
   private String[] P090U2_A13321AlbComArtD ;
   private String[] P090U2_A13320AlbComArt ;
   private java.math.BigDecimal[] P090U2_A13318AlbComMts ;
   private int[] P090U2_A13317AlbComPzas ;
   private String[] P090U2_A13316AlbComVDoc ;
   private String[] P090U2_A13315AlbComNRef ;
   private short[] P090U2_A20AlbComLin ;
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

final  class wcconsultadocumentoscomercialesdetalleexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV80Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV81Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV86Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV87Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV54Emprcod ,
                                          int AV55AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT AlbComCod, EmprCod, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV82Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV84Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComNRef" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComNRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComVDoc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComVDoc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComPzas" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComPzas DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComMts" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComMts DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComArt" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComArt DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComArtD" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComArtD DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComCol" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComKgs" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComKgs DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComDsc" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComDsc DESC" ;
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
                  return conditional_P090U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

