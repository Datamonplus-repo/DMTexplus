package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgasopr extends GXProcedure
{
   public pgasopr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgasopr.class ), "" );
   }

   public pgasopr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      pgasopr.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pgasopr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgasopr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgasopr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgasopr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgasopr.this.AV15GasOpeR = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15GasOpeR = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00ZB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A561HisProLin = P00ZB2_A561HisProLin[0] ;
         A558HisProFec = P00ZB2_A558HisProFec[0] ;
         A602MaqCod = P00ZB2_A602MaqCod[0] ;
         A503GruOpeCod = P00ZB2_A503GruOpeCod[0] ;
         A656ParCod = P00ZB2_A656ParCod[0] ;
         n656ParCod = P00ZB2_n656ParCod[0] ;
         A556HisProEst = P00ZB2_A556HisProEst[0] ;
         A461Fase = P00ZB2_A461Fase[0] ;
         A3915EmpNumDec = P00ZB2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ZB2_n3915EmpNumDec[0] ;
         A563HisProMin = P00ZB2_A563HisProMin[0] ;
         A560HisProHin = P00ZB2_A560HisProHin[0] ;
         A562HisProMfi = P00ZB2_A562HisProMfi[0] ;
         A559HisProHfi = P00ZB2_A559HisProHfi[0] ;
         A3915EmpNumDec = P00ZB2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00ZB2_n3915EmpNumDec[0] ;
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         AV19Fase = A461Fase ;
         /* Execute user subroutine: 'FASPRO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV18Reparto, httpContext.getMessage( "R", "")) == 0 )
         {
            /* Using cursor P00ZB3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A652OpeCod = P00ZB3_A652OpeCod[0] ;
               n652OpeCod = P00ZB3_n652OpeCod[0] ;
               A2505OpePreHor = P00ZB3_A2505OpePreHor[0] ;
               n2505OpePreHor = P00ZB3_n2505OpePreHor[0] ;
               A10486Abh_cod = P00ZB3_A10486Abh_cod[0] ;
               A10481Abh_lin = P00ZB3_A10481Abh_lin[0] ;
               A2505OpePreHor = P00ZB3_A2505OpePreHor[0] ;
               n2505OpePreHor = P00ZB3_n2505OpePreHor[0] ;
               AV16OpePreHor = A2505OpePreHor ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( A3915EmpNumDec == 0 )
            {
               AV15GasOpeR = AV15GasOpeR.add(GXutil.roundDecimal( DecimalUtil.doubleToDec((A564HisProTre/ (double) (60))).multiply(AV16OpePreHor), 0)) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  AV15GasOpeR = AV15GasOpeR.add(GXutil.roundDecimal( DecimalUtil.doubleToDec((A564HisProTre/ (double) (60))).multiply(AV16OpePreHor), 2)) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV18Reparto = " " ;
      /* Using cursor P00ZB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV19Fase});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P00ZB4_A457FasCod[0] ;
         A456FasActTin = P00ZB4_A456FasActTin[0] ;
         n456FasActTin = P00ZB4_n456FasActTin[0] ;
         AV18Reparto = A456FasActTin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgasopr.this.A396EmprCod;
      this.aP1[0] = pgasopr.this.A129BarCod;
      this.aP2[0] = pgasopr.this.A132BarCodReo;
      this.aP3[0] = pgasopr.this.A130BarCodPar;
      this.aP4[0] = pgasopr.this.AV15GasOpeR;
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
      P00ZB2_A396EmprCod = new String[] {""} ;
      P00ZB2_A129BarCod = new int[1] ;
      P00ZB2_A132BarCodReo = new byte[1] ;
      P00ZB2_A130BarCodPar = new String[] {""} ;
      P00ZB2_A561HisProLin = new int[1] ;
      P00ZB2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00ZB2_A602MaqCod = new String[] {""} ;
      P00ZB2_A503GruOpeCod = new int[1] ;
      P00ZB2_A656ParCod = new short[1] ;
      P00ZB2_n656ParCod = new boolean[] {false} ;
      P00ZB2_A556HisProEst = new byte[1] ;
      P00ZB2_A461Fase = new String[] {""} ;
      P00ZB2_A3915EmpNumDec = new byte[1] ;
      P00ZB2_n3915EmpNumDec = new boolean[] {false} ;
      P00ZB2_A563HisProMin = new byte[1] ;
      P00ZB2_A560HisProHin = new byte[1] ;
      P00ZB2_A562HisProMfi = new byte[1] ;
      P00ZB2_A559HisProHfi = new byte[1] ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      A461Fase = "" ;
      AV19Fase = "" ;
      AV18Reparto = "" ;
      P00ZB3_A396EmprCod = new String[] {""} ;
      P00ZB3_A602MaqCod = new String[] {""} ;
      P00ZB3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00ZB3_A561HisProLin = new int[1] ;
      P00ZB3_A652OpeCod = new int[1] ;
      P00ZB3_n652OpeCod = new boolean[] {false} ;
      P00ZB3_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZB3_n2505OpePreHor = new boolean[] {false} ;
      P00ZB3_A10486Abh_cod = new String[] {""} ;
      P00ZB3_A10481Abh_lin = new int[1] ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A10486Abh_cod = "" ;
      AV16OpePreHor = DecimalUtil.ZERO ;
      P00ZB4_A396EmprCod = new String[] {""} ;
      P00ZB4_A457FasCod = new String[] {""} ;
      P00ZB4_A456FasActTin = new String[] {""} ;
      P00ZB4_n456FasActTin = new boolean[] {false} ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgasopr__default(),
         new Object[] {
             new Object[] {
            P00ZB2_A396EmprCod, P00ZB2_A129BarCod, P00ZB2_A132BarCodReo, P00ZB2_A130BarCodPar, P00ZB2_A561HisProLin, P00ZB2_A558HisProFec, P00ZB2_A602MaqCod, P00ZB2_A503GruOpeCod, P00ZB2_A656ParCod, P00ZB2_n656ParCod,
            P00ZB2_A556HisProEst, P00ZB2_A461Fase, P00ZB2_A3915EmpNumDec, P00ZB2_n3915EmpNumDec, P00ZB2_A563HisProMin, P00ZB2_A560HisProHin, P00ZB2_A562HisProMfi, P00ZB2_A559HisProHfi
            }
            , new Object[] {
            P00ZB3_A396EmprCod, P00ZB3_A602MaqCod, P00ZB3_A558HisProFec, P00ZB3_A561HisProLin, P00ZB3_A652OpeCod, P00ZB3_n652OpeCod, P00ZB3_A2505OpePreHor, P00ZB3_n2505OpePreHor, P00ZB3_A10486Abh_cod, P00ZB3_A10481Abh_lin
            }
            , new Object[] {
            P00ZB4_A396EmprCod, P00ZB4_A457FasCod, P00ZB4_A456FasActTin, P00ZB4_n456FasActTin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A556HisProEst ;
   private byte A3915EmpNumDec ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A652OpeCod ;
   private int A10481Abh_lin ;
   private java.math.BigDecimal AV15GasOpeR ;
   private java.math.BigDecimal A2505OpePreHor ;
   private java.math.BigDecimal AV16OpePreHor ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String AV19Fase ;
   private String AV18Reparto ;
   private String A10486Abh_cod ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private boolean n652OpeCod ;
   private boolean n2505OpePreHor ;
   private boolean n456FasActTin ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZB2_A396EmprCod ;
   private int[] P00ZB2_A129BarCod ;
   private byte[] P00ZB2_A132BarCodReo ;
   private String[] P00ZB2_A130BarCodPar ;
   private int[] P00ZB2_A561HisProLin ;
   private java.util.Date[] P00ZB2_A558HisProFec ;
   private String[] P00ZB2_A602MaqCod ;
   private int[] P00ZB2_A503GruOpeCod ;
   private short[] P00ZB2_A656ParCod ;
   private boolean[] P00ZB2_n656ParCod ;
   private byte[] P00ZB2_A556HisProEst ;
   private String[] P00ZB2_A461Fase ;
   private byte[] P00ZB2_A3915EmpNumDec ;
   private boolean[] P00ZB2_n3915EmpNumDec ;
   private byte[] P00ZB2_A563HisProMin ;
   private byte[] P00ZB2_A560HisProHin ;
   private byte[] P00ZB2_A562HisProMfi ;
   private byte[] P00ZB2_A559HisProHfi ;
   private String[] P00ZB3_A396EmprCod ;
   private String[] P00ZB3_A602MaqCod ;
   private java.util.Date[] P00ZB3_A558HisProFec ;
   private int[] P00ZB3_A561HisProLin ;
   private int[] P00ZB3_A652OpeCod ;
   private boolean[] P00ZB3_n652OpeCod ;
   private java.math.BigDecimal[] P00ZB3_A2505OpePreHor ;
   private boolean[] P00ZB3_n2505OpePreHor ;
   private String[] P00ZB3_A10486Abh_cod ;
   private int[] P00ZB3_A10481Abh_lin ;
   private String[] P00ZB4_A396EmprCod ;
   private String[] P00ZB4_A457FasCod ;
   private String[] P00ZB4_A456FasActTin ;
   private boolean[] P00ZB4_n456FasActTin ;
}

final  class pgasopr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZB2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProLin, T1.HisProFec, T1.MaqCod, T1.GruOpeCod, T1.ParCod, T1.HisProEst, T1.Fase, T2.EmpNumDec, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi FROM (TXPLHIPRO T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.ParCod = 0) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZB3", "SELECT T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin, T1.OpeCod, T2.OpePreHor, T1.Abh_cod, T1.Abh_lin FROM (TXPCAAB01 T1 LEFT JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OpeCod) WHERE (T1.EmprCod = ? and T1.OpeCod = ?) AND (T1.MaqCod = ?) AND (T1.HisProFec = ?) AND (T1.HisProLin = ?) ORDER BY T1.EmprCod, T1.OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00ZB4", "SELECT EmprCod, FasCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

