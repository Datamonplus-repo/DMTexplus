package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedcum2 extends GXProcedure
{
   public ppedcum2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedcum2.class ), "" );
   }

   public ppedcum2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppedcum2.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      ppedcum2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedcum2.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      ppedcum2.this.AV16PrdNum = aP2[0];
      this.aP2 = aP2;
      ppedcum2.this.AV17Mode2 = aP3[0];
      this.aP3 = aP3;
      ppedcum2.this.AV18PedCum = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( (0==A658PedCod) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         if ( GXutil.strcmp(AV17Mode2, "DEL") != 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A658PedCod ;
            GXv_char3[0] = AV16PrdNum ;
            GXv_char4[0] = AV18PedCum ;
            new app.pcumped(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4) ;
            ppedcum2.this.A396EmprCod = GXv_char1[0] ;
            ppedcum2.this.A658PedCod = GXv_int2[0] ;
            ppedcum2.this.AV16PrdNum = GXv_char3[0] ;
            ppedcum2.this.AV18PedCum = GXv_char4[0] ;
         }
         else
         {
            AV18PedCum = "N" ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int2[0] = A658PedCod ;
            GXv_char3[0] = AV16PrdNum ;
            GXv_char1[0] = "N" ;
            new app.pcumped(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_char3, GXv_char1) ;
            ppedcum2.this.A396EmprCod = GXv_char4[0] ;
            ppedcum2.this.A658PedCod = GXv_int2[0] ;
            ppedcum2.this.AV16PrdNum = GXv_char3[0] ;
         }
         new app.pcommit(remoteHandle, context).execute( ) ;
         AV15Flag = (byte)(0) ;
         /* Using cursor P010B2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A667PedSit = P010B2_A667PedSit[0] ;
            /* Using cursor P010B3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A659PedCum = P010B3_A659PedCum[0] ;
               A719PrdNum = P010B3_A719PrdNum[0] ;
               AV15Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            A667PedSit = ((0==AV15Flag) ? "S" : "N") ;
            /* Using cursor P010B4 */
            pr_default.execute(2, new Object[] {A667PedSit, A396EmprCod, Integer.valueOf(A658PedCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedcum2.this.A396EmprCod;
      this.aP1[0] = ppedcum2.this.A658PedCod;
      this.aP2[0] = ppedcum2.this.AV16PrdNum;
      this.aP3[0] = ppedcum2.this.AV17Mode2;
      this.aP4[0] = ppedcum2.this.AV18PedCum;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppedcum2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P010B2_A396EmprCod = new String[] {""} ;
      P010B2_A658PedCod = new int[1] ;
      P010B2_A667PedSit = new String[] {""} ;
      A667PedSit = "" ;
      P010B3_A396EmprCod = new String[] {""} ;
      P010B3_A658PedCod = new int[1] ;
      P010B3_A659PedCum = new String[] {""} ;
      P010B3_A719PrdNum = new String[] {""} ;
      A659PedCum = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedcum2__default(),
         new Object[] {
             new Object[] {
            P010B2_A396EmprCod, P010B2_A658PedCod, P010B2_A667PedSit
            }
            , new Object[] {
            P010B3_A396EmprCod, P010B3_A658PedCod, P010B3_A659PedCum, P010B3_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private int A658PedCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV16PrdNum ;
   private String AV17Mode2 ;
   private String AV18PedCum ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P010B2_A396EmprCod ;
   private int[] P010B2_A658PedCod ;
   private String[] P010B2_A667PedSit ;
   private String[] P010B3_A396EmprCod ;
   private int[] P010B3_A658PedCod ;
   private String[] P010B3_A659PedCum ;
   private String[] P010B3_A719PrdNum ;
}

final  class ppedcum2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P010B2", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P010B3", "SELECT * FROM (SELECT EmprCod, PedCod, PedCum, PrdNum FROM TXPLPEDID WHERE (EmprCod = ? and PedCod = ?) AND (PedCum = 'N') ORDER BY EmprCod, PedCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P010B4", "UPDATE TXPCPEDID SET PedSit=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

