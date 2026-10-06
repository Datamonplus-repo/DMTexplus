package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc186 extends GXProcedure
{
   public pprc186( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc186.class ), "" );
   }

   public pprc186( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc186.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc186.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc186.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pprc186.this.A13082DisDGDibCl = aP2[0];
      this.aP2 = aP2;
      pprc186.this.A13083DisDGDibIn = aP3[0];
      this.aP3 = aP3;
      pprc186.this.A13084DisDGComb = aP4[0];
      this.aP4 = aP4;
      pprc186.this.A13085DisDGFondo = aP5[0];
      this.aP5 = aP5;
      pprc186.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P05QR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13082DisDGDibCl, Integer.valueOf(A13083DisDGDibIn), A13084DisDGComb, A13085DisDGFondo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13081DisDGLin = P05QR2_A13081DisDGLin[0] ;
         Gx_msg = httpContext.getMessage( "ATencion ya existe el Dibujo-Combinacion-Fondo", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc186.this.A396EmprCod;
      this.aP1[0] = pprc186.this.A361DisCod;
      this.aP2[0] = pprc186.this.A13082DisDGDibCl;
      this.aP3[0] = pprc186.this.A13083DisDGDibIn;
      this.aP4[0] = pprc186.this.A13084DisDGComb;
      this.aP5[0] = pprc186.this.A13085DisDGFondo;
      this.aP6[0] = pprc186.this.Gx_msg;
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
      P05QR2_A396EmprCod = new String[] {""} ;
      P05QR2_A361DisCod = new int[1] ;
      P05QR2_A13082DisDGDibCl = new String[] {""} ;
      P05QR2_A13083DisDGDibIn = new int[1] ;
      P05QR2_A13084DisDGComb = new String[] {""} ;
      P05QR2_A13085DisDGFondo = new String[] {""} ;
      P05QR2_A13081DisDGLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc186__default(),
         new Object[] {
             new Object[] {
            P05QR2_A396EmprCod, P05QR2_A361DisCod, P05QR2_A13082DisDGDibCl, P05QR2_A13083DisDGDibIn, P05QR2_A13084DisDGComb, P05QR2_A13085DisDGFondo, P05QR2_A13081DisDGLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13081DisDGLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A13083DisDGDibIn ;
   private String A396EmprCod ;
   private String A13082DisDGDibCl ;
   private String A13084DisDGComb ;
   private String A13085DisDGFondo ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05QR2_A396EmprCod ;
   private int[] P05QR2_A361DisCod ;
   private String[] P05QR2_A13082DisDGDibCl ;
   private int[] P05QR2_A13083DisDGDibIn ;
   private String[] P05QR2_A13084DisDGComb ;
   private String[] P05QR2_A13085DisDGFondo ;
   private byte[] P05QR2_A13081DisDGLin ;
}

final  class pprc186__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05QR2", "SELECT EmprCod, DisCod, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo, DisDGLin FROM TXPDIGCOM WHERE EmprCod = ? and DisCod = ? and DisDGDibCl = ? and DisDGDibIn = ? and DisDGComb = ? and DisDGFondo = ? ORDER BY EmprCod, DisCod, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               return;
      }
   }

}

