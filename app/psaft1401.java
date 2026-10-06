package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psaft1401 extends GXProcedure
{
   public psaft1401( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psaft1401.class ), "" );
   }

   public psaft1401( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        java.util.Date aP2 ,
                                                                        short aP3 ,
                                                                        String aP4 ,
                                                                        String aP5 ,
                                                                        int aP6 ,
                                                                        int aP7 ,
                                                                        String aP8 ,
                                                                        String[] aP9 ,
                                                                        String aP10 ,
                                                                        int aP11 )
   {
      psaft1401.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String aP5 ,
                        int aP6 ,
                        int aP7 ,
                        String aP8 ,
                        String[] aP9 ,
                        String aP10 ,
                        int aP11 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String aP8 ,
                             String[] aP9 ,
                             String aP10 ,
                             int aP11 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP12 )
   {
      psaft1401.this.A396EmprCod = aP0;
      psaft1401.this.AV52Fec1 = aP1;
      psaft1401.this.AV53Fec2 = aP2;
      psaft1401.this.AV54Anyo = aP3;
      psaft1401.this.AV58TaxReg = aP4;
      psaft1401.this.AV57CompanyID = aP5;
      psaft1401.this.AV59FacCod = aP6;
      psaft1401.this.AV132Faccodf = aP7;
      psaft1401.this.AV34File = aP8;
      psaft1401.this.aP9 = aP9;
      psaft1401.this.AV113Usurcod = aP10;
      psaft1401.this.AV151CantidadRegistrosAProcesar = aP11;
      psaft1401.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV107Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      psaft1401.this.GXt_int1 = GXv_int2[0] ;
      AV107Etm = GXt_int1 ;
      GXt_int1 = AV146gavim ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GAVIM", ""), GXv_int2) ;
      psaft1401.this.GXt_int1 = GXv_int2[0] ;
      AV146gavim = GXt_int1 ;
      GXt_int1 = (byte)(AV157moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      psaft1401.this.GXt_int1 = GXv_int2[0] ;
      AV157moda21 = GXt_int1 ;
      GXt_int1 = AV142tdebitcredit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEBCRE", ""), GXv_int2) ;
      psaft1401.this.GXt_int1 = GXv_int2[0] ;
      AV142tdebitcredit = GXt_int1 ;
      GXt_int1 = (byte)(AV158tcredit) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CREDIT", ""), GXv_int2) ;
      psaft1401.this.GXt_int1 = GXv_int2[0] ;
      AV158tcredit = GXt_int1 ;
      AV90File2 = GXutil.trim( AV34File) ;
      AV71Faccod1 = AV59FacCod ;
      AV72FacCod2 = ((AV132Faccodf==0) ? 99999999 : AV132Faccodf) ;
      AV93NomMes = localUtil.cmonth( localUtil.ctod( localUtil.dtoc( AV52Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), httpContext.getMessage( "eng", "")) ;
      AV94Year = (short)(GXutil.year( AV52Fec1)) ;
      AV141totalcredit = DecimalUtil.ZERO ;
      AV140totaldebit = DecimalUtil.ZERO ;
      if ( AV142tdebitcredit == 1 )
      {
         GXv_decimal3[0] = AV140totaldebit ;
         GXv_decimal4[0] = AV141totalcredit ;
         new app.ptcreditdebit(remoteHandle, context).execute( A396EmprCod, AV52Fec1, AV53Fec2, AV71Faccod1, AV72FacCod2, GXv_decimal3, GXv_decimal4) ;
         psaft1401.this.AV140totaldebit = GXv_decimal3[0] ;
         psaft1401.this.AV141totalcredit = GXv_decimal4[0] ;
      }
      /* Using cursor P056T2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = P056T2_A395EmprCif[0] ;
         n395EmprCif = P056T2_n395EmprCif[0] ;
         A407EmprNom = P056T2_A407EmprNom[0] ;
         n407EmprNom = P056T2_n407EmprNom[0] ;
         A404EmprDir = P056T2_A404EmprDir[0] ;
         n404EmprDir = P056T2_n404EmprDir[0] ;
         A408EmprPob = P056T2_A408EmprPob[0] ;
         n408EmprPob = P056T2_n408EmprPob[0] ;
         A403EmprCpo = P056T2_A403EmprCpo[0] ;
         n403EmprCpo = P056T2_n403EmprCpo[0] ;
         A409EmprTel = P056T2_A409EmprTel[0] ;
         n409EmprTel = P056T2_n409EmprTel[0] ;
         A405EmprFax = P056T2_A405EmprFax[0] ;
         n405EmprFax = P056T2_n405EmprFax[0] ;
         A11516EmpItm6 = P056T2_A11516EmpItm6[0] ;
         n11516EmpItm6 = P056T2_n11516EmpItm6[0] ;
         AV17Emprcif = A395EmprCif ;
         AV24EmprNom = A407EmprNom ;
         AV25EmprDir = A404EmprDir ;
         AV26EmprPob = A408EmprPob ;
         AV27Emprcp = A403EmprCpo ;
         AV44Cp4 = GXutil.substring( AV27Emprcp, 1, 4) ;
         AV45Cp3 = GXutil.substring( AV27Emprcp, 5, 3) ;
         AV46Cp8 = AV44Cp4 + "-" + AV45Cp3 ;
         AV108EmprTel = ((GXutil.strcmp(A409EmprTel, "")==0) ? httpContext.getMessage( "Desconhecido", "") : A409EmprTel) ;
         AV109EmprFax = ((GXutil.strcmp(A405EmprFax, "")==0) ? httpContext.getMessage( "Desconhecido", "") : GXutil.trim( A405EmprFax)) ;
         AV110Website = ((GXutil.strcmp(A11516EmpItm6, "")==0) ? httpContext.getMessage( "Desconhecido", "") : GXutil.trim( A11516EmpItm6)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV156messages.clear();
      AV90File2 += httpContext.getMessage( "\\SAFT104_1_v0401_", "") + GXutil.trim( AV93NomMes) + GXutil.str( AV94Year, 4, 0) + httpContext.getMessage( ".xml", "") ;
      AV9filexml.openURL(AV90File2);
      if ( AV9filexml.getErrCode() > 0 )
      {
         AV155message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV155message.setgxTv_SdtMessages_Message_Id( GXutil.str( AV9filexml.getErrCode(), 10, 2) );
         AV155message.setgxTv_SdtMessages_Message_Description( AV9filexml.getErrDescription() );
         AV156messages.add(AV155message, 0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV11Linea = httpContext.getMessage( "?xml version=\"1.0\" encoding=\"windows-1252\"?", "") ;
         AV9filexml.writeStartDocument("", (byte)(0));
         AV9filexml.writeNSStartElement(httpContext.getMessage( "AuditFile", ""), "", "");
         AV9filexml.writeAttribute(httpContext.getMessage( "xmlns", ""), httpContext.getMessage( "urn:OECD:StandardAuditFile-Tax:PT_1.04_01", ""));
         AV9filexml.writeAttribute(httpContext.getMessage( "xmlns:xsi", ""), httpContext.getMessage( "http://www.w3.org/2001/XMLSchema-instance", ""));
         AV9filexml.writeAttribute(httpContext.getMessage( "xsi:schemaLocation", ""), httpContext.getMessage( "urn:OECD:StandardAuditFile-Tax:PT_1.04_01 ../schemas/SAF-T.xsd", ""));
         AV9filexml.writeAttribute(httpContext.getMessage( "xmlns:doc", ""), httpContext.getMessage( "urn:schemas-basda-org:schema-extensions:documentation", ""));
         AV9filexml.writeStartElement(httpContext.getMessage( "Header", ""));
         AV9filexml.writeElement(httpContext.getMessage( "AuditFileVersion", ""), "1.04_01");
         AV9filexml.writeElement(httpContext.getMessage( "CompanyID", ""), AV57CompanyID);
         AV9filexml.writeElement(httpContext.getMessage( "TaxRegistrationNumber", ""), AV58TaxReg);
         AV9filexml.writeElement(httpContext.getMessage( "TaxAccountingBasis", ""), httpContext.getMessage( "F", ""));
         AV9filexml.writeElement(httpContext.getMessage( "CompanyName", ""), GXutil.trim( AV24EmprNom));
         AV9filexml.writeElement(httpContext.getMessage( "BusinessName", ""), GXutil.trim( AV24EmprNom));
         AV9filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
         AV9filexml.writeElement(httpContext.getMessage( "StreetName", ""), GXutil.trim( AV25EmprDir));
         AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( AV25EmprDir));
         AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV26EmprPob));
         AV62Cpt = GXutil.substring( AV27Emprcp, 1, 4) + "-" + GXutil.substring( AV27Emprcp, 5, 3) ;
         AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV62Cpt));
         AV9filexml.writeElement(httpContext.getMessage( "Region", ""), GXutil.trim( AV26EmprPob));
         AV9filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
         AV9filexml.writeEndElement();
         AV56AnyoA = GXutil.str( AV54Anyo, 4, 0) ;
         AV9filexml.writeElement(httpContext.getMessage( "FiscalYear", ""), AV56AnyoA);
         AV55FecA = GXutil.str( GXutil.year( AV52Fec1), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV52Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV52Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
         AV9filexml.writeElement(httpContext.getMessage( "StartDate", ""), AV55FecA);
         AV55FecA = GXutil.str( GXutil.year( AV53Fec2), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV53Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV53Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
         AV9filexml.writeElement(httpContext.getMessage( "EndDate", ""), AV55FecA);
         AV9filexml.writeElement(httpContext.getMessage( "CurrencyCode", ""), httpContext.getMessage( "EUR", ""));
         AV55FecA = GXutil.str( GXutil.year( GXutil.today( )), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( GXutil.today( ), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( GXutil.today( ), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
         AV9filexml.writeElement(httpContext.getMessage( "DateCreated", ""), AV55FecA);
         AV9filexml.writeElement(httpContext.getMessage( "TaxEntity", ""), httpContext.getMessage( "Global", ""));
         AV9filexml.writeElement(httpContext.getMessage( "ProductCompanyTaxID", ""), "770005063");
         AV9filexml.writeElement(httpContext.getMessage( "SoftwareCertificateNumber", ""), "1208");
         AV9filexml.writeElement(httpContext.getMessage( "ProductID", ""), httpContext.getMessage( "Texplus/Datamon Plus", ""));
         AV9filexml.writeElement(httpContext.getMessage( "ProductVersion", ""), "1.1");
         AV9filexml.writeElement(httpContext.getMessage( "Telephone", ""), GXutil.trim( AV108EmprTel));
         AV9filexml.writeElement(httpContext.getMessage( "Fax", ""), GXutil.trim( AV109EmprFax));
         AV9filexml.writeElement(httpContext.getMessage( "Website", ""), GXutil.trim( AV110Website));
         AV9filexml.writeEndElement();
         AV9filexml.writeStartElement(httpContext.getMessage( "MasterFiles", ""));
         AV89LastClicod = 0 ;
         AV101Cod_pais = (short)(0) ;
         /* Using cursor P056T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV52Fec1, AV53Fec2, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A450FacPri = P056T3_A450FacPri[0] ;
            A430FacCod = P056T3_A430FacCod[0] ;
            A436FacFch = P056T3_A436FacFch[0] ;
            A10301Cod_pais = P056T3_A10301Cod_pais[0] ;
            n10301Cod_pais = P056T3_n10301Cod_pais[0] ;
            A278CliNif = P056T3_A278CliNif[0] ;
            A279CliNom = P056T3_A279CliNom[0] ;
            A260CliDom = P056T3_A260CliDom[0] ;
            A295CliPob = P056T3_A295CliPob[0] ;
            A4828CliCp2 = P056T3_A4828CliCp2[0] ;
            A256CliCp = P056T3_A256CliCp[0] ;
            A303CliTel1 = P056T3_A303CliTel1[0] ;
            A274CliFax = P056T3_A274CliFax[0] ;
            A252CliCod = P056T3_A252CliCod[0] ;
            A10301Cod_pais = P056T3_A10301Cod_pais[0] ;
            n10301Cod_pais = P056T3_n10301Cod_pais[0] ;
            A278CliNif = P056T3_A278CliNif[0] ;
            A279CliNom = P056T3_A279CliNom[0] ;
            A260CliDom = P056T3_A260CliDom[0] ;
            A295CliPob = P056T3_A295CliPob[0] ;
            A4828CliCp2 = P056T3_A4828CliCp2[0] ;
            A256CliCp = P056T3_A256CliCp[0] ;
            A303CliTel1 = P056T3_A303CliTel1[0] ;
            A274CliFax = P056T3_A274CliFax[0] ;
            if ( A252CliCod != AV89LastClicod )
            {
               AV100Pais = httpContext.getMessage( "PT", "") ;
               AV101Cod_pais = A10301Cod_pais ;
               /* Execute user subroutine: 'PAIS' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV9filexml.writeStartElement(httpContext.getMessage( "Customer", ""));
               AV9filexml.writeElement(httpContext.getMessage( "CustomerID", ""), GXutil.trim( GXutil.str( A252CliCod, 6, 0)));
               AV9filexml.writeElement(httpContext.getMessage( "AccountID", ""), httpContext.getMessage( "Desconhecido", ""));
               AV9filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( A278CliNif));
               AV9filexml.writeElement(httpContext.getMessage( "CompanyName", ""), GXutil.trim( A279CliNom));
               AV9filexml.writeElement(httpContext.getMessage( "Contact", ""), httpContext.getMessage( "Desconhecido", ""));
               AV9filexml.writeStartElement(httpContext.getMessage( "BillingAddress", ""));
               AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( A260CliDom));
               if ( GXutil.strcmp(A295CliPob, " ") != 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( A295CliPob));
               }
               else
               {
                  AV9filexml.writeElement(httpContext.getMessage( "City", ""), httpContext.getMessage( "Desconhecido", ""));
               }
               AV23Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
               if ( GXutil.strcmp(AV23Cp, " ") != 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV23Cp));
               }
               else
               {
                  AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), httpContext.getMessage( "Desconhecido", ""));
               }
               AV9filexml.writeElement(httpContext.getMessage( "Country", ""), AV100Pais);
               AV9filexml.writeEndElement();
               AV9filexml.writeStartElement(httpContext.getMessage( "ShipToAddress", ""));
               AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( A260CliDom));
               if ( GXutil.strcmp(A295CliPob, " ") != 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( A295CliPob));
               }
               else
               {
                  AV9filexml.writeElement(httpContext.getMessage( "City", ""), httpContext.getMessage( "Desconhecido", ""));
               }
               AV23Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
               if ( GXutil.strcmp(AV23Cp, " ") != 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV23Cp));
               }
               else
               {
                  AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), httpContext.getMessage( "Desconhecido", ""));
               }
               AV9filexml.writeElement(httpContext.getMessage( "Country", ""), AV100Pais);
               AV9filexml.writeEndElement();
               if ( GXutil.strcmp(A303CliTel1, " ") != 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Telephone", ""), GXutil.trim( A303CliTel1));
               }
               else
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Telephone", ""), httpContext.getMessage( "Desconhecido", ""));
               }
               if ( GXutil.strcmp(A274CliFax, " ") != 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Fax", ""), GXutil.trim( A274CliFax));
               }
               else
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Fax", ""), httpContext.getMessage( "Desconhecido", ""));
               }
               AV9filexml.writeElement(httpContext.getMessage( "Email", ""), httpContext.getMessage( "Desconhecido", ""));
               AV9filexml.writeElement(httpContext.getMessage( "SelfBillingIndicator", ""), "0");
               AV9filexml.writeEndElement();
            }
            AV89LastClicod = A252CliCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P056T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV52Fec1, AV53Fec2, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk56T4 = false ;
            A428FacAlbTip = P056T4_A428FacAlbTip[0] ;
            A450FacPri = P056T4_A450FacPri[0] ;
            A430FacCod = P056T4_A430FacCod[0] ;
            A3397FacFasCod = P056T4_A3397FacFasCod[0] ;
            A436FacFch = P056T4_A436FacFch[0] ;
            A12197FacUnds = P056T4_A12197FacUnds[0] ;
            A449FacPreMts = P056T4_A449FacPreMts[0] ;
            A448FacPreKgs = P056T4_A448FacPreKgs[0] ;
            A446FacLin = P056T4_A446FacLin[0] ;
            A450FacPri = P056T4_A450FacPri[0] ;
            A436FacFch = P056T4_A436FacFch[0] ;
            if ( ( A448FacPreKgs.doubleValue() > 0 ) || ( A449FacPreMts.doubleValue() > 0 ) || ( ( A12197FacUnds > 0 ) ) )
            {
               AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
               AV65Fascod = "" ;
               AV63FacDsc = "" ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P056T4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P056T4_A3397FacFasCod[0], A3397FacFasCod) == 0 ) )
               {
                  brk56T4 = false ;
                  A428FacAlbTip = P056T4_A428FacAlbTip[0] ;
                  A450FacPri = P056T4_A450FacPri[0] ;
                  A430FacCod = P056T4_A430FacCod[0] ;
                  A436FacFch = P056T4_A436FacFch[0] ;
                  A12197FacUnds = P056T4_A12197FacUnds[0] ;
                  A449FacPreMts = P056T4_A449FacPreMts[0] ;
                  A448FacPreKgs = P056T4_A448FacPreKgs[0] ;
                  A446FacLin = P056T4_A446FacLin[0] ;
                  A450FacPri = P056T4_A450FacPri[0] ;
                  A436FacFch = P056T4_A436FacFch[0] ;
                  if ( (( GXutil.resetTime(A436FacFch).after( GXutil.resetTime( AV52Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV52Fec1)) )) )
                  {
                     if ( (( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV53Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV53Fec2)) )) )
                     {
                        if ( GXutil.strcmp(A3397FacFasCod, " ") != 0 )
                        {
                           if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                           {
                              if ( A430FacCod >= AV71Faccod1 )
                              {
                                 if ( A430FacCod <= AV72FacCod2 )
                                 {
                                    if ( A428FacAlbTip == 1 )
                                    {
                                       if ( ( A448FacPreKgs.doubleValue() > 0 ) || ( A449FacPreMts.doubleValue() > 0 ) || ( ( A12197FacUnds > 0 ) ) )
                                       {
                                          AV65Fascod = A3397FacFasCod ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  brk56T4 = true ;
                  pr_default.readNext(2);
               }
               AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
               AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV65Fascod));
               AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "FASES", ""));
               GXv_char5[0] = AV63FacDsc ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, AV65Fascod, GXv_char5) ;
               psaft1401.this.AV63FacDsc = GXv_char5[0] ;
               if ( GXutil.strcmp(AV63FacDsc, " ") == 0 )
               {
                  AV63FacDsc = httpContext.getMessage( "Desconhecido", "") ;
               }
               AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV63FacDsc));
               AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), GXutil.trim( AV65Fascod));
               AV9filexml.writeEndElement();
            }
            if ( ! brk56T4 )
            {
               brk56T4 = true ;
               pr_default.readNext(2);
            }
         }
         pr_default.close(2);
         GX_I = 1 ;
         while ( GX_I <= 10000 )
         {
            AV104Tab_Art[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV105i = 1 ;
         /* Using cursor P056T5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV52Fec1, AV53Fec2, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            brk56T6 = false ;
            A428FacAlbTip = P056T5_A428FacAlbTip[0] ;
            A450FacPri = P056T5_A450FacPri[0] ;
            A9647FacImpdto = P056T5_A9647FacImpdto[0] ;
            A12197FacUnds = P056T5_A12197FacUnds[0] ;
            A449FacPreMts = P056T5_A449FacPreMts[0] ;
            A430FacCod = P056T5_A430FacCod[0] ;
            A436FacFch = P056T5_A436FacFch[0] ;
            A447FacMts = P056T5_A447FacMts[0] ;
            A448FacPreKgs = P056T5_A448FacPreKgs[0] ;
            A444FacKgs = P056T5_A444FacKgs[0] ;
            A454FacSer = P056T5_A454FacSer[0] ;
            A3883FacCliCod = P056T5_A3883FacCliCod[0] ;
            A446FacLin = P056T5_A446FacLin[0] ;
            A450FacPri = P056T5_A450FacPri[0] ;
            A436FacFch = P056T5_A436FacFch[0] ;
            AV147Hecreado = (byte)(0) ;
            if ( AV146gavim == 1 )
            {
               if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) && ( A447FacMts.doubleValue() == 0 ) )
               {
                  AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P056T5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P056T5_A3883FacCliCod[0] == A3883FacCliCod ) && ( GXutil.strcmp(P056T5_A454FacSer[0], A454FacSer) == 0 ) )
                  {
                     brk56T6 = false ;
                     A428FacAlbTip = P056T5_A428FacAlbTip[0] ;
                     A450FacPri = P056T5_A450FacPri[0] ;
                     A430FacCod = P056T5_A430FacCod[0] ;
                     A436FacFch = P056T5_A436FacFch[0] ;
                     A447FacMts = P056T5_A447FacMts[0] ;
                     A448FacPreKgs = P056T5_A448FacPreKgs[0] ;
                     A444FacKgs = P056T5_A444FacKgs[0] ;
                     A446FacLin = P056T5_A446FacLin[0] ;
                     A450FacPri = P056T5_A450FacPri[0] ;
                     A436FacFch = P056T5_A436FacFch[0] ;
                     if ( (( GXutil.resetTime(A436FacFch).after( GXutil.resetTime( AV52Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV52Fec1)) )) )
                     {
                        if ( (( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV53Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV53Fec2)) )) )
                        {
                           if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                           {
                              if ( A430FacCod >= AV71Faccod1 )
                              {
                                 if ( A430FacCod <= AV72FacCod2 )
                                 {
                                    if ( A428FacAlbTip == 1 )
                                    {
                                       if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) && ( A447FacMts.doubleValue() == 0 ) )
                                       {
                                          AV66CliArt = GXutil.str( A3883FacCliCod, 6, 0) + "-" + GXutil.trim( A454FacSer) ;
                                          AV67FacSer = A454FacSer ;
                                          AV68FacClicod = A3883FacCliCod ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                     brk56T6 = true ;
                     pr_default.readNext(3);
                  }
                  AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "SERIES", ""));
                  GXv_char5[0] = A396EmprCod ;
                  GXv_int6[0] = AV68FacClicod ;
                  GXv_char7[0] = AV67FacSer ;
                  GXv_char8[0] = AV69ArtDsc ;
                  GXv_int2[0] = AV70Flag ;
                  new app.pbusard(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char7, GXv_char8, GXv_int2) ;
                  psaft1401.this.A396EmprCod = GXv_char5[0] ;
                  psaft1401.this.AV68FacClicod = GXv_int6[0] ;
                  psaft1401.this.AV67FacSer = GXv_char7[0] ;
                  psaft1401.this.AV69ArtDsc = GXv_char8[0] ;
                  psaft1401.this.AV70Flag = GXv_int2[0] ;
                  if ( GXutil.strcmp(AV69ArtDsc, " ") == 0 )
                  {
                     AV69ArtDsc = httpContext.getMessage( "Desconhecido", "") ;
                  }
                  AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV69ArtDsc));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), GXutil.trim( AV66CliArt));
                  AV104Tab_Art[AV105i-1] = AV66CliArt ;
                  AV105i = (int)(AV105i+1) ;
                  AV9filexml.writeEndElement();
                  AV147Hecreado = (byte)(1) ;
               }
            }
            if ( (0==AV147Hecreado) )
            {
               if ( ( ( A448FacPreKgs.doubleValue() > 0 ) || ( A449FacPreMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) || ( ( AV157moda21 == 1 ) && ( A9647FacImpdto.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) || ( A449FacPreMts.doubleValue() == 0 ) ) )
               {
                  AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P056T5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P056T5_A3883FacCliCod[0] == A3883FacCliCod ) && ( GXutil.strcmp(P056T5_A454FacSer[0], A454FacSer) == 0 ) )
                  {
                     brk56T6 = false ;
                     A428FacAlbTip = P056T5_A428FacAlbTip[0] ;
                     A450FacPri = P056T5_A450FacPri[0] ;
                     A9647FacImpdto = P056T5_A9647FacImpdto[0] ;
                     A12197FacUnds = P056T5_A12197FacUnds[0] ;
                     A449FacPreMts = P056T5_A449FacPreMts[0] ;
                     A430FacCod = P056T5_A430FacCod[0] ;
                     A436FacFch = P056T5_A436FacFch[0] ;
                     A448FacPreKgs = P056T5_A448FacPreKgs[0] ;
                     A446FacLin = P056T5_A446FacLin[0] ;
                     A450FacPri = P056T5_A450FacPri[0] ;
                     A436FacFch = P056T5_A436FacFch[0] ;
                     if ( (( GXutil.resetTime(A436FacFch).after( GXutil.resetTime( AV52Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV52Fec1)) )) )
                     {
                        if ( (( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV53Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV53Fec2)) )) )
                        {
                           if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                           {
                              if ( A430FacCod >= AV71Faccod1 )
                              {
                                 if ( A430FacCod <= AV72FacCod2 )
                                 {
                                    if ( A428FacAlbTip == 1 )
                                    {
                                       if ( ( ( A448FacPreKgs.doubleValue() > 0 ) || ( A449FacPreMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) || ( ( AV157moda21 == 1 ) && ( A9647FacImpdto.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) || ( A449FacPreMts.doubleValue() == 0 ) ) )
                                       {
                                          AV66CliArt = GXutil.str( A3883FacCliCod, 6, 0) + "-" + GXutil.trim( A454FacSer) ;
                                          AV67FacSer = A454FacSer ;
                                          AV68FacClicod = A3883FacCliCod ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                     brk56T6 = true ;
                     pr_default.readNext(3);
                  }
                  AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "SERIES", ""));
                  GXv_char8[0] = A396EmprCod ;
                  GXv_int6[0] = AV68FacClicod ;
                  GXv_char7[0] = AV67FacSer ;
                  GXv_char5[0] = AV69ArtDsc ;
                  GXv_int2[0] = AV70Flag ;
                  new app.pbusard(remoteHandle, context).execute( GXv_char8, GXv_int6, GXv_char7, GXv_char5, GXv_int2) ;
                  psaft1401.this.A396EmprCod = GXv_char8[0] ;
                  psaft1401.this.AV68FacClicod = GXv_int6[0] ;
                  psaft1401.this.AV67FacSer = GXv_char7[0] ;
                  psaft1401.this.AV69ArtDsc = GXv_char5[0] ;
                  psaft1401.this.AV70Flag = GXv_int2[0] ;
                  if ( GXutil.strcmp(AV69ArtDsc, " ") == 0 )
                  {
                     AV69ArtDsc = httpContext.getMessage( "Desconhecido", "") ;
                  }
                  AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV69ArtDsc));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), GXutil.trim( AV66CliArt));
                  AV104Tab_Art[AV105i-1] = AV66CliArt ;
                  AV105i = (int)(AV105i+1) ;
                  AV9filexml.writeEndElement();
               }
            }
            if ( ! brk56T6 )
            {
               brk56T6 = true ;
               pr_default.readNext(3);
            }
         }
         pr_default.close(3);
         /* Using cursor P056T6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV52Fec1, AV53Fec2, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk56T9 = false ;
            A428FacAlbTip = P056T6_A428FacAlbTip[0] ;
            A450FacPri = P056T6_A450FacPri[0] ;
            A430FacCod = P056T6_A430FacCod[0] ;
            A436FacFch = P056T6_A436FacFch[0] ;
            A12197FacUnds = P056T6_A12197FacUnds[0] ;
            A449FacPreMts = P056T6_A449FacPreMts[0] ;
            A448FacPreKgs = P056T6_A448FacPreKgs[0] ;
            A3883FacCliCod = P056T6_A3883FacCliCod[0] ;
            A454FacSer = P056T6_A454FacSer[0] ;
            A9646FacTot1 = P056T6_A9646FacTot1[0] ;
            A446FacLin = P056T6_A446FacLin[0] ;
            A450FacPri = P056T6_A450FacPri[0] ;
            A436FacFch = P056T6_A436FacFch[0] ;
            A9646FacTot1 = P056T6_A9646FacTot1[0] ;
            if ( ( ( A448FacPreKgs.doubleValue() > 0 ) || ( A449FacPreMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) )
            {
               AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P056T6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P056T6_A3883FacCliCod[0] == A3883FacCliCod ) && ( GXutil.strcmp(P056T6_A454FacSer[0], A454FacSer) == 0 ) )
               {
                  brk56T9 = false ;
                  A428FacAlbTip = P056T6_A428FacAlbTip[0] ;
                  A450FacPri = P056T6_A450FacPri[0] ;
                  A430FacCod = P056T6_A430FacCod[0] ;
                  A436FacFch = P056T6_A436FacFch[0] ;
                  A12197FacUnds = P056T6_A12197FacUnds[0] ;
                  A449FacPreMts = P056T6_A449FacPreMts[0] ;
                  A448FacPreKgs = P056T6_A448FacPreKgs[0] ;
                  A446FacLin = P056T6_A446FacLin[0] ;
                  A450FacPri = P056T6_A450FacPri[0] ;
                  A436FacFch = P056T6_A436FacFch[0] ;
                  if ( (( GXutil.resetTime(A436FacFch).after( GXutil.resetTime( AV52Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV52Fec1)) )) )
                  {
                     if ( (( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV53Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV53Fec2)) )) )
                     {
                        if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                        {
                           if ( A430FacCod >= AV71Faccod1 )
                           {
                              if ( A430FacCod <= AV72FacCod2 )
                              {
                                 if ( A428FacAlbTip == 2 )
                                 {
                                    if ( ( ( A448FacPreKgs.doubleValue() > 0 ) || ( A449FacPreMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) )
                                    {
                                       AV66CliArt = GXutil.str( A3883FacCliCod, 6, 0) + "-" + httpContext.getMessage( "COMERCIAL", "") ;
                                       AV67FacSer = A454FacSer ;
                                       AV68FacClicod = A3883FacCliCod ;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  brk56T9 = true ;
                  pr_default.readNext(4);
               }
               AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
               AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
               AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "SERIES", ""));
               AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), httpContext.getMessage( "COMERCIAL", ""));
               AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), GXutil.trim( AV66CliArt));
               AV9filexml.writeEndElement();
               AV104Tab_Art[AV105i-1] = AV66CliArt ;
               AV105i = (int)(AV105i+1) ;
            }
            if ( ! brk56T9 )
            {
               brk56T9 = true ;
               pr_default.readNext(4);
            }
         }
         pr_default.close(4);
         /* Using cursor P056T7 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV52Fec1, AV53Fec2, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            brk56T11 = false ;
            A450FacPri = P056T7_A450FacPri[0] ;
            A9646FacTot1 = P056T7_A9646FacTot1[0] ;
            A430FacCod = P056T7_A430FacCod[0] ;
            A436FacFch = P056T7_A436FacFch[0] ;
            A12197FacUnds = P056T7_A12197FacUnds[0] ;
            A447FacMts = P056T7_A447FacMts[0] ;
            A444FacKgs = P056T7_A444FacKgs[0] ;
            A428FacAlbTip = P056T7_A428FacAlbTip[0] ;
            A3883FacCliCod = P056T7_A3883FacCliCod[0] ;
            A454FacSer = P056T7_A454FacSer[0] ;
            A446FacLin = P056T7_A446FacLin[0] ;
            A450FacPri = P056T7_A450FacPri[0] ;
            A9646FacTot1 = P056T7_A9646FacTot1[0] ;
            A436FacFch = P056T7_A436FacFch[0] ;
            if ( ( ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A447FacMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) )
            {
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P056T7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P056T7_A3883FacCliCod[0] == A3883FacCliCod ) && ( GXutil.strcmp(P056T7_A454FacSer[0], A454FacSer) == 0 ) )
               {
                  brk56T11 = false ;
                  A450FacPri = P056T7_A450FacPri[0] ;
                  A9646FacTot1 = P056T7_A9646FacTot1[0] ;
                  A430FacCod = P056T7_A430FacCod[0] ;
                  A436FacFch = P056T7_A436FacFch[0] ;
                  A12197FacUnds = P056T7_A12197FacUnds[0] ;
                  A447FacMts = P056T7_A447FacMts[0] ;
                  A444FacKgs = P056T7_A444FacKgs[0] ;
                  A428FacAlbTip = P056T7_A428FacAlbTip[0] ;
                  A446FacLin = P056T7_A446FacLin[0] ;
                  A450FacPri = P056T7_A450FacPri[0] ;
                  A9646FacTot1 = P056T7_A9646FacTot1[0] ;
                  A436FacFch = P056T7_A436FacFch[0] ;
                  if ( (( GXutil.resetTime(A436FacFch).after( GXutil.resetTime( AV52Fec1 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV52Fec1)) )) )
                  {
                     if ( (( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV53Fec2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A436FacFch), GXutil.resetTime(AV53Fec2)) )) )
                     {
                        if ( A9646FacTot1.doubleValue() == 0 )
                        {
                           if ( GXutil.strcmp(A450FacPri, "1") == 0 )
                           {
                              if ( A430FacCod >= AV71Faccod1 )
                              {
                                 if ( A430FacCod <= AV72FacCod2 )
                                 {
                                    if ( ( A444FacKgs.doubleValue() > 0 ) || ( A447FacMts.doubleValue() > 0 ) || ( ( A12197FacUnds > 0 ) ) )
                                    {
                                       if ( A428FacAlbTip == 2 )
                                       {
                                          AV66CliArt = GXutil.str( A3883FacCliCod, 6, 0) + "-" + httpContext.getMessage( "COMERCIAL", "") ;
                                       }
                                       else
                                       {
                                          AV66CliArt = GXutil.str( A3883FacCliCod, 6, 0) + "-" + A454FacSer ;
                                       }
                                       AV67FacSer = A454FacSer ;
                                       AV68FacClicod = A3883FacCliCod ;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  brk56T11 = true ;
                  pr_default.readNext(5);
               }
               /* Execute user subroutine: 'CTRLPRODUCT' */
               S171 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV106ExiPr == 0 )
               {
                  AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "SERIES", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), httpContext.getMessage( "COMERCIAL", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), GXutil.trim( AV66CliArt));
                  AV9filexml.writeEndElement();
               }
            }
            if ( ! brk56T11 )
            {
               brk56T11 = true ;
               pr_default.readNext(5);
            }
         }
         pr_default.close(5);
         AV87Nd = (short)(0) ;
         AV88Nc = (short)(0) ;
         /* Using cursor P056T8 */
         pr_default.execute(6, new Object[] {A396EmprCod, AV52Fec1, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2), AV53Fec2});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A450FacPri = P056T8_A450FacPri[0] ;
            A430FacCod = P056T8_A430FacCod[0] ;
            A1153FacTipFac = P056T8_A1153FacTipFac[0] ;
            A436FacFch = P056T8_A436FacFch[0] ;
            if ( A1153FacTipFac == 1 )
            {
               AV87Nd = (short)(AV87Nd+1) ;
            }
            if ( A1153FacTipFac == 2 )
            {
               AV88Nc = (short)(AV88Nc+1) ;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( AV87Nd > 0 )
         {
            AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), httpContext.getMessage( "NOTA_DEBITO", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "SERIES", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), httpContext.getMessage( "NOTA_DEBITO", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), httpContext.getMessage( "NOTA_DEBITO", ""));
            AV9filexml.writeEndElement();
         }
         if ( AV88Nc > 0 )
         {
            AV9filexml.writeStartElement(httpContext.getMessage( "Product", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductType", ""), httpContext.getMessage( "S", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), httpContext.getMessage( "NOTA_CREDITO", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductGroup", ""), httpContext.getMessage( "SERIES", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), httpContext.getMessage( "NOTA_CREDITO", ""));
            AV9filexml.writeElement(httpContext.getMessage( "ProductNumberCode", ""), httpContext.getMessage( "NOTA_CREDITO", ""));
            AV9filexml.writeEndElement();
         }
         AV9filexml.writeStartElement(httpContext.getMessage( "TaxTable", ""));
         /* Using cursor P056T9 */
         pr_default.execute(7);
         while ( (pr_default.getStatus(7) != 101) )
         {
            A588IvaPor = P056T9_A588IvaPor[0] ;
            n588IvaPor = P056T9_n588IvaPor[0] ;
            A953IvaCod = P056T9_A953IvaCod[0] ;
            AV9filexml.writeStartElement(httpContext.getMessage( "TaxTableEntry", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxType", ""), httpContext.getMessage( "IVA", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxCountryRegion", ""), httpContext.getMessage( "PT", ""));
            if ( A588IvaPor == 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "ISE", ""));
               AV9filexml.writeElement(httpContext.getMessage( "Description", ""), httpContext.getMessage( "Isenta", ""));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "NOR", ""));
               AV9filexml.writeElement(httpContext.getMessage( "Description", ""), httpContext.getMessage( "Normal", ""));
            }
            AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), GXutil.trim( GXutil.str( A588IvaPor, 2, 0)));
            AV9filexml.writeEndElement();
            pr_default.readNext(7);
         }
         pr_default.close(7);
         AV9filexml.writeEndElement();
         AV9filexml.writeEndElement();
         AV9filexml.writeStartElement(httpContext.getMessage( "SourceDocuments", ""));
         AV73Nfra = (short)(0) ;
         AV74TotalD = DecimalUtil.doubleToDec(0) ;
         AV75TotalC = DecimalUtil.doubleToDec(0) ;
         AV98Totalf = DecimalUtil.doubleToDec(0) ;
         AV9filexml.writeStartElement(httpContext.getMessage( "SalesInvoices", ""));
         /* Using cursor P056T10 */
         pr_default.execute(8, new Object[] {A396EmprCod, AV52Fec1, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2), AV53Fec2});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A450FacPri = P056T10_A450FacPri[0] ;
            A430FacCod = P056T10_A430FacCod[0] ;
            A436FacFch = P056T10_A436FacFch[0] ;
            A14226FacAnulada = P056T10_A14226FacAnulada[0] ;
            A1153FacTipFac = P056T10_A1153FacTipFac[0] ;
            A9644FacLiq2 = P056T10_A9644FacLiq2[0] ;
            A9643FacLiq1 = P056T10_A9643FacLiq1[0] ;
            A434FacDtoPP = P056T10_A434FacDtoPP[0] ;
            AV73Nfra = (short)(AV73Nfra+1) ;
            if ( GXutil.strcmp(A14226FacAnulada, httpContext.getMessage( "S", "")) == 0 )
            {
            }
            else
            {
               if ( AV158tcredit == 1 )
               {
                  if ( ( A1153FacTipFac == 0 ) || ( A1153FacTipFac == 4 ) || ( A1153FacTipFac == 2 ) )
                  {
                     AV75TotalC = AV75TotalC.add(A9644FacLiq2) ;
                  }
                  if ( A1153FacTipFac == 1 )
                  {
                     AV74TotalD = AV74TotalD.add(A9643FacLiq1) ;
                  }
               }
               else
               {
                  if ( ( A1153FacTipFac == 0 ) || ( A1153FacTipFac == 1 ) || ( A1153FacTipFac == 4 ) )
                  {
                     AV75TotalC = AV75TotalC.add(A9644FacLiq2) ;
                  }
                  if ( A1153FacTipFac == 2 )
                  {
                     if ( AV107Etm == 0 )
                     {
                        AV74TotalD = AV74TotalD.add(A9643FacLiq1) ;
                     }
                     else
                     {
                        if ( A434FacDtoPP.doubleValue() > 0 )
                        {
                           AV74TotalD = AV74TotalD.add(A9644FacLiq2) ;
                        }
                        else
                        {
                           AV74TotalD = AV74TotalD.add(A9643FacLiq1) ;
                        }
                     }
                  }
               }
            }
            pr_default.readNext(8);
         }
         pr_default.close(8);
         AV74TotalD = ((AV142tdebitcredit==1) ? AV140totaldebit : AV74TotalD) ;
         AV75TotalC = ((AV142tdebitcredit==1) ? AV141totalcredit : AV75TotalC) ;
         AV9filexml.writeElement(httpContext.getMessage( "NumberOfEntries", ""), GXutil.trim( GXutil.str( AV73Nfra, 4, 0)));
         AV9filexml.writeElement(httpContext.getMessage( "TotalDebit", ""), GXutil.trim( GXutil.str( AV74TotalD, 9, 2)));
         AV9filexml.writeElement(httpContext.getMessage( "TotalCredit", ""), GXutil.trim( GXutil.str( AV75TotalC, 9, 2)));
         AV117z = 1 ;
         GX_I = 1 ;
         while ( GX_I <= 10000 )
         {
            AV115Tab_Alb[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 10000 )
         {
            AV119Tab_Tip[GX_I-1] = (byte)(0) ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P056T11 */
         pr_default.execute(9, new Object[] {A396EmprCod, AV52Fec1, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2), AV53Fec2});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A14217MotAnuID = P056T11_A14217MotAnuID[0] ;
            n14217MotAnuID = P056T11_n14217MotAnuID[0] ;
            A450FacPri = P056T11_A450FacPri[0] ;
            A430FacCod = P056T11_A430FacCod[0] ;
            A436FacFch = P056T11_A436FacFch[0] ;
            A443FacIVAPor = P056T11_A443FacIVAPor[0] ;
            A11629MeivaId = P056T11_A11629MeivaId[0] ;
            n11629MeivaId = P056T11_n11629MeivaId[0] ;
            A10301Cod_pais = P056T11_A10301Cod_pais[0] ;
            n10301Cod_pais = P056T11_n10301Cod_pais[0] ;
            A1153FacTipFac = P056T11_A1153FacTipFac[0] ;
            A14230FacIDATe = P056T11_A14230FacIDATe[0] ;
            A14226FacAnulada = P056T11_A14226FacAnulada[0] ;
            A14227FacFecAnul = P056T11_A14227FacFecAnul[0] ;
            A14228MotAnuDc = P056T11_A14228MotAnuDc[0] ;
            A9605FacFirma = P056T11_A9605FacFirma[0] ;
            A9606FacHor = P056T11_A9606FacHor[0] ;
            A252CliCod = P056T11_A252CliCod[0] ;
            A260CliDom = P056T11_A260CliDom[0] ;
            A295CliPob = P056T11_A295CliPob[0] ;
            A4828CliCp2 = P056T11_A4828CliCp2[0] ;
            A256CliCp = P056T11_A256CliCp[0] ;
            A9646FacTot1 = P056T11_A9646FacTot1[0] ;
            A9644FacLiq2 = P056T11_A9644FacLiq2[0] ;
            A9645FacIva1 = P056T11_A9645FacIva1[0] ;
            A10301Cod_pais = P056T11_A10301Cod_pais[0] ;
            n10301Cod_pais = P056T11_n10301Cod_pais[0] ;
            A260CliDom = P056T11_A260CliDom[0] ;
            A295CliPob = P056T11_A295CliPob[0] ;
            A4828CliCp2 = P056T11_A4828CliCp2[0] ;
            A256CliCp = P056T11_A256CliCp[0] ;
            A14228MotAnuDc = P056T11_A14228MotAnuDc[0] ;
            AV95FacIVAPor = A443FacIVAPor ;
            AV111MEIVAID = ((A443FacIVAPor==0)&&(GXutil.strcmp(A11629MeivaId, "")==0) ? httpContext.getMessage( "M99", "") : A11629MeivaId) ;
            /* Execute user subroutine: 'MEIVA' */
            S201 ();
            if ( returnInSub )
            {
               pr_default.close(9);
               pr_default.close(9);
               pr_default.close(9);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV112MeivaDsc = ((A443FacIVAPor==0)&&(GXutil.strcmp(A11629MeivaId, "")==0) ? httpContext.getMessage( "Não sujeito; não tributado (ou similar)", "") : GXutil.trim( AV112MeivaDsc)) ;
            AV100Pais = httpContext.getMessage( "PT", "") ;
            AV101Cod_pais = A10301Cod_pais ;
            /* Execute user subroutine: 'PAIS' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(9);
               pr_default.close(9);
               pr_default.close(9);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV9filexml.writeStartElement(httpContext.getMessage( "Invoice", ""));
            AV76NFact = httpContext.getMessage( "FAC ", "") + GXutil.str( A1153FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
            AV9filexml.writeElement(httpContext.getMessage( "InvoiceNo", ""), GXutil.trim( AV76NFact));
            AV154ATCUD = ((GXutil.strcmp(A14230FacIDATe, "")!=0) ? GXutil.trim( A14230FacIDATe) : "0") ;
            AV9filexml.writeElement(httpContext.getMessage( "ATCUD", ""), AV154ATCUD);
            AV9filexml.writeStartElement(httpContext.getMessage( "DocumentStatus", ""));
            AV138Invoicestatus = ((GXutil.strcmp(A14226FacAnulada, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "A", "") : httpContext.getMessage( "N", "")) ;
            AV9filexml.writeElement(httpContext.getMessage( "InvoiceStatus", ""), AV138Invoicestatus);
            if ( GXutil.strcmp(AV138Invoicestatus, httpContext.getMessage( "S", "")) == 0 )
            {
               AV28VarAux = localUtil.ttoc( A14227FacFecAnul, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV78FecHh = AV31DateAux + httpContext.getMessage( "T", "") + AV29HhSys ;
            }
            else
            {
               AV55FecA = GXutil.str( GXutil.year( A436FacFch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( A436FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( A436FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
               AV77TimeA = httpContext.getMessage( "T00:00:00", "") ;
               AV78FecHh = AV55FecA + AV77TimeA ;
            }
            AV9filexml.writeElement(httpContext.getMessage( "InvoiceStatusDate", ""), GXutil.trim( AV78FecHh));
            if ( GXutil.strcmp(AV138Invoicestatus, httpContext.getMessage( "A", "")) == 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "Reason", ""), GXutil.trim( A14228MotAnuDc));
            }
            AV9filexml.writeElement(httpContext.getMessage( "SourceID", ""), "0");
            AV9filexml.writeElement(httpContext.getMessage( "SourceBilling", ""), httpContext.getMessage( "P", ""));
            AV9filexml.writeEndElement();
            if ( GXutil.strcmp(A9605FacFirma, " ") != 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "Hash", ""), GXutil.trim( A9605FacFirma));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "Hash", ""), "0");
            }
            AV9filexml.writeElement(httpContext.getMessage( "HashControl", ""), "1");
            AV9filexml.writeElement(httpContext.getMessage( "Period", ""), GXutil.trim( GXutil.str( GXutil.month( A436FacFch), 2, 0)));
            AV55FecA = GXutil.str( GXutil.year( A436FacFch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( A436FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( A436FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
            AV9filexml.writeElement(httpContext.getMessage( "InvoiceDate", ""), AV55FecA);
            AV99TipFra = httpContext.getMessage( "FT", "") ;
            if ( A1153FacTipFac == 1 )
            {
               AV99TipFra = httpContext.getMessage( "ND", "") ;
            }
            if ( A1153FacTipFac == 2 )
            {
               AV99TipFra = httpContext.getMessage( "NC", "") ;
            }
            AV9filexml.writeElement(httpContext.getMessage( "InvoiceType", ""), AV99TipFra);
            AV9filexml.writeStartElement(httpContext.getMessage( "SpecialRegimes", ""));
            AV9filexml.writeElement(httpContext.getMessage( "SelfBillingIndicator", ""), "0");
            AV9filexml.writeElement(httpContext.getMessage( "CashVATSchemeIndicator", ""), "0");
            AV9filexml.writeElement(httpContext.getMessage( "ThirdPartiesBillingIndicator", ""), "0");
            AV9filexml.writeEndElement();
            AV9filexml.writeElement(httpContext.getMessage( "SourceID", ""), "0");
            AV28VarAux = localUtil.ttoc( A9606FacHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV39FecHorSal = localUtil.ctot( AV28VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV38VarAux0 = AV39FecHorSal ;
            AV28VarAux = localUtil.ttoc( AV38VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
            AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
            if ( GXutil.month( AV30FecSys) < 10 )
            {
               AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
            }
            else
            {
               AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV30FecSys) < 10 )
            {
               AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
            }
            else
            {
               AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
            }
            AV78FecHh = AV31DateAux + httpContext.getMessage( "T", "") + AV29HhSys ;
            AV9filexml.writeElement(httpContext.getMessage( "SystemEntryDate", ""), AV78FecHh);
            AV9filexml.writeElement(httpContext.getMessage( "CustomerID", ""), GXutil.trim( GXutil.str( A252CliCod, 6, 0)));
            AV9filexml.writeStartElement(httpContext.getMessage( "ShipTo", ""));
            AV9filexml.writeStartElement(httpContext.getMessage( "Address", ""));
            AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( A260CliDom));
            if ( GXutil.strcmp(A295CliPob, " ") != 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( A295CliPob));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "City", ""), httpContext.getMessage( "Desconhecido", ""));
            }
            AV23Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            if ( GXutil.strcmp(AV23Cp, " ") != 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV23Cp));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), httpContext.getMessage( "Desconhecido", ""));
            }
            AV9filexml.writeElement(httpContext.getMessage( "Country", ""), AV100Pais);
            AV9filexml.writeEndElement();
            AV9filexml.writeEndElement();
            AV9filexml.writeStartElement(httpContext.getMessage( "ShipFrom", ""));
            AV9filexml.writeStartElement(httpContext.getMessage( "Address", ""));
            AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( A260CliDom));
            if ( GXutil.strcmp(A295CliPob, " ") != 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( A295CliPob));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "City", ""), httpContext.getMessage( "Desconhecido", ""));
            }
            AV23Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            if ( GXutil.strcmp(AV23Cp, " ") != 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV23Cp));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), httpContext.getMessage( "Desconhecido", ""));
            }
            AV9filexml.writeElement(httpContext.getMessage( "Country", ""), AV100Pais);
            AV9filexml.writeEndElement();
            AV9filexml.writeEndElement();
            AV78FecHh = AV31DateAux + httpContext.getMessage( "T", "") + AV29HhSys ;
            AV9filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), AV78FecHh);
            AV86FacTipFac = A1153FacTipFac ;
            AV59FacCod = A430FacCod ;
            AV103facfch = A436FacFch ;
            AV95FacIVAPor = A443FacIVAPor ;
            AV111MEIVAID = ((A443FacIVAPor==0)&&(GXutil.strcmp(A11629MeivaId, "")==0) ? httpContext.getMessage( "M99", "") : A11629MeivaId) ;
            /* Execute user subroutine: 'MEIVA' */
            S201 ();
            if ( returnInSub )
            {
               pr_default.close(9);
               pr_default.close(9);
               pr_default.close(9);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV112MeivaDsc = ((A443FacIVAPor==0)&&(GXutil.strcmp(A11629MeivaId, "")==0) ? httpContext.getMessage( "Não sujeito; não tributado (ou similar)", "") : GXutil.trim( AV112MeivaDsc)) ;
            if ( AV158tcredit == 1 )
            {
               AV139debitcredit = httpContext.getMessage( "CreditAmount", "") ;
            }
            else
            {
               AV139debitcredit = ((AV86FacTipFac==2) ? httpContext.getMessage( "DebitAmount", "") : httpContext.getMessage( "CreditAmount", "")) ;
            }
            if ( A9646FacTot1.doubleValue() == 0 )
            {
               /* Execute user subroutine: 'FACTURANULL' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(9);
                  pr_default.close(9);
                  pr_default.close(9);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'FACTURANOTNULL' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(9);
                  pr_default.close(9);
                  pr_default.close(9);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV81GrosTotal = A9646FacTot1 ;
            AV82NetTotal = A9644FacLiq2 ;
            AV83Taxpayable = A9645FacIva1 ;
            AV9filexml.writeStartElement(httpContext.getMessage( "DocumentTotals", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxPayable", ""), GXutil.trim( GXutil.str( AV83Taxpayable, 10, 2)));
            AV9filexml.writeElement(httpContext.getMessage( "NetTotal", ""), GXutil.trim( GXutil.str( AV82NetTotal, 10, 2)));
            AV9filexml.writeElement(httpContext.getMessage( "GrossTotal", ""), GXutil.trim( GXutil.str( AV81GrosTotal, 10, 2)));
            AV9filexml.writeEndElement();
            AV9filexml.writeEndElement();
            AV76NFact = " " ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         AV9filexml.writeEndElement();
         /* Execute user subroutine: 'MOVEMENTOFGOODS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9filexml.writeEndElement();
         AV9filexml.writeEndElement();
         AV9filexml.close();
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALPRD' Routine */
      returnInSub = false ;
      AV92CalPrd = (byte)(0) ;
      /* Using cursor P056T12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(AV85FacALbCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A30AlbProCod = P056T12_A30AlbProCod[0] ;
         A34AlbProfch = P056T12_A34AlbProfch[0] ;
         AV84FecAlb = A34AlbProfch ;
         AV92CalPrd = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( )
   {
      /* 'CALCOM' Routine */
      returnInSub = false ;
      AV91Calcom = (byte)(0) ;
      /* Using cursor P056T13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(AV85FacALbCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A14AlbComCod = P056T13_A14AlbComCod[0] ;
         A17AlbComFch = P056T13_A17AlbComFch[0] ;
         AV84FecAlb = A17AlbComFch ;
         AV91Calcom = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S131( )
   {
      /* 'PAIS' Routine */
      returnInSub = false ;
      /* Using cursor P056T14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(AV101Cod_pais)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A10301Cod_pais = P056T14_A10301Cod_pais[0] ;
         n10301Cod_pais = P056T14_n10301Cod_pais[0] ;
         A10302Dsc_pais = P056T14_A10302Dsc_pais[0] ;
         n10302Dsc_pais = P056T14_n10302Dsc_pais[0] ;
         AV100Pais = GXutil.substring( A10302Dsc_pais, 1, 2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S141( )
   {
      /* 'FACTURANULL' Routine */
      returnInSub = false ;
      AV102SiLine = (byte)(0) ;
      /* Using cursor P056T15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV59FacCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A430FacCod = P056T15_A430FacCod[0] ;
         A12197FacUnds = P056T15_A12197FacUnds[0] ;
         A447FacMts = P056T15_A447FacMts[0] ;
         A444FacKgs = P056T15_A444FacKgs[0] ;
         A427FacAlbCod = P056T15_A427FacAlbCod[0] ;
         A428FacAlbTip = P056T15_A428FacAlbTip[0] ;
         A454FacSer = P056T15_A454FacSer[0] ;
         A3883FacCliCod = P056T15_A3883FacCliCod[0] ;
         A9708FacDscII = P056T15_A9708FacDscII[0] ;
         A432FacDsc = P056T15_A432FacDsc[0] ;
         A9649FacPKDto = P056T15_A9649FacPKDto[0] ;
         A9647FacImpdto = P056T15_A9647FacImpdto[0] ;
         A9650FacPMdto = P056T15_A9650FacPMdto[0] ;
         A449FacPreMts = P056T15_A449FacPreMts[0] ;
         A448FacPreKgs = P056T15_A448FacPreKgs[0] ;
         A446FacLin = P056T15_A446FacLin[0] ;
         if ( ( ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A447FacMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) )
         {
            AV102SiLine = (byte)(1) ;
            AV9filexml.writeStartElement(httpContext.getMessage( "Line", ""));
            AV9filexml.writeElement(httpContext.getMessage( "LineNumber", ""), GXutil.trim( GXutil.str( A446FacLin, 6, 0)));
            AV9filexml.writeStartElement(httpContext.getMessage( "OrderReferences", ""));
            AV9filexml.writeElement(httpContext.getMessage( "OriginatingON", ""), GXutil.trim( GXutil.str( A427FacAlbCod, 10, 0)));
            AV85FacALbCod = A427FacAlbCod ;
            AV118FacAlbTip = A428FacAlbTip ;
            AV84FecAlb = GXutil.nullDate() ;
            AV55FecA = GXutil.str( GXutil.year( AV103facfch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
            if ( A428FacAlbTip == 1 )
            {
               /* Execute user subroutine: 'CALPRD' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(13);
                  returnInSub = true;
                  if (true) return;
               }
               if ( AV92CalPrd == 1 )
               {
                  AV55FecA = GXutil.str( GXutil.year( AV84FecAlb), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
               }
            }
            if ( A428FacAlbTip == 2 )
            {
               /* Execute user subroutine: 'CALCOM' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(13);
                  returnInSub = true;
                  if (true) return;
               }
               if ( AV91Calcom == 1 )
               {
                  AV55FecA = GXutil.str( GXutil.year( AV84FecAlb), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
               }
            }
            AV9filexml.writeElement(httpContext.getMessage( "OrderDate", ""), AV55FecA);
            AV9filexml.writeEndElement();
            if ( ( AV86FacTipFac == 0 ) || ( AV86FacTipFac == 4 ) )
            {
               AV66CliArt = GXutil.trim( GXutil.str( A3883FacCliCod, 6, 0)) + "-" + GXutil.trim( A454FacSer) ;
               AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
            }
            AV80ProductDsc = A9708FacDscII ;
            if ( GXutil.strcmp(A9708FacDscII, " ") == 0 )
            {
               AV80ProductDsc = A432FacDsc ;
            }
            AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV80ProductDsc));
            if ( A428FacAlbTip == 1 )
            {
               if ( A444FacKgs.doubleValue() > 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A9649FacPKDto, 13, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
               }
               if ( A447FacMts.doubleValue() > 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A447FacMts, 9, 2)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A9650FacPMdto, 13, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
               }
               if ( A12197FacUnds > 0 )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A12197FacUnds, 6, 0)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "UN", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A9650FacPMdto, 13, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( A432FacDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
               }
            }
            else
            {
               if ( A428FacAlbTip == 2 )
               {
                  if ( A447FacMts.doubleValue() > 0 )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A447FacMts, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A449FacPreMts, 13, 5)));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
                  if ( A444FacKgs.doubleValue() > 0 )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A448FacPreKgs, 13, 5)));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
               }
            }
            AV9filexml.writeStartElement(httpContext.getMessage( "Tax", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxType", ""), httpContext.getMessage( "IVA", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxCountryRegion", ""), AV100Pais);
            if ( AV95FacIVAPor > 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "NOR", ""));
               AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), GXutil.trim( GXutil.str( AV95FacIVAPor, 2, 0)));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "ISE", ""));
               AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), "0");
            }
            AV9filexml.writeEndElement();
            if ( AV95FacIVAPor == 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxExemptionReason", ""), GXutil.trim( AV112MeivaDsc));
               AV9filexml.writeElement(httpContext.getMessage( "TaxExemptionCode", ""), AV111MEIVAID);
            }
            AV9filexml.writeEndElement();
            /* Execute user subroutine: 'ARRAYALBARANES' */
            S1520 ();
            if ( returnInSub )
            {
               pr_default.close(13);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S161( )
   {
      /* 'FACTURANOTNULL' Routine */
      returnInSub = false ;
      AV102SiLine = (byte)(0) ;
      /* Using cursor P056T16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV59FacCod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A430FacCod = P056T16_A430FacCod[0] ;
         A5353FacImpMan = P056T16_A5353FacImpMan[0] ;
         A12197FacUnds = P056T16_A12197FacUnds[0] ;
         A12198FacPreUnd = P056T16_A12198FacPreUnd[0] ;
         A447FacMts = P056T16_A447FacMts[0] ;
         A449FacPreMts = P056T16_A449FacPreMts[0] ;
         A444FacKgs = P056T16_A444FacKgs[0] ;
         A448FacPreKgs = P056T16_A448FacPreKgs[0] ;
         A1153FacTipFac = P056T16_A1153FacTipFac[0] ;
         A427FacAlbCod = P056T16_A427FacAlbCod[0] ;
         A428FacAlbTip = P056T16_A428FacAlbTip[0] ;
         A454FacSer = P056T16_A454FacSer[0] ;
         A3883FacCliCod = P056T16_A3883FacCliCod[0] ;
         A432FacDsc = P056T16_A432FacDsc[0] ;
         A9708FacDscII = P056T16_A9708FacDscII[0] ;
         A3897FacKgsA = P056T16_A3897FacKgsA[0] ;
         A9649FacPKDto = P056T16_A9649FacPKDto[0] ;
         A9647FacImpdto = P056T16_A9647FacImpdto[0] ;
         A3898FacPreKgsA = P056T16_A3898FacPreKgsA[0] ;
         A9650FacPMdto = P056T16_A9650FacPMdto[0] ;
         A446FacLin = P056T16_A446FacLin[0] ;
         A1153FacTipFac = P056T16_A1153FacTipFac[0] ;
         if ( ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) ) || ( ( A12198FacPreUnd.doubleValue() > 0 ) && ( A12197FacUnds > 0 ) ) || ( ( A5353FacImpMan.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) ) )
         {
            AV76NFact = httpContext.getMessage( "FAC ", "") + GXutil.str( A1153FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) + httpContext.getMessage( " Linea Factura ", "") + GXutil.trim( GXutil.str( A446FacLin, 6, 0)) ;
            Gx_msg = httpContext.getMessage( "Procesando... ", "") + AV76NFact ;
            AV102SiLine = (byte)(1) ;
            AV9filexml.writeStartElement(httpContext.getMessage( "Line", ""));
            AV9filexml.writeElement(httpContext.getMessage( "LineNumber", ""), GXutil.trim( GXutil.str( A446FacLin, 6, 0)));
            AV9filexml.writeStartElement(httpContext.getMessage( "OrderReferences", ""));
            AV9filexml.writeElement(httpContext.getMessage( "OriginatingON", ""), GXutil.trim( GXutil.str( A427FacAlbCod, 10, 0)));
            AV85FacALbCod = A427FacAlbCod ;
            AV118FacAlbTip = A428FacAlbTip ;
            AV84FecAlb = GXutil.nullDate() ;
            AV55FecA = GXutil.str( GXutil.year( AV103facfch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
            if ( A428FacAlbTip == 1 )
            {
               /* Execute user subroutine: 'CALPRD' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(14);
                  pr_default.close(14);
                  returnInSub = true;
                  if (true) return;
               }
               if ( AV92CalPrd == 1 )
               {
                  AV55FecA = GXutil.str( GXutil.year( AV84FecAlb), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
               }
            }
            if ( A428FacAlbTip == 2 )
            {
               /* Execute user subroutine: 'CALCOM' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(14);
                  pr_default.close(14);
                  returnInSub = true;
                  if (true) return;
               }
               if ( AV91Calcom == 1 )
               {
                  AV55FecA = GXutil.str( GXutil.year( AV84FecAlb), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV84FecAlb, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
               }
            }
            AV9filexml.writeElement(httpContext.getMessage( "OrderDate", ""), AV55FecA);
            AV9filexml.writeEndElement();
            if ( ( AV86FacTipFac == 0 ) || ( AV86FacTipFac == 4 ) )
            {
               AV66CliArt = GXutil.trim( GXutil.str( A3883FacCliCod, 6, 0)) + "-" + GXutil.trim( A454FacSer) ;
               AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
            }
            if ( AV86FacTipFac == 1 )
            {
               AV66CliArt = httpContext.getMessage( "NOTA_DEBITO", "") ;
               AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
            }
            if ( AV86FacTipFac == 2 )
            {
               AV66CliArt = httpContext.getMessage( "NOTA_CREDITO", "") ;
               AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( AV66CliArt));
            }
            AV80ProductDsc = ((GXutil.strcmp("", A9708FacDscII)==0) ? A432FacDsc : A9708FacDscII) ;
            AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV80ProductDsc));
            AV96PrecKg = (byte)(0) ;
            AV97PrecMt = (byte)(0) ;
            if ( A428FacAlbTip == 1 )
            {
               if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A3897FacKgsA.doubleValue() == 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A9649FacPKDto, 13, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  AV96PrecKg = (byte)(1) ;
               }
               if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A3897FacKgsA.doubleValue() == 1 ) && ( A444FacKgs.doubleValue() > 0 ) )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A9649FacPKDto, 16, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV144implinea = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                  AV145facimp = GXutil.roundDecimal( AV144implinea, 2) ;
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( AV145facimp, 16, 5)));
                  AV96PrecKg = (byte)(1) ;
               }
               if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
               {
                  if ( AV96PrecKg == 0 )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A447FacMts, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A9650FacPMdto, 13, 5)));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
               }
               if ( ( A12198FacPreUnd.doubleValue() > 0 ) && ( A12197FacUnds > 0 ) )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A12197FacUnds, 6, 0)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "UN", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A12198FacPreUnd, 13, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( A432FacDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
               }
               if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) && ( A5353FacImpMan.doubleValue() > 0 ) )
               {
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                  AV143PrecioKg = A5353FacImpMan.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( AV143PrecioKg, 13, 5)));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A5353FacImpMan, 16, 5)));
               }
            }
            else
            {
               if ( A428FacAlbTip == 2 )
               {
                  if ( ( A447FacMts.doubleValue() > 0 ) && ( A449FacPreMts.doubleValue() != 0 ) )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A447FacMts, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A449FacPreMts, 13, 5)));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
                  if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() != 0 ) )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A448FacPreKgs, 13, 5)));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
                  if ( ( A12197FacUnds > 0 ) && ( A12198FacPreUnd.doubleValue() != 0 ) )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A12197FacUnds, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "UN", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A12198FacPreUnd, 13, 5)));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
               }
               else
               {
                  if ( ( A12197FacUnds > 0 ) && ( A12198FacPreUnd.doubleValue() != 0 ) )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A12197FacUnds, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "UN", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A12198FacPreUnd, 13, 5)));
                     AV55FecA = GXutil.str( GXutil.year( AV103facfch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
                  if ( ( A447FacMts.doubleValue() > 0 ) && ( A449FacPreMts.doubleValue() != 0 ) )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A447FacMts, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A449FacPreMts, 13, 5)));
                     AV55FecA = GXutil.str( GXutil.year( AV103facfch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
                  if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() != 0 ) )
                  {
                     AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( GXutil.str( A444FacKgs, 9, 2)));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), GXutil.trim( GXutil.str( A448FacPreKgs, 13, 5)));
                     AV55FecA = GXutil.str( GXutil.year( AV103facfch), 4, 0) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2) + "-" + GXutil.substring( localUtil.dtoc( AV103facfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2) ;
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPointDate", ""), AV55FecA);
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV80ProductDsc));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(GXutil.trim( AV139debitcredit), GXutil.trim( GXutil.str( A9647FacImpdto, 16, 5)));
                  }
               }
            }
            AV9filexml.writeStartElement(httpContext.getMessage( "Tax", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxType", ""), httpContext.getMessage( "IVA", ""));
            AV9filexml.writeElement(httpContext.getMessage( "TaxCountryRegion", ""), AV100Pais);
            if ( AV95FacIVAPor > 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "NOR", ""));
               AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), GXutil.trim( GXutil.str( AV95FacIVAPor, 2, 0)));
            }
            else
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "ISE", ""));
               AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), "0");
            }
            AV9filexml.writeEndElement();
            if ( AV95FacIVAPor == 0 )
            {
               AV9filexml.writeElement(httpContext.getMessage( "TaxExemptionReason", ""), GXutil.trim( AV112MeivaDsc));
               AV9filexml.writeElement(httpContext.getMessage( "TaxExemptionCode", ""), AV111MEIVAID);
            }
            AV9filexml.writeEndElement();
            /* Execute user subroutine: 'ARRAYALBARANES' */
            S1520 ();
            if ( returnInSub )
            {
               pr_default.close(14);
               pr_default.close(14);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S171( )
   {
      /* 'CTRLPRODUCT' Routine */
      returnInSub = false ;
      AV105i = 1 ;
      AV106ExiPr = (byte)(0) ;
      while ( AV105i <= 1000 )
      {
         if ( GXutil.strcmp(AV104Tab_Art[AV105i-1], " ") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV66CliArt, AV104Tab_Art[AV105i-1]) == 0 )
         {
            AV106ExiPr = (byte)(1) ;
            if (true) break;
         }
         AV105i = (int)(AV105i+1) ;
      }
   }

   public void S1520( )
   {
      /* 'ARRAYALBARANES' Routine */
      returnInSub = false ;
      if ( AV85FacALbCod > 0 )
      {
         AV114x = 1 ;
         AV116AltaAlb = (byte)(0) ;
         while ( AV114x <= 10000 )
         {
            if ( AV115Tab_Alb[AV114x-1] == 0 )
            {
               if (true) break;
            }
            if ( AV115Tab_Alb[AV114x-1] == AV85FacALbCod )
            {
               AV116AltaAlb = (byte)(1) ;
               if (true) break;
            }
            AV114x = (int)(AV114x+1) ;
         }
         if ( AV116AltaAlb == 0 )
         {
            AV115Tab_Alb[AV117z-1] = AV85FacALbCod ;
            AV119Tab_Tip[AV117z-1] = AV118FacAlbTip ;
            AV117z = (int)(AV117z+1) ;
         }
      }
   }

   public void S181( )
   {
      /* 'MOVEMENTOFGOODS' Routine */
      returnInSub = false ;
      GXt_int1 = AV120NoMtsAt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOMTAT", ""), GXv_int2) ;
      psaft1401.this.GXt_int1 = GXv_int2[0] ;
      AV120NoMtsAt = GXt_int1 ;
      AV121NofMlines = 0 ;
      AV122TQIssued = DecimalUtil.doubleToDec(0) ;
      AV114x = 1 ;
      while ( AV114x <= 10000 )
      {
         if ( AV115Tab_Alb[AV114x-1] == 0 )
         {
            if (true) break;
         }
         AV85FacALbCod = AV115Tab_Alb[AV114x-1] ;
         AV118FacAlbTip = AV119Tab_Tip[AV114x-1] ;
         if ( AV118FacAlbTip == 1 )
         {
            /* Using cursor P056T17 */
            pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(AV85FacALbCod)});
            while ( (pr_default.getStatus(15) != 101) )
            {
               A130BarCodPar = P056T17_A130BarCodPar[0] ;
               A132BarCodReo = P056T17_A132BarCodReo[0] ;
               A129BarCod = P056T17_A129BarCod[0] ;
               A30AlbProCod = P056T17_A30AlbProCod[0] ;
               A1263BarAlbMtrE = P056T17_A1263BarAlbMtrE[0] ;
               A1261BarAlbKgmE = P056T17_A1261BarAlbKgmE[0] ;
               if ( ( A1261BarAlbKgmE.doubleValue() == 0 ) && ( A1263BarAlbMtrE.doubleValue() == 0 ) )
               {
                  /* Using cursor P056T18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(16) != 101) )
                  {
                     A1276FasMtr = P056T18_A1276FasMtr[0] ;
                     A1275FasKgm = P056T18_A1275FasKgm[0] ;
                     A1240GuiFasLin = P056T18_A1240GuiFasLin[0] ;
                     if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() > 0 ) )
                     {
                        AV122TQIssued = AV122TQIssued.add(A1275FasKgm) ;
                     }
                     else if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() == 0 ) )
                     {
                        AV122TQIssued = AV122TQIssued.add(A1275FasKgm) ;
                     }
                     else if ( ( A1276FasMtr.doubleValue() > 0 ) && ( A1275FasKgm.doubleValue() == 0 ) )
                     {
                        AV122TQIssued = AV122TQIssued.add(A1276FasMtr) ;
                     }
                     AV121NofMlines = (int)(AV121NofMlines+1) ;
                     pr_default.readNext(16);
                  }
                  pr_default.close(16);
               }
               else
               {
                  if ( A1261BarAlbKgmE.doubleValue() > 0 )
                  {
                     AV122TQIssued = AV122TQIssued.add(A1261BarAlbKgmE) ;
                  }
                  else if ( ( A1263BarAlbMtrE.doubleValue() > 0 ) && ( AV120NoMtsAt == 0 ) )
                  {
                     AV122TQIssued = AV122TQIssued.add(A1263BarAlbMtrE) ;
                  }
                  AV121NofMlines = (int)(AV121NofMlines+1) ;
               }
               pr_default.readNext(15);
            }
            pr_default.close(15);
         }
         else if ( AV118FacAlbTip == 2 )
         {
            /* Optimized group. */
            /* Using cursor P056T19 */
            pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(AV85FacALbCod)});
            cV121NofMlines = P056T19_AV121NofMlines[0] ;
            c13AlbComCnt = P056T19_A13AlbComCnt[0] ;
            pr_default.close(17);
            AV121NofMlines = (int)(AV121NofMlines+cV121NofMlines*1) ;
            AV122TQIssued = AV122TQIssued.add(c13AlbComCnt) ;
            /* End optimized group. */
         }
         AV114x = (int)(AV114x+1) ;
      }
      AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( AV122TQIssued, 9, 2)), (short)(9), " ") ;
      AV9filexml.writeStartElement(httpContext.getMessage( "MovementOfGoods", ""));
      AV9filexml.writeElement(httpContext.getMessage( "NumberOfMovementLines", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121NofMlines), 6, 0));
      AV9filexml.writeElement(httpContext.getMessage( "TotalQuantityIssued", ""), GXutil.trim( AV41VarKgs));
      AV114x = 1 ;
      while ( AV114x <= 10000 )
      {
         if ( AV115Tab_Alb[AV114x-1] == 0 )
         {
            if (true) break;
         }
         AV85FacALbCod = AV115Tab_Alb[AV114x-1] ;
         AV118FacAlbTip = AV119Tab_Tip[AV114x-1] ;
         if ( AV118FacAlbTip == 1 )
         {
            /* Using cursor P056T20 */
            pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(AV85FacALbCod)});
            while ( (pr_default.getStatus(18) != 101) )
            {
               A30AlbProCod = P056T20_A30AlbProCod[0] ;
               A1243GuiRemCli = P056T20_A1243GuiRemCli[0] ;
               A39AlbProPri = P056T20_A39AlbProPri[0] ;
               A14069AlbPdATCUD = P056T20_A14069AlbPdATCUD[0] ;
               A3865AlbHorSal = P056T20_A3865AlbHorSal[0] ;
               A4023AlbFecSal = P056T20_A4023AlbFecSal[0] ;
               A10017AlbFmd = P056T20_A10017AlbFmd[0] ;
               n10017AlbFmd = P056T20_n10017AlbFmd[0] ;
               A10019AlbHhfm = P056T20_A10019AlbHhfm[0] ;
               A7101AlbLic = P056T20_A7101AlbLic[0] ;
               AV125Guiremcli = A1243GuiRemCli ;
               /* Execute user subroutine: 'CLIENT' */
               S1925 ();
               if ( returnInSub )
               {
                  pr_default.close(18);
                  returnInSub = true;
                  if (true) return;
               }
               AV9filexml.writeStartElement(httpContext.getMessage( "StockMovement", ""));
               AV123DocumentNumber = ((GXutil.strcmp(A39AlbProPri, "1")==0) ? httpContext.getMessage( "GR 1/", "")+GXutil.trim( GXutil.str( AV85FacALbCod, 10, 0)) : httpContext.getMessage( "GT 1/", "")+GXutil.trim( GXutil.str( AV85FacALbCod, 10, 0))) ;
               AV9filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), AV123DocumentNumber);
               AV154ATCUD = ((GXutil.strcmp(A14069AlbPdATCUD, " ")!=0) ? GXutil.trim( A14069AlbPdATCUD) : "0") ;
               AV9filexml.writeElement(httpContext.getMessage( "ATCUD", ""), AV154ATCUD);
               AV9filexml.writeStartElement(httpContext.getMessage( "DocumentStatus", ""));
               AV9filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
               AV28VarAux = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
               AV39FecHorSal = localUtil.ctot( AV28VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV38VarAux0 = AV39FecHorSal ;
               AV28VarAux = localUtil.ttoc( AV38VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV135MovementStatusDate = AV31DateAux + httpContext.getMessage( "T", "") + AV29HhSys ;
               AV9filexml.writeElement(httpContext.getMessage( "MovementStatusDate", ""), AV31DateAux+httpContext.getMessage( "T", "")+AV29HhSys);
               AV9filexml.writeElement(httpContext.getMessage( "SourceID", ""), "0");
               AV9filexml.writeElement(httpContext.getMessage( "SourceBilling", ""), httpContext.getMessage( "P", ""));
               AV9filexml.writeEndElement();
               AV134AlbFmd = ((GXutil.strcmp(A10017AlbFmd, "")!=0) ? A10017AlbFmd : "0") ;
               AV9filexml.writeElement(httpContext.getMessage( "Hash", ""), GXutil.trim( AV134AlbFmd));
               AV9filexml.writeElement(httpContext.getMessage( "HashControl", ""), "1");
               AV9filexml.writeElement(httpContext.getMessage( "Period", ""), GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)));
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( A4023AlbFecSal), 10, 0)) ;
               if ( GXutil.month( A4023AlbFecSal) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)) ;
               }
               if ( GXutil.day( A4023AlbFecSal) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A4023AlbFecSal), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( A4023AlbFecSal), 10, 0)) ;
               }
               AV128MovementDate = AV31DateAux ;
               AV9filexml.writeElement(httpContext.getMessage( "MovementDate", ""), AV128MovementDate);
               AV9filexml.writeElement(httpContext.getMessage( "MovementType", ""), httpContext.getMessage( "GR", ""));
               AV28VarAux = localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV136SystemEntryDate = ((GXutil.strcmp(A10017AlbFmd, "")!=0) ? AV31DateAux+httpContext.getMessage( "T", "")+AV29HhSys : AV135MovementStatusDate) ;
               AV9filexml.writeElement(httpContext.getMessage( "SystemEntryDate", ""), AV136SystemEntryDate);
               AV9filexml.writeElement(httpContext.getMessage( "CustomerID", ""), GXutil.trim( GXutil.str( A1243GuiRemCli, 6, 0)));
               AV9filexml.writeElement(httpContext.getMessage( "SourceID", ""), "0");
               AV9filexml.writeStartElement(httpContext.getMessage( "ShipFrom", ""));
               AV9filexml.writeElement(httpContext.getMessage( "DeliveryID", ""), "00-00-00");
               AV9filexml.writeElement(httpContext.getMessage( "DeliveryDate", ""), AV128MovementDate);
               AV9filexml.writeStartElement(httpContext.getMessage( "Address", ""));
               AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( AV21CliDom));
               AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV22CliPob));
               AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), AV23Cp);
               AV9filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
               AV9filexml.writeEndElement();
               AV9filexml.writeEndElement();
               AV28VarAux = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
               AV39FecHorSal = localUtil.ctot( AV28VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV38VarAux0 = AV39FecHorSal ;
               AV28VarAux = localUtil.ttoc( AV38VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV9filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), AV31DateAux+httpContext.getMessage( "T", "")+AV29HhSys);
               AV130AlbLic = ((GXutil.strcmp(A7101AlbLic, "")!=0) ? A7101AlbLic : "0") ;
               AV9filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( AV130AlbLic));
               Gx_msg = AV76NFact + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( " MovementofGoods.Procesando Guias...tabla ALBBAR, Nº Guia ", "") + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) + GXutil.newLine( ) ;
               AV126Nlinea = (short)(0) ;
               /* Using cursor P056T21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               while ( (pr_default.getStatus(19) != 101) )
               {
                  A130BarCodPar = P056T21_A130BarCodPar[0] ;
                  A132BarCodReo = P056T21_A132BarCodReo[0] ;
                  A129BarCod = P056T21_A129BarCod[0] ;
                  A4812BarEncCli = P056T21_A4812BarEncCli[0] ;
                  A143BarDisNum = P056T21_A143BarDisNum[0] ;
                  A4815AlbEncCli = P056T21_A4815AlbEncCli[0] ;
                  A12195BarAlbUnd = P056T21_A12195BarAlbUnd[0] ;
                  A12196BarPreUnd = P056T21_A12196BarPreUnd[0] ;
                  A2010BarTipDis = P056T21_A2010BarTipDis[0] ;
                  A1263BarAlbMtrE = P056T21_A1263BarAlbMtrE[0] ;
                  A1261BarAlbKgmE = P056T21_A1261BarAlbKgmE[0] ;
                  A1652BarSerDsc = P056T21_A1652BarSerDsc[0] ;
                  A212BarSer = P056T21_A212BarSer[0] ;
                  A4812BarEncCli = P056T21_A4812BarEncCli[0] ;
                  A143BarDisNum = P056T21_A143BarDisNum[0] ;
                  A2010BarTipDis = P056T21_A2010BarTipDis[0] ;
                  A1652BarSerDsc = P056T21_A1652BarSerDsc[0] ;
                  A212BarSer = P056T21_A212BarSer[0] ;
                  AV127Barenccli = ((GXutil.strcmp(A143BarDisNum, "")!=0) ? A143BarDisNum : ((GXutil.strcmp(A4812BarEncCli, "")==0) ? httpContext.getMessage( "Desconhecido", "") : GXutil.trim( A4812BarEncCli))) ;
                  AV127Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0)&&!(GXutil.strcmp("", A4815AlbEncCli)==0) ? GXutil.trim( A4815AlbEncCli) : GXutil.trim( AV127Barenccli)) ;
                  if ( ( ( A1261BarAlbKgmE.doubleValue() == 0 ) && ( A1263BarAlbMtrE.doubleValue() == 0 ) && ( GXutil.strcmp(A2010BarTipDis, "L") != 0 ) ) || ( ( GXutil.strcmp(A2010BarTipDis, "L") == 0 ) && ( A12196BarPreUnd.doubleValue() == 0 ) && ( A12195BarAlbUnd > 0 ) ) )
                  {
                     Gx_msg = AV76NFact + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( " MovementofGoods.Procesando Guias...tabla ALBFAS, Nº Guia ", "") + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) + GXutil.newLine( ) ;
                     /* Using cursor P056T22 */
                     pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     while ( (pr_default.getStatus(20) != 101) )
                     {
                        A457FasCod = P056T22_A457FasCod[0] ;
                        A1276FasMtr = P056T22_A1276FasMtr[0] ;
                        A1275FasKgm = P056T22_A1275FasKgm[0] ;
                        A460FasDsc = P056T22_A460FasDsc[0] ;
                        A8194GuiFasPBK = P056T22_A8194GuiFasPBK[0] ;
                        n8194GuiFasPBK = P056T22_n8194GuiFasPBK[0] ;
                        A8195GuiFasPBM = P056T22_A8195GuiFasPBM[0] ;
                        n8195GuiFasPBM = P056T22_n8195GuiFasPBM[0] ;
                        A1240GuiFasLin = P056T22_A1240GuiFasLin[0] ;
                        A460FasDsc = P056T22_A460FasDsc[0] ;
                        AV126Nlinea = (short)(AV126Nlinea+1) ;
                        AV9filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "LineNumber", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126Nlinea), 4, 0));
                        AV9filexml.writeStartElement(httpContext.getMessage( "OrderReferences", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "OriginatingON", ""), GXutil.trim( AV127Barenccli));
                        AV9filexml.writeEndElement();
                        GXt_char9 = AV137FasDsc ;
                        GXv_char8[0] = GXt_char9 ;
                        new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A457FasCod, GXv_char8) ;
                        psaft1401.this.GXt_char9 = GXv_char8[0] ;
                        AV137FasDsc = GXt_char9 ;
                        AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( A457FasCod));
                        AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV137FasDsc));
                        new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(httpContext.getMessage( "Line=", "")+localUtil.format( DecimalUtil.doubleToDec(AV126Nlinea), "ZZZ9")+httpContext.getMessage( "AlbProCod", "")+GXutil.str( A30AlbProCod, 10, 0)+httpContext.getMessage( "barcod=", "")+GXutil.str( A129BarCod, 8, 0)+httpContext.getMessage( "Fascod=", "")+GXutil.trim( A457FasCod)+httpContext.getMessage( "Fasdsc=", "")+GXutil.trim( A460FasDsc)+httpContext.getMessage( "Faskgm=", "")+GXutil.str( A1275FasKgm, 9, 2)+httpContext.getMessage( "Fasmtr", "")+GXutil.str( A1276FasMtr, 9, 2), AV188Pgmname) ;
                        if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() > 0 ) )
                        {
                           AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)), (short)(9), " ") ;
                           AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                           AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                           AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        }
                        else if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() == 0 ) )
                        {
                           AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)), (short)(9), " ") ;
                           AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                           AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                           AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                           new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(httpContext.getMessage( "Case FasKgm>0 and FasMtr=0 ", ""), AV188Pgmname) ;
                        }
                        else if ( ( A1276FasMtr.doubleValue() > 0 ) && ( A1275FasKgm.doubleValue() == 0 ) )
                        {
                           AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1276FasMtr, 9, 2)), (short)(9), " ") ;
                           AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                           AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                           AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        }
                        else if ( ( A1276FasMtr.doubleValue() == 0 ) && ( A1275FasKgm.doubleValue() == 0 ) && ( AV157moda21 == 1 ) )
                        {
                           if ( A8194GuiFasPBK.doubleValue() != 0 )
                           {
                              AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A8194GuiFasPBK, 9, 2)), (short)(9), " ") ;
                              AV129Un = httpContext.getMessage( "KG", "") ;
                           }
                           if ( A8195GuiFasPBM.doubleValue() != 0 )
                           {
                              AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A8195GuiFasPBM, 9, 2)), (short)(9), " ") ;
                              AV129Un = httpContext.getMessage( "MT", "") ;
                           }
                           AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                           AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                           AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                           AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        }
                        AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV137FasDsc));
                        AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0.00");
                        AV9filexml.writeEndElement();
                        AV9filexml.writeElement(httpContext.getMessage( "CreditAmount", ""), "0.00");
                        AV9filexml.writeStartElement(httpContext.getMessage( "Tax", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "TaxType", ""), httpContext.getMessage( "IVA", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "TaxCountryRegion", ""), httpContext.getMessage( "PT", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "NOR", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), "23.00");
                        AV9filexml.writeEndElement();
                        AV9filexml.writeEndElement();
                        pr_default.readNext(20);
                     }
                     pr_default.close(20);
                  }
                  else
                  {
                     AV126Nlinea = (short)(AV126Nlinea+1) ;
                     AV9filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "LineNumber", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126Nlinea), 4, 0));
                     AV9filexml.writeStartElement(httpContext.getMessage( "OrderReferences", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "OriginatingON", ""), GXutil.trim( AV127Barenccli));
                     AV9filexml.writeEndElement();
                     AV32Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) ;
                     AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( GXutil.str( AV125Guiremcli, 6, 0))+"-"+GXutil.trim( A212BarSer));
                     AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV32Pd));
                     if ( ( A12195BarAlbUnd > 0 ) && ( A12196BarPreUnd.doubleValue() > 0 ) && ( GXutil.strcmp(A2010BarTipDis, "L") == 0 ) )
                     {
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A12195BarAlbUnd, 6, 0)), (short)(6), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "UN", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     else if ( ( A1261BarAlbKgmE.doubleValue() > 0 ) && ( GXutil.strcmp(A2010BarTipDis, "L") != 0 ) )
                     {
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     else if ( ( A1263BarAlbMtrE.doubleValue() > 0 ) && ( AV120NoMtsAt == 0 ) && ( GXutil.strcmp(A2010BarTipDis, "L") != 0 ) )
                     {
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1263BarAlbMtrE, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                        AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( AV32Pd));
                     AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeElement(httpContext.getMessage( "CreditAmount", ""), "0.00");
                     AV9filexml.writeStartElement(httpContext.getMessage( "Tax", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxType", ""), httpContext.getMessage( "IVA", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxCountryRegion", ""), httpContext.getMessage( "PT", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "NOR", ""));
                     AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), "23.00");
                     AV9filexml.writeEndElement();
                     AV9filexml.writeEndElement();
                  }
                  pr_default.readNext(19);
               }
               pr_default.close(19);
               AV9filexml.writeStartElement(httpContext.getMessage( "DocumentTotals", ""));
               AV9filexml.writeElement(httpContext.getMessage( "TaxPayable", ""), "0.00");
               AV9filexml.writeElement(httpContext.getMessage( "NetTotal", ""), "0.00");
               AV9filexml.writeElement(httpContext.getMessage( "GrossTotal", ""), "0.00");
               AV9filexml.writeEndElement();
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(18);
            AV9filexml.writeEndElement();
         }
         else if ( AV118FacAlbTip == 2 )
         {
            /* Using cursor P056T23 */
            pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(AV85FacALbCod)});
            while ( (pr_default.getStatus(21) != 101) )
            {
               A14AlbComCod = P056T23_A14AlbComCod[0] ;
               A252CliCod = P056T23_A252CliCod[0] ;
               A22AlbComPri = P056T23_A22AlbComPri[0] ;
               A10740AlbComID = P056T23_A10740AlbComID[0] ;
               A4829AlbComHor = P056T23_A4829AlbComHor[0] ;
               A10014AlbComFd = P056T23_A10014AlbComFd[0] ;
               A17AlbComFch = P056T23_A17AlbComFch[0] ;
               A10013AlbComFs = P056T23_A10013AlbComFs[0] ;
               AV125Guiremcli = A252CliCod ;
               /* Execute user subroutine: 'CLIENT' */
               S1925 ();
               if ( returnInSub )
               {
                  pr_default.close(21);
                  returnInSub = true;
                  if (true) return;
               }
               AV9filexml.writeStartElement(httpContext.getMessage( "StockMovement", ""));
               AV123DocumentNumber = ((GXutil.strcmp(A22AlbComPri, "1")==0) ? httpContext.getMessage( "GT 3/", "")+GXutil.trim( GXutil.str( AV85FacALbCod, 10, 0)) : httpContext.getMessage( "GT 4/", "")+GXutil.trim( GXutil.str( AV85FacALbCod, 10, 0))) ;
               AV9filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), AV123DocumentNumber);
               AV154ATCUD = ((GXutil.strcmp(A10740AlbComID, " ")!=0) ? GXutil.trim( A10740AlbComID) : "0") ;
               AV9filexml.writeElement(httpContext.getMessage( "ATCUD", ""), AV154ATCUD);
               AV9filexml.writeStartElement(httpContext.getMessage( "DocumentStatus", ""));
               AV9filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
               AV28VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV39FecHorSal = localUtil.ctot( AV28VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV38VarAux0 = AV39FecHorSal ;
               AV28VarAux = localUtil.ttoc( AV38VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV135MovementStatusDate = AV31DateAux + httpContext.getMessage( "T", "") + AV29HhSys ;
               AV9filexml.writeElement(httpContext.getMessage( "MovementStatusDate", ""), AV31DateAux+httpContext.getMessage( "T", "")+AV29HhSys);
               AV9filexml.writeElement(httpContext.getMessage( "SourceID", ""), "0");
               AV9filexml.writeElement(httpContext.getMessage( "SourceBilling", ""), httpContext.getMessage( "P", ""));
               AV9filexml.writeEndElement();
               AV133AlbComFd = ((GXutil.strcmp(A10014AlbComFd, " ")!=0) ? A10014AlbComFd : "0") ;
               AV9filexml.writeElement(httpContext.getMessage( "Hash", ""), GXutil.trim( AV133AlbComFd));
               AV9filexml.writeElement(httpContext.getMessage( "HashControl", ""), "1");
               AV9filexml.writeElement(httpContext.getMessage( "Period", ""), GXutil.trim( GXutil.str( GXutil.month( A17AlbComFch), 10, 0)));
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( A17AlbComFch), 10, 0)) ;
               if ( GXutil.month( A17AlbComFch) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A17AlbComFch), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( A17AlbComFch), 10, 0)) ;
               }
               if ( GXutil.day( A17AlbComFch) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A17AlbComFch), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( A17AlbComFch), 10, 0)) ;
               }
               AV128MovementDate = AV31DateAux ;
               AV9filexml.writeElement(httpContext.getMessage( "MovementDate", ""), AV128MovementDate);
               AV9filexml.writeElement(httpContext.getMessage( "MovementType", ""), httpContext.getMessage( "GT", ""));
               AV28VarAux = localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV136SystemEntryDate = ((GXutil.strcmp(A10014AlbComFd, "")!=0) ? AV31DateAux+httpContext.getMessage( "T", "")+AV29HhSys : AV135MovementStatusDate) ;
               AV9filexml.writeElement(httpContext.getMessage( "SystemEntryDate", ""), AV136SystemEntryDate);
               AV9filexml.writeElement(httpContext.getMessage( "CustomerID", ""), GXutil.trim( GXutil.str( A252CliCod, 6, 0)));
               AV9filexml.writeElement(httpContext.getMessage( "SourceID", ""), "0");
               AV9filexml.writeStartElement(httpContext.getMessage( "ShipFrom", ""));
               AV9filexml.writeElement(httpContext.getMessage( "DeliveryID", ""), "00-00-00");
               AV9filexml.writeElement(httpContext.getMessage( "DeliveryDate", ""), AV128MovementDate);
               AV9filexml.writeStartElement(httpContext.getMessage( "Address", ""));
               AV9filexml.writeElement(httpContext.getMessage( "AddressDetail", ""), GXutil.trim( AV21CliDom));
               AV9filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV22CliPob));
               AV9filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV23Cp));
               AV9filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
               AV9filexml.writeEndElement();
               AV9filexml.writeEndElement();
               AV28VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV39FecHorSal = localUtil.ctot( AV28VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV38VarAux0 = AV39FecHorSal ;
               AV28VarAux = localUtil.ttoc( AV38VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV29HhSys = GXutil.substring( AV28VarAux, 12, 8) ;
               AV30FecSys = localUtil.ctod( GXutil.substring( AV28VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV31DateAux = GXutil.trim( GXutil.str( GXutil.year( AV30FecSys), 10, 0)) ;
               if ( GXutil.month( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV30FecSys), 10, 0)) ;
               }
               if ( GXutil.day( AV30FecSys) < 10 )
               {
                  AV31DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               else
               {
                  AV31DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV30FecSys), 10, 0)) ;
               }
               AV9filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), AV31DateAux+httpContext.getMessage( "T", "")+AV29HhSys);
               AV131AlbComID = ((GXutil.strcmp(A10740AlbComID, "")!=0) ? A10740AlbComID : "0") ;
               AV9filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( AV131AlbComID));
               AV126Nlinea = (short)(0) ;
               Gx_msg = AV76NFact + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( " MovementofGoods.Procesando Guias...tabla LALCOM, Nº Guia ", "") + GXutil.trim( GXutil.str( A14AlbComCod, 8, 0)) ;
               /* Using cursor P056T24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
               while ( (pr_default.getStatus(22) != 101) )
               {
                  A13AlbComCnt = P056T24_A13AlbComCnt[0] ;
                  A15AlbComDsc = P056T24_A15AlbComDsc[0] ;
                  A4717AlbComUni = P056T24_A4717AlbComUni[0] ;
                  A20AlbComLin = P056T24_A20AlbComLin[0] ;
                  AV127Barenccli = httpContext.getMessage( "Desconhecido", "") ;
                  AV126Nlinea = (short)(AV126Nlinea+1) ;
                  AV9filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "LineNumber", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126Nlinea), 4, 0));
                  AV9filexml.writeStartElement(httpContext.getMessage( "OrderReferences", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "OriginatingON", ""), GXutil.trim( AV127Barenccli));
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(httpContext.getMessage( "ProductCode", ""), GXutil.trim( GXutil.str( AV125Guiremcli, 6, 0))+"-"+httpContext.getMessage( "COMERCIAL", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( A15AlbComDsc));
                  AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13AlbComCnt, 9, 2)), (short)(9), " ") ;
                  AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                  AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                  AV9filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                  AV129Un = httpContext.getMessage( "UN", "") ;
                  if ( A4717AlbComUni == 2 )
                  {
                     AV129Un = httpContext.getMessage( "MT", "") ;
                  }
                  if ( A4717AlbComUni == 1 )
                  {
                     AV129Un = httpContext.getMessage( "KG", "") ;
                  }
                  AV9filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV129Un);
                  AV9filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                  AV9filexml.writeElement(httpContext.getMessage( "Description", ""), GXutil.trim( A15AlbComDsc));
                  AV9filexml.writeStartElement(httpContext.getMessage( "ProductSerialNumber", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "SerialNumber", ""), "0.00");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeElement(httpContext.getMessage( "CreditAmount", ""), "0.00");
                  AV9filexml.writeStartElement(httpContext.getMessage( "Tax", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxType", ""), httpContext.getMessage( "IVA", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxCountryRegion", ""), httpContext.getMessage( "PT", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxCode", ""), httpContext.getMessage( "NOR", ""));
                  AV9filexml.writeElement(httpContext.getMessage( "TaxPercentage", ""), "23.00");
                  AV9filexml.writeEndElement();
                  AV9filexml.writeEndElement();
                  pr_default.readNext(22);
               }
               pr_default.close(22);
               AV9filexml.writeStartElement(httpContext.getMessage( "DocumentTotals", ""));
               AV9filexml.writeElement(httpContext.getMessage( "TaxPayable", ""), "0.00");
               AV9filexml.writeElement(httpContext.getMessage( "NetTotal", ""), "0.00");
               AV9filexml.writeElement(httpContext.getMessage( "GrossTotal", ""), "0.00");
               AV9filexml.writeEndElement();
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(21);
            AV9filexml.writeEndElement();
         }
         AV114x = (int)(AV114x+1) ;
      }
      AV9filexml.writeEndElement();
   }

   public void S1925( )
   {
      /* 'CLIENT' Routine */
      returnInSub = false ;
      AV19CliNom = " " ;
      AV21CliDom = " " ;
      AV22CliPob = " " ;
      AV23Cp = " " ;
      AV18CliNif = " " ;
      /* Using cursor P056T25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV125Guiremcli)});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A252CliCod = P056T25_A252CliCod[0] ;
         A279CliNom = P056T25_A279CliNom[0] ;
         A260CliDom = P056T25_A260CliDom[0] ;
         A295CliPob = P056T25_A295CliPob[0] ;
         A4828CliCp2 = P056T25_A4828CliCp2[0] ;
         A256CliCp = P056T25_A256CliCp[0] ;
         A278CliNif = P056T25_A278CliNif[0] ;
         AV19CliNom = A279CliNom ;
         AV21CliDom = A260CliDom ;
         AV22CliPob = A295CliPob ;
         AV23Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV18CliNif = A278CliNif ;
         AV47CliEnvNom = A279CliNom ;
         AV48CliEnvDom = A260CliDom ;
         AV50CpE = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV49CliEnvPob = A295CliPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
   }

   public void S201( )
   {
      /* 'MEIVA' Routine */
      returnInSub = false ;
      AV112MeivaDsc = "" ;
      /* Using cursor P056T26 */
      pr_default.execute(24, new Object[] {A396EmprCod, AV111MEIVAID});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A11629MeivaId = P056T26_A11629MeivaId[0] ;
         n11629MeivaId = P056T26_n11629MeivaId[0] ;
         A11630MeivaDsc = P056T26_A11630MeivaDsc[0] ;
         n11630MeivaDsc = P056T26_n11630MeivaDsc[0] ;
         AV112MeivaDsc = A11630MeivaDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(24);
   }

   protected void cleanup( )
   {
      this.aP9[0] = psaft1401.this.AV90File2;
      this.aP12[0] = psaft1401.this.AV156messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV90File2 = "" ;
      AV156messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV93NomMes = "" ;
      AV141totalcredit = DecimalUtil.ZERO ;
      AV140totaldebit = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      scmdbuf = "" ;
      P056T2_A396EmprCod = new String[] {""} ;
      P056T2_A395EmprCif = new String[] {""} ;
      P056T2_n395EmprCif = new boolean[] {false} ;
      P056T2_A407EmprNom = new String[] {""} ;
      P056T2_n407EmprNom = new boolean[] {false} ;
      P056T2_A404EmprDir = new String[] {""} ;
      P056T2_n404EmprDir = new boolean[] {false} ;
      P056T2_A408EmprPob = new String[] {""} ;
      P056T2_n408EmprPob = new boolean[] {false} ;
      P056T2_A403EmprCpo = new String[] {""} ;
      P056T2_n403EmprCpo = new boolean[] {false} ;
      P056T2_A409EmprTel = new String[] {""} ;
      P056T2_n409EmprTel = new boolean[] {false} ;
      P056T2_A405EmprFax = new String[] {""} ;
      P056T2_n405EmprFax = new boolean[] {false} ;
      P056T2_A11516EmpItm6 = new String[] {""} ;
      P056T2_n11516EmpItm6 = new boolean[] {false} ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A11516EmpItm6 = "" ;
      AV17Emprcif = "" ;
      AV24EmprNom = "" ;
      AV25EmprDir = "" ;
      AV26EmprPob = "" ;
      AV27Emprcp = "" ;
      AV44Cp4 = "" ;
      AV45Cp3 = "" ;
      AV46Cp8 = "" ;
      AV108EmprTel = "" ;
      AV109EmprFax = "" ;
      AV110Website = "" ;
      AV9filexml = new com.genexus.xml.XMLWriter();
      AV155message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV11Linea = "" ;
      AV62Cpt = "" ;
      AV56AnyoA = "" ;
      AV55FecA = "" ;
      P056T3_A396EmprCod = new String[] {""} ;
      P056T3_A450FacPri = new String[] {""} ;
      P056T3_A430FacCod = new int[1] ;
      P056T3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T3_A10301Cod_pais = new short[1] ;
      P056T3_n10301Cod_pais = new boolean[] {false} ;
      P056T3_A278CliNif = new String[] {""} ;
      P056T3_A279CliNom = new String[] {""} ;
      P056T3_A260CliDom = new String[] {""} ;
      P056T3_A295CliPob = new String[] {""} ;
      P056T3_A4828CliCp2 = new String[] {""} ;
      P056T3_A256CliCp = new String[] {""} ;
      P056T3_A303CliTel1 = new String[] {""} ;
      P056T3_A274CliFax = new String[] {""} ;
      P056T3_A252CliCod = new int[1] ;
      A450FacPri = "" ;
      A436FacFch = GXutil.nullDate() ;
      A278CliNif = "" ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A303CliTel1 = "" ;
      A274CliFax = "" ;
      AV100Pais = "" ;
      AV23Cp = "" ;
      P056T4_A396EmprCod = new String[] {""} ;
      P056T4_A428FacAlbTip = new byte[1] ;
      P056T4_A450FacPri = new String[] {""} ;
      P056T4_A430FacCod = new int[1] ;
      P056T4_A3397FacFasCod = new String[] {""} ;
      P056T4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T4_A12197FacUnds = new int[1] ;
      P056T4_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T4_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T4_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      AV65Fascod = "" ;
      AV63FacDsc = "" ;
      AV104Tab_Art = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV104Tab_Art[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P056T5_A396EmprCod = new String[] {""} ;
      P056T5_A428FacAlbTip = new byte[1] ;
      P056T5_A450FacPri = new String[] {""} ;
      P056T5_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T5_A12197FacUnds = new int[1] ;
      P056T5_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T5_A430FacCod = new int[1] ;
      P056T5_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T5_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T5_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T5_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T5_A454FacSer = new String[] {""} ;
      P056T5_A3883FacCliCod = new int[1] ;
      P056T5_A446FacLin = new int[1] ;
      A9647FacImpdto = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A454FacSer = "" ;
      AV66CliArt = "" ;
      AV67FacSer = "" ;
      AV69ArtDsc = "" ;
      GXv_int6 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_char5 = new String[1] ;
      P056T6_A396EmprCod = new String[] {""} ;
      P056T6_A428FacAlbTip = new byte[1] ;
      P056T6_A450FacPri = new String[] {""} ;
      P056T6_A430FacCod = new int[1] ;
      P056T6_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T6_A12197FacUnds = new int[1] ;
      P056T6_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T6_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T6_A3883FacCliCod = new int[1] ;
      P056T6_A454FacSer = new String[] {""} ;
      P056T6_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T6_A446FacLin = new int[1] ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      P056T7_A396EmprCod = new String[] {""} ;
      P056T7_A450FacPri = new String[] {""} ;
      P056T7_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T7_A430FacCod = new int[1] ;
      P056T7_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T7_A12197FacUnds = new int[1] ;
      P056T7_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T7_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T7_A428FacAlbTip = new byte[1] ;
      P056T7_A3883FacCliCod = new int[1] ;
      P056T7_A454FacSer = new String[] {""} ;
      P056T7_A446FacLin = new int[1] ;
      P056T8_A396EmprCod = new String[] {""} ;
      P056T8_A450FacPri = new String[] {""} ;
      P056T8_A430FacCod = new int[1] ;
      P056T8_A1153FacTipFac = new byte[1] ;
      P056T8_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T9_A588IvaPor = new byte[1] ;
      P056T9_n588IvaPor = new boolean[] {false} ;
      P056T9_A953IvaCod = new String[] {""} ;
      A953IvaCod = "" ;
      AV74TotalD = DecimalUtil.ZERO ;
      AV75TotalC = DecimalUtil.ZERO ;
      AV98Totalf = DecimalUtil.ZERO ;
      P056T10_A396EmprCod = new String[] {""} ;
      P056T10_A450FacPri = new String[] {""} ;
      P056T10_A430FacCod = new int[1] ;
      P056T10_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T10_A14226FacAnulada = new String[] {""} ;
      P056T10_A1153FacTipFac = new byte[1] ;
      P056T10_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T10_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T10_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A14226FacAnulada = "" ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      AV115Tab_Alb = new long[10000] ;
      AV119Tab_Tip = new byte[10000] ;
      P056T11_A14217MotAnuID = new String[] {""} ;
      P056T11_n14217MotAnuID = new boolean[] {false} ;
      P056T11_A396EmprCod = new String[] {""} ;
      P056T11_A450FacPri = new String[] {""} ;
      P056T11_A430FacCod = new int[1] ;
      P056T11_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T11_A443FacIVAPor = new byte[1] ;
      P056T11_A11629MeivaId = new String[] {""} ;
      P056T11_n11629MeivaId = new boolean[] {false} ;
      P056T11_A10301Cod_pais = new short[1] ;
      P056T11_n10301Cod_pais = new boolean[] {false} ;
      P056T11_A1153FacTipFac = new byte[1] ;
      P056T11_A14230FacIDATe = new String[] {""} ;
      P056T11_A14226FacAnulada = new String[] {""} ;
      P056T11_A14227FacFecAnul = new java.util.Date[] {GXutil.nullDate()} ;
      P056T11_A14228MotAnuDc = new String[] {""} ;
      P056T11_A9605FacFirma = new String[] {""} ;
      P056T11_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      P056T11_A252CliCod = new int[1] ;
      P056T11_A260CliDom = new String[] {""} ;
      P056T11_A295CliPob = new String[] {""} ;
      P056T11_A4828CliCp2 = new String[] {""} ;
      P056T11_A256CliCp = new String[] {""} ;
      P056T11_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T11_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T11_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A14217MotAnuID = "" ;
      A11629MeivaId = "" ;
      A14230FacIDATe = "" ;
      A14227FacFecAnul = GXutil.resetTime( GXutil.nullDate() );
      A14228MotAnuDc = "" ;
      A9605FacFirma = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A9645FacIva1 = DecimalUtil.ZERO ;
      AV111MEIVAID = "" ;
      AV112MeivaDsc = "" ;
      AV76NFact = "" ;
      AV154ATCUD = "" ;
      AV138Invoicestatus = "" ;
      AV28VarAux = "" ;
      AV29HhSys = "" ;
      AV30FecSys = GXutil.nullDate() ;
      AV31DateAux = "" ;
      AV78FecHh = "" ;
      AV77TimeA = "" ;
      AV99TipFra = "" ;
      AV39FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV38VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV103facfch = GXutil.nullDate() ;
      AV139debitcredit = "" ;
      AV81GrosTotal = DecimalUtil.ZERO ;
      AV82NetTotal = DecimalUtil.ZERO ;
      AV83Taxpayable = DecimalUtil.ZERO ;
      P056T12_A396EmprCod = new String[] {""} ;
      P056T12_A30AlbProCod = new long[1] ;
      P056T12_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      AV84FecAlb = GXutil.nullDate() ;
      P056T13_A396EmprCod = new String[] {""} ;
      P056T13_A14AlbComCod = new int[1] ;
      P056T13_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A17AlbComFch = GXutil.nullDate() ;
      P056T14_A396EmprCod = new String[] {""} ;
      P056T14_A10301Cod_pais = new short[1] ;
      P056T14_n10301Cod_pais = new boolean[] {false} ;
      P056T14_A10302Dsc_pais = new String[] {""} ;
      P056T14_n10302Dsc_pais = new boolean[] {false} ;
      A10302Dsc_pais = "" ;
      P056T15_A396EmprCod = new String[] {""} ;
      P056T15_A430FacCod = new int[1] ;
      P056T15_A12197FacUnds = new int[1] ;
      P056T15_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A427FacAlbCod = new long[1] ;
      P056T15_A428FacAlbTip = new byte[1] ;
      P056T15_A454FacSer = new String[] {""} ;
      P056T15_A3883FacCliCod = new int[1] ;
      P056T15_A9708FacDscII = new String[] {""} ;
      P056T15_A432FacDsc = new String[] {""} ;
      P056T15_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T15_A446FacLin = new int[1] ;
      A9708FacDscII = "" ;
      A432FacDsc = "" ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      AV80ProductDsc = "" ;
      P056T16_A396EmprCod = new String[] {""} ;
      P056T16_A430FacCod = new int[1] ;
      P056T16_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A12197FacUnds = new int[1] ;
      P056T16_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A1153FacTipFac = new byte[1] ;
      P056T16_A427FacAlbCod = new long[1] ;
      P056T16_A428FacAlbTip = new byte[1] ;
      P056T16_A454FacSer = new String[] {""} ;
      P056T16_A3883FacCliCod = new int[1] ;
      P056T16_A432FacDsc = new String[] {""} ;
      P056T16_A9708FacDscII = new String[] {""} ;
      P056T16_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T16_A446FacLin = new int[1] ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV144implinea = DecimalUtil.ZERO ;
      AV145facimp = DecimalUtil.ZERO ;
      AV143PrecioKg = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      AV122TQIssued = DecimalUtil.ZERO ;
      P056T17_A396EmprCod = new String[] {""} ;
      P056T17_A130BarCodPar = new String[] {""} ;
      P056T17_A132BarCodReo = new byte[1] ;
      P056T17_A129BarCod = new int[1] ;
      P056T17_A30AlbProCod = new long[1] ;
      P056T17_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T17_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P056T18_A396EmprCod = new String[] {""} ;
      P056T18_A30AlbProCod = new long[1] ;
      P056T18_A129BarCod = new int[1] ;
      P056T18_A132BarCodReo = new byte[1] ;
      P056T18_A130BarCodPar = new String[] {""} ;
      P056T18_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T18_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T18_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      c13AlbComCnt = DecimalUtil.ZERO ;
      P056T19_AV121NofMlines = new int[1] ;
      P056T19_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV41VarKgs = "" ;
      P056T20_A396EmprCod = new String[] {""} ;
      P056T20_A30AlbProCod = new long[1] ;
      P056T20_A1243GuiRemCli = new int[1] ;
      P056T20_A39AlbProPri = new String[] {""} ;
      P056T20_A14069AlbPdATCUD = new String[] {""} ;
      P056T20_A3865AlbHorSal = new String[] {""} ;
      P056T20_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P056T20_A10017AlbFmd = new String[] {""} ;
      P056T20_n10017AlbFmd = new boolean[] {false} ;
      P056T20_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P056T20_A7101AlbLic = new String[] {""} ;
      A39AlbProPri = "" ;
      A14069AlbPdATCUD = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A10017AlbFmd = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A7101AlbLic = "" ;
      AV123DocumentNumber = "" ;
      AV135MovementStatusDate = "" ;
      AV134AlbFmd = "" ;
      AV128MovementDate = "" ;
      AV136SystemEntryDate = "" ;
      AV21CliDom = "" ;
      AV22CliPob = "" ;
      AV130AlbLic = "" ;
      P056T21_A396EmprCod = new String[] {""} ;
      P056T21_A30AlbProCod = new long[1] ;
      P056T21_A130BarCodPar = new String[] {""} ;
      P056T21_A132BarCodReo = new byte[1] ;
      P056T21_A129BarCod = new int[1] ;
      P056T21_A4812BarEncCli = new String[] {""} ;
      P056T21_A143BarDisNum = new String[] {""} ;
      P056T21_A4815AlbEncCli = new String[] {""} ;
      P056T21_A12195BarAlbUnd = new int[1] ;
      P056T21_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T21_A2010BarTipDis = new String[] {""} ;
      P056T21_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T21_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T21_A1652BarSerDsc = new String[] {""} ;
      P056T21_A212BarSer = new String[] {""} ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A4815AlbEncCli = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A2010BarTipDis = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      AV127Barenccli = "" ;
      P056T22_A396EmprCod = new String[] {""} ;
      P056T22_A30AlbProCod = new long[1] ;
      P056T22_A129BarCod = new int[1] ;
      P056T22_A132BarCodReo = new byte[1] ;
      P056T22_A130BarCodPar = new String[] {""} ;
      P056T22_A457FasCod = new String[] {""} ;
      P056T22_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T22_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T22_A460FasDsc = new String[] {""} ;
      P056T22_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T22_n8194GuiFasPBK = new boolean[] {false} ;
      P056T22_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T22_n8195GuiFasPBM = new boolean[] {false} ;
      P056T22_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      AV137FasDsc = "" ;
      GXt_char9 = "" ;
      GXv_char8 = new String[1] ;
      AV188Pgmname = "" ;
      AV42Vconv = "" ;
      AV43Num9 = DecimalUtil.ZERO ;
      AV129Un = "" ;
      AV32Pd = "" ;
      P056T23_A396EmprCod = new String[] {""} ;
      P056T23_A14AlbComCod = new int[1] ;
      P056T23_A252CliCod = new int[1] ;
      P056T23_A22AlbComPri = new String[] {""} ;
      P056T23_A10740AlbComID = new String[] {""} ;
      P056T23_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P056T23_A10014AlbComFd = new String[] {""} ;
      P056T23_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P056T23_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      A22AlbComPri = "" ;
      A10740AlbComID = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10014AlbComFd = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV133AlbComFd = "" ;
      AV131AlbComID = "" ;
      P056T24_A396EmprCod = new String[] {""} ;
      P056T24_A14AlbComCod = new int[1] ;
      P056T24_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056T24_A15AlbComDsc = new String[] {""} ;
      P056T24_A4717AlbComUni = new byte[1] ;
      P056T24_A20AlbComLin = new short[1] ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      AV19CliNom = "" ;
      AV18CliNif = "" ;
      P056T25_A396EmprCod = new String[] {""} ;
      P056T25_A252CliCod = new int[1] ;
      P056T25_A279CliNom = new String[] {""} ;
      P056T25_A260CliDom = new String[] {""} ;
      P056T25_A295CliPob = new String[] {""} ;
      P056T25_A4828CliCp2 = new String[] {""} ;
      P056T25_A256CliCp = new String[] {""} ;
      P056T25_A278CliNif = new String[] {""} ;
      AV47CliEnvNom = "" ;
      AV48CliEnvDom = "" ;
      AV50CpE = "" ;
      AV49CliEnvPob = "" ;
      P056T26_A396EmprCod = new String[] {""} ;
      P056T26_A11629MeivaId = new String[] {""} ;
      P056T26_n11629MeivaId = new boolean[] {false} ;
      P056T26_A11630MeivaDsc = new String[] {""} ;
      P056T26_n11630MeivaDsc = new boolean[] {false} ;
      A11630MeivaDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psaft1401__default(),
         new Object[] {
             new Object[] {
            P056T2_A396EmprCod, P056T2_A395EmprCif, P056T2_n395EmprCif, P056T2_A407EmprNom, P056T2_n407EmprNom, P056T2_A404EmprDir, P056T2_n404EmprDir, P056T2_A408EmprPob, P056T2_n408EmprPob, P056T2_A403EmprCpo,
            P056T2_n403EmprCpo, P056T2_A409EmprTel, P056T2_n409EmprTel, P056T2_A405EmprFax, P056T2_n405EmprFax, P056T2_A11516EmpItm6, P056T2_n11516EmpItm6
            }
            , new Object[] {
            P056T3_A396EmprCod, P056T3_A450FacPri, P056T3_A430FacCod, P056T3_A436FacFch, P056T3_A10301Cod_pais, P056T3_n10301Cod_pais, P056T3_A278CliNif, P056T3_A279CliNom, P056T3_A260CliDom, P056T3_A295CliPob,
            P056T3_A4828CliCp2, P056T3_A256CliCp, P056T3_A303CliTel1, P056T3_A274CliFax, P056T3_A252CliCod
            }
            , new Object[] {
            P056T4_A396EmprCod, P056T4_A428FacAlbTip, P056T4_A450FacPri, P056T4_A430FacCod, P056T4_A3397FacFasCod, P056T4_A436FacFch, P056T4_A12197FacUnds, P056T4_A449FacPreMts, P056T4_A448FacPreKgs, P056T4_A446FacLin
            }
            , new Object[] {
            P056T5_A396EmprCod, P056T5_A428FacAlbTip, P056T5_A450FacPri, P056T5_A9647FacImpdto, P056T5_A12197FacUnds, P056T5_A449FacPreMts, P056T5_A430FacCod, P056T5_A436FacFch, P056T5_A447FacMts, P056T5_A448FacPreKgs,
            P056T5_A444FacKgs, P056T5_A454FacSer, P056T5_A3883FacCliCod, P056T5_A446FacLin
            }
            , new Object[] {
            P056T6_A396EmprCod, P056T6_A428FacAlbTip, P056T6_A450FacPri, P056T6_A430FacCod, P056T6_A436FacFch, P056T6_A12197FacUnds, P056T6_A449FacPreMts, P056T6_A448FacPreKgs, P056T6_A3883FacCliCod, P056T6_A454FacSer,
            P056T6_A9646FacTot1, P056T6_A446FacLin
            }
            , new Object[] {
            P056T7_A396EmprCod, P056T7_A450FacPri, P056T7_A9646FacTot1, P056T7_A430FacCod, P056T7_A436FacFch, P056T7_A12197FacUnds, P056T7_A447FacMts, P056T7_A444FacKgs, P056T7_A428FacAlbTip, P056T7_A3883FacCliCod,
            P056T7_A454FacSer, P056T7_A446FacLin
            }
            , new Object[] {
            P056T8_A396EmprCod, P056T8_A450FacPri, P056T8_A430FacCod, P056T8_A1153FacTipFac, P056T8_A436FacFch
            }
            , new Object[] {
            P056T9_A588IvaPor, P056T9_n588IvaPor, P056T9_A953IvaCod
            }
            , new Object[] {
            P056T10_A396EmprCod, P056T10_A450FacPri, P056T10_A430FacCod, P056T10_A436FacFch, P056T10_A14226FacAnulada, P056T10_A1153FacTipFac, P056T10_A9644FacLiq2, P056T10_A9643FacLiq1, P056T10_A434FacDtoPP
            }
            , new Object[] {
            P056T11_A14217MotAnuID, P056T11_n14217MotAnuID, P056T11_A396EmprCod, P056T11_A450FacPri, P056T11_A430FacCod, P056T11_A436FacFch, P056T11_A443FacIVAPor, P056T11_A11629MeivaId, P056T11_n11629MeivaId, P056T11_A10301Cod_pais,
            P056T11_n10301Cod_pais, P056T11_A1153FacTipFac, P056T11_A14230FacIDATe, P056T11_A14226FacAnulada, P056T11_A14227FacFecAnul, P056T11_A14228MotAnuDc, P056T11_A9605FacFirma, P056T11_A9606FacHor, P056T11_A252CliCod, P056T11_A260CliDom,
            P056T11_A295CliPob, P056T11_A4828CliCp2, P056T11_A256CliCp, P056T11_A9646FacTot1, P056T11_A9644FacLiq2, P056T11_A9645FacIva1
            }
            , new Object[] {
            P056T12_A396EmprCod, P056T12_A30AlbProCod, P056T12_A34AlbProfch
            }
            , new Object[] {
            P056T13_A396EmprCod, P056T13_A14AlbComCod, P056T13_A17AlbComFch
            }
            , new Object[] {
            P056T14_A396EmprCod, P056T14_A10301Cod_pais, P056T14_A10302Dsc_pais, P056T14_n10302Dsc_pais
            }
            , new Object[] {
            P056T15_A396EmprCod, P056T15_A430FacCod, P056T15_A12197FacUnds, P056T15_A447FacMts, P056T15_A444FacKgs, P056T15_A427FacAlbCod, P056T15_A428FacAlbTip, P056T15_A454FacSer, P056T15_A3883FacCliCod, P056T15_A9708FacDscII,
            P056T15_A432FacDsc, P056T15_A9649FacPKDto, P056T15_A9647FacImpdto, P056T15_A9650FacPMdto, P056T15_A449FacPreMts, P056T15_A448FacPreKgs, P056T15_A446FacLin
            }
            , new Object[] {
            P056T16_A396EmprCod, P056T16_A430FacCod, P056T16_A5353FacImpMan, P056T16_A12197FacUnds, P056T16_A12198FacPreUnd, P056T16_A447FacMts, P056T16_A449FacPreMts, P056T16_A444FacKgs, P056T16_A448FacPreKgs, P056T16_A1153FacTipFac,
            P056T16_A427FacAlbCod, P056T16_A428FacAlbTip, P056T16_A454FacSer, P056T16_A3883FacCliCod, P056T16_A432FacDsc, P056T16_A9708FacDscII, P056T16_A3897FacKgsA, P056T16_A9649FacPKDto, P056T16_A9647FacImpdto, P056T16_A3898FacPreKgsA,
            P056T16_A9650FacPMdto, P056T16_A446FacLin
            }
            , new Object[] {
            P056T17_A396EmprCod, P056T17_A130BarCodPar, P056T17_A132BarCodReo, P056T17_A129BarCod, P056T17_A30AlbProCod, P056T17_A1263BarAlbMtrE, P056T17_A1261BarAlbKgmE
            }
            , new Object[] {
            P056T18_A396EmprCod, P056T18_A30AlbProCod, P056T18_A129BarCod, P056T18_A132BarCodReo, P056T18_A130BarCodPar, P056T18_A1276FasMtr, P056T18_A1275FasKgm, P056T18_A1240GuiFasLin
            }
            , new Object[] {
            P056T19_AV121NofMlines, P056T19_A13AlbComCnt
            }
            , new Object[] {
            P056T20_A396EmprCod, P056T20_A30AlbProCod, P056T20_A1243GuiRemCli, P056T20_A39AlbProPri, P056T20_A14069AlbPdATCUD, P056T20_A3865AlbHorSal, P056T20_A4023AlbFecSal, P056T20_A10017AlbFmd, P056T20_n10017AlbFmd, P056T20_A10019AlbHhfm,
            P056T20_A7101AlbLic
            }
            , new Object[] {
            P056T21_A396EmprCod, P056T21_A30AlbProCod, P056T21_A130BarCodPar, P056T21_A132BarCodReo, P056T21_A129BarCod, P056T21_A4812BarEncCli, P056T21_A143BarDisNum, P056T21_A4815AlbEncCli, P056T21_A12195BarAlbUnd, P056T21_A12196BarPreUnd,
            P056T21_A2010BarTipDis, P056T21_A1263BarAlbMtrE, P056T21_A1261BarAlbKgmE, P056T21_A1652BarSerDsc, P056T21_A212BarSer
            }
            , new Object[] {
            P056T22_A396EmprCod, P056T22_A30AlbProCod, P056T22_A129BarCod, P056T22_A132BarCodReo, P056T22_A130BarCodPar, P056T22_A457FasCod, P056T22_A1276FasMtr, P056T22_A1275FasKgm, P056T22_A460FasDsc, P056T22_A8194GuiFasPBK,
            P056T22_n8194GuiFasPBK, P056T22_A8195GuiFasPBM, P056T22_n8195GuiFasPBM, P056T22_A1240GuiFasLin
            }
            , new Object[] {
            P056T23_A396EmprCod, P056T23_A14AlbComCod, P056T23_A252CliCod, P056T23_A22AlbComPri, P056T23_A10740AlbComID, P056T23_A4829AlbComHor, P056T23_A10014AlbComFd, P056T23_A17AlbComFch, P056T23_A10013AlbComFs
            }
            , new Object[] {
            P056T24_A396EmprCod, P056T24_A14AlbComCod, P056T24_A13AlbComCnt, P056T24_A15AlbComDsc, P056T24_A4717AlbComUni, P056T24_A20AlbComLin
            }
            , new Object[] {
            P056T25_A396EmprCod, P056T25_A252CliCod, P056T25_A279CliNom, P056T25_A260CliDom, P056T25_A295CliPob, P056T25_A4828CliCp2, P056T25_A256CliCp, P056T25_A278CliNif
            }
            , new Object[] {
            P056T26_A396EmprCod, P056T26_A11629MeivaId, P056T26_A11630MeivaDsc, P056T26_n11630MeivaDsc
            }
         }
      );
      AV188Pgmname = "PSAFT1401" ;
      /* GeneXus formulas. */
      AV188Pgmname = "PSAFT1401" ;
      Gx_err = (short)(0) ;
   }

   private byte AV107Etm ;
   private byte AV146gavim ;
   private byte AV142tdebitcredit ;
   private byte A428FacAlbTip ;
   private byte AV147Hecreado ;
   private byte AV70Flag ;
   private byte AV106ExiPr ;
   private byte A1153FacTipFac ;
   private byte A588IvaPor ;
   private byte AV119Tab_Tip[] ;
   private byte A443FacIVAPor ;
   private byte AV95FacIVAPor ;
   private byte AV86FacTipFac ;
   private byte AV92CalPrd ;
   private byte AV91Calcom ;
   private byte AV102SiLine ;
   private byte AV118FacAlbTip ;
   private byte AV96PrecKg ;
   private byte AV97PrecMt ;
   private byte AV116AltaAlb ;
   private byte AV120NoMtsAt ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A4717AlbComUni ;
   private short AV54Anyo ;
   private short AV157moda21 ;
   private short AV158tcredit ;
   private short AV94Year ;
   private short AV101Cod_pais ;
   private short A10301Cod_pais ;
   private short AV87Nd ;
   private short AV88Nc ;
   private short AV73Nfra ;
   private short A1240GuiFasLin ;
   private short AV126Nlinea ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV59FacCod ;
   private int AV132Faccodf ;
   private int AV151CantidadRegistrosAProcesar ;
   private int AV71Faccod1 ;
   private int AV72FacCod2 ;
   private int AV89LastClicod ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int A12197FacUnds ;
   private int A446FacLin ;
   private int GX_I ;
   private int AV105i ;
   private int A3883FacCliCod ;
   private int AV68FacClicod ;
   private int GXv_int6[] ;
   private int AV117z ;
   private int A14AlbComCod ;
   private int AV114x ;
   private int AV121NofMlines ;
   private int A129BarCod ;
   private int cV121NofMlines ;
   private int A1243GuiRemCli ;
   private int AV125Guiremcli ;
   private int A12195BarAlbUnd ;
   private long AV115Tab_Alb[] ;
   private long AV85FacALbCod ;
   private long A30AlbProCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal AV141totalcredit ;
   private java.math.BigDecimal AV140totaldebit ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A9647FacImpdto ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A9646FacTot1 ;
   private java.math.BigDecimal AV74TotalD ;
   private java.math.BigDecimal AV75TotalC ;
   private java.math.BigDecimal AV98Totalf ;
   private java.math.BigDecimal A9644FacLiq2 ;
   private java.math.BigDecimal A9643FacLiq1 ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A9645FacIva1 ;
   private java.math.BigDecimal AV81GrosTotal ;
   private java.math.BigDecimal AV82NetTotal ;
   private java.math.BigDecimal AV83Taxpayable ;
   private java.math.BigDecimal A9649FacPKDto ;
   private java.math.BigDecimal A9650FacPMdto ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal AV144implinea ;
   private java.math.BigDecimal AV145facimp ;
   private java.math.BigDecimal AV143PrecioKg ;
   private java.math.BigDecimal AV122TQIssued ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal c13AlbComCnt ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal AV43Num9 ;
   private java.math.BigDecimal A13AlbComCnt ;
   private String A396EmprCod ;
   private String AV58TaxReg ;
   private String AV57CompanyID ;
   private String AV34File ;
   private String AV90File2 ;
   private String AV113Usurcod ;
   private String AV93NomMes ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A11516EmpItm6 ;
   private String AV17Emprcif ;
   private String AV24EmprNom ;
   private String AV25EmprDir ;
   private String AV26EmprPob ;
   private String AV27Emprcp ;
   private String AV44Cp4 ;
   private String AV45Cp3 ;
   private String AV46Cp8 ;
   private String AV108EmprTel ;
   private String AV109EmprFax ;
   private String AV110Website ;
   private String AV11Linea ;
   private String AV62Cpt ;
   private String AV56AnyoA ;
   private String AV55FecA ;
   private String A450FacPri ;
   private String A278CliNif ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A303CliTel1 ;
   private String A274CliFax ;
   private String AV100Pais ;
   private String AV23Cp ;
   private String A3397FacFasCod ;
   private String AV65Fascod ;
   private String AV63FacDsc ;
   private String AV104Tab_Art[] ;
   private String A454FacSer ;
   private String AV66CliArt ;
   private String AV67FacSer ;
   private String AV69ArtDsc ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private String A953IvaCod ;
   private String A14226FacAnulada ;
   private String A14217MotAnuID ;
   private String A11629MeivaId ;
   private String A14230FacIDATe ;
   private String A9605FacFirma ;
   private String AV111MEIVAID ;
   private String AV76NFact ;
   private String AV154ATCUD ;
   private String AV138Invoicestatus ;
   private String AV28VarAux ;
   private String AV29HhSys ;
   private String AV31DateAux ;
   private String AV78FecHh ;
   private String AV77TimeA ;
   private String AV99TipFra ;
   private String AV139debitcredit ;
   private String A10302Dsc_pais ;
   private String A9708FacDscII ;
   private String A432FacDsc ;
   private String AV80ProductDsc ;
   private String Gx_msg ;
   private String A130BarCodPar ;
   private String AV41VarKgs ;
   private String A39AlbProPri ;
   private String A14069AlbPdATCUD ;
   private String A3865AlbHorSal ;
   private String A7101AlbLic ;
   private String AV123DocumentNumber ;
   private String AV135MovementStatusDate ;
   private String AV128MovementDate ;
   private String AV136SystemEntryDate ;
   private String AV21CliDom ;
   private String AV22CliPob ;
   private String AV130AlbLic ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A4815AlbEncCli ;
   private String A2010BarTipDis ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String AV127Barenccli ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV137FasDsc ;
   private String GXt_char9 ;
   private String GXv_char8[] ;
   private String AV188Pgmname ;
   private String AV42Vconv ;
   private String AV129Un ;
   private String AV32Pd ;
   private String A22AlbComPri ;
   private String A10740AlbComID ;
   private String A10014AlbComFd ;
   private String AV133AlbComFd ;
   private String AV131AlbComID ;
   private String A15AlbComDsc ;
   private String AV19CliNom ;
   private String AV18CliNif ;
   private String AV47CliEnvNom ;
   private String AV48CliEnvDom ;
   private String AV50CpE ;
   private String AV49CliEnvPob ;
   private java.util.Date A14227FacFecAnul ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV39FecHorSal ;
   private java.util.Date AV38VarAux0 ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV52Fec1 ;
   private java.util.Date AV53Fec2 ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV30FecSys ;
   private java.util.Date AV103facfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV84FecAlb ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date A4023AlbFecSal ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n11516EmpItm6 ;
   private boolean returnInSub ;
   private boolean n10301Cod_pais ;
   private boolean brk56T4 ;
   private boolean brk56T6 ;
   private boolean brk56T9 ;
   private boolean brk56T11 ;
   private boolean n588IvaPor ;
   private boolean n14217MotAnuID ;
   private boolean n11629MeivaId ;
   private boolean n10302Dsc_pais ;
   private boolean n10017AlbFmd ;
   private boolean n8194GuiFasPBK ;
   private boolean n8195GuiFasPBM ;
   private boolean n11630MeivaDsc ;
   private String A14228MotAnuDc ;
   private String AV112MeivaDsc ;
   private String A10017AlbFmd ;
   private String AV134AlbFmd ;
   private String A11630MeivaDsc ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP12 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P056T2_A396EmprCod ;
   private String[] P056T2_A395EmprCif ;
   private boolean[] P056T2_n395EmprCif ;
   private String[] P056T2_A407EmprNom ;
   private boolean[] P056T2_n407EmprNom ;
   private String[] P056T2_A404EmprDir ;
   private boolean[] P056T2_n404EmprDir ;
   private String[] P056T2_A408EmprPob ;
   private boolean[] P056T2_n408EmprPob ;
   private String[] P056T2_A403EmprCpo ;
   private boolean[] P056T2_n403EmprCpo ;
   private String[] P056T2_A409EmprTel ;
   private boolean[] P056T2_n409EmprTel ;
   private String[] P056T2_A405EmprFax ;
   private boolean[] P056T2_n405EmprFax ;
   private String[] P056T2_A11516EmpItm6 ;
   private boolean[] P056T2_n11516EmpItm6 ;
   private String[] P056T3_A396EmprCod ;
   private String[] P056T3_A450FacPri ;
   private int[] P056T3_A430FacCod ;
   private java.util.Date[] P056T3_A436FacFch ;
   private short[] P056T3_A10301Cod_pais ;
   private boolean[] P056T3_n10301Cod_pais ;
   private String[] P056T3_A278CliNif ;
   private String[] P056T3_A279CliNom ;
   private String[] P056T3_A260CliDom ;
   private String[] P056T3_A295CliPob ;
   private String[] P056T3_A4828CliCp2 ;
   private String[] P056T3_A256CliCp ;
   private String[] P056T3_A303CliTel1 ;
   private String[] P056T3_A274CliFax ;
   private int[] P056T3_A252CliCod ;
   private String[] P056T4_A396EmprCod ;
   private byte[] P056T4_A428FacAlbTip ;
   private String[] P056T4_A450FacPri ;
   private int[] P056T4_A430FacCod ;
   private String[] P056T4_A3397FacFasCod ;
   private java.util.Date[] P056T4_A436FacFch ;
   private int[] P056T4_A12197FacUnds ;
   private java.math.BigDecimal[] P056T4_A449FacPreMts ;
   private java.math.BigDecimal[] P056T4_A448FacPreKgs ;
   private int[] P056T4_A446FacLin ;
   private String[] P056T5_A396EmprCod ;
   private byte[] P056T5_A428FacAlbTip ;
   private String[] P056T5_A450FacPri ;
   private java.math.BigDecimal[] P056T5_A9647FacImpdto ;
   private int[] P056T5_A12197FacUnds ;
   private java.math.BigDecimal[] P056T5_A449FacPreMts ;
   private int[] P056T5_A430FacCod ;
   private java.util.Date[] P056T5_A436FacFch ;
   private java.math.BigDecimal[] P056T5_A447FacMts ;
   private java.math.BigDecimal[] P056T5_A448FacPreKgs ;
   private java.math.BigDecimal[] P056T5_A444FacKgs ;
   private String[] P056T5_A454FacSer ;
   private int[] P056T5_A3883FacCliCod ;
   private int[] P056T5_A446FacLin ;
   private String[] P056T6_A396EmprCod ;
   private byte[] P056T6_A428FacAlbTip ;
   private String[] P056T6_A450FacPri ;
   private int[] P056T6_A430FacCod ;
   private java.util.Date[] P056T6_A436FacFch ;
   private int[] P056T6_A12197FacUnds ;
   private java.math.BigDecimal[] P056T6_A449FacPreMts ;
   private java.math.BigDecimal[] P056T6_A448FacPreKgs ;
   private int[] P056T6_A3883FacCliCod ;
   private String[] P056T6_A454FacSer ;
   private java.math.BigDecimal[] P056T6_A9646FacTot1 ;
   private int[] P056T6_A446FacLin ;
   private String[] P056T7_A396EmprCod ;
   private String[] P056T7_A450FacPri ;
   private java.math.BigDecimal[] P056T7_A9646FacTot1 ;
   private int[] P056T7_A430FacCod ;
   private java.util.Date[] P056T7_A436FacFch ;
   private int[] P056T7_A12197FacUnds ;
   private java.math.BigDecimal[] P056T7_A447FacMts ;
   private java.math.BigDecimal[] P056T7_A444FacKgs ;
   private byte[] P056T7_A428FacAlbTip ;
   private int[] P056T7_A3883FacCliCod ;
   private String[] P056T7_A454FacSer ;
   private int[] P056T7_A446FacLin ;
   private String[] P056T8_A396EmprCod ;
   private String[] P056T8_A450FacPri ;
   private int[] P056T8_A430FacCod ;
   private byte[] P056T8_A1153FacTipFac ;
   private java.util.Date[] P056T8_A436FacFch ;
   private byte[] P056T9_A588IvaPor ;
   private boolean[] P056T9_n588IvaPor ;
   private String[] P056T9_A953IvaCod ;
   private String[] P056T10_A396EmprCod ;
   private String[] P056T10_A450FacPri ;
   private int[] P056T10_A430FacCod ;
   private java.util.Date[] P056T10_A436FacFch ;
   private String[] P056T10_A14226FacAnulada ;
   private byte[] P056T10_A1153FacTipFac ;
   private java.math.BigDecimal[] P056T10_A9644FacLiq2 ;
   private java.math.BigDecimal[] P056T10_A9643FacLiq1 ;
   private java.math.BigDecimal[] P056T10_A434FacDtoPP ;
   private String[] P056T11_A14217MotAnuID ;
   private boolean[] P056T11_n14217MotAnuID ;
   private String[] P056T11_A396EmprCod ;
   private String[] P056T11_A450FacPri ;
   private int[] P056T11_A430FacCod ;
   private java.util.Date[] P056T11_A436FacFch ;
   private byte[] P056T11_A443FacIVAPor ;
   private String[] P056T11_A11629MeivaId ;
   private boolean[] P056T11_n11629MeivaId ;
   private short[] P056T11_A10301Cod_pais ;
   private boolean[] P056T11_n10301Cod_pais ;
   private byte[] P056T11_A1153FacTipFac ;
   private String[] P056T11_A14230FacIDATe ;
   private String[] P056T11_A14226FacAnulada ;
   private java.util.Date[] P056T11_A14227FacFecAnul ;
   private String[] P056T11_A14228MotAnuDc ;
   private String[] P056T11_A9605FacFirma ;
   private java.util.Date[] P056T11_A9606FacHor ;
   private int[] P056T11_A252CliCod ;
   private String[] P056T11_A260CliDom ;
   private String[] P056T11_A295CliPob ;
   private String[] P056T11_A4828CliCp2 ;
   private String[] P056T11_A256CliCp ;
   private java.math.BigDecimal[] P056T11_A9646FacTot1 ;
   private java.math.BigDecimal[] P056T11_A9644FacLiq2 ;
   private java.math.BigDecimal[] P056T11_A9645FacIva1 ;
   private String[] P056T12_A396EmprCod ;
   private long[] P056T12_A30AlbProCod ;
   private java.util.Date[] P056T12_A34AlbProfch ;
   private String[] P056T13_A396EmprCod ;
   private int[] P056T13_A14AlbComCod ;
   private java.util.Date[] P056T13_A17AlbComFch ;
   private String[] P056T14_A396EmprCod ;
   private short[] P056T14_A10301Cod_pais ;
   private boolean[] P056T14_n10301Cod_pais ;
   private String[] P056T14_A10302Dsc_pais ;
   private boolean[] P056T14_n10302Dsc_pais ;
   private String[] P056T15_A396EmprCod ;
   private int[] P056T15_A430FacCod ;
   private int[] P056T15_A12197FacUnds ;
   private java.math.BigDecimal[] P056T15_A447FacMts ;
   private java.math.BigDecimal[] P056T15_A444FacKgs ;
   private long[] P056T15_A427FacAlbCod ;
   private byte[] P056T15_A428FacAlbTip ;
   private String[] P056T15_A454FacSer ;
   private int[] P056T15_A3883FacCliCod ;
   private String[] P056T15_A9708FacDscII ;
   private String[] P056T15_A432FacDsc ;
   private java.math.BigDecimal[] P056T15_A9649FacPKDto ;
   private java.math.BigDecimal[] P056T15_A9647FacImpdto ;
   private java.math.BigDecimal[] P056T15_A9650FacPMdto ;
   private java.math.BigDecimal[] P056T15_A449FacPreMts ;
   private java.math.BigDecimal[] P056T15_A448FacPreKgs ;
   private int[] P056T15_A446FacLin ;
   private String[] P056T16_A396EmprCod ;
   private int[] P056T16_A430FacCod ;
   private java.math.BigDecimal[] P056T16_A5353FacImpMan ;
   private int[] P056T16_A12197FacUnds ;
   private java.math.BigDecimal[] P056T16_A12198FacPreUnd ;
   private java.math.BigDecimal[] P056T16_A447FacMts ;
   private java.math.BigDecimal[] P056T16_A449FacPreMts ;
   private java.math.BigDecimal[] P056T16_A444FacKgs ;
   private java.math.BigDecimal[] P056T16_A448FacPreKgs ;
   private byte[] P056T16_A1153FacTipFac ;
   private long[] P056T16_A427FacAlbCod ;
   private byte[] P056T16_A428FacAlbTip ;
   private String[] P056T16_A454FacSer ;
   private int[] P056T16_A3883FacCliCod ;
   private String[] P056T16_A432FacDsc ;
   private String[] P056T16_A9708FacDscII ;
   private java.math.BigDecimal[] P056T16_A3897FacKgsA ;
   private java.math.BigDecimal[] P056T16_A9649FacPKDto ;
   private java.math.BigDecimal[] P056T16_A9647FacImpdto ;
   private java.math.BigDecimal[] P056T16_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P056T16_A9650FacPMdto ;
   private int[] P056T16_A446FacLin ;
   private String[] P056T17_A396EmprCod ;
   private String[] P056T17_A130BarCodPar ;
   private byte[] P056T17_A132BarCodReo ;
   private int[] P056T17_A129BarCod ;
   private long[] P056T17_A30AlbProCod ;
   private java.math.BigDecimal[] P056T17_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P056T17_A1261BarAlbKgmE ;
   private String[] P056T18_A396EmprCod ;
   private long[] P056T18_A30AlbProCod ;
   private int[] P056T18_A129BarCod ;
   private byte[] P056T18_A132BarCodReo ;
   private String[] P056T18_A130BarCodPar ;
   private java.math.BigDecimal[] P056T18_A1276FasMtr ;
   private java.math.BigDecimal[] P056T18_A1275FasKgm ;
   private short[] P056T18_A1240GuiFasLin ;
   private int[] P056T19_AV121NofMlines ;
   private java.math.BigDecimal[] P056T19_A13AlbComCnt ;
   private String[] P056T20_A396EmprCod ;
   private long[] P056T20_A30AlbProCod ;
   private int[] P056T20_A1243GuiRemCli ;
   private String[] P056T20_A39AlbProPri ;
   private String[] P056T20_A14069AlbPdATCUD ;
   private String[] P056T20_A3865AlbHorSal ;
   private java.util.Date[] P056T20_A4023AlbFecSal ;
   private String[] P056T20_A10017AlbFmd ;
   private boolean[] P056T20_n10017AlbFmd ;
   private java.util.Date[] P056T20_A10019AlbHhfm ;
   private String[] P056T20_A7101AlbLic ;
   private String[] P056T21_A396EmprCod ;
   private long[] P056T21_A30AlbProCod ;
   private String[] P056T21_A130BarCodPar ;
   private byte[] P056T21_A132BarCodReo ;
   private int[] P056T21_A129BarCod ;
   private String[] P056T21_A4812BarEncCli ;
   private String[] P056T21_A143BarDisNum ;
   private String[] P056T21_A4815AlbEncCli ;
   private int[] P056T21_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P056T21_A12196BarPreUnd ;
   private String[] P056T21_A2010BarTipDis ;
   private java.math.BigDecimal[] P056T21_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P056T21_A1261BarAlbKgmE ;
   private String[] P056T21_A1652BarSerDsc ;
   private String[] P056T21_A212BarSer ;
   private String[] P056T22_A396EmprCod ;
   private long[] P056T22_A30AlbProCod ;
   private int[] P056T22_A129BarCod ;
   private byte[] P056T22_A132BarCodReo ;
   private String[] P056T22_A130BarCodPar ;
   private String[] P056T22_A457FasCod ;
   private java.math.BigDecimal[] P056T22_A1276FasMtr ;
   private java.math.BigDecimal[] P056T22_A1275FasKgm ;
   private String[] P056T22_A460FasDsc ;
   private java.math.BigDecimal[] P056T22_A8194GuiFasPBK ;
   private boolean[] P056T22_n8194GuiFasPBK ;
   private java.math.BigDecimal[] P056T22_A8195GuiFasPBM ;
   private boolean[] P056T22_n8195GuiFasPBM ;
   private short[] P056T22_A1240GuiFasLin ;
   private String[] P056T23_A396EmprCod ;
   private int[] P056T23_A14AlbComCod ;
   private int[] P056T23_A252CliCod ;
   private String[] P056T23_A22AlbComPri ;
   private String[] P056T23_A10740AlbComID ;
   private java.util.Date[] P056T23_A4829AlbComHor ;
   private String[] P056T23_A10014AlbComFd ;
   private java.util.Date[] P056T23_A17AlbComFch ;
   private java.util.Date[] P056T23_A10013AlbComFs ;
   private String[] P056T24_A396EmprCod ;
   private int[] P056T24_A14AlbComCod ;
   private java.math.BigDecimal[] P056T24_A13AlbComCnt ;
   private String[] P056T24_A15AlbComDsc ;
   private byte[] P056T24_A4717AlbComUni ;
   private short[] P056T24_A20AlbComLin ;
   private String[] P056T25_A396EmprCod ;
   private int[] P056T25_A252CliCod ;
   private String[] P056T25_A279CliNom ;
   private String[] P056T25_A260CliDom ;
   private String[] P056T25_A295CliPob ;
   private String[] P056T25_A4828CliCp2 ;
   private String[] P056T25_A256CliCp ;
   private String[] P056T25_A278CliNif ;
   private String[] P056T26_A396EmprCod ;
   private String[] P056T26_A11629MeivaId ;
   private boolean[] P056T26_n11629MeivaId ;
   private String[] P056T26_A11630MeivaDsc ;
   private boolean[] P056T26_n11630MeivaDsc ;
   private com.genexus.xml.XMLWriter AV9filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV156messages ;
   private com.genexus.SdtMessages_Message AV155message ;
}

