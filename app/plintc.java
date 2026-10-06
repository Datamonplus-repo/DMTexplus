package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plintc extends GXProcedure
{
   public plintc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plintc.class ), "" );
   }

   public plintc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            byte[] aP1 )
   {
      plintc.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             short[] aP2 )
   {
      plintc.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      plintc.this.AV18TipColCod = aP1[0];
      this.aP1 = aP1;
      plintc.this.AV17ProNumLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01OQ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Byte.valueOf(AV18TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P01OQ2_A831TipColCod[0] ;
         A396EmprCod = P01OQ2_A396EmprCod[0] ;
         A5163TipColUl = P01OQ2_A5163TipColUl[0] ;
         n5163TipColUl = P01OQ2_n5163TipColUl[0] ;
         if ( ( A5163TipColUl + 10 ) <= 9900 )
         {
            A5163TipColUl = (short)(A5163TipColUl+10) ;
            n5163TipColUl = false ;
            AV17ProNumLin = A5163TipColUl ;
         }
         else
         {
            AV17ProNumLin = (short)(9999) ;
         }
         /* Using cursor P01OQ3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5163TipColUl), Short.valueOf(A5163TipColUl), A396EmprCod, Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plintc.this.AV15EmprCod;
      this.aP1[0] = plintc.this.AV18TipColCod;
      this.aP2[0] = plintc.this.AV17ProNumLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "plintc");
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
      P01OQ2_A831TipColCod = new byte[1] ;
      P01OQ2_A396EmprCod = new String[] {""} ;
      P01OQ2_A5163TipColUl = new short[1] ;
      P01OQ2_n5163TipColUl = new boolean[] {false} ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plintc__default(),
         new Object[] {
             new Object[] {
            P01OQ2_A831TipColCod, P01OQ2_A396EmprCod, P01OQ2_A5163TipColUl, P01OQ2_n5163TipColUl
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TipColCod ;
   private byte A831TipColCod ;
   private short AV17ProNumLin ;
   private short A5163TipColUl ;
   private short Gx_err ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private boolean n5163TipColUl ;
   private short[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private byte[] P01OQ2_A831TipColCod ;
   private String[] P01OQ2_A396EmprCod ;
   private short[] P01OQ2_A5163TipColUl ;
   private boolean[] P01OQ2_n5163TipColUl ;
}

final  class plintc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OQ2", "SELECT TipColCod, EmprCod, TipColUl FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01OQ3", "UPDATE TXPTIPCOL SET TipColUl=?  WHERE EmprCod = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTIPCOL")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

