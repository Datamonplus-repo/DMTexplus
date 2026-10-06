package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puliobs extends GXProcedure
{
   public puliobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puliobs.class ), "" );
   }

   public puliobs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      puliobs.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      puliobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puliobs.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      puliobs.this.AV16LinObs = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01LC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A378DisObsULin = P01LC2_A378DisObsULin[0] ;
         if ( A378DisObsULin <= 8 )
         {
            AV16LinObs = (byte)(A378DisObsULin+1) ;
            A378DisObsULin = (byte)(A378DisObsULin+1) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha superado el numero de linea de observacion", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P01LC3 */
            pr_default.execute(1, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            if (true) break;
         }
         /* Using cursor P01LC4 */
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
      this.aP0[0] = puliobs.this.A396EmprCod;
      this.aP1[0] = puliobs.this.A361DisCod;
      this.aP2[0] = puliobs.this.AV16LinObs;
      Application.commitDataStores(context, remoteHandle, pr_default, "puliobs");
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
      P01LC2_A396EmprCod = new String[] {""} ;
      P01LC2_A361DisCod = new int[1] ;
      P01LC2_A378DisObsULin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puliobs__default(),
         new Object[] {
             new Object[] {
            P01LC2_A396EmprCod, P01LC2_A361DisCod, P01LC2_A378DisObsULin
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

   private byte AV16LinObs ;
   private byte A378DisObsULin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LC2_A396EmprCod ;
   private int[] P01LC2_A361DisCod ;
   private byte[] P01LC2_A378DisObsULin ;
}

final  class puliobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LC2", "SELECT EmprCod, DisCod, DisObsULin FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01LC3", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P01LC4", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

