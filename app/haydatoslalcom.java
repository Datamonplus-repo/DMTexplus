package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class haydatoslalcom extends GXProcedure
{
   public haydatoslalcom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( haydatoslalcom.class ), "" );
   }

   public haydatoslalcom( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      haydatoslalcom.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 )
   {
      haydatoslalcom.this.A396EmprCod = aP0;
      haydatoslalcom.this.A14AlbComCod = aP1;
      haydatoslalcom.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9DatosLalcom = (short)(0) ;
      /* Using cursor P0A012 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A20AlbComLin = P0A012_A20AlbComLin[0] ;
         AV9DatosLalcom = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = haydatoslalcom.this.AV9DatosLalcom;
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
      P0A012_A396EmprCod = new String[] {""} ;
      P0A012_A14AlbComCod = new int[1] ;
      P0A012_A20AlbComLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.haydatoslalcom__default(),
         new Object[] {
             new Object[] {
            P0A012_A396EmprCod, P0A012_A14AlbComCod, P0A012_A20AlbComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9DatosLalcom ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A012_A396EmprCod ;
   private int[] P0A012_A14AlbComCod ;
   private short[] P0A012_A20AlbComLin ;
}

final  class haydatoslalcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A012", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

