package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prebaut extends GXProcedure
{
   public prebaut( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prebaut.class ), "" );
   }

   public prebaut( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      prebaut.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      prebaut.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prebaut.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      prebaut.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      prebaut.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      prebaut.this.AV8OK = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8OK = httpContext.getMessage( "S", "") ;
      /* Using cursor P01S52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5527RecLinRea = P01S52_A5527RecLinRea[0] ;
         A811RecLin = P01S52_A811RecLin[0] ;
         A1273RecLinPro = P01S52_A1273RecLinPro[0] ;
         A2804RecLinMaq = P01S52_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A5527RecLinRea, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8OK = httpContext.getMessage( "N", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prebaut.this.A396EmprCod;
      this.aP1[0] = prebaut.this.A129BarCod;
      this.aP2[0] = prebaut.this.A132BarCodReo;
      this.aP3[0] = prebaut.this.A130BarCodPar;
      this.aP4[0] = prebaut.this.AV8OK;
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
      P01S52_A396EmprCod = new String[] {""} ;
      P01S52_A129BarCod = new int[1] ;
      P01S52_A132BarCodReo = new byte[1] ;
      P01S52_A130BarCodPar = new String[] {""} ;
      P01S52_A5527RecLinRea = new String[] {""} ;
      P01S52_A811RecLin = new short[1] ;
      P01S52_A1273RecLinPro = new byte[1] ;
      P01S52_A2804RecLinMaq = new short[1] ;
      A5527RecLinRea = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prebaut__default(),
         new Object[] {
             new Object[] {
            P01S52_A396EmprCod, P01S52_A129BarCod, P01S52_A132BarCodReo, P01S52_A130BarCodPar, P01S52_A5527RecLinRea, P01S52_A811RecLin, P01S52_A1273RecLinPro, P01S52_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8OK ;
   private String scmdbuf ;
   private String A5527RecLinRea ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01S52_A396EmprCod ;
   private int[] P01S52_A129BarCod ;
   private byte[] P01S52_A132BarCodReo ;
   private String[] P01S52_A130BarCodPar ;
   private String[] P01S52_A5527RecLinRea ;
   private short[] P01S52_A811RecLin ;
   private byte[] P01S52_A1273RecLinPro ;
   private short[] P01S52_A2804RecLinMaq ;
}

final  class prebaut__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01S52", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinRea, RecLin, RecLinPro, RecLinMaq FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               return;
      }
   }

}

