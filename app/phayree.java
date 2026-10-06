package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayree extends GXProcedure
{
   public phayree( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayree.class ), "" );
   }

   public phayree( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      phayree.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      phayree.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayree.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phayree.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phayree.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phayree.this.AV8FlagRec = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagRec = (byte)(0) ;
      /* Using cursor P02912 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2127RecMolNom = P02912_A2127RecMolNom[0] ;
         n2127RecMolNom = P02912_n2127RecMolNom[0] ;
         A2124RecMolCod = P02912_A2124RecMolCod[0] ;
         A1032FonCod = P02912_A1032FonCod[0] ;
         A1056DisComCod = P02912_A1056DisComCod[0] ;
         A2524DisComLin = P02912_A2524DisComLin[0] ;
         AV8FlagRec = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayree.this.A396EmprCod;
      this.aP1[0] = phayree.this.A129BarCod;
      this.aP2[0] = phayree.this.A132BarCodReo;
      this.aP3[0] = phayree.this.A130BarCodPar;
      this.aP4[0] = phayree.this.AV8FlagRec;
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
      P02912_A396EmprCod = new String[] {""} ;
      P02912_A129BarCod = new int[1] ;
      P02912_A132BarCodReo = new byte[1] ;
      P02912_A130BarCodPar = new String[] {""} ;
      P02912_A2127RecMolNom = new String[] {""} ;
      P02912_n2127RecMolNom = new boolean[] {false} ;
      P02912_A2124RecMolCod = new byte[1] ;
      P02912_A1032FonCod = new String[] {""} ;
      P02912_A1056DisComCod = new String[] {""} ;
      P02912_A2524DisComLin = new byte[1] ;
      A2127RecMolNom = "" ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayree__default(),
         new Object[] {
             new Object[] {
            P02912_A396EmprCod, P02912_A129BarCod, P02912_A132BarCodReo, P02912_A130BarCodPar, P02912_A2127RecMolNom, P02912_n2127RecMolNom, P02912_A2124RecMolCod, P02912_A1032FonCod, P02912_A1056DisComCod, P02912_A2524DisComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8FlagRec ;
   private byte A2124RecMolCod ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2127RecMolNom ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private boolean n2127RecMolNom ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02912_A396EmprCod ;
   private int[] P02912_A129BarCod ;
   private byte[] P02912_A132BarCodReo ;
   private String[] P02912_A130BarCodPar ;
   private String[] P02912_A2127RecMolNom ;
   private boolean[] P02912_n2127RecMolNom ;
   private byte[] P02912_A2124RecMolCod ;
   private String[] P02912_A1032FonCod ;
   private String[] P02912_A1056DisComCod ;
   private byte[] P02912_A2524DisComLin ;
}

final  class phayree__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02912", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecMolNom, RecMolCod, FonCod, DisComCod, DisComLin FROM TXPRECMOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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

