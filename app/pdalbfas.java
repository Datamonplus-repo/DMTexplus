package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdalbfas extends GXProcedure
{
   public pdalbfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdalbfas.class ), "" );
   }

   public pdalbfas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pdalbfas.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pdalbfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdalbfas.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pdalbfas.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pdalbfas.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pdalbfas.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01IX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1IX2 = false ;
         A457FasCod = P01IX2_A457FasCod[0] ;
         A1241GuiFasPKg = P01IX2_A1241GuiFasPKg[0] ;
         A1240GuiFasLin = P01IX2_A1240GuiFasLin[0] ;
         AV24EmprCod = A396EmprCod ;
         AV27AlbProCod = A30AlbProCod ;
         AV28BarCod = A129BarCod ;
         AV29BarCodReo = A132BarCodReo ;
         AV30BarCodPar = A130BarCodPar ;
         AV22FasCod = A457FasCod ;
         AV31j = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P01IX2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01IX2_A30AlbProCod[0] == A30AlbProCod ) && ( P01IX2_A129BarCod[0] == A129BarCod ) && ( P01IX2_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P01IX2_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P01IX2_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk1IX2 = false ;
            A1241GuiFasPKg = P01IX2_A1241GuiFasPKg[0] ;
            A1240GuiFasLin = P01IX2_A1240GuiFasLin[0] ;
            AV31j = (int)(AV31j+1) ;
            brk1IX2 = true ;
            pr_default.readNext(0);
         }
         if ( AV31j > 1 )
         {
            AV20i = 1 ;
            AV21Line_i = (int)(AV31j-1) ;
            while ( AV20i <= AV21Line_i )
            {
               /* Execute user subroutine: 'ELIMINO_FASE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV20i = (int)(AV20i+1) ;
            }
         }
         if ( ! brk1IX2 )
         {
            brk1IX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ELIMINO_FASE' Routine */
      returnInSub = false ;
      /* Using cursor P01IX3 */
      pr_default.execute(1, new Object[] {AV24EmprCod, Long.valueOf(AV27AlbProCod), Integer.valueOf(AV28BarCod), Byte.valueOf(AV29BarCodReo), AV30BarCodPar, AV22FasCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P01IX3_A457FasCod[0] ;
         A1240GuiFasLin = P01IX3_A1240GuiFasLin[0] ;
         /* Using cursor P01IX4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdalbfas.this.A396EmprCod;
      this.aP1[0] = pdalbfas.this.A30AlbProCod;
      this.aP2[0] = pdalbfas.this.A129BarCod;
      this.aP3[0] = pdalbfas.this.A132BarCodReo;
      this.aP4[0] = pdalbfas.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdalbfas");
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
      P01IX2_A396EmprCod = new String[] {""} ;
      P01IX2_A30AlbProCod = new long[1] ;
      P01IX2_A129BarCod = new int[1] ;
      P01IX2_A132BarCodReo = new byte[1] ;
      P01IX2_A130BarCodPar = new String[] {""} ;
      P01IX2_A457FasCod = new String[] {""} ;
      P01IX2_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01IX2_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV24EmprCod = "" ;
      AV30BarCodPar = "" ;
      AV22FasCod = "" ;
      P01IX3_A396EmprCod = new String[] {""} ;
      P01IX3_A30AlbProCod = new long[1] ;
      P01IX3_A129BarCod = new int[1] ;
      P01IX3_A132BarCodReo = new byte[1] ;
      P01IX3_A130BarCodPar = new String[] {""} ;
      P01IX3_A457FasCod = new String[] {""} ;
      P01IX3_A1240GuiFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdalbfas__default(),
         new Object[] {
             new Object[] {
            P01IX2_A396EmprCod, P01IX2_A30AlbProCod, P01IX2_A129BarCod, P01IX2_A132BarCodReo, P01IX2_A130BarCodPar, P01IX2_A457FasCod, P01IX2_A1241GuiFasPKg, P01IX2_A1240GuiFasLin
            }
            , new Object[] {
            P01IX3_A396EmprCod, P01IX3_A30AlbProCod, P01IX3_A129BarCod, P01IX3_A132BarCodReo, P01IX3_A130BarCodPar, P01IX3_A457FasCod, P01IX3_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV29BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV28BarCod ;
   private int AV31j ;
   private int AV20i ;
   private int AV21Line_i ;
   private long A30AlbProCod ;
   private long AV27AlbProCod ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String AV24EmprCod ;
   private String AV30BarCodPar ;
   private String AV22FasCod ;
   private boolean brk1IX2 ;
   private boolean returnInSub ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IX2_A396EmprCod ;
   private long[] P01IX2_A30AlbProCod ;
   private int[] P01IX2_A129BarCod ;
   private byte[] P01IX2_A132BarCodReo ;
   private String[] P01IX2_A130BarCodPar ;
   private String[] P01IX2_A457FasCod ;
   private java.math.BigDecimal[] P01IX2_A1241GuiFasPKg ;
   private short[] P01IX2_A1240GuiFasLin ;
   private String[] P01IX3_A396EmprCod ;
   private long[] P01IX3_A30AlbProCod ;
   private int[] P01IX3_A129BarCod ;
   private byte[] P01IX3_A132BarCodReo ;
   private String[] P01IX3_A130BarCodPar ;
   private String[] P01IX3_A457FasCod ;
   private short[] P01IX3_A1240GuiFasLin ;
}

final  class pdalbfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IX2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasPKg, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01IX3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and FasCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01IX4", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

