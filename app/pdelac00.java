package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelac00 extends GXProcedure
{
   public pdelac00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelac00.class ), "" );
   }

   public pdelac00( int remoteHandle ,
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
      pdelac00.this.aP4 = new String[] {""};
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
      pdelac00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelac00.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdelac00.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdelac00.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdelac00.this.AV8MsgErr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MsgErr = " " ;
      /* Using cursor P04VT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P04VT2_A6039RecAcab[0] ;
         n6039RecAcab = P04VT2_n6039RecAcab[0] ;
         A2804RecLinMaq = P04VT2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8MsgErr = httpContext.getMessage( "Atencion.Existe Receta de ACABADO", "") + GXutil.newLine( ) ;
            AV8MsgErr += httpContext.getMessage( "NO se puede eliminar", "") + GXutil.newLine( ) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelac00.this.A396EmprCod;
      this.aP1[0] = pdelac00.this.A129BarCod;
      this.aP2[0] = pdelac00.this.A132BarCodReo;
      this.aP3[0] = pdelac00.this.A130BarCodPar;
      this.aP4[0] = pdelac00.this.AV8MsgErr;
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
      P04VT2_A396EmprCod = new String[] {""} ;
      P04VT2_A129BarCod = new int[1] ;
      P04VT2_A132BarCodReo = new byte[1] ;
      P04VT2_A130BarCodPar = new String[] {""} ;
      P04VT2_A6039RecAcab = new String[] {""} ;
      P04VT2_n6039RecAcab = new boolean[] {false} ;
      P04VT2_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelac00__default(),
         new Object[] {
             new Object[] {
            P04VT2_A396EmprCod, P04VT2_A129BarCod, P04VT2_A132BarCodReo, P04VT2_A130BarCodPar, P04VT2_A6039RecAcab, P04VT2_n6039RecAcab, P04VT2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8MsgErr ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private boolean n6039RecAcab ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VT2_A396EmprCod ;
   private int[] P04VT2_A129BarCod ;
   private byte[] P04VT2_A132BarCodReo ;
   private String[] P04VT2_A130BarCodPar ;
   private String[] P04VT2_A6039RecAcab ;
   private boolean[] P04VT2_n6039RecAcab ;
   private short[] P04VT2_A2804RecLinMaq ;
}

final  class pdelac00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VT2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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

