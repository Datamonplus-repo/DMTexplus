package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putil10 extends GXProcedure
{
   public putil10( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putil10.class ), "" );
   }

   public putil10( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           long[] aP2 ,
                           byte[] aP3 )
   {
      putil10.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      putil10.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putil10.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      putil10.this.A30AlbProCod = aP2[0];
      this.aP2 = aP2;
      putil10.this.AV15FlagAlb = aP3[0];
      this.aP3 = aP3;
      putil10.this.AV16FlagCont = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Suprema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int2) ;
      putil10.this.GXt_int1 = GXv_int2[0] ;
      AV17Suprema = GXt_int1 ;
      if ( AV17Suprema == 1 )
      {
         AV16FlagCont = (byte)(1) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16FlagCont = (byte)(0) ;
      /* Using cursor P00D92 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P00D92_A316ContVal[0] ;
         if ( A30AlbProCod > A316ContVal )
         {
            AV16FlagCont = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15FlagAlb = (byte)(0) ;
      if ( AV16FlagCont == 0 )
      {
         /* Using cursor P00D93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            AV15FlagAlb = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putil10.this.A396EmprCod;
      this.aP1[0] = putil10.this.A313ContCod;
      this.aP2[0] = putil10.this.A30AlbProCod;
      this.aP3[0] = putil10.this.AV15FlagAlb;
      this.aP4[0] = putil10.this.AV16FlagCont;
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
      P00D92_A396EmprCod = new String[] {""} ;
      P00D92_A313ContCod = new String[] {""} ;
      P00D92_A316ContVal = new int[1] ;
      P00D93_A396EmprCod = new String[] {""} ;
      P00D93_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putil10__default(),
         new Object[] {
             new Object[] {
            P00D92_A396EmprCod, P00D92_A313ContCod, P00D92_A316ContVal
            }
            , new Object[] {
            P00D93_A396EmprCod, P00D93_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagAlb ;
   private byte AV16FlagCont ;
   private byte AV17Suprema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int A316ContVal ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00D92_A396EmprCod ;
   private String[] P00D92_A313ContCod ;
   private int[] P00D92_A316ContVal ;
   private String[] P00D93_A396EmprCod ;
   private long[] P00D93_A30AlbProCod ;
}

final  class putil10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00D92", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00D93", "SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

