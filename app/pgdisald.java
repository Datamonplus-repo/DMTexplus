package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgdisald extends GXProcedure
{
   public pgdisald( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgdisald.class ), "" );
   }

   public pgdisald( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pgdisald.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pgdisald.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgdisald.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pgdisald.this.AV10AlbRecCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FlagPRef = (byte)(0) ;
      GXv_int1[0] = AV13FlagPRef ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int1) ;
      pgdisald.this.AV13FlagPRef = GXv_int1[0] ;
      GXv_int1[0] = AV17FlagTexk ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int1) ;
      pgdisald.this.AV17FlagTexk = GXv_int1[0] ;
      GXv_int1[0] = AV18Martex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      pgdisald.this.AV18Martex = GXv_int1[0] ;
      AV15TotKgs = DecimalUtil.doubleToDec(0) ;
      AV16TotMts = DecimalUtil.doubleToDec(0) ;
      AV14TotPzas = (short)(0) ;
      /* Using cursor P00JJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2154AlbRecAnh = P00JJ2_A2154AlbRecAnh[0] ;
         A2159AlbRecPie = P00JJ2_A2159AlbRecPie[0] ;
         A2155AlbRecKgm = P00JJ2_A2155AlbRecKgm[0] ;
         A3731AlbRecIdPz = P00JJ2_A3731AlbRecIdPz[0] ;
         A50AlbRLoc = P00JJ2_A50AlbRLoc[0] ;
         A2157AlbRecMtr = P00JJ2_A2157AlbRecMtr[0] ;
         A44AlbRecCod = P00JJ2_A44AlbRecCod[0] ;
         A2158AlbRecMtrU = P00JJ2_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = P00JJ2_A2156AlbRecKgmU[0] ;
         A50AlbRLoc = P00JJ2_A50AlbRLoc[0] ;
         W396EmprCod = A396EmprCod ;
         W44AlbRecCod = A44AlbRecCod ;
         /*
            INSERT RECORD ON TABLE TXPDISALD

         */
         W44AlbRecCod = A44AlbRecCod ;
         W361DisCod = A361DisCod ;
         W396EmprCod = A396EmprCod ;
         A44AlbRecCod = AV10AlbRecCod ;
         A2185DisPieAnc = A2154AlbRecAnh ;
         A380DisPieCod = A2159AlbRecPie ;
         A382DisPieKil = A2155AlbRecKgm ;
         if ( AV13FlagPRef == 1 )
         {
            A2184DisPieLoc = A3731AlbRecIdPz ;
         }
         else
         {
            if ( ! ( ( AV17FlagTexk == 1 ) || ( AV18Martex == 1 ) ) )
            {
               A2184DisPieLoc = A50AlbRLoc ;
            }
            else
            {
               A2184DisPieLoc = A50AlbRLoc ;
               if ( GXutil.strcmp(A3731AlbRecIdPz, httpContext.getMessage( "AUTOMATICO", "")) == 0 )
               {
                  A2184DisPieLoc = httpContext.getMessage( "AUTOMATICO", "") ;
               }
            }
         }
         A384DisPieMet = A2157AlbRecMtr ;
         A5099DisPieEst = (byte)(0) ;
         AV14TotPzas = (short)(AV14TotPzas+1) ;
         AV15TotKgs = AV15TotKgs.add(A2155AlbRecKgm) ;
         AV16TotMts = AV16TotMts.add(A2157AlbRecMtr) ;
         /* Using cursor P00JJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
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
         A44AlbRecCod = W44AlbRecCod ;
         A361DisCod = W361DisCod ;
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A2158AlbRecMtrU = A2158AlbRecMtrU.add(A2157AlbRecMtr) ;
         A2156AlbRecKgmU = A2156AlbRecKgmU.add(A2155AlbRecKgm) ;
         AV9EmprCod = A396EmprCod ;
         AV11Kilos = A2155AlbRecKgm ;
         AV12Metros = A2157AlbRecMtr ;
         /* Execute user subroutine: 'ALBREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P00JJ4 */
         pr_default.execute(2, new Object[] {A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
         A396EmprCod = W396EmprCod ;
         A44AlbRecCod = W44AlbRecCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14TotPzas > 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         A44AlbRecCod = AV10AlbRecCod ;
         A673Piezas = AV14TotPzas ;
         A595Kilos = AV15TotKgs ;
         A631Metros = AV16TotMts ;
         A3699KilosUti = DecimalUtil.doubleToDec(0) ;
         n3699KilosUti = false ;
         A3700MetrosUti = DecimalUtil.doubleToDec(0) ;
         n3700MetrosUti = false ;
         A3701PiezasUti = (short)(0) ;
         n3701PiezasUti = false ;
         /* Using cursor P00JJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(3) == 1) )
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Using cursor P00JJ6 */
      pr_default.execute(4, new Object[] {AV9EmprCod, Integer.valueOf(AV10AlbRecCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A44AlbRecCod = P00JJ6_A44AlbRecCod[0] ;
         A56AlbRUni = P00JJ6_A56AlbRUni[0] ;
         A60AlbRUniUti = P00JJ6_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P00JJ6_A54AlbRPieUti[0] ;
         A47AlbREst = P00JJ6_A47AlbREst[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A60AlbRUniUti = A60AlbRUniUti.add(AV11Kilos) ;
         }
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A60AlbRUniUti = A60AlbRUniUti.add(AV12Metros) ;
         }
         A54AlbRPieUti = (int)(A54AlbRPieUti+1) ;
         A47AlbREst = (byte)(1) ;
         /* Using cursor P00JJ7 */
         pr_default.execute(5, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgdisald.this.A396EmprCod;
      this.aP1[0] = pgdisald.this.A361DisCod;
      this.aP2[0] = pgdisald.this.AV10AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgdisald");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV15TotKgs = DecimalUtil.ZERO ;
      AV16TotMts = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00JJ2_A396EmprCod = new String[] {""} ;
      P00JJ2_A2154AlbRecAnh = new short[1] ;
      P00JJ2_A2159AlbRecPie = new String[] {""} ;
      P00JJ2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JJ2_A3731AlbRecIdPz = new String[] {""} ;
      P00JJ2_A50AlbRLoc = new String[] {""} ;
      P00JJ2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JJ2_A44AlbRecCod = new int[1] ;
      P00JJ2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JJ2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      A50AlbRLoc = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      A384DisPieMet = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV9EmprCod = "" ;
      AV11Kilos = DecimalUtil.ZERO ;
      AV12Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A3699KilosUti = DecimalUtil.ZERO ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      P00JJ6_A44AlbRecCod = new int[1] ;
      P00JJ6_A396EmprCod = new String[] {""} ;
      P00JJ6_A56AlbRUni = new String[] {""} ;
      P00JJ6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00JJ6_A54AlbRPieUti = new int[1] ;
      P00JJ6_A47AlbREst = new byte[1] ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgdisald__default(),
         new Object[] {
             new Object[] {
            P00JJ2_A396EmprCod, P00JJ2_A2154AlbRecAnh, P00JJ2_A2159AlbRecPie, P00JJ2_A2155AlbRecKgm, P00JJ2_A3731AlbRecIdPz, P00JJ2_A50AlbRLoc, P00JJ2_A2157AlbRecMtr, P00JJ2_A44AlbRecCod, P00JJ2_A2158AlbRecMtrU, P00JJ2_A2156AlbRecKgmU
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00JJ6_A44AlbRecCod, P00JJ6_A396EmprCod, P00JJ6_A56AlbRUni, P00JJ6_A60AlbRUniUti, P00JJ6_A54AlbRPieUti, P00JJ6_A47AlbREst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13FlagPRef ;
   private byte AV17FlagTexk ;
   private byte AV18Martex ;
   private byte GXv_int1[] ;
   private byte A5099DisPieEst ;
   private byte A47AlbREst ;
   private short AV14TotPzas ;
   private short A2154AlbRecAnh ;
   private short A2185DisPieAnc ;
   private short Gx_err ;
   private short A3701PiezasUti ;
   private int A361DisCod ;
   private int AV10AlbRecCod ;
   private int A44AlbRecCod ;
   private int W44AlbRecCod ;
   private int GX_INS36 ;
   private int W361DisCod ;
   private int GX_INS35 ;
   private int A673Piezas ;
   private int A54AlbRPieUti ;
   private java.math.BigDecimal AV15TotKgs ;
   private java.math.BigDecimal AV16TotMts ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal AV11Kilos ;
   private java.math.BigDecimal AV12Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A3731AlbRecIdPz ;
   private String A50AlbRLoc ;
   private String W396EmprCod ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String Gx_emsg ;
   private String AV9EmprCod ;
   private String A56AlbRUni ;
   private boolean returnInSub ;
   private boolean n3699KilosUti ;
   private boolean n3700MetrosUti ;
   private boolean n3701PiezasUti ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00JJ2_A396EmprCod ;
   private short[] P00JJ2_A2154AlbRecAnh ;
   private String[] P00JJ2_A2159AlbRecPie ;
   private java.math.BigDecimal[] P00JJ2_A2155AlbRecKgm ;
   private String[] P00JJ2_A3731AlbRecIdPz ;
   private String[] P00JJ2_A50AlbRLoc ;
   private java.math.BigDecimal[] P00JJ2_A2157AlbRecMtr ;
   private int[] P00JJ2_A44AlbRecCod ;
   private java.math.BigDecimal[] P00JJ2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P00JJ2_A2156AlbRecKgmU ;
   private int[] P00JJ6_A44AlbRecCod ;
   private String[] P00JJ6_A396EmprCod ;
   private String[] P00JJ6_A56AlbRUni ;
   private java.math.BigDecimal[] P00JJ6_A60AlbRUniUti ;
   private int[] P00JJ6_A54AlbRPieUti ;
   private byte[] P00JJ6_A47AlbREst ;
}

final  class pgdisald__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00JJ2", "SELECT T1.EmprCod, T1.AlbRecAnh, T1.AlbRecPie, T1.AlbRecKgm, T1.AlbRecIdPz, T2.AlbRLoc, T1.AlbRecMtr, T1.AlbRecCod, T1.AlbRecMtrU, T1.AlbRecKgmU FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00JJ3", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00JJ4", "UPDATE TXPALBDET SET AlbRecMtrU=?, AlbRecKgmU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBDET")
         ,new UpdateCursor("P00JJ5", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P00JJ6", "SELECT AlbRecCod, EmprCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00JJ7", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

