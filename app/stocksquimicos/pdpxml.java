package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdpxml extends GXProcedure
{
   public pdpxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdpxml.class ), "" );
   }

   public pdpxml( int remoteHandle ,
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
      pdpxml.this.aP5 = new boolean[] {false};
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
      pdpxml.this.AV46Emprcod = aP0[0];
      this.aP0 = aP0;
      pdpxml.this.AV78AlbComCod = aP1[0];
      this.aP1 = aP1;
      pdpxml.this.AV96pathIN = aP2[0];
      this.aP2 = aP2;
      pdpxml.this.AV40Fichero = aP3[0];
      this.aP3 = aP3;
      pdpxml.this.aP4 = aP4;
      pdpxml.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV95ok = false ;
      GXt_int1 = AV80Numdoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      pdpxml.this.GXt_int1 = GXv_int2[0] ;
      AV80Numdoc = GXt_int1 ;
      GXt_int1 = (byte)(AV88siatcud) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      pdpxml.this.GXt_int1 = GXv_int2[0] ;
      AV88siatcud = GXt_int1 ;
      GXt_int3 = AV87valorsiatcud ;
      GXv_char4[0] = AV46Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pdpxml.this.AV46Emprcod = GXv_char4[0] ;
      pdpxml.this.GXt_int3 = GXv_int6[0] ;
      AV87valorsiatcud = (short)(GXt_int3) ;
      /* Using cursor P05Z32 */
      pr_default.execute(0, new Object[] {AV46Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05Z32_A396EmprCod[0] ;
         A395EmprCif = P05Z32_A395EmprCif[0] ;
         n395EmprCif = P05Z32_n395EmprCif[0] ;
         A407EmprNom = P05Z32_A407EmprNom[0] ;
         n407EmprNom = P05Z32_n407EmprNom[0] ;
         A404EmprDir = P05Z32_A404EmprDir[0] ;
         n404EmprDir = P05Z32_n404EmprDir[0] ;
         A408EmprPob = P05Z32_A408EmprPob[0] ;
         n408EmprPob = P05Z32_n408EmprPob[0] ;
         A403EmprCpo = P05Z32_A403EmprCpo[0] ;
         n403EmprCpo = P05Z32_n403EmprCpo[0] ;
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
      AV94path += GXutil.trim( AV96pathIN) + "\\" + GXutil.trim( AV40Fichero) + httpContext.getMessage( ".xml", "") ;
      AV39filexml.openURL(AV94path);
      if ( AV39filexml.getErrCode() > 0 )
      {
         AV93Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV93Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV39filexml.getErrCode(), 10, 2)) );
         AV93Message.setgxTv_SdtMessages_Message_Description( AV39filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV93Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV92Messages.add(AV93Message, 0);
      }
      else
      {
         AV41Body = httpContext.getMessage( "S:Body", "") ;
         AV39filexml.writeStartElement(AV41Body);
         AV41Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV39filexml.writeNSStartElement(AV41Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         /* Using cursor P05Z33 */
         pr_default.execute(1, new Object[] {AV46Emprcod, Integer.valueOf(AV78AlbComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13418AlbProID = P05Z33_A13418AlbProID[0] ;
            A396EmprCod = P05Z33_A396EmprCod[0] ;
            A14192AlbProTipA = P05Z33_A14192AlbProTipA[0] ;
            n14192AlbProTipA = P05Z33_n14192AlbProTipA[0] ;
            A14191AlbProSerA = P05Z33_A14191AlbProSerA[0] ;
            n14191AlbProSerA = P05Z33_n14191AlbProSerA[0] ;
            A14190AlbProATCU = P05Z33_A14190AlbProATCU[0] ;
            n14190AlbProATCU = P05Z33_n14190AlbProATCU[0] ;
            A13429AlbProSal = P05Z33_A13429AlbProSal[0] ;
            A13417AlbProTipo = P05Z33_A13417AlbProTipo[0] ;
            A13425AlbProCliC = P05Z33_A13425AlbProCliC[0] ;
            A13427AlbProDomE = P05Z33_A13427AlbProDomE[0] ;
            A13419AlbProPrvI = P05Z33_A13419AlbProPrvI[0] ;
            A13424AlbProMatr = P05Z33_A13424AlbProMatr[0] ;
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
            AV79Doc = "7" + GXutil.padl( GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0)), (short)(8), "0") ;
            AV97AlbProTipAT = A14192AlbProTipA ;
            if ( ( AV88siatcud == 1 ) && ( AV87valorsiatcud == 1 ) )
            {
               AV91documentnumber = GXutil.trim( A14192AlbProTipA) + " " + GXutil.trim( A14191AlbProSerA) + "/" + GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0)) ;
               AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV91documentnumber));
            }
            else
            {
               if ( AV80Numdoc == 0 )
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0)));
               }
               else
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV79Doc));
               }
            }
            AV89codValidacaoSerie = A14190AlbProATCU ;
            AV90atcud = ((GXutil.strcmp("", AV89codValidacaoSerie)==0) ? "" : GXutil.trim( AV89codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( AV78AlbComCod, 8, 0))) ;
            if ( ! (GXutil.strcmp("", AV89codValidacaoSerie)==0) )
            {
               AV39filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV90atcud));
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
            AV58VarAux = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV59HhSys = GXutil.substring( AV58VarAux, 12, 8) ;
            AV60FecSys = localUtil.ctod( GXutil.substring( AV58VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( AV60FecSys), 10, 0)) ;
            AV61DateAux += ((GXutil.month( AV60FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0))) ;
            AV61DateAux += ((GXutil.day( AV60FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0))) ;
            AV41Body = AV61DateAux ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV41Body));
            if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV50Clicod = A13425AlbProCliC ;
               /* Execute user subroutine: 'CLIENT' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( A13427AlbProDomE > 0 )
               {
                  AV85AlbProDomEnv = A13427AlbProDomE ;
                  /* Execute user subroutine: 'CLIENV' */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
            }
            else
            {
               AV84PrvNum = A13419AlbProPrvI ;
               /* Execute user subroutine: 'PRVGEN' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementType", ""), GXutil.trim( AV97AlbProTipAT));
            AV39filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV48CliNif));
            AV39filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV51CliDom));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV52CliPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV53Cp));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV82CliEnvDom));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV83CliEnvPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV53Cp));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV39filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV39filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV55EmprDir));
            AV39filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV56EmprPob));
            AV39filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV75Cp8));
            AV39filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV39filexml.writeEndElement();
            AV58VarAux = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV68FecHorSal = localUtil.ctot( AV58VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV67VarAux0 = AV68FecHorSal ;
            AV58VarAux = localUtil.ttoc( AV67VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV59HhSys = GXutil.substring( AV58VarAux, 12, 8) ;
            AV60FecSys = localUtil.ctod( GXutil.substring( AV58VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( AV60FecSys), 10, 0)) ;
            AV61DateAux += ((GXutil.month( AV60FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.month( AV60FecSys), 10, 0))) ;
            AV61DateAux += ((GXutil.day( AV60FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.day( AV60FecSys), 10, 0))) ;
            AV41Body = AV61DateAux + httpContext.getMessage( "T", "") + AV59HhSys ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV41Body));
            AV41Body = "0" ;
            if ( GXutil.strcmp(A13424AlbProMatr, " ") != 0 )
            {
               AV41Body = A13424AlbProMatr ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV41Body));
            /* Using cursor P05Z34 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13443AlbProCnt = P05Z34_A13443AlbProCnt[0] ;
               n13443AlbProCnt = P05Z34_n13443AlbProCnt[0] ;
               A13448AlbProDsc = P05Z34_A13448AlbProDsc[0] ;
               n13448AlbProDsc = P05Z34_n13448AlbProDsc[0] ;
               A13444AlbProUnd = P05Z34_A13444AlbProUnd[0] ;
               n13444AlbProUnd = P05Z34_n13444AlbProUnd[0] ;
               A13442AlbProLine = P05Z34_A13442AlbProLine[0] ;
               AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
               AV62Pd = A13448AlbProDsc ;
               AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
               AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13443AlbProCnt, 9, 2)), (short)(9), " ") ;
               AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
               AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
               AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
               AV77Un = GXutil.upper( A13444AlbProUnd) ;
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
         AV95ok = true ;
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
      /* Using cursor P05Z35 */
      pr_default.execute(3, new Object[] {AV46Emprcod, Integer.valueOf(AV50Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P05Z35_A252CliCod[0] ;
         A396EmprCod = P05Z35_A396EmprCod[0] ;
         A279CliNom = P05Z35_A279CliNom[0] ;
         A260CliDom = P05Z35_A260CliDom[0] ;
         A295CliPob = P05Z35_A295CliPob[0] ;
         A4828CliCp2 = P05Z35_A4828CliCp2[0] ;
         A256CliCp = P05Z35_A256CliCp[0] ;
         A278CliNif = P05Z35_A278CliNif[0] ;
         AV49CliNom = A279CliNom ;
         AV51CliDom = A260CliDom ;
         AV52CliPob = A295CliPob ;
         AV53Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV48CliNif = A278CliNif ;
         AV81CliEnvNom = A279CliNom ;
         AV82CliEnvDom = A260CliDom ;
         AV53Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV83CliEnvPob = A295CliPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV49CliNom = " " ;
      AV51CliDom = " " ;
      AV52CliPob = " " ;
      AV53Cp = " " ;
      AV48CliNif = " " ;
      /* Using cursor P05Z36 */
      pr_default.execute(4, new Object[] {AV46Emprcod, Integer.valueOf(AV84PrvNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A795PrvNum = P05Z36_A795PrvNum[0] ;
         A396EmprCod = P05Z36_A396EmprCod[0] ;
         A794PrvNom = P05Z36_A794PrvNom[0] ;
         n794PrvNom = P05Z36_n794PrvNom[0] ;
         A786PrvDir = P05Z36_A786PrvDir[0] ;
         n786PrvDir = P05Z36_n786PrvDir[0] ;
         A799PrvPob = P05Z36_A799PrvPob[0] ;
         n799PrvPob = P05Z36_n799PrvPob[0] ;
         A6075PrvCp2 = P05Z36_A6075PrvCp2[0] ;
         n6075PrvCp2 = P05Z36_n6075PrvCp2[0] ;
         A782PrvCpo = P05Z36_A782PrvCpo[0] ;
         n782PrvCpo = P05Z36_n782PrvCpo[0] ;
         A793PrvNif = P05Z36_A793PrvNif[0] ;
         n793PrvNif = P05Z36_n793PrvNif[0] ;
         AV49CliNom = A794PrvNom ;
         AV51CliDom = A786PrvDir ;
         AV52CliPob = A799PrvPob ;
         AV53Cp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV48CliNif = A793PrvNif ;
         AV81CliEnvNom = A794PrvNom ;
         AV82CliEnvDom = A786PrvDir ;
         AV53Cp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV83CliEnvPob = A799PrvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S131( )
   {
      /* 'CLIENV' Routine */
      returnInSub = false ;
      /* Using cursor P05Z37 */
      pr_default.execute(5, new Object[] {AV46Emprcod, Integer.valueOf(AV50Clicod), Byte.valueOf(AV85AlbProDomEnv)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A266CliEnvLin = P05Z37_A266CliEnvLin[0] ;
         A252CliCod = P05Z37_A252CliCod[0] ;
         A396EmprCod = P05Z37_A396EmprCod[0] ;
         A267CliEnvNom = P05Z37_A267CliEnvNom[0] ;
         A265CliEnvDom = P05Z37_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P05Z37_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P05Z37_A264CliEnvCp[0] ;
         A268CliEnvPob = P05Z37_A268CliEnvPob[0] ;
         AV81CliEnvNom = A267CliEnvNom ;
         AV82CliEnvDom = A265CliEnvDom ;
         AV53Cp = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( A10775CliEnvCp2) ;
         AV83CliEnvPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdpxml.this.AV46Emprcod;
      this.aP1[0] = pdpxml.this.AV78AlbComCod;
      this.aP2[0] = pdpxml.this.AV96pathIN;
      this.aP3[0] = pdpxml.this.AV40Fichero;
      this.aP4[0] = pdpxml.this.AV92Messages;
      this.aP5[0] = pdpxml.this.AV95ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV92Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P05Z32_A396EmprCod = new String[] {""} ;
      P05Z32_A395EmprCif = new String[] {""} ;
      P05Z32_n395EmprCif = new boolean[] {false} ;
      P05Z32_A407EmprNom = new String[] {""} ;
      P05Z32_n407EmprNom = new boolean[] {false} ;
      P05Z32_A404EmprDir = new String[] {""} ;
      P05Z32_n404EmprDir = new boolean[] {false} ;
      P05Z32_A408EmprPob = new String[] {""} ;
      P05Z32_n408EmprPob = new boolean[] {false} ;
      P05Z32_A403EmprCpo = new String[] {""} ;
      P05Z32_n403EmprCpo = new boolean[] {false} ;
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
      AV94path = "" ;
      AV39filexml = new com.genexus.xml.XMLWriter();
      AV93Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV41Body = "" ;
      P05Z33_A13418AlbProID = new int[1] ;
      P05Z33_A396EmprCod = new String[] {""} ;
      P05Z33_A14192AlbProTipA = new String[] {""} ;
      P05Z33_n14192AlbProTipA = new boolean[] {false} ;
      P05Z33_A14191AlbProSerA = new String[] {""} ;
      P05Z33_n14191AlbProSerA = new boolean[] {false} ;
      P05Z33_A14190AlbProATCU = new String[] {""} ;
      P05Z33_n14190AlbProATCU = new boolean[] {false} ;
      P05Z33_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P05Z33_A13417AlbProTipo = new String[] {""} ;
      P05Z33_A13425AlbProCliC = new int[1] ;
      P05Z33_A13427AlbProDomE = new byte[1] ;
      P05Z33_A13419AlbProPrvI = new int[1] ;
      P05Z33_A13424AlbProMatr = new String[] {""} ;
      A14192AlbProTipA = "" ;
      A14191AlbProSerA = "" ;
      A14190AlbProATCU = "" ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13417AlbProTipo = "" ;
      A13424AlbProMatr = "" ;
      AV79Doc = "" ;
      AV97AlbProTipAT = "" ;
      AV91documentnumber = "" ;
      AV89codValidacaoSerie = "" ;
      AV90atcud = "" ;
      AV58VarAux = "" ;
      AV59HhSys = "" ;
      AV60FecSys = GXutil.nullDate() ;
      AV61DateAux = "" ;
      AV48CliNif = "" ;
      AV51CliDom = "" ;
      AV52CliPob = "" ;
      AV53Cp = "" ;
      AV82CliEnvDom = "" ;
      AV83CliEnvPob = "" ;
      AV68FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV67VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      P05Z34_A396EmprCod = new String[] {""} ;
      P05Z34_A13418AlbProID = new int[1] ;
      P05Z34_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Z34_n13443AlbProCnt = new boolean[] {false} ;
      P05Z34_A13448AlbProDsc = new String[] {""} ;
      P05Z34_n13448AlbProDsc = new boolean[] {false} ;
      P05Z34_A13444AlbProUnd = new String[] {""} ;
      P05Z34_n13444AlbProUnd = new boolean[] {false} ;
      P05Z34_A13442AlbProLine = new short[1] ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13448AlbProDsc = "" ;
      A13444AlbProUnd = "" ;
      AV62Pd = "" ;
      AV70VarKgs = "" ;
      AV71Vconv = "" ;
      AV72Num9 = DecimalUtil.ZERO ;
      AV77Un = "" ;
      AV49CliNom = "" ;
      P05Z35_A252CliCod = new int[1] ;
      P05Z35_A396EmprCod = new String[] {""} ;
      P05Z35_A279CliNom = new String[] {""} ;
      P05Z35_A260CliDom = new String[] {""} ;
      P05Z35_A295CliPob = new String[] {""} ;
      P05Z35_A4828CliCp2 = new String[] {""} ;
      P05Z35_A256CliCp = new String[] {""} ;
      P05Z35_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      AV81CliEnvNom = "" ;
      P05Z36_A795PrvNum = new int[1] ;
      P05Z36_A396EmprCod = new String[] {""} ;
      P05Z36_A794PrvNom = new String[] {""} ;
      P05Z36_n794PrvNom = new boolean[] {false} ;
      P05Z36_A786PrvDir = new String[] {""} ;
      P05Z36_n786PrvDir = new boolean[] {false} ;
      P05Z36_A799PrvPob = new String[] {""} ;
      P05Z36_n799PrvPob = new boolean[] {false} ;
      P05Z36_A6075PrvCp2 = new String[] {""} ;
      P05Z36_n6075PrvCp2 = new boolean[] {false} ;
      P05Z36_A782PrvCpo = new String[] {""} ;
      P05Z36_n782PrvCpo = new boolean[] {false} ;
      P05Z36_A793PrvNif = new String[] {""} ;
      P05Z36_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A6075PrvCp2 = "" ;
      A782PrvCpo = "" ;
      A793PrvNif = "" ;
      P05Z37_A266CliEnvLin = new byte[1] ;
      P05Z37_A252CliCod = new int[1] ;
      P05Z37_A396EmprCod = new String[] {""} ;
      P05Z37_A267CliEnvNom = new String[] {""} ;
      P05Z37_A265CliEnvDom = new String[] {""} ;
      P05Z37_A10775CliEnvCp2 = new String[] {""} ;
      P05Z37_A264CliEnvCp = new String[] {""} ;
      P05Z37_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pdpxml__default(),
         new Object[] {
             new Object[] {
            P05Z32_A396EmprCod, P05Z32_A395EmprCif, P05Z32_n395EmprCif, P05Z32_A407EmprNom, P05Z32_n407EmprNom, P05Z32_A404EmprDir, P05Z32_n404EmprDir, P05Z32_A408EmprPob, P05Z32_n408EmprPob, P05Z32_A403EmprCpo,
            P05Z32_n403EmprCpo
            }
            , new Object[] {
            P05Z33_A13418AlbProID, P05Z33_A396EmprCod, P05Z33_A14192AlbProTipA, P05Z33_n14192AlbProTipA, P05Z33_A14191AlbProSerA, P05Z33_n14191AlbProSerA, P05Z33_A14190AlbProATCU, P05Z33_n14190AlbProATCU, P05Z33_A13429AlbProSal, P05Z33_A13417AlbProTipo,
            P05Z33_A13425AlbProCliC, P05Z33_A13427AlbProDomE, P05Z33_A13419AlbProPrvI, P05Z33_A13424AlbProMatr
            }
            , new Object[] {
            P05Z34_A396EmprCod, P05Z34_A13418AlbProID, P05Z34_A13443AlbProCnt, P05Z34_n13443AlbProCnt, P05Z34_A13448AlbProDsc, P05Z34_n13448AlbProDsc, P05Z34_A13444AlbProUnd, P05Z34_n13444AlbProUnd, P05Z34_A13442AlbProLine
            }
            , new Object[] {
            P05Z35_A252CliCod, P05Z35_A396EmprCod, P05Z35_A279CliNom, P05Z35_A260CliDom, P05Z35_A295CliPob, P05Z35_A4828CliCp2, P05Z35_A256CliCp, P05Z35_A278CliNif
            }
            , new Object[] {
            P05Z36_A795PrvNum, P05Z36_A396EmprCod, P05Z36_A794PrvNom, P05Z36_n794PrvNom, P05Z36_A786PrvDir, P05Z36_n786PrvDir, P05Z36_A799PrvPob, P05Z36_n799PrvPob, P05Z36_A6075PrvCp2, P05Z36_n6075PrvCp2,
            P05Z36_A782PrvCpo, P05Z36_n782PrvCpo, P05Z36_A793PrvNif, P05Z36_n793PrvNif
            }
            , new Object[] {
            P05Z37_A266CliEnvLin, P05Z37_A252CliCod, P05Z37_A396EmprCod, P05Z37_A267CliEnvNom, P05Z37_A265CliEnvDom, P05Z37_A10775CliEnvCp2, P05Z37_A264CliEnvCp, P05Z37_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV80Numdoc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A13427AlbProDomE ;
   private byte AV85AlbProDomEnv ;
   private byte A266CliEnvLin ;
   private short AV88siatcud ;
   private short AV87valorsiatcud ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int AV78AlbComCod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A13418AlbProID ;
   private int A13425AlbProCliC ;
   private int A13419AlbProPrvI ;
   private int AV50Clicod ;
   private int AV84PrvNum ;
   private int A252CliCod ;
   private int A795PrvNum ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal AV72Num9 ;
   private String AV46Emprcod ;
   private String AV96pathIN ;
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
   private String AV94path ;
   private String AV41Body ;
   private String A14192AlbProTipA ;
   private String A14191AlbProSerA ;
   private String A14190AlbProATCU ;
   private String A13417AlbProTipo ;
   private String A13424AlbProMatr ;
   private String AV79Doc ;
   private String AV97AlbProTipAT ;
   private String AV89codValidacaoSerie ;
   private String AV58VarAux ;
   private String AV59HhSys ;
   private String AV61DateAux ;
   private String AV48CliNif ;
   private String AV51CliDom ;
   private String AV52CliPob ;
   private String AV53Cp ;
   private String AV82CliEnvDom ;
   private String AV83CliEnvPob ;
   private String A13448AlbProDsc ;
   private String A13444AlbProUnd ;
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
   private String AV81CliEnvNom ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A799PrvPob ;
   private String A6075PrvCp2 ;
   private String A782PrvCpo ;
   private String A793PrvNif ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A10775CliEnvCp2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date AV68FecHorSal ;
   private java.util.Date AV67VarAux0 ;
   private java.util.Date AV60FecSys ;
   private boolean AV95ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n14192AlbProTipA ;
   private boolean n14191AlbProSerA ;
   private boolean n14190AlbProATCU ;
   private boolean returnInSub ;
   private boolean n13443AlbProCnt ;
   private boolean n13448AlbProDsc ;
   private boolean n13444AlbProUnd ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n799PrvPob ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n793PrvNif ;
   private String AV91documentnumber ;
   private String AV90atcud ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Z32_A396EmprCod ;
   private String[] P05Z32_A395EmprCif ;
   private boolean[] P05Z32_n395EmprCif ;
   private String[] P05Z32_A407EmprNom ;
   private boolean[] P05Z32_n407EmprNom ;
   private String[] P05Z32_A404EmprDir ;
   private boolean[] P05Z32_n404EmprDir ;
   private String[] P05Z32_A408EmprPob ;
   private boolean[] P05Z32_n408EmprPob ;
   private String[] P05Z32_A403EmprCpo ;
   private boolean[] P05Z32_n403EmprCpo ;
   private int[] P05Z33_A13418AlbProID ;
   private String[] P05Z33_A396EmprCod ;
   private String[] P05Z33_A14192AlbProTipA ;
   private boolean[] P05Z33_n14192AlbProTipA ;
   private String[] P05Z33_A14191AlbProSerA ;
   private boolean[] P05Z33_n14191AlbProSerA ;
   private String[] P05Z33_A14190AlbProATCU ;
   private boolean[] P05Z33_n14190AlbProATCU ;
   private java.util.Date[] P05Z33_A13429AlbProSal ;
   private String[] P05Z33_A13417AlbProTipo ;
   private int[] P05Z33_A13425AlbProCliC ;
   private byte[] P05Z33_A13427AlbProDomE ;
   private int[] P05Z33_A13419AlbProPrvI ;
   private String[] P05Z33_A13424AlbProMatr ;
   private String[] P05Z34_A396EmprCod ;
   private int[] P05Z34_A13418AlbProID ;
   private java.math.BigDecimal[] P05Z34_A13443AlbProCnt ;
   private boolean[] P05Z34_n13443AlbProCnt ;
   private String[] P05Z34_A13448AlbProDsc ;
   private boolean[] P05Z34_n13448AlbProDsc ;
   private String[] P05Z34_A13444AlbProUnd ;
   private boolean[] P05Z34_n13444AlbProUnd ;
   private short[] P05Z34_A13442AlbProLine ;
   private int[] P05Z35_A252CliCod ;
   private String[] P05Z35_A396EmprCod ;
   private String[] P05Z35_A279CliNom ;
   private String[] P05Z35_A260CliDom ;
   private String[] P05Z35_A295CliPob ;
   private String[] P05Z35_A4828CliCp2 ;
   private String[] P05Z35_A256CliCp ;
   private String[] P05Z35_A278CliNif ;
   private int[] P05Z36_A795PrvNum ;
   private String[] P05Z36_A396EmprCod ;
   private String[] P05Z36_A794PrvNom ;
   private boolean[] P05Z36_n794PrvNom ;
   private String[] P05Z36_A786PrvDir ;
   private boolean[] P05Z36_n786PrvDir ;
   private String[] P05Z36_A799PrvPob ;
   private boolean[] P05Z36_n799PrvPob ;
   private String[] P05Z36_A6075PrvCp2 ;
   private boolean[] P05Z36_n6075PrvCp2 ;
   private String[] P05Z36_A782PrvCpo ;
   private boolean[] P05Z36_n782PrvCpo ;
   private String[] P05Z36_A793PrvNif ;
   private boolean[] P05Z36_n793PrvNif ;
   private byte[] P05Z37_A266CliEnvLin ;
   private int[] P05Z37_A252CliCod ;
   private String[] P05Z37_A396EmprCod ;
   private String[] P05Z37_A267CliEnvNom ;
   private String[] P05Z37_A265CliEnvDom ;
   private String[] P05Z37_A10775CliEnvCp2 ;
   private String[] P05Z37_A264CliEnvCp ;
   private String[] P05Z37_A268CliEnvPob ;
   private com.genexus.xml.XMLWriter AV39filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV92Messages ;
   private com.genexus.SdtMessages_Message AV93Message ;
}

final  class pdpxml__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Z32", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05Z33", "SELECT AlbProID, EmprCod, AlbProTipA, AlbProSerA, AlbProATCU, AlbProSal, AlbProTipo, AlbProCliC, AlbProDomE, AlbProPrvI, AlbProMatr FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05Z34", "SELECT EmprCod, AlbProID, AlbProCnt, AlbProDsc, AlbProUnd, AlbProLine FROM TXPLALPRO WHERE (EmprCod = ? and AlbProID = ?) AND (AlbProCnt > 0) ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05Z35", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05Z36", "SELECT PrvNum, EmprCod, PrvNom, PrvDir, PrvPob, PrvCp2, PrvCpo, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05Z37", "SELECT CliEnvLin, CliCod, EmprCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
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
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

