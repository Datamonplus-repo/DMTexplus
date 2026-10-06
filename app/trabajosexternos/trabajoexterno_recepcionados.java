package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_recepcionados extends GXProcedure
{
   public trabajoexterno_recepcionados( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_recepcionados.class ), "" );
   }

   public trabajoexterno_recepcionados( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      trabajoexterno_recepcionados.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      trabajoexterno_recepcionados.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      trabajoexterno_recepcionados.this.AV114Pman = aP1[0];
      this.aP1 = aP1;
      trabajoexterno_recepcionados.this.AV126Uman2 = aP2[0];
      this.aP2 = aP2;
      trabajoexterno_recepcionados.this.AV113PAlbFch = aP3[0];
      this.aP3 = aP3;
      trabajoexterno_recepcionados.this.AV124UFecha2 = aP4[0];
      this.aP4 = aP4;
      trabajoexterno_recepcionados.this.AV115POpe = aP5[0];
      this.aP5 = aP5;
      trabajoexterno_recepcionados.this.AV128UOpe2 = aP6[0];
      this.aP6 = aP6;
      trabajoexterno_recepcionados.this.AV122Trab = aP7[0];
      this.aP7 = aP7;
      trabajoexterno_recepcionados.this.aP8 = aP8;
      trabajoexterno_recepcionados.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV151Erfoc) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      trabajoexterno_recepcionados.this.GXt_int1 = GXv_int2[0] ;
      AV151Erfoc = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV147CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV143Random = (int)(GXutil.random( )*10000) ;
      AV144Filename = "TrabajosExternos_Recepcionados-" + GXutil.trim( GXutil.str( AV143Random, 8, 0)) + ".xlsx" ;
      AV145ExcelDocument.Open(AV144Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV145ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV145ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV145ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV145ExcelDocument.getErrCode() != 0 )
      {
         AV144Filename = "" ;
         AV146ErrorMessage = AV145ExcelDocument.getErrDescription() ;
         AV145ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV145ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Envio", "") );
      AV145ExcelDocument.Cells(1, 13, 1, 1).setBold( (short)(1) );
      AV145ExcelDocument.Cells(1, 13, 1, 1).setColor( 11 );
      AV145ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Recepcion", "") );
      AV145ExcelDocument.Cells(1, 17, 1, 1).setBold( (short)(1) );
      AV145ExcelDocument.Cells(1, 17, 1, 1).setColor( 11 );
      while ( AV129i <= 27 )
      {
         AV145ExcelDocument.Cells(2, AV129i, 1, 1).setBold( (short)(1) );
         AV145ExcelDocument.Cells(2, AV129i, 1, 1).setColor( 11 );
         AV129i = (short)(AV129i+1) ;
      }
      AV145ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Manufacturador", "") );
      AV145ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV145ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV145ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Ped Cli", "") );
      AV145ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV145ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV145ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV145ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV145ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "N Albaran", "") );
      AV145ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV145ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV145ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV145ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV145ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV145ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV145ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV145ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV145ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV145ExcelDocument.Cells(2, 19, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV145ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV145ExcelDocument.Cells(2, 21, 1, 1).setText( httpContext.getMessage( "Diferencia", "") );
      AV145ExcelDocument.Cells(2, 22, 1, 1).setText( httpContext.getMessage( "% Merma", "") );
      AV145ExcelDocument.Cells(2, 23, 1, 1).setText( httpContext.getMessage( "Dias", "") );
      AV145ExcelDocument.Cells(2, 24, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV145ExcelDocument.Cells(2, 25, 1, 1).setText( httpContext.getMessage( "St", "") );
      AV145ExcelDocument.Cells(2, 26, 1, 1).setText( httpContext.getMessage( "Modelo", "") );
      AV145ExcelDocument.Cells(2, 27, 1, 1).setText( httpContext.getMessage( "Prec. Sub.", "") );
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV136Manf = (byte)(0) ;
      AV134Fas = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV114Pman) ,
                                           Short.valueOf(AV126Uman2) ,
                                           AV115POpe ,
                                           AV128UOpe2 ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2689ExHdrFas ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AC22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV114Pman), Short.valueOf(AV126Uman2), AV115POpe, AV128UOpe2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAC22 = false ;
         A2249ManNom = P0AC22_A2249ManNom[0] ;
         n2249ManNom = P0AC22_n2249ManNom[0] ;
         A2248ManCod = P0AC22_A2248ManCod[0] ;
         A2691ExHdrUln = P0AC22_A2691ExHdrUln[0] ;
         n2691ExHdrUln = P0AC22_n2691ExHdrUln[0] ;
         A2689ExHdrFas = P0AC22_A2689ExHdrFas[0] ;
         A2249ManNom = P0AC22_A2249ManNom[0] ;
         n2249ManNom = P0AC22_n2249ManNom[0] ;
         AV108ManCod = A2248ManCod ;
         AV109ManNom = A2249ManNom ;
         AV136Manf = (byte)(0) ;
         AV95FlagL = (byte)(0) ;
         AV96FlagM = (byte)(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AC22_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AC22_A2248ManCod[0] == A2248ManCod ) )
         {
            brkAC22 = false ;
            A2249ManNom = P0AC22_A2249ManNom[0] ;
            n2249ManNom = P0AC22_n2249ManNom[0] ;
            A2691ExHdrUln = P0AC22_A2691ExHdrUln[0] ;
            n2691ExHdrUln = P0AC22_n2691ExHdrUln[0] ;
            A2689ExHdrFas = P0AC22_A2689ExHdrFas[0] ;
            A2249ManNom = P0AC22_A2249ManNom[0] ;
            n2249ManNom = P0AC22_n2249ManNom[0] ;
            AV92FechaE = GXutil.nullDate() ;
            AV93FechaR = GXutil.nullDate() ;
            AV97FlagO = (byte)(0) ;
            AV134Fas = (byte)(0) ;
            AV135Fascod = A2689ExHdrFas ;
            GXv_char3[0] = AV52fasdsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A2689ExHdrFas, GXv_char3) ;
            trabajoexterno_recepcionados.this.AV52fasdsc = GXv_char3[0] ;
            pr_default.dynParam(1, new Object[]{ new Object[]{
                                                 AV113PAlbFch ,
                                                 AV124UFecha2 ,
                                                 A2700ExHdrFeR ,
                                                 A396EmprCod ,
                                                 Short.valueOf(A2248ManCod) ,
                                                 A2689ExHdrFas } ,
                                                 new int[]{
                                                 TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING
                                                 }
            });
            /* Using cursor P0AC24 */
            pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, AV113PAlbFch, AV124UFecha2});
            while ( (pr_default.getStatus(1) != 101) )
            {
               brkAC24 = false ;
               A130BarCodPar = P0AC24_A130BarCodPar[0] ;
               n130BarCodPar = P0AC24_n130BarCodPar[0] ;
               A132BarCodReo = P0AC24_A132BarCodReo[0] ;
               n132BarCodReo = P0AC24_n132BarCodReo[0] ;
               A129BarCod = P0AC24_A129BarCod[0] ;
               n129BarCod = P0AC24_n129BarCod[0] ;
               A2700ExHdrFeR = P0AC24_A2700ExHdrFeR[0] ;
               n2700ExHdrFeR = P0AC24_n2700ExHdrFeR[0] ;
               A2693ExHdrTip = P0AC24_A2693ExHdrTip[0] ;
               n2693ExHdrTip = P0AC24_n2693ExHdrTip[0] ;
               A2694ExHdrAlb = P0AC24_A2694ExHdrAlb[0] ;
               n2694ExHdrAlb = P0AC24_n2694ExHdrAlb[0] ;
               A228BarUniMed = P0AC24_A228BarUniMed[0] ;
               A4609BarMdlCod = P0AC24_A4609BarMdlCod[0] ;
               A1910BarRdoN = P0AC24_A1910BarRdoN[0] ;
               A2748CliAlias = P0AC24_A2748CliAlias[0] ;
               A279CliNom = P0AC24_A279CliNom[0] ;
               A252CliCod = P0AC24_A252CliCod[0] ;
               n252CliCod = P0AC24_n252CliCod[0] ;
               A212BarSer = P0AC24_A212BarSer[0] ;
               A1652BarSerDsc = P0AC24_A1652BarSerDsc[0] ;
               A2699ExHdrCnR = P0AC24_A2699ExHdrCnR[0] ;
               n2699ExHdrCnR = P0AC24_n2699ExHdrCnR[0] ;
               A2698ExHdrKgR = P0AC24_A2698ExHdrKgR[0] ;
               n2698ExHdrKgR = P0AC24_n2698ExHdrKgR[0] ;
               A2845ExHdrMtR = P0AC24_A2845ExHdrMtR[0] ;
               n2845ExHdrMtR = P0AC24_n2845ExHdrMtR[0] ;
               A166BarKgm = P0AC24_A166BarKgm[0] ;
               A184BarMtr = P0AC24_A184BarMtr[0] ;
               A199BarPie1 = P0AC24_A199BarPie1[0] ;
               A365DisDes = P0AC24_A365DisDes[0] ;
               A898BarPieNDes = P0AC24_A898BarPieNDes[0] ;
               A143BarDisNum = P0AC24_A143BarDisNum[0] ;
               A4812BarEncCli = P0AC24_A4812BarEncCli[0] ;
               A2692ExHdrLin = P0AC24_A2692ExHdrLin[0] ;
               A228BarUniMed = P0AC24_A228BarUniMed[0] ;
               A4609BarMdlCod = P0AC24_A4609BarMdlCod[0] ;
               A1910BarRdoN = P0AC24_A1910BarRdoN[0] ;
               A252CliCod = P0AC24_A252CliCod[0] ;
               n252CliCod = P0AC24_n252CliCod[0] ;
               A212BarSer = P0AC24_A212BarSer[0] ;
               A1652BarSerDsc = P0AC24_A1652BarSerDsc[0] ;
               A365DisDes = P0AC24_A365DisDes[0] ;
               A143BarDisNum = P0AC24_A143BarDisNum[0] ;
               A4812BarEncCli = P0AC24_A4812BarEncCli[0] ;
               A2748CliAlias = P0AC24_A2748CliAlias[0] ;
               A279CliNom = P0AC24_A279CliNom[0] ;
               A166BarKgm = P0AC24_A166BarKgm[0] ;
               A184BarMtr = P0AC24_A184BarMtr[0] ;
               A199BarPie1 = P0AC24_A199BarPie1[0] ;
               A898BarPieNDes = P0AC24_A898BarPieNDes[0] ;
               GXt_char4 = A13878PedidoClie ;
               GXv_char3[0] = A396EmprCod ;
               GXv_char5[0] = A4812BarEncCli ;
               GXv_char6[0] = A143BarDisNum ;
               GXv_char7[0] = GXt_char4 ;
               new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char5, GXv_char6, GXv_char7) ;
               trabajoexterno_recepcionados.this.A396EmprCod = GXv_char3[0] ;
               trabajoexterno_recepcionados.this.A4812BarEncCli = GXv_char5[0] ;
               trabajoexterno_recepcionados.this.A143BarDisNum = GXv_char6[0] ;
               trabajoexterno_recepcionados.this.GXt_char4 = GXv_char7[0] ;
               A13878PedidoClie = GXt_char4 ;
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               AV121TotKgsR = DecimalUtil.ZERO ;
               AV142Numv = (short)(0) ;
               while ( (pr_default.getStatus(1) != 101) && ( P0AC24_A129BarCod[0] == A129BarCod ) && ( P0AC24_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AC24_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P0AC24_A2693ExHdrTip[0], A2693ExHdrTip) == 0 ) )
               {
                  brkAC24 = false ;
                  A2700ExHdrFeR = P0AC24_A2700ExHdrFeR[0] ;
                  n2700ExHdrFeR = P0AC24_n2700ExHdrFeR[0] ;
                  A2692ExHdrLin = P0AC24_A2692ExHdrLin[0] ;
                  if ( GXutil.strcmp(P0AC24_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P0AC24_A2248ManCod[0] == A2248ManCod )
                     {
                        if ( GXutil.strcmp(P0AC24_A2689ExHdrFas[0], A2689ExHdrFas) == 0 )
                        {
                           if ( (0==AV114Pman) || ( ( A2248ManCod >= AV114Pman ) ) )
                           {
                              if ( (0==AV126Uman2) || ( ( A2248ManCod <= AV126Uman2 ) ) )
                              {
                                 if ( (GXutil.strcmp("", AV115POpe)==0) || ( ( GXutil.strcmp(A2689ExHdrFas, AV115POpe) >= 0 ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV128UOpe2)==0) || ( ( GXutil.strcmp(A2689ExHdrFas, AV128UOpe2) <= 0 ) ) )
                                    {
                                       AV142Numv = (short)(AV142Numv+1) ;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
                  brkAC24 = true ;
                  pr_default.readNext(1);
               }
               AV25BarCod = A129BarCod ;
               AV27BarCodReo = A132BarCodReo ;
               AV26BarCodPar = A130BarCodPar ;
               AV116SalExtAlb = A2694ExHdrAlb ;
               AV133BarUnimed = A228BarUniMed ;
               AV132Barenccli = A13878PedidoClie ;
               AV140Barmdlcod = A4609BarMdlCod ;
               /* Execute user subroutine: 'LEOSTA' */
               S164 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               if ( ( ( GXutil.strcmp(AV122Trab, httpContext.getMessage( "A", "")) == 0 ) && ( ( AV117SalExtEsB == 1 ) || (0==AV117SalExtEsB) ) ) || ( ( GXutil.strcmp(AV122Trab, httpContext.getMessage( "C", "")) == 0 ) && ( AV117SalExtEsB == 2 ) ) || ( ( GXutil.strcmp(AV122Trab, httpContext.getMessage( "T", "")) == 0 ) ) )
               {
                  AV152BarRdoN = A1910BarRdoN ;
                  AV100HojaRuta = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                  if ( ! (GXutil.strcmp("", A2748CliAlias)==0) )
                  {
                     AV111NomCli = A2748CliAlias ;
                  }
                  else
                  {
                     AV111NomCli = GXutil.substring( A279CliNom, 1, 16) ;
                  }
                  GXv_date8[0] = AV131EXHDRFEE ;
                  GXv_decimal9[0] = AV88EXHDRKGE ;
                  GXv_decimal10[0] = AV89EXHDRMTE ;
                  GXv_int11[0] = AV130EXHDRCNE ;
                  new app.trabajosexternos.pexpr01(remoteHandle, context).execute( A396EmprCod, A2248ManCod, A2689ExHdrFas, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_date8, GXv_decimal9, GXv_decimal10, GXv_int11) ;
                  trabajoexterno_recepcionados.this.AV131EXHDRFEE = GXv_date8[0] ;
                  trabajoexterno_recepcionados.this.AV88EXHDRKGE = GXv_decimal9[0] ;
                  trabajoexterno_recepcionados.this.AV89EXHDRMTE = GXv_decimal10[0] ;
                  trabajoexterno_recepcionados.this.AV130EXHDRCNE = GXv_int11[0] ;
                  AV92FechaE = AV131EXHDRFEE ;
                  AV145ExcelDocument.Cells(AV147CellRow, 1, 1, 1).setText( A2249ManNom );
                  AV145ExcelDocument.Cells(AV147CellRow, 2, 1, 1).setText( AV52fasdsc );
                  AV145ExcelDocument.Cells(AV147CellRow, 3, 1, 1).setText( AV100HojaRuta );
                  AV145ExcelDocument.Cells(AV147CellRow, 4, 1, 1).setText( AV132Barenccli );
                  AV145ExcelDocument.Cells(AV147CellRow, 5, 1, 1).setNumber( A252CliCod );
                  AV145ExcelDocument.Cells(AV147CellRow, 6, 1, 1).setText( AV111NomCli );
                  AV145ExcelDocument.Cells(AV147CellRow, 7, 1, 1).setText( A212BarSer );
                  AV145ExcelDocument.Cells(AV147CellRow, 8, 1, 1).setText( A1652BarSerDsc );
                  AV145ExcelDocument.Cells(AV147CellRow, 9, 1, 1).setNumber( AV116SalExtAlb );
                  AV145ExcelDocument.Cells(AV147CellRow, 10, 1, 1).setNumber( A198BarPie );
                  AV145ExcelDocument.Cells(AV147CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                  AV145ExcelDocument.Cells(AV147CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
                  AV145ExcelDocument.Cells(AV147CellRow, 13, 1, 1).setNumber( AV130EXHDRCNE );
                  AV145ExcelDocument.Cells(AV147CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88EXHDRKGE)) );
                  AV145ExcelDocument.Cells(AV147CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV89EXHDRMTE)) );
                  GXt_dtime12 = GXutil.resetTime( AV131EXHDRFEE );
                  AV145ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV145ExcelDocument.Cells(AV147CellRow, 16, 1, 1).setDate( GXt_dtime12 );
                  AV145ExcelDocument.Cells(AV147CellRow, 17, 1, 1).setNumber( A2699ExHdrCnR );
                  AV145ExcelDocument.Cells(AV147CellRow, 18, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2698ExHdrKgR)) );
                  AV145ExcelDocument.Cells(AV147CellRow, 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2845ExHdrMtR)) );
                  GXt_dtime12 = GXutil.resetTime( A2700ExHdrFeR );
                  AV145ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV145ExcelDocument.Cells(AV147CellRow, 20, 1, 1).setDate( GXt_dtime12 );
                  AV93FechaR = A2700ExHdrFeR ;
                  AV121TotKgsR = AV121TotKgsR.add(A2698ExHdrKgR) ;
                  AV139TotMtsr = AV139TotMtsr.add(A2845ExHdrMtR) ;
                  AV120TotConR = (short)(AV120TotConR+A2699ExHdrCnR) ;
                  AV95FlagL = (byte)(1) ;
               }
               AV86DifKgs = DecimalUtil.ZERO ;
               AV110MerKgs = DecimalUtil.ZERO ;
               AV85DiasSer = (short)(0) ;
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121TotKgsR)==0) && ( GXutil.strcmp(AV133BarUnimed, httpContext.getMessage( "K", "")) == 0 ) )
               {
                  AV86DifKgs = AV88EXHDRKGE.subtract(AV121TotKgsR) ;
                  AV110MerKgs = ((AV121TotKgsR.subtract(AV88EXHDRKGE)).divide(AV88EXHDRKGE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
                  AV85DiasSer = (short)(GXutil.ddiff(AV93FechaR,AV92FechaE)) ;
               }
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139TotMtsr)==0) && ( GXutil.strcmp(AV133BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  AV86DifKgs = AV89EXHDRMTE.subtract(AV139TotMtsr) ;
                  AV110MerKgs = ((AV139TotMtsr.subtract(AV89EXHDRMTE)).divide(AV89EXHDRMTE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
                  AV85DiasSer = (short)(GXutil.ddiff(AV93FechaR,AV92FechaE)) ;
               }
               AV145ExcelDocument.Cells(AV147CellRow, 21, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86DifKgs)) );
               AV145ExcelDocument.Cells(AV147CellRow, 22, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV110MerKgs)) );
               AV145ExcelDocument.Cells(AV147CellRow, 23, 1, 1).setNumber( AV85DiasSer );
               AV145ExcelDocument.Cells(AV147CellRow, 24, 1, 1).setText( AV133BarUnimed );
               AV145ExcelDocument.Cells(AV147CellRow, 25, 1, 1).setText( AV118Sta );
               AV145ExcelDocument.Cells(AV147CellRow, 26, 1, 1).setText( AV140Barmdlcod );
               AV145ExcelDocument.Cells(AV147CellRow, 27, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV152BarRdoN)) );
               AV145ExcelDocument.Cells(AV147CellRow, 28, 1, 1).setNumber( AV142Numv );
               AV121TotKgsR = DecimalUtil.doubleToDec(0) ;
               AV139TotMtsr = DecimalUtil.doubleToDec(0) ;
               AV120TotConR = (short)(0) ;
               AV147CellRow = (int)(AV147CellRow+1) ;
               if ( ! brkAC24 )
               {
                  brkAC24 = true ;
                  pr_default.readNext(1);
               }
            }
            pr_default.close(1);
            brkAC22 = true ;
            pr_default.readNext(0);
         }
         if ( ! brkAC22 )
         {
            brkAC22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S164( )
   {
      /* 'LEOSTA' Routine */
      returnInSub = false ;
      AV118Sta = "" ;
      AV117SalExtEsB = (byte)(0) ;
      AV137SalExtFen = GXutil.nullDate() ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV114Pman) ,
                                           Short.valueOf(AV126Uman2) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV116SalExtAlb) ,
                                           Integer.valueOf(AV25BarCod) ,
                                           Byte.valueOf(AV27BarCodReo) ,
                                           AV26BarCodPar ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P0AC25 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV116SalExtAlb), Integer.valueOf(AV25BarCod), Byte.valueOf(AV27BarCodReo), AV26BarCodPar, Short.valueOf(AV114Pman), Short.valueOf(AV126Uman2)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2248ManCod = P0AC25_A2248ManCod[0] ;
         A130BarCodPar = P0AC25_A130BarCodPar[0] ;
         n130BarCodPar = P0AC25_n130BarCodPar[0] ;
         A132BarCodReo = P0AC25_A132BarCodReo[0] ;
         n132BarCodReo = P0AC25_n132BarCodReo[0] ;
         A129BarCod = P0AC25_A129BarCod[0] ;
         n129BarCod = P0AC25_n129BarCod[0] ;
         A2253SalExtAlb = P0AC25_A2253SalExtAlb[0] ;
         A2262SalExtEsB = P0AC25_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P0AC25_n2262SalExtEsB[0] ;
         A11317SalExtFt = P0AC25_A11317SalExtFt[0] ;
         n11317SalExtFt = P0AC25_n11317SalExtFt[0] ;
         A2248ManCod = P0AC25_A2248ManCod[0] ;
         AV117SalExtEsB = A2262SalExtEsB ;
         AV137SalExtFen = A11317SalExtFt ;
         if ( ( A2262SalExtEsB == 1 ) || (0==A2262SalExtEsB) )
         {
            AV118Sta = "A" ;
         }
         if ( A2262SalExtEsB == 2 )
         {
            AV118Sta = "C" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = trabajoexterno_recepcionados.this.A396EmprCod;
      this.aP1[0] = trabajoexterno_recepcionados.this.AV114Pman;
      this.aP2[0] = trabajoexterno_recepcionados.this.AV126Uman2;
      this.aP3[0] = trabajoexterno_recepcionados.this.AV113PAlbFch;
      this.aP4[0] = trabajoexterno_recepcionados.this.AV124UFecha2;
      this.aP5[0] = trabajoexterno_recepcionados.this.AV115POpe;
      this.aP6[0] = trabajoexterno_recepcionados.this.AV128UOpe2;
      this.aP7[0] = trabajoexterno_recepcionados.this.AV122Trab;
      this.aP8[0] = trabajoexterno_recepcionados.this.AV144Filename;
      this.aP9[0] = trabajoexterno_recepcionados.this.AV146ErrorMessage;
      CloseOpenCursors();
      AV145ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV144Filename = "" ;
      AV146ErrorMessage = "" ;
      GXv_int2 = new byte[1] ;
      AV145ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      A2689ExHdrFas = "" ;
      P0AC22_A396EmprCod = new String[] {""} ;
      P0AC22_A2249ManNom = new String[] {""} ;
      P0AC22_n2249ManNom = new boolean[] {false} ;
      P0AC22_A2248ManCod = new short[1] ;
      P0AC22_A2691ExHdrUln = new int[1] ;
      P0AC22_n2691ExHdrUln = new boolean[] {false} ;
      P0AC22_A2689ExHdrFas = new String[] {""} ;
      A2249ManNom = "" ;
      AV109ManNom = "" ;
      AV92FechaE = GXutil.nullDate() ;
      AV93FechaR = GXutil.nullDate() ;
      AV135Fascod = "" ;
      AV52fasdsc = "" ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      P0AC24_A2248ManCod = new short[1] ;
      P0AC24_A2689ExHdrFas = new String[] {""} ;
      P0AC24_A130BarCodPar = new String[] {""} ;
      P0AC24_n130BarCodPar = new boolean[] {false} ;
      P0AC24_A132BarCodReo = new byte[1] ;
      P0AC24_n132BarCodReo = new boolean[] {false} ;
      P0AC24_A129BarCod = new int[1] ;
      P0AC24_n129BarCod = new boolean[] {false} ;
      P0AC24_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC24_n2700ExHdrFeR = new boolean[] {false} ;
      P0AC24_A2693ExHdrTip = new String[] {""} ;
      P0AC24_n2693ExHdrTip = new boolean[] {false} ;
      P0AC24_A2694ExHdrAlb = new int[1] ;
      P0AC24_n2694ExHdrAlb = new boolean[] {false} ;
      P0AC24_A228BarUniMed = new String[] {""} ;
      P0AC24_A4609BarMdlCod = new String[] {""} ;
      P0AC24_A1910BarRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC24_A2748CliAlias = new String[] {""} ;
      P0AC24_A279CliNom = new String[] {""} ;
      P0AC24_A252CliCod = new int[1] ;
      P0AC24_n252CliCod = new boolean[] {false} ;
      P0AC24_A212BarSer = new String[] {""} ;
      P0AC24_A1652BarSerDsc = new String[] {""} ;
      P0AC24_A2699ExHdrCnR = new short[1] ;
      P0AC24_n2699ExHdrCnR = new boolean[] {false} ;
      P0AC24_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC24_n2698ExHdrKgR = new boolean[] {false} ;
      P0AC24_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC24_n2845ExHdrMtR = new boolean[] {false} ;
      P0AC24_A396EmprCod = new String[] {""} ;
      P0AC24_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC24_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC24_A199BarPie1 = new short[1] ;
      P0AC24_A365DisDes = new String[] {""} ;
      P0AC24_A898BarPieNDes = new int[1] ;
      P0AC24_A143BarDisNum = new String[] {""} ;
      P0AC24_A4812BarEncCli = new String[] {""} ;
      P0AC24_A2692ExHdrLin = new int[1] ;
      A130BarCodPar = "" ;
      A2693ExHdrTip = "" ;
      A228BarUniMed = "" ;
      A4609BarMdlCod = "" ;
      A1910BarRdoN = DecimalUtil.ZERO ;
      A2748CliAlias = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13878PedidoClie = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      AV121TotKgsR = DecimalUtil.ZERO ;
      AV26BarCodPar = "" ;
      AV133BarUnimed = "" ;
      AV132Barenccli = "" ;
      AV140Barmdlcod = "" ;
      AV152BarRdoN = DecimalUtil.ZERO ;
      AV100HojaRuta = "" ;
      AV111NomCli = "" ;
      AV131EXHDRFEE = GXutil.nullDate() ;
      GXv_date8 = new java.util.Date[1] ;
      AV88EXHDRKGE = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV89EXHDRMTE = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      GXt_dtime12 = GXutil.resetTime( GXutil.nullDate() );
      AV139TotMtsr = DecimalUtil.ZERO ;
      AV86DifKgs = DecimalUtil.ZERO ;
      AV110MerKgs = DecimalUtil.ZERO ;
      AV118Sta = "" ;
      AV137SalExtFen = GXutil.nullDate() ;
      P0AC25_A396EmprCod = new String[] {""} ;
      P0AC25_A2248ManCod = new short[1] ;
      P0AC25_A130BarCodPar = new String[] {""} ;
      P0AC25_n130BarCodPar = new boolean[] {false} ;
      P0AC25_A132BarCodReo = new byte[1] ;
      P0AC25_n132BarCodReo = new boolean[] {false} ;
      P0AC25_A129BarCod = new int[1] ;
      P0AC25_n129BarCod = new boolean[] {false} ;
      P0AC25_A2253SalExtAlb = new int[1] ;
      P0AC25_A2262SalExtEsB = new byte[1] ;
      P0AC25_n2262SalExtEsB = new boolean[] {false} ;
      P0AC25_A11317SalExtFt = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC25_n11317SalExtFt = new boolean[] {false} ;
      A11317SalExtFt = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_recepcionados__default(),
         new Object[] {
             new Object[] {
            P0AC22_A396EmprCod, P0AC22_A2249ManNom, P0AC22_n2249ManNom, P0AC22_A2248ManCod, P0AC22_A2691ExHdrUln, P0AC22_n2691ExHdrUln, P0AC22_A2689ExHdrFas
            }
            , new Object[] {
            P0AC24_A2248ManCod, P0AC24_A2689ExHdrFas, P0AC24_A130BarCodPar, P0AC24_n130BarCodPar, P0AC24_A132BarCodReo, P0AC24_n132BarCodReo, P0AC24_A129BarCod, P0AC24_n129BarCod, P0AC24_A2700ExHdrFeR, P0AC24_n2700ExHdrFeR,
            P0AC24_A2693ExHdrTip, P0AC24_n2693ExHdrTip, P0AC24_A2694ExHdrAlb, P0AC24_n2694ExHdrAlb, P0AC24_A228BarUniMed, P0AC24_A4609BarMdlCod, P0AC24_A1910BarRdoN, P0AC24_A2748CliAlias, P0AC24_A279CliNom, P0AC24_A252CliCod,
            P0AC24_n252CliCod, P0AC24_A212BarSer, P0AC24_A1652BarSerDsc, P0AC24_A2699ExHdrCnR, P0AC24_n2699ExHdrCnR, P0AC24_A2698ExHdrKgR, P0AC24_n2698ExHdrKgR, P0AC24_A2845ExHdrMtR, P0AC24_n2845ExHdrMtR, P0AC24_A396EmprCod,
            P0AC24_A166BarKgm, P0AC24_A184BarMtr, P0AC24_A199BarPie1, P0AC24_A365DisDes, P0AC24_A898BarPieNDes, P0AC24_A143BarDisNum, P0AC24_A4812BarEncCli, P0AC24_A2692ExHdrLin
            }
            , new Object[] {
            P0AC25_A396EmprCod, P0AC25_A2248ManCod, P0AC25_A130BarCodPar, P0AC25_A132BarCodReo, P0AC25_A129BarCod, P0AC25_A2253SalExtAlb, P0AC25_A2262SalExtEsB, P0AC25_n2262SalExtEsB, P0AC25_A11317SalExtFt, P0AC25_n11317SalExtFt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV136Manf ;
   private byte AV134Fas ;
   private byte AV95FlagL ;
   private byte AV96FlagM ;
   private byte AV97FlagO ;
   private byte A132BarCodReo ;
   private byte AV27BarCodReo ;
   private byte AV117SalExtEsB ;
   private byte A2262SalExtEsB ;
   private short AV114Pman ;
   private short AV126Uman2 ;
   private short AV151Erfoc ;
   private short AV129i ;
   private short A2248ManCod ;
   private short AV108ManCod ;
   private short A2699ExHdrCnR ;
   private short A199BarPie1 ;
   private short AV142Numv ;
   private short AV130EXHDRCNE ;
   private short GXv_int11[] ;
   private short AV120TotConR ;
   private short AV85DiasSer ;
   private short Gx_err ;
   private int AV147CellRow ;
   private int AV143Random ;
   private int A2691ExHdrUln ;
   private int A129BarCod ;
   private int A2694ExHdrAlb ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A2692ExHdrLin ;
   private int A198BarPie ;
   private int AV25BarCod ;
   private int AV116SalExtAlb ;
   private int A2253SalExtAlb ;
   private java.math.BigDecimal A1910BarRdoN ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV121TotKgsR ;
   private java.math.BigDecimal AV152BarRdoN ;
   private java.math.BigDecimal AV88EXHDRKGE ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV89EXHDRMTE ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV139TotMtsr ;
   private java.math.BigDecimal AV86DifKgs ;
   private java.math.BigDecimal AV110MerKgs ;
   private String A396EmprCod ;
   private String AV115POpe ;
   private String AV128UOpe2 ;
   private String AV122Trab ;
   private String scmdbuf ;
   private String A2689ExHdrFas ;
   private String A2249ManNom ;
   private String AV109ManNom ;
   private String AV135Fascod ;
   private String AV52fasdsc ;
   private String A130BarCodPar ;
   private String A2693ExHdrTip ;
   private String A228BarUniMed ;
   private String A4609BarMdlCod ;
   private String A2748CliAlias ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13878PedidoClie ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String AV26BarCodPar ;
   private String AV133BarUnimed ;
   private String AV132Barenccli ;
   private String AV140Barmdlcod ;
   private String AV100HojaRuta ;
   private String AV111NomCli ;
   private String AV118Sta ;
   private java.util.Date GXt_dtime12 ;
   private java.util.Date AV113PAlbFch ;
   private java.util.Date AV124UFecha2 ;
   private java.util.Date AV92FechaE ;
   private java.util.Date AV93FechaR ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV131EXHDRFEE ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date AV137SalExtFen ;
   private java.util.Date A11317SalExtFt ;
   private boolean returnInSub ;
   private boolean brkAC22 ;
   private boolean n2249ManNom ;
   private boolean n2691ExHdrUln ;
   private boolean brkAC24 ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n2700ExHdrFeR ;
   private boolean n2693ExHdrTip ;
   private boolean n2694ExHdrAlb ;
   private boolean n252CliCod ;
   private boolean n2699ExHdrCnR ;
   private boolean n2698ExHdrKgR ;
   private boolean n2845ExHdrMtR ;
   private boolean n2262SalExtEsB ;
   private boolean n11317SalExtFt ;
   private String AV144Filename ;
   private String AV146ErrorMessage ;
   private String[] aP9 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AC22_A396EmprCod ;
   private String[] P0AC22_A2249ManNom ;
   private boolean[] P0AC22_n2249ManNom ;
   private short[] P0AC22_A2248ManCod ;
   private int[] P0AC22_A2691ExHdrUln ;
   private boolean[] P0AC22_n2691ExHdrUln ;
   private String[] P0AC22_A2689ExHdrFas ;
   private short[] P0AC24_A2248ManCod ;
   private String[] P0AC24_A2689ExHdrFas ;
   private String[] P0AC24_A130BarCodPar ;
   private boolean[] P0AC24_n130BarCodPar ;
   private byte[] P0AC24_A132BarCodReo ;
   private boolean[] P0AC24_n132BarCodReo ;
   private int[] P0AC24_A129BarCod ;
   private boolean[] P0AC24_n129BarCod ;
   private java.util.Date[] P0AC24_A2700ExHdrFeR ;
   private boolean[] P0AC24_n2700ExHdrFeR ;
   private String[] P0AC24_A2693ExHdrTip ;
   private boolean[] P0AC24_n2693ExHdrTip ;
   private int[] P0AC24_A2694ExHdrAlb ;
   private boolean[] P0AC24_n2694ExHdrAlb ;
   private String[] P0AC24_A228BarUniMed ;
   private String[] P0AC24_A4609BarMdlCod ;
   private java.math.BigDecimal[] P0AC24_A1910BarRdoN ;
   private String[] P0AC24_A2748CliAlias ;
   private String[] P0AC24_A279CliNom ;
   private int[] P0AC24_A252CliCod ;
   private boolean[] P0AC24_n252CliCod ;
   private String[] P0AC24_A212BarSer ;
   private String[] P0AC24_A1652BarSerDsc ;
   private short[] P0AC24_A2699ExHdrCnR ;
   private boolean[] P0AC24_n2699ExHdrCnR ;
   private java.math.BigDecimal[] P0AC24_A2698ExHdrKgR ;
   private boolean[] P0AC24_n2698ExHdrKgR ;
   private java.math.BigDecimal[] P0AC24_A2845ExHdrMtR ;
   private boolean[] P0AC24_n2845ExHdrMtR ;
   private String[] P0AC24_A396EmprCod ;
   private java.math.BigDecimal[] P0AC24_A166BarKgm ;
   private java.math.BigDecimal[] P0AC24_A184BarMtr ;
   private short[] P0AC24_A199BarPie1 ;
   private String[] P0AC24_A365DisDes ;
   private int[] P0AC24_A898BarPieNDes ;
   private String[] P0AC24_A143BarDisNum ;
   private String[] P0AC24_A4812BarEncCli ;
   private int[] P0AC24_A2692ExHdrLin ;
   private String[] P0AC25_A396EmprCod ;
   private short[] P0AC25_A2248ManCod ;
   private String[] P0AC25_A130BarCodPar ;
   private boolean[] P0AC25_n130BarCodPar ;
   private byte[] P0AC25_A132BarCodReo ;
   private boolean[] P0AC25_n132BarCodReo ;
   private int[] P0AC25_A129BarCod ;
   private boolean[] P0AC25_n129BarCod ;
   private int[] P0AC25_A2253SalExtAlb ;
   private byte[] P0AC25_A2262SalExtEsB ;
   private boolean[] P0AC25_n2262SalExtEsB ;
   private java.util.Date[] P0AC25_A11317SalExtFt ;
   private boolean[] P0AC25_n11317SalExtFt ;
   private com.genexus.gxoffice.ExcelDoc AV145ExcelDocument ;
}

final  class trabajoexterno_recepcionados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AC22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV114Pman ,
                                          short AV126Uman2 ,
                                          String AV115POpe ,
                                          String AV128UOpe2 ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[5];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ManNom, T1.ManCod, T1.ExHdrUln, T1.ExHdrFas FROM (TXPCEXMVH T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV114Pman) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (0==AV126Uman2) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115POpe)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas >= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128UOpe2)==0) )
      {
         addWhere(sWhereString, "(T1.ExHdrFas <= ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P0AC24( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV113PAlbFch ,
                                          java.util.Date AV124UFecha2 ,
                                          java.util.Date A2700ExHdrFeR ,
                                          String A396EmprCod ,
                                          short A2248ManCod ,
                                          String A2689ExHdrFas )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[5];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.ManCod, T1.ExHdrFas, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ExHdrFeR, T1.ExHdrTip, T1.ExHdrAlb, T2.BarUniMed, T2.BarMdlCod, T2.BarRdoN, T3.CliAlias," ;
      scmdbuf += " T3.CliNom, T2.CliCod, T2.BarSer, T2.BarSerDsc, T1.ExHdrCnR, T1.ExHdrKgR, T1.ExHdrMtR, T1.EmprCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T4.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes, T2.BarDisNum, T2.BarEncCli, T1.ExHdrLin FROM (((TXPLEXMVH T1" ;
      scmdbuf += " LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod =" ;
      scmdbuf += " T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ManCod = ?)");
      addWhere(sWhereString, "(T1.ExHdrFas = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeR >= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124UFecha2)) )
      {
         addWhere(sWhereString, "(T1.ExHdrFeR <= ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrTip" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P0AC25( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV114Pman ,
                                          short AV126Uman2 ,
                                          short A2248ManCod ,
                                          String A396EmprCod ,
                                          int AV116SalExtAlb ,
                                          int AV25BarCod ,
                                          byte AV27BarCodReo ,
                                          String AV26BarCodPar ,
                                          int A2253SalExtAlb ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[7];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ManCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExtAlb, T1.SalExtEsB, T1.SalExtFt FROM (TXPLEXTSA T1 INNER JOIN TXPCEXTSA T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.SalExtAlb = T1.SalExtAlb)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV114Pman) )
      {
         addWhere(sWhereString, "(T2.ManCod >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV126Uman2) )
      {
         addWhere(sWhereString, "(T2.ManCod <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P0AC22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P0AC24(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] );
            case 2 :
                  return conditional_P0AC25(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AC22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AC24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AC25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((int[]) buf[19])[0] = rslt.getInt(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 16);
               ((String[]) buf[22])[0] = rslt.getString(16, 26);
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[32])[0] = rslt.getShort(23);
               ((String[]) buf[33])[0] = rslt.getString(24, 1);
               ((int[]) buf[34])[0] = rslt.getInt(25);
               ((String[]) buf[35])[0] = rslt.getString(26, 8);
               ((String[]) buf[36])[0] = rslt.getString(27, 20);
               ((int[]) buf[37])[0] = rslt.getInt(28);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

