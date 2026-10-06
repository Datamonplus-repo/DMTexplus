package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinmet extends GXProcedure
{
   public plinmet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinmet.class ), "" );
   }

   public plinmet( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            byte[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 )
   {
      plinmet.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 )
   {
      plinmet.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plinmet.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      plinmet.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      plinmet.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      plinmet.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      plinmet.this.A2524DisComLin = aP5[0];
      this.aP5 = aP5;
      plinmet.this.A1056DisComCod = aP6[0];
      this.aP6 = aP6;
      plinmet.this.A1032FonCod = aP7[0];
      this.aP7 = aP7;
      plinmet.this.AV16Trozo = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01MR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4334AlbEComUPz = P01MR2_A4334AlbEComUPz[0] ;
         n4334AlbEComUPz = P01MR2_n4334AlbEComUPz[0] ;
         if ( A4334AlbEComUPz <= 998 )
         {
            AV16Trozo = (short)(A4334AlbEComUPz+1) ;
            A4334AlbEComUPz = (short)(A4334AlbEComUPz+1) ;
            n4334AlbEComUPz = false ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha superado el numero de trozos", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P01MR3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n4334AlbEComUPz), Short.valueOf(A4334AlbEComUPz), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
            if (true) break;
         }
         /* Using cursor P01MR4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n4334AlbEComUPz), Short.valueOf(A4334AlbEComUPz), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinmet.this.A396EmprCod;
      this.aP1[0] = plinmet.this.A30AlbProCod;
      this.aP2[0] = plinmet.this.A129BarCod;
      this.aP3[0] = plinmet.this.A132BarCodReo;
      this.aP4[0] = plinmet.this.A130BarCodPar;
      this.aP5[0] = plinmet.this.A2524DisComLin;
      this.aP6[0] = plinmet.this.A1056DisComCod;
      this.aP7[0] = plinmet.this.A1032FonCod;
      this.aP8[0] = plinmet.this.AV16Trozo;
      Application.commitDataStores(context, remoteHandle, pr_default, "plinmet");
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
      P01MR2_A396EmprCod = new String[] {""} ;
      P01MR2_A30AlbProCod = new long[1] ;
      P01MR2_A129BarCod = new int[1] ;
      P01MR2_A132BarCodReo = new byte[1] ;
      P01MR2_A130BarCodPar = new String[] {""} ;
      P01MR2_A2524DisComLin = new byte[1] ;
      P01MR2_A1056DisComCod = new String[] {""} ;
      P01MR2_A1032FonCod = new String[] {""} ;
      P01MR2_A4334AlbEComUPz = new short[1] ;
      P01MR2_n4334AlbEComUPz = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinmet__default(),
         new Object[] {
             new Object[] {
            P01MR2_A396EmprCod, P01MR2_A30AlbProCod, P01MR2_A129BarCod, P01MR2_A132BarCodReo, P01MR2_A130BarCodPar, P01MR2_A2524DisComLin, P01MR2_A1056DisComCod, P01MR2_A1032FonCod, P01MR2_A4334AlbEComUPz, P01MR2_n4334AlbEComUPz
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private short AV16Trozo ;
   private short A4334AlbEComUPz ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String scmdbuf ;
   private boolean n4334AlbEComUPz ;
   private short[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01MR2_A396EmprCod ;
   private long[] P01MR2_A30AlbProCod ;
   private int[] P01MR2_A129BarCod ;
   private byte[] P01MR2_A132BarCodReo ;
   private String[] P01MR2_A130BarCodPar ;
   private byte[] P01MR2_A2524DisComLin ;
   private String[] P01MR2_A1056DisComCod ;
   private String[] P01MR2_A1032FonCod ;
   private short[] P01MR2_A4334AlbEComUPz ;
   private boolean[] P01MR2_n4334AlbEComUPz ;
}

final  class plinmet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01MR2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEComUPz FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01MR3", "UPDATE TXPALBEST SET AlbEComUPz=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new UpdateCursor("P01MR4", "UPDATE TXPALBEST SET AlbEComUPz=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 12);
               stmt.setString(9, (String)parms[9], 12);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 12);
               stmt.setString(9, (String)parms[9], 12);
               return;
      }
   }

}

