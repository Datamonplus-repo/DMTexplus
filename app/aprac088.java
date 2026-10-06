package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprac088 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprac088 pgm = new aprac088 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aprac088( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprac088.class ), "" );
   }

   public aprac088( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03WV2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P03WV2_A396EmprCod[0] ;
         A6039RecAcab = P03WV2_A6039RecAcab[0] ;
         n6039RecAcab = P03WV2_n6039RecAcab[0] ;
         A4268RecOrdLin = P03WV2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P03WV2_n4268RecOrdLin[0] ;
         A129BarCod = P03WV2_A129BarCod[0] ;
         A132BarCodReo = P03WV2_A132BarCodReo[0] ;
         A130BarCodPar = P03WV2_A130BarCodPar[0] ;
         A9998RecAnc = P03WV2_A9998RecAnc[0] ;
         n9998RecAnc = P03WV2_n9998RecAnc[0] ;
         A9997Recgrm = P03WV2_A9997Recgrm[0] ;
         n9997Recgrm = P03WV2_n9997Recgrm[0] ;
         A9996RecObsq = P03WV2_A9996RecObsq[0] ;
         n9996RecObsq = P03WV2_n9996RecObsq[0] ;
         A5115RecAbsFac = P03WV2_A5115RecAbsFac[0] ;
         A11507RecAva = P03WV2_A11507RecAva[0] ;
         n11507RecAva = P03WV2_n11507RecAva[0] ;
         A12128RecAs = P03WV2_A12128RecAs[0] ;
         n12128RecAs = P03WV2_n12128RecAs[0] ;
         A12129RecAi = P03WV2_A12129RecAi[0] ;
         n12129RecAi = P03WV2_n12129RecAi[0] ;
         A2804RecLinMaq = P03WV2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8Recordlin = A4268RecOrdLin ;
            AV23Barcod = A129BarCod ;
            AV24Barcodreo = A132BarCodReo ;
            AV25Barcodpar = A130BarCodPar ;
            /* Execute user subroutine: 'FASQUI' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A9998RecAnc = AV9FasQuiAnc ;
            n9998RecAnc = false ;
            A9997Recgrm = AV10FasQuiGrm ;
            n9997Recgrm = false ;
            A9996RecObsq = GXutil.substring( AV11FasQuiObs, 0, 799) ;
            n9996RecObsq = false ;
            A5115RecAbsFac = AV12FasQUivel ;
            A11507RecAva = AV17FasQuiAv ;
            n11507RecAva = false ;
            A12128RecAs = AV19FasQuiAs ;
            n12128RecAs = false ;
            A12129RecAi = AV18FasQuiAI ;
            n12129RecAi = false ;
            /* Using cursor P03WV3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n9998RecAnc), Short.valueOf(A9998RecAnc), Boolean.valueOf(n9997Recgrm), Short.valueOf(A9997Recgrm), Boolean.valueOf(n9996RecObsq), A9996RecObsq, A5115RecAbsFac, Boolean.valueOf(n11507RecAva), A11507RecAva, Boolean.valueOf(n12128RecAs), A12128RecAs, Boolean.valueOf(n12129RecAi), A12129RecAi, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      AV9FasQuiAnc = (short)(0) ;
      AV10FasQuiGrm = (short)(0) ;
      AV16RecObsq = " " ;
      AV12FasQUivel = DecimalUtil.doubleToDec(0) ;
      AV18FasQuiAI = " " ;
      AV19FasQuiAs = " " ;
      /* Using cursor P03WV4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV23Barcod), Byte.valueOf(AV24Barcodreo), AV25Barcodpar, Short.valueOf(AV8Recordlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P03WV4_A194BarOrdLin[0] ;
         A130BarCodPar = P03WV4_A130BarCodPar[0] ;
         A132BarCodReo = P03WV4_A132BarCodReo[0] ;
         A129BarCod = P03WV4_A129BarCod[0] ;
         A396EmprCod = P03WV4_A396EmprCod[0] ;
         A6663FasQuiAnc = P03WV4_A6663FasQuiAnc[0] ;
         A6664FasQuiGrm = P03WV4_A6664FasQuiGrm[0] ;
         A6665FasQuiObs = P03WV4_A6665FasQuiObs[0] ;
         A9722FasQuiVel = P03WV4_A9722FasQuiVel[0] ;
         A11506FasQuiAv = P03WV4_A11506FasQuiAv[0] ;
         A12125FasQuiAI = P03WV4_A12125FasQuiAI[0] ;
         A12124FasQuiAs = P03WV4_A12124FasQuiAs[0] ;
         A5371FasQuiLin = P03WV4_A5371FasQuiLin[0] ;
         A758ProCod = P03WV4_A758ProCod[0] ;
         AV9FasQuiAnc = A6663FasQuiAnc ;
         AV10FasQuiGrm = A6664FasQuiGrm ;
         AV11FasQuiObs = A6665FasQuiObs ;
         AV12FasQUivel = A9722FasQuiVel ;
         AV17FasQuiAv = A11506FasQuiAv ;
         AV18FasQuiAI = A12125FasQuiAI ;
         AV19FasQuiAs = A12124FasQuiAs ;
         AV13Nlin = (short)(GXutil.gxmlines( AV11FasQuiObs, (short)(80))) ;
         AV15i = (short)(1) ;
         while ( AV15i <= AV13Nlin )
         {
            AV14Obs = GXutil.gxgetmli( AV11FasQuiObs, AV15i, (short)(80)) ;
            AV16RecObsq += AV14Obs ;
            AV15i = (short)(AV15i+1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(prac088.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aprac088");
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
      P03WV2_A396EmprCod = new String[] {""} ;
      P03WV2_A6039RecAcab = new String[] {""} ;
      P03WV2_n6039RecAcab = new boolean[] {false} ;
      P03WV2_A4268RecOrdLin = new short[1] ;
      P03WV2_n4268RecOrdLin = new boolean[] {false} ;
      P03WV2_A129BarCod = new int[1] ;
      P03WV2_A132BarCodReo = new byte[1] ;
      P03WV2_A130BarCodPar = new String[] {""} ;
      P03WV2_A9998RecAnc = new short[1] ;
      P03WV2_n9998RecAnc = new boolean[] {false} ;
      P03WV2_A9997Recgrm = new short[1] ;
      P03WV2_n9997Recgrm = new boolean[] {false} ;
      P03WV2_A9996RecObsq = new String[] {""} ;
      P03WV2_n9996RecObsq = new boolean[] {false} ;
      P03WV2_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03WV2_A11507RecAva = new String[] {""} ;
      P03WV2_n11507RecAva = new boolean[] {false} ;
      P03WV2_A12128RecAs = new String[] {""} ;
      P03WV2_n12128RecAs = new boolean[] {false} ;
      P03WV2_A12129RecAi = new String[] {""} ;
      P03WV2_n12129RecAi = new boolean[] {false} ;
      P03WV2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      A9996RecObsq = "" ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A11507RecAva = "" ;
      A12128RecAs = "" ;
      A12129RecAi = "" ;
      AV25Barcodpar = "" ;
      AV11FasQuiObs = "" ;
      AV12FasQUivel = DecimalUtil.ZERO ;
      AV17FasQuiAv = "" ;
      AV19FasQuiAs = "" ;
      AV18FasQuiAI = "" ;
      AV16RecObsq = "" ;
      P03WV4_A194BarOrdLin = new short[1] ;
      P03WV4_A130BarCodPar = new String[] {""} ;
      P03WV4_A132BarCodReo = new byte[1] ;
      P03WV4_A129BarCod = new int[1] ;
      P03WV4_A396EmprCod = new String[] {""} ;
      P03WV4_A6663FasQuiAnc = new short[1] ;
      P03WV4_A6664FasQuiGrm = new short[1] ;
      P03WV4_A6665FasQuiObs = new String[] {""} ;
      P03WV4_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03WV4_A11506FasQuiAv = new String[] {""} ;
      P03WV4_A12125FasQuiAI = new String[] {""} ;
      P03WV4_A12124FasQuiAs = new String[] {""} ;
      P03WV4_A5371FasQuiLin = new short[1] ;
      P03WV4_A758ProCod = new String[] {""} ;
      A6665FasQuiObs = "" ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A11506FasQuiAv = "" ;
      A12125FasQuiAI = "" ;
      A12124FasQuiAs = "" ;
      A758ProCod = "" ;
      AV14Obs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprac088__default(),
         new Object[] {
             new Object[] {
            P03WV2_A396EmprCod, P03WV2_A6039RecAcab, P03WV2_n6039RecAcab, P03WV2_A4268RecOrdLin, P03WV2_n4268RecOrdLin, P03WV2_A129BarCod, P03WV2_A132BarCodReo, P03WV2_A130BarCodPar, P03WV2_A9998RecAnc, P03WV2_n9998RecAnc,
            P03WV2_A9997Recgrm, P03WV2_n9997Recgrm, P03WV2_A9996RecObsq, P03WV2_n9996RecObsq, P03WV2_A5115RecAbsFac, P03WV2_A11507RecAva, P03WV2_n11507RecAva, P03WV2_A12128RecAs, P03WV2_n12128RecAs, P03WV2_A12129RecAi,
            P03WV2_n12129RecAi, P03WV2_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            P03WV4_A194BarOrdLin, P03WV4_A130BarCodPar, P03WV4_A132BarCodReo, P03WV4_A129BarCod, P03WV4_A396EmprCod, P03WV4_A6663FasQuiAnc, P03WV4_A6664FasQuiGrm, P03WV4_A6665FasQuiObs, P03WV4_A9722FasQuiVel, P03WV4_A11506FasQuiAv,
            P03WV4_A12125FasQuiAI, P03WV4_A12124FasQuiAs, P03WV4_A5371FasQuiLin, P03WV4_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV24Barcodreo ;
   private short A4268RecOrdLin ;
   private short A9998RecAnc ;
   private short A9997Recgrm ;
   private short A2804RecLinMaq ;
   private short AV8Recordlin ;
   private short AV9FasQuiAnc ;
   private short AV10FasQuiGrm ;
   private short A194BarOrdLin ;
   private short A6663FasQuiAnc ;
   private short A6664FasQuiGrm ;
   private short A5371FasQuiLin ;
   private short AV13Nlin ;
   private short AV15i ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV23Barcod ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal AV12FasQUivel ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String A11507RecAva ;
   private String A12128RecAs ;
   private String A12129RecAi ;
   private String AV25Barcodpar ;
   private String AV17FasQuiAv ;
   private String AV19FasQuiAs ;
   private String AV18FasQuiAI ;
   private String A11506FasQuiAv ;
   private String A12125FasQuiAI ;
   private String A12124FasQuiAs ;
   private String A758ProCod ;
   private String AV14Obs ;
   private boolean n6039RecAcab ;
   private boolean n4268RecOrdLin ;
   private boolean n9998RecAnc ;
   private boolean n9997Recgrm ;
   private boolean n9996RecObsq ;
   private boolean n11507RecAva ;
   private boolean n12128RecAs ;
   private boolean n12129RecAi ;
   private boolean returnInSub ;
   private String A9996RecObsq ;
   private String AV11FasQuiObs ;
   private String AV16RecObsq ;
   private String A6665FasQuiObs ;
   private IDataStoreProvider pr_default ;
   private String[] P03WV2_A396EmprCod ;
   private String[] P03WV2_A6039RecAcab ;
   private boolean[] P03WV2_n6039RecAcab ;
   private short[] P03WV2_A4268RecOrdLin ;
   private boolean[] P03WV2_n4268RecOrdLin ;
   private int[] P03WV2_A129BarCod ;
   private byte[] P03WV2_A132BarCodReo ;
   private String[] P03WV2_A130BarCodPar ;
   private short[] P03WV2_A9998RecAnc ;
   private boolean[] P03WV2_n9998RecAnc ;
   private short[] P03WV2_A9997Recgrm ;
   private boolean[] P03WV2_n9997Recgrm ;
   private String[] P03WV2_A9996RecObsq ;
   private boolean[] P03WV2_n9996RecObsq ;
   private java.math.BigDecimal[] P03WV2_A5115RecAbsFac ;
   private String[] P03WV2_A11507RecAva ;
   private boolean[] P03WV2_n11507RecAva ;
   private String[] P03WV2_A12128RecAs ;
   private boolean[] P03WV2_n12128RecAs ;
   private String[] P03WV2_A12129RecAi ;
   private boolean[] P03WV2_n12129RecAi ;
   private short[] P03WV2_A2804RecLinMaq ;
   private short[] P03WV4_A194BarOrdLin ;
   private String[] P03WV4_A130BarCodPar ;
   private byte[] P03WV4_A132BarCodReo ;
   private int[] P03WV4_A129BarCod ;
   private String[] P03WV4_A396EmprCod ;
   private short[] P03WV4_A6663FasQuiAnc ;
   private short[] P03WV4_A6664FasQuiGrm ;
   private String[] P03WV4_A6665FasQuiObs ;
   private java.math.BigDecimal[] P03WV4_A9722FasQuiVel ;
   private String[] P03WV4_A11506FasQuiAv ;
   private String[] P03WV4_A12125FasQuiAI ;
   private String[] P03WV4_A12124FasQuiAs ;
   private short[] P03WV4_A5371FasQuiLin ;
   private String[] P03WV4_A758ProCod ;
}

final  class aprac088__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WV2", "SELECT EmprCod, RecAcab, RecOrdLin, BarCod, BarCodReo, BarCodPar, RecAnc, Recgrm, RecObsq, RecAbsFac, RecAva, RecAs, RecAi, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = '001' ORDER BY EmprCod, RecAcab ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03WV3", "UPDATE TXPRECMAQ SET RecAnc=?, Recgrm=?, RecObsq=?, RecAbsFac=?, RecAva=?, RecAs=?, RecAi=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P03WV4", "SELECT BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAI, FasQuiAs, FasQuiLin, ProCod FROM TXPFASQUI WHERE (EmprCod = '001' and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[15])[0] = rslt.getString(11, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,1);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 800);
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 3);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 3);
               }
               stmt.setString(8, (String)parms[13], 3);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               stmt.setByte(10, ((Number) parms[15]).byteValue());
               stmt.setString(11, (String)parms[16], 1);
               stmt.setShort(12, ((Number) parms[17]).shortValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

