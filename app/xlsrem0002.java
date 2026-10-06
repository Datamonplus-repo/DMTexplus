package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class xlsrem0002 extends GXProcedure
{
   public xlsrem0002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( xlsrem0002.class ), "" );
   }

   public xlsrem0002( int remoteHandle ,
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
                             String[] aP14 )
   {
      xlsrem0002.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
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
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
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
                             String[] aP15 )
   {
      xlsrem0002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      xlsrem0002.this.AV9ImpCod = aP1[0];
      this.aP1 = aP1;
      xlsrem0002.this.AV11PCliente = aP2[0];
      this.aP2 = aP2;
      xlsrem0002.this.AV12UCliente = aP3[0];
      this.aP3 = aP3;
      xlsrem0002.this.AV13PFecha = aP4[0];
      this.aP4 = aP4;
      xlsrem0002.this.AV14UFecha = aP5[0];
      this.aP5 = aP5;
      xlsrem0002.this.AV30AlbRef_i = aP6[0];
      this.aP6 = aP6;
      xlsrem0002.this.AV31AlbRef_f = aP7[0];
      this.aP7 = aP7;
      xlsrem0002.this.AV54Albrenti = aP8[0];
      this.aP8 = aP8;
      xlsrem0002.this.AV55Albrentf = aP9[0];
      this.aP9 = aP9;
      xlsrem0002.this.AV59TipENtcodi = aP10[0];
      this.aP10 = aP10;
      xlsrem0002.this.AV60Tipartcod1 = aP11[0];
      this.aP11 = aP11;
      xlsrem0002.this.AV61Tipartcod2 = aP12[0];
      this.aP12 = aP12;
      xlsrem0002.this.AV62Estado_a = aP13[0];
      this.aP13 = aP13;
      xlsrem0002.this.AV76Filename = aP14[0];
      this.aP14 = aP14;
      xlsrem0002.this.AV74ErrorMessage = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV29ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EM0000", ""), GXv_char1) ;
      xlsrem0002.this.AV29ContDsc = GXv_char1[0] ;
      GXt_int2 = AV56Moda21 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      xlsrem0002.this.GXt_int2 = GXv_int3[0] ;
      AV56Moda21 = GXt_int2 ;
      GXt_int2 = AV57Cli350 ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int3) ;
      xlsrem0002.this.GXt_int2 = GXv_int3[0] ;
      AV57Cli350 = GXt_int2 ;
      GXt_int4 = AV58ContVal ;
      GXv_int5[0] = GXt_int4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int5) ;
      xlsrem0002.this.GXt_int4 = GXv_int5[0] ;
      AV58ContVal = GXt_int4 ;
      AV63PAlbRest = (byte)(0) ;
      AV64UALbRest = (byte)(1) ;
      if ( GXutil.strcmp(AV62Estado_a, "0") == 0 )
      {
         AV63PAlbRest = (byte)(0) ;
         AV64UALbRest = (byte)(0) ;
      }
      if ( GXutil.strcmp(AV62Estado_a, "1") == 0 )
      {
         AV63PAlbRest = (byte)(1) ;
         AV64UALbRest = (byte)(1) ;
      }
      AV77Random = (int)(GXutil.random( )*10000) ;
      AV76Filename = GXutil.trim( AV81Pgmdesc) + "_" + GXutil.trim( GXutil.str( AV77Random, 8, 0)) + ".xlsx" ;
      AV75ExcelDocument.Open(AV76Filename);
      if ( AV75ExcelDocument.getErrCode() != 0 )
      {
         AV76Filename = "" ;
         AV74ErrorMessage = AV75ExcelDocument.getErrDescription() ;
         AV75ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV75ExcelDocument.Clear();
      AV78Row = (short)(1) ;
      AV73Col = (short)(1) ;
      while ( AV73Col <= 8 )
      {
         AV75ExcelDocument.Cells(AV78Row, AV73Col, 1, 1).setBold( (short)(1) );
         AV75ExcelDocument.Cells(AV78Row, AV73Col, 1, 1).setColor( 11 );
         AV73Col = (short)(AV73Col+1) ;
      }
      AV75ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV75ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV75ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Und Ent", "") );
      AV75ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Pzs Ent", "") );
      AV75ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Und Uti", "") );
      AV75ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Pzs uti", "") );
      AV75ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Und Stock", "") );
      AV75ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Pzs Stock", "") );
      AV78Row = (short)(2) ;
      /* Using cursor P08522 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11PCliente), AV30AlbRef_i, AV13PFecha, AV14UFecha, AV31AlbRef_f, AV54Albrenti, AV55Albrentf, Short.valueOf(AV59TipENtcodi), Short.valueOf(AV59TipENtcodi), Short.valueOf(AV60Tipartcod1), Short.valueOf(AV61Tipartcod2), Byte.valueOf(AV63PAlbRest), Byte.valueOf(AV64UALbRest), Integer.valueOf(AV12UCliente)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8522 = false ;
         A49AlbRFen = P08522_A49AlbRFen[0] ;
         A252CliCod = P08522_A252CliCod[0] ;
         A46AlbREnt = P08522_A46AlbREnt[0] ;
         A1211TipEntCod = P08522_A1211TipEntCod[0] ;
         n1211TipEntCod = P08522_n1211TipEntCod[0] ;
         A6263AlbRTartC = P08522_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08522_n6263AlbRTartC[0] ;
         A47AlbREst = P08522_A47AlbREst[0] ;
         A45AlbRef = P08522_A45AlbRef[0] ;
         A52AlbRPieEnt = P08522_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P08522_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = P08522_A54AlbRPieUti[0] ;
         A60AlbRUniUti = P08522_A60AlbRUniUti[0] ;
         A279CliNom = P08522_A279CliNom[0] ;
         A44AlbRecCod = P08522_A44AlbRecCod[0] ;
         A279CliNom = P08522_A279CliNom[0] ;
         if ( ( AV56Moda21 == 1 ) && ( A252CliCod == 350 ) && ( AV57Cli350 == 1 ) && ( AV58ContVal == 1 ) )
         {
         }
         else
         {
            AV22TotPE = 0 ;
            AV21TotEnt = DecimalUtil.doubleToDec(0) ;
            AV23TotPU = 0 ;
            AV24TotUti = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08522_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08522_A252CliCod[0] == A252CliCod ) )
            {
               brk8522 = false ;
               A49AlbRFen = P08522_A49AlbRFen[0] ;
               A46AlbREnt = P08522_A46AlbREnt[0] ;
               A1211TipEntCod = P08522_A1211TipEntCod[0] ;
               n1211TipEntCod = P08522_n1211TipEntCod[0] ;
               A6263AlbRTartC = P08522_A6263AlbRTartC[0] ;
               n6263AlbRTartC = P08522_n6263AlbRTartC[0] ;
               A47AlbREst = P08522_A47AlbREst[0] ;
               A45AlbRef = P08522_A45AlbRef[0] ;
               A52AlbRPieEnt = P08522_A52AlbRPieEnt[0] ;
               A58AlbRUniEnt = P08522_A58AlbRUniEnt[0] ;
               A54AlbRPieUti = P08522_A54AlbRPieUti[0] ;
               A60AlbRUniUti = P08522_A60AlbRUniUti[0] ;
               A44AlbRecCod = P08522_A44AlbRecCod[0] ;
               if ( GXutil.strcmp(A45AlbRef, AV31AlbRef_f) <= 0 )
               {
                  if ( GXutil.strcmp(A45AlbRef, AV30AlbRef_i) >= 0 )
                  {
                     if ( ( A252CliCod >= AV11PCliente ) && ( A252CliCod <= AV12UCliente ) )
                     {
                        if ( (( GXutil.resetTime(A49AlbRFen).after( GXutil.resetTime( AV13PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A49AlbRFen), GXutil.resetTime(AV13PFecha)) )) && (( GXutil.resetTime(A49AlbRFen).before( GXutil.resetTime( AV14UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A49AlbRFen), GXutil.resetTime(AV14UFecha)) )) )
                        {
                           if ( ( GXutil.strcmp(A46AlbREnt, AV54Albrenti) >= 0 ) && ( GXutil.strcmp(A46AlbREnt, AV55Albrentf) <= 0 ) )
                           {
                              if ( A1211TipEntCod != 9999 )
                              {
                                 if ( ( ( A1211TipEntCod == AV59TipENtcodi ) ) || (0==AV59TipENtcodi) )
                                 {
                                    if ( A6263AlbRTartC >= AV60Tipartcod1 )
                                    {
                                       if ( A6263AlbRTartC <= AV61Tipartcod2 )
                                       {
                                          if ( ( A47AlbREst >= AV63PAlbRest ) && ( A47AlbREst <= AV64UALbRest ) )
                                          {
                                             AV22TotPE = (int)(AV22TotPE+A52AlbRPieEnt) ;
                                             AV21TotEnt = AV21TotEnt.add(A58AlbRUniEnt) ;
                                             AV23TotPU = (int)(AV23TotPU+A54AlbRPieUti) ;
                                             AV24TotUti = AV24TotUti.add(A60AlbRUniUti) ;
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
               brk8522 = true ;
               pr_default.readNext(0);
            }
            AV51Saldo_u = AV21TotEnt.subtract(AV24TotUti) ;
            AV52Saldo_p = (int)(AV22TotPE-AV23TotPU) ;
            AV75ExcelDocument.Cells(AV78Row, 1, 1, 1).setNumber( A252CliCod );
            AV75ExcelDocument.Cells(AV78Row, 2, 1, 1).setText( A279CliNom );
            AV75ExcelDocument.Cells(AV78Row, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21TotEnt)) );
            AV75ExcelDocument.Cells(AV78Row, 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21TotEnt)) );
            AV75ExcelDocument.Cells(AV78Row, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotUti)) );
            AV75ExcelDocument.Cells(AV78Row, 6, 1, 1).setNumber( AV23TotPU );
            AV75ExcelDocument.Cells(AV78Row, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51Saldo_u)) );
            AV75ExcelDocument.Cells(AV78Row, 8, 1, 1).setNumber( AV52Saldo_p );
            AV78Row = (short)(AV78Row+1) ;
            AV25TotEP = AV25TotEP.add(AV21TotEnt) ;
            AV27TotPEP = (int)(AV27TotPEP+AV22TotPE) ;
            AV26TotUP = AV26TotUP.add(AV24TotUti) ;
            AV28TotPUP = (int)(AV28TotPUP+AV23TotPU) ;
         }
         if ( ! brk8522 )
         {
            brk8522 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV51Saldo_u = AV25TotEP.subtract(AV26TotUP) ;
      AV52Saldo_p = (int)(AV27TotPEP-AV28TotPUP) ;
      AV75ExcelDocument.Cells(AV78Row, 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25TotEP)) );
      AV75ExcelDocument.Cells(AV78Row, 4, 1, 1).setNumber( AV27TotPEP );
      AV75ExcelDocument.Cells(AV78Row, 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26TotUP)) );
      AV75ExcelDocument.Cells(AV78Row, 6, 1, 1).setNumber( AV28TotPUP );
      AV75ExcelDocument.Cells(AV78Row, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51Saldo_u)) );
      AV75ExcelDocument.Cells(AV78Row, 8, 1, 1).setNumber( AV52Saldo_p );
      AV75ExcelDocument.Save();
      if ( AV75ExcelDocument.getErrCode() != 0 )
      {
         AV76Filename = "" ;
         AV74ErrorMessage = AV75ExcelDocument.getErrDescription() ;
         AV75ExcelDocument.Close();
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV75ExcelDocument.Close();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = xlsrem0002.this.A396EmprCod;
      this.aP1[0] = xlsrem0002.this.AV9ImpCod;
      this.aP2[0] = xlsrem0002.this.AV11PCliente;
      this.aP3[0] = xlsrem0002.this.AV12UCliente;
      this.aP4[0] = xlsrem0002.this.AV13PFecha;
      this.aP5[0] = xlsrem0002.this.AV14UFecha;
      this.aP6[0] = xlsrem0002.this.AV30AlbRef_i;
      this.aP7[0] = xlsrem0002.this.AV31AlbRef_f;
      this.aP8[0] = xlsrem0002.this.AV54Albrenti;
      this.aP9[0] = xlsrem0002.this.AV55Albrentf;
      this.aP10[0] = xlsrem0002.this.AV59TipENtcodi;
      this.aP11[0] = xlsrem0002.this.AV60Tipartcod1;
      this.aP12[0] = xlsrem0002.this.AV61Tipartcod2;
      this.aP13[0] = xlsrem0002.this.AV62Estado_a;
      this.aP14[0] = xlsrem0002.this.AV76Filename;
      this.aP15[0] = xlsrem0002.this.AV74ErrorMessage;
      CloseOpenCursors();
      AV75ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29ContDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int5 = new int[1] ;
      AV81Pgmdesc = "" ;
      AV75ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P08522_A396EmprCod = new String[] {""} ;
      P08522_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08522_A252CliCod = new int[1] ;
      P08522_A46AlbREnt = new String[] {""} ;
      P08522_A1211TipEntCod = new short[1] ;
      P08522_n1211TipEntCod = new boolean[] {false} ;
      P08522_A6263AlbRTartC = new short[1] ;
      P08522_n6263AlbRTartC = new boolean[] {false} ;
      P08522_A47AlbREst = new byte[1] ;
      P08522_A45AlbRef = new String[] {""} ;
      P08522_A52AlbRPieEnt = new int[1] ;
      P08522_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08522_A54AlbRPieUti = new int[1] ;
      P08522_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08522_A279CliNom = new String[] {""} ;
      P08522_A44AlbRecCod = new int[1] ;
      A49AlbRFen = GXutil.nullDate() ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV21TotEnt = DecimalUtil.ZERO ;
      AV24TotUti = DecimalUtil.ZERO ;
      AV51Saldo_u = DecimalUtil.ZERO ;
      AV25TotEP = DecimalUtil.ZERO ;
      AV26TotUP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.xlsrem0002__default(),
         new Object[] {
             new Object[] {
            P08522_A396EmprCod, P08522_A49AlbRFen, P08522_A252CliCod, P08522_A46AlbREnt, P08522_A1211TipEntCod, P08522_n1211TipEntCod, P08522_A6263AlbRTartC, P08522_n6263AlbRTartC, P08522_A47AlbREst, P08522_A45AlbRef,
            P08522_A52AlbRPieEnt, P08522_A58AlbRUniEnt, P08522_A54AlbRPieUti, P08522_A60AlbRUniUti, P08522_A279CliNom, P08522_A44AlbRecCod
            }
         }
      );
      AV81Pgmdesc = httpContext.getMessage( "Listado Entradas Totales por Cliente", "") ;
      /* GeneXus formulas. */
      AV81Pgmdesc = httpContext.getMessage( "Listado Entradas Totales por Cliente", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV56Moda21 ;
   private byte AV57Cli350 ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte AV63PAlbRest ;
   private byte AV64UALbRest ;
   private byte A47AlbREst ;
   private short AV59TipENtcodi ;
   private short AV60Tipartcod1 ;
   private short AV61Tipartcod2 ;
   private short AV78Row ;
   private short AV73Col ;
   private short A1211TipEntCod ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV11PCliente ;
   private int AV12UCliente ;
   private int AV58ContVal ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int AV77Random ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int AV22TotPE ;
   private int AV23TotPU ;
   private int AV52Saldo_p ;
   private int AV27TotPEP ;
   private int AV28TotPUP ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV21TotEnt ;
   private java.math.BigDecimal AV24TotUti ;
   private java.math.BigDecimal AV51Saldo_u ;
   private java.math.BigDecimal AV25TotEP ;
   private java.math.BigDecimal AV26TotUP ;
   private String A396EmprCod ;
   private String AV9ImpCod ;
   private String AV30AlbRef_i ;
   private String AV31AlbRef_f ;
   private String AV54Albrenti ;
   private String AV55Albrentf ;
   private String AV62Estado_a ;
   private String AV29ContDsc ;
   private String GXv_char1[] ;
   private String AV81Pgmdesc ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private java.util.Date AV13PFecha ;
   private java.util.Date AV14UFecha ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk8522 ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private String AV76Filename ;
   private String AV74ErrorMessage ;
   private String[] aP15 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P08522_A396EmprCod ;
   private java.util.Date[] P08522_A49AlbRFen ;
   private int[] P08522_A252CliCod ;
   private String[] P08522_A46AlbREnt ;
   private short[] P08522_A1211TipEntCod ;
   private boolean[] P08522_n1211TipEntCod ;
   private short[] P08522_A6263AlbRTartC ;
   private boolean[] P08522_n6263AlbRTartC ;
   private byte[] P08522_A47AlbREst ;
   private String[] P08522_A45AlbRef ;
   private int[] P08522_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P08522_A58AlbRUniEnt ;
   private int[] P08522_A54AlbRPieUti ;
   private java.math.BigDecimal[] P08522_A60AlbRUniUti ;
   private String[] P08522_A279CliNom ;
   private int[] P08522_A44AlbRecCod ;
   private com.genexus.gxoffice.ExcelDoc AV75ExcelDocument ;
}

final  class xlsrem0002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08522", "SELECT T1.EmprCod, T1.AlbRFen, T1.CliCod, T1.AlbREnt, T1.TipEntCod, T1.AlbRTartC, T1.AlbREst, T1.AlbRef, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRPieUti, T1.AlbRUniUti, T2.CliNom, T1.AlbRecCod FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRef >= ?) AND (T1.AlbRFen >= ? and T1.AlbRFen <= ?) AND (T1.AlbRef <= ?) AND (T1.AlbREnt >= ? and T1.AlbREnt <= ?) AND (T1.TipEntCod <> 9999) AND (( T1.TipEntCod = ?) or (? = 0)) AND (T1.AlbRTartC >= ?) AND (T1.AlbRTartC <= ?) AND (T1.AlbREst >= ? and T1.AlbREst <= ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 30);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
      }
   }

}

