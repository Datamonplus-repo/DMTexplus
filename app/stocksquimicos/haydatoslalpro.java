package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class haydatoslalpro extends GXProcedure
{
   public haydatoslalpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( haydatoslalpro.class ), "" );
   }

   public haydatoslalpro( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      haydatoslalpro.this.aP2 = new short[] {0};
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
      haydatoslalpro.this.A396EmprCod = aP0;
      haydatoslalpro.this.A13418AlbProID = aP1;
      haydatoslalpro.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10DatosLALPRO = (short)(0) ;
      /* Using cursor P0ALK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13442AlbProLine = P0ALK2_A13442AlbProLine[0] ;
         AV10DatosLALPRO = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = haydatoslalpro.this.AV10DatosLALPRO;
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
      P0ALK2_A396EmprCod = new String[] {""} ;
      P0ALK2_A13418AlbProID = new int[1] ;
      P0ALK2_A13442AlbProLine = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.haydatoslalpro__default(),
         new Object[] {
             new Object[] {
            P0ALK2_A396EmprCod, P0ALK2_A13418AlbProID, P0ALK2_A13442AlbProLine
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10DatosLALPRO ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALK2_A396EmprCod ;
   private int[] P0ALK2_A13418AlbProID ;
   private short[] P0ALK2_A13442AlbProLine ;
}

final  class haydatoslalpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALK2", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

