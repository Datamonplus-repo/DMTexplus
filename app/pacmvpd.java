package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacmvpd extends GXProcedure
{
   public pacmvpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacmvpd.class ), "" );
   }

   public pacmvpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 )
   {
      pacmvpd.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pacmvpd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pacmvpd.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      pacmvpd.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      pacmvpd.this.AV18PartAlbDis = aP3[0];
      this.aP3 = aP3;
      pacmvpd.this.AV19ActKgm = aP4[0];
      this.aP4 = aP4;
      pacmvpd.this.AV20ActCon = aP5[0];
      this.aP5 = aP5;
      pacmvpd.this.AV21PartTipLin = aP6[0];
      this.aP6 = aP6;
      pacmvpd.this.AV22PartFecMov = aP7[0];
      this.aP7 = aP7;
      pacmvpd.this.AV23Loca = aP8[0];
      this.aP8 = aP8;
      pacmvpd.this.AV24FasCod = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00DS2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A972PartULin = P00DS2_A972PartULin[0] ;
         n972PartULin = P00DS2_n972PartULin[0] ;
         A252CliCod = P00DS2_A252CliCod[0] ;
         A966PartCod = P00DS2_A966PartCod[0] ;
         A396EmprCod = P00DS2_A396EmprCod[0] ;
         A1456ParArtCod = P00DS2_A1456ParArtCod[0] ;
         n1456ParArtCod = P00DS2_n1456ParArtCod[0] ;
         A2376PartExt = P00DS2_A2376PartExt[0] ;
         n2376PartExt = P00DS2_n2376PartExt[0] ;
         A2747PartOpe = P00DS2_A2747PartOpe[0] ;
         n2747PartOpe = P00DS2_n2747PartOpe[0] ;
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
         A980PartLinTip = httpContext.getMessage( "S", "") ;
         n980PartLinTip = false ;
         A981PartAlbDis = AV18PartAlbDis ;
         n981PartAlbDis = false ;
         A982PartSitDis = httpContext.getMessage( "SALIDA EXTERIOR", "") ;
         n982PartSitDis = false ;
         A986KilUti = AV19ActKgm ;
         n986KilUti = false ;
         A987ConUti = AV20ActCon ;
         n987ConUti = false ;
         A983PartFecMov = AV22PartFecMov ;
         n983PartFecMov = false ;
         A1877PartLoc = AV23Loca ;
         n1877PartLoc = false ;
         /* Using cursor P00DS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1877PartLoc), A1877PartLoc});
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
         A2376PartExt = (byte)(1) ;
         n2376PartExt = false ;
         A2747PartOpe = AV24FasCod ;
         n2747PartOpe = false ;
         /* Using cursor P00DS4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), Boolean.valueOf(n2376PartExt), Byte.valueOf(A2376PartExt), Boolean.valueOf(n2747PartOpe), A2747PartOpe, A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         A396EmprCod = W396EmprCod ;
         A966PartCod = W966PartCod ;
         A252CliCod = W252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00DS5 */
      pr_default.execute(3, new Object[] {AV16PartCod, Integer.valueOf(AV17CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2272MovParULi = P00DS5_A2272MovParULi[0] ;
         n2272MovParULi = P00DS5_n2272MovParULi[0] ;
         A396EmprCod = P00DS5_A396EmprCod[0] ;
         A252CliCod = P00DS5_A252CliCod[0] ;
         A2268MovParCod = P00DS5_A2268MovParCod[0] ;
         A2269MovParArt = P00DS5_A2269MovParArt[0] ;
         n2269MovParArt = P00DS5_n2269MovParArt[0] ;
         /*
            INSERT RECORD ON TABLE TXPLMOVPD

         */
         W2268MovParCod = A2268MovParCod ;
         W252CliCod = A252CliCod ;
         A2268MovParCod = AV16PartCod ;
         A252CliCod = AV17CliCod ;
         A2276MovParLin = (short)(A2272MovParULi+1) ;
         A2277MovParLiT = httpContext.getMessage( "D", "") ;
         n2277MovParLiT = false ;
         A2278MovParAlb = AV18PartAlbDis ;
         n2278MovParAlb = false ;
         A2280MovParFec = AV22PartFecMov ;
         n2280MovParFec = false ;
         A2283MovParKU = AV19ActKgm ;
         n2283MovParKU = false ;
         A2284MovParCU = AV20ActCon ;
         n2284MovParCU = false ;
         A2279MovParSit = httpContext.getMessage( "SALIDA EXTERIOR", "") ;
         n2279MovParSit = false ;
         A2285MovParLoc = AV23Loca ;
         n2285MovParLoc = false ;
         /* Using cursor P00DS6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A2268MovParCod, Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin), Boolean.valueOf(n2277MovParLiT), A2277MovParLiT, Boolean.valueOf(n2278MovParAlb), Integer.valueOf(A2278MovParAlb), Boolean.valueOf(n2279MovParSit), A2279MovParSit, Boolean.valueOf(n2280MovParFec), A2280MovParFec, Boolean.valueOf(n2283MovParKU), A2283MovParKU, Boolean.valueOf(n2284MovParCU), Short.valueOf(A2284MovParCU), Boolean.valueOf(n2285MovParLoc), A2285MovParLoc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A2268MovParCod = W2268MovParCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         A2272MovParULi = (short)(A2272MovParULi+1) ;
         n2272MovParULi = false ;
         /* Using cursor P00DS7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2272MovParULi), Short.valueOf(A2272MovParULi), A396EmprCod, A2268MovParCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMOVPD");
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacmvpd.this.AV15EmprCod;
      this.aP1[0] = pacmvpd.this.AV16PartCod;
      this.aP2[0] = pacmvpd.this.AV17CliCod;
      this.aP3[0] = pacmvpd.this.AV18PartAlbDis;
      this.aP4[0] = pacmvpd.this.AV19ActKgm;
      this.aP5[0] = pacmvpd.this.AV20ActCon;
      this.aP6[0] = pacmvpd.this.AV21PartTipLin;
      this.aP7[0] = pacmvpd.this.AV22PartFecMov;
      this.aP8[0] = pacmvpd.this.AV23Loca;
      this.aP9[0] = pacmvpd.this.AV24FasCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacmvpd");
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
      P00DS2_A972PartULin = new int[1] ;
      P00DS2_n972PartULin = new boolean[] {false} ;
      P00DS2_A252CliCod = new int[1] ;
      P00DS2_A966PartCod = new String[] {""} ;
      P00DS2_A396EmprCod = new String[] {""} ;
      P00DS2_A1456ParArtCod = new String[] {""} ;
      P00DS2_n1456ParArtCod = new boolean[] {false} ;
      P00DS2_A2376PartExt = new byte[1] ;
      P00DS2_n2376PartExt = new boolean[] {false} ;
      P00DS2_A2747PartOpe = new String[] {""} ;
      P00DS2_n2747PartOpe = new boolean[] {false} ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A1456ParArtCod = "" ;
      A2747PartOpe = "" ;
      W396EmprCod = "" ;
      W966PartCod = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A983PartFecMov = GXutil.nullDate() ;
      A1877PartLoc = "" ;
      Gx_emsg = "" ;
      P00DS5_A2272MovParULi = new short[1] ;
      P00DS5_n2272MovParULi = new boolean[] {false} ;
      P00DS5_A396EmprCod = new String[] {""} ;
      P00DS5_A252CliCod = new int[1] ;
      P00DS5_A2268MovParCod = new String[] {""} ;
      P00DS5_A2269MovParArt = new String[] {""} ;
      P00DS5_n2269MovParArt = new boolean[] {false} ;
      A2268MovParCod = "" ;
      A2269MovParArt = "" ;
      W2268MovParCod = "" ;
      A2277MovParLiT = "" ;
      A2280MovParFec = GXutil.nullDate() ;
      A2283MovParKU = DecimalUtil.ZERO ;
      A2279MovParSit = "" ;
      A2285MovParLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacmvpd__default(),
         new Object[] {
             new Object[] {
            P00DS2_A972PartULin, P00DS2_n972PartULin, P00DS2_A252CliCod, P00DS2_A966PartCod, P00DS2_A396EmprCod, P00DS2_A1456ParArtCod, P00DS2_n1456ParArtCod, P00DS2_A2376PartExt, P00DS2_n2376PartExt, P00DS2_A2747PartOpe,
            P00DS2_n2747PartOpe
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00DS5_A2272MovParULi, P00DS5_n2272MovParULi, P00DS5_A396EmprCod, P00DS5_A252CliCod, P00DS5_A2268MovParCod, P00DS5_A2269MovParArt, P00DS5_n2269MovParArt
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

   private byte A2376PartExt ;
   private short AV20ActCon ;
   private short A987ConUti ;
   private short Gx_err ;
   private short A2272MovParULi ;
   private short A2276MovParLin ;
   private short A2284MovParCU ;
   private int AV17CliCod ;
   private int AV18PartAlbDis ;
   private int A972PartULin ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private int GX_INS308 ;
   private int A2278MovParAlb ;
   private java.math.BigDecimal AV19ActKgm ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A2283MovParKU ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String AV21PartTipLin ;
   private String AV23Loca ;
   private String AV24FasCod ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private String A1456ParArtCod ;
   private String A2747PartOpe ;
   private String W396EmprCod ;
   private String W966PartCod ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String A1877PartLoc ;
   private String Gx_emsg ;
   private String A2268MovParCod ;
   private String A2269MovParArt ;
   private String W2268MovParCod ;
   private String A2277MovParLiT ;
   private String A2279MovParSit ;
   private String A2285MovParLoc ;
   private java.util.Date AV22PartFecMov ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A2280MovParFec ;
   private boolean n972PartULin ;
   private boolean n1456ParArtCod ;
   private boolean n2376PartExt ;
   private boolean n2747PartOpe ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n983PartFecMov ;
   private boolean n1877PartLoc ;
   private boolean n2272MovParULi ;
   private boolean n2269MovParArt ;
   private boolean n2277MovParLiT ;
   private boolean n2278MovParAlb ;
   private boolean n2280MovParFec ;
   private boolean n2283MovParKU ;
   private boolean n2284MovParCU ;
   private boolean n2279MovParSit ;
   private boolean n2285MovParLoc ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P00DS2_A972PartULin ;
   private boolean[] P00DS2_n972PartULin ;
   private int[] P00DS2_A252CliCod ;
   private String[] P00DS2_A966PartCod ;
   private String[] P00DS2_A396EmprCod ;
   private String[] P00DS2_A1456ParArtCod ;
   private boolean[] P00DS2_n1456ParArtCod ;
   private byte[] P00DS2_A2376PartExt ;
   private boolean[] P00DS2_n2376PartExt ;
   private String[] P00DS2_A2747PartOpe ;
   private boolean[] P00DS2_n2747PartOpe ;
   private short[] P00DS5_A2272MovParULi ;
   private boolean[] P00DS5_n2272MovParULi ;
   private String[] P00DS5_A396EmprCod ;
   private int[] P00DS5_A252CliCod ;
   private String[] P00DS5_A2268MovParCod ;
   private String[] P00DS5_A2269MovParArt ;
   private boolean[] P00DS5_n2269MovParArt ;
}

final  class pacmvpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DS2", "SELECT PartULin, CliCod, PartCod, EmprCod, ParArtCod, PartExt, PartOpe FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DS3", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilUti, ConUti, PartLoc, TrnCod, KilEnt, ConEnt, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P00DS4", "UPDATE TXPCPARTI SET PartULin=?, PartExt=?, PartOpe=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P00DS5", "SELECT MovParULi, EmprCod, CliCod, MovParCod, MovParArt FROM TXPCMOVPD WHERE (MovParCod = ?) AND (CliCod = ?) ORDER BY EmprCod, MovParCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DS6", "INSERT INTO TXPLMOVPD(EmprCod, MovParCod, CliCod, MovParLin, MovParLiT, MovParAlb, MovParSit, MovParFec, MovParKU, MovParCU, MovParLoc, MovParKE, MovParCE, MovParExL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
         ,new UpdateCursor("P00DS7", "UPDATE TXPCMOVPD SET MovParULi=?  WHERE EmprCod = ? AND MovParCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMOVPD")
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
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 10);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 16);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 10);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

