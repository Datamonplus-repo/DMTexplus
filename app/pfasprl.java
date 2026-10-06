package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasprl extends GXProcedure
{
   public pfasprl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasprl.class ), "" );
   }

   public pfasprl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      pfasprl.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      pfasprl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasprl.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pfasprl.this.AV10FasForLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02632 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4649FasUltForL = P02632_A4649FasUltForL[0] ;
         n4649FasUltForL = P02632_n4649FasUltForL[0] ;
         if ( A4649FasUltForL <= 9999 )
         {
            A4649FasUltForL = (short)(A4649FasUltForL+10) ;
            n4649FasUltForL = false ;
            AV10FasForLin = A4649FasUltForL ;
         }
         else
         {
            AV10FasForLin = (short)(999) ;
         }
         /* Using cursor P02633 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4649FasUltForL), Short.valueOf(A4649FasUltForL), A396EmprCod, A457FasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasprl.this.A396EmprCod;
      this.aP1[0] = pfasprl.this.A457FasCod;
      this.aP2[0] = pfasprl.this.AV10FasForLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfasprl");
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
      P02632_A396EmprCod = new String[] {""} ;
      P02632_A457FasCod = new String[] {""} ;
      P02632_A4649FasUltForL = new short[1] ;
      P02632_n4649FasUltForL = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasprl__default(),
         new Object[] {
             new Object[] {
            P02632_A396EmprCod, P02632_A457FasCod, P02632_A4649FasUltForL, P02632_n4649FasUltForL
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10FasForLin ;
   private short A4649FasUltForL ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private boolean n4649FasUltForL ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02632_A396EmprCod ;
   private String[] P02632_A457FasCod ;
   private short[] P02632_A4649FasUltForL ;
   private boolean[] P02632_n4649FasUltForL ;
}

final  class pfasprl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02632", "SELECT EmprCod, FasCod, FasUltForL FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02633", "UPDATE TXPFASPRO SET FasUltForL=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPRO")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 8);
               return;
      }
   }

}

