package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparlin extends GXProcedure
{
   public pparlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparlin.class ), "" );
   }

   public pparlin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          java.util.Date[] aP2 )
   {
      pparlin.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             int[] aP3 )
   {
      pparlin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparlin.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pparlin.this.A558HisProFec = aP2[0];
      this.aP2 = aP2;
      pparlin.this.AV9HisProLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Paso = (byte)(1) ;
      GXv_int1[0] = AV8Paso ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARSTP", ""), GXv_int1) ;
      pparlin.this.AV8Paso = (byte)((byte)(GXv_int1[0])) ;
      AV12GXLvl6 = (byte)(0) ;
      /* Using cursor P01X92 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A567HisProULin = P01X92_A567HisProULin[0] ;
         n567HisProULin = P01X92_n567HisProULin[0] ;
         AV12GXLvl6 = (byte)(1) ;
         if ( ( A567HisProULin + AV8Paso ) <= 999 )
         {
            A567HisProULin = (int)(A567HisProULin+AV8Paso) ;
            n567HisProULin = false ;
            AV9HisProLin = A567HisProULin ;
         }
         else
         {
            AV9HisProLin = 999 ;
         }
         /* Using cursor P01X93 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n567HisProULin), Integer.valueOf(A567HisProULin), A396EmprCod, A602MaqCod, A558HisProFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCHIPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl6 == 0 )
      {
         AV9HisProLin = AV8Paso ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparlin.this.A396EmprCod;
      this.aP1[0] = pparlin.this.A602MaqCod;
      this.aP2[0] = pparlin.this.A558HisProFec;
      this.aP3[0] = pparlin.this.AV9HisProLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pparlin");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      scmdbuf = "" ;
      P01X92_A396EmprCod = new String[] {""} ;
      P01X92_A602MaqCod = new String[] {""} ;
      P01X92_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01X92_A567HisProULin = new int[1] ;
      P01X92_n567HisProULin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparlin__default(),
         new Object[] {
             new Object[] {
            P01X92_A396EmprCod, P01X92_A602MaqCod, P01X92_A558HisProFec, P01X92_A567HisProULin, P01X92_n567HisProULin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Paso ;
   private byte AV12GXLvl6 ;
   private short Gx_err ;
   private int AV9HisProLin ;
   private int GXv_int1[] ;
   private int A567HisProULin ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String scmdbuf ;
   private java.util.Date A558HisProFec ;
   private boolean n567HisProULin ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01X92_A396EmprCod ;
   private String[] P01X92_A602MaqCod ;
   private java.util.Date[] P01X92_A558HisProFec ;
   private int[] P01X92_A567HisProULin ;
   private boolean[] P01X92_n567HisProULin ;
}

final  class pparlin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01X92", "SELECT EmprCod, MaqCod, HisProFec, HisProULin FROM TXPCHIPRO WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? ORDER BY EmprCod, MaqCod, HisProFec ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01X93", "UPDATE TXPCHIPRO SET HisProULin=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCHIPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
      }
   }

}

