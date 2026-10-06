package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbpkbc extends GXProcedure
{
   public palbpkbc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbpkbc.class ), "" );
   }

   public palbpkbc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      palbpkbc.this.aP5 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 )
   {
      palbpkbc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbpkbc.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      palbpkbc.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      palbpkbc.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbpkbc.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbpkbc.this.AV9AlbProCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Texto = httpContext.getMessage( "Cargando Packing para Nof: ", "") + GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " en Albaran : ", "") + GXutil.str( AV9AlbProCod, 10, 0) ;
      System.out.println( AV12Texto );
      /* Using cursor P02872 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P02872_A30AlbProCod[0] ;
         A3829AlbPckUlin = P02872_A3829AlbPckUlin[0] ;
         n3829AlbPckUlin = P02872_n3829AlbPckUlin[0] ;
         AV10AlbPckUlin = A3829AlbPckUlin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02873 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2813MetPieCod = P02873_A2813MetPieCod[0] ;
         A2814MetPieKil = P02873_A2814MetPieKil[0] ;
         A2815MetPieMet = P02873_A2815MetPieMet[0] ;
         A6635MetPieAnc = P02873_A6635MetPieAnc[0] ;
         A4910MetPieMtD = P02873_A4910MetPieMtD[0] ;
         A2816MetPieEst = P02873_A2816MetPieEst[0] ;
         A2816MetPieEst = (byte)(1) ;
         AV10AlbPckUlin = (short)(AV10AlbPckUlin+1) ;
         /*
            INSERT RECORD ON TABLE TXPALBPCK

         */
         A3621AlbPckLin = AV10AlbPckUlin ;
         A3622AlbPckCaj = A2813MetPieCod ;
         n3622AlbPckCaj = false ;
         A3624AlbPckKb = A2814MetPieKil ;
         n3624AlbPckKb = false ;
         A3623AlbPckKn = A2815MetPieMet ;
         n3623AlbPckKn = false ;
         A3626AlbPckUni = A6635MetPieAnc ;
         n3626AlbPckUni = false ;
         A3625AlbPckTar = A4910MetPieMtD ;
         n3625AlbPckTar = false ;
         /* Using cursor P02874 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A3621AlbPckLin), Boolean.valueOf(n3622AlbPckCaj), A3622AlbPckCaj, Boolean.valueOf(n3623AlbPckKn), A3623AlbPckKn, Boolean.valueOf(n3624AlbPckKb), A3624AlbPckKb, Boolean.valueOf(n3625AlbPckTar), A3625AlbPckTar, Boolean.valueOf(n3626AlbPckUni), Short.valueOf(A3626AlbPckUni)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Using cursor P02875 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A2816MetPieEst), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n3829AlbPckUlin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02876 */
      pr_default.execute(4, new Object[] {Short.valueOf(AV10AlbPckUlin), A396EmprCod, Long.valueOf(AV9AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbpkbc.this.A396EmprCod;
      this.aP1[0] = palbpkbc.this.A2809MetTerCod;
      this.aP2[0] = palbpkbc.this.A129BarCod;
      this.aP3[0] = palbpkbc.this.A132BarCodReo;
      this.aP4[0] = palbpkbc.this.A130BarCodPar;
      this.aP5[0] = palbpkbc.this.AV9AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbpkbc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Texto = "" ;
      scmdbuf = "" ;
      P02872_A396EmprCod = new String[] {""} ;
      P02872_A129BarCod = new int[1] ;
      P02872_A132BarCodReo = new byte[1] ;
      P02872_A130BarCodPar = new String[] {""} ;
      P02872_A30AlbProCod = new long[1] ;
      P02872_A3829AlbPckUlin = new short[1] ;
      P02872_n3829AlbPckUlin = new boolean[] {false} ;
      P02873_A396EmprCod = new String[] {""} ;
      P02873_A2809MetTerCod = new String[] {""} ;
      P02873_A129BarCod = new int[1] ;
      P02873_A132BarCodReo = new byte[1] ;
      P02873_A130BarCodPar = new String[] {""} ;
      P02873_A2813MetPieCod = new String[] {""} ;
      P02873_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02873_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02873_A6635MetPieAnc = new short[1] ;
      P02873_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02873_A2816MetPieEst = new byte[1] ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A3622AlbPckCaj = "" ;
      A3624AlbPckKb = DecimalUtil.ZERO ;
      A3623AlbPckKn = DecimalUtil.ZERO ;
      A3625AlbPckTar = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbpkbc__default(),
         new Object[] {
             new Object[] {
            P02872_A396EmprCod, P02872_A129BarCod, P02872_A132BarCodReo, P02872_A130BarCodPar, P02872_A30AlbProCod, P02872_A3829AlbPckUlin, P02872_n3829AlbPckUlin
            }
            , new Object[] {
            P02873_A396EmprCod, P02873_A2809MetTerCod, P02873_A129BarCod, P02873_A132BarCodReo, P02873_A130BarCodPar, P02873_A2813MetPieCod, P02873_A2814MetPieKil, P02873_A2815MetPieMet, P02873_A6635MetPieAnc, P02873_A4910MetPieMtD,
            P02873_A2816MetPieEst
            }
            , new Object[] {
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
   private byte A2816MetPieEst ;
   private short A3829AlbPckUlin ;
   private short AV10AlbPckUlin ;
   private short A6635MetPieAnc ;
   private short A3621AlbPckLin ;
   private short A3626AlbPckUni ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_INS507 ;
   private long AV9AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal A3624AlbPckKb ;
   private java.math.BigDecimal A3623AlbPckKn ;
   private java.math.BigDecimal A3625AlbPckTar ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String AV12Texto ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A3622AlbPckCaj ;
   private String Gx_emsg ;
   private boolean n3829AlbPckUlin ;
   private boolean n3622AlbPckCaj ;
   private boolean n3624AlbPckKb ;
   private boolean n3623AlbPckKn ;
   private boolean n3626AlbPckUni ;
   private boolean n3625AlbPckTar ;
   private long[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02872_A396EmprCod ;
   private int[] P02872_A129BarCod ;
   private byte[] P02872_A132BarCodReo ;
   private String[] P02872_A130BarCodPar ;
   private long[] P02872_A30AlbProCod ;
   private short[] P02872_A3829AlbPckUlin ;
   private boolean[] P02872_n3829AlbPckUlin ;
   private String[] P02873_A396EmprCod ;
   private String[] P02873_A2809MetTerCod ;
   private int[] P02873_A129BarCod ;
   private byte[] P02873_A132BarCodReo ;
   private String[] P02873_A130BarCodPar ;
   private String[] P02873_A2813MetPieCod ;
   private java.math.BigDecimal[] P02873_A2814MetPieKil ;
   private java.math.BigDecimal[] P02873_A2815MetPieMet ;
   private short[] P02873_A6635MetPieAnc ;
   private java.math.BigDecimal[] P02873_A4910MetPieMtD ;
   private byte[] P02873_A2816MetPieEst ;
}

final  class palbpkbc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02872", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbPckUlin FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02873", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieAnc, MetPieMtD, MetPieEst FROM TXPLMETPI WHERE (EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MetPieEst = 0) ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02874", "INSERT INTO TXPALBPCK(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin, AlbPckCaj, AlbPckKn, AlbPckKb, AlbPckTar, AlbPckUni, AlbPckCal, AlbPckM1, AlbPckM2, AlbPckM3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPCK")
         ,new UpdateCursor("P02875", "UPDATE TXPLMETPI SET MetPieEst=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new UpdateCursor("P02876", "UPDATE TXPALBBAR SET AlbPckUlin=? + 1  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 12);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

