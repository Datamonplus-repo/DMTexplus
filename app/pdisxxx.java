package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisxxx extends GXProcedure
{
   public pdisxxx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisxxx.class ), "" );
   }

   public pdisxxx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.math.BigDecimal aP3 ,
                        int aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.math.BigDecimal aP3 ,
                             int aP4 ,
                             String aP5 )
   {
      pdisxxx.this.A396EmprCod = aP0;
      pdisxxx.this.AV20Discod = aP1;
      pdisxxx.this.AV21AlbReccod = aP2;
      pdisxxx.this.AV22Cant = aP3;
      pdisxxx.this.AV23Pzs = aP4;
      pdisxxx.this.Gx_mode = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV30moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pdisxxx.this.GXt_int1 = GXv_int2[0] ;
      AV30moda21 = GXt_int1 ;
      AV25Kilos = DecimalUtil.doubleToDec(0) ;
      AV26Metros = DecimalUtil.doubleToDec(0) ;
      AV27Piezas = 0 ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DEL", "")) == 0 )
      {
         AV22Cant = DecimalUtil.doubleToDec(0) ;
         AV23Pzs = 0 ;
         /* Using cursor P044K2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV20Discod), Integer.valueOf(AV21AlbReccod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A44AlbRecCod = P044K2_A44AlbRecCod[0] ;
            A361DisCod = P044K2_A361DisCod[0] ;
            A595Kilos = P044K2_A595Kilos[0] ;
            A631Metros = P044K2_A631Metros[0] ;
            A673Piezas = P044K2_A673Piezas[0] ;
            A55AlbRReo = P044K2_A55AlbRReo[0] ;
            A55AlbRReo = P044K2_A55AlbRReo[0] ;
            AV25Kilos = A595Kilos ;
            AV26Metros = A631Metros ;
            AV27Piezas = A673Piezas ;
            if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
            {
               /* Execute user subroutine: 'DISDEF' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
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
            /* Using cursor P044K3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P044K4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV20Discod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P044K4_A361DisCod[0] ;
         A392DisUniMed = P044K4_A392DisUniMed[0] ;
         A2009DisTipDis = P044K4_A2009DisTipDis[0] ;
         n2009DisTipDis = P044K4_n2009DisTipDis[0] ;
         AV24DisUnimed = A392DisUniMed ;
         AV29DistipDis = A2009DisTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV36GXLvl37 = (byte)(0) ;
      /* Using cursor P044K5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV20Discod), Integer.valueOf(AV21AlbReccod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A44AlbRecCod = P044K5_A44AlbRecCod[0] ;
         A361DisCod = P044K5_A361DisCod[0] ;
         A595Kilos = P044K5_A595Kilos[0] ;
         A631Metros = P044K5_A631Metros[0] ;
         A673Piezas = P044K5_A673Piezas[0] ;
         AV36GXLvl37 = (byte)(1) ;
         AV25Kilos = A595Kilos ;
         AV26Metros = A631Metros ;
         AV27Piezas = A673Piezas ;
         if ( GXutil.strcmp(AV24DisUnimed, httpContext.getMessage( "K", "")) == 0 )
         {
            A595Kilos = AV22Cant ;
         }
         else
         {
            A631Metros = AV22Cant ;
         }
         A673Piezas = AV23Pzs ;
         /* Using cursor P044K6 */
         pr_default.execute(4, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV36GXLvl37 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         A361DisCod = AV20Discod ;
         A44AlbRecCod = AV21AlbReccod ;
         if ( GXutil.strcmp(AV24DisUnimed, httpContext.getMessage( "K", "")) == 0 )
         {
            A595Kilos = AV22Cant ;
         }
         else
         {
            A631Metros = AV22Cant ;
         }
         A673Piezas = AV23Pzs ;
         A3699KilosUti = DecimalUtil.doubleToDec(0) ;
         n3699KilosUti = false ;
         A3700MetrosUti = DecimalUtil.doubleToDec(0) ;
         n3700MetrosUti = false ;
         A3701PiezasUti = (short)(0) ;
         n3701PiezasUti = false ;
         /* Using cursor P044K7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(5) == 1) )
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
      /* Execute user subroutine: 'ALBREC' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBREC' Routine */
      returnInSub = false ;
      /* Using cursor P044K8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV21AlbReccod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A44AlbRecCod = P044K8_A44AlbRecCod[0] ;
         A56AlbRUni = P044K8_A56AlbRUni[0] ;
         A60AlbRUniUti = P044K8_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P044K8_A54AlbRPieUti[0] ;
         A47AlbREst = P044K8_A47AlbREst[0] ;
         A52AlbRPieEnt = P044K8_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P044K8_A58AlbRUniEnt[0] ;
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A60AlbRUniUti = A60AlbRUniUti.subtract(AV25Kilos).add(AV22Cant) ;
         }
         else
         {
            A60AlbRUniUti = A60AlbRUniUti.subtract(AV26Metros).add(AV22Cant) ;
         }
         A54AlbRPieUti = (int)(A54AlbRPieUti-AV27Piezas+AV23Pzs) ;
         A47AlbREst = (byte)(0) ;
         if ( ( AV30moda21 == 1 ) && ( GXutil.strcmp(AV29DistipDis, "L") == 0 ) )
         {
            if ( A54AlbRPieUti >= A52AlbRPieEnt )
            {
               A47AlbREst = (byte)(1) ;
            }
         }
         else
         {
            if ( DecimalUtil.compareTo(A60AlbRUniUti, A58AlbRUniEnt) >= 0 )
            {
               A47AlbREst = (byte)(1) ;
            }
         }
         /* Using cursor P044K9 */
         pr_default.execute(7, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S121( )
   {
      /* 'DISDEF' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P044K10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV20Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pdisxxx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV25Kilos = DecimalUtil.ZERO ;
      AV26Metros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P044K2_A396EmprCod = new String[] {""} ;
      P044K2_A44AlbRecCod = new int[1] ;
      P044K2_A361DisCod = new int[1] ;
      P044K2_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044K2_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044K2_A673Piezas = new int[1] ;
      P044K2_A55AlbRReo = new String[] {""} ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      P044K4_A396EmprCod = new String[] {""} ;
      P044K4_A361DisCod = new int[1] ;
      P044K4_A392DisUniMed = new String[] {""} ;
      P044K4_A2009DisTipDis = new String[] {""} ;
      P044K4_n2009DisTipDis = new boolean[] {false} ;
      A392DisUniMed = "" ;
      A2009DisTipDis = "" ;
      AV24DisUnimed = "" ;
      AV29DistipDis = "" ;
      P044K5_A396EmprCod = new String[] {""} ;
      P044K5_A44AlbRecCod = new int[1] ;
      P044K5_A361DisCod = new int[1] ;
      P044K5_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044K5_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044K5_A673Piezas = new int[1] ;
      A3699KilosUti = DecimalUtil.ZERO ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P044K8_A396EmprCod = new String[] {""} ;
      P044K8_A44AlbRecCod = new int[1] ;
      P044K8_A56AlbRUni = new String[] {""} ;
      P044K8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P044K8_A54AlbRPieUti = new int[1] ;
      P044K8_A47AlbREst = new byte[1] ;
      P044K8_A52AlbRPieEnt = new int[1] ;
      P044K8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisxxx__default(),
         new Object[] {
             new Object[] {
            P044K2_A396EmprCod, P044K2_A44AlbRecCod, P044K2_A361DisCod, P044K2_A595Kilos, P044K2_A631Metros, P044K2_A673Piezas, P044K2_A55AlbRReo
            }
            , new Object[] {
            }
            , new Object[] {
            P044K4_A396EmprCod, P044K4_A361DisCod, P044K4_A392DisUniMed, P044K4_A2009DisTipDis, P044K4_n2009DisTipDis
            }
            , new Object[] {
            P044K5_A396EmprCod, P044K5_A44AlbRecCod, P044K5_A361DisCod, P044K5_A595Kilos, P044K5_A631Metros, P044K5_A673Piezas
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P044K8_A396EmprCod, P044K8_A44AlbRecCod, P044K8_A56AlbRUni, P044K8_A60AlbRUniUti, P044K8_A54AlbRPieUti, P044K8_A47AlbREst, P044K8_A52AlbRPieEnt, P044K8_A58AlbRUniEnt
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

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV36GXLvl37 ;
   private byte A47AlbREst ;
   private short AV30moda21 ;
   private short A3701PiezasUti ;
   private short Gx_err ;
   private int AV20Discod ;
   private int AV21AlbReccod ;
   private int AV23Pzs ;
   private int AV27Piezas ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int A673Piezas ;
   private int GX_INS35 ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private java.math.BigDecimal AV22Cant ;
   private java.math.BigDecimal AV25Kilos ;
   private java.math.BigDecimal AV26Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A55AlbRReo ;
   private String A392DisUniMed ;
   private String A2009DisTipDis ;
   private String AV24DisUnimed ;
   private String AV29DistipDis ;
   private String Gx_emsg ;
   private String A56AlbRUni ;
   private boolean returnInSub ;
   private boolean n2009DisTipDis ;
   private boolean n3699KilosUti ;
   private boolean n3700MetrosUti ;
   private boolean n3701PiezasUti ;
   private IDataStoreProvider pr_default ;
   private String[] P044K2_A396EmprCod ;
   private int[] P044K2_A44AlbRecCod ;
   private int[] P044K2_A361DisCod ;
   private java.math.BigDecimal[] P044K2_A595Kilos ;
   private java.math.BigDecimal[] P044K2_A631Metros ;
   private int[] P044K2_A673Piezas ;
   private String[] P044K2_A55AlbRReo ;
   private String[] P044K4_A396EmprCod ;
   private int[] P044K4_A361DisCod ;
   private String[] P044K4_A392DisUniMed ;
   private String[] P044K4_A2009DisTipDis ;
   private boolean[] P044K4_n2009DisTipDis ;
   private String[] P044K5_A396EmprCod ;
   private int[] P044K5_A44AlbRecCod ;
   private int[] P044K5_A361DisCod ;
   private java.math.BigDecimal[] P044K5_A595Kilos ;
   private java.math.BigDecimal[] P044K5_A631Metros ;
   private int[] P044K5_A673Piezas ;
   private String[] P044K8_A396EmprCod ;
   private int[] P044K8_A44AlbRecCod ;
   private String[] P044K8_A56AlbRUni ;
   private java.math.BigDecimal[] P044K8_A60AlbRUniUti ;
   private int[] P044K8_A54AlbRPieUti ;
   private byte[] P044K8_A47AlbREst ;
   private int[] P044K8_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P044K8_A58AlbRUniEnt ;
}

final  class pdisxxx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P044K2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.DisCod, T1.Kilos, T1.Metros, T1.Piezas, T2.AlbRReo FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P044K3", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P044K4", "SELECT EmprCod, DisCod, DisUniMed, DisTipDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P044K5", "SELECT EmprCod, AlbRecCod, DisCod, Kilos, Metros, Piezas FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P044K6", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P044K7", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P044K8", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbREst, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P044K9", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P044K10", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

