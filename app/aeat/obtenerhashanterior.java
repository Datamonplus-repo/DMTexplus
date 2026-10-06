package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerhashanterior extends GXProcedure
{
   public obtenerhashanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerhashanterior.class ), "" );
   }

   public obtenerhashanterior( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      obtenerhashanterior.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      obtenerhashanterior.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AIP2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14379AEATEstado = P0AIP2_A14379AEATEstado[0] ;
         n14379AEATEstado = P0AIP2_n14379AEATEstado[0] ;
         A14385AEATAnteri = P0AIP2_A14385AEATAnteri[0] ;
         n14385AEATAnteri = P0AIP2_n14385AEATAnteri[0] ;
         A14378AEATId = P0AIP2_A14378AEATId[0] ;
         A14380AEATFRecep = P0AIP2_A14380AEATFRecep[0] ;
         n14380AEATFRecep = P0AIP2_n14380AEATFRecep[0] ;
         AV16AEATAnteriorHuella = GXutil.rtrim( A14385AEATAnteri) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtenerhashanterior.this.AV16AEATAnteriorHuella;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16AEATAnteriorHuella = "" ;
      scmdbuf = "" ;
      P0AIP2_A14379AEATEstado = new String[] {""} ;
      P0AIP2_n14379AEATEstado = new boolean[] {false} ;
      P0AIP2_A14385AEATAnteri = new String[] {""} ;
      P0AIP2_n14385AEATAnteri = new boolean[] {false} ;
      P0AIP2_A14378AEATId = new long[1] ;
      P0AIP2_A14380AEATFRecep = new java.util.Date[] {GXutil.nullDate()} ;
      P0AIP2_n14380AEATFRecep = new boolean[] {false} ;
      A14379AEATEstado = "" ;
      A14385AEATAnteri = "" ;
      A14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.obtenerhashanterior__default(),
         new Object[] {
             new Object[] {
            P0AIP2_A14379AEATEstado, P0AIP2_n14379AEATEstado, P0AIP2_A14385AEATAnteri, P0AIP2_n14385AEATAnteri, P0AIP2_A14378AEATId, P0AIP2_A14380AEATFRecep, P0AIP2_n14380AEATFRecep
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A14378AEATId ;
   private String scmdbuf ;
   private java.util.Date A14380AEATFRecep ;
   private boolean n14379AEATEstado ;
   private boolean n14385AEATAnteri ;
   private boolean n14380AEATFRecep ;
   private String AV16AEATAnteriorHuella ;
   private String A14379AEATEstado ;
   private String A14385AEATAnteri ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIP2_A14379AEATEstado ;
   private boolean[] P0AIP2_n14379AEATEstado ;
   private String[] P0AIP2_A14385AEATAnteri ;
   private boolean[] P0AIP2_n14385AEATAnteri ;
   private long[] P0AIP2_A14378AEATId ;
   private java.util.Date[] P0AIP2_A14380AEATFRecep ;
   private boolean[] P0AIP2_n14380AEATFRecep ;
}

final  class obtenerhashanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIP2", "SELECT AEATEstado, AEATAnteri, AEATId, AEATFRecep FROM TXPAEATHi WHERE AEATEstado = 'Correcto' ORDER BY AEATEstado, AEATFRecep DESC, AEATId DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

