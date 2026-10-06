package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entregasresumencliente_wcexportcsv_impl extends GXWebProcedure
{
   public entregasresumencliente_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      if ( 1 == 0 )
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
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
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S211 ();
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
      AV14Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "./PrivateTempStorage/" + "EntregasResumenCliente_WCExportCSV-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".csv" ;
      AV11TextFile.setSource( AV12Filename );
      AV11TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV11TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV15TextFileLine = "" ;
      if ( GXutil.strcmp(AV20Session.getValue("EntregasResumenCliente_WCColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV20Session.getValue("EntregasResumenCliente_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Total Qgs", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Total Mts", "") : "") ;
      AV15TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Total Pcas", "") : "") ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV48GXV1 = 1 ;
         while ( AV48GXV1 <= AV29SDTEntregasResumenClientes.size() )
         {
            AV10SDTEntregasResumenClientesItem = (app.SdtSDTEntregasResumenCliente)((app.SdtSDTEntregasResumenCliente)AV29SDTEntregasResumenClientes.elementAt(-1+AV48GXV1));
            AV15TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S161 ();
            if (returnInSub) return;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clicod(), 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               GXt_char2 = AV15TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clinom(), ";", ","), GXv_char3) ;
               entregasresumencliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV15TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV30TotKgs, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV31TotMts, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV32TotPzs, 6, 0) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S171 ();
            if (returnInSub) return;
            if ( GXutil.len( AV15TextFileLine) > 0 )
            {
               AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
            }
            AV48GXV1 = (int)(AV48GXV1+1) ;
         }
      }
      if ( AV29SDTEntregasResumenClientes.fromJSonString(AV36WebSession.getValue("SDTEntregasResumenClientes"), AV37Messages) )
      {
         AV49GXV2 = 1 ;
         while ( AV49GXV2 <= AV29SDTEntregasResumenClientes.size() )
         {
            AV10SDTEntregasResumenClientesItem = (app.SdtSDTEntregasResumenCliente)((app.SdtSDTEntregasResumenCliente)AV29SDTEntregasResumenClientes.elementAt(-1+AV49GXV2));
            AV15TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S161 ();
            if (returnInSub) return;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clicod(), 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               GXt_char2 = AV15TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Clinom(), ";", ","), GXv_char3) ;
               entregasresumencliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV15TextFileLine += GXt_char2 ;
            }
            AV30TotKgs = ((app.SdtSDTEntregasResumenCliente_Level1Item)AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs() ;
            AV31TotMts = ((app.SdtSDTEntregasResumenCliente_Level1Item)AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts() ;
            AV32TotPzs = ((app.SdtSDTEntregasResumenCliente_Level1Item)AV10SDTEntregasResumenClientesItem.getgxTv_SdtSDTEntregasResumenCliente_Level1().elementAt(-1+1)).getgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs() ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV30TotKgs, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV31TotMts, 10, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV15TextFileLine += ";" ;
               AV15TextFileLine += GXutil.str( AV32TotPzs, 6, 0) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S171 ();
            if (returnInSub) return;
            if ( GXutil.len( AV15TextFileLine) > 0 )
            {
               AV11TextFile.writeLine(GXutil.substring( AV15TextFileLine, 2, -1));
            }
            AV49GXV2 = (int)(AV49GXV2+1) ;
         }
      }
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV11TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV28HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV28HttpResponse.addHeader("Content-Disposition", "attachment;filename=EntregasResumenCliente_WCExportCSV.csv");
         }
         AV28HttpResponse.addFile(AV11TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11TextFile.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV13ErrorMessage = AV11TextFile.getErrDescription() ;
         AV11TextFile.close();
         AV28HttpResponse.addString(AV13ErrorMessage);
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
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SDTEntregasResumenClientes__Clicod", "", "Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "SDTEntregasResumenClientes__CliNom", "", "Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TotKgs", "", "Total Qgs", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TotMts", "", "Total Mts", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TotPzs", "", "Total Pcas", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV21UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "EntregasResumenCliente_WCColumnsSelector", GXv_char3) ;
      entregasresumencliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV21UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("EntregasResumenCliente_WCGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntregasResumenCliente_WCGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV20Session.getValue("EntregasResumenCliente_WCGridState"), null, null);
      }
   }

   public void S161( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S171( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S201( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV40Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      entregasresumencliente_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV40Station = GXt_char2 ;
      GXv_char3[0] = AV41EmprCod ;
      GXv_char6[0] = AV42EmprNom ;
      GXv_char7[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char3, GXv_char6, GXv_char7) ;
      entregasresumencliente_wcexportcsv_impl.this.AV41EmprCod = GXv_char3[0] ;
      entregasresumencliente_wcexportcsv_impl.this.AV42EmprNom = GXv_char6[0] ;
      entregasresumencliente_wcexportcsv_impl.this.AV43UsurCod = GXv_char7[0] ;
      AV44ALbProfch_char = GXutil.upper( GXutil.trim( AV36WebSession.getValue("InformeAlbaranesProduccionWC_ALbProfch"))) ;
      AV36WebSession.remove("InformeAlbaranesProduccionWC_ALbProfch");
      AV45ALbProfch_to_char = GXutil.upper( GXutil.trim( AV36WebSession.getValue("InformeAlbaranesProduccionWC_ALbProfch_to"))) ;
      AV36WebSession.remove("InformeAlbaranesProduccionWC_ALbProfch_to");
   }

   public void S211( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV15TextFileLine += AV42EmprNom + " " + "(" + AV50Pgmdesc + ")" + " " ;
      AV15TextFileLine += httpContext.getMessage( "Fecha Inicial: ", "") + " " + AV44ALbProfch_char + " " ;
      AV15TextFileLine += httpContext.getMessage( "Fecha Final: ", "") + " " + AV45ALbProfch_to_char ;
      if ( GXutil.len( AV15TextFileLine) > 0 )
      {
         AV11TextFile.writeLine(AV15TextFileLine);
         AV11TextFile.writeLine(" ");
      }
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
      AV12Filename = "" ;
      AV11TextFile = new com.genexus.util.GXFile();
      AV15TextFileLine = "" ;
      AV20Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29SDTEntregasResumenClientes = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      AV10SDTEntregasResumenClientesItem = new app.SdtSDTEntregasResumenCliente(remoteHandle, context);
      AV30TotKgs = DecimalUtil.ZERO ;
      AV31TotMts = DecimalUtil.ZERO ;
      AV36WebSession = httpContext.getWebSession();
      AV37Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV28HttpResponse = httpContext.getHttpResponse();
      AV13ErrorMessage = "" ;
      AV21UserCustomValue = "" ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40Station = "" ;
      GXt_char2 = "" ;
      AV41EmprCod = "" ;
      GXv_char3 = new String[1] ;
      AV42EmprNom = "" ;
      GXv_char6 = new String[1] ;
      AV43UsurCod = "" ;
      GXv_char7 = new String[1] ;
      AV44ALbProfch_char = "" ;
      AV45ALbProfch_to_char = "" ;
      AV50Pgmdesc = "" ;
      AV50Pgmdesc = httpContext.getMessage( "Entregas Resumen Cliente_WCExport CSV", "") ;
      /* GeneXus formulas. */
      AV50Pgmdesc = httpContext.getMessage( "Entregas Resumen Cliente_WCExport CSV", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV14Random ;
   private int AV48GXV1 ;
   private int AV32TotPzs ;
   private int AV49GXV2 ;
   private java.math.BigDecimal AV30TotKgs ;
   private java.math.BigDecimal AV31TotMts ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV40Station ;
   private String GXt_char2 ;
   private String AV41EmprCod ;
   private String GXv_char3[] ;
   private String AV42EmprNom ;
   private String GXv_char6[] ;
   private String AV43UsurCod ;
   private String GXv_char7[] ;
   private String AV44ALbProfch_char ;
   private String AV45ALbProfch_to_char ;
   private String AV50Pgmdesc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV15TextFileLine ;
   private String AV19ColumnsSelectorXML ;
   private String AV21UserCustomValue ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.util.GXFile AV11TextFile ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> AV29SDTEntregasResumenClientes ;
   private com.genexus.internet.HttpResponse AV28HttpResponse ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV37Messages ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.SdtSDTEntregasResumenCliente AV10SDTEntregasResumenClientesItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
}

