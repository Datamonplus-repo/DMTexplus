package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phtmlex2 extends GXProcedure
{
   public phtmlex2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phtmlex2.class ), "" );
   }

   public phtmlex2( int remoteHandle ,
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
      phtmlex2.this.aP9 = new String[] {""};
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
      phtmlex2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phtmlex2.this.AV226Pman = aP1[0];
      this.aP1 = aP1;
      phtmlex2.this.AV238Uman2 = aP2[0];
      this.aP2 = aP2;
      phtmlex2.this.AV225PAlbFch = aP3[0];
      this.aP3 = aP3;
      phtmlex2.this.AV236UFecha2 = aP4[0];
      this.aP4 = aP4;
      phtmlex2.this.AV227POpe = aP5[0];
      this.aP5 = aP5;
      phtmlex2.this.AV240UOpe2 = aP6[0];
      this.aP6 = aP6;
      phtmlex2.this.AV234Trab = aP7[0];
      this.aP7 = aP7;
      phtmlex2.this.aP8 = aP8;
      phtmlex2.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV263Erfoc) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      phtmlex2.this.GXt_int1 = GXv_int2[0] ;
      AV263Erfoc = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV261CellCol = 1 ;
      AV259CellRow = 3 ;
      AV246Fas = (byte)(0) ;
      /* Using cursor P04OD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV226Pman), AV227POpe, AV240UOpe2, Short.valueOf(AV238Uman2)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk4OD2 = false ;
         A2249ManNom = P04OD2_A2249ManNom[0] ;
         n2249ManNom = P04OD2_n2249ManNom[0] ;
         A2248ManCod = P04OD2_A2248ManCod[0] ;
         A2691ExHdrUln = P04OD2_A2691ExHdrUln[0] ;
         n2691ExHdrUln = P04OD2_n2691ExHdrUln[0] ;
         A2689ExHdrFas = P04OD2_A2689ExHdrFas[0] ;
         A2249ManNom = P04OD2_A2249ManNom[0] ;
         n2249ManNom = P04OD2_n2249ManNom[0] ;
         AV220ManCod = A2248ManCod ;
         AV221ManNom = A2249ManNom ;
         AV248Manf = (byte)(0) ;
         AV207FlagL = (byte)(0) ;
         AV208FlagM = (byte)(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P04OD2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P04OD2_A2248ManCod[0] == A2248ManCod ) )
         {
            brk4OD2 = false ;
            A2249ManNom = P04OD2_A2249ManNom[0] ;
            n2249ManNom = P04OD2_n2249ManNom[0] ;
            A2691ExHdrUln = P04OD2_A2691ExHdrUln[0] ;
            n2691ExHdrUln = P04OD2_n2691ExHdrUln[0] ;
            A2689ExHdrFas = P04OD2_A2689ExHdrFas[0] ;
            A2249ManNom = P04OD2_A2249ManNom[0] ;
            n2249ManNom = P04OD2_n2249ManNom[0] ;
            if ( GXutil.strcmp(A2689ExHdrFas, AV240UOpe2) <= 0 )
            {
               if ( GXutil.strcmp(A2689ExHdrFas, AV227POpe) >= 0 )
               {
                  if ( ( A2248ManCod >= AV226Pman ) && ( A2248ManCod <= AV238Uman2 ) )
                  {
                     AV204FechaE = GXutil.nullDate() ;
                     AV205FechaR = GXutil.nullDate() ;
                     AV209FlagO = (byte)(0) ;
                     AV246Fas = (byte)(0) ;
                     AV247Fascod = A2689ExHdrFas ;
                     GXv_char3[0] = AV164fasdsc ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A2689ExHdrFas, GXv_char3) ;
                     phtmlex2.this.AV164fasdsc = GXv_char3[0] ;
                     /* Using cursor P04OD4 */
                     pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, AV225PAlbFch, AV236UFecha2});
                     while ( (pr_default.getStatus(1) != 101) )
                     {
                        brk4OD4 = false ;
                        A130BarCodPar = P04OD4_A130BarCodPar[0] ;
                        n130BarCodPar = P04OD4_n130BarCodPar[0] ;
                        A132BarCodReo = P04OD4_A132BarCodReo[0] ;
                        n132BarCodReo = P04OD4_n132BarCodReo[0] ;
                        A129BarCod = P04OD4_A129BarCod[0] ;
                        n129BarCod = P04OD4_n129BarCod[0] ;
                        A2700ExHdrFeR = P04OD4_A2700ExHdrFeR[0] ;
                        n2700ExHdrFeR = P04OD4_n2700ExHdrFeR[0] ;
                        A2693ExHdrTip = P04OD4_A2693ExHdrTip[0] ;
                        n2693ExHdrTip = P04OD4_n2693ExHdrTip[0] ;
                        A2694ExHdrAlb = P04OD4_A2694ExHdrAlb[0] ;
                        n2694ExHdrAlb = P04OD4_n2694ExHdrAlb[0] ;
                        A228BarUniMed = P04OD4_A228BarUniMed[0] ;
                        A143BarDisNum = P04OD4_A143BarDisNum[0] ;
                        A4609BarMdlCod = P04OD4_A4609BarMdlCod[0] ;
                        A4812BarEncCli = P04OD4_A4812BarEncCli[0] ;
                        A279CliNom = P04OD4_A279CliNom[0] ;
                        A2748CliAlias = P04OD4_A2748CliAlias[0] ;
                        A252CliCod = P04OD4_A252CliCod[0] ;
                        n252CliCod = P04OD4_n252CliCod[0] ;
                        A212BarSer = P04OD4_A212BarSer[0] ;
                        A1652BarSerDsc = P04OD4_A1652BarSerDsc[0] ;
                        A2699ExHdrCnR = P04OD4_A2699ExHdrCnR[0] ;
                        n2699ExHdrCnR = P04OD4_n2699ExHdrCnR[0] ;
                        A2698ExHdrKgR = P04OD4_A2698ExHdrKgR[0] ;
                        n2698ExHdrKgR = P04OD4_n2698ExHdrKgR[0] ;
                        A2845ExHdrMtR = P04OD4_A2845ExHdrMtR[0] ;
                        n2845ExHdrMtR = P04OD4_n2845ExHdrMtR[0] ;
                        A166BarKgm = P04OD4_A166BarKgm[0] ;
                        A184BarMtr = P04OD4_A184BarMtr[0] ;
                        A199BarPie1 = P04OD4_A199BarPie1[0] ;
                        A365DisDes = P04OD4_A365DisDes[0] ;
                        A898BarPieNDes = P04OD4_A898BarPieNDes[0] ;
                        A2692ExHdrLin = P04OD4_A2692ExHdrLin[0] ;
                        A228BarUniMed = P04OD4_A228BarUniMed[0] ;
                        A143BarDisNum = P04OD4_A143BarDisNum[0] ;
                        A4609BarMdlCod = P04OD4_A4609BarMdlCod[0] ;
                        A4812BarEncCli = P04OD4_A4812BarEncCli[0] ;
                        A252CliCod = P04OD4_A252CliCod[0] ;
                        n252CliCod = P04OD4_n252CliCod[0] ;
                        A212BarSer = P04OD4_A212BarSer[0] ;
                        A1652BarSerDsc = P04OD4_A1652BarSerDsc[0] ;
                        A365DisDes = P04OD4_A365DisDes[0] ;
                        A279CliNom = P04OD4_A279CliNom[0] ;
                        A2748CliAlias = P04OD4_A2748CliAlias[0] ;
                        A166BarKgm = P04OD4_A166BarKgm[0] ;
                        A184BarMtr = P04OD4_A184BarMtr[0] ;
                        A199BarPie1 = P04OD4_A199BarPie1[0] ;
                        A898BarPieNDes = P04OD4_A898BarPieNDes[0] ;
                        if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                        {
                           A198BarPie = A898BarPieNDes ;
                        }
                        else
                        {
                           A198BarPie = A199BarPie1 ;
                        }
                        AV233TotKgsR = DecimalUtil.ZERO ;
                        AV254Numv = (short)(0) ;
                        while ( (pr_default.getStatus(1) != 101) && ( P04OD4_A129BarCod[0] == A129BarCod ) && ( P04OD4_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P04OD4_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P04OD4_A2693ExHdrTip[0], A2693ExHdrTip) == 0 ) )
                        {
                           brk4OD4 = false ;
                           A2700ExHdrFeR = P04OD4_A2700ExHdrFeR[0] ;
                           n2700ExHdrFeR = P04OD4_n2700ExHdrFeR[0] ;
                           A2692ExHdrLin = P04OD4_A2692ExHdrLin[0] ;
                           if ( GXutil.strcmp(P04OD4_A396EmprCod[0], A396EmprCod) == 0 )
                           {
                              if ( P04OD4_A2248ManCod[0] == A2248ManCod )
                              {
                                 if ( GXutil.strcmp(P04OD4_A2689ExHdrFas[0], A2689ExHdrFas) == 0 )
                                 {
                                    if ( ( A2248ManCod >= AV226Pman ) && ( A2248ManCod <= AV238Uman2 ) )
                                    {
                                       if ( ( GXutil.strcmp(A2689ExHdrFas, AV227POpe) >= 0 ) && ( GXutil.strcmp(A2689ExHdrFas, AV240UOpe2) <= 0 ) )
                                       {
                                          if ( (( GXutil.resetTime(A2700ExHdrFeR).after( GXutil.resetTime( AV225PAlbFch )) ) || ( GXutil.dateCompare(GXutil.resetTime(A2700ExHdrFeR), GXutil.resetTime(AV225PAlbFch)) )) && (( GXutil.resetTime(A2700ExHdrFeR).before( GXutil.resetTime( AV236UFecha2 )) ) || ( GXutil.dateCompare(GXutil.resetTime(A2700ExHdrFeR), GXutil.resetTime(AV236UFecha2)) )) )
                                          {
                                             AV254Numv = (short)(AV254Numv+1) ;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                           brk4OD4 = true ;
                           pr_default.readNext(1);
                        }
                        AV137BarCod = A129BarCod ;
                        AV139BarCodReo = A132BarCodReo ;
                        AV138BarCodPar = A130BarCodPar ;
                        AV228SalExtAlb = A2694ExHdrAlb ;
                        AV245BarUnimed = A228BarUniMed ;
                        AV244Barenccli = A143BarDisNum ;
                        AV252Barmdlcod = A4609BarMdlCod ;
                        AV244Barenccli = ((GXutil.strcmp("", A143BarDisNum)==0) ? A4812BarEncCli : AV244Barenccli) ;
                        /* Execute user subroutine: 'LEOSTA' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(1);
                           pr_default.close(1);
                           pr_default.close(1);
                           pr_default.close(1);
                           pr_default.close(0);
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        if ( ( ( GXutil.strcmp(AV234Trab, "A") == 0 ) && ( ( AV229SalExtEsB == 1 ) || (0==AV229SalExtEsB) ) ) || ( ( GXutil.strcmp(AV234Trab, "C") == 0 ) && ( AV229SalExtEsB == 2 ) ) || ( ( GXutil.strcmp(AV234Trab, "T") == 0 ) ) )
                        {
                           AV212HojaRuta = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + " " + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                           AV223NomCli = (!(GXutil.strcmp("", A2748CliAlias)==0) ? A2748CliAlias : GXutil.substring( A279CliNom, 1, 16)) ;
                           GXv_date4[0] = AV243EXHDRFEE ;
                           GXv_decimal5[0] = AV200EXHDRKGE ;
                           GXv_decimal6[0] = AV201EXHDRMTE ;
                           GXv_int7[0] = AV242EXHDRCNE ;
                           new app.trabajosexternos.pexpr01(remoteHandle, context).execute( A396EmprCod, A2248ManCod, A2689ExHdrFas, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_date4, GXv_decimal5, GXv_decimal6, GXv_int7) ;
                           phtmlex2.this.AV243EXHDRFEE = GXv_date4[0] ;
                           phtmlex2.this.AV200EXHDRKGE = GXv_decimal5[0] ;
                           phtmlex2.this.AV201EXHDRMTE = GXv_decimal6[0] ;
                           phtmlex2.this.AV242EXHDRCNE = GXv_int7[0] ;
                           AV204FechaE = AV243EXHDRFEE ;
                           AV121Texto = A2249ManNom ;
                           AV257ExcelDocument.Cells(AV259CellRow, 1, 1, 1).setText( AV121Texto );
                           AV121Texto = AV164fasdsc ;
                           AV257ExcelDocument.Cells(AV259CellRow, 2, 1, 1).setText( AV121Texto );
                           AV121Texto = AV212HojaRuta ;
                           AV257ExcelDocument.Cells(AV259CellRow, 3, 1, 1).setText( AV121Texto );
                           AV121Texto = AV244Barenccli ;
                           AV257ExcelDocument.Cells(AV259CellRow, 4, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A252CliCod, 6, 0) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 5, 1, 1).setText( AV121Texto );
                           AV121Texto = AV223NomCli ;
                           AV257ExcelDocument.Cells(AV259CellRow, 6, 1, 1).setText( AV121Texto );
                           AV121Texto = A212BarSer ;
                           AV257ExcelDocument.Cells(AV259CellRow, 7, 1, 1).setText( AV121Texto );
                           AV121Texto = A1652BarSerDsc ;
                           AV257ExcelDocument.Cells(AV259CellRow, 8, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( AV228SalExtAlb, 8, 0) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 9, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A198BarPie, 6, 0) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 10, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A166BarKgm, 9, 2) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 11, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A184BarMtr, 9, 2) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 12, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( AV242EXHDRCNE, 4, 0) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 13, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( AV200EXHDRKGE, 9, 2) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 14, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( AV201EXHDRMTE, 9, 2) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 15, 1, 1).setText( AV121Texto );
                           AV121Texto = localUtil.dtoc( AV243EXHDRFEE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                           AV257ExcelDocument.Cells(AV259CellRow, 16, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A2699ExHdrCnR, 4, 0) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 17, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A2698ExHdrKgR, 9, 2) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 18, 1, 1).setText( AV121Texto );
                           AV121Texto = GXutil.str( A2845ExHdrMtR, 9, 2) ;
                           AV257ExcelDocument.Cells(AV259CellRow, 19, 1, 1).setText( AV121Texto );
                           AV121Texto = localUtil.dtoc( A2700ExHdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                           AV257ExcelDocument.Cells(AV259CellRow, 20, 1, 1).setText( AV121Texto );
                           AV205FechaR = A2700ExHdrFeR ;
                           AV233TotKgsR = AV233TotKgsR.add(A2698ExHdrKgR) ;
                           AV251TotMtsr = AV251TotMtsr.add(A2845ExHdrMtR) ;
                           AV232TotConR = (short)(AV232TotConR+A2699ExHdrCnR) ;
                           AV207FlagL = (byte)(1) ;
                        }
                        AV198DifKgs = DecimalUtil.ZERO ;
                        AV222MerKgs = DecimalUtil.ZERO ;
                        AV197DiasSer = (short)(0) ;
                        if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV233TotKgsR)==0) && ( GXutil.strcmp(AV245BarUnimed, httpContext.getMessage( "K", "")) == 0 ) )
                        {
                           AV198DifKgs = AV200EXHDRKGE.subtract(AV233TotKgsR) ;
                           AV222MerKgs = ((AV233TotKgsR.subtract(AV200EXHDRKGE)).divide(AV200EXHDRKGE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
                           AV197DiasSer = (short)(GXutil.ddiff(AV205FechaR,AV204FechaE)) ;
                        }
                        if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV251TotMtsr)==0) && ( GXutil.strcmp(AV245BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
                        {
                           AV198DifKgs = AV201EXHDRMTE.subtract(AV251TotMtsr) ;
                           AV222MerKgs = ((AV251TotMtsr.subtract(AV201EXHDRMTE)).divide(AV201EXHDRMTE, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
                           AV197DiasSer = (short)(GXutil.ddiff(AV205FechaR,AV204FechaE)) ;
                        }
                        AV121Texto = GXutil.str( AV198DifKgs, 9, 2) ;
                        AV257ExcelDocument.Cells(AV259CellRow, 21, 1, 1).setText( AV121Texto );
                        AV121Texto = GXutil.str( AV222MerKgs, 6, 2) ;
                        AV257ExcelDocument.Cells(AV259CellRow, 22, 1, 1).setText( AV121Texto );
                        AV121Texto = GXutil.str( AV197DiasSer, 3, 0) ;
                        AV257ExcelDocument.Cells(AV259CellRow, 23, 1, 1).setText( AV121Texto );
                        AV121Texto = AV245BarUnimed ;
                        AV257ExcelDocument.Cells(AV259CellRow, 24, 1, 1).setText( AV121Texto );
                        AV121Texto = AV230Sta ;
                        AV257ExcelDocument.Cells(AV259CellRow, 25, 1, 1).setText( AV121Texto );
                        if ( AV263Erfoc == 1 )
                        {
                           AV121Texto = AV252Barmdlcod ;
                           AV257ExcelDocument.Cells(AV259CellRow, 26, 1, 1).setText( AV121Texto );
                        }
                        AV233TotKgsR = DecimalUtil.ZERO ;
                        AV251TotMtsr = DecimalUtil.ZERO ;
                        AV232TotConR = (short)(0) ;
                        AV121Texto = GXutil.str( AV254Numv, 4, 0) ;
                        AV257ExcelDocument.Cells(AV259CellRow, 27, 1, 1).setText( AV121Texto );
                        AV259CellRow = (int)(AV259CellRow+1) ;
                        if ( ! brk4OD4 )
                        {
                           brk4OD4 = true ;
                           pr_default.readNext(1);
                        }
                     }
                     pr_default.close(1);
                  }
               }
            }
            brk4OD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk4OD2 )
         {
            brk4OD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LEOSTA' Routine */
      returnInSub = false ;
      AV230Sta = "" ;
      AV229SalExtEsB = (byte)(0) ;
      AV249SalExtFen = GXutil.nullDate() ;
      /* Using cursor P04OD5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV228SalExtAlb), Integer.valueOf(AV137BarCod), Byte.valueOf(AV139BarCodReo), AV138BarCodPar, Short.valueOf(AV226Pman), Short.valueOf(AV238Uman2)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2248ManCod = P04OD5_A2248ManCod[0] ;
         A130BarCodPar = P04OD5_A130BarCodPar[0] ;
         n130BarCodPar = P04OD5_n130BarCodPar[0] ;
         A132BarCodReo = P04OD5_A132BarCodReo[0] ;
         n132BarCodReo = P04OD5_n132BarCodReo[0] ;
         A129BarCod = P04OD5_A129BarCod[0] ;
         n129BarCod = P04OD5_n129BarCod[0] ;
         A2253SalExtAlb = P04OD5_A2253SalExtAlb[0] ;
         A2262SalExtEsB = P04OD5_A2262SalExtEsB[0] ;
         n2262SalExtEsB = P04OD5_n2262SalExtEsB[0] ;
         A11317SalExtFt = P04OD5_A11317SalExtFt[0] ;
         n11317SalExtFt = P04OD5_n11317SalExtFt[0] ;
         A2248ManCod = P04OD5_A2248ManCod[0] ;
         AV229SalExtEsB = A2262SalExtEsB ;
         AV249SalExtFen = A11317SalExtFt ;
         if ( ( A2262SalExtEsB == 1 ) || (0==A2262SalExtEsB) )
         {
            AV230Sta = "A" ;
         }
         if ( A2262SalExtEsB == 2 )
         {
            AV230Sta = "C" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV255Random = (int)(GXutil.random( )*10000) ;
      AV256Filename = "InformeTrabajosExternosRecepcionados-" + GXutil.trim( GXutil.str( AV255Random, 8, 0)) + ".xlsx" ;
      AV257ExcelDocument.Open(AV256Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if (returnInSub) return;
      AV257ExcelDocument.Clear();
   }

   public void S141( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV257ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S131 ();
      if (returnInSub) return;
      AV257ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV257ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Envio", "") );
      AV257ExcelDocument.Cells(1, 13, 1, 1).setBold( (short)(1) );
      AV257ExcelDocument.Cells(1, 13, 1, 1).setColor( 11 );
      AV257ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Recepcion", "") );
      AV257ExcelDocument.Cells(1, 17, 1, 1).setBold( (short)(1) );
      AV257ExcelDocument.Cells(1, 17, 1, 1).setColor( 11 );
      while ( AV241i <= 27 )
      {
         AV257ExcelDocument.Cells(2, AV241i, 1, 1).setBold( (short)(1) );
         AV257ExcelDocument.Cells(2, AV241i, 1, 1).setColor( 11 );
         AV241i = (short)(AV241i+1) ;
      }
      AV257ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Manufacturador", "") );
      AV257ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV257ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV257ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Ped Cli", "") );
      AV257ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV257ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV257ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV257ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV257ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "N Albaran", "") );
      AV257ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV257ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV257ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV257ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV257ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV257ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV257ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV257ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV257ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV257ExcelDocument.Cells(2, 19, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV257ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV257ExcelDocument.Cells(2, 21, 1, 1).setText( httpContext.getMessage( "Diferencia", "") );
      AV257ExcelDocument.Cells(2, 22, 1, 1).setText( httpContext.getMessage( "% Merma", "") );
      AV257ExcelDocument.Cells(2, 23, 1, 1).setText( httpContext.getMessage( "Dias", "") );
      AV257ExcelDocument.Cells(2, 24, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV257ExcelDocument.Cells(2, 25, 1, 1).setText( httpContext.getMessage( "St", "") );
      if ( AV263Erfoc == 1 )
      {
         AV257ExcelDocument.Cells(2, 26, 1, 1).setText( httpContext.getMessage( "Modelo", "") );
      }
   }

   public void S131( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV257ExcelDocument.getErrCode() != 0 )
      {
         AV256Filename = "" ;
         AV258ErrorMessage = AV257ExcelDocument.getErrDescription() ;
         AV257ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = phtmlex2.this.A396EmprCod;
      this.aP1[0] = phtmlex2.this.AV226Pman;
      this.aP2[0] = phtmlex2.this.AV238Uman2;
      this.aP3[0] = phtmlex2.this.AV225PAlbFch;
      this.aP4[0] = phtmlex2.this.AV236UFecha2;
      this.aP5[0] = phtmlex2.this.AV227POpe;
      this.aP6[0] = phtmlex2.this.AV240UOpe2;
      this.aP7[0] = phtmlex2.this.AV234Trab;
      this.aP8[0] = phtmlex2.this.AV256Filename;
      this.aP9[0] = phtmlex2.this.AV258ErrorMessage;
      CloseOpenCursors();
      AV257ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV256Filename = "" ;
      AV258ErrorMessage = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P04OD2_A396EmprCod = new String[] {""} ;
      P04OD2_A2249ManNom = new String[] {""} ;
      P04OD2_n2249ManNom = new boolean[] {false} ;
      P04OD2_A2248ManCod = new short[1] ;
      P04OD2_A2691ExHdrUln = new int[1] ;
      P04OD2_n2691ExHdrUln = new boolean[] {false} ;
      P04OD2_A2689ExHdrFas = new String[] {""} ;
      A2249ManNom = "" ;
      A2689ExHdrFas = "" ;
      AV221ManNom = "" ;
      AV204FechaE = GXutil.nullDate() ;
      AV205FechaR = GXutil.nullDate() ;
      AV247Fascod = "" ;
      AV164fasdsc = "" ;
      GXv_char3 = new String[1] ;
      P04OD4_A396EmprCod = new String[] {""} ;
      P04OD4_A2248ManCod = new short[1] ;
      P04OD4_A2689ExHdrFas = new String[] {""} ;
      P04OD4_A130BarCodPar = new String[] {""} ;
      P04OD4_n130BarCodPar = new boolean[] {false} ;
      P04OD4_A132BarCodReo = new byte[1] ;
      P04OD4_n132BarCodReo = new boolean[] {false} ;
      P04OD4_A129BarCod = new int[1] ;
      P04OD4_n129BarCod = new boolean[] {false} ;
      P04OD4_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P04OD4_n2700ExHdrFeR = new boolean[] {false} ;
      P04OD4_A2693ExHdrTip = new String[] {""} ;
      P04OD4_n2693ExHdrTip = new boolean[] {false} ;
      P04OD4_A2694ExHdrAlb = new int[1] ;
      P04OD4_n2694ExHdrAlb = new boolean[] {false} ;
      P04OD4_A228BarUniMed = new String[] {""} ;
      P04OD4_A143BarDisNum = new String[] {""} ;
      P04OD4_A4609BarMdlCod = new String[] {""} ;
      P04OD4_A4812BarEncCli = new String[] {""} ;
      P04OD4_A279CliNom = new String[] {""} ;
      P04OD4_A2748CliAlias = new String[] {""} ;
      P04OD4_A252CliCod = new int[1] ;
      P04OD4_n252CliCod = new boolean[] {false} ;
      P04OD4_A212BarSer = new String[] {""} ;
      P04OD4_A1652BarSerDsc = new String[] {""} ;
      P04OD4_A2699ExHdrCnR = new short[1] ;
      P04OD4_n2699ExHdrCnR = new boolean[] {false} ;
      P04OD4_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04OD4_n2698ExHdrKgR = new boolean[] {false} ;
      P04OD4_A2845ExHdrMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04OD4_n2845ExHdrMtR = new boolean[] {false} ;
      P04OD4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04OD4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04OD4_A199BarPie1 = new short[1] ;
      P04OD4_A365DisDes = new String[] {""} ;
      P04OD4_A898BarPieNDes = new int[1] ;
      P04OD4_A2692ExHdrLin = new int[1] ;
      A130BarCodPar = "" ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2693ExHdrTip = "" ;
      A228BarUniMed = "" ;
      A143BarDisNum = "" ;
      A4609BarMdlCod = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A2748CliAlias = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A2845ExHdrMtR = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV233TotKgsR = DecimalUtil.ZERO ;
      AV138BarCodPar = "" ;
      AV245BarUnimed = "" ;
      AV244Barenccli = "" ;
      AV252Barmdlcod = "" ;
      AV212HojaRuta = "" ;
      AV223NomCli = "" ;
      AV243EXHDRFEE = GXutil.nullDate() ;
      GXv_date4 = new java.util.Date[1] ;
      AV200EXHDRKGE = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV201EXHDRMTE = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new short[1] ;
      AV121Texto = "" ;
      AV257ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV251TotMtsr = DecimalUtil.ZERO ;
      AV198DifKgs = DecimalUtil.ZERO ;
      AV222MerKgs = DecimalUtil.ZERO ;
      AV230Sta = "" ;
      AV249SalExtFen = GXutil.nullDate() ;
      P04OD5_A396EmprCod = new String[] {""} ;
      P04OD5_A2248ManCod = new short[1] ;
      P04OD5_A130BarCodPar = new String[] {""} ;
      P04OD5_n130BarCodPar = new boolean[] {false} ;
      P04OD5_A132BarCodReo = new byte[1] ;
      P04OD5_n132BarCodReo = new boolean[] {false} ;
      P04OD5_A129BarCod = new int[1] ;
      P04OD5_n129BarCod = new boolean[] {false} ;
      P04OD5_A2253SalExtAlb = new int[1] ;
      P04OD5_A2262SalExtEsB = new byte[1] ;
      P04OD5_n2262SalExtEsB = new boolean[] {false} ;
      P04OD5_A11317SalExtFt = new java.util.Date[] {GXutil.nullDate()} ;
      P04OD5_n11317SalExtFt = new boolean[] {false} ;
      A11317SalExtFt = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phtmlex2__default(),
         new Object[] {
             new Object[] {
            P04OD2_A396EmprCod, P04OD2_A2249ManNom, P04OD2_n2249ManNom, P04OD2_A2248ManCod, P04OD2_A2691ExHdrUln, P04OD2_n2691ExHdrUln, P04OD2_A2689ExHdrFas
            }
            , new Object[] {
            P04OD4_A396EmprCod, P04OD4_A2248ManCod, P04OD4_A2689ExHdrFas, P04OD4_A130BarCodPar, P04OD4_n130BarCodPar, P04OD4_A132BarCodReo, P04OD4_n132BarCodReo, P04OD4_A129BarCod, P04OD4_n129BarCod, P04OD4_A2700ExHdrFeR,
            P04OD4_n2700ExHdrFeR, P04OD4_A2693ExHdrTip, P04OD4_n2693ExHdrTip, P04OD4_A2694ExHdrAlb, P04OD4_n2694ExHdrAlb, P04OD4_A228BarUniMed, P04OD4_A143BarDisNum, P04OD4_A4609BarMdlCod, P04OD4_A4812BarEncCli, P04OD4_A279CliNom,
            P04OD4_A2748CliAlias, P04OD4_A252CliCod, P04OD4_n252CliCod, P04OD4_A212BarSer, P04OD4_A1652BarSerDsc, P04OD4_A2699ExHdrCnR, P04OD4_n2699ExHdrCnR, P04OD4_A2698ExHdrKgR, P04OD4_n2698ExHdrKgR, P04OD4_A2845ExHdrMtR,
            P04OD4_n2845ExHdrMtR, P04OD4_A166BarKgm, P04OD4_A184BarMtr, P04OD4_A199BarPie1, P04OD4_A365DisDes, P04OD4_A898BarPieNDes, P04OD4_A2692ExHdrLin
            }
            , new Object[] {
            P04OD5_A396EmprCod, P04OD5_A2248ManCod, P04OD5_A130BarCodPar, P04OD5_A132BarCodReo, P04OD5_A129BarCod, P04OD5_A2253SalExtAlb, P04OD5_A2262SalExtEsB, P04OD5_n2262SalExtEsB, P04OD5_A11317SalExtFt, P04OD5_n11317SalExtFt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV246Fas ;
   private byte AV248Manf ;
   private byte AV207FlagL ;
   private byte AV208FlagM ;
   private byte AV209FlagO ;
   private byte A132BarCodReo ;
   private byte AV139BarCodReo ;
   private byte AV229SalExtEsB ;
   private byte A2262SalExtEsB ;
   private short AV226Pman ;
   private short AV238Uman2 ;
   private short AV263Erfoc ;
   private short A2248ManCod ;
   private short AV220ManCod ;
   private short A2699ExHdrCnR ;
   private short A199BarPie1 ;
   private short AV254Numv ;
   private short AV242EXHDRCNE ;
   private short GXv_int7[] ;
   private short AV232TotConR ;
   private short AV197DiasSer ;
   private short AV241i ;
   private short Gx_err ;
   private int AV261CellCol ;
   private int AV259CellRow ;
   private int A2691ExHdrUln ;
   private int A129BarCod ;
   private int A2694ExHdrAlb ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A2692ExHdrLin ;
   private int A198BarPie ;
   private int AV137BarCod ;
   private int AV228SalExtAlb ;
   private int A2253SalExtAlb ;
   private int AV255Random ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal A2845ExHdrMtR ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV233TotKgsR ;
   private java.math.BigDecimal AV200EXHDRKGE ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV201EXHDRMTE ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV251TotMtsr ;
   private java.math.BigDecimal AV198DifKgs ;
   private java.math.BigDecimal AV222MerKgs ;
   private String A396EmprCod ;
   private String AV227POpe ;
   private String AV240UOpe2 ;
   private String AV234Trab ;
   private String scmdbuf ;
   private String A2249ManNom ;
   private String A2689ExHdrFas ;
   private String AV221ManNom ;
   private String AV247Fascod ;
   private String AV164fasdsc ;
   private String GXv_char3[] ;
   private String A130BarCodPar ;
   private String A2693ExHdrTip ;
   private String A228BarUniMed ;
   private String A143BarDisNum ;
   private String A4609BarMdlCod ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A2748CliAlias ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private String AV138BarCodPar ;
   private String AV245BarUnimed ;
   private String AV244Barenccli ;
   private String AV252Barmdlcod ;
   private String AV212HojaRuta ;
   private String AV223NomCli ;
   private String AV121Texto ;
   private String AV230Sta ;
   private java.util.Date AV225PAlbFch ;
   private java.util.Date AV236UFecha2 ;
   private java.util.Date AV204FechaE ;
   private java.util.Date AV205FechaR ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV243EXHDRFEE ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date AV249SalExtFen ;
   private java.util.Date A11317SalExtFt ;
   private boolean returnInSub ;
   private boolean brk4OD2 ;
   private boolean n2249ManNom ;
   private boolean n2691ExHdrUln ;
   private boolean brk4OD4 ;
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
   private String AV256Filename ;
   private String AV258ErrorMessage ;
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
   private String[] P04OD2_A396EmprCod ;
   private String[] P04OD2_A2249ManNom ;
   private boolean[] P04OD2_n2249ManNom ;
   private short[] P04OD2_A2248ManCod ;
   private int[] P04OD2_A2691ExHdrUln ;
   private boolean[] P04OD2_n2691ExHdrUln ;
   private String[] P04OD2_A2689ExHdrFas ;
   private String[] P04OD4_A396EmprCod ;
   private short[] P04OD4_A2248ManCod ;
   private String[] P04OD4_A2689ExHdrFas ;
   private String[] P04OD4_A130BarCodPar ;
   private boolean[] P04OD4_n130BarCodPar ;
   private byte[] P04OD4_A132BarCodReo ;
   private boolean[] P04OD4_n132BarCodReo ;
   private int[] P04OD4_A129BarCod ;
   private boolean[] P04OD4_n129BarCod ;
   private java.util.Date[] P04OD4_A2700ExHdrFeR ;
   private boolean[] P04OD4_n2700ExHdrFeR ;
   private String[] P04OD4_A2693ExHdrTip ;
   private boolean[] P04OD4_n2693ExHdrTip ;
   private int[] P04OD4_A2694ExHdrAlb ;
   private boolean[] P04OD4_n2694ExHdrAlb ;
   private String[] P04OD4_A228BarUniMed ;
   private String[] P04OD4_A143BarDisNum ;
   private String[] P04OD4_A4609BarMdlCod ;
   private String[] P04OD4_A4812BarEncCli ;
   private String[] P04OD4_A279CliNom ;
   private String[] P04OD4_A2748CliAlias ;
   private int[] P04OD4_A252CliCod ;
   private boolean[] P04OD4_n252CliCod ;
   private String[] P04OD4_A212BarSer ;
   private String[] P04OD4_A1652BarSerDsc ;
   private short[] P04OD4_A2699ExHdrCnR ;
   private boolean[] P04OD4_n2699ExHdrCnR ;
   private java.math.BigDecimal[] P04OD4_A2698ExHdrKgR ;
   private boolean[] P04OD4_n2698ExHdrKgR ;
   private java.math.BigDecimal[] P04OD4_A2845ExHdrMtR ;
   private boolean[] P04OD4_n2845ExHdrMtR ;
   private java.math.BigDecimal[] P04OD4_A166BarKgm ;
   private java.math.BigDecimal[] P04OD4_A184BarMtr ;
   private short[] P04OD4_A199BarPie1 ;
   private String[] P04OD4_A365DisDes ;
   private int[] P04OD4_A898BarPieNDes ;
   private int[] P04OD4_A2692ExHdrLin ;
   private String[] P04OD5_A396EmprCod ;
   private short[] P04OD5_A2248ManCod ;
   private String[] P04OD5_A130BarCodPar ;
   private boolean[] P04OD5_n130BarCodPar ;
   private byte[] P04OD5_A132BarCodReo ;
   private boolean[] P04OD5_n132BarCodReo ;
   private int[] P04OD5_A129BarCod ;
   private boolean[] P04OD5_n129BarCod ;
   private int[] P04OD5_A2253SalExtAlb ;
   private byte[] P04OD5_A2262SalExtEsB ;
   private boolean[] P04OD5_n2262SalExtEsB ;
   private java.util.Date[] P04OD5_A11317SalExtFt ;
   private boolean[] P04OD5_n11317SalExtFt ;
   private com.genexus.gxoffice.ExcelDoc AV257ExcelDocument ;
}

final  class phtmlex2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04OD2", "SELECT T1.EmprCod, T2.ManNom, T1.ManCod, T1.ExHdrUln, T1.ExHdrFas FROM (TXPCEXMVH T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod) WHERE (T1.EmprCod = ? and T1.ManCod >= ? and T1.ExHdrFas >= ?) AND (T1.ExHdrFas <= ?) AND (T1.ManCod <= ?) ORDER BY T1.EmprCod, T1.ManCod, T1.ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OD4", "SELECT T1.EmprCod, T1.ManCod, T1.ExHdrFas, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ExHdrFeR, T1.ExHdrTip, T1.ExHdrAlb, T2.BarUniMed, T2.BarDisNum, T2.BarMdlCod, T2.BarEncCli, T3.CliNom, T3.CliAlias, T2.CliCod, T2.BarSer, T2.BarSerDsc, T1.ExHdrCnR, T1.ExHdrKgR, T1.ExHdrMtR, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr, 0) AS BarMtr, COALESCE( T4.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T4.BarPieNDes, 0) AS BarPieNDes, T1.ExHdrLin FROM (((TXPLEXMVH T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.ManCod = ?) AND (T1.ExHdrFas = ?) AND (T1.ExHdrFeR >= ? and T1.ExHdrFeR <= ?) ORDER BY T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ExHdrTip ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04OD5", "SELECT T1.EmprCod, T2.ManCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExtAlb, T1.SalExtEsB, T1.SalExtFt FROM (TXPLEXTSA T1 INNER JOIN TXPCEXTSA T2 ON T2.EmprCod = T1.EmprCod AND T2.SalExtAlb = T1.SalExtAlb) WHERE (T1.EmprCod = ? and T1.SalExtAlb = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.ManCod >= ? and T2.ManCod <= ?) ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((String[]) buf[16])[0] = rslt.getString(11, 8);
               ((String[]) buf[17])[0] = rslt.getString(12, 13);
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 16);
               ((String[]) buf[24])[0] = rslt.getString(18, 26);
               ((short[]) buf[25])[0] = rslt.getShort(19);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[33])[0] = rslt.getShort(24);
               ((String[]) buf[34])[0] = rslt.getString(25, 1);
               ((int[]) buf[35])[0] = rslt.getInt(26);
               ((int[]) buf[36])[0] = rslt.getInt(27);
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
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

