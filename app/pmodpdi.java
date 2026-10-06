package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodpdi extends GXProcedure
{
   public pmodpdi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodpdi.class ), "" );
   }

   public pmodpdi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 )
   {
      pmodpdi.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pmodpdi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodpdi.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pmodpdi.this.AV15AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pmodpdi.this.AV16BarPieCod = aP3[0];
      this.aP3 = aP3;
      pmodpdi.this.AV17BarPieKil = aP4[0];
      this.aP4 = aP4;
      pmodpdi.this.AV18BarPieKA = aP5[0];
      this.aP5 = aP5;
      pmodpdi.this.AV19BarPieMet = aP6[0];
      this.aP6 = aP6;
      pmodpdi.this.AV20BarPieMA = aP7[0];
      this.aP7 = aP7;
      pmodpdi.this.AV21BarPiePie = aP8[0];
      this.aP8 = aP8;
      pmodpdi.this.AV22BarPiePA = aP9[0];
      this.aP9 = aP9;
      pmodpdi.this.AV23Desglose = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV26FlagMB ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      pmodpdi.this.AV26FlagMB = GXv_int1[0] ;
      if ( GXutil.strcmp(AV23Desglose, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P00A52 */
         pr_default.execute(0, new Object[] {AV20BarPieMA, AV19BarPieMet, AV18BarPieKA, AV17BarPieKil, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV15AlbRecCod), AV16BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         /* End optimized UPDATE. */
      }
      else
      {
         /* Optimized UPDATE. */
         /* Using cursor P00A53 */
         pr_default.execute(1, new Object[] {AV20BarPieMA, AV19BarPieMet, AV18BarPieKA, AV17BarPieKil, Integer.valueOf(AV22BarPiePA), Integer.valueOf(AV21BarPiePie), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV15AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* End optimized UPDATE. */
         if ( AV26FlagMB == 1 )
         {
            /* Optimized UPDATE. */
            /* Using cursor P00A54 */
            pr_default.execute(2, new Object[] {AV18BarPieKA, AV17BarPieKil, A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            /* End optimized UPDATE. */
         }
      }
      GXv_int1[0] = AV24Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pmodpdi.this.AV24Flag1 = GXv_int1[0] ;
      if ( AV24Flag1 == 1 )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV15AlbRecCod ;
         GXv_char4[0] = AV16BarPieCod ;
         GXv_decimal5[0] = AV17BarPieKil ;
         GXv_decimal6[0] = AV19BarPieMet ;
         GXv_decimal7[0] = AV18BarPieKA ;
         GXv_decimal8[0] = AV20BarPieMA ;
         GXv_char9[0] = httpContext.getMessage( "UPD", "") ;
         new app.pdetpie(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_char9) ;
         pmodpdi.this.A396EmprCod = GXv_char2[0] ;
         pmodpdi.this.AV15AlbRecCod = GXv_int3[0] ;
         pmodpdi.this.AV16BarPieCod = GXv_char4[0] ;
         pmodpdi.this.AV17BarPieKil = GXv_decimal5[0] ;
         pmodpdi.this.AV19BarPieMet = GXv_decimal6[0] ;
         pmodpdi.this.AV18BarPieKA = GXv_decimal7[0] ;
         pmodpdi.this.AV20BarPieMA = GXv_decimal8[0] ;
         /* Using cursor P00A56 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = P00A56_A44AlbRecCod[0] ;
            A56AlbRUni = P00A56_A56AlbRUni[0] ;
            A47AlbREst = P00A56_A47AlbREst[0] ;
            A2151AlbDetMtrU = P00A56_A2151AlbDetMtrU[0] ;
            A2149AlbDetMtr = P00A56_A2149AlbDetMtr[0] ;
            A2148AlbDetKgmU = P00A56_A2148AlbDetKgmU[0] ;
            A2146AlbDetKgm = P00A56_A2146AlbDetKgm[0] ;
            A2151AlbDetMtrU = P00A56_A2151AlbDetMtrU[0] ;
            A2149AlbDetMtr = P00A56_A2149AlbDetMtr[0] ;
            A2148AlbDetKgmU = P00A56_A2148AlbDetKgmU[0] ;
            A2146AlbDetKgm = P00A56_A2146AlbDetKgm[0] ;
            A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
            A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
            if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
            }
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
            }
            if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
            {
               A47AlbREst = (byte)(0) ;
            }
            if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
            {
               A47AlbREst = (byte)(0) ;
            }
            /* Using cursor P00A57 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else
      {
         /* Using cursor P00A58 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A44AlbRecCod = P00A58_A44AlbRecCod[0] ;
            A47AlbREst = P00A58_A47AlbREst[0] ;
            A60AlbRUniUti = P00A58_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = P00A58_A58AlbRUniEnt[0] ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
            }
            A47AlbREst = (byte)(0) ;
            if ( A57AlbRUniDis.doubleValue() == 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
            /* Using cursor P00A59 */
            pr_default.execute(6, new Object[] {Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodpdi.this.A396EmprCod;
      this.aP1[0] = pmodpdi.this.A361DisCod;
      this.aP2[0] = pmodpdi.this.AV15AlbRecCod;
      this.aP3[0] = pmodpdi.this.AV16BarPieCod;
      this.aP4[0] = pmodpdi.this.AV17BarPieKil;
      this.aP5[0] = pmodpdi.this.AV18BarPieKA;
      this.aP6[0] = pmodpdi.this.AV19BarPieMet;
      this.aP7[0] = pmodpdi.this.AV20BarPieMA;
      this.aP8[0] = pmodpdi.this.AV21BarPiePie;
      this.aP9[0] = pmodpdi.this.AV22BarPiePA;
      this.aP10[0] = pmodpdi.this.AV23Desglose;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodpdi");
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
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      scmdbuf = "" ;
      P00A56_A396EmprCod = new String[] {""} ;
      P00A56_A44AlbRecCod = new int[1] ;
      P00A56_A56AlbRUni = new String[] {""} ;
      P00A56_A47AlbREst = new byte[1] ;
      P00A56_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A56_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A56_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A56_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A56AlbRUni = "" ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      P00A58_A396EmprCod = new String[] {""} ;
      P00A58_A44AlbRecCod = new int[1] ;
      P00A58_A47AlbREst = new byte[1] ;
      P00A58_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A58_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodpdi__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00A56_A396EmprCod, P00A56_A44AlbRecCod, P00A56_A56AlbRUni, P00A56_A47AlbREst, P00A56_A2151AlbDetMtrU, P00A56_A2149AlbDetMtr, P00A56_A2148AlbDetKgmU, P00A56_A2146AlbDetKgm
            }
            , new Object[] {
            }
            , new Object[] {
            P00A58_A396EmprCod, P00A58_A44AlbRecCod, P00A58_A47AlbREst, P00A58_A60AlbRUniUti, P00A58_A58AlbRUniEnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26FlagMB ;
   private byte AV24Flag1 ;
   private byte GXv_int1[] ;
   private byte A47AlbREst ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV15AlbRecCod ;
   private int AV21BarPiePie ;
   private int AV22BarPiePA ;
   private int GXv_int3[] ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV17BarPieKil ;
   private java.math.BigDecimal AV18BarPieKA ;
   private java.math.BigDecimal AV19BarPieMet ;
   private java.math.BigDecimal AV20BarPieMA ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String A396EmprCod ;
   private String AV16BarPieCod ;
   private String AV23Desglose ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char9[] ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A56_A396EmprCod ;
   private int[] P00A56_A44AlbRecCod ;
   private String[] P00A56_A56AlbRUni ;
   private byte[] P00A56_A47AlbREst ;
   private java.math.BigDecimal[] P00A56_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] P00A56_A2149AlbDetMtr ;
   private java.math.BigDecimal[] P00A56_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] P00A56_A2146AlbDetKgm ;
   private String[] P00A58_A396EmprCod ;
   private int[] P00A58_A44AlbRecCod ;
   private byte[] P00A58_A47AlbREst ;
   private java.math.BigDecimal[] P00A58_A60AlbRUniUti ;
   private java.math.BigDecimal[] P00A58_A58AlbRUniEnt ;
}

final  class pmodpdi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00A52", "UPDATE TXPDISALD SET DisPieMet=DisPieMet - ? + ?, DisPieKil=DisPieKil - ? + ?  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00A53", "UPDATE TXPDISALB SET Metros=Metros - ? + ?, Kilos=Kilos - ? + ?, Piezas=Piezas - ? + ?  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00A54", "UPDATE TXPDISPOS SET DisNumUni=DisNumUni - ? + ?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P00A56", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRUni, T1.AlbREst, COALESCE( T2.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T2.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T2.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T2.AlbDetKgm, 0) AS AlbDetKgm FROM (TXPALBREC T1 LEFT JOIN (SELECT SUM(AlbRecKgm) AS AlbDetKgm, EmprCod, AlbRecCod, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecMtrU) AS AlbDetMtrU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A57", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P00A58", "SELECT EmprCod, AlbRecCod, AlbREst, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A59", "UPDATE TXPALBREC SET AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

