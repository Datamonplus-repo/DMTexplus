package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_xml_anulacion extends GXProcedure
{
   public documentotransporteproveedor_xml_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_xml_anulacion.class ), "" );
   }

   public documentotransporteproveedor_xml_anulacion( int remoteHandle ,
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
      documentotransporteproveedor_xml_anulacion.this.aP5 = new boolean[] {false};
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
      documentotransporteproveedor_xml_anulacion.this.AV32Emprcod = aP0[0];
      this.aP0 = aP0;
      documentotransporteproveedor_xml_anulacion.this.AV8AlbComCod = aP1[0];
      this.aP1 = aP1;
      documentotransporteproveedor_xml_anulacion.this.AV67pathIN = aP2[0];
      this.aP2 = aP2;
      documentotransporteproveedor_xml_anulacion.this.AV40Fichero = aP3[0];
      this.aP3 = aP3;
      documentotransporteproveedor_xml_anulacion.this.aP4 = aP4;
      documentotransporteproveedor_xml_anulacion.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV66ok = false ;
      GXt_int1 = AV49Numdoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV32Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      documentotransporteproveedor_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV49Numdoc = GXt_int1 ;
      GXt_int1 = (byte)(AV53siatcud) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV32Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      documentotransporteproveedor_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV53siatcud = GXt_int1 ;
      GXt_int3 = AV55valorsiatcud ;
      GXv_char4[0] = AV32Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      documentotransporteproveedor_xml_anulacion.this.AV32Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_xml_anulacion.this.GXt_int3 = GXv_int6[0] ;
      AV55valorsiatcud = (short)(GXt_int3) ;
      /* Using cursor P0AK52 */
      pr_default.execute(0, new Object[] {AV32Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AK52_A396EmprCod[0] ;
         A395EmprCif = P0AK52_A395EmprCif[0] ;
         n395EmprCif = P0AK52_n395EmprCif[0] ;
         A407EmprNom = P0AK52_A407EmprNom[0] ;
         n407EmprNom = P0AK52_n407EmprNom[0] ;
         A404EmprDir = P0AK52_A404EmprDir[0] ;
         n404EmprDir = P0AK52_n404EmprDir[0] ;
         A408EmprPob = P0AK52_A408EmprPob[0] ;
         n408EmprPob = P0AK52_n408EmprPob[0] ;
         A403EmprCpo = P0AK52_A403EmprCpo[0] ;
         n403EmprCpo = P0AK52_n403EmprCpo[0] ;
         AV31Emprcif = A395EmprCif ;
         AV35EmprNom = A407EmprNom ;
         AV34EmprDir = A404EmprDir ;
         AV36EmprPob = A408EmprPob ;
         AV33Emprcp = A403EmprCpo ;
         AV26Cp4 = GXutil.substring( AV33Emprcp, 1, 4) ;
         AV25Cp3 = GXutil.substring( AV33Emprcp, 5, 3) ;
         AV27Cp8 = AV26Cp4 + "-" + AV25Cp3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV50path += GXutil.trim( AV67pathIN) + "\\" + GXutil.trim( AV40Fichero) + httpContext.getMessage( ".xml", "") ;
      AV42filexml.openURL(AV50path);
      if ( AV42filexml.getErrCode() > 0 )
      {
         AV45Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV45Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV42filexml.getErrCode(), 10, 2)) );
         AV45Message.setgxTv_SdtMessages_Message_Description( AV42filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV45Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV46Messages.add(AV45Message, 0);
      }
      else
      {
         AV14Body = httpContext.getMessage( "S:Body", "") ;
         AV42filexml.writeStartElement(AV14Body);
         AV14Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV42filexml.writeNSStartElement(AV14Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         /* Using cursor P0AK53 */
         pr_default.execute(1, new Object[] {AV32Emprcod, Integer.valueOf(AV8AlbComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13418AlbProID = P0AK53_A13418AlbProID[0] ;
            A396EmprCod = P0AK53_A396EmprCod[0] ;
            A14192AlbProTipA = P0AK53_A14192AlbProTipA[0] ;
            n14192AlbProTipA = P0AK53_n14192AlbProTipA[0] ;
            A14191AlbProSerA = P0AK53_A14191AlbProSerA[0] ;
            n14191AlbProSerA = P0AK53_n14191AlbProSerA[0] ;
            A14190AlbProATCU = P0AK53_A14190AlbProATCU[0] ;
            n14190AlbProATCU = P0AK53_n14190AlbProATCU[0] ;
            A13436AlbProIDAT = P0AK53_A13436AlbProIDAT[0] ;
            A13429AlbProSal = P0AK53_A13429AlbProSal[0] ;
            A13417AlbProTipo = P0AK53_A13417AlbProTipo[0] ;
            A13425AlbProCliC = P0AK53_A13425AlbProCliC[0] ;
            A13427AlbProDomE = P0AK53_A13427AlbProDomE[0] ;
            A13419AlbProPrvI = P0AK53_A13419AlbProPrvI[0] ;
            A13424AlbProMatr = P0AK53_A13424AlbProMatr[0] ;
            AV14Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV42filexml.writeElement(AV14Body, GXutil.trim( AV31Emprcif));
            AV14Body = httpContext.getMessage( "CompanyName", "") ;
            AV42filexml.writeElement(AV14Body, GXutil.trim( AV35EmprNom));
            AV42filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV42filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV34EmprDir));
            AV42filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV36EmprPob));
            AV42filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV27Cp8));
            AV42filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV42filexml.writeEndElement();
            AV29Doc = "7" + GXutil.padl( GXutil.trim( GXutil.str( AV8AlbComCod, 8, 0)), (short)(8), "0") ;
            AV68AlbProTipAT = A14192AlbProTipA ;
            if ( ( AV53siatcud == 1 ) && ( AV55valorsiatcud == 1 ) )
            {
               AV30documentnumber = GXutil.trim( A14192AlbProTipA) + " " + GXutil.trim( A14191AlbProSerA) + "/" + GXutil.trim( GXutil.str( AV8AlbComCod, 8, 0)) ;
               AV42filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV30documentnumber));
            }
            else
            {
               if ( AV49Numdoc == 0 )
               {
                  AV42filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( GXutil.str( AV8AlbComCod, 8, 0)));
               }
               else
               {
                  AV42filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV29Doc));
               }
            }
            AV23codValidacaoSerie = A14190AlbProATCU ;
            AV12atcud = ((GXutil.strcmp("", AV23codValidacaoSerie)==0) ? "" : GXutil.trim( AV23codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( AV8AlbComCod, 8, 0))) ;
            AV42filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV12atcud));
            AV42filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( A13436AlbProIDAT));
            AV42filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "A", ""));
            AV56VarAux = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV43HhSys = GXutil.substring( AV56VarAux, 12, 8) ;
            AV39FecSys = localUtil.ctod( GXutil.substring( AV56VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV28DateAux = GXutil.trim( GXutil.str( GXutil.year( AV39FecSys), 10, 0)) ;
            AV28DateAux += ((GXutil.month( AV39FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.month( AV39FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.month( AV39FecSys), 10, 0))) ;
            AV28DateAux += ((GXutil.day( AV39FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.day( AV39FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.day( AV39FecSys), 10, 0))) ;
            AV14Body = AV28DateAux ;
            AV42filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV14Body));
            if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV15Clicod = A13425AlbProCliC ;
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
                  AV11AlbProDomEnv = A13427AlbProDomE ;
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
               AV52PrvNum = A13419AlbProPrvI ;
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
            AV42filexml.writeElement(httpContext.getMessage( "MovementType", ""), GXutil.trim( AV68AlbProTipAT));
            AV42filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV20CliNif));
            AV42filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV42filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV16CliDom));
            AV42filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV22CliPob));
            AV42filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV24Cp));
            AV42filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV42filexml.writeEndElement();
            AV42filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV42filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV17CliEnvDom));
            AV42filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV19CliEnvPob));
            AV42filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV24Cp));
            AV42filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV42filexml.writeEndElement();
            AV42filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV42filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV34EmprDir));
            AV42filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV36EmprPob));
            AV42filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV27Cp8));
            AV42filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV42filexml.writeEndElement();
            AV56VarAux = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV38FecHorSal = localUtil.ctot( AV56VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV57VarAux0 = AV38FecHorSal ;
            AV56VarAux = localUtil.ttoc( AV57VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV43HhSys = GXutil.substring( AV56VarAux, 12, 8) ;
            AV39FecSys = localUtil.ctod( GXutil.substring( AV56VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV28DateAux = GXutil.trim( GXutil.str( GXutil.year( AV39FecSys), 10, 0)) ;
            AV28DateAux += ((GXutil.month( AV39FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.month( AV39FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.month( AV39FecSys), 10, 0))) ;
            AV28DateAux += ((GXutil.day( AV39FecSys)<10) ? "-0"+GXutil.trim( GXutil.str( GXutil.day( AV39FecSys), 10, 0)) : "-"+GXutil.trim( GXutil.str( GXutil.day( AV39FecSys), 10, 0))) ;
            AV14Body = AV28DateAux + httpContext.getMessage( "T", "") + AV43HhSys ;
            AV42filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV14Body));
            AV14Body = "0" ;
            if ( GXutil.strcmp(A13424AlbProMatr, " ") != 0 )
            {
               AV14Body = A13424AlbProMatr ;
            }
            AV42filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV14Body));
            /* Using cursor P0AK54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13443AlbProCnt = P0AK54_A13443AlbProCnt[0] ;
               n13443AlbProCnt = P0AK54_n13443AlbProCnt[0] ;
               A13448AlbProDsc = P0AK54_A13448AlbProDsc[0] ;
               n13448AlbProDsc = P0AK54_n13448AlbProDsc[0] ;
               A13444AlbProUnd = P0AK54_A13444AlbProUnd[0] ;
               n13444AlbProUnd = P0AK54_n13444AlbProUnd[0] ;
               A13442AlbProLine = P0AK54_A13442AlbProLine[0] ;
               AV42filexml.writeStartElement(httpContext.getMessage( "Line", ""));
               AV51Pd = A13448AlbProDsc ;
               AV42filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV51Pd));
               AV58VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13443AlbProCnt, 9, 2)), (short)(9), " ") ;
               AV59Vconv = GXutil.substring( AV58VarKgs, 1, 6) + "." + GXutil.substring( AV58VarKgs, 8, 9) ;
               AV48Num9 = CommonUtil.decimalVal( AV59Vconv, ".") ;
               AV42filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV58VarKgs));
               AV54Un = GXutil.upper( A13444AlbProUnd) ;
               AV42filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), GXutil.trim( AV54Un));
               AV42filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
               AV42filexml.writeEndElement();
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV42filexml.writeEndElement();
         AV42filexml.writeEndElement();
         AV42filexml.close();
         AV66ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENT' Routine */
      returnInSub = false ;
      AV21CliNom = " " ;
      AV16CliDom = " " ;
      AV22CliPob = " " ;
      AV24Cp = " " ;
      AV20CliNif = " " ;
      /* Using cursor P0AK55 */
      pr_default.execute(3, new Object[] {AV32Emprcod, Integer.valueOf(AV15Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P0AK55_A252CliCod[0] ;
         A396EmprCod = P0AK55_A396EmprCod[0] ;
         A279CliNom = P0AK55_A279CliNom[0] ;
         A260CliDom = P0AK55_A260CliDom[0] ;
         A295CliPob = P0AK55_A295CliPob[0] ;
         A4828CliCp2 = P0AK55_A4828CliCp2[0] ;
         A256CliCp = P0AK55_A256CliCp[0] ;
         A278CliNif = P0AK55_A278CliNif[0] ;
         AV21CliNom = A279CliNom ;
         AV16CliDom = A260CliDom ;
         AV22CliPob = A295CliPob ;
         AV24Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV20CliNif = A278CliNif ;
         AV18CliEnvNom = A279CliNom ;
         AV17CliEnvDom = A260CliDom ;
         AV24Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV19CliEnvPob = A295CliPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV21CliNom = " " ;
      AV16CliDom = " " ;
      AV22CliPob = " " ;
      AV24Cp = " " ;
      AV20CliNif = " " ;
      /* Using cursor P0AK56 */
      pr_default.execute(4, new Object[] {AV32Emprcod, Integer.valueOf(AV52PrvNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A795PrvNum = P0AK56_A795PrvNum[0] ;
         A396EmprCod = P0AK56_A396EmprCod[0] ;
         A794PrvNom = P0AK56_A794PrvNom[0] ;
         n794PrvNom = P0AK56_n794PrvNom[0] ;
         A786PrvDir = P0AK56_A786PrvDir[0] ;
         n786PrvDir = P0AK56_n786PrvDir[0] ;
         A799PrvPob = P0AK56_A799PrvPob[0] ;
         n799PrvPob = P0AK56_n799PrvPob[0] ;
         A6075PrvCp2 = P0AK56_A6075PrvCp2[0] ;
         n6075PrvCp2 = P0AK56_n6075PrvCp2[0] ;
         A782PrvCpo = P0AK56_A782PrvCpo[0] ;
         n782PrvCpo = P0AK56_n782PrvCpo[0] ;
         A793PrvNif = P0AK56_A793PrvNif[0] ;
         n793PrvNif = P0AK56_n793PrvNif[0] ;
         AV21CliNom = A794PrvNom ;
         AV16CliDom = A786PrvDir ;
         AV22CliPob = A799PrvPob ;
         AV24Cp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV20CliNif = A793PrvNif ;
         AV18CliEnvNom = A794PrvNom ;
         AV17CliEnvDom = A786PrvDir ;
         AV24Cp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV19CliEnvPob = A799PrvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S131( )
   {
      /* 'CLIENV' Routine */
      returnInSub = false ;
      /* Using cursor P0AK57 */
      pr_default.execute(5, new Object[] {AV32Emprcod, Integer.valueOf(AV15Clicod), Byte.valueOf(AV11AlbProDomEnv)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A266CliEnvLin = P0AK57_A266CliEnvLin[0] ;
         A252CliCod = P0AK57_A252CliCod[0] ;
         A396EmprCod = P0AK57_A396EmprCod[0] ;
         A267CliEnvNom = P0AK57_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AK57_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P0AK57_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P0AK57_A264CliEnvCp[0] ;
         A268CliEnvPob = P0AK57_A268CliEnvPob[0] ;
         AV18CliEnvNom = A267CliEnvNom ;
         AV17CliEnvDom = A265CliEnvDom ;
         AV24Cp = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( A10775CliEnvCp2) ;
         AV19CliEnvPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = documentotransporteproveedor_xml_anulacion.this.AV32Emprcod;
      this.aP1[0] = documentotransporteproveedor_xml_anulacion.this.AV8AlbComCod;
      this.aP2[0] = documentotransporteproveedor_xml_anulacion.this.AV67pathIN;
      this.aP3[0] = documentotransporteproveedor_xml_anulacion.this.AV40Fichero;
      this.aP4[0] = documentotransporteproveedor_xml_anulacion.this.AV46Messages;
      this.aP5[0] = documentotransporteproveedor_xml_anulacion.this.AV66ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV46Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P0AK52_A396EmprCod = new String[] {""} ;
      P0AK52_A395EmprCif = new String[] {""} ;
      P0AK52_n395EmprCif = new boolean[] {false} ;
      P0AK52_A407EmprNom = new String[] {""} ;
      P0AK52_n407EmprNom = new boolean[] {false} ;
      P0AK52_A404EmprDir = new String[] {""} ;
      P0AK52_n404EmprDir = new boolean[] {false} ;
      P0AK52_A408EmprPob = new String[] {""} ;
      P0AK52_n408EmprPob = new boolean[] {false} ;
      P0AK52_A403EmprCpo = new String[] {""} ;
      P0AK52_n403EmprCpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      AV31Emprcif = "" ;
      AV35EmprNom = "" ;
      AV34EmprDir = "" ;
      AV36EmprPob = "" ;
      AV33Emprcp = "" ;
      AV26Cp4 = "" ;
      AV25Cp3 = "" ;
      AV27Cp8 = "" ;
      AV50path = "" ;
      AV42filexml = new com.genexus.xml.XMLWriter();
      AV45Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV14Body = "" ;
      P0AK53_A13418AlbProID = new int[1] ;
      P0AK53_A396EmprCod = new String[] {""} ;
      P0AK53_A14192AlbProTipA = new String[] {""} ;
      P0AK53_n14192AlbProTipA = new boolean[] {false} ;
      P0AK53_A14191AlbProSerA = new String[] {""} ;
      P0AK53_n14191AlbProSerA = new boolean[] {false} ;
      P0AK53_A14190AlbProATCU = new String[] {""} ;
      P0AK53_n14190AlbProATCU = new boolean[] {false} ;
      P0AK53_A13436AlbProIDAT = new String[] {""} ;
      P0AK53_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AK53_A13417AlbProTipo = new String[] {""} ;
      P0AK53_A13425AlbProCliC = new int[1] ;
      P0AK53_A13427AlbProDomE = new byte[1] ;
      P0AK53_A13419AlbProPrvI = new int[1] ;
      P0AK53_A13424AlbProMatr = new String[] {""} ;
      A14192AlbProTipA = "" ;
      A14191AlbProSerA = "" ;
      A14190AlbProATCU = "" ;
      A13436AlbProIDAT = "" ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13417AlbProTipo = "" ;
      A13424AlbProMatr = "" ;
      AV29Doc = "" ;
      AV68AlbProTipAT = "" ;
      AV30documentnumber = "" ;
      AV23codValidacaoSerie = "" ;
      AV12atcud = "" ;
      AV56VarAux = "" ;
      AV43HhSys = "" ;
      AV39FecSys = GXutil.nullDate() ;
      AV28DateAux = "" ;
      AV20CliNif = "" ;
      AV16CliDom = "" ;
      AV22CliPob = "" ;
      AV24Cp = "" ;
      AV17CliEnvDom = "" ;
      AV19CliEnvPob = "" ;
      AV38FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV57VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      P0AK54_A396EmprCod = new String[] {""} ;
      P0AK54_A13418AlbProID = new int[1] ;
      P0AK54_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AK54_n13443AlbProCnt = new boolean[] {false} ;
      P0AK54_A13448AlbProDsc = new String[] {""} ;
      P0AK54_n13448AlbProDsc = new boolean[] {false} ;
      P0AK54_A13444AlbProUnd = new String[] {""} ;
      P0AK54_n13444AlbProUnd = new boolean[] {false} ;
      P0AK54_A13442AlbProLine = new short[1] ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13448AlbProDsc = "" ;
      A13444AlbProUnd = "" ;
      AV51Pd = "" ;
      AV58VarKgs = "" ;
      AV59Vconv = "" ;
      AV48Num9 = DecimalUtil.ZERO ;
      AV54Un = "" ;
      AV21CliNom = "" ;
      P0AK55_A252CliCod = new int[1] ;
      P0AK55_A396EmprCod = new String[] {""} ;
      P0AK55_A279CliNom = new String[] {""} ;
      P0AK55_A260CliDom = new String[] {""} ;
      P0AK55_A295CliPob = new String[] {""} ;
      P0AK55_A4828CliCp2 = new String[] {""} ;
      P0AK55_A256CliCp = new String[] {""} ;
      P0AK55_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      AV18CliEnvNom = "" ;
      P0AK56_A795PrvNum = new int[1] ;
      P0AK56_A396EmprCod = new String[] {""} ;
      P0AK56_A794PrvNom = new String[] {""} ;
      P0AK56_n794PrvNom = new boolean[] {false} ;
      P0AK56_A786PrvDir = new String[] {""} ;
      P0AK56_n786PrvDir = new boolean[] {false} ;
      P0AK56_A799PrvPob = new String[] {""} ;
      P0AK56_n799PrvPob = new boolean[] {false} ;
      P0AK56_A6075PrvCp2 = new String[] {""} ;
      P0AK56_n6075PrvCp2 = new boolean[] {false} ;
      P0AK56_A782PrvCpo = new String[] {""} ;
      P0AK56_n782PrvCpo = new boolean[] {false} ;
      P0AK56_A793PrvNif = new String[] {""} ;
      P0AK56_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A6075PrvCp2 = "" ;
      A782PrvCpo = "" ;
      A793PrvNif = "" ;
      P0AK57_A266CliEnvLin = new byte[1] ;
      P0AK57_A252CliCod = new int[1] ;
      P0AK57_A396EmprCod = new String[] {""} ;
      P0AK57_A267CliEnvNom = new String[] {""} ;
      P0AK57_A265CliEnvDom = new String[] {""} ;
      P0AK57_A10775CliEnvCp2 = new String[] {""} ;
      P0AK57_A264CliEnvCp = new String[] {""} ;
      P0AK57_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_xml_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AK52_A396EmprCod, P0AK52_A395EmprCif, P0AK52_n395EmprCif, P0AK52_A407EmprNom, P0AK52_n407EmprNom, P0AK52_A404EmprDir, P0AK52_n404EmprDir, P0AK52_A408EmprPob, P0AK52_n408EmprPob, P0AK52_A403EmprCpo,
            P0AK52_n403EmprCpo
            }
            , new Object[] {
            P0AK53_A13418AlbProID, P0AK53_A396EmprCod, P0AK53_A14192AlbProTipA, P0AK53_n14192AlbProTipA, P0AK53_A14191AlbProSerA, P0AK53_n14191AlbProSerA, P0AK53_A14190AlbProATCU, P0AK53_n14190AlbProATCU, P0AK53_A13436AlbProIDAT, P0AK53_A13429AlbProSal,
            P0AK53_A13417AlbProTipo, P0AK53_A13425AlbProCliC, P0AK53_A13427AlbProDomE, P0AK53_A13419AlbProPrvI, P0AK53_A13424AlbProMatr
            }
            , new Object[] {
            P0AK54_A396EmprCod, P0AK54_A13418AlbProID, P0AK54_A13443AlbProCnt, P0AK54_n13443AlbProCnt, P0AK54_A13448AlbProDsc, P0AK54_n13448AlbProDsc, P0AK54_A13444AlbProUnd, P0AK54_n13444AlbProUnd, P0AK54_A13442AlbProLine
            }
            , new Object[] {
            P0AK55_A252CliCod, P0AK55_A396EmprCod, P0AK55_A279CliNom, P0AK55_A260CliDom, P0AK55_A295CliPob, P0AK55_A4828CliCp2, P0AK55_A256CliCp, P0AK55_A278CliNif
            }
            , new Object[] {
            P0AK56_A795PrvNum, P0AK56_A396EmprCod, P0AK56_A794PrvNom, P0AK56_n794PrvNom, P0AK56_A786PrvDir, P0AK56_n786PrvDir, P0AK56_A799PrvPob, P0AK56_n799PrvPob, P0AK56_A6075PrvCp2, P0AK56_n6075PrvCp2,
            P0AK56_A782PrvCpo, P0AK56_n782PrvCpo, P0AK56_A793PrvNif, P0AK56_n793PrvNif
            }
            , new Object[] {
            P0AK57_A266CliEnvLin, P0AK57_A252CliCod, P0AK57_A396EmprCod, P0AK57_A267CliEnvNom, P0AK57_A265CliEnvDom, P0AK57_A10775CliEnvCp2, P0AK57_A264CliEnvCp, P0AK57_A268CliEnvPob
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV49Numdoc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A13427AlbProDomE ;
   private byte AV11AlbProDomEnv ;
   private byte A266CliEnvLin ;
   private short AV53siatcud ;
   private short AV55valorsiatcud ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int AV8AlbComCod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A13418AlbProID ;
   private int A13425AlbProCliC ;
   private int A13419AlbProPrvI ;
   private int AV15Clicod ;
   private int AV52PrvNum ;
   private int A252CliCod ;
   private int A795PrvNum ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal AV48Num9 ;
   private String AV32Emprcod ;
   private String AV67pathIN ;
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
   private String AV31Emprcif ;
   private String AV35EmprNom ;
   private String AV34EmprDir ;
   private String AV36EmprPob ;
   private String AV33Emprcp ;
   private String AV26Cp4 ;
   private String AV25Cp3 ;
   private String AV27Cp8 ;
   private String AV50path ;
   private String AV14Body ;
   private String A14192AlbProTipA ;
   private String A14191AlbProSerA ;
   private String A14190AlbProATCU ;
   private String A13436AlbProIDAT ;
   private String A13417AlbProTipo ;
   private String A13424AlbProMatr ;
   private String AV29Doc ;
   private String AV68AlbProTipAT ;
   private String AV23codValidacaoSerie ;
   private String AV56VarAux ;
   private String AV43HhSys ;
   private String AV28DateAux ;
   private String AV20CliNif ;
   private String AV16CliDom ;
   private String AV22CliPob ;
   private String AV24Cp ;
   private String AV17CliEnvDom ;
   private String AV19CliEnvPob ;
   private String A13448AlbProDsc ;
   private String A13444AlbProUnd ;
   private String AV51Pd ;
   private String AV58VarKgs ;
   private String AV59Vconv ;
   private String AV54Un ;
   private String AV21CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String AV18CliEnvNom ;
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
   private java.util.Date AV38FecHorSal ;
   private java.util.Date AV57VarAux0 ;
   private java.util.Date AV39FecSys ;
   private boolean AV66ok ;
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
   private String AV30documentnumber ;
   private String AV12atcud ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK52_A396EmprCod ;
   private String[] P0AK52_A395EmprCif ;
   private boolean[] P0AK52_n395EmprCif ;
   private String[] P0AK52_A407EmprNom ;
   private boolean[] P0AK52_n407EmprNom ;
   private String[] P0AK52_A404EmprDir ;
   private boolean[] P0AK52_n404EmprDir ;
   private String[] P0AK52_A408EmprPob ;
   private boolean[] P0AK52_n408EmprPob ;
   private String[] P0AK52_A403EmprCpo ;
   private boolean[] P0AK52_n403EmprCpo ;
   private int[] P0AK53_A13418AlbProID ;
   private String[] P0AK53_A396EmprCod ;
   private String[] P0AK53_A14192AlbProTipA ;
   private boolean[] P0AK53_n14192AlbProTipA ;
   private String[] P0AK53_A14191AlbProSerA ;
   private boolean[] P0AK53_n14191AlbProSerA ;
   private String[] P0AK53_A14190AlbProATCU ;
   private boolean[] P0AK53_n14190AlbProATCU ;
   private String[] P0AK53_A13436AlbProIDAT ;
   private java.util.Date[] P0AK53_A13429AlbProSal ;
   private String[] P0AK53_A13417AlbProTipo ;
   private int[] P0AK53_A13425AlbProCliC ;
   private byte[] P0AK53_A13427AlbProDomE ;
   private int[] P0AK53_A13419AlbProPrvI ;
   private String[] P0AK53_A13424AlbProMatr ;
   private String[] P0AK54_A396EmprCod ;
   private int[] P0AK54_A13418AlbProID ;
   private java.math.BigDecimal[] P0AK54_A13443AlbProCnt ;
   private boolean[] P0AK54_n13443AlbProCnt ;
   private String[] P0AK54_A13448AlbProDsc ;
   private boolean[] P0AK54_n13448AlbProDsc ;
   private String[] P0AK54_A13444AlbProUnd ;
   private boolean[] P0AK54_n13444AlbProUnd ;
   private short[] P0AK54_A13442AlbProLine ;
   private int[] P0AK55_A252CliCod ;
   private String[] P0AK55_A396EmprCod ;
   private String[] P0AK55_A279CliNom ;
   private String[] P0AK55_A260CliDom ;
   private String[] P0AK55_A295CliPob ;
   private String[] P0AK55_A4828CliCp2 ;
   private String[] P0AK55_A256CliCp ;
   private String[] P0AK55_A278CliNif ;
   private int[] P0AK56_A795PrvNum ;
   private String[] P0AK56_A396EmprCod ;
   private String[] P0AK56_A794PrvNom ;
   private boolean[] P0AK56_n794PrvNom ;
   private String[] P0AK56_A786PrvDir ;
   private boolean[] P0AK56_n786PrvDir ;
   private String[] P0AK56_A799PrvPob ;
   private boolean[] P0AK56_n799PrvPob ;
   private String[] P0AK56_A6075PrvCp2 ;
   private boolean[] P0AK56_n6075PrvCp2 ;
   private String[] P0AK56_A782PrvCpo ;
   private boolean[] P0AK56_n782PrvCpo ;
   private String[] P0AK56_A793PrvNif ;
   private boolean[] P0AK56_n793PrvNif ;
   private byte[] P0AK57_A266CliEnvLin ;
   private int[] P0AK57_A252CliCod ;
   private String[] P0AK57_A396EmprCod ;
   private String[] P0AK57_A267CliEnvNom ;
   private String[] P0AK57_A265CliEnvDom ;
   private String[] P0AK57_A10775CliEnvCp2 ;
   private String[] P0AK57_A264CliEnvCp ;
   private String[] P0AK57_A268CliEnvPob ;
   private com.genexus.xml.XMLWriter AV42filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV46Messages ;
   private com.genexus.SdtMessages_Message AV45Message ;
}

final  class documentotransporteproveedor_xml_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK52", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK53", "SELECT AlbProID, EmprCod, AlbProTipA, AlbProSerA, AlbProATCU, AlbProIDAT, AlbProSal, AlbProTipo, AlbProCliC, AlbProDomE, AlbProPrvI, AlbProMatr FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK54", "SELECT EmprCod, AlbProID, AlbProCnt, AlbProDsc, AlbProUnd, AlbProLine FROM TXPLALPRO WHERE (EmprCod = ? and AlbProID = ?) AND (AlbProCnt > 0) ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AK55", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK56", "SELECT PrvNum, EmprCod, PrvNom, PrvDir, PrvPob, PrvCp2, PrvCpo, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK57", "SELECT CliEnvLin, CliCod, EmprCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 30);
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

