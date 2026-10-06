package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_xml_anulacion extends GXProcedure
{
   public documentodetransporteproduccion_xml_anulacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_xml_anulacion.class ), "" );
   }

   public documentodetransporteproduccion_xml_anulacion( int remoteHandle ,
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
      documentodetransporteproduccion_xml_anulacion.this.aP5 = new boolean[] {false};
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
      documentodetransporteproduccion_xml_anulacion.this.AV17Emprcod = aP0[0];
      this.aP0 = aP0;
      documentodetransporteproduccion_xml_anulacion.this.AV8AlbProcod = aP1[0];
      this.aP1 = aP1;
      documentodetransporteproduccion_xml_anulacion.this.AV64pathIN = aP2[0];
      this.aP2 = aP2;
      documentodetransporteproduccion_xml_anulacion.this.AV11Fichero = aP3[0];
      this.aP3 = aP3;
      documentodetransporteproduccion_xml_anulacion.this.aP4 = aP4;
      documentodetransporteproduccion_xml_anulacion.this.aP5 = aP5;
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
      documentodetransporteproduccion_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV55NumDoc = GXt_int1 ;
      GXt_int1 = AV56NoMtsAt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV17Emprcod, httpContext.getMessage( "NOMTAT", ""), GXv_int2) ;
      documentodetransporteproduccion_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV56NoMtsAt = GXt_int1 ;
      GXt_int1 = AV59siatcud ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV17Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      documentodetransporteproduccion_xml_anulacion.this.GXt_int1 = GXv_int2[0] ;
      AV59siatcud = GXt_int1 ;
      GXt_int3 = AV60valorsiatcud ;
      GXv_char4[0] = AV17Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      documentodetransporteproduccion_xml_anulacion.this.AV17Emprcod = GXv_char4[0] ;
      documentodetransporteproduccion_xml_anulacion.this.GXt_int3 = GXv_int6[0] ;
      AV60valorsiatcud = (byte)(GXt_int3) ;
      /* Using cursor P0AJL2 */
      pr_default.execute(0, new Object[] {AV17Emprcod, Long.valueOf(AV8AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0AJL2_A30AlbProCod[0] ;
         A396EmprCod = P0AJL2_A396EmprCod[0] ;
         A39AlbProPri = P0AJL2_A39AlbProPri[0] ;
         A5140AlbMarca = P0AJL2_A5140AlbMarca[0] ;
         AV47AlbProPri = A39AlbProPri ;
         AV48AlbMarca = A5140AlbMarca ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P0AJL3 */
      pr_default.execute(1, new Object[] {AV17Emprcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0AJL3_A396EmprCod[0] ;
         A395EmprCif = P0AJL3_A395EmprCif[0] ;
         n395EmprCif = P0AJL3_n395EmprCif[0] ;
         A407EmprNom = P0AJL3_A407EmprNom[0] ;
         n407EmprNom = P0AJL3_n407EmprNom[0] ;
         A404EmprDir = P0AJL3_A404EmprDir[0] ;
         n404EmprDir = P0AJL3_n404EmprDir[0] ;
         A408EmprPob = P0AJL3_A408EmprPob[0] ;
         n408EmprPob = P0AJL3_n408EmprPob[0] ;
         A403EmprCpo = P0AJL3_A403EmprCpo[0] ;
         n403EmprCpo = P0AJL3_n403EmprCpo[0] ;
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
         AV71GXLvl44 = (byte)(0) ;
         /* Using cursor P0AJL4 */
         pr_default.execute(2, new Object[] {AV17Emprcod, Long.valueOf(AV8AlbProcod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A30AlbProCod = P0AJL4_A30AlbProCod[0] ;
            A396EmprCod = P0AJL4_A396EmprCod[0] ;
            A1259AlbDomEnv = P0AJL4_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = P0AJL4_n1259AlbDomEnv[0] ;
            A1243GuiRemCli = P0AJL4_A1243GuiRemCli[0] ;
            A14073AlbPdSerAT = P0AJL4_A14073AlbPdSerAT[0] ;
            A14074AlbPdTipAT = P0AJL4_A14074AlbPdTipAT[0] ;
            A14069AlbPdATCUD = P0AJL4_A14069AlbPdATCUD[0] ;
            A7101AlbLic = P0AJL4_A7101AlbLic[0] ;
            A4023AlbFecSal = P0AJL4_A4023AlbFecSal[0] ;
            A3865AlbHorSal = P0AJL4_A3865AlbHorSal[0] ;
            A3868AlbMat = P0AJL4_A3868AlbMat[0] ;
            AV71GXLvl44 = (byte)(1) ;
            AV53AlbDomenv = A1259AlbDomEnv ;
            AV21Clicod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CLIENT' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV53AlbDomenv > 0 )
            {
               /* Execute user subroutine: 'CLIENV' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV12Body = httpContext.getMessage( "TaxRegistrationNumber", "") ;
            AV10filexml.writeElement(AV12Body, GXutil.trim( AV18Emprcif));
            AV12Body = httpContext.getMessage( "CompanyName", "") ;
            AV10filexml.writeElement(AV12Body, AV25EmprNom);
            AV10filexml.writeStartElement(httpContext.getMessage( "CompanyAddress", ""));
            AV10filexml.writeElement(httpContext.getMessage( "Addressdetail", ""), GXutil.trim( AV26EmprDir));
            AV10filexml.writeElement(httpContext.getMessage( "City", ""), GXutil.trim( AV27EmprPob));
            AV10filexml.writeElement(httpContext.getMessage( "PostalCode", ""), GXutil.trim( AV46Cp8));
            AV10filexml.writeElement(httpContext.getMessage( "Country", ""), httpContext.getMessage( "PT", ""));
            AV10filexml.writeEndElement();
            AV61documentnumber = GXutil.trim( A14074AlbPdTipAT) + " " + GXutil.trim( A14073AlbPdSerAT) + "/" + GXutil.trim( GXutil.str( AV8AlbProcod, 10, 0)) ;
            AV10filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV61documentnumber));
            AV57codValidacaoSerie = A14069AlbPdATCUD ;
            AV58atcud = ((GXutil.strcmp("", AV57codValidacaoSerie)==0) ? "" : GXutil.trim( AV57codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))) ;
            AV10filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV58atcud));
            AV10filexml.writeElement(httpContext.getMessage( "ATDocCodeID", ""), GXutil.trim( A7101AlbLic));
            AV10filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "A", ""));
            AV32DateAux = GXutil.trim( GXutil.str( GXutil.year( A4023AlbFecSal), 10, 0)) ;
            if ( GXutil.month( A4023AlbFecSal) < 10 )
            {
               AV32DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)) ;
            }
            else
            {
               AV32DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( A4023AlbFecSal), 10, 0)) ;
            }
            if ( GXutil.day( A4023AlbFecSal) < 10 )
            {
               AV32DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A4023AlbFecSal), 10, 0)) ;
            }
            else
            {
               AV32DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( A4023AlbFecSal), 10, 0)) ;
            }
            AV12Body = AV32DateAux ;
            AV10filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV12Body));
            if ( GXutil.strcmp(AV47AlbProPri, "1") == 0 )
            {
               AV12Body = httpContext.getMessage( "GR", "") ;
            }
            else
            {
               AV12Body = httpContext.getMessage( "GT", "") ;
            }
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
            AV29VarAux = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
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
            if ( GXutil.strcmp(A3868AlbMat, " ") != 0 )
            {
               AV12Body = A3868AlbMat ;
            }
            AV10filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV12Body));
            /* Using cursor P0AJL5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A130BarCodPar = P0AJL5_A130BarCodPar[0] ;
               A132BarCodReo = P0AJL5_A132BarCodReo[0] ;
               A129BarCod = P0AJL5_A129BarCod[0] ;
               A1263BarAlbMtrE = P0AJL5_A1263BarAlbMtrE[0] ;
               A1261BarAlbKgmE = P0AJL5_A1261BarAlbKgmE[0] ;
               A1652BarSerDsc = P0AJL5_A1652BarSerDsc[0] ;
               A212BarSer = P0AJL5_A212BarSer[0] ;
               A1652BarSerDsc = P0AJL5_A1652BarSerDsc[0] ;
               A212BarSer = P0AJL5_A212BarSer[0] ;
               if ( ( A1261BarAlbKgmE.doubleValue() == 0 ) && ( A1263BarAlbMtrE.doubleValue() == 0 ) )
               {
                  /* Using cursor P0AJL6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A460FasDsc = P0AJL6_A460FasDsc[0] ;
                     A457FasCod = P0AJL6_A457FasCod[0] ;
                     A1276FasMtr = P0AJL6_A1276FasMtr[0] ;
                     A1275FasKgm = P0AJL6_A1275FasKgm[0] ;
                     A1240GuiFasLin = P0AJL6_A1240GuiFasLin[0] ;
                     A460FasDsc = P0AJL6_A460FasDsc[0] ;
                     AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV33Pd = GXutil.trim( A457FasCod) + "-" + GXutil.trim( A460FasDsc) ;
                     AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                     if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() > 0 ) )
                     {
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                        AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     if ( ( A1275FasKgm.doubleValue() > 0 ) && ( A1276FasMtr.doubleValue() == 0 ) )
                     {
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1275FasKgm, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                        AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     if ( ( A1276FasMtr.doubleValue() > 0 ) && ( A1275FasKgm.doubleValue() == 0 ) )
                     {
                        AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1276FasMtr, 9, 2)), (short)(9), " ") ;
                        AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                        AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                        AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                        AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                        AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     }
                     AV10filexml.writeEndElement();
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
               else
               {
                  if ( A1261BarAlbKgmE.doubleValue() > 0 )
                  {
                     AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV33Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) ;
                     AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                     AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1261BarAlbKgmE, 9, 2)), (short)(9), " ") ;
                     AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                     AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                     AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                     AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
                     AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     AV10filexml.writeEndElement();
                  }
                  if ( ( A1263BarAlbMtrE.doubleValue() > 0 ) && ( AV56NoMtsAt == 0 ) )
                  {
                     AV10filexml.writeStartElement(httpContext.getMessage( "Line", ""));
                     AV33Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) ;
                     AV10filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV33Pd));
                     AV41VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A1263BarAlbMtrE, 9, 2)), (short)(9), " ") ;
                     AV42Vconv = GXutil.substring( AV41VarKgs, 1, 6) + "." + GXutil.substring( AV41VarKgs, 8, 9) ;
                     AV43Num9 = CommonUtil.decimalVal( AV42Vconv, ".") ;
                     AV10filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV41VarKgs));
                     AV10filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "MT", ""));
                     AV10filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
                     AV10filexml.writeEndElement();
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV71GXLvl44 == 0 )
         {
            System.out.println( httpContext.getMessage( "NO existe CALPRD", "") );
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
      /* Using cursor P0AJL7 */
      pr_default.execute(5, new Object[] {AV17Emprcod, Integer.valueOf(AV21Clicod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P0AJL7_A252CliCod[0] ;
         A396EmprCod = P0AJL7_A396EmprCod[0] ;
         A279CliNom = P0AJL7_A279CliNom[0] ;
         A260CliDom = P0AJL7_A260CliDom[0] ;
         A295CliPob = P0AJL7_A295CliPob[0] ;
         A4828CliCp2 = P0AJL7_A4828CliCp2[0] ;
         A256CliCp = P0AJL7_A256CliCp[0] ;
         A278CliNif = P0AJL7_A278CliNif[0] ;
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
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'CLIENV' Routine */
      returnInSub = false ;
      /* Using cursor P0AJL8 */
      pr_default.execute(6, new Object[] {AV17Emprcod, Integer.valueOf(AV21Clicod), Byte.valueOf(AV53AlbDomenv)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A266CliEnvLin = P0AJL8_A266CliEnvLin[0] ;
         A252CliCod = P0AJL8_A252CliCod[0] ;
         A396EmprCod = P0AJL8_A396EmprCod[0] ;
         A267CliEnvNom = P0AJL8_A267CliEnvNom[0] ;
         A265CliEnvDom = P0AJL8_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P0AJL8_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P0AJL8_A264CliEnvCp[0] ;
         A268CliEnvPob = P0AJL8_A268CliEnvPob[0] ;
         AV49CliEnvNom = A267CliEnvNom ;
         AV50CliEnvDom = A265CliEnvDom ;
         AV52CpE = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( A10775CliEnvCp2) ;
         AV51CliEnvPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = documentodetransporteproduccion_xml_anulacion.this.AV17Emprcod;
      this.aP1[0] = documentodetransporteproduccion_xml_anulacion.this.AV8AlbProcod;
      this.aP2[0] = documentodetransporteproduccion_xml_anulacion.this.AV64pathIN;
      this.aP3[0] = documentodetransporteproduccion_xml_anulacion.this.AV11Fichero;
      this.aP4[0] = documentodetransporteproduccion_xml_anulacion.this.AV63messages;
      this.aP5[0] = documentodetransporteproduccion_xml_anulacion.this.AV62ok;
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
      P0AJL2_A30AlbProCod = new long[1] ;
      P0AJL2_A396EmprCod = new String[] {""} ;
      P0AJL2_A39AlbProPri = new String[] {""} ;
      P0AJL2_A5140AlbMarca = new String[] {""} ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A5140AlbMarca = "" ;
      AV47AlbProPri = "" ;
      AV48AlbMarca = "" ;
      P0AJL3_A396EmprCod = new String[] {""} ;
      P0AJL3_A395EmprCif = new String[] {""} ;
      P0AJL3_n395EmprCif = new boolean[] {false} ;
      P0AJL3_A407EmprNom = new String[] {""} ;
      P0AJL3_n407EmprNom = new boolean[] {false} ;
      P0AJL3_A404EmprDir = new String[] {""} ;
      P0AJL3_n404EmprDir = new boolean[] {false} ;
      P0AJL3_A408EmprPob = new String[] {""} ;
      P0AJL3_n408EmprPob = new boolean[] {false} ;
      P0AJL3_A403EmprCpo = new String[] {""} ;
      P0AJL3_n403EmprCpo = new boolean[] {false} ;
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
      P0AJL4_A30AlbProCod = new long[1] ;
      P0AJL4_A396EmprCod = new String[] {""} ;
      P0AJL4_A1259AlbDomEnv = new byte[1] ;
      P0AJL4_n1259AlbDomEnv = new boolean[] {false} ;
      P0AJL4_A1243GuiRemCli = new int[1] ;
      P0AJL4_A14073AlbPdSerAT = new String[] {""} ;
      P0AJL4_A14074AlbPdTipAT = new String[] {""} ;
      P0AJL4_A14069AlbPdATCUD = new String[] {""} ;
      P0AJL4_A7101AlbLic = new String[] {""} ;
      P0AJL4_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJL4_A3865AlbHorSal = new String[] {""} ;
      P0AJL4_A3868AlbMat = new String[] {""} ;
      A14073AlbPdSerAT = "" ;
      A14074AlbPdTipAT = "" ;
      A14069AlbPdATCUD = "" ;
      A7101AlbLic = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A3868AlbMat = "" ;
      AV61documentnumber = "" ;
      AV57codValidacaoSerie = "" ;
      AV58atcud = "" ;
      AV32DateAux = "" ;
      AV19CliNif = "" ;
      AV22CliDom = "" ;
      AV23CliPob = "" ;
      AV24Cp = "" ;
      AV50CliEnvDom = "" ;
      AV51CliEnvPob = "" ;
      AV52CpE = "" ;
      AV29VarAux = "" ;
      AV39FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV38VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV30HhSys = "" ;
      AV31FecSys = GXutil.nullDate() ;
      P0AJL5_A396EmprCod = new String[] {""} ;
      P0AJL5_A30AlbProCod = new long[1] ;
      P0AJL5_A130BarCodPar = new String[] {""} ;
      P0AJL5_A132BarCodReo = new byte[1] ;
      P0AJL5_A129BarCod = new int[1] ;
      P0AJL5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJL5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJL5_A1652BarSerDsc = new String[] {""} ;
      P0AJL5_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      P0AJL6_A396EmprCod = new String[] {""} ;
      P0AJL6_A30AlbProCod = new long[1] ;
      P0AJL6_A129BarCod = new int[1] ;
      P0AJL6_A132BarCodReo = new byte[1] ;
      P0AJL6_A130BarCodPar = new String[] {""} ;
      P0AJL6_A460FasDsc = new String[] {""} ;
      P0AJL6_A457FasCod = new String[] {""} ;
      P0AJL6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJL6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJL6_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      AV33Pd = "" ;
      AV41VarKgs = "" ;
      AV42Vconv = "" ;
      AV43Num9 = DecimalUtil.ZERO ;
      AV20CliNom = "" ;
      P0AJL7_A252CliCod = new int[1] ;
      P0AJL7_A396EmprCod = new String[] {""} ;
      P0AJL7_A279CliNom = new String[] {""} ;
      P0AJL7_A260CliDom = new String[] {""} ;
      P0AJL7_A295CliPob = new String[] {""} ;
      P0AJL7_A4828CliCp2 = new String[] {""} ;
      P0AJL7_A256CliCp = new String[] {""} ;
      P0AJL7_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A295CliPob = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A278CliNif = "" ;
      AV49CliEnvNom = "" ;
      P0AJL8_A266CliEnvLin = new byte[1] ;
      P0AJL8_A252CliCod = new int[1] ;
      P0AJL8_A396EmprCod = new String[] {""} ;
      P0AJL8_A267CliEnvNom = new String[] {""} ;
      P0AJL8_A265CliEnvDom = new String[] {""} ;
      P0AJL8_A10775CliEnvCp2 = new String[] {""} ;
      P0AJL8_A264CliEnvCp = new String[] {""} ;
      P0AJL8_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentodetransporteproduccion_xml_anulacion__default(),
         new Object[] {
             new Object[] {
            P0AJL2_A30AlbProCod, P0AJL2_A396EmprCod, P0AJL2_A39AlbProPri, P0AJL2_A5140AlbMarca
            }
            , new Object[] {
            P0AJL3_A396EmprCod, P0AJL3_A395EmprCif, P0AJL3_n395EmprCif, P0AJL3_A407EmprNom, P0AJL3_n407EmprNom, P0AJL3_A404EmprDir, P0AJL3_n404EmprDir, P0AJL3_A408EmprPob, P0AJL3_n408EmprPob, P0AJL3_A403EmprCpo,
            P0AJL3_n403EmprCpo
            }
            , new Object[] {
            P0AJL4_A30AlbProCod, P0AJL4_A396EmprCod, P0AJL4_A1259AlbDomEnv, P0AJL4_n1259AlbDomEnv, P0AJL4_A1243GuiRemCli, P0AJL4_A14073AlbPdSerAT, P0AJL4_A14074AlbPdTipAT, P0AJL4_A14069AlbPdATCUD, P0AJL4_A7101AlbLic, P0AJL4_A4023AlbFecSal,
            P0AJL4_A3865AlbHorSal, P0AJL4_A3868AlbMat
            }
            , new Object[] {
            P0AJL5_A396EmprCod, P0AJL5_A30AlbProCod, P0AJL5_A130BarCodPar, P0AJL5_A132BarCodReo, P0AJL5_A129BarCod, P0AJL5_A1263BarAlbMtrE, P0AJL5_A1261BarAlbKgmE, P0AJL5_A1652BarSerDsc, P0AJL5_A212BarSer
            }
            , new Object[] {
            P0AJL6_A396EmprCod, P0AJL6_A30AlbProCod, P0AJL6_A129BarCod, P0AJL6_A132BarCodReo, P0AJL6_A130BarCodPar, P0AJL6_A460FasDsc, P0AJL6_A457FasCod, P0AJL6_A1276FasMtr, P0AJL6_A1275FasKgm, P0AJL6_A1240GuiFasLin
            }
            , new Object[] {
            P0AJL7_A252CliCod, P0AJL7_A396EmprCod, P0AJL7_A279CliNom, P0AJL7_A260CliDom, P0AJL7_A295CliPob, P0AJL7_A4828CliCp2, P0AJL7_A256CliCp, P0AJL7_A278CliNif
            }
            , new Object[] {
            P0AJL8_A266CliEnvLin, P0AJL8_A252CliCod, P0AJL8_A396EmprCod, P0AJL8_A267CliEnvNom, P0AJL8_A265CliEnvDom, P0AJL8_A10775CliEnvCp2, P0AJL8_A264CliEnvCp, P0AJL8_A268CliEnvPob
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
   private byte AV71GXLvl44 ;
   private byte A1259AlbDomEnv ;
   private byte AV53AlbDomenv ;
   private byte A132BarCodReo ;
   private byte A266CliEnvLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A1243GuiRemCli ;
   private int AV21Clicod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private long AV8AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV43Num9 ;
   private String AV17Emprcod ;
   private String AV64pathIN ;
   private String AV11Fichero ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A5140AlbMarca ;
   private String AV47AlbProPri ;
   private String AV48AlbMarca ;
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
   private String A14073AlbPdSerAT ;
   private String A14074AlbPdTipAT ;
   private String A14069AlbPdATCUD ;
   private String A7101AlbLic ;
   private String A3865AlbHorSal ;
   private String A3868AlbMat ;
   private String AV57codValidacaoSerie ;
   private String AV58atcud ;
   private String AV32DateAux ;
   private String AV19CliNif ;
   private String AV22CliDom ;
   private String AV23CliPob ;
   private String AV24Cp ;
   private String AV50CliEnvDom ;
   private String AV51CliEnvPob ;
   private String AV52CpE ;
   private String AV29VarAux ;
   private String AV30HhSys ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV33Pd ;
   private String AV41VarKgs ;
   private String AV42Vconv ;
   private String AV20CliNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A295CliPob ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A278CliNif ;
   private String AV49CliEnvNom ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A10775CliEnvCp2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private java.util.Date AV39FecHorSal ;
   private java.util.Date AV38VarAux0 ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV31FecSys ;
   private boolean AV62ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n1259AlbDomEnv ;
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
   private long[] P0AJL2_A30AlbProCod ;
   private String[] P0AJL2_A396EmprCod ;
   private String[] P0AJL2_A39AlbProPri ;
   private String[] P0AJL2_A5140AlbMarca ;
   private String[] P0AJL3_A396EmprCod ;
   private String[] P0AJL3_A395EmprCif ;
   private boolean[] P0AJL3_n395EmprCif ;
   private String[] P0AJL3_A407EmprNom ;
   private boolean[] P0AJL3_n407EmprNom ;
   private String[] P0AJL3_A404EmprDir ;
   private boolean[] P0AJL3_n404EmprDir ;
   private String[] P0AJL3_A408EmprPob ;
   private boolean[] P0AJL3_n408EmprPob ;
   private String[] P0AJL3_A403EmprCpo ;
   private boolean[] P0AJL3_n403EmprCpo ;
   private long[] P0AJL4_A30AlbProCod ;
   private String[] P0AJL4_A396EmprCod ;
   private byte[] P0AJL4_A1259AlbDomEnv ;
   private boolean[] P0AJL4_n1259AlbDomEnv ;
   private int[] P0AJL4_A1243GuiRemCli ;
   private String[] P0AJL4_A14073AlbPdSerAT ;
   private String[] P0AJL4_A14074AlbPdTipAT ;
   private String[] P0AJL4_A14069AlbPdATCUD ;
   private String[] P0AJL4_A7101AlbLic ;
   private java.util.Date[] P0AJL4_A4023AlbFecSal ;
   private String[] P0AJL4_A3865AlbHorSal ;
   private String[] P0AJL4_A3868AlbMat ;
   private String[] P0AJL5_A396EmprCod ;
   private long[] P0AJL5_A30AlbProCod ;
   private String[] P0AJL5_A130BarCodPar ;
   private byte[] P0AJL5_A132BarCodReo ;
   private int[] P0AJL5_A129BarCod ;
   private java.math.BigDecimal[] P0AJL5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0AJL5_A1261BarAlbKgmE ;
   private String[] P0AJL5_A1652BarSerDsc ;
   private String[] P0AJL5_A212BarSer ;
   private String[] P0AJL6_A396EmprCod ;
   private long[] P0AJL6_A30AlbProCod ;
   private int[] P0AJL6_A129BarCod ;
   private byte[] P0AJL6_A132BarCodReo ;
   private String[] P0AJL6_A130BarCodPar ;
   private String[] P0AJL6_A460FasDsc ;
   private String[] P0AJL6_A457FasCod ;
   private java.math.BigDecimal[] P0AJL6_A1276FasMtr ;
   private java.math.BigDecimal[] P0AJL6_A1275FasKgm ;
   private short[] P0AJL6_A1240GuiFasLin ;
   private int[] P0AJL7_A252CliCod ;
   private String[] P0AJL7_A396EmprCod ;
   private String[] P0AJL7_A279CliNom ;
   private String[] P0AJL7_A260CliDom ;
   private String[] P0AJL7_A295CliPob ;
   private String[] P0AJL7_A4828CliCp2 ;
   private String[] P0AJL7_A256CliCp ;
   private String[] P0AJL7_A278CliNif ;
   private byte[] P0AJL8_A266CliEnvLin ;
   private int[] P0AJL8_A252CliCod ;
   private String[] P0AJL8_A396EmprCod ;
   private String[] P0AJL8_A267CliEnvNom ;
   private String[] P0AJL8_A265CliEnvDom ;
   private String[] P0AJL8_A10775CliEnvCp2 ;
   private String[] P0AJL8_A264CliEnvCp ;
   private String[] P0AJL8_A268CliEnvPob ;
   private com.genexus.xml.XMLWriter AV10filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV63messages ;
   private com.genexus.SdtMessages_Message AV65Message ;
}

final  class documentodetransporteproduccion_xml_anulacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJL2", "SELECT AlbProCod, EmprCod, AlbProPri, AlbMarca FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJL3", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJL4", "SELECT AlbProCod, EmprCod, AlbDomEnv, GuiRemCli, AlbPdSerAT, AlbPdTipAT, AlbPdATCUD, AlbLic, AlbFecSal, AlbHorSal, AlbMat FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJL5", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbMtrE, T1.BarAlbKgmE, T2.BarSerDsc, T2.BarSer FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJL6", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.FasCod, T1.FasMtr, T1.FasKgm, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AJL7", "SELECT CliCod, EmprCod, CliNom, CliDom, CliPob, CliCp2, CliCp, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJL8", "SELECT CliEnvLin, CliCod, EmprCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
            case 6 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

