package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdcxml extends GXProcedure
{
   public pdcxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdcxml.class ), "" );
   }

   public pdcxml( int remoteHandle ,
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
      pdcxml.this.aP5 = new boolean[] {false};
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
      pdcxml.this.AV46Emprcod = aP0[0];
      this.aP0 = aP0;
      pdcxml.this.AV37AlbProcod = aP1[0];
      this.aP1 = aP1;
      pdcxml.this.AV87pathIN = aP2[0];
      this.aP2 = aP2;
      pdcxml.this.AV40Fichero = aP3[0];
      this.aP3 = aP3;
      pdcxml.this.aP4 = aP4;
      pdcxml.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV85ok = false ;
      GXt_int1 = AV79NumDoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      pdcxml.this.GXt_int1 = GXv_int2[0] ;
      AV79NumDoc = GXt_int1 ;
      GXt_int1 = AV82siatcud ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      pdcxml.this.GXt_int1 = GXv_int2[0] ;
      AV82siatcud = GXt_int1 ;
      GXt_int3 = AV84valorsiatcud ;
      GXv_char4[0] = AV46Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pdcxml.this.AV46Emprcod = GXv_char4[0] ;
      pdcxml.this.GXt_int3 = GXv_int6[0] ;
      AV84valorsiatcud = (byte)(GXt_int3) ;
      /* Using cursor P04ZO2 */
      pr_default.execute(0, new Object[] {AV46Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04ZO2_A396EmprCod[0] ;
         A395EmprCif = P04ZO2_A395EmprCif[0] ;
         n395EmprCif = P04ZO2_n395EmprCif[0] ;
         A407EmprNom = P04ZO2_A407EmprNom[0] ;
         n407EmprNom = P04ZO2_n407EmprNom[0] ;
         A404EmprDir = P04ZO2_A404EmprDir[0] ;
         n404EmprDir = P04ZO2_n404EmprDir[0] ;
         A408EmprPob = P04ZO2_A408EmprPob[0] ;
         n408EmprPob = P04ZO2_n408EmprPob[0] ;
         A403EmprCpo = P04ZO2_A403EmprCpo[0] ;
         n403EmprCpo = P04ZO2_n403EmprCpo[0] ;
         AV47Emprcif = A395EmprCif ;
         AV54EmprNom = A407EmprNom ;
         AV55EmprDir = A404EmprDir ;
         AV56EmprPob = A408EmprPob ;
         AV57Emprcp = A403EmprCpo ;
         AV73Cp4 = GXutil.substring( AV57Emprcp, 1, 4) ;
         AV74Cp3 = GXutil.substring( AV57Emprcp, 5, 3) ;
         AV75Cp8 = AV73Cp4 + "-" + AV74Cp3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV95path += GXutil.trim( AV87pathIN) + "\\" + GXutil.trim( AV40Fichero) + httpContext.getMessage( ".xml", "") ;
      AV39filexml.openURL(AV95path);
      if ( AV39filexml.getErrCode() > 0 )
      {
         AV94Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV94Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV39filexml.getErrCode(), 10, 2)) );
         AV94Message.setgxTv_SdtMessages_Message_Description( AV39filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV94Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV88Messages.add(AV94Message, 0);
      }
      else
      {
         AV41Body = httpContext.getMessage( "S:Body", "") ;
         AV39filexml.writeStartElement(AV41Body);
         AV41Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV39filexml.writeNSStartElement(AV41Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         /* Using cursor P04ZO3 */
         pr_default.execute(1, new Object[] {AV46Emprcod, Integer.valueOf(AV37AlbProcod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A11669DevCruId = P04ZO3_A11669DevCruId[0] ;
            A396EmprCod = P04ZO3_A396EmprCod[0] ;
            A252CliCod = P04ZO3_A252CliCod[0] ;
            A13984DevCruSerA = P04ZO3_A13984DevCruSerA[0] ;
            A13985DevCruTipA = P04ZO3_A13985DevCruTipA[0] ;
            A13983DevCruATCU = P04ZO3_A13983DevCruATCU[0] ;
            A11673DevCruSal = P04ZO3_A11673DevCruSal[0] ;
            A11672DevCruMat = P04ZO3_A11672DevCruMat[0] ;
            AV50Clicod = A252CliCod ;
            /* Execute user subroutine: 'CLIENT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV41Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV39filexml.writeElement(AV41Body, GXutil.trim( AV47Emprcif));
            AV41Body = httpContext.getMessage( "CompanyName", "") ;
            AV39filexml.writeElement(AV41Body, GXutil.trim( AV54EmprNom));
            AV39filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV55EmprDir));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV56EmprPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV75Cp8));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV78Doc = "6" + GXutil.padl( GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0)), (short)(8), "0") ;
            if ( ( AV82siatcud == 1 ) && ( AV84valorsiatcud == 1 ) )
            {
               AV83documentnumber = GXutil.trim( A13985DevCruTipA) + " " + GXutil.trim( A13984DevCruSerA) + "/" + GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0)) ;
               AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV83documentnumber));
            }
            else
            {
               if ( AV79NumDoc == 0 )
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0)));
               }
               else
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV78Doc));
               }
            }
            AV80codValidacaoSerie = A13983DevCruATCU ;
            AV81atcud = ((GXutil.strcmp("", AV80codValidacaoSerie)==0) ? "" : GXutil.trim( AV80codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0))) ;
            if ( ! (GXutil.strcmp("", AV80codValidacaoSerie)==0) && ( AV82siatcud == 1 ) )
            {
               AV39filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV81atcud));
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
            AV58VarAux = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV59HhSys = GXutil.substring( AV58VarAux, 12, 8) ;
            AV60FecSys = localUtil.ctod( GXutil.substring( AV58VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( AV60FecSys), 10, 0)) ;
            if ( GXutil.month( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            AV41Body = AV61DateAux ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV41Body));
            AV39filexml.writeElement(httpContext.getMessage( "MovementType", ""), httpContext.getMessage( "GD", ""));
            AV39filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV48CliNif));
            AV39filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV51CliDom));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV52CliPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV53Cp));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV51CliDom));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV52CliPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV53Cp));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV55EmprDir));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV56EmprPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV75Cp8));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV58VarAux = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV68FecHorSal = localUtil.ctot( AV58VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV67VarAux0 = AV68FecHorSal ;
            AV58VarAux = localUtil.ttoc( AV67VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV59HhSys = GXutil.substring( AV58VarAux, 12, 8) ;
            AV60FecSys = localUtil.ctod( GXutil.substring( AV58VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( AV60FecSys), 10, 0)) ;
            if ( GXutil.month( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV60FecSys) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) ;
            }
            AV41Body = AV61DateAux + httpContext.getMessage( "T", "") + AV59HhSys ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV41Body));
            AV41Body = A11672DevCruMat ;
            if ( GXutil.strcmp(A11672DevCruMat, " ") == 0 )
            {
               AV41Body = "0" ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV41Body));
            /* Using cursor P04ZO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A3613AlbRefDsc = P04ZO4_A3613AlbRefDsc[0] ;
               A45AlbRef = P04ZO4_A45AlbRef[0] ;
               A11683DevCruUnd = P04ZO4_A11683DevCruUnd[0] ;
               A56AlbRUni = P04ZO4_A56AlbRUni[0] ;
               A44AlbRecCod = P04ZO4_A44AlbRecCod[0] ;
               A3613AlbRefDsc = P04ZO4_A3613AlbRefDsc[0] ;
               A45AlbRef = P04ZO4_A45AlbRef[0] ;
               A56AlbRUni = P04ZO4_A56AlbRUni[0] ;
               AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
               AV62Pd = GXutil.trim( A45AlbRef) + "-" + GXutil.trim( A3613AlbRefDsc) ;
               AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
               AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A11683DevCruUnd, 9, 2)), (short)(9), " ") ;
               AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
               AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
               AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
               AV77Un = httpContext.getMessage( "KG", "") ;
               if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
               {
                  AV77Un = httpContext.getMessage( "MT", "") ;
               }
               AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), GXutil.trim( AV77Un));
               AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
               AV39filexml.writeEndElement();
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV39filexml.writeEndElement();
         AV39filexml.writeEndElement();
         AV39filexml.close();
         AV85ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENT' Routine */
      returnInSub = false ;
      AV49CliNom = " " ;
      AV51CliDom = " " ;
      AV52CliPob = " " ;
      AV53Cp = " " ;
      AV48CliNif = " " ;
      /* Using cursor P04ZO5 */
      pr_default.execute(3, new Object[] {AV46Emprcod, Integer.valueOf(AV50Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P04ZO5_A252CliCod[0] ;
         A396EmprCod = P04ZO5_A396EmprCod[0] ;
         A279CliNom = P04ZO5_A279CliNom[0] ;
         A260CliDom = P04ZO5_A260CliDom[0] ;
         A295CliPob = P04ZO5_A295CliPob[0] ;
         A4828CliCp2 = P04ZO5_A4828CliCp2[0] ;
         A256CliCp = P04ZO5_A256CliCp[0] ;
         A278CliNif = P04ZO5_A278CliNif[0] ;
         AV49CliNom = A279CliNom ;
         AV51CliDom = A260CliDom ;
         AV52CliPob = A295CliPob ;
         AV53Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV48CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdcxml.this.AV46Emprcod;
      this.aP1[0] = pdcxml.this.AV37AlbProcod;
      this.aP2[0] = pdcxml.this.AV87pathIN;
      this.aP3[0] = pdcxml.this.AV40Fichero;
      this.aP4[0] = pdcxml.this.AV88Messages;
      this.aP5[0] = pdcxml.this.AV85ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV88Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P04ZO2_A396EmprCod = new String[] {""} ;
      P04ZO2_A395EmprCif = new String[] {""} ;
      P04ZO2_n395EmprCif = new boolean[] {false} ;
      P04ZO2_A407EmprNom = new String[] {""} ;
      P04ZO2_n407EmprNom = new boolean[] {false} ;
      P04ZO2_A404EmprDir = new String[] {""} ;
      P04ZO2_n404EmprDir = new boolean[] {false} ;
      P04ZO2_A408EmprPob = new String[] {""} ;
      P04ZO2_n408EmprPob = new boolean[] {false} ;
      P04ZO2_A403EmprCpo = new String[] {""} ;
      P04ZO2_n403EmprCpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      AV47Emprcif = "" ;
      AV54EmprNom = "" ;
      AV55EmprDir = "" ;
      AV56EmprPob = "" ;
      AV57Emprcp = "" ;
      AV73Cp4 = "" ;
      AV74Cp3 = "" ;
      AV75Cp8 = "" ;
      AV95path = "" ;
      AV39filexml = new com.genexus.xml.XMLWriter();
      AV94Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV41Body = "" ;
      P04ZO3_A11669DevCruId = new int[1] ;
      P04ZO3_A396EmprCod = new String[] {""} ;
      P04ZO3_A252CliCod = new int[1] ;
      P04ZO3_A13984DevCruSerA = new String[] {""} ;
      P04ZO3_A13985DevCruTipA = new String[] {""} ;
      P04ZO3_A13983DevCruATCU = new String[] {""} ;
      P04ZO3_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P04ZO3_A11672DevCruMat = new String[] {""} ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      A13983DevCruATCU = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11672DevCruMat = "" ;
      AV78Doc = "" ;
      AV83documentnumber = "" ;
      AV80codValidacaoSerie = "" ;
      AV81atcud = "" ;
      AV58VarAux = "" ;
      AV59HhSys = "" ;
      AV60FecSys = GXutil.nullDate() ;
      AV61DateAux = "" ;
      AV48CliNif = "" ;
      AV51CliDom = "" ;
      AV52CliPob = "" ;
      AV53Cp = "" ;
      AV68FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV67VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      P04ZO4_A396EmprCod = new String[] {""} ;
      P04ZO4_A11669DevCruId = new int[1] ;
      P04ZO4_A3613AlbRefDsc = new String[] {""} ;
      P04ZO4_A45AlbRef = new String[] {""} ;
      P04ZO4_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04ZO4_A56AlbRUni = new String[] {""} ;
      P04ZO4_A44AlbRecCod = new int[1] ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      AV62Pd = "" ;
      AV70VarKgs = "" ;
      AV71Vconv = "" ;
      AV72Num9 = DecimalUtil.ZERO ;
      AV77Un = "" ;
      AV49CliNom = "" ;
      P04ZO5_A252CliCod = new int[1] ;
      P04ZO5_A396EmprCod = new String[] {""} ;
      P04ZO5_A279CliNom = new String[] {""} ;
      P04ZO5_A260CliDom = new String[] {""} ;
      P04ZO5_A295CliPob = new String[] {""} ;
      P04ZO5_A4828CliCp2 = new String[] {""} ;
      P04ZO5_A256CliCp = new String[] {""} ;
      P04ZO5_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.pdcxml__default(),
         new Object[] {
             new Object[] {
            P04ZO2_A396EmprCod, P04ZO2_A395EmprCif, P04ZO2_n395EmprCif, P04ZO2_A407EmprNom, P04ZO2_n407EmprNom, P04ZO2_A404EmprDir, P04ZO2_n404EmprDir, P04ZO2_A408EmprPob, P04ZO2_n408EmprPob, P04ZO2_A403EmprCpo,
            P04ZO2_n403EmprCpo
            }
            , new Object[] {
            P04ZO3_A11669DevCruId, P04ZO3_A396EmprCod, P04ZO3_A252CliCod, P04ZO3_A13984DevCruSerA, P04ZO3_A13985DevCruTipA, P04ZO3_A13983DevCruATCU, P04ZO3_A11673DevCruSal, P04ZO3_A11672DevCruMat
            }
            , new Object[] {
            P04ZO4_A396EmprCod, P04ZO4_A11669DevCruId, P04ZO4_A3613AlbRefDsc, P04ZO4_A45AlbRef, P04ZO4_A11683DevCruUnd, P04ZO4_A56AlbRUni, P04ZO4_A44AlbRecCod
            }
            , new Object[] {
            P04ZO5_A252CliCod, P04ZO5_A396EmprCod, P04ZO5_A279CliNom, P04ZO5_A260CliDom, P04ZO5_A295CliPob, P04ZO5_A4828CliCp2, P04ZO5_A256CliCp, P04ZO5_A278CliNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV79NumDoc ;
   private byte AV82siatcud ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV84valorsiatcud ;
   private short Gx_err ;
   private int AV37AlbProcod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV50Clicod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV72Num9 ;
   private String AV46Emprcod ;
   private String AV87pathIN ;
   private String AV40Fichero ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String AV47Emprcif ;
   private String AV54EmprNom ;
   private String AV55EmprDir ;
   private String AV56EmprPob ;
   private String AV57Emprcp ;
   private String AV73Cp4 ;
   private String AV74Cp3 ;
   private String AV75Cp8 ;
   private String AV41Body ;
   private String A13984DevCruSerA ;
   private String A13985DevCruTipA ;
   private String A13983DevCruATCU ;
   private String A11672DevCruMat ;
   private String AV78Doc ;
   private String AV80codValidacaoSerie ;
   private String AV58VarAux ;
   private String AV59HhSys ;
   private String AV61DateAux ;
   private String AV48CliNif ;
   private String AV51CliDom ;
   private String AV52CliPob ;
   private String AV53Cp ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String AV62Pd ;
   private String AV70VarKgs ;
   private String AV71Vconv ;
   private String AV77Un ;
   private String AV49CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV68FecHorSal ;
   private java.util.Date AV67VarAux0 ;
   private java.util.Date AV60FecSys ;
   private boolean AV85ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean returnInSub ;
   private String AV95path ;
   private String AV83documentnumber ;
   private String AV81atcud ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZO2_A396EmprCod ;
   private String[] P04ZO2_A395EmprCif ;
   private boolean[] P04ZO2_n395EmprCif ;
   private String[] P04ZO2_A407EmprNom ;
   private boolean[] P04ZO2_n407EmprNom ;
   private String[] P04ZO2_A404EmprDir ;
   private boolean[] P04ZO2_n404EmprDir ;
   private String[] P04ZO2_A408EmprPob ;
   private boolean[] P04ZO2_n408EmprPob ;
   private String[] P04ZO2_A403EmprCpo ;
   private boolean[] P04ZO2_n403EmprCpo ;
   private int[] P04ZO3_A11669DevCruId ;
   private String[] P04ZO3_A396EmprCod ;
   private int[] P04ZO3_A252CliCod ;
   private String[] P04ZO3_A13984DevCruSerA ;
   private String[] P04ZO3_A13985DevCruTipA ;
   private String[] P04ZO3_A13983DevCruATCU ;
   private java.util.Date[] P04ZO3_A11673DevCruSal ;
   private String[] P04ZO3_A11672DevCruMat ;
   private String[] P04ZO4_A396EmprCod ;
   private int[] P04ZO4_A11669DevCruId ;
   private String[] P04ZO4_A3613AlbRefDsc ;
   private String[] P04ZO4_A45AlbRef ;
   private java.math.BigDecimal[] P04ZO4_A11683DevCruUnd ;
   private String[] P04ZO4_A56AlbRUni ;
   private int[] P04ZO4_A44AlbRecCod ;
   private int[] P04ZO5_A252CliCod ;
   private String[] P04ZO5_A396EmprCod ;
   private String[] P04ZO5_A279CliNom ;
   private String[] P04ZO5_A260CliDom ;
   private String[] P04ZO5_A295CliPob ;
   private String[] P04ZO5_A4828CliCp2 ;
   private String[] P04ZO5_A256CliCp ;
   private String[] P04ZO5_A278CliNif ;
   private com.genexus.xml.XMLWriter AV39filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV88Messages ;
   private com.genexus.SdtMessages_Message AV94Message ;
}

final  class pdcxml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZO2", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04ZO3", "SELECT DevCruId, EmprCod, CliCod, DevCruSerA, DevCruTipA, DevCruATCU, DevCruSal, DevCruMat FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04ZO4", "SELECT T1.EmprCod, T1.DevCruId, T2.AlbRefDsc, T2.AlbRef, T1.DevCruUnd, T2.AlbRUni, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04ZO5", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
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

