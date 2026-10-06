package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getcolorproductos extends GXProcedure
{
   public getcolorproductos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getcolorproductos.class ), "" );
   }

   public getcolorproductos( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      getcolorproductos.this.aP2 = new short[] {0};
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
      getcolorproductos.this.AV8EmprCod = aP0;
      getcolorproductos.this.AV16Fornumcol = aP1;
      getcolorproductos.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AEM2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV16Fornumcol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AEM2_A396EmprCod[0] ;
         A486ForNumCol = P0AEM2_A486ForNumCol[0] ;
         A715PrdLin = P0AEM2_A715PrdLin[0] ;
         AV17AuxColLin = A715PrdLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV17AuxColLin = (short)(AV17AuxColLin+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = getcolorproductos.this.AV17AuxColLin;
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
      P0AEM2_A396EmprCod = new String[] {""} ;
      P0AEM2_A486ForNumCol = new int[1] ;
      P0AEM2_A715PrdLin = new short[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.getcolorproductos__default(),
         new Object[] {
             new Object[] {
            P0AEM2_A396EmprCod, P0AEM2_A486ForNumCol, P0AEM2_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17AuxColLin ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int AV16Fornumcol ;
   private int A486ForNumCol ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEM2_A396EmprCod ;
   private int[] P0AEM2_A486ForNumCol ;
   private short[] P0AEM2_A715PrdLin ;
}

final  class getcolorproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEM2", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

