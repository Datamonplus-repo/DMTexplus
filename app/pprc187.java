package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc187 extends GXProcedure
{
   public pprc187( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc187.class ), "" );
   }

   public pprc187( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pprc187.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pprc187.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc187.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc187.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc187.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc187.this.A13094BarDGDibCl = aP4[0];
      this.aP4 = aP4;
      pprc187.this.A13095BarDGDibIn = aP5[0];
      this.aP5 = aP5;
      pprc187.this.A13096BarDGComb = aP6[0];
      this.aP6 = aP6;
      pprc187.this.A13097BarDGFOndo = aP7[0];
      this.aP7 = aP7;
      pprc187.this.Gx_msg = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P05QS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A13094BarDGDibCl, Integer.valueOf(A13095BarDGDibIn), A13096BarDGComb, A13097BarDGFOndo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13093BarDGLin = P05QS2_A13093BarDGLin[0] ;
         Gx_msg = httpContext.getMessage( "ATencion ya existe el Dibujo-Combinacion-Fondo", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc187.this.A396EmprCod;
      this.aP1[0] = pprc187.this.A129BarCod;
      this.aP2[0] = pprc187.this.A132BarCodReo;
      this.aP3[0] = pprc187.this.A130BarCodPar;
      this.aP4[0] = pprc187.this.A13094BarDGDibCl;
      this.aP5[0] = pprc187.this.A13095BarDGDibIn;
      this.aP6[0] = pprc187.this.A13096BarDGComb;
      this.aP7[0] = pprc187.this.A13097BarDGFOndo;
      this.aP8[0] = pprc187.this.Gx_msg;
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
      P05QS2_A396EmprCod = new String[] {""} ;
      P05QS2_A129BarCod = new int[1] ;
      P05QS2_A132BarCodReo = new byte[1] ;
      P05QS2_A130BarCodPar = new String[] {""} ;
      P05QS2_A13094BarDGDibCl = new String[] {""} ;
      P05QS2_A13095BarDGDibIn = new int[1] ;
      P05QS2_A13096BarDGComb = new String[] {""} ;
      P05QS2_A13097BarDGFOndo = new String[] {""} ;
      P05QS2_A13093BarDGLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc187__default(),
         new Object[] {
             new Object[] {
            P05QS2_A396EmprCod, P05QS2_A129BarCod, P05QS2_A132BarCodReo, P05QS2_A130BarCodPar, P05QS2_A13094BarDGDibCl, P05QS2_A13095BarDGDibIn, P05QS2_A13096BarDGComb, P05QS2_A13097BarDGFOndo, P05QS2_A13093BarDGLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A13093BarDGLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A13095BarDGDibIn ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A13094BarDGDibCl ;
   private String A13096BarDGComb ;
   private String A13097BarDGFOndo ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05QS2_A396EmprCod ;
   private int[] P05QS2_A129BarCod ;
   private byte[] P05QS2_A132BarCodReo ;
   private String[] P05QS2_A130BarCodPar ;
   private String[] P05QS2_A13094BarDGDibCl ;
   private int[] P05QS2_A13095BarDGDibIn ;
   private String[] P05QS2_A13096BarDGComb ;
   private String[] P05QS2_A13097BarDGFOndo ;
   private byte[] P05QS2_A13093BarDGLin ;
}

final  class pprc187__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05QS2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo, BarDGLin FROM TXPDIGBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarDGDibCl = ? and BarDGDibIn = ? and BarDGComb = ? and BarDGFOndo = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
               stmt.setString(5, (String)parms[4], 16);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
      }
   }

}

