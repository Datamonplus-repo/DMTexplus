package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class isexistelistadoincidenciasreceta extends GXProcedure
{
   public isexistelistadoincidenciasreceta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( isexistelistadoincidenciasreceta.class ), "" );
   }

   public isexistelistadoincidenciasreceta( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              int aP1 ,
                              byte aP2 ,
                              String aP3 ,
                              short aP4 )
   {
      isexistelistadoincidenciasreceta.this.aP5 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        boolean[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             boolean[] aP5 )
   {
      isexistelistadoincidenciasreceta.this.AV46EmprCod = aP0;
      isexistelistadoincidenciasreceta.this.AV9BarCod = aP1;
      isexistelistadoincidenciasreceta.this.AV11BarCodReo = aP2;
      isexistelistadoincidenciasreceta.this.AV10BarCodPar = aP3;
      isexistelistadoincidenciasreceta.this.AV37RecLinMaq = aP4;
      isexistelistadoincidenciasreceta.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47isExiste = false ;
      /* Using cursor P0ARS2 */
      pr_default.execute(0, new Object[] {AV46EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, Short.valueOf(AV37RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4024RecMar = P0ARS2_A4024RecMar[0] ;
         A2804RecLinMaq = P0ARS2_A2804RecLinMaq[0] ;
         A130BarCodPar = P0ARS2_A130BarCodPar[0] ;
         A132BarCodReo = P0ARS2_A132BarCodReo[0] ;
         A129BarCod = P0ARS2_A129BarCod[0] ;
         A396EmprCod = P0ARS2_A396EmprCod[0] ;
         A1273RecLinPro = P0ARS2_A1273RecLinPro[0] ;
         A811RecLin = P0ARS2_A811RecLin[0] ;
         AV47isExiste = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = isexistelistadoincidenciasreceta.this.AV47isExiste;
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
      P0ARS2_A4024RecMar = new byte[1] ;
      P0ARS2_A2804RecLinMaq = new short[1] ;
      P0ARS2_A130BarCodPar = new String[] {""} ;
      P0ARS2_A132BarCodReo = new byte[1] ;
      P0ARS2_A129BarCod = new int[1] ;
      P0ARS2_A396EmprCod = new String[] {""} ;
      P0ARS2_A1273RecLinPro = new byte[1] ;
      P0ARS2_A811RecLin = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.isexistelistadoincidenciasreceta__default(),
         new Object[] {
             new Object[] {
            P0ARS2_A4024RecMar, P0ARS2_A2804RecLinMaq, P0ARS2_A130BarCodPar, P0ARS2_A132BarCodReo, P0ARS2_A129BarCod, P0ARS2_A396EmprCod, P0ARS2_A1273RecLinPro, P0ARS2_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private byte A4024RecMar ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short AV37RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private String AV46EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private boolean AV47isExiste ;
   private boolean[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0ARS2_A4024RecMar ;
   private short[] P0ARS2_A2804RecLinMaq ;
   private String[] P0ARS2_A130BarCodPar ;
   private byte[] P0ARS2_A132BarCodReo ;
   private int[] P0ARS2_A129BarCod ;
   private String[] P0ARS2_A396EmprCod ;
   private byte[] P0ARS2_A1273RecLinPro ;
   private short[] P0ARS2_A811RecLin ;
}

final  class isexistelistadoincidenciasreceta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARS2", "SELECT * FROM (SELECT RecMar, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinPro, RecLin FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (RecMar = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

