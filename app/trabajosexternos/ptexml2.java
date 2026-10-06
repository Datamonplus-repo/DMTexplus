package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptexml2 extends GXProcedure
{
   public ptexml2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptexml2.class ), "" );
   }

   public ptexml2( int remoteHandle ,
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
      ptexml2.this.aP5 = new boolean[] {false};
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
      ptexml2.this.AV46Emprcod = aP0[0];
      this.aP0 = aP0;
      ptexml2.this.AV37AlbProcod = aP1[0];
      this.aP1 = aP1;
      ptexml2.this.AV87pathIN = aP2[0];
      this.aP2 = aP2;
      ptexml2.this.AV40Fichero = aP3[0];
      this.aP3 = aP3;
      ptexml2.this.aP4 = aP4;
      ptexml2.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV85ok = false ;
      GXt_int1 = AV79Numdoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "NUMDOC", ""), GXv_int2) ;
      ptexml2.this.GXt_int1 = GXv_int2[0] ;
      AV79Numdoc = GXt_int1 ;
      GXt_int1 = (byte)(AV88siatcud) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "SIATCU", ""), GXv_int2) ;
      ptexml2.this.GXt_int1 = GXv_int2[0] ;
      AV88siatcud = GXt_int1 ;
      GXt_int3 = AV89valorsiatcud ;
      GXv_char4[0] = AV46Emprcod ;
      GXv_char5[0] = httpContext.getMessage( "SIATCU", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      ptexml2.this.AV46Emprcod = GXv_char4[0] ;
      ptexml2.this.GXt_int3 = GXv_int6[0] ;
      AV89valorsiatcud = (short)(GXt_int3) ;
      GXv_char5[0] = AV92contidsernew ;
      new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV46Emprcod, httpContext.getMessage( "EXTHDR", ""), GXv_char5) ;
      ptexml2.this.AV92contidsernew = GXv_char5[0] ;
      /* Using cursor P04VY2 */
      pr_default.execute(0, new Object[] {AV46Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04VY2_A396EmprCod[0] ;
         A395EmprCif = P04VY2_A395EmprCif[0] ;
         n395EmprCif = P04VY2_n395EmprCif[0] ;
         A407EmprNom = P04VY2_A407EmprNom[0] ;
         n407EmprNom = P04VY2_n407EmprNom[0] ;
         A404EmprDir = P04VY2_A404EmprDir[0] ;
         n404EmprDir = P04VY2_n404EmprDir[0] ;
         A408EmprPob = P04VY2_A408EmprPob[0] ;
         n408EmprPob = P04VY2_n408EmprPob[0] ;
         A403EmprCpo = P04VY2_A403EmprCpo[0] ;
         n403EmprCpo = P04VY2_n403EmprCpo[0] ;
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
      AV86path += GXutil.trim( AV87pathIN) + "\\" + GXutil.trim( AV40Fichero) + httpContext.getMessage( ".xml", "") ;
      AV39filexml.openURL(AV86path);
      if ( AV39filexml.getErrCode() > 0 )
      {
         AV83Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV83Message.setgxTv_SdtMessages_Message_Id( GXutil.trim( GXutil.str( AV39filexml.getErrCode(), 10, 2)) );
         AV83Message.setgxTv_SdtMessages_Message_Description( AV39filexml.getErrDescription()+httpContext.getMessage( " Error Open Fichero XML", "") );
         AV83Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV84messages.add(AV83Message, 0);
      }
      else
      {
         AV41Body = httpContext.getMessage( "S:Body", "") ;
         AV39filexml.writeStartElement(GXutil.trim( AV41Body));
         AV41Body = httpContext.getMessage( "envioDocumentoTransporteRequestElem ", "") ;
         AV39filexml.writeNSStartElement(GXutil.trim( AV41Body), httpContext.getMessage( "ns2", ""), httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", ""));
         AV96GXLvl40 = (byte)(0) ;
         /* Using cursor P04VY3 */
         pr_default.execute(1, new Object[] {AV46Emprcod, Integer.valueOf(AV37AlbProcod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2253SalExtAlb = P04VY3_A2253SalExtAlb[0] ;
            A396EmprCod = P04VY3_A396EmprCod[0] ;
            A10741SalEnvAT = P04VY3_A10741SalEnvAT[0] ;
            A2248ManCod = P04VY3_A2248ManCod[0] ;
            A14349SalExtSerA = P04VY3_A14349SalExtSerA[0] ;
            A14350SalExtTipA = P04VY3_A14350SalExtTipA[0] ;
            A14348SalExtATCU = P04VY3_A14348SalExtATCU[0] ;
            A2256SalExtFec = P04VY3_A2256SalExtFec[0] ;
            A6396SalExtHor = P04VY3_A6396SalExtHor[0] ;
            A14398SalFecSal = P04VY3_A14398SalFecSal[0] ;
            A6397SalExtMat = P04VY3_A6397SalExtMat[0] ;
            AV96GXLvl40 = (byte)(1) ;
            AV77Mancod = A2248ManCod ;
            /* Execute user subroutine: 'MANUFA' */
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
            AV78Doc = "5" + GXutil.padl( GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0)), (short)(8), "0") ;
            if ( ( AV88siatcud == 1 ) && ( AV89valorsiatcud == 1 ) )
            {
               AV90documentnumber = GXutil.trim( A14350SalExtTipA) + " " + GXutil.trim( A14349SalExtSerA) + "/" + GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0)) ;
               AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.trim( AV90documentnumber));
            }
            else
            {
               if ( AV79Numdoc == 0 )
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProcod), 8, 0));
               }
               else
               {
                  AV39filexml.writeElement(httpContext.getMessage( "DocumentNumber", ""), AV78Doc);
               }
            }
            AV82codValidacaoSerie = A14348SalExtATCU ;
            AV91atcud = ((GXutil.strcmp("", AV82codValidacaoSerie)==0) ? "" : GXutil.trim( AV82codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( AV37AlbProcod, 8, 0))) ;
            if ( ! (GXutil.strcmp("", AV82codValidacaoSerie)==0) && ( AV88siatcud == 1 ) )
            {
               AV39filexml.writeElement(httpContext.getMessage( "ATCUD", ""), GXutil.trim( AV91atcud));
            }
            AV39filexml.writeElement(httpContext.getMessage( "MovementStatus", ""), httpContext.getMessage( "N", ""));
            AV61DateAux = GXutil.trim( GXutil.str( GXutil.year( A2256SalExtFec), 10, 0)) ;
            if ( GXutil.month( A2256SalExtFec) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A2256SalExtFec), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( A2256SalExtFec), 10, 0)) ;
            }
            if ( GXutil.day( A2256SalExtFec) < 10 )
            {
               AV61DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A2256SalExtFec), 10, 0)) ;
            }
            else
            {
               AV61DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( A2256SalExtFec), 10, 0)) ;
            }
            AV41Body = AV61DateAux ;
            AV39filexml.writeElement(httpContext.getMessage( "MovementDate", ""), GXutil.trim( AV41Body));
            AV39filexml.writeElement(httpContext.getMessage( "MovementType", ""), httpContext.getMessage( "GT", ""));
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
            AV58VarAux = localUtil.dtoc( A14398SalFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A6396SalExtHor ;
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
            AV41Body = "0" ;
            if ( GXutil.strcmp(A6397SalExtMat, " ") != 0 )
            {
               AV41Body = A6397SalExtMat ;
            }
            AV39filexml.writeElement(httpContext.getMessage( "VehicleID", ""), GXutil.trim( AV41Body));
            /* Using cursor P04VY4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6558FasCodn = P04VY4_A6558FasCodn[0] ;
               A1652BarSerDsc = P04VY4_A1652BarSerDsc[0] ;
               A212BarSer = P04VY4_A212BarSer[0] ;
               A6256SalExKgE = P04VY4_A6256SalExKgE[0] ;
               A130BarCodPar = P04VY4_A130BarCodPar[0] ;
               A132BarCodReo = P04VY4_A132BarCodReo[0] ;
               A129BarCod = P04VY4_A129BarCod[0] ;
               A6248SalExNln = P04VY4_A6248SalExNln[0] ;
               A1652BarSerDsc = P04VY4_A1652BarSerDsc[0] ;
               A212BarSer = P04VY4_A212BarSer[0] ;
               AV39filexml.writeStartElement(httpContext.getMessage( "Line", ""));
               AV62Pd = GXutil.trim( A212BarSer) + "-" + GXutil.trim( A1652BarSerDsc) + "-" + GXutil.trim( A6558FasCodn) ;
               AV39filexml.writeElement(httpContext.getMessage( "ProductDescription", ""), GXutil.trim( AV62Pd));
               AV70VarKgs = GXutil.padl( GXutil.trim( GXutil.str( A6256SalExKgE, 9, 2)), (short)(9), " ") ;
               AV71Vconv = GXutil.substring( AV70VarKgs, 1, 6) + "." + GXutil.substring( AV70VarKgs, 8, 9) ;
               AV72Num9 = CommonUtil.decimalVal( AV71Vconv, ".") ;
               AV39filexml.writeElement(httpContext.getMessage( "Quantity", ""), GXutil.trim( AV70VarKgs));
               AV39filexml.writeElement(httpContext.getMessage( "UnitOfMeasure", ""), httpContext.getMessage( "KG", ""));
               AV39filexml.writeElement(httpContext.getMessage( "UnitPrice", ""), "0");
               AV39filexml.writeEndElement();
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV96GXLvl40 == 0 )
         {
            AV83Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV83Message.setgxTv_SdtMessages_Message_Id( "0" );
            AV83Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "NO existe Registro", "") );
            AV83Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV84messages.add(AV83Message, 0);
         }
         AV39filexml.writeEndElement();
         AV39filexml.writeEndElement();
         AV39filexml.close();
         AV85ok = true ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MANUFA' Routine */
      returnInSub = false ;
      AV49CliNom = " " ;
      AV51CliDom = " " ;
      AV52CliPob = " " ;
      AV53Cp = " " ;
      AV48CliNif = " " ;
      /* Using cursor P04VY5 */
      pr_default.execute(3, new Object[] {AV46Emprcod, Short.valueOf(AV77Mancod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2248ManCod = P04VY5_A2248ManCod[0] ;
         A396EmprCod = P04VY5_A396EmprCod[0] ;
         A2249ManNom = P04VY5_A2249ManNom[0] ;
         n2249ManNom = P04VY5_n2249ManNom[0] ;
         A2250ManDom = P04VY5_A2250ManDom[0] ;
         n2250ManDom = P04VY5_n2250ManDom[0] ;
         A2251ManPob = P04VY5_A2251ManPob[0] ;
         n2251ManPob = P04VY5_n2251ManPob[0] ;
         A10743ManCp2 = P04VY5_A10743ManCp2[0] ;
         n10743ManCp2 = P04VY5_n10743ManCp2[0] ;
         A2252ManCpo = P04VY5_A2252ManCpo[0] ;
         n2252ManCpo = P04VY5_n2252ManCpo[0] ;
         A3302ManNif = P04VY5_A3302ManNif[0] ;
         n3302ManNif = P04VY5_n3302ManNif[0] ;
         AV49CliNom = A2249ManNom ;
         AV51CliDom = A2250ManDom ;
         AV52CliPob = A2251ManPob ;
         AV53Cp = GXutil.trim( A2252ManCpo) + "-" + GXutil.trim( A10743ManCp2) ;
         AV48CliNif = A3302ManNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptexml2.this.AV46Emprcod;
      this.aP1[0] = ptexml2.this.AV37AlbProcod;
      this.aP2[0] = ptexml2.this.AV87pathIN;
      this.aP3[0] = ptexml2.this.AV40Fichero;
      this.aP4[0] = ptexml2.this.AV84messages;
      this.aP5[0] = ptexml2.this.AV85ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV84messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV92contidsernew = "" ;
      GXv_char5 = new String[1] ;
      scmdbuf = "" ;
      P04VY2_A396EmprCod = new String[] {""} ;
      P04VY2_A395EmprCif = new String[] {""} ;
      P04VY2_n395EmprCif = new boolean[] {false} ;
      P04VY2_A407EmprNom = new String[] {""} ;
      P04VY2_n407EmprNom = new boolean[] {false} ;
      P04VY2_A404EmprDir = new String[] {""} ;
      P04VY2_n404EmprDir = new boolean[] {false} ;
      P04VY2_A408EmprPob = new String[] {""} ;
      P04VY2_n408EmprPob = new boolean[] {false} ;
      P04VY2_A403EmprCpo = new String[] {""} ;
      P04VY2_n403EmprCpo = new boolean[] {false} ;
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
      AV86path = "" ;
      AV39filexml = new com.genexus.xml.XMLWriter();
      AV83Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV41Body = "" ;
      P04VY3_A2253SalExtAlb = new int[1] ;
      P04VY3_A396EmprCod = new String[] {""} ;
      P04VY3_A10741SalEnvAT = new byte[1] ;
      P04VY3_A2248ManCod = new short[1] ;
      P04VY3_A14349SalExtSerA = new String[] {""} ;
      P04VY3_A14350SalExtTipA = new String[] {""} ;
      P04VY3_A14348SalExtATCU = new String[] {""} ;
      P04VY3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04VY3_A6396SalExtHor = new String[] {""} ;
      P04VY3_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P04VY3_A6397SalExtMat = new String[] {""} ;
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      A14348SalExtATCU = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A14398SalFecSal = GXutil.nullDate() ;
      A6397SalExtMat = "" ;
      AV78Doc = "" ;
      AV90documentnumber = "" ;
      AV82codValidacaoSerie = "" ;
      AV91atcud = "" ;
      AV61DateAux = "" ;
      AV48CliNif = "" ;
      AV51CliDom = "" ;
      AV52CliPob = "" ;
      AV53Cp = "" ;
      AV58VarAux = "" ;
      AV68FecHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV67VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV59HhSys = "" ;
      AV60FecSys = GXutil.nullDate() ;
      P04VY4_A396EmprCod = new String[] {""} ;
      P04VY4_A2253SalExtAlb = new int[1] ;
      P04VY4_A6558FasCodn = new String[] {""} ;
      P04VY4_A1652BarSerDsc = new String[] {""} ;
      P04VY4_A212BarSer = new String[] {""} ;
      P04VY4_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04VY4_A130BarCodPar = new String[] {""} ;
      P04VY4_A132BarCodReo = new byte[1] ;
      P04VY4_A129BarCod = new int[1] ;
      P04VY4_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV62Pd = "" ;
      AV70VarKgs = "" ;
      AV71Vconv = "" ;
      AV72Num9 = DecimalUtil.ZERO ;
      AV49CliNom = "" ;
      P04VY5_A2248ManCod = new short[1] ;
      P04VY5_A396EmprCod = new String[] {""} ;
      P04VY5_A2249ManNom = new String[] {""} ;
      P04VY5_n2249ManNom = new boolean[] {false} ;
      P04VY5_A2250ManDom = new String[] {""} ;
      P04VY5_n2250ManDom = new boolean[] {false} ;
      P04VY5_A2251ManPob = new String[] {""} ;
      P04VY5_n2251ManPob = new boolean[] {false} ;
      P04VY5_A10743ManCp2 = new String[] {""} ;
      P04VY5_n10743ManCp2 = new boolean[] {false} ;
      P04VY5_A2252ManCpo = new String[] {""} ;
      P04VY5_n2252ManCpo = new boolean[] {false} ;
      P04VY5_A3302ManNif = new String[] {""} ;
      P04VY5_n3302ManNif = new boolean[] {false} ;
      A2249ManNom = "" ;
      A2250ManDom = "" ;
      A2251ManPob = "" ;
      A10743ManCp2 = "" ;
      A2252ManCpo = "" ;
      A3302ManNif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.ptexml2__default(),
         new Object[] {
             new Object[] {
            P04VY2_A396EmprCod, P04VY2_A395EmprCif, P04VY2_n395EmprCif, P04VY2_A407EmprNom, P04VY2_n407EmprNom, P04VY2_A404EmprDir, P04VY2_n404EmprDir, P04VY2_A408EmprPob, P04VY2_n408EmprPob, P04VY2_A403EmprCpo,
            P04VY2_n403EmprCpo
            }
            , new Object[] {
            P04VY3_A2253SalExtAlb, P04VY3_A396EmprCod, P04VY3_A10741SalEnvAT, P04VY3_A2248ManCod, P04VY3_A14349SalExtSerA, P04VY3_A14350SalExtTipA, P04VY3_A14348SalExtATCU, P04VY3_A2256SalExtFec, P04VY3_A6396SalExtHor, P04VY3_A14398SalFecSal,
            P04VY3_A6397SalExtMat
            }
            , new Object[] {
            P04VY4_A396EmprCod, P04VY4_A2253SalExtAlb, P04VY4_A6558FasCodn, P04VY4_A1652BarSerDsc, P04VY4_A212BarSer, P04VY4_A6256SalExKgE, P04VY4_A130BarCodPar, P04VY4_A132BarCodReo, P04VY4_A129BarCod, P04VY4_A6248SalExNln
            }
            , new Object[] {
            P04VY5_A2248ManCod, P04VY5_A396EmprCod, P04VY5_A2249ManNom, P04VY5_n2249ManNom, P04VY5_A2250ManDom, P04VY5_n2250ManDom, P04VY5_A2251ManPob, P04VY5_n2251ManPob, P04VY5_A10743ManCp2, P04VY5_n10743ManCp2,
            P04VY5_A2252ManCpo, P04VY5_n2252ManCpo, P04VY5_A3302ManNif, P04VY5_n3302ManNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV79Numdoc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV96GXLvl40 ;
   private byte A10741SalEnvAT ;
   private byte A132BarCodReo ;
   private short AV88siatcud ;
   private short AV89valorsiatcud ;
   private short A2248ManCod ;
   private short AV77Mancod ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int AV37AlbProcod ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A2253SalExtAlb ;
   private int A129BarCod ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal AV72Num9 ;
   private String AV46Emprcod ;
   private String AV87pathIN ;
   private String AV40Fichero ;
   private String GXv_char4[] ;
   private String AV92contidsernew ;
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
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String A14348SalExtATCU ;
   private String A6396SalExtHor ;
   private String A6397SalExtMat ;
   private String AV78Doc ;
   private String AV82codValidacaoSerie ;
   private String AV91atcud ;
   private String AV61DateAux ;
   private String AV48CliNif ;
   private String AV51CliDom ;
   private String AV52CliPob ;
   private String AV53Cp ;
   private String AV58VarAux ;
   private String AV59HhSys ;
   private String A6558FasCodn ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV62Pd ;
   private String AV70VarKgs ;
   private String AV71Vconv ;
   private String AV49CliNom ;
   private String A2249ManNom ;
   private String A2250ManDom ;
   private String A2251ManPob ;
   private String A10743ManCp2 ;
   private String A2252ManCpo ;
   private String A3302ManNif ;
   private java.util.Date AV68FecHorSal ;
   private java.util.Date AV67VarAux0 ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A14398SalFecSal ;
   private java.util.Date AV60FecSys ;
   private boolean AV85ok ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean returnInSub ;
   private boolean n2249ManNom ;
   private boolean n2250ManDom ;
   private boolean n2251ManPob ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n3302ManNif ;
   private String AV86path ;
   private String AV90documentnumber ;
   private boolean[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VY2_A396EmprCod ;
   private String[] P04VY2_A395EmprCif ;
   private boolean[] P04VY2_n395EmprCif ;
   private String[] P04VY2_A407EmprNom ;
   private boolean[] P04VY2_n407EmprNom ;
   private String[] P04VY2_A404EmprDir ;
   private boolean[] P04VY2_n404EmprDir ;
   private String[] P04VY2_A408EmprPob ;
   private boolean[] P04VY2_n408EmprPob ;
   private String[] P04VY2_A403EmprCpo ;
   private boolean[] P04VY2_n403EmprCpo ;
   private int[] P04VY3_A2253SalExtAlb ;
   private String[] P04VY3_A396EmprCod ;
   private byte[] P04VY3_A10741SalEnvAT ;
   private short[] P04VY3_A2248ManCod ;
   private String[] P04VY3_A14349SalExtSerA ;
   private String[] P04VY3_A14350SalExtTipA ;
   private String[] P04VY3_A14348SalExtATCU ;
   private java.util.Date[] P04VY3_A2256SalExtFec ;
   private String[] P04VY3_A6396SalExtHor ;
   private java.util.Date[] P04VY3_A14398SalFecSal ;
   private String[] P04VY3_A6397SalExtMat ;
   private String[] P04VY4_A396EmprCod ;
   private int[] P04VY4_A2253SalExtAlb ;
   private String[] P04VY4_A6558FasCodn ;
   private String[] P04VY4_A1652BarSerDsc ;
   private String[] P04VY4_A212BarSer ;
   private java.math.BigDecimal[] P04VY4_A6256SalExKgE ;
   private String[] P04VY4_A130BarCodPar ;
   private byte[] P04VY4_A132BarCodReo ;
   private int[] P04VY4_A129BarCod ;
   private short[] P04VY4_A6248SalExNln ;
   private short[] P04VY5_A2248ManCod ;
   private String[] P04VY5_A396EmprCod ;
   private String[] P04VY5_A2249ManNom ;
   private boolean[] P04VY5_n2249ManNom ;
   private String[] P04VY5_A2250ManDom ;
   private boolean[] P04VY5_n2250ManDom ;
   private String[] P04VY5_A2251ManPob ;
   private boolean[] P04VY5_n2251ManPob ;
   private String[] P04VY5_A10743ManCp2 ;
   private boolean[] P04VY5_n10743ManCp2 ;
   private String[] P04VY5_A2252ManCpo ;
   private boolean[] P04VY5_n2252ManCpo ;
   private String[] P04VY5_A3302ManNif ;
   private boolean[] P04VY5_n3302ManNif ;
   private com.genexus.xml.XMLWriter AV39filexml ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV84messages ;
   private com.genexus.SdtMessages_Message AV83Message ;
}

final  class ptexml2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VY2", "SELECT EmprCod, EmprCif, EmprNom, EmprDir, EmprPob, EmprCpo FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04VY3", "SELECT SalExtAlb, EmprCod, SalEnvAT, ManCod, SalExtSerA, SalExtTipA, SalExtATCU, SalExtFec, SalExtHor, SalFecSal, SalExtMat FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04VY4", "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasCodn, T2.BarSerDsc, T2.BarSer, T1.SalExKgE, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04VY5", "SELECT ManCod, EmprCod, ManNom, ManDom, ManPob, ManCp2, ManCpo, ManNif FROM TXPMANUFA WHERE EmprCod = ? and ManCod = ? ORDER BY EmprCod, ManCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 34);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

