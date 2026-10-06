package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class datosreferencia extends GXProcedure
{
   public datosreferencia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( datosreferencia.class ), "" );
   }

   public datosreferencia( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 )
   {
      datosreferencia.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      datosreferencia.this.A396EmprCod = aP0;
      datosreferencia.this.A252CliCod = aP1;
      datosreferencia.this.A65ArtCod = aP2;
      datosreferencia.this.aP3 = aP3;
      datosreferencia.this.aP4 = aP4;
      datosreferencia.this.aP5 = aP5;
      datosreferencia.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Artdsc = "" ;
      AV9TipArtCod = (short)(0) ;
      AV11ExisteArticulo = (short)(0) ;
      AV12TipArtDsc = "" ;
      /* Using cursor P09J32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69ArtDsc = P09J32_A69ArtDsc[0] ;
         n69ArtDsc = P09J32_n69ArtDsc[0] ;
         A829TipArtCod = P09J32_A829TipArtCod[0] ;
         A830TipArtDsc = P09J32_A830TipArtDsc[0] ;
         n830TipArtDsc = P09J32_n830TipArtDsc[0] ;
         A830TipArtDsc = P09J32_A830TipArtDsc[0] ;
         n830TipArtDsc = P09J32_n830TipArtDsc[0] ;
         AV8Artdsc = A69ArtDsc ;
         AV9TipArtCod = A829TipArtCod ;
         AV12TipArtDsc = A830TipArtDsc ;
         AV11ExisteArticulo = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = datosreferencia.this.AV8Artdsc;
      this.aP4[0] = datosreferencia.this.AV9TipArtCod;
      this.aP5[0] = datosreferencia.this.AV12TipArtDsc;
      this.aP6[0] = datosreferencia.this.AV11ExisteArticulo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Artdsc = "" ;
      AV12TipArtDsc = "" ;
      scmdbuf = "" ;
      P09J32_A396EmprCod = new String[] {""} ;
      P09J32_A252CliCod = new int[1] ;
      P09J32_A65ArtCod = new String[] {""} ;
      P09J32_A69ArtDsc = new String[] {""} ;
      P09J32_n69ArtDsc = new boolean[] {false} ;
      P09J32_A829TipArtCod = new short[1] ;
      P09J32_A830TipArtDsc = new String[] {""} ;
      P09J32_n830TipArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.datosreferencia__default(),
         new Object[] {
             new Object[] {
            P09J32_A396EmprCod, P09J32_A252CliCod, P09J32_A65ArtCod, P09J32_A69ArtDsc, P09J32_n69ArtDsc, P09J32_A829TipArtCod, P09J32_A830TipArtDsc, P09J32_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9TipArtCod ;
   private short AV11ExisteArticulo ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8Artdsc ;
   private String AV12TipArtDsc ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private short[] aP6 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09J32_A396EmprCod ;
   private int[] P09J32_A252CliCod ;
   private String[] P09J32_A65ArtCod ;
   private String[] P09J32_A69ArtDsc ;
   private boolean[] P09J32_n69ArtDsc ;
   private short[] P09J32_A829TipArtCod ;
   private String[] P09J32_A830TipArtDsc ;
   private boolean[] P09J32_n830TipArtDsc ;
}

final  class datosreferencia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09J32", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtDsc, T1.TipArtCod, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

