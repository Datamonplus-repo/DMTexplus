package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelilpe extends GXProcedure
{
   public pelilpe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelilpe.class ), "" );
   }

   public pelilpe( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pelilpe.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pelilpe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelilpe.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      pelilpe.this.AV15PrdNum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P004P2_A795PrvNum[0] ;
         AV17PrvNum = A795PrvNum ;
         /* Using cursor P004P3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), AV15PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P004P3_A719PrdNum[0] ;
            A669PedUni = P004P3_A669PedUni[0] ;
            A6289PedNumRq = P004P3_A6289PedNumRq[0] ;
            A659PedCum = P004P3_A659PedCum[0] ;
            AV19PRECONUM = A6289PedNumRq ;
            AV18PedCum = A659PedCum ;
            /* Execute user subroutine: 'PRESOL1' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'BORPRE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P004P4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = AV15PrdNum ;
            new app.pclosped(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
            pelilpe.this.A396EmprCod = GXv_char1[0] ;
            pelilpe.this.AV15PrdNum = GXv_char2[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BORPRE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18PedCum, httpContext.getMessage( "N", "")) == 0 )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV17PrvNum ;
         GXv_char1[0] = AV15PrdNum ;
         new app.pelipre(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1) ;
         pelilpe.this.A396EmprCod = GXv_char2[0] ;
         pelilpe.this.AV17PrvNum = GXv_int3[0] ;
         pelilpe.this.AV15PrdNum = GXv_char1[0] ;
      }
   }

   public void S121( )
   {
      /* 'PRESOL1' Routine */
      returnInSub = false ;
      n6299PrePedCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P004P5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV19PRECONUM), AV15PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRESO1");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelilpe.this.A396EmprCod;
      this.aP1[0] = pelilpe.this.A658PedCod;
      this.aP2[0] = pelilpe.this.AV15PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelilpe");
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
      P004P2_A396EmprCod = new String[] {""} ;
      P004P2_A658PedCod = new int[1] ;
      P004P2_A795PrvNum = new int[1] ;
      P004P3_A396EmprCod = new String[] {""} ;
      P004P3_A658PedCod = new int[1] ;
      P004P3_A719PrdNum = new String[] {""} ;
      P004P3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004P3_A6289PedNumRq = new int[1] ;
      P004P3_A659PedCum = new String[] {""} ;
      A719PrdNum = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      AV18PedCum = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char1 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelilpe__default(),
         new Object[] {
             new Object[] {
            P004P2_A396EmprCod, P004P2_A658PedCod, P004P2_A795PrvNum
            }
            , new Object[] {
            P004P3_A396EmprCod, P004P3_A658PedCod, P004P3_A719PrdNum, P004P3_A669PedUni, P004P3_A6289PedNumRq, P004P3_A659PedCum
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

   private short Gx_err ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV17PrvNum ;
   private int A6289PedNumRq ;
   private int AV19PRECONUM ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A669PedUni ;
   private String A396EmprCod ;
   private String AV15PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A659PedCum ;
   private String AV18PedCum ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean returnInSub ;
   private boolean n6299PrePedCod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P004P2_A396EmprCod ;
   private int[] P004P2_A658PedCod ;
   private int[] P004P2_A795PrvNum ;
   private String[] P004P3_A396EmprCod ;
   private int[] P004P3_A658PedCod ;
   private String[] P004P3_A719PrdNum ;
   private java.math.BigDecimal[] P004P3_A669PedUni ;
   private int[] P004P3_A6289PedNumRq ;
   private String[] P004P3_A659PedCum ;
}

final  class pelilpe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004P2", "SELECT EmprCod, PedCod, PrvNum FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004P3", "SELECT EmprCod, PedCod, PrdNum, PedUni, PedNumRq, PedCum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? and PrdNum = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004P4", "DELETE FROM TXPLPEDID  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
         ,new UpdateCursor("P004P5", "UPDATE TXPPRESO1 SET PrePedCod=0  WHERE EmprCod = ? and PreCoNum = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRESO1")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

