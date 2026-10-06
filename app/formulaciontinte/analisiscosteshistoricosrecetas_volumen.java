package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_volumen extends GXProcedure
{
   public analisiscosteshistoricosrecetas_volumen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscosteshistoricosrecetas_volumen.class ), "" );
   }

   public analisiscosteshistoricosrecetas_volumen( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          byte[] aP4 )
   {
      analisiscosteshistoricosrecetas_volumen.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             int[] aP5 )
   {
      analisiscosteshistoricosrecetas_volumen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      analisiscosteshistoricosrecetas_volumen.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      analisiscosteshistoricosrecetas_volumen.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      analisiscosteshistoricosrecetas_volumen.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      analisiscosteshistoricosrecetas_volumen.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      analisiscosteshistoricosrecetas_volumen.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HreVolPrd = 0 ;
      /* Using cursor P09FR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4547HreVolPrd = P09FR2_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09FR2_n4547HreVolPrd[0] ;
         A4545HreLinMaq = P09FR2_A4545HreLinMaq[0] ;
         AV8HreVolPrd = A4547HreVolPrd ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = analisiscosteshistoricosrecetas_volumen.this.A396EmprCod;
      this.aP1[0] = analisiscosteshistoricosrecetas_volumen.this.A4492HreBarCod;
      this.aP2[0] = analisiscosteshistoricosrecetas_volumen.this.A4493HreBarReo;
      this.aP3[0] = analisiscosteshistoricosrecetas_volumen.this.A4494HreBarPar;
      this.aP4[0] = analisiscosteshistoricosrecetas_volumen.this.A4495HreNumCie;
      this.aP5[0] = analisiscosteshistoricosrecetas_volumen.this.AV8HreVolPrd;
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
      P09FR2_A396EmprCod = new String[] {""} ;
      P09FR2_A4492HreBarCod = new int[1] ;
      P09FR2_A4493HreBarReo = new byte[1] ;
      P09FR2_A4494HreBarPar = new String[] {""} ;
      P09FR2_A4495HreNumCie = new byte[1] ;
      P09FR2_A4547HreVolPrd = new int[1] ;
      P09FR2_n4547HreVolPrd = new boolean[] {false} ;
      P09FR2_A4545HreLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.analisiscosteshistoricosrecetas_volumen__default(),
         new Object[] {
             new Object[] {
            P09FR2_A396EmprCod, P09FR2_A4492HreBarCod, P09FR2_A4493HreBarReo, P09FR2_A4494HreBarPar, P09FR2_A4495HreNumCie, P09FR2_A4547HreVolPrd, P09FR2_n4547HreVolPrd, P09FR2_A4545HreLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private int AV8HreVolPrd ;
   private int A4547HreVolPrd ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String scmdbuf ;
   private boolean n4547HreVolPrd ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FR2_A396EmprCod ;
   private int[] P09FR2_A4492HreBarCod ;
   private byte[] P09FR2_A4493HreBarReo ;
   private String[] P09FR2_A4494HreBarPar ;
   private byte[] P09FR2_A4495HreNumCie ;
   private int[] P09FR2_A4547HreVolPrd ;
   private boolean[] P09FR2_n4547HreVolPrd ;
   private short[] P09FR2_A4545HreLinMaq ;
}

final  class analisiscosteshistoricosrecetas_volumen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FR2", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreVolPrd, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

