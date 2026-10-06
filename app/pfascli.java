package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfascli extends GXProcedure
{
   public pfascli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfascli.class ), "" );
   }

   public pfascli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      pfascli.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pfascli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfascli.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfascli.this.AV10FasForLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02612 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6015FasExpUtl = P02612_A6015FasExpUtl[0] ;
         n6015FasExpUtl = P02612_n6015FasExpUtl[0] ;
         if ( A6015FasExpUtl <= 9999 )
         {
            A6015FasExpUtl = (short)(A6015FasExpUtl+5) ;
            n6015FasExpUtl = false ;
            AV10FasForLin = A6015FasExpUtl ;
         }
         else
         {
            AV10FasForLin = (short)(9999) ;
         }
         /* Using cursor P02613 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6015FasExpUtl), Short.valueOf(A6015FasExpUtl), A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfascli.this.A396EmprCod;
      this.aP1[0] = pfascli.this.A252CliCod;
      this.aP2[0] = pfascli.this.AV10FasForLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfascli");
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
      P02612_A396EmprCod = new String[] {""} ;
      P02612_A252CliCod = new int[1] ;
      P02612_A6015FasExpUtl = new short[1] ;
      P02612_n6015FasExpUtl = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfascli__default(),
         new Object[] {
             new Object[] {
            P02612_A396EmprCod, P02612_A252CliCod, P02612_A6015FasExpUtl, P02612_n6015FasExpUtl
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10FasForLin ;
   private short A6015FasExpUtl ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n6015FasExpUtl ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02612_A396EmprCod ;
   private int[] P02612_A252CliCod ;
   private short[] P02612_A6015FasExpUtl ;
   private boolean[] P02612_n6015FasExpUtl ;
}

final  class pfascli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02612", "SELECT EmprCod, CliCod, FasExpUtl FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02613", "UPDATE TXPCLIENT SET FasExpUtl=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

