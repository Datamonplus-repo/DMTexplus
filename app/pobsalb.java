package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pobsalb extends GXProcedure
{
   public pobsalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pobsalb.class ), "" );
   }

   public pobsalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 )
   {
      pobsalb.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 )
   {
      pobsalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pobsalb.this.AV8AlbProcod = aP1[0];
      this.aP1 = aP1;
      pobsalb.this.AV9Clicod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12ALBPOBSLIN = (byte)(0) ;
      /* Using cursor P02QT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02QT2_A252CliCod[0] ;
         A3629CliObs = P02QT2_A3629CliObs[0] ;
         W396EmprCod = A396EmprCod ;
         AV10NLin = GXutil.gxmlines( A3629CliObs, (short)(50)) ;
         while ( AV13i <= AV10NLin )
         {
            AV11ALBPOBS = GXutil.gxgetmli( A3629CliObs, AV13i, (short)(50)) ;
            if ( GXutil.strcmp(AV11ALBPOBS, " ") != 0 )
            {
               AV12ALBPOBSLIN = (byte)(AV12ALBPOBSLIN+1) ;
               /*
                  INSERT RECORD ON TABLE TXPOBSALB

               */
               W396EmprCod = A396EmprCod ;
               A30AlbProCod = AV8AlbProcod ;
               A915AlbPObsLin = AV12ALBPOBSLIN ;
               A916AlbPObs = AV11ALBPOBS ;
               /* Using cursor P02QT3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
               /* End Insert */
            }
            AV13i = (short)(AV13i+1) ;
         }
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P02QT4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV12ALBPOBSLIN), A396EmprCod, Long.valueOf(AV8AlbProcod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pobsalb.this.A396EmprCod;
      this.aP1[0] = pobsalb.this.AV8AlbProcod;
      this.aP2[0] = pobsalb.this.AV9Clicod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pobsalb");
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
      P02QT2_A396EmprCod = new String[] {""} ;
      P02QT2_A252CliCod = new int[1] ;
      P02QT2_A3629CliObs = new String[] {""} ;
      A3629CliObs = "" ;
      W396EmprCod = "" ;
      AV11ALBPOBS = "" ;
      A916AlbPObs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pobsalb__default(),
         new Object[] {
             new Object[] {
            P02QT2_A396EmprCod, P02QT2_A252CliCod, P02QT2_A3629CliObs
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

   private byte AV12ALBPOBSLIN ;
   private byte A915AlbPObsLin ;
   private byte A914AlbPObsCon ;
   private short AV13i ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int A252CliCod ;
   private int AV10NLin ;
   private int GX_INS121 ;
   private long AV8AlbProcod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String AV11ALBPOBS ;
   private String A916AlbPObs ;
   private String Gx_emsg ;
   private String A3629CliObs ;
   private int[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02QT2_A396EmprCod ;
   private int[] P02QT2_A252CliCod ;
   private String[] P02QT2_A3629CliObs ;
}

final  class pobsalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QT2", "SELECT EmprCod, CliCod, CliObs FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02QT3", "INSERT INTO TXPOBSALB(EmprCod, AlbProCod, AlbPObsLin, AlbPObs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSALB")
         ,new UpdateCursor("P02QT4", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 50);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