final  class psaft1401__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056T2", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo, EmprTel, EmprFax, EmpItm6 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T3", "SELECT T1.EmprCod, T1.FacPri, T1.FacCod, T1.FacFch, T2.Cod_pais, T2.CliNif, T2.CliNom, T2.CliDom, T2.CliPob, T2.CliCp2, T2.CliCp, T2.CliTel1, T2.CliFax, T1.CliCod FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.FacFch >= ?) AND (T1.FacFch <= ?) AND (T1.FacCod >= ?) AND (T1.FacCod <= ?) AND (T1.FacPri = '1') ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T4", "SELECT T1.EmprCod, T1.FacAlbTip, T2.FacPri, T1.FacCod, T1.FacFasCod, T2.FacFch, T1.FacUnds, T1.FacPreMts, T1.FacPreKgs, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE (T1.EmprCod = ?) AND (T2.FacFch >= ?) AND (T2.FacFch <= ?) AND (T1.FacFasCod <> ' ') AND (T1.FacCod >= ?) AND (T1.FacCod <= ?) AND (T1.FacAlbTip = 1) AND (T2.FacPri = '1') ORDER BY T1.EmprCod, T1.FacFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T5", "SELECT T1.EmprCod, T1.FacAlbTip, T2.FacPri, T1.FacImpdto, T1.FacUnds, T1.FacPreMts, T1.FacCod, T2.FacFch, T1.FacMts, T1.FacPreKgs, T1.FacKgs, T1.FacSer, T1.FacCliCod, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE (T1.EmprCod = ?) AND (T2.FacFch >= ?) AND (T2.FacFch <= ?) AND (T1.FacCod >= ?) AND (T1.FacCod <= ?) AND (T1.FacAlbTip = 1) AND (T2.FacPri = '1') ORDER BY T1.EmprCod, T1.FacCliCod, T1.FacSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T6", "SELECT T1.EmprCod, T1.FacAlbTip, T2.FacPri, T1.FacCod, T2.FacFch, T1.FacUnds, T1.FacPreMts, T1.FacPreKgs, T1.FacCliCod, T1.FacSer, T2.FacTot1, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE (T1.EmprCod = ?) AND (T2.FacFch >= ?) AND (T2.FacFch <= ?) AND (T1.FacCod >= ?) AND (T1.FacCod <= ?) AND (T2.FacTot1 <> 0) AND (T1.FacAlbTip = 2) AND (T2.FacPri = '1') ORDER BY T1.EmprCod, T1.FacCliCod, T1.FacSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T7", "SELECT T1.EmprCod, T2.FacPri, T2.FacTot1, T1.FacCod, T2.FacFch, T1.FacUnds, T1.FacMts, T1.FacKgs, T1.FacAlbTip, T1.FacCliCod, T1.FacSer, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE (T1.EmprCod = ?) AND (T2.FacFch >= ?) AND (T2.FacFch <= ?) AND (T1.FacCod >= ?) AND (T1.FacCod <= ?) AND (T2.FacPri = '1') AND (T2.FacTot1 = 0) ORDER BY T1.EmprCod, T1.FacCliCod, T1.FacSer ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T8", "SELECT EmprCod, FacPri, FacCod, FacTipFac, FacFch FROM TXPCFAVEN WHERE (EmprCod = ? and FacFch >= ?) AND (FacTipFac >= 1) AND (FacTipFac <= 2) AND (FacCod >= ?) AND (FacCod <= ?) AND (FacPri = '1') AND (FacFch <= ?) ORDER BY EmprCod, FacFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T9", "SELECT IvaPor, IvaCod FROM TXPTIPIVA ORDER BY IvaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T10", "SELECT EmprCod, FacPri, FacCod, FacFch, FacAnulada, FacTipFac, FacLiq2, FacLiq1, FacDtoPP FROM TXPCFAVEN WHERE (EmprCod = ? and FacFch >= ?) AND (FacCod >= ?) AND (FacCod <= ?) AND (FacPri = '1') AND (FacFch <= ?) ORDER BY EmprCod, FacFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T11", "SELECT T1.MotAnuID, T1.EmprCod, T1.FacPri, T1.FacCod, T1.FacFch, T1.FacIVAPor, T1.MeivaId, T2.Cod_pais, T1.FacTipFac, T1.FacIDATe, T1.FacAnulada, T1.FacFecAnul, T3.MotAnuDc, T1.FacFirma, T1.FacHor, T1.CliCod, T2.CliDom, T2.CliPob, T2.CliCp2, T2.CliCp, T1.FacTot1, T1.FacLiq2, T1.FacIva1 FROM ((TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPMOTANU T3 ON T3.EmprCod = T1.EmprCod AND T3.MotAnuID = T1.MotAnuID) WHERE (T1.EmprCod = ? and T1.FacFch >= ? and T1.FacCod >= ?) AND (T1.FacCod <= ?) AND (T1.FacPri = '1') AND (T1.FacFch <= ?) ORDER BY T1.EmprCod, T1.FacFch, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T12", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T13", "SELECT EmprCod, AlbComCod, AlbComFch FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T14", "SELECT EmprCod, Cod_pais, Dsc_pais FROM TXPTR0400 WHERE EmprCod = ? and Cod_pais = ? ORDER BY EmprCod, Cod_pais ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T15", "SELECT EmprCod, FacCod, FacUnds, FacMts, FacKgs, FacAlbCod, FacAlbTip, FacSer, FacCliCod, FacDscII, FacDsc, FacPKDto, FacImpdto, FacPMdto, FacPreMts, FacPreKgs, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T16", "SELECT T1.EmprCod, T1.FacCod, T1.FacImpMan, T1.FacUnds, T1.FacPreUnd, T1.FacMts, T1.FacPreMts, T1.FacKgs, T1.FacPreKgs, T2.FacTipFac, T1.FacAlbCod, T1.FacAlbTip, T1.FacSer, T1.FacCliCod, T1.FacDsc, T1.FacDscII, T1.FacKgsA, T1.FacPKDto, T1.FacImpdto, T1.FacPreKgsA, T1.FacPMdto, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod, T1.FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T17", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbMtrE, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T18", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasMtr, FasKgm, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T19", "SELECT COUNT(*), SUM(AlbComCnt) FROM TXPLALCOM WHERE (EmprCod = ? and AlbComCod = ?) AND (AlbComCnt > 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T20", "SELECT EmprCod, AlbProCod, GuiRemCli, AlbProPri, AlbPdATCUD, AlbHorSal, AlbFecSal, AlbFmd, AlbHhfm, AlbLic FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T21", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarEncCli, T2.BarDisNum, T1.AlbEncCli, T1.BarAlbUnd, T1.BarPreUnd, T2.BarTipDis, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarSerDsc, T2.BarSer FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T22", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T1.FasMtr, T1.FasKgm, T2.FasDsc, T1.GuiFasPBK, T1.GuiFasPBM, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T23", "SELECT EmprCod, AlbComCod, CliCod, AlbComPri, AlbComID, AlbComHor, AlbComFd, AlbComFch, AlbComFs FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T24", "SELECT EmprCod, AlbComCod, AlbComCnt, AlbComDsc, AlbComUni, AlbComLin FROM TXPLALCOM WHERE (EmprCod = ? and AlbComCod = ?) AND (AlbComCnt > 0) ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P056T25", "SELECT EmprCod, CliCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P056T26", "SELECT EmprCod, MeivaId, MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? and MeivaId = ? ORDER BY EmprCod, MeivaId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 34);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((String[]) buf[12])[0] = rslt.getString(12, 15);
               ((String[]) buf[13])[0] = rslt.getString(13, 10);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 20);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[15])[0] = rslt.getVarchar(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 200);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 34);
               ((String[]) buf[20])[0] = rslt.getString(18, 30);
               ((String[]) buf[21])[0] = rslt.getString(19, 6);
               ((String[]) buf[22])[0] = rslt.getString(20, 6);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,5);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 200);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((long[]) buf[10])[0] = rslt.getLong(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((String[]) buf[15])[0] = rslt.getString(16, 200);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,5);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 26);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 200);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

