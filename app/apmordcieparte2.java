package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apmordcieparte2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apmordcieparte2 pgm = new apmordcieparte2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public apmordcieparte2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apmordcieparte2.class ), "" );
   }

   public apmordcieparte2( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      apmordcieparte2.this.aP1 = new int[] {0};
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
      apmordcieparte2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apmordcieparte2.this.A9425OMCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P08PW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9429PMCod = P08PW2_A9429PMCod[0] ;
         n9429PMCod = P08PW2_n9429PMCod[0] ;
         A9439OMFchCer = P08PW2_A9439OMFchCer[0] ;
         /* Using cursor P08PW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         A9486PMUlt = P08PW3_A9486PMUlt[0] ;
         n9486PMUlt = P08PW3_n9486PMUlt[0] ;
         A9488PMOrd = P08PW3_A9488PMOrd[0] ;
         n9488PMOrd = P08PW3_n9488PMOrd[0] ;
         A9486PMUlt = GXutil.serverDate( context, remoteHandle, pr_default) ;
         n9486PMUlt = false ;
         A9488PMOrd = 0 ;
         n9488PMOrd = false ;
         /* Using cursor P08PW4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n9486PMUlt), A9486PMUlt, Boolean.valueOf(n9488PMOrd), Integer.valueOf(A9488PMOrd), A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      /* Using cursor P08PW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A9428SMCod = P08PW5_A9428SMCod[0] ;
         n9428SMCod = P08PW5_n9428SMCod[0] ;
         A9445OMEst = P08PW5_A9445OMEst[0] ;
         A9439OMFchCer = P08PW5_A9439OMFchCer[0] ;
         AV8SMCod = A9428SMCod ;
         A9445OMEst = httpContext.getMessage( "R", "") ;
         A9439OMFchCer = AV13ServerNow ;
         /* Using cursor P08PW6 */
         pr_default.execute(4, new Object[] {A9445OMEst, A9439OMFchCer, A396EmprCod, Integer.valueOf(A9425OMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P08PW7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV8SMCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A9428SMCod = P08PW7_A9428SMCod[0] ;
         n9428SMCod = P08PW7_n9428SMCod[0] ;
         A9522SMEst = P08PW7_A9522SMEst[0] ;
         n9522SMEst = P08PW7_n9522SMEst[0] ;
         A9522SMEst = httpContext.getMessage( "C", "") ;
         n9522SMEst = false ;
         /* Using cursor P08PW8 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n9522SMEst), A9522SMEst, A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pmordcieparte2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apmordcieparte2.this.A396EmprCod;
      this.aP1[0] = apmordcieparte2.this.A9425OMCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apmordcieparte2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13ServerNow = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P08PW2_A9429PMCod = new int[1] ;
      P08PW2_n9429PMCod = new boolean[] {false} ;
      P08PW2_A396EmprCod = new String[] {""} ;
      P08PW2_A9425OMCod = new int[1] ;
      P08PW2_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      P08PW3_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PW3_n9486PMUlt = new boolean[] {false} ;
      P08PW3_A9488PMOrd = new int[1] ;
      P08PW3_n9488PMOrd = new boolean[] {false} ;
      A9486PMUlt = GXutil.nullDate() ;
      P08PW5_A396EmprCod = new String[] {""} ;
      P08PW5_A9425OMCod = new int[1] ;
      P08PW5_A9428SMCod = new int[1] ;
      P08PW5_n9428SMCod = new boolean[] {false} ;
      P08PW5_A9445OMEst = new String[] {""} ;
      P08PW5_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      A9445OMEst = "" ;
      P08PW7_A396EmprCod = new String[] {""} ;
      P08PW7_A9428SMCod = new int[1] ;
      P08PW7_n9428SMCod = new boolean[] {false} ;
      P08PW7_A9522SMEst = new String[] {""} ;
      P08PW7_n9522SMEst = new boolean[] {false} ;
      A9522SMEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apmordcieparte2__default(),
         new Object[] {
             new Object[] {
            P08PW2_A9429PMCod, P08PW2_n9429PMCod, P08PW2_A396EmprCod, P08PW2_A9425OMCod, P08PW2_A9439OMFchCer
            }
            , new Object[] {
            P08PW3_A9486PMUlt, P08PW3_n9486PMUlt, P08PW3_A9488PMOrd, P08PW3_n9488PMOrd
            }
            , new Object[] {
            }
            , new Object[] {
            P08PW5_A396EmprCod, P08PW5_A9425OMCod, P08PW5_A9428SMCod, P08PW5_n9428SMCod, P08PW5_A9445OMEst, P08PW5_A9439OMFchCer
            }
            , new Object[] {
            }
            , new Object[] {
            P08PW7_A396EmprCod, P08PW7_A9428SMCod, P08PW7_A9522SMEst, P08PW7_n9522SMEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int A9428SMCod ;
   private int AV8SMCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9445OMEst ;
   private String A9522SMEst ;
   private java.util.Date AV13ServerNow ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date A9486PMUlt ;
   private boolean n9429PMCod ;
   private boolean n9486PMUlt ;
   private boolean n9488PMOrd ;
   private boolean n9428SMCod ;
   private boolean n9522SMEst ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P08PW2_A9429PMCod ;
   private boolean[] P08PW2_n9429PMCod ;
   private String[] P08PW2_A396EmprCod ;
   private int[] P08PW2_A9425OMCod ;
   private java.util.Date[] P08PW2_A9439OMFchCer ;
   private java.util.Date[] P08PW3_A9486PMUlt ;
   private boolean[] P08PW3_n9486PMUlt ;
   private int[] P08PW3_A9488PMOrd ;
   private boolean[] P08PW3_n9488PMOrd ;
   private String[] P08PW5_A396EmprCod ;
   private int[] P08PW5_A9425OMCod ;
   private int[] P08PW5_A9428SMCod ;
   private boolean[] P08PW5_n9428SMCod ;
   private String[] P08PW5_A9445OMEst ;
   private java.util.Date[] P08PW5_A9439OMFchCer ;
   private String[] P08PW7_A396EmprCod ;
   private int[] P08PW7_A9428SMCod ;
   private boolean[] P08PW7_n9428SMCod ;
   private String[] P08PW7_A9522SMEst ;
   private boolean[] P08PW7_n9522SMEst ;
}

final  class apmordcieparte2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PW2", "SELECT PMCod, EmprCod, OMCod, OMFchCer FROM TXPMORDEN WHERE (EmprCod = ? AND OMCod = ?) AND (EmprCod = ? and OMCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08PW3", "SELECT PMUlt, PMOrd FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ?  FOR UPDATE OF PMUlt, PMOrd NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08PW4", "UPDATE TXPMPREVE SET PMUlt=?, PMOrd=?  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPREVE")
         ,new ForEachCursor("P08PW5", "SELECT EmprCod, OMCod, SMCod, OMEst, OMFchCer FROM TXPMORDEN WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod  FOR UPDATE OF OMEst, OMFchCer NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08PW6", "UPDATE TXPMORDEN SET OMEst=?, OMFchCer=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMORDEN")
         ,new ForEachCursor("P08PW7", "SELECT EmprCod, SMCod, SMEst FROM TXPMSOLIC WHERE (EmprCod = ? and SMCod = ?) AND (SMCod > 0) ORDER BY EmprCod, SMCod  FOR UPDATE OF SMEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08PW8", "UPDATE TXPMSOLIC SET SMEst=?  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMSOLIC")
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
      }
   }

}

