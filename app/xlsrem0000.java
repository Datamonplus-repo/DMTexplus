package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class xlsrem0000 extends GXProcedure
{
   public xlsrem0000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( xlsrem0000.class ), "" );
   }

   public xlsrem0000( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 )
   {
      xlsrem0000.this.aP17 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 )
   {
      xlsrem0000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      xlsrem0000.this.AV9ImpCod = aP1[0];
      this.aP1 = aP1;
      xlsrem0000.this.AV11PCliente = aP2[0];
      this.aP2 = aP2;
      xlsrem0000.this.AV12UCliente = aP3[0];
      this.aP3 = aP3;
      xlsrem0000.this.AV13PFecha = aP4[0];
      this.aP4 = aP4;
      xlsrem0000.this.AV14UFecha = aP5[0];
      this.aP5 = aP5;
      xlsrem0000.this.AV31AlbRef_i = aP6[0];
      this.aP6 = aP6;
      xlsrem0000.this.AV32AlbRef_f = aP7[0];
      this.aP7 = aP7;
      xlsrem0000.this.AV52Albrenti = aP8[0];
      this.aP8 = aP8;
      xlsrem0000.this.AV53Albrentf = aP9[0];
      this.aP9 = aP9;
      xlsrem0000.this.AV57TipEntcodi = aP10[0];
      this.aP10 = aP10;
      xlsrem0000.this.AV58Tipartcod1 = aP11[0];
      this.aP11 = aP11;
      xlsrem0000.this.AV59Tipartcod2 = aP12[0];
      this.aP12 = aP12;
      xlsrem0000.this.AV60Estado_a = aP13[0];
      this.aP13 = aP13;
      xlsrem0000.this.AV79Albrent2i = aP14[0];
      this.aP14 = aP14;
      xlsrem0000.this.AV80Albrent2f = aP15[0];
      this.aP15 = aP15;
      xlsrem0000.this.AV73Filename = aP16[0];
      this.aP16 = aP16;
      xlsrem0000.this.AV77ErrorMessage = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV30ContDsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char2) ;
      xlsrem0000.this.GXt_char1 = GXv_char2[0] ;
      AV30ContDsc = GXt_char1 ;
      GXt_int3 = AV54Moda21 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int4) ;
      xlsrem0000.this.GXt_int3 = GXv_int4[0] ;
      AV54Moda21 = GXt_int3 ;
      GXt_int3 = AV55Cli350 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int4) ;
      xlsrem0000.this.GXt_int3 = GXv_int4[0] ;
      AV55Cli350 = GXt_int3 ;
      GXt_int5 = AV56ContVal ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int6) ;
      xlsrem0000.this.GXt_int5 = GXv_int6[0] ;
      AV56ContVal = GXt_int5 ;
      GXt_int3 = (byte)(AV78Enc20) ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int4) ;
      xlsrem0000.this.GXt_int3 = GXv_int4[0] ;
      AV78Enc20 = GXt_int3 ;
      AV61PAlbRest = (byte)(0) ;
      AV62UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV60Estado_a, "0") == 0 )
      {
         AV61PAlbRest = (byte)(0) ;
         AV62UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV60Estado_a, "1") == 0 )
      {
         AV61PAlbRest = (byte)(1) ;
         AV62UALbRest = (byte)(1) ;
      }
      /* Using cursor P08502 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P08502_A407EmprNom[0] ;
         n407EmprNom = P08502_n407EmprNom[0] ;
         AV10NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV71Random = (int)(GXutil.random( )*10000) ;
      AV73Filename = GXutil.trim( AV84Pgmdesc) + "_" + GXutil.trim( GXutil.str( AV71Random, 8, 0)) + ".xlsx" ;
      AV72ExcelDocument.Open(AV73Filename);
      if ( AV72ExcelDocument.getErrCode() != 0 )
      {
         AV73Filename = "" ;
         AV77ErrorMessage = AV72ExcelDocument.getErrDescription() ;
         AV72ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV72ExcelDocument.Clear();
      AV74Row = (short)(1) ;
      AV75Col = (short)(1) ;
      while ( AV75Col <= 11 )
      {
         AV72ExcelDocument.Cells(AV74Row, AV75Col, 1, 1).setBold( (short)(1) );
         AV72ExcelDocument.Cells(AV74Row, AV75Col, 1, 1).setColor( 11 );
         AV75Col = (short)(AV75Col+1) ;
      }
      AV72ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV72ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV72ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Referencia", "") );
      AV72ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV72ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Und", "") );
      AV72ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Und Ent", "") );
      AV72ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Pzs Ent", "") );
      AV72ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Und Uti", "") );
      AV72ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Pzs uti", "") );
      AV72ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Und Stock", "") );
      AV72ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Pzs Stock", "") );
      AV74Row = (short)(2) ;
      /* Using cursor P08503 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11PCliente), AV31AlbRef_i, AV13PFecha, AV14UFecha, AV32AlbRef_f, AV52Albrenti, AV53Albrentf, AV79Albrent2i, AV80Albrent2f, Short.valueOf(AV57TipEntcodi), Short.valueOf(AV57TipEntcodi), Short.valueOf(AV58Tipartcod1), Short.valueOf(AV59Tipartcod2), Byte.valueOf(AV61PAlbRest), Byte.valueOf(AV62UALbRest), Integer.valueOf(AV12UCliente)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8503 = false ;
         A49AlbRFen = P08503_A49AlbRFen[0] ;
         A45AlbRef = P08503_A45AlbRef[0] ;
         A46AlbREnt = P08503_A46AlbREnt[0] ;
         A5806AlbREnt2 = P08503_A5806AlbREnt2[0] ;
         A1211TipEntCod = P08503_A1211TipEntCod[0] ;
         n1211TipEntCod = P08503_n1211TipEntCod[0] ;
         A6263AlbRTartC = P08503_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08503_n6263AlbRTartC[0] ;
         A47AlbREst = P08503_A47AlbREst[0] ;
         A58AlbRUniEnt = P08503_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08503_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08503_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08503_A54AlbRPieUti[0] ;
         A970ProceCod = P08503_A970ProceCod[0] ;
         n970ProceCod = P08503_n970ProceCod[0] ;
         A4295ClasCod = P08503_A4295ClasCod[0] ;
         n4295ClasCod = P08503_n4295ClasCod[0] ;
         A252CliCod = P08503_A252CliCod[0] ;
         A3613AlbRefDsc = P08503_A3613AlbRefDsc[0] ;
         A56AlbRUni = P08503_A56AlbRUni[0] ;
         A279CliNom = P08503_A279CliNom[0] ;
         A44AlbRecCod = P08503_A44AlbRecCod[0] ;
         A279CliNom = P08503_A279CliNom[0] ;
         if ( ( AV54Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV55Cli350 == 1 ) && ( AV56ContVal == 1 ) )
         {
         }
         else
         {
            AV16ArtCod = A45AlbRef ;
            AV23ArtRef = A3613AlbRefDsc ;
            if ( (GXutil.strcmp("", AV23ArtRef)==0) || ( GXutil.strcmp(GXutil.trim( AV23ArtRef), "") == 0 ) )
            {
               /* Using cursor P08504 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV16ArtCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A10030ArtTh = P08504_A10030ArtTh[0] ;
                  n10030ArtTh = P08504_n10030ArtTh[0] ;
                  A65ArtCod = P08504_A65ArtCod[0] ;
                  A69ArtDsc = P08504_A69ArtDsc[0] ;
                  n69ArtDsc = P08504_n69ArtDsc[0] ;
                  AV23ArtRef = A69ArtDsc ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
            }
            AV17CliCod = A252CliCod ;
            AV22AlbUni = A56AlbRUni ;
            AV15TotUniE = DecimalUtil.doubleToDec(0) ;
            AV19TotUniS = DecimalUtil.doubleToDec(0) ;
            AV20TotPzE = 0 ;
            AV21TotPzU = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08503_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08503_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P08503_A45AlbRef[0], A45AlbRef) == 0 ) )
            {
               brk8503 = false ;
               A49AlbRFen = P08503_A49AlbRFen[0] ;
               A46AlbREnt = P08503_A46AlbREnt[0] ;
               A5806AlbREnt2 = P08503_A5806AlbREnt2[0] ;
               A1211TipEntCod = P08503_A1211TipEntCod[0] ;
               n1211TipEntCod = P08503_n1211TipEntCod[0] ;
               A6263AlbRTartC = P08503_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P08503_n6263AlbRTartC[0] ;
               A47AlbREst = P08503_A47AlbREst[0] ;
               A58AlbRUniEnt = P08503_A58AlbRUniEnt[0] ;
               A60AlbRUniUti = P08503_A60AlbRUniUti[0] ;
               A52AlbRPieEnt = P08503_A52AlbRPieEnt[0] ;
               A54AlbRPieUti = P08503_A54AlbRPieUti[0] ;
               A44AlbRecCod = P08503_A44AlbRecCod[0] ;
               if ( A252CliCod >= AV11PCliente )
               {
                  if ( A252CliCod <= AV12UCliente )
                  {
                     if ( GXutil.strcmp(A45AlbRef, AV31AlbRef_i) >= 0 )
                     {
                        if ( GXutil.strcmp(A45AlbRef, AV32AlbRef_f) <= 0 )
                        {
                           if ( (( GXutil.resetTime(A49AlbRFen).after( GXutil.resetTime( AV13PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A49AlbRFen), GXutil.resetTime(AV13PFecha)) )) )
                           {
                              if ( (( GXutil.resetTime(A49AlbRFen).before( GXutil.resetTime( AV14UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A49AlbRFen), GXutil.resetTime(AV14UFecha)) )) )
                              {
                                 if ( GXutil.strcmp(A46AlbREnt, AV52Albrenti) >= 0 )
                                 {
                                    if ( GXutil.strcmp(A46AlbREnt, AV53Albrentf) <= 0 )
                                    {
                                       if ( GXutil.strcmp(A5806AlbREnt2, AV79Albrent2i) >= 0 )
                                       {
                                          if ( GXutil.strcmp(A5806AlbREnt2, AV80Albrent2f) <= 0 )
                                          {
                                             if ( A1211TipEntCod != 9999 )
                                             {
                                                if ( ( A1211TipEntCod == AV57TipEntcodi ) || (0==AV57TipEntcodi) )
                                                {
                                                   if ( A6263AlbRTartC >= AV58Tipartcod1 )
                                                   {
                                                      if ( A6263AlbRTartC <= AV59Tipartcod2 )
                                                      {
                                                         if ( A47AlbREst >= AV61PAlbRest )
                                                         {
                                                            if ( A47AlbREst <= AV62UALbRest )
                                                            {
                                                               AV15TotUniE = AV15TotUniE.add(A58AlbRUniEnt) ;
                                                               AV19TotUniS = AV19TotUniS.add(A60AlbRUniUti) ;
                                                               AV20TotPzE = (int)(AV20TotPzE+A52AlbRPieEnt) ;
                                                               AV21TotPzU = (int)(AV21TotPzU+A54AlbRPieUti) ;
                                                               AV26TotUniEG = AV26TotUniEG.add(A58AlbRUniEnt) ;
                                                               AV27TotUniSG = AV27TotUniSG.add(A60AlbRUniUti) ;
                                                               AV28TotPzEG = (int)(AV28TotPzEG+A52AlbRPieEnt) ;
                                                               AV29TotPzUG = (int)(AV29TotPzUG+A54AlbRPieUti) ;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk8503 = true ;
               pr_default.readNext(1);
            }
            AV25TotPzSal = (int)(AV20TotPzE-AV21TotPzU) ;
            AV24TotUniSal = AV15TotUniE.subtract(AV19TotUniS) ;
            AV72ExcelDocument.Cells(AV74Row, 1, 1, 1).setNumber( A252CliCod );
            AV72ExcelDocument.Cells(AV74Row, 2, 1, 1).setText( A279CliNom );
            AV72ExcelDocument.Cells(AV74Row, 3, 1, 1).setText( AV16ArtCod );
            AV72ExcelDocument.Cells(AV74Row, 4, 1, 1).setText( AV23ArtRef );
            AV72ExcelDocument.Cells(AV74Row, 5, 1, 1).setText( AV22AlbUni );
            AV72ExcelDocument.Cells(AV74Row, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV15TotUniE)) );
            AV72ExcelDocument.Cells(AV74Row, 7, 1, 1).setNumber( AV20TotPzE );
            AV72ExcelDocument.Cells(AV74Row, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19TotUniS)) );
            AV72ExcelDocument.Cells(AV74Row, 9, 1, 1).setNumber( AV21TotPzU );
            AV72ExcelDocument.Cells(AV74Row, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotUniSal)) );
            AV72ExcelDocument.Cells(AV74Row, 11, 1, 1).setNumber( AV25TotPzSal );
            AV74Row = (short)(AV74Row+1) ;
         }
         if ( ! brk8503 )
         {
            brk8503 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      AV74Row = (short)(AV74Row+1) ;
      AV25TotPzSal = (int)(AV28TotPzEG-AV29TotPzUG) ;
      AV24TotUniSal = AV26TotUniEG.subtract(AV27TotUniSG) ;
      AV72ExcelDocument.Cells(AV74Row, 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26TotUniEG)) );
      AV72ExcelDocument.Cells(AV74Row, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26TotUniEG)) );
      AV72ExcelDocument.Cells(AV74Row, 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27TotUniSG)) );
      AV72ExcelDocument.Cells(AV74Row, 9, 1, 1).setNumber( AV29TotPzUG );
      AV72ExcelDocument.Cells(AV74Row, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotUniSal)) );
      AV72ExcelDocument.Cells(AV74Row, 11, 1, 1).setNumber( AV25TotPzSal );
      AV72ExcelDocument.Save();
      if ( AV72ExcelDocument.getErrCode() != 0 )
      {
         AV73Filename = "" ;
         AV77ErrorMessage = AV72ExcelDocument.getErrDescription() ;
         AV72ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV72ExcelDocument.Close();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = xlsrem0000.this.A396EmprCod;
      this.aP1[0] = xlsrem0000.this.AV9ImpCod;
      this.aP2[0] = xlsrem0000.this.AV11PCliente;
      this.aP3[0] = xlsrem0000.this.AV12UCliente;
      this.aP4[0] = xlsrem0000.this.AV13PFecha;
      this.aP5[0] = xlsrem0000.this.AV14UFecha;
      this.aP6[0] = xlsrem0000.this.AV31AlbRef_i;
      this.aP7[0] = xlsrem0000.this.AV32AlbRef_f;
      this.aP8[0] = xlsrem0000.this.AV52Albrenti;
      this.aP9[0] = xlsrem0000.this.AV53Albrentf;
      this.aP10[0] = xlsrem0000.this.AV57TipEntcodi;
      this.aP11[0] = xlsrem0000.this.AV58Tipartcod1;
      this.aP12[0] = xlsrem0000.this.AV59Tipartcod2;
      this.aP13[0] = xlsrem0000.this.AV60Estado_a;
      this.aP14[0] = xlsrem0000.this.AV79Albrent2i;
      this.aP15[0] = xlsrem0000.this.AV80Albrent2f;
      this.aP16[0] = xlsrem0000.this.AV73Filename;
      this.aP17[0] = xlsrem0000.this.AV77ErrorMessage;
      CloseOpenCursors();
      AV72ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30ContDsc = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P08502_A396EmprCod = new String[] {""} ;
      P08502_A407EmprNom = new String[] {""} ;
      P08502_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10NomEmp = "" ;
      AV84Pgmdesc = "" ;
      AV72ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      P08503_A396EmprCod = new String[] {""} ;
      P08503_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08503_A45AlbRef = new String[] {""} ;
      P08503_A46AlbREnt = new String[] {""} ;
      P08503_A5806AlbREnt2 = new String[] {""} ;
      P08503_A1211TipEntCod = new short[1] ;
      P08503_n1211TipEntCod = new boolean[] {false} ;
      P08503_A6263AlbRTartC = new short[1] ;
      P08503_n6263AlbRTartC = new boolean[] {false} ;
      P08503_A47AlbREst = new byte[1] ;
      P08503_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08503_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08503_A52AlbRPieEnt = new int[1] ;
      P08503_A54AlbRPieUti = new int[1] ;
      P08503_A970ProceCod = new short[1] ;
      P08503_n970ProceCod = new boolean[] {false} ;
      P08503_A4295ClasCod = new short[1] ;
      P08503_n4295ClasCod = new boolean[] {false} ;
      P08503_A252CliCod = new int[1] ;
      P08503_A3613AlbRefDsc = new String[] {""} ;
      P08503_A56AlbRUni = new String[] {""} ;
      P08503_A279CliNom = new String[] {""} ;
      P08503_A44AlbRecCod = new int[1] ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A279CliNom = "" ;
      AV16ArtCod = "" ;
      AV23ArtRef = "" ;
      P08504_A396EmprCod = new String[] {""} ;
      P08504_A252CliCod = new int[1] ;
      P08504_A4295ClasCod = new short[1] ;
      P08504_n4295ClasCod = new boolean[] {false} ;
      P08504_A10030ArtTh = new short[1] ;
      P08504_n10030ArtTh = new boolean[] {false} ;
      P08504_A65ArtCod = new String[] {""} ;
      P08504_A69ArtDsc = new String[] {""} ;
      P08504_n69ArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      AV22AlbUni = "" ;
      AV15TotUniE = DecimalUtil.ZERO ;
      AV19TotUniS = DecimalUtil.ZERO ;
      AV26TotUniEG = DecimalUtil.ZERO ;
      AV27TotUniSG = DecimalUtil.ZERO ;
      AV24TotUniSal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.xlsrem0000__default(),
         new Object[] {
             new Object[] {
            P08502_A396EmprCod, P08502_A407EmprNom, P08502_n407EmprNom
            }
            , new Object[] {
            P08503_A396EmprCod, P08503_A49AlbRFen, P08503_A45AlbRef, P08503_A46AlbREnt, P08503_A5806AlbREnt2, P08503_A1211TipEntCod, P08503_n1211TipEntCod, P08503_A6263AlbRTartC, P08503_n6263AlbRTartC, P08503_A47AlbREst,
            P08503_A58AlbRUniEnt, P08503_A60AlbRUniUti, P08503_A52AlbRPieEnt, P08503_A54AlbRPieUti, P08503_A970ProceCod, P08503_n970ProceCod, P08503_A4295ClasCod, P08503_n4295ClasCod, P08503_A252CliCod, P08503_A3613AlbRefDsc,
            P08503_A56AlbRUni, P08503_A279CliNom, P08503_A44AlbRecCod
            }
            , new Object[] {
            P08504_A396EmprCod, P08504_A252CliCod, P08504_A4295ClasCod, P08504_n4295ClasCod, P08504_A10030ArtTh, P08504_n10030ArtTh, P08504_A65ArtCod, P08504_A69ArtDsc, P08504_n69ArtDsc
            }
         }
      );
      AV84Pgmdesc = httpContext.getMessage( "Listado Entradas Resumen por Cliente", "") ;
      /* GeneXus formulas. */
      AV84Pgmdesc = httpContext.getMessage( "Listado Entradas Resumen por Cliente", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV54Moda21 ;
   private byte AV55Cli350 ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV61PAlbRest ;
   private byte AV62UALbRest ;
   private byte A47AlbREst ;
   private short AV57TipEntcodi ;
   private short AV58Tipartcod1 ;
   private short AV59Tipartcod2 ;
   private short AV78Enc20 ;
   private short AV74Row ;
   private short AV75Col ;
   private short A1211TipEntCod ;
   private short A6263AlbRTartC ;
   private short A970ProceCod ;
   private short A4295ClasCod ;
   private short A10030ArtTh ;
   private short Gx_err ;
   private int AV11PCliente ;
   private int AV12UCliente ;
   private int AV56ContVal ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int AV71Random ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV17CliCod ;
   private int AV20TotPzE ;
   private int AV21TotPzU ;
   private int AV28TotPzEG ;
   private int AV29TotPzUG ;
   private int AV25TotPzSal ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV15TotUniE ;
   private java.math.BigDecimal AV19TotUniS ;
   private java.math.BigDecimal AV26TotUniEG ;
   private java.math.BigDecimal AV27TotUniSG ;
   private java.math.BigDecimal AV24TotUniSal ;
   private String A396EmprCod ;
   private String AV9ImpCod ;
   private String AV31AlbRef_i ;
   private String AV32AlbRef_f ;
   private String AV52Albrenti ;
   private String AV53Albrentf ;
   private String AV60Estado_a ;
   private String AV79Albrent2i ;
   private String AV80Albrent2f ;
   private String AV30ContDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10NomEmp ;
   private String AV84Pgmdesc ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A3613AlbRefDsc ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String AV16ArtCod ;
   private String AV23ArtRef ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String AV22AlbUni ;
   private java.util.Date AV13PFecha ;
   private java.util.Date AV14UFecha ;
   private java.util.Date A49AlbRFen ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean brk8503 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private boolean n970ProceCod ;
   private boolean n4295ClasCod ;
   private boolean n10030ArtTh ;
   private boolean n69ArtDsc ;
   private String AV73Filename ;
   private String AV77ErrorMessage ;
   private String[] aP17 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P08502_A396EmprCod ;
   private String[] P08502_A407EmprNom ;
   private boolean[] P08502_n407EmprNom ;
   private String[] P08503_A396EmprCod ;
   private java.util.Date[] P08503_A49AlbRFen ;
   private String[] P08503_A45AlbRef ;
   private String[] P08503_A46AlbREnt ;
   private String[] P08503_A5806AlbREnt2 ;
   private short[] P08503_A1211TipEntCod ;
   private boolean[] P08503_n1211TipEntCod ;
   private short[] P08503_A6263AlbRTartC ;
   private boolean[] P08503_n6263AlbRTartC ;
   private byte[] P08503_A47AlbREst ;
   private java.math.BigDecimal[] P08503_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08503_A60AlbRUniUti ;
   private int[] P08503_A52AlbRPieEnt ;
   private int[] P08503_A54AlbRPieUti ;
   private short[] P08503_A970ProceCod ;
   private boolean[] P08503_n970ProceCod ;
   private short[] P08503_A4295ClasCod ;
   private boolean[] P08503_n4295ClasCod ;
   private int[] P08503_A252CliCod ;
   private String[] P08503_A3613AlbRefDsc ;
   private String[] P08503_A56AlbRUni ;
   private String[] P08503_A279CliNom ;
   private int[] P08503_A44AlbRecCod ;
   private String[] P08504_A396EmprCod ;
   private int[] P08504_A252CliCod ;
   private short[] P08504_A4295ClasCod ;
   private boolean[] P08504_n4295ClasCod ;
   private short[] P08504_A10030ArtTh ;
   private boolean[] P08504_n10030ArtTh ;
   private String[] P08504_A65ArtCod ;
   private String[] P08504_A69ArtDsc ;
   private boolean[] P08504_n69ArtDsc ;
   private com.genexus.gxoffice.ExcelDoc AV72ExcelDocument ;
}

final  class xlsrem0000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08502", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08503", "SELECT T1.EmprCod, T1.AlbRFen, T1.AlbRef, T1.AlbREnt, T1.AlbREnt2, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt, T1.AlbRPieUti, T1.ProceCod, T1.ClasCod, T1.CliCod, T1.AlbRefDsc, T1.AlbRUni, T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ?) AND (T1.AlbRFen >= ?) AND (T1.AlbRFen <= ?) AND (T1.AlbRef <= ?) AND (T1.AlbREnt >= ?) AND (T1.AlbREnt <= ?) AND (T1.AlbREnt2 >= ?) AND (T1.AlbREnt2 <= ?) AND (T1.TipEntCod <> 9999) AND (T1.TipEntCod = ? or (? = 0)) AND (T1.AlbRTartC >= ?) AND (T1.AlbRTartC <= ?) AND (T1.AlbREst >= ?) AND (T1.AlbREst <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08504", "SELECT * FROM (SELECT EmprCod, CliCod, ClasCod, ArtTh, ArtCod, ArtDsc FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) AND (ArtTh = ?) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 26);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((String[]) buf[21])[0] = rslt.getString(18, 30);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setString(10, (String)parms[9], 20);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

