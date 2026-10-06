package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg09 extends GXProcedure
{
   public ppddg09( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg09.class ), "" );
   }

   public ppddg09( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 )
   {
      ppddg09.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      ppddg09.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg09.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg09.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      ppddg09.this.A13045PedDGFasLi = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35DisQui = (byte)(0) ;
      /* Using cursor P05P72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13056PedDGPQUlt = P05P72_A13056PedDGPQUlt[0] ;
         n13056PedDGPQUlt = P05P72_n13056PedDGPQUlt[0] ;
         /* Using cursor P05P73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13057PedDGPQLin = P05P73_A13057PedDGPQLin[0] ;
            AV35DisQui = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV35DisQui == 0 )
         {
            A13056PedDGPQUlt = (short)(0) ;
            n13056PedDGPQUlt = false ;
         }
         /* Using cursor P05P74 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n13056PedDGPQUlt), Short.valueOf(A13056PedDGPQUlt), A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg09.this.A396EmprCod;
      this.aP1[0] = ppddg09.this.A13026PedDGId;
      this.aP2[0] = ppddg09.this.A758ProCod;
      this.aP3[0] = ppddg09.this.A13045PedDGFasLi;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppddg09");
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
      P05P72_A396EmprCod = new String[] {""} ;
      P05P72_A13026PedDGId = new int[1] ;
      P05P72_A758ProCod = new String[] {""} ;
      P05P72_A13045PedDGFasLi = new short[1] ;
      P05P72_A13056PedDGPQUlt = new short[1] ;
      P05P72_n13056PedDGPQUlt = new boolean[] {false} ;
      P05P73_A396EmprCod = new String[] {""} ;
      P05P73_A13026PedDGId = new int[1] ;
      P05P73_A758ProCod = new String[] {""} ;
      P05P73_A13045PedDGFasLi = new short[1] ;
      P05P73_A13057PedDGPQLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg09__default(),
         new Object[] {
             new Object[] {
            P05P72_A396EmprCod, P05P72_A13026PedDGId, P05P72_A758ProCod, P05P72_A13045PedDGFasLi, P05P72_A13056PedDGPQUlt, P05P72_n13056PedDGPQUlt
            }
            , new Object[] {
            P05P73_A396EmprCod, P05P73_A13026PedDGId, P05P73_A758ProCod, P05P73_A13045PedDGFasLi, P05P73_A13057PedDGPQLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35DisQui ;
   private short A13045PedDGFasLi ;
   private short A13056PedDGPQUlt ;
   private short A13057PedDGPQLin ;
   private short Gx_err ;
   private int A13026PedDGId ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private boolean n13056PedDGPQUlt ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P72_A396EmprCod ;
   private int[] P05P72_A13026PedDGId ;
   private String[] P05P72_A758ProCod ;
   private short[] P05P72_A13045PedDGFasLi ;
   private short[] P05P72_A13056PedDGPQUlt ;
   private boolean[] P05P72_n13056PedDGPQUlt ;
   private String[] P05P73_A396EmprCod ;
   private int[] P05P73_A13026PedDGId ;
   private String[] P05P73_A758ProCod ;
   private short[] P05P73_A13045PedDGFasLi ;
   private short[] P05P73_A13057PedDGPQLin ;
}

final  class ppddg09__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P72", "SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQUlt FROM TXPPEDDG5 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05P73", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ? ORDER BY EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05P74", "UPDATE TXPPEDDG5 SET PedDGPQUlt=?  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG5")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

