package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcondos extends GXProcedure
{
   public pcondos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcondos.class ), "" );
   }

   public pcondos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 )
   {
      pcondos.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             byte[] aP5 )
   {
      pcondos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcondos.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcondos.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcondos.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcondos.this.AV8RecEnvio = aP4[0];
      this.aP4 = aP4;
      pcondos.this.AV9RecRecep = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01P72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4700RecEnvio = P01P72_A4700RecEnvio[0] ;
         A4701RecRecep = P01P72_A4701RecRecep[0] ;
         A2804RecLinMaq = P01P72_A2804RecLinMaq[0] ;
         AV8RecEnvio = A4700RecEnvio ;
         AV9RecRecep = A4701RecRecep ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcondos.this.A396EmprCod;
      this.aP1[0] = pcondos.this.A129BarCod;
      this.aP2[0] = pcondos.this.A132BarCodReo;
      this.aP3[0] = pcondos.this.A130BarCodPar;
      this.aP4[0] = pcondos.this.AV8RecEnvio;
      this.aP5[0] = pcondos.this.AV9RecRecep;
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
      P01P72_A396EmprCod = new String[] {""} ;
      P01P72_A129BarCod = new int[1] ;
      P01P72_A132BarCodReo = new byte[1] ;
      P01P72_A130BarCodPar = new String[] {""} ;
      P01P72_A4700RecEnvio = new byte[1] ;
      P01P72_A4701RecRecep = new byte[1] ;
      P01P72_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcondos__default(),
         new Object[] {
             new Object[] {
            P01P72_A396EmprCod, P01P72_A129BarCod, P01P72_A132BarCodReo, P01P72_A130BarCodPar, P01P72_A4700RecEnvio, P01P72_A4701RecRecep, P01P72_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8RecEnvio ;
   private byte AV9RecRecep ;
   private byte A4700RecEnvio ;
   private byte A4701RecRecep ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01P72_A396EmprCod ;
   private int[] P01P72_A129BarCod ;
   private byte[] P01P72_A132BarCodReo ;
   private String[] P01P72_A130BarCodPar ;
   private byte[] P01P72_A4700RecEnvio ;
   private byte[] P01P72_A4701RecRecep ;
   private short[] P01P72_A2804RecLinMaq ;
}

final  class pcondos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01P72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecEnvio, RecRecep, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               return;
      }
   }

}

