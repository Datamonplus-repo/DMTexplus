package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppcopobs extends GXProcedure
{
   public ppcopobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppcopobs.class ), "" );
   }

   public ppcopobs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      ppcopobs.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      ppcopobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppcopobs.this.AV8AlbProcod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV10Endutex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int2) ;
      ppcopobs.this.GXt_int1 = GXv_int2[0] ;
      AV10Endutex = GXt_int1 ;
      AV11AlbPobscon = (byte)(0) ;
      AV12AlbPobslin = (byte)(0) ;
      /* Using cursor P03L62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8AlbProcod), Byte.valueOf(AV10Endutex)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P03L62_A30AlbProCod[0] ;
         A212BarSer = P03L62_A212BarSer[0] ;
         A361DisCod = P03L62_A361DisCod[0] ;
         A130BarCodPar = P03L62_A130BarCodPar[0] ;
         A132BarCodReo = P03L62_A132BarCodReo[0] ;
         A129BarCod = P03L62_A129BarCod[0] ;
         A212BarSer = P03L62_A212BarSer[0] ;
         A361DisCod = P03L62_A361DisCod[0] ;
         if ( GXutil.strcmp(GXutil.substring( A212BarSer, 1, 5), "5000") >= 0 )
         {
            AV9Discod = A361DisCod ;
            /* Execute user subroutine: 'OBSERV' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P03L63 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV12AlbPobslin), A396EmprCod, Long.valueOf(AV8AlbProcod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "ppcopobs");
      cleanup();
   }

   public void S111( )
   {
      /* 'OBSERV' Routine */
      returnInSub = false ;
      /* Using cursor P03L64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV9Discod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A377DisObsTxt = P03L64_A377DisObsTxt[0] ;
         A361DisCod = P03L64_A361DisCod[0] ;
         A376DisObsLin = P03L64_A376DisObsLin[0] ;
         W396EmprCod = A396EmprCod ;
         AV13AlbPobs = GXutil.space( (short)(50)) ;
         if ( GXutil.len( A377DisObsTxt) > 50 )
         {
            AV13AlbPobs = GXutil.substring( A377DisObsTxt, 51, 10) ;
         }
         AV12AlbPobslin = (byte)(AV12AlbPobslin+1) ;
         /*
            INSERT RECORD ON TABLE TXPOBSALB

         */
         W396EmprCod = A396EmprCod ;
         A30AlbProCod = AV8AlbProcod ;
         A915AlbPObsLin = AV12AlbPobslin ;
         A916AlbPObs = GXutil.substring( A377DisObsTxt, 1, 50) ;
         /* Using cursor P03L65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         if ( GXutil.strcmp(AV13AlbPobs, " ") != 0 )
         {
            AV12AlbPobslin = (byte)(AV12AlbPobslin+1) ;
            /*
               INSERT RECORD ON TABLE TXPOBSALB

            */
            W396EmprCod = A396EmprCod ;
            A30AlbProCod = AV8AlbProcod ;
            A915AlbPObsLin = AV12AlbPobslin ;
            A916AlbPObs = AV13AlbPobs ;
            /* Using cursor P03L66 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
            A396EmprCod = W396EmprCod ;
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppcopobs.this.A396EmprCod;
      this.aP1[0] = ppcopobs.this.AV8AlbProcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppcopobs");
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
      scmdbuf = "" ;
      P03L62_A396EmprCod = new String[] {""} ;
      P03L62_A30AlbProCod = new long[1] ;
      P03L62_A212BarSer = new String[] {""} ;
      P03L62_A361DisCod = new int[1] ;
      P03L62_A130BarCodPar = new String[] {""} ;
      P03L62_A132BarCodReo = new byte[1] ;
      P03L62_A129BarCod = new int[1] ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      P03L64_A396EmprCod = new String[] {""} ;
      P03L64_A377DisObsTxt = new String[] {""} ;
      P03L64_A361DisCod = new int[1] ;
      P03L64_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      W396EmprCod = "" ;
      AV13AlbPobs = "" ;
      A916AlbPObs = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ppcopobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ppcopobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ppcopobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppcopobs__default(),
         new Object[] {
             new Object[] {
            P03L62_A396EmprCod, P03L62_A30AlbProCod, P03L62_A212BarSer, P03L62_A361DisCod, P03L62_A130BarCodPar, P03L62_A132BarCodReo, P03L62_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03L64_A396EmprCod, P03L64_A377DisObsTxt, P03L64_A361DisCod, P03L64_A376DisObsLin
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

   private byte AV10Endutex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV11AlbPobscon ;
   private byte AV12AlbPobslin ;
   private byte A132BarCodReo ;
   private byte A914AlbPObsCon ;
   private byte A376DisObsLin ;
   private byte A915AlbPObsLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV9Discod ;
   private int GX_INS121 ;
   private long AV8AlbProcod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A377DisObsTxt ;
   private String W396EmprCod ;
   private String AV13AlbPobs ;
   private String A916AlbPObs ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03L62_A396EmprCod ;
   private long[] P03L62_A30AlbProCod ;
   private String[] P03L62_A212BarSer ;
   private int[] P03L62_A361DisCod ;
   private String[] P03L62_A130BarCodPar ;
   private byte[] P03L62_A132BarCodReo ;
   private int[] P03L62_A129BarCod ;
   private String[] P03L64_A396EmprCod ;
   private String[] P03L64_A377DisObsTxt ;
   private int[] P03L64_A361DisCod ;
   private byte[] P03L64_A376DisObsLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class ppcopobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class ppcopobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class ppcopobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class ppcopobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L62", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarSer, T2.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L63", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P03L64", "SELECT EmprCod, DisObsTxt, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L65", "INSERT INTO TXPOBSALB(EmprCod, AlbProCod, AlbPObsLin, AlbPObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P03L66", "INSERT INTO TXPOBSALB(EmprCod, AlbProCod, AlbPObsLin, AlbPObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 50);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 50);
               return;
      }
   }

}

