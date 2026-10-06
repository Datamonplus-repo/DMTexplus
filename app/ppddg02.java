package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg02 extends GXProcedure
{
   public ppddg02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg02.class ), "" );
   }

   public ppddg02( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 )
   {
      ppddg02.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      ppddg02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg02.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg02.this.AV11Piezas = aP2[0];
      this.aP2 = aP2;
      ppddg02.this.AV8DisPieNor = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05P02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13048PedDGPieza = P05P02_A13048PedDGPieza[0] ;
         n13048PedDGPieza = P05P02_n13048PedDGPieza[0] ;
         A44AlbRecCod = P05P02_A44AlbRecCod[0] ;
         AV8DisPieNor = (short)(AV8DisPieNor+(A13048PedDGPieza+AV11Piezas)) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg02.this.A396EmprCod;
      this.aP1[0] = ppddg02.this.A13026PedDGId;
      this.aP2[0] = ppddg02.this.AV11Piezas;
      this.aP3[0] = ppddg02.this.AV8DisPieNor;
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
      P05P02_A396EmprCod = new String[] {""} ;
      P05P02_A13026PedDGId = new int[1] ;
      P05P02_A13048PedDGPieza = new short[1] ;
      P05P02_n13048PedDGPieza = new boolean[] {false} ;
      P05P02_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg02__default(),
         new Object[] {
             new Object[] {
            P05P02_A396EmprCod, P05P02_A13026PedDGId, P05P02_A13048PedDGPieza, P05P02_n13048PedDGPieza, P05P02_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8DisPieNor ;
   private short A13048PedDGPieza ;
   private short Gx_err ;
   private int A13026PedDGId ;
   private int AV11Piezas ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n13048PedDGPieza ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P02_A396EmprCod ;
   private int[] P05P02_A13026PedDGId ;
   private short[] P05P02_A13048PedDGPieza ;
   private boolean[] P05P02_n13048PedDGPieza ;
   private int[] P05P02_A44AlbRecCod ;
}

final  class ppddg02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P02", "SELECT EmprCod, PedDGId, PedDGPieza, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? and PedDGId = ? ORDER BY EmprCod, PedDGId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(4);
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

