package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psallab extends GXProcedure
{
   public psallab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psallab.class ), "" );
   }

   public psallab( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 ,
                                     int[] aP2 ,
                                     int[] aP3 ,
                                     short[] aP4 ,
                                     java.math.BigDecimal[] aP5 ,
                                     String[] aP6 ,
                                     String[] aP7 ,
                                     int[] aP8 )
   {
      psallab.this.aP9 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        java.util.Date[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             java.util.Date[] aP9 )
   {
      psallab.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      psallab.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      psallab.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      psallab.this.AV18PartAlbDis = aP3[0];
      this.aP3 = aP3;
      psallab.this.AV19ActCon = aP4[0];
      this.aP4 = aP4;
      psallab.this.AV20ActKgm = aP5[0];
      this.aP5 = aP5;
      psallab.this.AV21PartTipLin = aP6[0];
      this.aP6 = aP6;
      psallab.this.AV22DisColNom = aP7[0];
      this.aP7 = aP7;
      psallab.this.AV23DisColNum = aP8[0];
      this.aP8 = aP8;
      psallab.this.AV24PartFecMov = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00FP2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A972PartULin = P00FP2_A972PartULin[0] ;
         n972PartULin = P00FP2_n972PartULin[0] ;
         A252CliCod = P00FP2_A252CliCod[0] ;
         A966PartCod = P00FP2_A966PartCod[0] ;
         A396EmprCod = P00FP2_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W966PartCod = A966PartCod ;
         W252CliCod = A252CliCod ;
         /*
            INSERT RECORD ON TABLE TXPLPARTI

         */
         W396EmprCod = A396EmprCod ;
         W966PartCod = A966PartCod ;
         W252CliCod = A252CliCod ;
         A396EmprCod = AV15EmprCod ;
         A966PartCod = AV16PartCod ;
         A252CliCod = AV17CliCod ;
         A979PartLin = (int)(A972PartULin+1) ;
         A980PartLinTip = httpContext.getMessage( "D", "") ;
         n980PartLinTip = false ;
         A981PartAlbDis = AV18PartAlbDis ;
         n981PartAlbDis = false ;
         A982PartSitDis = httpContext.getMessage( "SALIDA A LABORATORIO", "") ;
         n982PartSitDis = false ;
         A986KilUti = AV20ActKgm ;
         n986KilUti = false ;
         A987ConUti = AV19ActCon ;
         n987ConUti = false ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24PartFecMov)) )
         {
            A983PartFecMov = AV24PartFecMov ;
            n983PartFecMov = false ;
         }
         /* Using cursor P00FP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         if ( (pr_default.getStatus(1) == 1) )
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
         A966PartCod = W966PartCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         A972PartULin = (int)(A972PartULin+1) ;
         n972PartULin = false ;
         /* Using cursor P00FP4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         A396EmprCod = W396EmprCod ;
         A966PartCod = W966PartCod ;
         A252CliCod = W252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psallab.this.AV15EmprCod;
      this.aP1[0] = psallab.this.AV16PartCod;
      this.aP2[0] = psallab.this.AV17CliCod;
      this.aP3[0] = psallab.this.AV18PartAlbDis;
      this.aP4[0] = psallab.this.AV19ActCon;
      this.aP5[0] = psallab.this.AV20ActKgm;
      this.aP6[0] = psallab.this.AV21PartTipLin;
      this.aP7[0] = psallab.this.AV22DisColNom;
      this.aP8[0] = psallab.this.AV23DisColNum;
      this.aP9[0] = psallab.this.AV24PartFecMov;
      Application.commitDataStores(context, remoteHandle, pr_default, "psallab");
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
      P00FP2_A972PartULin = new int[1] ;
      P00FP2_n972PartULin = new boolean[] {false} ;
      P00FP2_A252CliCod = new int[1] ;
      P00FP2_A966PartCod = new String[] {""} ;
      P00FP2_A396EmprCod = new String[] {""} ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      W966PartCod = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psallab__default(),
         new Object[] {
             new Object[] {
            P00FP2_A972PartULin, P00FP2_n972PartULin, P00FP2_A252CliCod, P00FP2_A966PartCod, P00FP2_A396EmprCod
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

   private short AV19ActCon ;
   private short A987ConUti ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18PartAlbDis ;
   private int AV23DisColNum ;
   private int A972PartULin ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private java.math.BigDecimal AV20ActKgm ;
   private java.math.BigDecimal A986KilUti ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String AV21PartTipLin ;
   private String AV22DisColNom ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W966PartCod ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String Gx_emsg ;
   private java.util.Date AV24PartFecMov ;
   private java.util.Date A983PartFecMov ;
   private boolean n972PartULin ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n983PartFecMov ;
   private java.util.Date[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P00FP2_A972PartULin ;
   private boolean[] P00FP2_n972PartULin ;
   private int[] P00FP2_A252CliCod ;
   private String[] P00FP2_A966PartCod ;
   private String[] P00FP2_A396EmprCod ;
}

final  class psallab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FP2", "SELECT PartULin, CliCod, PartCod, EmprCod FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00FP3", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, TrnCod, KilEnt, ConEnt, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P00FP4", "UPDATE TXPCPARTI SET PartULin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

