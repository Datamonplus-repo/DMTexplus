package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getexisteprdultlin extends GXProcedure
{
   public getexisteprdultlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getexisteprdultlin.class ), "" );
   }

   public getexisteprdultlin( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            short aP2 )
   {
      getexisteprdultlin.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             short[] aP3 )
   {
      getexisteprdultlin.this.A396EmprCod = aP0;
      getexisteprdultlin.this.A486ForNumCol = aP1;
      getexisteprdultlin.this.A715PrdLin = aP2;
      getexisteprdultlin.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existeregistro = (short)(0) ;
      /* Using cursor P0AEN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV8Existeregistro = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = getexisteprdultlin.this.AV8Existeregistro;
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
      P0AEN2_A396EmprCod = new String[] {""} ;
      P0AEN2_A486ForNumCol = new int[1] ;
      P0AEN2_A715PrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.getexisteprdultlin__default(),
         new Object[] {
             new Object[] {
            P0AEN2_A396EmprCod, P0AEN2_A486ForNumCol, P0AEN2_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A715PrdLin ;
   private short AV8Existeregistro ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEN2_A396EmprCod ;
   private int[] P0AEN2_A486ForNumCol ;
   private short[] P0AEN2_A715PrdLin ;
}

final  class getexisteprdultlin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEN2", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? and PrdLin = ? ORDER BY EmprCod, ForNumCol, PrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

