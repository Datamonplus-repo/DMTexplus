package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpdisposupdateredundancy extends GXProcedure
{
   public txpdisposupdateredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpdisposupdateredundancy.class ), "" );
   }

   public txpdisposupdateredundancy( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      txpdisposupdateredundancy.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      txpdisposupdateredundancy.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      txpdisposupdateredundancy.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPDISPOSU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A365DisDes = TXPDISPOSU2_A365DisDes[0] ;
         A252CliCod = TXPDISPOSU2_A252CliCod[0] ;
         n252CliCod = TXPDISPOSU2_n252CliCod[0] ;
         W361DisCod = A361DisCod ;
         AV2GXV365 = A365DisDes ;
         AV3GXV252 = A252CliCod ;
         n252CliCod = false ;
         /* Optimized UPDATE. */
         /* Using cursor TXPDISPOSU3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(AV3GXV252), AV2GXV365, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
         /* Using cursor TXPDISPOSU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A396EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A129BarCod = TXPDISPOSU4_A129BarCod[0] ;
            n129BarCod = TXPDISPOSU4_n129BarCod[0] ;
            A132BarCodReo = TXPDISPOSU4_A132BarCodReo[0] ;
            n132BarCodReo = TXPDISPOSU4_n132BarCodReo[0] ;
            A130BarCodPar = TXPDISPOSU4_A130BarCodPar[0] ;
            n130BarCodPar = TXPDISPOSU4_n130BarCodPar[0] ;
            A252CliCod = TXPDISPOSU4_A252CliCod[0] ;
            n252CliCod = TXPDISPOSU4_n252CliCod[0] ;
            A5294InPTime = TXPDISPOSU4_A5294InPTime[0] ;
            A652OpeCod = TXPDISPOSU4_A652OpeCod[0] ;
            /* Using cursor TXPDISPOSU5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
            if ( TXPDISPOSU5_A361DisCod[0] == A361DisCod )
            {
               A252CliCod = AV3GXV252 ;
               n252CliCod = false ;
               /* Using cursor TXPDISPOSU6 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A5294InPTime, Integer.valueOf(A652OpeCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.close(3);
         A361DisCod = W361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = txpdisposupdateredundancy.this.A396EmprCod;
      this.aP1[0] = txpdisposupdateredundancy.this.A361DisCod;
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
      TXPDISPOSU2_A396EmprCod = new String[] {""} ;
      TXPDISPOSU2_A361DisCod = new int[1] ;
      TXPDISPOSU2_A365DisDes = new String[] {""} ;
      TXPDISPOSU2_A252CliCod = new int[1] ;
      TXPDISPOSU2_n252CliCod = new boolean[] {false} ;
      A365DisDes = "" ;
      AV2GXV365 = "" ;
      TXPDISPOSU4_A129BarCod = new int[1] ;
      TXPDISPOSU4_n129BarCod = new boolean[] {false} ;
      TXPDISPOSU4_A132BarCodReo = new byte[1] ;
      TXPDISPOSU4_n132BarCodReo = new boolean[] {false} ;
      TXPDISPOSU4_A130BarCodPar = new String[] {""} ;
      TXPDISPOSU4_n130BarCodPar = new boolean[] {false} ;
      TXPDISPOSU4_A396EmprCod = new String[] {""} ;
      TXPDISPOSU4_A252CliCod = new int[1] ;
      TXPDISPOSU4_n252CliCod = new boolean[] {false} ;
      TXPDISPOSU4_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      TXPDISPOSU4_A652OpeCod = new int[1] ;
      A130BarCodPar = "" ;
      A5294InPTime = GXutil.resetTime( GXutil.nullDate() );
      TXPDISPOSU5_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpdisposupdateredundancy__default(),
         new Object[] {
             new Object[] {
            TXPDISPOSU2_A396EmprCod, TXPDISPOSU2_A361DisCod, TXPDISPOSU2_A365DisDes, TXPDISPOSU2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            TXPDISPOSU4_A129BarCod, TXPDISPOSU4_n129BarCod, TXPDISPOSU4_A132BarCodReo, TXPDISPOSU4_n132BarCodReo, TXPDISPOSU4_A130BarCodPar, TXPDISPOSU4_n130BarCodPar, TXPDISPOSU4_A396EmprCod, TXPDISPOSU4_A252CliCod, TXPDISPOSU4_n252CliCod, TXPDISPOSU4_A5294InPTime,
            TXPDISPOSU4_A652OpeCod
            }
            , new Object[] {
            TXPDISPOSU5_A361DisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int W361DisCod ;
   private int AV3GXV252 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String AV2GXV365 ;
   private String A130BarCodPar ;
   private java.util.Date A5294InPTime ;
   private boolean n252CliCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPDISPOSU2_A396EmprCod ;
   private int[] TXPDISPOSU2_A361DisCod ;
   private String[] TXPDISPOSU2_A365DisDes ;
   private int[] TXPDISPOSU2_A252CliCod ;
   private boolean[] TXPDISPOSU2_n252CliCod ;
   private int[] TXPDISPOSU4_A129BarCod ;
   private boolean[] TXPDISPOSU4_n129BarCod ;
   private byte[] TXPDISPOSU4_A132BarCodReo ;
   private boolean[] TXPDISPOSU4_n132BarCodReo ;
   private String[] TXPDISPOSU4_A130BarCodPar ;
   private boolean[] TXPDISPOSU4_n130BarCodPar ;
   private String[] TXPDISPOSU4_A396EmprCod ;
   private int[] TXPDISPOSU4_A252CliCod ;
   private boolean[] TXPDISPOSU4_n252CliCod ;
   private java.util.Date[] TXPDISPOSU4_A5294InPTime ;
   private int[] TXPDISPOSU4_A652OpeCod ;
   private int[] TXPDISPOSU5_A361DisCod ;
}

final  class txpdisposupdateredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPDISPOSU2", "SELECT EmprCod, DisCod, DisDes, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("TXPDISPOSU3", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("TXPDISPOSU4", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, CliCod, InPTime, OpeCod FROM TXPINCPRO WHERE (EmprCod = ?) AND (EmprCod = ?) ORDER BY EmprCod  FOR UPDATE OF CliCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPDISPOSU5", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPDISPOSU6", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND InPTime = ? AND OpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCPRO")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

