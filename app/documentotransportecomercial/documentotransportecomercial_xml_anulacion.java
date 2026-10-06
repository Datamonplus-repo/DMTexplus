package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_xml_anulacion extends GXProcedure
{
   public documentotransportecomercial_xml_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_xml_anulacion.class ), "" );
   }

   public documentotransportecomercial_xml_anulacion( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String[] aP0 ,
                              long[] aP1 ,
                              String[] aP2 ,
                              String[] aP3 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 )
   {
      documentotransportecomercial_xml_anulacion.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ,
                             boolean[] aP5 )
   {
      documentotransportecomercial_xml_anulacion.this.AV17Emprcod = aP0[0];
      this.aP0 = aP0;
      documentotransportecomercial_xml_anulacion.this.AV8AlbProcod = aP1[0];
      this.aP1 = aP1;
      documentotransportecomercial_xml_anulacion.this.AV64pathIN = aP2[0];
      this.aP2 = aP2;
      documentotransportecomercial_xml_anulacion.this.AV11Fichero = aP3[0];
      this.aP3 = aP3;
      documentotransportecomercial_xml_anulacion.this.aP4 = aP4;
      documentotransportecomercial_xml_anulacion.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV62ok = false ;
      GXt_int1 = AV55NumDoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV17Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      documentotransportecomercial_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV55NumDoc = GXt_int1 ;
      GXt_int1 = AV56NoMtsAt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV17Emprcod, httpContext.getMessage( "NOMTAT", ""), GXv_int2) ;
      documentotransportecomercial_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV56NoMtsAt = GXt_int1 ;
      GXt_int1 = AV59siatcud ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV17Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      documentotransportecomercial_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV59siatcud = GXt_int1 ;
      GXt_int3 = AV60valorsiatcud ;
      GXv_char4[0] = AV17Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      documentotransportecomercial_xml_anulacion.this.AV17Emprcod = GXv_char4[0] ;
      documentotransportecomercial_xml_anulacion.this.GXt_int3 = GXv_int6[0] ;
      AV60valorsiatcud = (byte)(GXt_int3) ;
      /* Using cursor P0AKB2 */
      pr_default.execute(0, new Object[] {AV17Emprcod, Long.valueOf(AV8AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P0AKB2_A14AlbComCod[0] ;
         A396EmprCod = P0AKB2_A396EmprCod[0] ;
         A22AlbComPri = P0AKB2_A22AlbComPri[0] ;
         AV47AlbProPri = A22AlbComPri ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P0AKB3 */
      pr_default.execute(1, new Object[] {AV17Emprcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0AKB3_A396EmprCod[0] ;
         A395EmprCif = P0AKB3_A395EmprCif[0] ;
         n395EmprCif = P0AKB3_n395EmprCif[0] ;
         A407EmprNom = P0AKB3_A407EmprNom[0] ;
         n407EmprNom = P0AKB3_n407EmprNom[0] ;
         A404EmprDir = P0AKB3_A404EmprDir[0] ;
         n404EmprDir = P0AKB3_n404EmprDir[0] ;
         A408EmprPob = P0AKB3_A408EmprPob[0] ;
         n408EmprPob = P0AKB3_n408EmprPob[0] ;
         A403EmprCpo = P0AKB3_A403EmprCpo[0] ;
         n403EmprCpo = P0AKB3_n403EmprCpo[0] ;
         AV18Emprcif = A395EmprCif ;
         AV25EmprNom = A407EmprNom ;
         AV26EmprDir = A404EmprDir ;
         AV27EmprPob = A408EmprPob ;
         AV28Emprcp = A403EmprCpo ;
         AV44Cp4 = GXutil.substring( AV28Emprcp, 1, 4) ;
         AV45Cp3 = GXutil.substring( AV28Emprcp, 5, 3) ;
         AV46Cp8 = AV44Cp4 + "-" + AV45Cp3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV66path += GXutil.trim( AV64pathIN) + "\\" + GXutil.trim( AV11Fichero) + httpContext.getMessage( ".xml", "") ;
      AV10filexml.openURL(AV66path);
      if ( AV10filexml.getErrCode() > 0 )
      {
         AV65Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV65Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV10filexml.getErrCode(), 10, 2)) );
         AV65Message.setgxTv_SdtMessages_Message_Description( AV10filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV65Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV63messages.add(AV65Message, 0);
      }
      else
      {
         AV12Body = httpContext.getMessage( "S:Body", "") ;
         AV10filexml.writeStartElement(AV12Body);
         AV12Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV10filexml.writeNSStartElement(AV12Body, httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         AV72GXLvl45 = (byte)(0) ;
         /* Using cursor P0AKB4 */
         pr_default.execute(2, new Object[] {AV17Emprcod, Long.valueOf(AV8AlbProcod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14AlbComCod = P0AKB4_A14AlbComCod[0] ;
            A396EmprCod = P0AKB4_A396EmprCod[0] ;
            A252CliCod = P0AKB4_A252CliCod[0] ;
            A14249AlbComSerA = P0AKB4_A14249AlbComSerA[0] ;
            A14250AlbComTipA = P0AKB4_A14250AlbComTipA[0] ;
            A14248AlbComATCU = P0AKB4_A14248AlbComATCU[0] ;
            A10740AlbComID = P0AKB4_A10740AlbComID[0] ;
            A4829AlbComHor = P0AKB4_A4829AlbComHor[0] ;
            A4830AlbComMat = P0AKB4_A4830AlbComMat[0] ;
            AV72GXLvl45 = (byte)(1) ;
            AV21Clicod = A252CliCod ;
            /* Execute user subroutine: 'CLIENT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV12Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV10filexml.writeElement(AV12Body, GXutil.trim( AV18Emprcif));
            AV12Body = httpContext.getMessage( "CompanyName", "") ;
            AV10filexml.writeElement(AV12Body, GXutil.trim( AV25EmprNom));
            AV10filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV10filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV26EmprDir));
            AV10filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV27EmprPob));
            AV10filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV46Cp8));
            AV10filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV10filexml.writeEndElement();
            AV61documentnumber = GXutil.trim( A14250AlbComTipA) + " " + GXutil.trim( A14249AlbComSerA) + "/" + GXutil.trim( GXutil.str( AV8AlbProcod, 10, 0)) ;
            AV10filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV61documentnumber));
            AV57codValidacaoSerie = A14248AlbComATCU ;
            AV58atcud = ((GXutil.strcmp("", AV57codValidacaoSerie)==0) ? "" : GXutil.trim( AV57codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A14AlbComCod, 8, 0))) ;
            AV10filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV58atcud));
            AV10filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( A10740AlbComID));
            AV10filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "A", ""));
            AV29VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV30HhSys = GXutil.substring( AV29VarAux, 12, 8) ;
            AV31FecSys = localUtil.ctod( GXutil.substring( AV29VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV32DateAux = GXutil.trim( GXutil.str( GXutil.year( AV31FecSys), 10, 0)) ;
            if ( GXutil.month( AV31FecSys) < 10 )
            {
               AV32DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV31FecSys), 10, 0)) ;
            }
            else
            {
               AV32DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV31FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV31FecSys) < 10 )
            {
               AV32DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV31FecSys), 10, 0)) ;
            }
            else
            {
               AV32DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV31FecSys), 10, 0)) ;
            }
            AV12Body = AV32DateAux ;
            AV10filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV12Body));
            AV12Body = GXutil.trim( A14250AlbComTipA) ;
            AV10filexml.writeElement(httpContext.getMessage( "MovementType", ""), GXutil.trim( AV12Body));
            AV10filexml.writeElement(httpContext.getMessage( "CustomerTaxID", ""), GXutil.trim( AV19CliNif));
            AV10filexml.writeStartElement(httpContext.getMessage( "CustomerAddress", ""));
            AV10filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV22CliDom));
            AV10filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV23CliPob));
            AV10filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV24Cp));
            AV10filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV10filexml.writeEndElement();
            AV10filexml.writeStartElement(httpContext.getMessage( "AddressTo", ""));
            AV10filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV50CliEnvDom));
            AV10filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV51CliEnvPob));
            AV10filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV52CpE));
            AV10filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV10filexml.writeEndElement();
            AV10filexml.writeStartElement(httpContext.getMessage( "AddressFrom", ""));
            AV10filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV26EmprDir));
            AV10filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV27EmprPob));
            AV10filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV46Cp8));
            AV10filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV10filexml.writeEndElement();
            AV29VarAux = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV39FecHorSal = localUtil.ctot( AV29VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV38VarAux0 = AV39FecHorSal ;
            AV29VarAux = localUtil.ttoc( AV38VarAux0, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV30HhSys = GXutil.substring( AV29VarAux, 12, 8) ;
            AV31FecSys = localUtil.ctod( GXutil.substring( AV29VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV32DateAux = GXutil.trim( GXutil.str( GXutil.year( AV31FecSys), 10, 0)) ;
            if ( GXutil.month( AV31FecSys) < 10 )
            {
               AV32DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV31FecSys), 10, 0)) ;
            }
            else
            {
               AV32DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV31FecSys), 10, 0)) ;
            }
            if ( GXutil.day( AV31FecSys) < 10 )
            {
               AV32DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV31FecSys), 10, 0)) ;
            }
            else
            {
               AV32DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV31FecSys), 10, 0)) ;
            }
            AV12Body = AV32DateAux + httpContext.getMessage( "T", "") + AV30HhSys ;
            AV10filexml.writeElement(httpContext.getMessage( "MovementStartTime", ""), GXutil.trim( AV12Body));
            AV12Body = "0" ;
            if ( GXutil.strcmp(A4830AlbComMat, " ") != 0 )
            {
               AV12Body = A4830AlbComMat ;
            }
            AV10filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV12Body));
            /* Using cursor P0AKB5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A13AlbComCnt = P0AKB5_A13AlbComCnt[0] ;
               A15AlbComDsc = P0AKB5_A15AlbComDsc[0] ;
               A4717AlbComUni = P0AKB5_A4717AlbComUni[0] ;
               A13317AlbComPzas = P0AKB5_A13317AlbComPzas[0] ;
               A13318AlbComMts = P0AKB5_A13318AlbComMts[0] ;
               A13319AlbComKgs = P0AKB5_A13319AlbComKgs[0] ;
               A13321AlbComArtD = P0AKB5_A13321AlbComArtD[0] ;
               A13320AlbComArt = P0AKB5_A13320AlbComArt[0] ;
               A20AlbComLin = P0AKB5_A20AlbComLin[0] ;
               if ( A13AlbComCnt.doubleValue() > 0 )
               {
                  AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                  AV33Pd = A15AlbComDsc ;
                  AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                  AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13AlbComCnt, 9, 2)), (short)(9), " ") ;
                  AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                  AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                  AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                  AV67Un = "UN" ;
                  if ( A4717AlbComUni == 4 )
                  {
                     AV67Un = "LT" ;
                  }
                  if ( A4717AlbComUni == 2 )
                  {
                     AV67Un = "MT" ;
                  }
                  if ( A4717AlbComUni == 1 )
                  {
                     AV67Un = httpContext.getMessage( "KG", "") ;
                  }
                  AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV67Un);
                  AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                  AV10filexml.writeEndElement();
               }
               if ( A13AlbComCnt.doubleValue() == 0 )
               {
                  if ( ( A13319AlbComKgs.doubleValue() > 0 ) || ( A13318AlbComMts.doubleValue() > 0 ) || ( A13317AlbComPzas > 0 ) )
                  {
                     AV33Pd = ((GXutil.strcmp("", A13320AlbComArt)==0)&&(GXutil.strcmp("", A13321AlbComArtD)==0) ? httpContext.getMessage( "Sem descripçao", "") : ((GXutil.strcmp(A13320AlbComArt, " ")!=0) ? A13320AlbComArt : A13321AlbComArtD)) ;
                     if ( A13319AlbComKgs.doubleValue() > 0 )
                     {
                        AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13319AlbComKgs, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV67Un = httpContext.getMessage( "KG", "") ;
                        AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV67Un);
                        AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        AV10filexml.writeEndElement();
                     }
                     if ( A13318AlbComMts.doubleValue() > 0 )
                     {
                        AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13318AlbComMts, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV67Un = httpContext.getMessage( "MT", "") ;
                        AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV67Un);
                        AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        AV10filexml.writeEndElement();
                     }
                     if ( A13317AlbComPzas > 0 )
                     {
                        AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                        AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A13317AlbComPzas, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV67Un = httpContext.getMessage( "UN", "") ;
                        AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), AV67Un);
                        AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                        AV10filexml.writeEndElement();
                     }
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV72GXLvl45 == 0 )
         {
            System.out.println( httpContext.getMessage( "NO existe CALCOM", "") );
         }
         AV10filexml.writeEndElement();
         AV10filexml.writeEndElement();
         AV10filexml.close();
         AV62ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CLIENT' Routine */
      returnInSub = false ;
      AV20CliNom = " " ;
      AV22CliDom = " " ;
      AV23CliPob = " " ;
      AV24Cp = " " ;
      AV19CliNif = " " ;
      /* Using cursor P0AKB6 */
      pr_default.execute(4, new Object[] {AV17Emprcod, Integer.valueOf(AV21Clicod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P0AKB6_A252CliCod[0] ;
         A396EmprCod = P0AKB6_A396EmprCod[0] ;
         A279CliNom = P0AKB6_A279CliNom[0] ;
         A260CliDom = P0AKB6_A260CliDom[0] ;
         A295CliPob = P0AKB6_A295CliPob[0] ;
         A4828CliCp2 = P0AKB6_A4828CliCp2[0] ;
         A256CliCp = P0AKB6_A256CliCp[0] ;
         A278CliNif = P0AKB6_A278CliNif[0] ;
         AV20CliNom = A279CliNom ;
         AV22CliDom = A260CliDom ;
         AV23CliPob = A295CliPob ;
         AV24Cp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV19CliNif = A278CliNif ;
         AV49CliEnvNom = A279CliNom ;
         AV50CliEnvDom = A260CliDom ;
         AV52CpE = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
         AV51CliEnvPob = A295CliPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = documentotransportecomercial_xml_anulacion.this.AV17Emprcod;
      this.aP1[0] = documentotransportecomercial_xml_anulacion.this.AV8AlbProcod;
      this.aP2[0] = documentotransportecomercial_xml_anulacion.this.AV64pathIN;
      this.aP3[0] = documentotransportecomercial_xml_anulacion.this.AV11Fichero;
      this.aP4[0] = documentotransportecomercial_xml_anulacion.this.AV63messages;
      this.aP5[0] = documentotransportecomercial_xml_anulacion.this.AV62ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      scmdbuf = "" ;
      P0AKB2_A14AlbComCod = new int[1] ;
      P0AKB2_A396EmprCod = new String[] {""} ;
      P0AKB2_A22AlbComPri = new String[] {""} ;
      A396EmprCod = "" ;
      A22AlbComPri = "" ;
      AV47AlbProPri = "" ;
      P0AKB3_A396EmprCod = new String[] {""} ;
      P0AKB3_A395EmprCif = new String[] {""} ;
      P0AKB3_n395EmprCif = new boolean[] {false} ;
      P0AKB3_A407EmprNom = new String[] {""} ;
      P0AKB3_n407EmprNom = new boolean[] {false} ;
      P0AKB3_A404EmprDir = new String[] {""} ;
      P0AKB3_n404EmprDir = new boolean[] {false} ;
      P0AKB3_A408EmprPob = new String[] {""} ;
      P0AKB3_n408EmprPob = new boolean[] {false} ;
      P0AKB3_A403EmprCpo = new String[] {""} ;
      P0AKB3_n403EmprCpo = new boolean[] {false} ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      AV18Emprcif = "" ;
      AV25EmprNom = "" ;
      AV26EmprDir = "" ;
      AV27EmprPob = "" ;
      AV28Emprcp = "" ;
      AV44Cp4 = "" ;
      AV45Cp3 = "" ;
      AV46Cp8 = "" ;
      AV66path = "" ;
      AV10filexml = new com.genexus.xml.XMLWriter();
      AV65Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV12Body = "" ;
      P0AKB4_A14AlbComCod = new int[1] ;
      P0AKB4_A396EmprCod = new String[] {""} ;
      P0AKB4_A252CliCod = new int[1] ;
      P0AKB4_A14249AlbComSerA = new String[] {""} ;
      P0AKB4_A14250AlbComTipA = new String[] {""} ;
      P0AKB4_A14248AlbComATCU = new String[] {""} ;
      P0AKB4_A10740AlbComID = new String[] {""} ;
      P0AKB4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0AKB4_A4830AlbComMat = new String[] {""} ;
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      A14248AlbComATCU = "" ;
      A10740AlbComID = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A4830AlbComMat = "" ;
      AV61documentnumber = "" ;
      AV57codValidacaoSerie = "" ;
      AV58atcud = "" ;
      AV29VarAux = "" ;
      AV30HhSys = "" ;
      AV31FecSys = GXutil.nullDate() ;
      AV32DateAux = "" ;
      AV19CliNif = "" ;
      AV22CliDom = "" ;
      AV23CliPob = "" ;
      AV24Cp = "" ;
      AV50CliEnvDom = "" ;
      AV51CliEnvPob = "" ;
      AV52CpE = "" ;
      AV39FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV38VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      P0AKB5_A396EmprCod = new String[] {""} ;
      P0AKB5_A14AlbComCod = new int[1] ;
      P0AKB5_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKB5_A15AlbComDsc = new String[] {""} ;
      P0AKB5_A4717AlbComUni = new byte[1] ;
      P0AKB5_A13317AlbComPzas = new int[1] ;
      P0AKB5_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKB5_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKB5_A13321AlbComArtD = new String[] {""} ;
      P0AKB5_A13320AlbComArt = new String[] {""} ;
      P0AKB5_A20AlbComLin = new short[1] ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A13321AlbComArtD = "" ;
      A13320AlbComArt = "" ;
      AV33Pd = "" ;
      AV41VarKgs = "" ;
      AV42Vconv = "" ;
      AV43Num9 = DecimalUtil.ZERO ;
      AV67Un = "" ;
      AV20CliNom = "" ;
      P0AKB6_A252CliCod = new int[1] ;
      P0AKB6_A396EmprCod = new String[] {""} ;
      P0AKB6_A279CliNom = new String[] {""} ;
      P0AKB6_A260CliDom = new String[] {""} ;
      P0AKB6_A295CliPob = new String[] {""} ;
      P0AKB6_A4828CliCp2 = new String[] {""} ;
      P0AKB6_A256CliCp = new String[] {""} ;
      P0AKB6_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      AV49CliEnvNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_xml_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AKB2_A14AlbComCod, P0AKB2_A396EmprCod, P0AKB2_A22AlbComPri
            }
            , new Object[] {
            P0AKB3_A396EmprCod, P0AKB3_A395EmprCif, P0AKB3_n395EmprCif, P0AKB3_A407EmprNom, P0AKB3_n407EmprNom, P0AKB3_A404EmprDir, P0AKB3_n404EmprDir, P0AKB3_A408EmprPob, P0AKB3_n408EmprPob, P0AKB3_A403EmprCpo,
            P0AKB3_n403EmprCpo
            }
            , new Object[] {
            P0AKB4_A14AlbComCod, P0AKB4_A396EmprCod, P0AKB4_A252CliCod, P0AKB4_A14249AlbComSerA, P0AKB4_A14250AlbComTipA, P0AKB4_A14248AlbComATCU, P0AKB4_A10740AlbComID, P0AKB4_A4829AlbComHor, P0AKB4_A4830AlbComMat
            }
            , new Object[] {
            P0AKB5_A396EmprCod, P0AKB5_A14AlbComCod, P0AKB5_A13AlbComCnt, P0AKB5_A15AlbComDsc, P0AKB5_A4717AlbComUni, P0AKB5_A13317AlbComPzas, P0AKB5_A13318AlbComMts, P0AKB5_A13319AlbComKgs, P0AKB5_A13321AlbComArtD, P0AKB5_A13320AlbComArt,
            P0AKB5_A20AlbComLin
            }
            , new Object[] {
            P0AKB6_A252CliCod, P0AKB6_A396EmprCod, P0AKB6_A279CliNom, P0AKB6_A260CliDom, P0AKB6_A295CliPob, P0AKB6_A4828CliCp2, P0AKB6_A256CliCp, P0AKB6_A278CliNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55NumDoc ;
   private byte AV56NoMtsAt ;
   private byte AV59siatcud ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV60valorsiatcud ;
   private byte AV72GXLvl45 ;
   private byte A4717AlbComUni ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV21Clicod ;
   private int A13317AlbComPzas ;
   private long AV8AlbProcod ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal AV43Num9 ;
   private String AV17Emprcod ;
   private String AV64pathIN ;
   private String AV11Fichero ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A22AlbComPri ;
   private String AV47AlbProPri ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String AV18Emprcif ;
   private String AV25EmprNom ;
   private String AV26EmprDir ;
   private String AV27EmprPob ;
   private String AV28Emprcp ;
   private String AV44Cp4 ;
   private String AV45Cp3 ;
   private String AV46Cp8 ;
   private String AV12Body ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String A14248AlbComATCU ;
   private String A10740AlbComID ;
   private String A4830AlbComMat ;
   private String AV57codValidacaoSerie ;
   private String AV58atcud ;
   private String AV29VarAux ;
   private String AV30HhSys ;
   private String AV32DateAux ;
   private String AV19CliNif ;
   private String AV22CliDom ;
   private String AV23CliPob ;
   private String AV24Cp ;
   private String AV50CliEnvDom ;
   private String AV51CliEnvPob ;
   private String AV52CpE ;
   private String A15AlbComDsc ;
   private String A13321AlbComArtD ;
   private String A13320AlbComArt ;
   private String AV33Pd ;
   private String AV41VarKgs ;
   private String AV42Vconv ;
   private String AV67Un ;
   private String AV20CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String AV49CliEnvNom ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date AV39FecHorSal ;
   private java.util.Date AV38VarAux0 ;
   private java.util.Date AV31FecSys ;
   private boolean AV62ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean returnInSub ;
   private String AV66path ;
   private String AV61documentnumber ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AKB2_A14AlbComCod ;
   private String[] P0AKB2_A396EmprCod ;
   private String[] P0AKB2_A22AlbComPri ;
   private String[] P0AKB3_A396EmprCod ;
   private String[] P0AKB3_A395EmprCif ;
   private boolean[] P0AKB3_n395EmprCif ;
   private String[] P0AKB3_A407EmprNom ;
   private boolean[] P0AKB3_n407EmprNom ;
   private String[] P0AKB3_A404EmprDir ;
   private boolean[] P0AKB3_n404EmprDir ;
   private String[] P0AKB3_A408EmprPob ;
   private boolean[] P0AKB3_n408EmprPob ;
   private String[] P0AKB3_A403EmprCpo ;
   private boolean[] P0AKB3_n403EmprCpo ;
   private int[] P0AKB4_A14AlbComCod ;
   private String[] P0AKB4_A396EmprCod ;
   private int[] P0AKB4_A252CliCod ;
   private String[] P0AKB4_A14249AlbComSerA ;
   private String[] P0AKB4_A14250AlbComTipA ;
   private String[] P0AKB4_A14248AlbComATCU ;
   private String[] P0AKB4_A10740AlbComID ;
   private java.util.Date[] P0AKB4_A4829AlbComHor ;
   private String[] P0AKB4_A4830AlbComMat ;
   private String[] P0AKB5_A396EmprCod ;
   private int[] P0AKB5_A14AlbComCod ;
   private java.math.BigDecimal[] P0AKB5_A13AlbComCnt ;
   private String[] P0AKB5_A15AlbComDsc ;
   private byte[] P0AKB5_A4717AlbComUni ;
   private int[] P0AKB5_A13317AlbComPzas ;
   private java.math.BigDecimal[] P0AKB5_A13318AlbComMts ;
   private java.math.BigDecimal[] P0AKB5_A13319AlbComKgs ;
   private String[] P0AKB5_A13321AlbComArtD ;
   private String[] P0AKB5_A13320AlbComArt ;
   private short[] P0AKB5_A20AlbComLin ;
   private int[] P0AKB6_A252CliCod ;
   private String[] P0AKB6_A396EmprCod ;
   private String[] P0AKB6_A279CliNom ;
   private String[] P0AKB6_A260CliDom ;
   private String[] P0AKB6_A295CliPob ;
   private String[] P0AKB6_A4828CliCp2 ;
   private String[] P0AKB6_A256CliCp ;
   private String[] P0AKB6_A278CliNif ;
   private com.genexus.xml.XMLWriter AV10filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV63messages ;
   private com.genexus.SdtMessages_Message AV65Message ;
}

final  class documentotransportecomercial_xml_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKB2", "SELECT AlbComCod, EmprCod, AlbComPri FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AKB3", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AKB4", "SELECT AlbComCod, EmprCod, CliCod, AlbComSerA, AlbComTipA, AlbComATCU, AlbComID, AlbComHor, AlbComMat FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AKB5", "SELECT EmprCod, AlbComCod, AlbComCnt, AlbComDsc, AlbComUni, AlbComPzas, AlbComMts, AlbComKgs, AlbComArtD, AlbComArt, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AKB6", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
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
            case 2 :
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
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 4 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

