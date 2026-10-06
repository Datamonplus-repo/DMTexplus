package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_xml_anulacion extends GXProcedure
{
   public devoluciontejido_xml_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_xml_anulacion.class ), "" );
   }

   public devoluciontejido_xml_anulacion( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              String[] aP2 ,
                              String[] aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      devoluciontejido_xml_anulacion.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      devoluciontejido_xml_anulacion.this.AV27Emprcod = aP0[0];
      this.aP0 = aP0;
      devoluciontejido_xml_anulacion.this.AV9AlbProcod = aP1[0];
      this.aP1 = aP1;
      devoluciontejido_xml_anulacion.this.AV57pathIN = aP2[0];
      this.aP2 = aP2;
      devoluciontejido_xml_anulacion.this.AV34Fichero = aP3[0];
      this.aP3 = aP3;
      devoluciontejido_xml_anulacion.this.aP4 = aP4;
      devoluciontejido_xml_anulacion.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV42ok = false ;
      GXt_int1 = AV41NumDoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      devoluciontejido_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV41NumDoc = GXt_int1 ;
      GXt_int1 = AV44siatcud ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      devoluciontejido_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV44siatcud = GXt_int1 ;
      GXt_int3 = AV46valorsiatcud ;
      GXv_char4[0] = AV27Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      devoluciontejido_xml_anulacion.this.AV27Emprcod = GXv_char4[0] ;
      devoluciontejido_xml_anulacion.this.GXt_int3 = GXv_int6[0] ;
      AV46valorsiatcud = (byte)(GXt_int3) ;
      /* Using cursor P0AJC2 */
      pr_default.execute(0, new Object[] {AV27Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AJC2_A396EmprCod[0] ;
         A395EmprCif = P0AJC2_A395EmprCif[0] ;
         n395EmprCif = P0AJC2_n395EmprCif[0] ;
         A407EmprNom = P0AJC2_A407EmprNom[0] ;
         n407EmprNom = P0AJC2_n407EmprNom[0] ;
         A404EmprDir = P0AJC2_A404EmprDir[0] ;
         n404EmprDir = P0AJC2_n404EmprDir[0] ;
         A408EmprPob = P0AJC2_A408EmprPob[0] ;
         n408EmprPob = P0AJC2_n408EmprPob[0] ;
         A403EmprCpo = P0AJC2_A403EmprCpo[0] ;
         n403EmprCpo = P0AJC2_n403EmprCpo[0] ;
         AV26Emprcif = A395EmprCif ;
         AV30EmprNom = A407EmprNom ;
         AV29EmprDir = A404EmprDir ;
         AV31EmprPob = A408EmprPob ;
         AV28Emprcp = A403EmprCpo ;
         AV21Cp4 = GXutil.substring( AV28Emprcp, 1, 4) ;
         AV20Cp3 = GXutil.substring( AV28Emprcp, 5, 3) ;
         AV22Cp8 = AV21Cp4 + "-" + AV20Cp3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV60path += GXutil.trim( AV57pathIN) + "\\" + GXutil.trim( AV34Fichero) + httpContext.getMessage( ".xml", "") ;
      AV36filexml.openURL(AV60path);
      if ( AV36filexml.getErrCode() > 0 )
      {
         AV59Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV59Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV36filexml.getErrCode(), 10, 2)) );
         AV59Message.setgxTv_SdtMessages_Message_Description( AV36filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV59Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV58Messages.add(AV59Message, 0);
      }
      else
      {
         AV12Body = httpContext.getMessage( "S:Body", "") ;
         AV36filexml.writeStartElement(AV12Body);
         AV12Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV36filexml.writeNSStartElement(AV12Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         /* Using cursor P0AJC3 */
         pr_default.execute(1, new Object[] {AV27Emprcod, Integer.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11669DevCruId = P0AJC3_A11669DevCruId[0] ;
            A396EmprCod = P0AJC3_A396EmprCod[0] ;
            A252CliCod = P0AJC3_A252CliCod[0] ;
            A13984DevCruSerA = P0AJC3_A13984DevCruSerA[0] ;
            A13985DevCruTipA = P0AJC3_A13985DevCruTipA[0] ;
            A13983DevCruATCU = P0AJC3_A13983DevCruATCU[0] ;
            A11680DevCruAtId = P0AJC3_A11680DevCruAtId[0] ;
            A11673DevCruSal = P0AJC3_A11673DevCruSal[0] ;
            A11672DevCruMat = P0AJC3_A11672DevCruMat[0] ;
            AV13Clicod = A252CliCod ;
            /* Execute user subroutine: 'CLIENT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV12Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV36filexml.writeElement(AV12Body, GXutil.trim( AV26Emprcif));
            AV12Body = httpContext.getMessage( "CompanyName", "") ;
            AV36filexml.writeElement(AV12Body, GXutil.trim( AV30EmprNom));
            AV36filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV29EmprDir));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV31EmprPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV22Cp8));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV24Doc = "6" + GXutil.padl( GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0)), (short)(8), "0") ;
            if ( ( AV44siatcud == 1 ) && ( AV46valorsiatcud == 1 ) )
            {
               AV25documentnumber = GXutil.trim( A13985DevCruTipA) + " " + GXutil.trim( A13984DevCruSerA) + "/" + GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0)) ;
               AV36filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV25documentnumber));
            }
            else
            {
               if ( AV41NumDoc == 0 )
               {
                  AV36filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0)));
               }
               else
               {
                  AV36filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV24Doc));
               }
            }
            AV18codValidacaoSerie = A13983DevCruATCU ;
            AV10atcud = ((GXutil.strcmp("", AV18codValidacaoSerie)==0) ? "" : GXutil.trim( AV18codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( AV9AlbProcod, 8, 0))) ;
            AV36filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV10atcud));
            AV36filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( A11680DevCruAtId));
            AV36filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "A", ""));
            AV47VarAux = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV37HhSys = GXutil.substring( AV47VarAux, 12, 8) ;
            AV33FecSys = localUtil.ctod( GXutil.substring( AV47VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV23DateAux = GXutil.trim( GXutil.str( GXutil.year( AV33FecSys), 10, 0)) ;
            if ( GXutil.month( AV33FecSys) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV33FecSys), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV33FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV33FecSys) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV33FecSys), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV33FecSys), 10, 0)) ;
            }
            AV12Body = AV23DateAux ;
            AV36filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV12Body));
            AV36filexml.writeElement(httpContext.getMessage( "MovementType", ""), httpContext.getMessage( "GD", ""));
            AV36filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV15CliNif));
            AV36filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV14CliDom));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV17CliPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV19Cp));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV36filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV14CliDom));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV17CliPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV19Cp));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV36filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV36filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV29EmprDir));
            AV36filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV31EmprPob));
            AV36filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV22Cp8));
            AV36filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV36filexml.writeEndElement();
            AV47VarAux = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV32FecHorSal = localUtil.ctot( AV47VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV48VarAux0 = AV32FecHorSal ;
            AV47VarAux = localUtil.ttoc( AV48VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV37HhSys = GXutil.substring( AV47VarAux, 12, 8) ;
            AV33FecSys = localUtil.ctod( GXutil.substring( AV47VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV23DateAux = GXutil.trim( GXutil.str( GXutil.year( AV33FecSys), 10, 0)) ;
            if ( GXutil.month( AV33FecSys) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV33FecSys), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV33FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV33FecSys) < 10 )
            {
               AV23DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV33FecSys), 10, 0)) ;
            }
            else
            {
               AV23DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV33FecSys), 10, 0)) ;
            }
            AV12Body = AV23DateAux + httpContext.getMessage( "T", "") + AV37HhSys ;
            AV36filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV12Body));
            AV12Body = A11672DevCruMat ;
            if ( GXutil.strcmp(A11672DevCruMat, " ") == 0 )
            {
               AV12Body = "0" ;
            }
            AV36filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV12Body));
            /* Using cursor P0AJC4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3613AlbRefDsc = P0AJC4_A3613AlbRefDsc[0] ;
               A45AlbRef = P0AJC4_A45AlbRef[0] ;
               A11683DevCruUnd = P0AJC4_A11683DevCruUnd[0] ;
               A56AlbRUni = P0AJC4_A56AlbRUni[0] ;
               A44AlbRecCod = P0AJC4_A44AlbRecCod[0] ;
               A3613AlbRefDsc = P0AJC4_A3613AlbRefDsc[0] ;
               A45AlbRef = P0AJC4_A45AlbRef[0] ;
               A56AlbRUni = P0AJC4_A56AlbRUni[0] ;
               AV36filexml.writeStartElement(httpContext.getMessage( "Line", ""));
               AV43Pd = GXutil.trim( A45AlbRef) + "-" + GXutil.trim( A3613AlbRefDsc) ;
               AV36filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV43Pd));
               AV49VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A11683DevCruUnd, 9, 2)), (short)(9), " ") ;
               AV50Vconv = GXutil.substring( AV49VarKgs, 1, 6) + "." + GXutil.substring( AV49VarKgs, 8, 9) ;
               AV40Num9 = CommonUtil.decimalVal( AV50Vconv, ".") ;
               AV36filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV49VarKgs));
               AV45Un = httpContext.getMessage( "KG", "") ;
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
               {
                  AV45Un = httpContext.getMessage( "MT", "") ;
               }
               AV36filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), GXutil.trim( AV45Un));
               AV36filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
               AV36filexml.writeEndElement();
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV36filexml.writeEndElement();
         AV36filexml.writeEndElement();
         AV36filexml.close();
         AV42ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENT' Routine */
      returnInSub = false ;
      AV16CliNom = " " ;
      AV14CliDom = " " ;
      AV17CliPob = " " ;
      AV19Cp = " " ;
      AV15CliNif = " " ;
      /* Using cursor P0AJC5 */
      pr_default.execute(3, new Object[] {AV27Emprcod, Integer.valueOf(AV13Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P0AJC5_A252CliCod[0] ;
         A396EmprCod = P0AJC5_A396EmprCod[0] ;
         A279CliNom = P0AJC5_A279CliNom[0] ;
         A260CliDom = P0AJC5_A260CliDom[0] ;
         A295CliPob = P0AJC5_A295CliPob[0] ;
         A4828CliCp2 = P0AJC5_A4828CliCp2[0] ;
         A256CliCp = P0AJC5_A256CliCp[0] ;
         A278CliNif = P0AJC5_A278CliNif[0] ;
         AV16CliNom = A279CliNom ;
         AV14CliDom = A260CliDom ;
         AV17CliPob = A295CliPob ;
         AV19Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV15CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = devoluciontejido_xml_anulacion.this.AV27Emprcod;
      this.aP1[0] = devoluciontejido_xml_anulacion.this.AV9AlbProcod;
      this.aP2[0] = devoluciontejido_xml_anulacion.this.AV57pathIN;
      this.aP3[0] = devoluciontejido_xml_anulacion.this.AV34Fichero;
      this.aP4[0] = devoluciontejido_xml_anulacion.this.AV58Messages;
      this.aP5[0] = devoluciontejido_xml_anulacion.this.AV42ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV58Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P0AJC2_A396EmprCod = new String[] {""} ;
      P0AJC2_A395EmprCif = new String[] {""} ;
      P0AJC2_n395EmprCif = new boolean[] {false} ;
      P0AJC2_A407EmprNom = new String[] {""} ;
      P0AJC2_n407EmprNom = new boolean[] {false} ;
      P0AJC2_A404EmprDir = new String[] {""} ;
      P0AJC2_n404EmprDir = new boolean[] {false} ;
      P0AJC2_A408EmprPob = new String[] {""} ;
      P0AJC2_n408EmprPob = new boolean[] {false} ;
      P0AJC2_A403EmprCpo = new String[] {""} ;
      P0AJC2_n403EmprCpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      AV26Emprcif = "" ;
      AV30EmprNom = "" ;
      AV29EmprDir = "" ;
      AV31EmprPob = "" ;
      AV28Emprcp = "" ;
      AV21Cp4 = "" ;
      AV20Cp3 = "" ;
      AV22Cp8 = "" ;
      AV60path = "" ;
      AV36filexml = new com.genexus.xml.XMLWriter();
      AV59Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV12Body = "" ;
      P0AJC3_A11669DevCruId = new int[1] ;
      P0AJC3_A396EmprCod = new String[] {""} ;
      P0AJC3_A252CliCod = new int[1] ;
      P0AJC3_A13984DevCruSerA = new String[] {""} ;
      P0AJC3_A13985DevCruTipA = new String[] {""} ;
      P0AJC3_A13983DevCruATCU = new String[] {""} ;
      P0AJC3_A11680DevCruAtId = new String[] {""} ;
      P0AJC3_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJC3_A11672DevCruMat = new String[] {""} ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      A13983DevCruATCU = "" ;
      A11680DevCruAtId = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11672DevCruMat = "" ;
      AV24Doc = "" ;
      AV25documentnumber = "" ;
      AV18codValidacaoSerie = "" ;
      AV10atcud = "" ;
      AV47VarAux = "" ;
      AV37HhSys = "" ;
      AV33FecSys = GXutil.nullDate() ;
      AV23DateAux = "" ;
      AV15CliNif = "" ;
      AV14CliDom = "" ;
      AV17CliPob = "" ;
      AV19Cp = "" ;
      AV32FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV48VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      P0AJC4_A396EmprCod = new String[] {""} ;
      P0AJC4_A11669DevCruId = new int[1] ;
      P0AJC4_A3613AlbRefDsc = new String[] {""} ;
      P0AJC4_A45AlbRef = new String[] {""} ;
      P0AJC4_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJC4_A56AlbRUni = new String[] {""} ;
      P0AJC4_A44AlbRecCod = new int[1] ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      AV43Pd = "" ;
      AV49VarKgs = "" ;
      AV50Vconv = "" ;
      AV40Num9 = DecimalUtil.ZERO ;
      AV45Un = "" ;
      AV16CliNom = "" ;
      P0AJC5_A252CliCod = new int[1] ;
      P0AJC5_A396EmprCod = new String[] {""} ;
      P0AJC5_A279CliNom = new String[] {""} ;
      P0AJC5_A260CliDom = new String[] {""} ;
      P0AJC5_A295CliPob = new String[] {""} ;
      P0AJC5_A4828CliCp2 = new String[] {""} ;
      P0AJC5_A256CliCp = new String[] {""} ;
      P0AJC5_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_xml_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AJC2_A396EmprCod, P0AJC2_A395EmprCif, P0AJC2_n395EmprCif, P0AJC2_A407EmprNom, P0AJC2_n407EmprNom, P0AJC2_A404EmprDir, P0AJC2_n404EmprDir, P0AJC2_A408EmprPob, P0AJC2_n408EmprPob, P0AJC2_A403EmprCpo,
            P0AJC2_n403EmprCpo
            }
            , new Object[] {
            P0AJC3_A11669DevCruId, P0AJC3_A396EmprCod, P0AJC3_A252CliCod, P0AJC3_A13984DevCruSerA, P0AJC3_A13985DevCruTipA, P0AJC3_A13983DevCruATCU, P0AJC3_A11680DevCruAtId, P0AJC3_A11673DevCruSal, P0AJC3_A11672DevCruMat
            }
            , new Object[] {
            P0AJC4_A396EmprCod, P0AJC4_A11669DevCruId, P0AJC4_A3613AlbRefDsc, P0AJC4_A45AlbRef, P0AJC4_A11683DevCruUnd, P0AJC4_A56AlbRUni, P0AJC4_A44AlbRecCod
            }
            , new Object[] {
            P0AJC5_A252CliCod, P0AJC5_A396EmprCod, P0AJC5_A279CliNom, P0AJC5_A260CliDom, P0AJC5_A295CliPob, P0AJC5_A4828CliCp2, P0AJC5_A256CliCp, P0AJC5_A278CliNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV41NumDoc ;
   private byte AV44siatcud ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV46valorsiatcud ;
   private short Gx_err ;
   private int AV9AlbProcod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV13Clicod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV40Num9 ;
   private String AV27Emprcod ;
   private String AV57pathIN ;
   private String AV34Fichero ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String AV26Emprcif ;
   private String AV30EmprNom ;
   private String AV29EmprDir ;
   private String AV31EmprPob ;
   private String AV28Emprcp ;
   private String AV21Cp4 ;
   private String AV20Cp3 ;
   private String AV22Cp8 ;
   private String AV12Body ;
   private String A13984DevCruSerA ;
   private String A13985DevCruTipA ;
   private String A13983DevCruATCU ;
   private String A11680DevCruAtId ;
   private String A11672DevCruMat ;
   private String AV24Doc ;
   private String AV18codValidacaoSerie ;
   private String AV47VarAux ;
   private String AV37HhSys ;
   private String AV23DateAux ;
   private String AV15CliNif ;
   private String AV14CliDom ;
   private String AV17CliPob ;
   private String AV19Cp ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String AV43Pd ;
   private String AV49VarKgs ;
   private String AV50Vconv ;
   private String AV45Un ;
   private String AV16CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV32FecHorSal ;
   private java.util.Date AV48VarAux0 ;
   private java.util.Date AV33FecSys ;
   private boolean AV42ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean returnInSub ;
   private String AV60path ;
   private String AV25documentnumber ;
   private String AV10atcud ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJC2_A396EmprCod ;
   private String[] P0AJC2_A395EmprCif ;
   private boolean[] P0AJC2_n395EmprCif ;
   private String[] P0AJC2_A407EmprNom ;
   private boolean[] P0AJC2_n407EmprNom ;
   private String[] P0AJC2_A404EmprDir ;
   private boolean[] P0AJC2_n404EmprDir ;
   private String[] P0AJC2_A408EmprPob ;
   private boolean[] P0AJC2_n408EmprPob ;
   private String[] P0AJC2_A403EmprCpo ;
   private boolean[] P0AJC2_n403EmprCpo ;
   private int[] P0AJC3_A11669DevCruId ;
   private String[] P0AJC3_A396EmprCod ;
   private int[] P0AJC3_A252CliCod ;
   private String[] P0AJC3_A13984DevCruSerA ;
   private String[] P0AJC3_A13985DevCruTipA ;
   private String[] P0AJC3_A13983DevCruATCU ;
   private String[] P0AJC3_A11680DevCruAtId ;
   private java.util.Date[] P0AJC3_A11673DevCruSal ;
   private String[] P0AJC3_A11672DevCruMat ;
   private String[] P0AJC4_A396EmprCod ;
   private int[] P0AJC4_A11669DevCruId ;
   private String[] P0AJC4_A3613AlbRefDsc ;
   private String[] P0AJC4_A45AlbRef ;
   private java.math.BigDecimal[] P0AJC4_A11683DevCruUnd ;
   private String[] P0AJC4_A56AlbRUni ;
   private int[] P0AJC4_A44AlbRecCod ;
   private int[] P0AJC5_A252CliCod ;
   private String[] P0AJC5_A396EmprCod ;
   private String[] P0AJC5_A279CliNom ;
   private String[] P0AJC5_A260CliDom ;
   private String[] P0AJC5_A295CliPob ;
   private String[] P0AJC5_A4828CliCp2 ;
   private String[] P0AJC5_A256CliCp ;
   private String[] P0AJC5_A278CliNif ;
   private com.genexus.xml.XMLWriter AV36filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV58Messages ;
   private com.genexus.SdtMessages_Message AV59Message ;
}

final  class devoluciontejido_xml_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJC2", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJC3", "SELECT DevCruId, EmprCod, CliCod, DevCruSerA, DevCruTipA, DevCruATCU, DevCruAtId, DevCruSal, DevCruMat FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJC4", "SELECT T1.EmprCod, T1.DevCruId, T2.AlbRefDsc, T2.AlbRef, T1.DevCruUnd, T2.AlbRUni, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJC5", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

