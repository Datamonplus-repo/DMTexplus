package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc109 extends GXProcedure
{
   public pprc109( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc109.class ), "" );
   }

   public pprc109( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pprc109.this.aP1 = new int[] {0};
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
      pprc109.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc109.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05IS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A378DisObsULin = P05IS2_A378DisObsULin[0] ;
         AV8DisObsLin = (byte)(0) ;
         /* Using cursor P05IS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A376DisObsLin = P05IS3_A376DisObsLin[0] ;
            AV8DisObsLin = A376DisObsLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A378DisObsULin = AV8DisObsLin ;
         /* Using cursor P05IS4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc109.this.A396EmprCod;
      this.aP1[0] = pprc109.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc109");
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
      P05IS2_A396EmprCod = new String[] {""} ;
      P05IS2_A361DisCod = new int[1] ;
      P05IS2_A378DisObsULin = new byte[1] ;
      P05IS3_A396EmprCod = new String[] {""} ;
      P05IS3_A361DisCod = new int[1] ;
      P05IS3_A376DisObsLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc109__default(),
         new Object[] {
             new Object[] {
            P05IS2_A396EmprCod, P05IS2_A361DisCod, P05IS2_A378DisObsULin
            }
            , new Object[] {
            P05IS3_A396EmprCod, P05IS3_A361DisCod, P05IS3_A376DisObsLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A378DisObsULin ;
   private byte AV8DisObsLin ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05IS2_A396EmprCod ;
   private int[] P05IS2_A361DisCod ;
   private byte[] P05IS2_A378DisObsULin ;
   private String[] P05IS3_A396EmprCod ;
   private int[] P05IS3_A361DisCod ;
   private byte[] P05IS3_A376DisObsLin ;
}

final  class pprc109__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05IS2", "SELECT EmprCod, DisCod, DisObsULin FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05IS3", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05IS4", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

