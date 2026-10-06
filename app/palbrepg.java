package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbrepg extends GXProcedure
{
   public palbrepg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbrepg.class ), "" );
   }

   public palbrepg( int remoteHandle ,
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
      palbrepg.this.aP4 = new String[] {""};
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
      palbrepg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbrepg.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbrepg.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      palbrepg.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbrepg.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20LinFas = (short)(0) ;
      /* Using cursor P02LF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02LF2_A130BarCodPar[0] ;
         A132BarCodReo = P02LF2_A132BarCodReo[0] ;
         A129BarCod = P02LF2_A129BarCod[0] ;
         A30AlbProCod = P02LF2_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P02LF2_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P02LF2_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P02LF2_A1265BarAlbPie[0] ;
         AV27FasKgm = A1261BarAlbKgmE ;
         AV28FasMtr = A1263BarAlbMtrE ;
         AV35Pie_a = A1265BarAlbPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02LF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A203BarPieKil = P02LF3_A203BarPieKil[0] ;
         A205BarPieMet = P02LF3_A205BarPieMet[0] ;
         A1501BarPiePie = P02LF3_A1501BarPiePie[0] ;
         A44AlbRecCod = P02LF3_A44AlbRecCod[0] ;
         n44AlbRecCod = P02LF3_n44AlbRecCod[0] ;
         A130BarCodPar = P02LF3_A130BarCodPar[0] ;
         A132BarCodReo = P02LF3_A132BarCodReo[0] ;
         A129BarCod = P02LF3_A129BarCod[0] ;
         A200BarPieCod = P02LF3_A200BarPieCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV20LinFas = (short)(AV20LinFas+1) ;
         /*
            INSERT RECORD ON TABLE TXPALBREP

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W44AlbRecCod = A44AlbRecCod ;
         n44AlbRecCod = false ;
         A30AlbProCod = AV15AlbProCod ;
         A129BarCod = AV16BarCod ;
         A132BarCodReo = AV17BarCodReo ;
         A130BarCodPar = AV18BarCodPar ;
         A6622AlbHdRLn = AV20LinFas ;
         n44AlbRecCod = false ;
         A6623AlbHdRKgi = A203BarPieKil ;
         n6623AlbHdRKgi = false ;
         A11365AlbHdRMti = A205BarPieMet ;
         n11365AlbHdRMti = false ;
         A6624AlbHdRPzi = (short)(A1501BarPiePie) ;
         n6624AlbHdRPzi = false ;
         A6625AlbHdRKgR = DecimalUtil.doubleToDec(0) ;
         n6625AlbHdRKgR = false ;
         A11366AlbHdRMtR = DecimalUtil.doubleToDec(0) ;
         n11366AlbHdRMtR = false ;
         A6626AlbHdRPzR = (short)(0) ;
         n6626AlbHdRPzR = false ;
         /* Using cursor P02LF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n6623AlbHdRKgi), A6623AlbHdRKgi, Boolean.valueOf(n6624AlbHdRPzi), Short.valueOf(A6624AlbHdRPzi), Boolean.valueOf(n6625AlbHdRKgR), A6625AlbHdRKgR, Boolean.valueOf(n6626AlbHdRPzR), Short.valueOf(A6626AlbHdRPzR), Boolean.valueOf(n11365AlbHdRMti), A11365AlbHdRMti, Boolean.valueOf(n11366AlbHdRMtR), A11366AlbHdRMtR});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREP");
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
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A44AlbRecCod = W44AlbRecCod ;
         n44AlbRecCod = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      n6621AlbHdRUl = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02LF5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n6621AlbHdRUl), Short.valueOf(AV20LinFas), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbrepg.this.A396EmprCod;
      this.aP1[0] = palbrepg.this.AV15AlbProCod;
      this.aP2[0] = palbrepg.this.AV16BarCod;
      this.aP3[0] = palbrepg.this.AV17BarCodReo;
      this.aP4[0] = palbrepg.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbrepg");
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
      P02LF2_A396EmprCod = new String[] {""} ;
      P02LF2_A130BarCodPar = new String[] {""} ;
      P02LF2_A132BarCodReo = new byte[1] ;
      P02LF2_A129BarCod = new int[1] ;
      P02LF2_A30AlbProCod = new long[1] ;
      P02LF2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LF2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LF2_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV27FasKgm = DecimalUtil.ZERO ;
      AV28FasMtr = DecimalUtil.ZERO ;
      P02LF3_A396EmprCod = new String[] {""} ;
      P02LF3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LF3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LF3_A1501BarPiePie = new int[1] ;
      P02LF3_A44AlbRecCod = new int[1] ;
      P02LF3_n44AlbRecCod = new boolean[] {false} ;
      P02LF3_A130BarCodPar = new String[] {""} ;
      P02LF3_A132BarCodReo = new byte[1] ;
      P02LF3_A129BarCod = new int[1] ;
      P02LF3_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A6623AlbHdRKgi = DecimalUtil.ZERO ;
      A11365AlbHdRMti = DecimalUtil.ZERO ;
      A6625AlbHdRKgR = DecimalUtil.ZERO ;
      A11366AlbHdRMtR = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbrepg__default(),
         new Object[] {
             new Object[] {
            P02LF2_A396EmprCod, P02LF2_A130BarCodPar, P02LF2_A132BarCodReo, P02LF2_A129BarCod, P02LF2_A30AlbProCod, P02LF2_A1261BarAlbKgmE, P02LF2_A1263BarAlbMtrE, P02LF2_A1265BarAlbPie
            }
            , new Object[] {
            P02LF3_A396EmprCod, P02LF3_A203BarPieKil, P02LF3_A205BarPieMet, P02LF3_A1501BarPiePie, P02LF3_A44AlbRecCod, P02LF3_A130BarCodPar, P02LF3_A132BarCodReo, P02LF3_A129BarCod, P02LF3_A200BarPieCod
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

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private short AV20LinFas ;
   private short A6622AlbHdRLn ;
   private short A6624AlbHdRPzi ;
   private short A6626AlbHdRPzR ;
   private short Gx_err ;
   private short A6621AlbHdRUl ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV35Pie_a ;
   private int A1501BarPiePie ;
   private int A44AlbRecCod ;
   private int W129BarCod ;
   private int GX_INS946 ;
   private int W44AlbRecCod ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV27FasKgm ;
   private java.math.BigDecimal AV28FasMtr ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A6623AlbHdRKgi ;
   private java.math.BigDecimal A11365AlbHdRMti ;
   private java.math.BigDecimal A6625AlbHdRKgR ;
   private java.math.BigDecimal A11366AlbHdRMtR ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String Gx_emsg ;
   private boolean n44AlbRecCod ;
   private boolean n6623AlbHdRKgi ;
   private boolean n11365AlbHdRMti ;
   private boolean n6624AlbHdRPzi ;
   private boolean n6625AlbHdRKgR ;
   private boolean n11366AlbHdRMtR ;
   private boolean n6626AlbHdRPzR ;
   private boolean n6621AlbHdRUl ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02LF2_A396EmprCod ;
   private String[] P02LF2_A130BarCodPar ;
   private byte[] P02LF2_A132BarCodReo ;
   private int[] P02LF2_A129BarCod ;
   private long[] P02LF2_A30AlbProCod ;
   private java.math.BigDecimal[] P02LF2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P02LF2_A1263BarAlbMtrE ;
   private int[] P02LF2_A1265BarAlbPie ;
   private String[] P02LF3_A396EmprCod ;
   private java.math.BigDecimal[] P02LF3_A203BarPieKil ;
   private java.math.BigDecimal[] P02LF3_A205BarPieMet ;
   private int[] P02LF3_A1501BarPiePie ;
   private int[] P02LF3_A44AlbRecCod ;
   private boolean[] P02LF3_n44AlbRecCod ;
   private String[] P02LF3_A130BarCodPar ;
   private byte[] P02LF3_A132BarCodReo ;
   private int[] P02LF3_A129BarCod ;
   private String[] P02LF3_A200BarPieCod ;
}

final  class palbrepg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LF2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02LF3", "SELECT EmprCod, BarPieKil, BarPieMet, BarPiePie, AlbRecCod, BarCodPar, BarCodReo, BarCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02LF4", "INSERT INTO TXPALBREP(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn, AlbRecCod, AlbHdRKgi, AlbHdRPzi, AlbHdRKgR, AlbHdRPzR, AlbHdRMti, AlbHdRMtR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREP")
         ,new UpdateCursor("P02LF5", "UPDATE TXPALBBAR SET AlbHdRUl=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
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
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               return;
            case 3 :
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
               return;
      }
   }

}

