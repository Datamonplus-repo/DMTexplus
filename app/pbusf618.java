package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusf618 extends GXProcedure
{
   public pbusf618( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusf618.class ), "" );
   }

   public pbusf618( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pbusf618.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 )
   {
      pbusf618.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusf618.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbusf618.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      pbusf618.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      pbusf618.this.AV89AlbImpMan = aP4[0];
      this.aP4 = aP4;
      pbusf618.this.AV97Fase618 = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV91TopeK ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TOPEKG", ""), GXv_int2) ;
      pbusf618.this.GXt_int1 = GXv_int2[0] ;
      AV91TopeK = GXt_int1 ;
      AV92TopeKgs = DecimalUtil.doubleToDec(AV91TopeK) ;
      GXt_int1 = AV93ImpKg ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "IMPMKG", ""), GXv_int2) ;
      pbusf618.this.GXt_int1 = GXv_int2[0] ;
      AV93ImpKg = GXt_int1 ;
      AV94ImpKgs = DecimalUtil.doubleToDec(AV93ImpKg) ;
      AV95Precio_Acc = (byte)(0) ;
      AV97Fase618 = httpContext.getMessage( "N", "") ;
      AV89AlbImpMan = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02DF2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02DF2_A130BarCodPar[0] ;
         A132BarCodReo = P02DF2_A132BarCodReo[0] ;
         A129BarCod = P02DF2_A129BarCod[0] ;
         A396EmprCod = P02DF2_A396EmprCod[0] ;
         A227BarUni = P02DF2_A227BarUni[0] ;
         A252CliCod = P02DF2_A252CliCod[0] ;
         n252CliCod = P02DF2_n252CliCod[0] ;
         A457FasCod = P02DF2_A457FasCod[0] ;
         A194BarOrdLin = P02DF2_A194BarOrdLin[0] ;
         A758ProCod = P02DF2_A758ProCod[0] ;
         A252CliCod = P02DF2_A252CliCod[0] ;
         n252CliCod = P02DF2_n252CliCod[0] ;
         AV35CliCod = A252CliCod ;
         AV37FasCod = A457FasCod ;
         /* Execute user subroutine: 'PREFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV95Precio_Acc == 1 )
         {
            AV97Fase618 = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02DF4 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02DF4_A130BarCodPar[0] ;
         A132BarCodReo = P02DF4_A132BarCodReo[0] ;
         A129BarCod = P02DF4_A129BarCod[0] ;
         A396EmprCod = P02DF4_A396EmprCod[0] ;
         A166BarKgm = P02DF4_A166BarKgm[0] ;
         n166BarKgm = P02DF4_n166BarKgm[0] ;
         A166BarKgm = P02DF4_A166BarKgm[0] ;
         n166BarKgm = P02DF4_n166BarKgm[0] ;
         if ( AV95Precio_Acc == 1 )
         {
            AV89AlbImpMan = AV38FasPreKgm ;
         }
         if ( ( AV95Precio_Acc == 1 ) && ( DecimalUtil.compareTo(A166BarKgm, AV92TopeKgs) > 0 ) )
         {
            Gx_msg = httpContext.getMessage( "Esta OS ", "") + GXutil.str( AV16BarCod, 8, 0) + "-" + GXutil.str( AV17BarReo, 1, 0) + AV18BarPar + GXutil.newLine( ) + httpContext.getMessage( "tem a fase 618 TINGIMENTO DE ACESSÓRIOS", "") + GXutil.newLine( ) + httpContext.getMessage( "e os quilos ", "") + GXutil.str( A166BarKgm, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "es superior a ", "") + GXutil.str( AV92TopeKgs, 9, 2) + GXutil.newLine( ) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV95Precio_Acc = (byte)(0) ;
      AV38FasPreKgm = DecimalUtil.doubleToDec(0) ;
      AV39FasPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02DF5 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV37FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P02DF5_A457FasCod[0] ;
         A252CliCod = P02DF5_A252CliCod[0] ;
         n252CliCod = P02DF5_n252CliCod[0] ;
         A396EmprCod = P02DF5_A396EmprCod[0] ;
         A10882FasPreU = P02DF5_A10882FasPreU[0] ;
         n10882FasPreU = P02DF5_n10882FasPreU[0] ;
         A466FasPreKgm = P02DF5_A466FasPreKgm[0] ;
         n466FasPreKgm = P02DF5_n466FasPreKgm[0] ;
         A467FasPreMtr = P02DF5_A467FasPreMtr[0] ;
         n467FasPreMtr = P02DF5_n467FasPreMtr[0] ;
         AV95Precio_Acc = A10882FasPreU ;
         AV38FasPreKgm = A466FasPreKgm ;
         AV39FasPreMtr = A467FasPreMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusf618.this.AV15EmprCod;
      this.aP1[0] = pbusf618.this.AV16BarCod;
      this.aP2[0] = pbusf618.this.AV17BarReo;
      this.aP3[0] = pbusf618.this.AV18BarPar;
      this.aP4[0] = pbusf618.this.AV89AlbImpMan;
      this.aP5[0] = pbusf618.this.AV97Fase618;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV92TopeKgs = DecimalUtil.ZERO ;
      GXv_int2 = new int[1] ;
      AV94ImpKgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02DF2_A130BarCodPar = new String[] {""} ;
      P02DF2_A132BarCodReo = new byte[1] ;
      P02DF2_A129BarCod = new int[1] ;
      P02DF2_A396EmprCod = new String[] {""} ;
      P02DF2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DF2_A252CliCod = new int[1] ;
      P02DF2_n252CliCod = new boolean[] {false} ;
      P02DF2_A457FasCod = new String[] {""} ;
      P02DF2_A194BarOrdLin = new short[1] ;
      P02DF2_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV37FasCod = "" ;
      P02DF4_A130BarCodPar = new String[] {""} ;
      P02DF4_A132BarCodReo = new byte[1] ;
      P02DF4_A129BarCod = new int[1] ;
      P02DF4_A396EmprCod = new String[] {""} ;
      P02DF4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DF4_n166BarKgm = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV38FasPreKgm = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV39FasPreMtr = DecimalUtil.ZERO ;
      P02DF5_A457FasCod = new String[] {""} ;
      P02DF5_A252CliCod = new int[1] ;
      P02DF5_n252CliCod = new boolean[] {false} ;
      P02DF5_A396EmprCod = new String[] {""} ;
      P02DF5_A10882FasPreU = new byte[1] ;
      P02DF5_n10882FasPreU = new boolean[] {false} ;
      P02DF5_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DF5_n466FasPreKgm = new boolean[] {false} ;
      P02DF5_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02DF5_n467FasPreMtr = new boolean[] {false} ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusf618__default(),
         new Object[] {
             new Object[] {
            P02DF2_A130BarCodPar, P02DF2_A132BarCodReo, P02DF2_A129BarCod, P02DF2_A396EmprCod, P02DF2_A227BarUni, P02DF2_A252CliCod, P02DF2_n252CliCod, P02DF2_A457FasCod, P02DF2_A194BarOrdLin, P02DF2_A758ProCod
            }
            , new Object[] {
            P02DF4_A130BarCodPar, P02DF4_A132BarCodReo, P02DF4_A129BarCod, P02DF4_A396EmprCod, P02DF4_A166BarKgm, P02DF4_n166BarKgm
            }
            , new Object[] {
            P02DF5_A457FasCod, P02DF5_A252CliCod, P02DF5_A396EmprCod, P02DF5_A10882FasPreU, P02DF5_n10882FasPreU, P02DF5_A466FasPreKgm, P02DF5_n466FasPreKgm, P02DF5_A467FasPreMtr, P02DF5_n467FasPreMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV95Precio_Acc ;
   private byte A132BarCodReo ;
   private byte A10882FasPreU ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV91TopeK ;
   private int AV93ImpKg ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV35CliCod ;
   private java.math.BigDecimal AV89AlbImpMan ;
   private java.math.BigDecimal AV92TopeKgs ;
   private java.math.BigDecimal AV94ImpKgs ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV38FasPreKgm ;
   private java.math.BigDecimal AV39FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV97Fase618 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV37FasCod ;
   private String Gx_msg ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n166BarKgm ;
   private boolean n10882FasPreU ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DF2_A130BarCodPar ;
   private byte[] P02DF2_A132BarCodReo ;
   private int[] P02DF2_A129BarCod ;
   private String[] P02DF2_A396EmprCod ;
   private java.math.BigDecimal[] P02DF2_A227BarUni ;
   private int[] P02DF2_A252CliCod ;
   private boolean[] P02DF2_n252CliCod ;
   private String[] P02DF2_A457FasCod ;
   private short[] P02DF2_A194BarOrdLin ;
   private String[] P02DF2_A758ProCod ;
   private String[] P02DF4_A130BarCodPar ;
   private byte[] P02DF4_A132BarCodReo ;
   private int[] P02DF4_A129BarCod ;
   private String[] P02DF4_A396EmprCod ;
   private java.math.BigDecimal[] P02DF4_A166BarKgm ;
   private boolean[] P02DF4_n166BarKgm ;
   private String[] P02DF5_A457FasCod ;
   private int[] P02DF5_A252CliCod ;
   private boolean[] P02DF5_n252CliCod ;
   private String[] P02DF5_A396EmprCod ;
   private byte[] P02DF5_A10882FasPreU ;
   private boolean[] P02DF5_n10882FasPreU ;
   private java.math.BigDecimal[] P02DF5_A466FasPreKgm ;
   private boolean[] P02DF5_n466FasPreKgm ;
   private java.math.BigDecimal[] P02DF5_A467FasPreMtr ;
   private boolean[] P02DF5_n467FasPreMtr ;
}

final  class pbusf618__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DF2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarUni, T2.CliCod, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02DF4", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02DF5", "SELECT FasCod, CliCod, EmprCod, FasPreU, FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

