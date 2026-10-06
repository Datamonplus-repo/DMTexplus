package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pege103 extends GXProcedure
{
   public pege103( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pege103.class ), "" );
   }

   public pege103( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           java.util.Date[] aP1 ,
                           java.util.Date[] aP2 ,
                           java.util.Date[] aP3 ,
                           java.util.Date[] aP4 ,
                           String[] aP5 )
   {
      pege103.this.aP6 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        long[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             long[] aP6 )
   {
      pege103.this.AV13EmprCod = aP0[0];
      this.aP0 = aP0;
      pege103.this.AV10Fec1 = aP1[0];
      this.aP1 = aP1;
      pege103.this.AV11Fec2 = aP2[0];
      this.aP2 = aP2;
      pege103.this.AV26Hisprodti = aP3[0];
      this.aP3 = aP3;
      pege103.this.AV25Hisprodtf = aP4[0];
      this.aP4 = aP4;
      pege103.this.AV15File = aP5[0];
      this.aP5 = aP5;
      pege103.this.AV18hnd = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05882 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV26Hisprodti, AV25Hisprodtf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5882 = false ;
         A602MaqCod = P05882_A602MaqCod[0] ;
         A396EmprCod = P05882_A396EmprCod[0] ;
         A1526HisProMtr = P05882_A1526HisProMtr[0] ;
         A3612HisProReo = P05882_A3612HisProReo[0] ;
         A1525HisProKgr = P05882_A1525HisProKgr[0] ;
         A656ParCod = P05882_A656ParCod[0] ;
         n656ParCod = P05882_n656ParCod[0] ;
         A10360HisProFd = P05882_A10360HisProFd[0] ;
         A1011TipMaqCod = P05882_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05882_n1011TipMaqCod[0] ;
         A5608HisProDf = P05882_A5608HisProDf[0] ;
         A4440HisProDTI = P05882_A4440HisProDTI[0] ;
         n4440HisProDTI = P05882_n4440HisProDTI[0] ;
         A4441HisProDTF = P05882_A4441HisProDTF[0] ;
         n4441HisProDTF = P05882_n4441HisProDTF[0] ;
         A558HisProFec = P05882_A558HisProFec[0] ;
         A561HisProLin = P05882_A561HisProLin[0] ;
         A1011TipMaqCod = P05882_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05882_n1011TipMaqCod[0] ;
         if ( GXutil.strcmp(A1011TipMaqCod, httpContext.getMessage( "TI", "")) == 0 )
         {
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            AV30Hispromtrr = DecimalUtil.doubleToDec(0) ;
            AV29Hispromtr = DecimalUtil.doubleToDec(0) ;
            AV41Tparosg = 0 ;
            AV50Hisprokgr = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05882_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P05882_A10360HisProFd[0]), GXutil.resetTime(A10360HisProFd)) )
            {
               brk5882 = false ;
               A602MaqCod = P05882_A602MaqCod[0] ;
               A1526HisProMtr = P05882_A1526HisProMtr[0] ;
               A3612HisProReo = P05882_A3612HisProReo[0] ;
               A1525HisProKgr = P05882_A1525HisProKgr[0] ;
               A656ParCod = P05882_A656ParCod[0] ;
               n656ParCod = P05882_n656ParCod[0] ;
               A4440HisProDTI = P05882_A4440HisProDTI[0] ;
               n4440HisProDTI = P05882_n4440HisProDTI[0] ;
               A4441HisProDTF = P05882_A4441HisProDTF[0] ;
               n4441HisProDTF = P05882_n4441HisProDTF[0] ;
               A558HisProFec = P05882_A558HisProFec[0] ;
               A561HisProLin = P05882_A561HisProLin[0] ;
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
               {
                  A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               }
               else
               {
                  A5605HisProTr2 = (short)(0) ;
               }
               AV30Hispromtrr = AV30Hispromtrr.add((((A3612HisProReo>0) ? A1526HisProMtr : DecimalUtil.doubleToDec(0)))) ;
               AV29Hispromtr = AV29Hispromtr.add(A1526HisProMtr) ;
               AV50Hisprokgr = AV50Hisprokgr.add(A1525HisProKgr) ;
               AV59Hisprokgrr = AV59Hisprokgrr.add((((A3612HisProReo>0) ? A1525HisProKgr : DecimalUtil.doubleToDec(0)))) ;
               if ( A656ParCod > 0 )
               {
                  AV41Tparosg = (int)(AV41Tparosg+A5605HisProTr2) ;
               }
               brk5882 = true ;
               pr_default.readNext(0);
            }
            AV31Maqcod = httpContext.getMessage( "TI", "") ;
            AV32anyo = (short)(GXutil.year( A5608HisProDf)) ;
            AV33mes = (byte)(GXutil.month( A5608HisProDf)) ;
            AV34dia = (byte)(GXutil.day( A5608HisProDf)) ;
            /* Execute user subroutine: 'MTO' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV36NDia = (byte)(AV34dia*2) ;
            AV37Horas = (byte)(GXutil.lval( GXutil.substring( AV35HorNPro, AV36NDia, 2))) ;
            AV38Tmto = (int)(AV37Horas*60) ;
            /* Execute user subroutine: 'NOPLANIFICADO' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV36NDia = (byte)(AV34dia*2) ;
            AV37Horas = (byte)(GXutil.lval( GXutil.substring( AV35HorNPro, AV36NDia, 2))) ;
            AV58Tnp = (int)(AV37Horas*60) ;
            AV39Tcal = 23040 ;
            AV40Tdisp = (int)(AV39Tcal-AV38Tmto) ;
            AV53HhMm = DecimalUtil.doubleToDec(AV41Tparosg/ (double) (60)) ;
            AV54HorPar = (short)(AV41Tparosg/ (double) (60)) ;
            AV55HorParint = (short)(GXutil.Int( AV54HorPar)) ;
            AV56MinPar = (byte)(AV41Tparosg-(AV55HorParint*60)) ;
            AV42Tparosm = (int)(AV56MinPar+(AV55HorParint*60)) ;
            /* Execute user subroutine: 'TIPMAQ' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV57Carga24Horas = AV60TipMaqC24 ;
            AV43Toper = (int)(AV40Tdisp-AV38Tmto-AV42Tparosm) ;
            AV44Disp = ((AV40Tdisp>0) ? DecimalUtil.doubleToDec((AV43Toper/ (double) (AV40Tdisp))) : DecimalUtil.doubleToDec(0)) ;
            AV47MtsOk1 = AV50Hisprokgr.subtract(AV59Hisprokgrr) ;
            AV51Metrosesp = ((AV39Tcal>0) ? AV57Carga24Horas.multiply(DecimalUtil.doubleToDec(AV43Toper)).divide(DecimalUtil.doubleToDec(AV39Tcal), 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV45Rdto = ((AV51Metrosesp.doubleValue()>0) ? (AV29Hispromtr.divide(AV51Metrosesp, 18, java.math.RoundingMode.DOWN)) : DecimalUtil.doubleToDec(0)) ;
            AV48Calidad = ((AV29Hispromtr.doubleValue()>0) ? (AV47MtsOk1.divide(AV29Hispromtr, 18, java.math.RoundingMode.DOWN)) : DecimalUtil.doubleToDec(0)) ;
            AV49Ege = AV44Disp.multiply(AV45Rdto).multiply(AV48Calidad).multiply(DecimalUtil.doubleToDec(100)) ;
            AV44Disp = AV44Disp.multiply(DecimalUtil.doubleToDec(100)) ;
            AV45Rdto = AV45Rdto.multiply(DecimalUtil.doubleToDec(100)) ;
            AV48Calidad = AV48Calidad.multiply(DecimalUtil.doubleToDec(100)) ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A10360HisProFd)) )
            {
               AV16Control = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( A10360HisProFd, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + A1011TipMaqCod + ";" + A396EmprCod + A1011TipMaqCod + ";" + " " + ";" + GXutil.str( AV39Tcal, 6, 0) + ";" + GXutil.str( AV38Tmto, 6, 0) + ";" + GXutil.str( AV58Tnp, 6, 0) + ";" + GXutil.str( AV40Tdisp, 6, 0) + ";" + GXutil.str( AV42Tparosm, 6, 0) + ";" + GXutil.str( AV43Toper, 6, 0) + ";" + GXutil.str( AV44Disp, 10, 2) + ";" ;
               AV16Control += GXutil.str( AV57Carga24Horas, 10, 2) + ";" + GXutil.str( AV51Metrosesp, 10, 2) + ";" + GXutil.trim( GXutil.str( AV50Hisprokgr, 9, 2)) + ";" + GXutil.str( AV45Rdto, 10, 2) + ";" + GXutil.trim( GXutil.str( AV59Hisprokgrr, 10, 2)) + ";" + GXutil.str( AV47MtsOk1, 10, 2) + ";" + GXutil.str( AV48Calidad, 10, 2) + ";" + GXutil.str( AV49Ege, 10, 2) ;
               GXt_int1 = AV19Stat ;
               GXv_int2[0] = GXt_int1 ;
               new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int2) ;
               pege103.this.GXt_int1 = GXv_int2[0] ;
               AV19Stat = GXt_int1 ;
               System.out.println( AV16Control );
            }
         }
         if ( ! brk5882 )
         {
            brk5882 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPMAQ' Routine */
      returnInSub = false ;
      AV60TipMaqC24 = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05883 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV31Maqcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1011TipMaqCod = P05883_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05883_n1011TipMaqCod[0] ;
         A396EmprCod = P05883_A396EmprCod[0] ;
         A12447TipMaqC24 = P05883_A12447TipMaqC24[0] ;
         n12447TipMaqC24 = P05883_n12447TipMaqC24[0] ;
         AV60TipMaqC24 = A12447TipMaqC24 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'MTO' Routine */
      returnInSub = false ;
      AV35HorNPro = "" ;
      /* Using cursor P05884 */
      pr_default.execute(2, new Object[] {AV13EmprCod, AV31Maqcod, Short.valueOf(AV32anyo), Byte.valueOf(AV33mes)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A12435MaqMesM = P05884_A12435MaqMesM[0] ;
         A12434MaqAnyM = P05884_A12434MaqAnyM[0] ;
         A602MaqCod = P05884_A602MaqCod[0] ;
         A396EmprCod = P05884_A396EmprCod[0] ;
         A12427MaqMtoMes = P05884_A12427MaqMtoMes[0] ;
         n12427MaqMtoMes = P05884_n12427MaqMtoMes[0] ;
         AV35HorNPro = A12427MaqMtoMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'NOPLANIFICADO' Routine */
      returnInSub = false ;
      AV35HorNPro = "" ;
      /* Using cursor P05885 */
      pr_default.execute(3, new Object[] {AV13EmprCod, AV31Maqcod, Short.valueOf(AV32anyo), Byte.valueOf(AV33mes)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A12445MaqMesNP = P05885_A12445MaqMesNP[0] ;
         A12444MaqAnyNP = P05885_A12444MaqAnyNP[0] ;
         A602MaqCod = P05885_A602MaqCod[0] ;
         A396EmprCod = P05885_A396EmprCod[0] ;
         A12437MaqNPMes = P05885_A12437MaqNPMes[0] ;
         n12437MaqNPMes = P05885_n12437MaqNPMes[0] ;
         AV35HorNPro = A12437MaqNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pege103.this.AV13EmprCod;
      this.aP1[0] = pege103.this.AV10Fec1;
      this.aP2[0] = pege103.this.AV11Fec2;
      this.aP3[0] = pege103.this.AV26Hisprodti;
      this.aP4[0] = pege103.this.AV25Hisprodtf;
      this.aP5[0] = pege103.this.AV15File;
      this.aP6[0] = pege103.this.AV18hnd;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05882_A602MaqCod = new String[] {""} ;
      P05882_A396EmprCod = new String[] {""} ;
      P05882_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05882_A3612HisProReo = new byte[1] ;
      P05882_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05882_A656ParCod = new short[1] ;
      P05882_n656ParCod = new boolean[] {false} ;
      P05882_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P05882_A1011TipMaqCod = new String[] {""} ;
      P05882_n1011TipMaqCod = new boolean[] {false} ;
      P05882_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P05882_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05882_n4440HisProDTI = new boolean[] {false} ;
      P05882_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P05882_n4441HisProDTF = new boolean[] {false} ;
      P05882_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05882_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A10360HisProFd = GXutil.nullDate() ;
      A1011TipMaqCod = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV30Hispromtrr = DecimalUtil.ZERO ;
      AV29Hispromtr = DecimalUtil.ZERO ;
      AV50Hisprokgr = DecimalUtil.ZERO ;
      AV59Hisprokgrr = DecimalUtil.ZERO ;
      AV31Maqcod = "" ;
      AV35HorNPro = "" ;
      AV53HhMm = DecimalUtil.ZERO ;
      AV57Carga24Horas = DecimalUtil.ZERO ;
      AV60TipMaqC24 = DecimalUtil.ZERO ;
      AV44Disp = DecimalUtil.ZERO ;
      AV47MtsOk1 = DecimalUtil.ZERO ;
      AV51Metrosesp = DecimalUtil.ZERO ;
      AV45Rdto = DecimalUtil.ZERO ;
      AV48Calidad = DecimalUtil.ZERO ;
      AV49Ege = DecimalUtil.ZERO ;
      AV16Control = "" ;
      GXv_int2 = new byte[1] ;
      P05883_A1011TipMaqCod = new String[] {""} ;
      P05883_n1011TipMaqCod = new boolean[] {false} ;
      P05883_A396EmprCod = new String[] {""} ;
      P05883_A12447TipMaqC24 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05883_n12447TipMaqC24 = new boolean[] {false} ;
      A12447TipMaqC24 = DecimalUtil.ZERO ;
      P05884_A12435MaqMesM = new byte[1] ;
      P05884_A12434MaqAnyM = new short[1] ;
      P05884_A602MaqCod = new String[] {""} ;
      P05884_A396EmprCod = new String[] {""} ;
      P05884_A12427MaqMtoMes = new String[] {""} ;
      P05884_n12427MaqMtoMes = new boolean[] {false} ;
      A12427MaqMtoMes = "" ;
      P05885_A12445MaqMesNP = new byte[1] ;
      P05885_A12444MaqAnyNP = new short[1] ;
      P05885_A602MaqCod = new String[] {""} ;
      P05885_A396EmprCod = new String[] {""} ;
      P05885_A12437MaqNPMes = new String[] {""} ;
      P05885_n12437MaqNPMes = new boolean[] {false} ;
      A12437MaqNPMes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pege103__default(),
         new Object[] {
             new Object[] {
            P05882_A602MaqCod, P05882_A396EmprCod, P05882_A1526HisProMtr, P05882_A3612HisProReo, P05882_A1525HisProKgr, P05882_A656ParCod, P05882_n656ParCod, P05882_A10360HisProFd, P05882_A1011TipMaqCod, P05882_n1011TipMaqCod,
            P05882_A5608HisProDf, P05882_A4440HisProDTI, P05882_n4440HisProDTI, P05882_A4441HisProDTF, P05882_n4441HisProDTF, P05882_A558HisProFec, P05882_A561HisProLin
            }
            , new Object[] {
            P05883_A1011TipMaqCod, P05883_A396EmprCod, P05883_A12447TipMaqC24, P05883_n12447TipMaqC24
            }
            , new Object[] {
            P05884_A12435MaqMesM, P05884_A12434MaqAnyM, P05884_A602MaqCod, P05884_A396EmprCod, P05884_A12427MaqMtoMes, P05884_n12427MaqMtoMes
            }
            , new Object[] {
            P05885_A12445MaqMesNP, P05885_A12444MaqAnyNP, P05885_A602MaqCod, P05885_A396EmprCod, P05885_A12437MaqNPMes, P05885_n12437MaqNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3612HisProReo ;
   private byte AV33mes ;
   private byte AV34dia ;
   private byte AV36NDia ;
   private byte AV37Horas ;
   private byte AV56MinPar ;
   private byte AV19Stat ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A12435MaqMesM ;
   private byte A12445MaqMesNP ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV32anyo ;
   private short AV54HorPar ;
   private short AV55HorParint ;
   private short A12434MaqAnyM ;
   private short A12444MaqAnyNP ;
   private short Gx_err ;
   private int A561HisProLin ;
   private int AV41Tparosg ;
   private int AV38Tmto ;
   private int AV58Tnp ;
   private int AV39Tcal ;
   private int AV40Tdisp ;
   private int AV42Tparosm ;
   private int AV43Toper ;
   private long AV18hnd ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV30Hispromtrr ;
   private java.math.BigDecimal AV29Hispromtr ;
   private java.math.BigDecimal AV50Hisprokgr ;
   private java.math.BigDecimal AV59Hisprokgrr ;
   private java.math.BigDecimal AV53HhMm ;
   private java.math.BigDecimal AV57Carga24Horas ;
   private java.math.BigDecimal AV60TipMaqC24 ;
   private java.math.BigDecimal AV44Disp ;
   private java.math.BigDecimal AV47MtsOk1 ;
   private java.math.BigDecimal AV51Metrosesp ;
   private java.math.BigDecimal AV45Rdto ;
   private java.math.BigDecimal AV48Calidad ;
   private java.math.BigDecimal AV49Ege ;
   private java.math.BigDecimal A12447TipMaqC24 ;
   private String AV13EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A1011TipMaqCod ;
   private String AV31Maqcod ;
   private String AV35HorNPro ;
   private String A12427MaqMtoMes ;
   private String A12437MaqNPMes ;
   private java.util.Date AV26Hisprodti ;
   private java.util.Date AV25Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV10Fec1 ;
   private java.util.Date AV11Fec2 ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A558HisProFec ;
   private boolean brk5882 ;
   private boolean n656ParCod ;
   private boolean n1011TipMaqCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean returnInSub ;
   private boolean n12447TipMaqC24 ;
   private boolean n12427MaqMtoMes ;
   private boolean n12437MaqNPMes ;
   private String AV15File ;
   private String AV16Control ;
   private long[] aP6 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05882_A602MaqCod ;
   private String[] P05882_A396EmprCod ;
   private java.math.BigDecimal[] P05882_A1526HisProMtr ;
   private byte[] P05882_A3612HisProReo ;
   private java.math.BigDecimal[] P05882_A1525HisProKgr ;
   private short[] P05882_A656ParCod ;
   private boolean[] P05882_n656ParCod ;
   private java.util.Date[] P05882_A10360HisProFd ;
   private String[] P05882_A1011TipMaqCod ;
   private boolean[] P05882_n1011TipMaqCod ;
   private java.util.Date[] P05882_A5608HisProDf ;
   private java.util.Date[] P05882_A4440HisProDTI ;
   private boolean[] P05882_n4440HisProDTI ;
   private java.util.Date[] P05882_A4441HisProDTF ;
   private boolean[] P05882_n4441HisProDTF ;
   private java.util.Date[] P05882_A558HisProFec ;
   private int[] P05882_A561HisProLin ;
   private String[] P05883_A1011TipMaqCod ;
   private boolean[] P05883_n1011TipMaqCod ;
   private String[] P05883_A396EmprCod ;
   private java.math.BigDecimal[] P05883_A12447TipMaqC24 ;
   private boolean[] P05883_n12447TipMaqC24 ;
   private byte[] P05884_A12435MaqMesM ;
   private short[] P05884_A12434MaqAnyM ;
   private String[] P05884_A602MaqCod ;
   private String[] P05884_A396EmprCod ;
   private String[] P05884_A12427MaqMtoMes ;
   private boolean[] P05884_n12427MaqMtoMes ;
   private byte[] P05885_A12445MaqMesNP ;
   private short[] P05885_A12444MaqAnyNP ;
   private String[] P05885_A602MaqCod ;
   private String[] P05885_A396EmprCod ;
   private String[] P05885_A12437MaqNPMes ;
   private boolean[] P05885_n12437MaqNPMes ;
}

final  class pege103__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05882", "SELECT T1.MaqCod, T1.EmprCod, T1.HisProMtr, T1.HisProReo, T1.HisProKgr, T1.ParCod, T1.HisProFd, T2.TipMaqCod, T1.HisProDf, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) ORDER BY T1.EmprCod, T1.HisProFd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05883", "SELECT TipMaqCod, EmprCod, TipMaqC24 FROM TXPTIPMAQ WHERE EmprCod = ? and TipMaqCod = ? ORDER BY EmprCod, TipMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05884", "SELECT MaqMesM, MaqAnyM, MaqCod, EmprCod, MaqMtoMes FROM TXPMAQMT1 WHERE EmprCod = ? and MaqCod = ? and MaqAnyM = ? and MaqMesM = ? ORDER BY EmprCod, MaqCod, MaqAnyM, MaqMesM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05885", "SELECT MaqMesNP, MaqAnyNP, MaqCod, EmprCod, MaqNPMes FROM TXPMAQNP1 WHERE EmprCod = ? and MaqCod = ? and MaqAnyNP = ? and MaqMesNP = ? ORDER BY EmprCod, MaqCod, MaqAnyNP, MaqMesNP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 63);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 63);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

