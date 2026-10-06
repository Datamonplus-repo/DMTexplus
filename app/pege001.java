package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pege001 extends GXProcedure
{
   public pege001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pege001.class ), "" );
   }

   public pege001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     java.util.Date[] aP1 ,
                                     java.util.Date[] aP2 ,
                                     java.util.Date[] aP3 )
   {
      pege001.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pege001.this.AV13EmprCod = aP0[0];
      this.aP0 = aP0;
      pege001.this.AV10Fec1 = aP1[0];
      this.aP1 = aP1;
      pege001.this.AV11Fec2 = aP2[0];
      this.aP2 = aP2;
      pege001.this.AV26Hisprodti = aP3[0];
      this.aP3 = aP3;
      pege001.this.AV25Hisprodtf = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Carpeta ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "PATHBI", ""), GXv_char2) ;
      pege001.this.GXt_char1 = GXv_char2[0] ;
      AV12Carpeta = GXt_char1 ;
      GXt_char1 = AV12Carpeta ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char2) ;
      pege001.this.GXt_char1 = GXv_char2[0] ;
      AV12Carpeta = ((GXutil.strcmp("", AV12Carpeta)==0) ? GXt_char1 : AV12Carpeta) ;
      AV14NomInf = httpContext.getMessage( "EGE Estampacion", "") ;
      AV15File = GXutil.trim( AV12Carpeta) + "\\" + GXutil.trim( AV14NomInf) + httpContext.getMessage( ".csv", "") ;
      if ( new app.core.file(remoteHandle, context).executeUdp( AV15File) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV19Stat = GXutil.deleteFile( AV15File) ;
      }
      GXt_int3 = AV18hnd ;
      GXv_int4[0] = GXt_int3 ;
      new app.core.fcreate(remoteHandle, context).execute( AV15File, GXv_int4) ;
      pege001.this.GXt_int3 = GXv_int4[0] ;
      AV18hnd = GXt_int3 ;
      AV16Control = httpContext.getMessage( "Id_Empresa", "") + ";" + httpContext.getMessage( "Fecha", "") + ";" + httpContext.getMessage( "Id_Seccion", "") + ";" + httpContext.getMessage( "Id_Emp_Sec", "") + ";" + httpContext.getMessage( "Máquina", "") + ";" + httpContext.getMessage( "Tiempo Calendario", "") + ";" + httpContext.getMessage( "TIEMPO POR MANTENIMIENTO", "") + ";" + httpContext.getMessage( "TIEMPO no planificado", "") + ";" + httpContext.getMessage( "Tiempo Disponible", "") + ";" + httpContext.getMessage( "Tiempos Perdidos", "") + ";" + httpContext.getMessage( "Tiempo Operativo", "") + ";" + httpContext.getMessage( "% de Disponibilidad", "") + ";" ;
      AV16Control += httpContext.getMessage( "Carga por 24 horas", "") + ";" + httpContext.getMessage( "Metros Esperados", "") + ";" + httpContext.getMessage( "Metros Reales", "") + ";" + httpContext.getMessage( "% de Rendimiento", "") + ";" + httpContext.getMessage( "Metros Reprocesados", "") + ";" + httpContext.getMessage( "Metros Bien a la Primera", "") + ";" + httpContext.getMessage( "% de Calidad", "") + ";" + httpContext.getMessage( "% de EGE", "") ;
      GXt_int5 = AV19Stat ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int6) ;
      pege001.this.GXt_int5 = GXv_int6[0] ;
      AV19Stat = GXt_int5 ;
      /* Using cursor P05822 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV26Hisprodti, AV25Hisprodtf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5822 = false ;
         A396EmprCod = P05822_A396EmprCod[0] ;
         A1526HisProMtr = P05822_A1526HisProMtr[0] ;
         A3612HisProReo = P05822_A3612HisProReo[0] ;
         A1525HisProKgr = P05822_A1525HisProKgr[0] ;
         A656ParCod = P05822_A656ParCod[0] ;
         n656ParCod = P05822_n656ParCod[0] ;
         A10360HisProFd = P05822_A10360HisProFd[0] ;
         A602MaqCod = P05822_A602MaqCod[0] ;
         A1011TipMaqCod = P05822_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05822_n1011TipMaqCod[0] ;
         A5608HisProDf = P05822_A5608HisProDf[0] ;
         A1027MaqHhCon = P05822_A1027MaqHhCon[0] ;
         n1027MaqHhCon = P05822_n1027MaqHhCon[0] ;
         A606MaqDsc = P05822_A606MaqDsc[0] ;
         n606MaqDsc = P05822_n606MaqDsc[0] ;
         A4440HisProDTI = P05822_A4440HisProDTI[0] ;
         n4440HisProDTI = P05822_n4440HisProDTI[0] ;
         A4441HisProDTF = P05822_A4441HisProDTF[0] ;
         n4441HisProDTF = P05822_n4441HisProDTF[0] ;
         A558HisProFec = P05822_A558HisProFec[0] ;
         A561HisProLin = P05822_A561HisProLin[0] ;
         A1011TipMaqCod = P05822_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05822_n1011TipMaqCod[0] ;
         A1027MaqHhCon = P05822_A1027MaqHhCon[0] ;
         n1027MaqHhCon = P05822_n1027MaqHhCon[0] ;
         A606MaqDsc = P05822_A606MaqDsc[0] ;
         n606MaqDsc = P05822_n606MaqDsc[0] ;
         if ( GXutil.strcmp(A1011TipMaqCod, httpContext.getMessage( "ES", "")) == 0 )
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
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05822_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P05822_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P05822_A10360HisProFd[0]), GXutil.resetTime(A10360HisProFd)) )
            {
               brk5822 = false ;
               A1526HisProMtr = P05822_A1526HisProMtr[0] ;
               A3612HisProReo = P05822_A3612HisProReo[0] ;
               A1525HisProKgr = P05822_A1525HisProKgr[0] ;
               A656ParCod = P05822_A656ParCod[0] ;
               n656ParCod = P05822_n656ParCod[0] ;
               A4440HisProDTI = P05822_A4440HisProDTI[0] ;
               n4440HisProDTI = P05822_n4440HisProDTI[0] ;
               A4441HisProDTF = P05822_A4441HisProDTF[0] ;
               n4441HisProDTF = P05822_n4441HisProDTF[0] ;
               A558HisProFec = P05822_A558HisProFec[0] ;
               A561HisProLin = P05822_A561HisProLin[0] ;
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
               if ( A656ParCod > 0 )
               {
                  AV41Tparosg = (int)(AV41Tparosg+A5605HisProTr2) ;
               }
               brk5822 = true ;
               pr_default.readNext(0);
            }
            AV31Maqcod = A602MaqCod ;
            AV32anyo = (short)(GXutil.year( A5608HisProDf)) ;
            AV33mes = (byte)(GXutil.month( A5608HisProDf)) ;
            AV34dia = (byte)(GXutil.day( A5608HisProDf)) ;
            /* Execute user subroutine: 'MTO' */
            S111 ();
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
            AV58Tnp = (int)(AV37Horas*60) ;
            AV39Tcal = 1440 ;
            AV40Tdisp = (int)(AV39Tcal-AV38Tmto) ;
            AV53HhMm = DecimalUtil.doubleToDec(AV41Tparosg/ (double) (60)) ;
            AV54HorPar = (short)(AV41Tparosg/ (double) (60)) ;
            AV55HorParint = (short)(GXutil.Int( AV54HorPar)) ;
            AV56MinPar = (byte)(AV41Tparosg-(AV55HorParint*60)) ;
            AV42Tparosm = (int)(AV56MinPar+(AV55HorParint*60)) ;
            AV57Carga24Horas = A1027MaqHhCon ;
            AV43Toper = (int)(AV40Tdisp-AV38Tmto-AV42Tparosm) ;
            AV44Disp = ((AV40Tdisp>0) ? DecimalUtil.doubleToDec((AV43Toper/ (double) (AV40Tdisp))) : DecimalUtil.doubleToDec(0)) ;
            AV47MtsOk1 = AV29Hispromtr.subtract(AV30Hispromtrr) ;
            AV51Metrosesp = ((AV39Tcal>0) ? AV57Carga24Horas.multiply(DecimalUtil.doubleToDec(AV43Toper)).divide(DecimalUtil.doubleToDec(AV39Tcal), 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV45Rdto = ((AV51Metrosesp.doubleValue()>0) ? (AV29Hispromtr.divide(AV51Metrosesp, 18, java.math.RoundingMode.DOWN)) : DecimalUtil.doubleToDec(0)) ;
            AV48Calidad = ((AV29Hispromtr.doubleValue()>0) ? (AV47MtsOk1.divide(AV29Hispromtr, 18, java.math.RoundingMode.DOWN)) : DecimalUtil.doubleToDec(0)) ;
            AV49Ege = AV44Disp.multiply(AV45Rdto).multiply(AV48Calidad).multiply(DecimalUtil.doubleToDec(100)) ;
            AV44Disp = AV44Disp.multiply(DecimalUtil.doubleToDec(100)) ;
            AV45Rdto = AV45Rdto.multiply(DecimalUtil.doubleToDec(100)) ;
            AV48Calidad = AV48Calidad.multiply(DecimalUtil.doubleToDec(100)) ;
            AV16Control = A396EmprCod + ";" + GXutil.trim( localUtil.dtoc( A10360HisProFd, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + ";" + A1011TipMaqCod + ";" + A396EmprCod + A1011TipMaqCod + ";" + A606MaqDsc + ";" + GXutil.str( AV39Tcal, 6, 0) + ";" + GXutil.str( AV38Tmto, 6, 0) + ";" + GXutil.str( AV58Tnp, 6, 0) + ";" + GXutil.str( AV40Tdisp, 6, 0) + ";" + GXutil.str( AV42Tparosm, 6, 0) + ";" + GXutil.str( AV43Toper, 6, 0) + ";" + GXutil.str( AV44Disp, 10, 2) + ";" ;
            AV16Control += GXutil.str( AV57Carga24Horas, 10, 2) + ";" + GXutil.str( AV51Metrosesp, 10, 2) + ";" + GXutil.trim( GXutil.str( AV29Hispromtr, 9, 2)) + ";" + GXutil.str( AV45Rdto, 10, 2) + ";" + GXutil.trim( GXutil.str( AV30Hispromtrr, 9, 2)) + ";" + GXutil.str( AV47MtsOk1, 10, 2) + ";" + GXutil.str( AV48Calidad, 10, 2) + ";" + GXutil.str( AV49Ege, 10, 2) ;
            GXt_int5 = AV19Stat ;
            GXv_int6[0] = GXt_int5 ;
            new app.core.fputs(remoteHandle, context).execute( AV18hnd, AV16Control, GXv_int6) ;
            pege001.this.GXt_int5 = GXv_int6[0] ;
            AV19Stat = GXt_int5 ;
            System.out.println( AV16Control );
         }
         if ( ! brk5822 )
         {
            brk5822 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      GXt_int5 = AV19Stat ;
      GXv_int6[0] = GXt_int5 ;
      new app.core.fclose(remoteHandle, context).execute( AV18hnd, GXv_int6) ;
      pege001.this.GXt_int5 = GXv_int6[0] ;
      AV19Stat = GXt_int5 ;
      cleanup();
   }

   public void S111( )
   {
      /* 'MTO' Routine */
      returnInSub = false ;
      AV35HorNPro = "" ;
      /* Using cursor P05823 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV31Maqcod, Short.valueOf(AV32anyo), Byte.valueOf(AV33mes)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12435MaqMesM = P05823_A12435MaqMesM[0] ;
         A12434MaqAnyM = P05823_A12434MaqAnyM[0] ;
         A602MaqCod = P05823_A602MaqCod[0] ;
         A396EmprCod = P05823_A396EmprCod[0] ;
         A12427MaqMtoMes = P05823_A12427MaqMtoMes[0] ;
         n12427MaqMtoMes = P05823_n12427MaqMtoMes[0] ;
         AV35HorNPro = A12427MaqMtoMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'NOPLANIFICADO' Routine */
      returnInSub = false ;
      AV35HorNPro = "" ;
      /* Using cursor P05824 */
      pr_default.execute(2, new Object[] {AV13EmprCod, AV31Maqcod, Short.valueOf(AV32anyo), Byte.valueOf(AV33mes)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A12445MaqMesNP = P05824_A12445MaqMesNP[0] ;
         A12444MaqAnyNP = P05824_A12444MaqAnyNP[0] ;
         A602MaqCod = P05824_A602MaqCod[0] ;
         A396EmprCod = P05824_A396EmprCod[0] ;
         A12437MaqNPMes = P05824_A12437MaqNPMes[0] ;
         n12437MaqNPMes = P05824_n12437MaqNPMes[0] ;
         AV35HorNPro = A12437MaqNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pege001.this.AV13EmprCod;
      this.aP1[0] = pege001.this.AV10Fec1;
      this.aP2[0] = pege001.this.AV11Fec2;
      this.aP3[0] = pege001.this.AV26Hisprodti;
      this.aP4[0] = pege001.this.AV25Hisprodtf;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Carpeta = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV14NomInf = "" ;
      AV15File = "" ;
      GXv_int4 = new long[1] ;
      AV16Control = "" ;
      scmdbuf = "" ;
      P05822_A396EmprCod = new String[] {""} ;
      P05822_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05822_A3612HisProReo = new byte[1] ;
      P05822_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05822_A656ParCod = new short[1] ;
      P05822_n656ParCod = new boolean[] {false} ;
      P05822_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P05822_A602MaqCod = new String[] {""} ;
      P05822_A1011TipMaqCod = new String[] {""} ;
      P05822_n1011TipMaqCod = new boolean[] {false} ;
      P05822_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P05822_A1027MaqHhCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05822_n1027MaqHhCon = new boolean[] {false} ;
      P05822_A606MaqDsc = new String[] {""} ;
      P05822_n606MaqDsc = new boolean[] {false} ;
      P05822_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05822_n4440HisProDTI = new boolean[] {false} ;
      P05822_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P05822_n4441HisProDTF = new boolean[] {false} ;
      P05822_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05822_A561HisProLin = new int[1] ;
      A396EmprCod = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A10360HisProFd = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A1011TipMaqCod = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      A1027MaqHhCon = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV30Hispromtrr = DecimalUtil.ZERO ;
      AV29Hispromtr = DecimalUtil.ZERO ;
      AV50Hisprokgr = DecimalUtil.ZERO ;
      AV31Maqcod = "" ;
      AV35HorNPro = "" ;
      AV53HhMm = DecimalUtil.ZERO ;
      AV57Carga24Horas = DecimalUtil.ZERO ;
      AV44Disp = DecimalUtil.ZERO ;
      AV47MtsOk1 = DecimalUtil.ZERO ;
      AV51Metrosesp = DecimalUtil.ZERO ;
      AV45Rdto = DecimalUtil.ZERO ;
      AV48Calidad = DecimalUtil.ZERO ;
      AV49Ege = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      P05823_A12435MaqMesM = new byte[1] ;
      P05823_A12434MaqAnyM = new short[1] ;
      P05823_A602MaqCod = new String[] {""} ;
      P05823_A396EmprCod = new String[] {""} ;
      P05823_A12427MaqMtoMes = new String[] {""} ;
      P05823_n12427MaqMtoMes = new boolean[] {false} ;
      A12427MaqMtoMes = "" ;
      P05824_A12445MaqMesNP = new byte[1] ;
      P05824_A12444MaqAnyNP = new short[1] ;
      P05824_A602MaqCod = new String[] {""} ;
      P05824_A396EmprCod = new String[] {""} ;
      P05824_A12437MaqNPMes = new String[] {""} ;
      P05824_n12437MaqNPMes = new boolean[] {false} ;
      A12437MaqNPMes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pege001__default(),
         new Object[] {
             new Object[] {
            P05822_A396EmprCod, P05822_A1526HisProMtr, P05822_A3612HisProReo, P05822_A1525HisProKgr, P05822_A656ParCod, P05822_n656ParCod, P05822_A10360HisProFd, P05822_A602MaqCod, P05822_A1011TipMaqCod, P05822_n1011TipMaqCod,
            P05822_A5608HisProDf, P05822_A1027MaqHhCon, P05822_n1027MaqHhCon, P05822_A606MaqDsc, P05822_n606MaqDsc, P05822_A4440HisProDTI, P05822_n4440HisProDTI, P05822_A4441HisProDTF, P05822_n4441HisProDTF, P05822_A558HisProFec,
            P05822_A561HisProLin
            }
            , new Object[] {
            P05823_A12435MaqMesM, P05823_A12434MaqAnyM, P05823_A602MaqCod, P05823_A396EmprCod, P05823_A12427MaqMtoMes, P05823_n12427MaqMtoMes
            }
            , new Object[] {
            P05824_A12445MaqMesNP, P05824_A12444MaqAnyNP, P05824_A602MaqCod, P05824_A396EmprCod, P05824_A12437MaqNPMes, P05824_n12437MaqNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Stat ;
   private byte A3612HisProReo ;
   private byte AV33mes ;
   private byte AV34dia ;
   private byte AV36NDia ;
   private byte AV37Horas ;
   private byte AV56MinPar ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
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
   private long GXt_int3 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1027MaqHhCon ;
   private java.math.BigDecimal AV30Hispromtrr ;
   private java.math.BigDecimal AV29Hispromtr ;
   private java.math.BigDecimal AV50Hisprokgr ;
   private java.math.BigDecimal AV53HhMm ;
   private java.math.BigDecimal AV57Carga24Horas ;
   private java.math.BigDecimal AV44Disp ;
   private java.math.BigDecimal AV47MtsOk1 ;
   private java.math.BigDecimal AV51Metrosesp ;
   private java.math.BigDecimal AV45Rdto ;
   private java.math.BigDecimal AV48Calidad ;
   private java.math.BigDecimal AV49Ege ;
   private String AV13EmprCod ;
   private String AV12Carpeta ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV14NomInf ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1011TipMaqCod ;
   private String A606MaqDsc ;
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
   private boolean Cond_result ;
   private boolean brk5822 ;
   private boolean n656ParCod ;
   private boolean n1011TipMaqCod ;
   private boolean n1027MaqHhCon ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean returnInSub ;
   private boolean n12427MaqMtoMes ;
   private boolean n12437MaqNPMes ;
   private String AV15File ;
   private String AV16Control ;
   private java.util.Date[] aP4 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05822_A396EmprCod ;
   private java.math.BigDecimal[] P05822_A1526HisProMtr ;
   private byte[] P05822_A3612HisProReo ;
   private java.math.BigDecimal[] P05822_A1525HisProKgr ;
   private short[] P05822_A656ParCod ;
   private boolean[] P05822_n656ParCod ;
   private java.util.Date[] P05822_A10360HisProFd ;
   private String[] P05822_A602MaqCod ;
   private String[] P05822_A1011TipMaqCod ;
   private boolean[] P05822_n1011TipMaqCod ;
   private java.util.Date[] P05822_A5608HisProDf ;
   private java.math.BigDecimal[] P05822_A1027MaqHhCon ;
   private boolean[] P05822_n1027MaqHhCon ;
   private String[] P05822_A606MaqDsc ;
   private boolean[] P05822_n606MaqDsc ;
   private java.util.Date[] P05822_A4440HisProDTI ;
   private boolean[] P05822_n4440HisProDTI ;
   private java.util.Date[] P05822_A4441HisProDTF ;
   private boolean[] P05822_n4441HisProDTF ;
   private java.util.Date[] P05822_A558HisProFec ;
   private int[] P05822_A561HisProLin ;
   private byte[] P05823_A12435MaqMesM ;
   private short[] P05823_A12434MaqAnyM ;
   private String[] P05823_A602MaqCod ;
   private String[] P05823_A396EmprCod ;
   private String[] P05823_A12427MaqMtoMes ;
   private boolean[] P05823_n12427MaqMtoMes ;
   private byte[] P05824_A12445MaqMesNP ;
   private short[] P05824_A12444MaqAnyNP ;
   private String[] P05824_A602MaqCod ;
   private String[] P05824_A396EmprCod ;
   private String[] P05824_A12437MaqNPMes ;
   private boolean[] P05824_n12437MaqNPMes ;
}

final  class pege001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05822", "SELECT T1.EmprCod, T1.HisProMtr, T1.HisProReo, T1.HisProKgr, T1.ParCod, T1.HisProFd, T1.MaqCod, T2.TipMaqCod, T1.HisProDf, T2.MaqHhCon, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05823", "SELECT MaqMesM, MaqAnyM, MaqCod, EmprCod, MaqMtoMes FROM TXPMAQMT1 WHERE EmprCod = ? and MaqCod = ? and MaqAnyM = ? and MaqMesM = ? ORDER BY EmprCod, MaqCod, MaqAnyM, MaqMesM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05824", "SELECT MaqMesNP, MaqAnyNP, MaqCod, EmprCod, MaqNPMes FROM TXPMAQNP1 WHERE EmprCod = ? and MaqCod = ? and MaqAnyNP = ? and MaqMesNP = ? ORDER BY EmprCod, MaqCod, MaqAnyNP, MaqMesNP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 63);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

